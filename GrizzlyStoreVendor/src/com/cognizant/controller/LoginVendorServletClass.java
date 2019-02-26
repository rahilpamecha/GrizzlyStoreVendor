package com.cognizant.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.helper.ConnectionManager;


/**
 * Servlet implementation class LoginVendorServletClass
 */
@WebServlet(name = "LoginVendorServlet", urlPatterns = { "/loginvendor" })
public class LoginVendorServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConnectionManager manager=new ConnectionManager();
	private static int count=0;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginVendorServletClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection connection=manager.openConnection();
		int vendor=Integer.parseInt(request.getParameter("vendor"));
		int password=Integer.parseInt(request.getParameter("password"));
		try {
			PreparedStatement statement=
					connection.prepareStatement("select * from vendor_auth "
							+ "where vendor=? and password=?");
			statement.setInt(1,vendor);
			statement.setInt(2,password);
			ResultSet resultSet=statement.executeQuery();
			boolean loginResult=false;
			while(resultSet.next()){
				loginResult=true;
			}
			if(count<=3){
			if(loginResult){
				request.setAttribute("vendor",vendor);
				request.setAttribute("password",password);
				HttpSession session=request.getSession(true);
				session.setAttribute("vendor",vendor);
				session.setAttribute("password",password );
				RequestDispatcher dispatcher=request.getRequestDispatcher("menu.jsp");
				dispatcher.forward(request,response);
			}else{
				RequestDispatcher dispatcher=request.getRequestDispatcher("loginVendor.jsp");
				request.setAttribute("status","Login failed");
				dispatcher.forward(request,response);
                count++;
				
			}
		}
			else{
				RequestDispatcher dispatcher=request.getRequestDispatcher("loginVendor.jsp");
				request.setAttribute("status","Account Locked");
				dispatcher.forward(request,response);
				
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
