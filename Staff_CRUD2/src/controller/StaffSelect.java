package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.*;
import dto.*;

@WebServlet("/StaffSelect")
public class StaffSelect extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/staffSelect.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String name = request.getParameter("name");
			System.out.println(name);
		String[] gender = request.getParameterValues("gender");
			for(int j=0; j<gender.length; j++){
				System.out.println("genderNo : "+gender[j]);
			}
		int schoolNo = Integer.parseInt(request.getParameter("school"));
			System.out.println("schoolNo : "+schoolNo);
		int religionNo = Integer.parseInt(request.getParameter("religion"));
			System.out.println("religionNo : "+religionNo);
		String graduateday = request.getParameter("date");
			System.out.println(graduateday);
		String graduateday2 = request.getParameter("date2");
			System.out.println(graduateday2);
		String[] gd = request.getParameterValues("date"+"~"+"date2");
			System.out.println(gd);
		String[] skillstr = request.getParameterValues("skill");
		for(int i=0; i<skillstr.length; i++){
			System.out.println("skillNo : "+skillstr[i]);
		}
		StaffDao dao = new StaffDao();
		
	}

}
