

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GeneratePass
 */
@WebServlet("/GeneratePass")
public class GeneratePass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneratePass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/epass","root","root");  
			String name = request.getParameter("name");
			String address = request.getParameter("add");
			String Mobile = request.getParameter("mob");
			String Source = request.getParameter("scity");
			String Destination = request.getParameter("dcity");
			String Aadhar = request.getParameter("aadhar");
			String v_reg = request.getParameter("v_regis");
			Random rand = new Random(); 
			int passno = rand.nextInt(1000000);
			PreparedStatement pst = con.prepareStatement("INSERT INTO information(Name, Address, MobileNumber, SourceCity, DestinationCity, AadharNumber, VRegistration, PassNo) VALUES(?, ?, ?, ?, ?, ?, ?, ?)"); 
			pst.setNString(1, name);
			pst.setNString(2, address);
			pst.setNString(3, Mobile);
			pst.setNString(4, Source);
			pst.setNString(5, Destination);
			pst.setNString(6, Aadhar);
			pst.setNString(7, v_reg);
			pst.setInt(8, passno);
			pst.executeUpdate();
			PrintWriter writer = response.getWriter();
			writer.println("<style> body { background-image: url('./covid1.jpg'); background-position: center; background-repeat: no-repeat; background-size: cover; } </style><link rel='stylesheet' type='text/css' href='style.css'>");
			writer.println("<div class='header'><h2>E-Pass Generated</h2></div><form>");
			writer.println("<div class='input-group'><label>Name -: "+name+" </label></div>");
			writer.println("<div class='input-group'><label>Source City -: "+Source+" </label></div>");
			writer.println("<div class='input-group'><label>Destination City -: "+Destination+" </label></div>");
			writer.println("<div class='input-group'><label>Vehicle Registration -: "+v_reg+" </label></div>");
			writer.println("<div class='input-group'><label>Issued Pass Number -: "+passno+" </label></div></form>");
			//writer.println("<body><h1 align=center>Your E-Pass has been generated! Details are mentioned below:</h1><h3>Name -: "+name+"<br>Source City -: "+Source+"<br>Destination City -: "+Destination+"<br>Vehicle Registration Number -: "+v_reg+"<br>Issued Pass Number -: "+passno+"</h3></body>");
			writer.close();
		}catch (Exception e) {
			PrintWriter writer = response.getWriter();
			writer.println("Error -: "+e);
		}
	}
}
