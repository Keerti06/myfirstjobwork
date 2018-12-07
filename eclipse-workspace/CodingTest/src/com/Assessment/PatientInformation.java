package com.Assessment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PatientInformation")
public class PatientInformation extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//GET NAME FROM THE TEXTFIELD
		String name=request.getParameter("GetName");
		//SEND REQUEST TO JSP PAGE
		request.setAttribute("PatientName", name);
		request.setAttribute("PatientList", Database.list);
		RequestDispatcher rd=request.getRequestDispatcher("/Result.jsp");  
		rd.forward(request, response);  

	}

}
