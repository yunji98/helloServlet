package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet") /*이 url과 mapping시켜주고 있다 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/* post로 왔기 때문에 doPost구현하면 됨 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		//나중에 process : access to database, perform business logic
		
		//Build HTML code
		PrintWriter out = response.getWriter();
		
		String htmlResponse = "<html>";
		htmlResponse += "<h2>Your username is "+ username +"</h2></br>";
		htmlResponse += "<h2>Your password is "+ password +"</h2></br>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
		//해당되는 웹페이지가 클라이언트에 전달됨
		//동적인 웹페이지 사용자가 입력한 username과 password에 따라서 다른 웹페이지가 만들어지기때문!

	}

}
