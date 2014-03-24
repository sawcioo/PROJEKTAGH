import javax.servlet.http.HttpServlet;


public class TestServlet extends HttpServlet {
	 public void doPost(HttpServletRequest  request, 
             HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out;
String tekst;

response.setContentType("text/html");
out = response.getWriter();
out.println("<HTML><HEAD><TITLE>Wyniki z formularza");
out.println("</TITLE></HEAD><BODY>");
tekst = request.getParameter("tekst");
if (tekst != null)
  out.println("Z formularza otrzymałem: " + tekst);
else
  out.println("Brak danych z formularza");        
out.println("</BODY></HTML>");
out.close();
}

public void doGet(HttpServletRequest  request, 
            HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out;

response.setContentType("text/html");
out = response.getWriter();
out.println("<HTML><HEAD><TITLE>Uwaga</TITLE>");
out.println("</HEAD><BODY>");
out.println("Ten serwlet nie obsługuje metody GET!");        
out.println("</BODY></HTML>");
out.close();
}
}
