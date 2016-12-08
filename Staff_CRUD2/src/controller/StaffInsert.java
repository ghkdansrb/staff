package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.*;
import dto.*;



@WebServlet("/StaffInsert")
public class StaffInsert extends HttpServlet {

 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		
 		request.getRequestDispatcher("/WEB-INF/jsp/staffInsert.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String name = request.getParameter("name");
			System.out.println(name);
		String jumin = request.getParameter("jumin");
		String jumind = request.getParameter("jumind");
		String sn = jumin+"-"+jumind;
			System.out.println(sn);
		String graduateday = request.getParameter("date");
			System.out.println(graduateday);
		int schoolNo = Integer.parseInt(request.getParameter("school"));
			System.out.println(schoolNo);
		int religionNo = Integer.parseInt(request.getParameter("religion"));
			System.out.println(religionNo);
		int skillNo = Integer.parseInt(request.getParameter("skill"));
			System.out.println(skillNo);
		
/*		StaffAndSkill staffSkill = new StaffAndSkill();
		staffSkill.setSkill(skill);
		*/
		Skill skill = new Skill();
		skill.setNo(skillNo);
		
		School school = new School();
		school.setNo(schoolNo);
			
		Religion religion = new Religion();
		religion.setNo(religionNo);
		
		Staff staff = new Staff();
		staff.setName(name);
		staff.setSn(sn);
		staff.setGraduateday(graduateday);
		staff.setSchool(school);
		staff.setReligion(religion);

		
		StaffDao dao = new StaffDao();
		dao.staffInsert(staff,null);
		
	}

}
