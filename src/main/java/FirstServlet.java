import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "first", urlPatterns = "/products")
public class FirstServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("<table border=\"1\">\n<caption>Fruits Table</caption>\n<tr>\n<th>id</th>\n<th>Name</th>\n<th>price</th></tr>\n");
        List<Product> products = ProductRange.getRange();
        for (Product product : products) {
            String line = String.format("<tr><td>%d</td><td>%s</td><td>%f</td></tr>\n", product.getId(), product.getName(), product.getPrice());
            resp.getWriter().write(line);
        }
        resp.getWriter().write("</table>\n");
    }
}
