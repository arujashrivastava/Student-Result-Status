package com.book;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class movieBook
 */
public class movieBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       float e1, e2,e3,e4,e5,e6,p;
       String name;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public movieBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		name = request.getParameter("cname");
		e1 = Float.parseFloat(request.getParameter("m1"));
		e2 = Float.parseFloat(request.getParameter("m2"));
		e3 = Float.parseFloat(request.getParameter("m3"));
		e4 = Float.parseFloat(request.getParameter("m4"));
		e5 = Float.parseFloat(request.getParameter("m5"));
		p = ((e1+e2+e3+e4+e5)/5);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
        
		out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Result</title>");
        out.println("<style>");
        out.println("table, th, td { border: 1px solid black; border-collapse: collapse; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        
        out.println( "<h2>HELLO " + name.toUpperCase() + "</h2>");
		
		out.println("<table border =" + "1>");
		out.println("<tr>");
		out.println("<th>Subjects</th>");
		out.println("<th>Status</th>");
		out.println("</tr");

		out.println("<tr>");
		out.println("<td>Machine learning</td>");
		out.println("<th>");
		if(e1>=40)
		out.println("<font color =" + "green" + ">" + "pass</font>");
		else if(e1<40)
		out.println("<font color =" + "red" + ">" + "fail</font>");
		out.println("</th>");
		out.println("</tr");
		
		out.println("<tr>");
		out.println("<td>Python</td>");
		out.println("<th>");
		if(e2>=40)
		out.println("<font color =" + "green" + ">" + "pass</font>");
		else if(e2<40)
		out.println("<font color =" + "red" + ">" + "fail</font>");
		out.println("</th>");
		out.println("</tr");
		
		out.println("<tr>");
		out.println("<td>Data Science</td>");
		out.println("<th>");
		if(e3>=40)
		out.println("<font color =" + "green" + ">" + "pass</font>");
		else if(e3<40)
		out.println("<font color =" + "red" + ">" + "fail</font>");
		out.println("</th>");
		out.println("</tr");
		
		
		out.println("<tr>");
		out.println("<td>Java Advance</td>");
		out.println("<th>");
		if(e4>=40)
		out.println("<font color =" + "green" + ">" + "pass</font>");
		else if(e4<40)
		out.println("<font color =" + "red" + ">" + "fail</font>");
		out.println("<th>");
		out.println("</tr");
		
		out.println("<tr>");
		out.println("<td>Operating System</td>");
		out.println("<th>");
		if(e5>=40)
		out.println("<font color =" + "green" + ">" + "pass</font>");
		else if(e5<40)
		out.println("<font color =" + "red" + ">" + "fail</font>");
		out.println("<th>");
		out.println("</tr");
		
        out.println("<p>Overall Average Marks: " + p + "</p>");
		if (p >= 40)
		{
			out.print("<p>OverAll Status : PASS " +
			"<img src=" + "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSO7EhJdoxe-3w2pJPbc0uKMtoMr6zZA0XMhzk4pyLlNXMR83-lzKI9JU72ceJSwwjmB10&usqp=CAU"+ "width= 18 height= 18>"+"</p>");
		}
		else if(p<40)
		{
			out.print("<p>OverAll Status : FAIL "+
			"<img src=" + "https://cliply.co/wp-content/uploads/2021/03/392103840_SAD_EMOJI_WITH_TEAR_400_ALT.png" + " width =18 height = 18>" +"</p>");
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
				
	}
	
	

}
