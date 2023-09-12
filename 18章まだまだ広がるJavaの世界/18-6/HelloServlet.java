import java.io.*;
import java. util.Date;
import java.servlet.http.*;

@WebServlet("/Helloservlet")
public class  HelloServlet extends HttpServlet{
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
    Date d = new Date();
    PrintWriter w = rea.getWriter();
    res.setContentType("text/html");
    w.write("<html><body>");
    w.write("Tokyo is" + d.toString());
    w.write("</body></html>")
  }
}