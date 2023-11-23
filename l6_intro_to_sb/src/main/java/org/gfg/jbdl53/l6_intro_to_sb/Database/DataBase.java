package org.gfg.jbdl53.l6_intro_to_sb.Database;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;




/**
 * Servlet implementation class signupnow
 */
public class DataBase {
	public static void main(String[] args)  throws IOException {
//	PrintWriter pw=response.getWriter();
//		
//		String p,q;
//		p=request.getParameter("email");
//		q=request.getParameter("psw");
//		pw.println(p);
//		pw.println(q);
//		p=request.getParameter("mail");
		String ps;
		Connection connection = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/Jbdl53",
				"root", "123456");

			

			Statement st= connection.createStatement();
//			String ps="insert into user values('"+p+"','"+q+"');";
			//pw.println(ps);
			ps="Create table Employee(name varchar(10))";
			
			try {
				st.executeUpdate(ps);
				
//				response.sendRedirect("messege_register.html");
			    }
			catch(Exception e)
			{
//				pw.println("already exists in catch");
			}
			
			
			st.close();
			connection.close();
		}
		catch (Exception exception) {
			System.out.println(exception);
			
						
		}
	
	}

}

