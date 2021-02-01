import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet ", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            double listPrice = Float.parseFloat(request.getParameter("lp"));
            double discountPercent = Float.parseFloat(request.getParameter("dp"));

            double discountAmount = listPrice * discountPercent * 0.01;
            double discountPrice = listPrice - discountAmount;

            PrintWriter writer = response.getWriter();
            writer.println("<html>");
            writer.println("Discount Amount: " + discountAmount + "</br>");
            writer.println("Discount Price: " + discountPrice);
            writer.println("</html>");
    }
}
