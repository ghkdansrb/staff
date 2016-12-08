<%@page import="dto.Skill"%>
<%@page import="dto.School"%>
<%@page import="dto.Religion"%>
<%@page import="dao.StaffDao"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
School school = new School();
Skill skill = new Skill();
Religion religion = new Religion();
StaffDao dao = new StaffDao();
%>

<h1>STAFF정보등록화면</h1>
<form action="<%=request.getContextPath()%>/insertAction.jsp" method="post">

	<div>이름
		<input name="name" type="text"/>
	</div>

	<div>주민번호
		<input name="jumin" type="text" maxLength="6" />-<input name="jumind" type="password" maxLength="7" />
	</div>

	<div>종교
		<select name="religion">
<%

ArrayList<Religion> religionList = dao.selectReligion(religion);
for(int i=0; i<religionList.size(); i++){
	religion = religionList.get(i);
%>
			<option value="<%=religion.getNo()%>"><%=religion.getName()%></option>
<%
}
%>	
		</select>
	</div>
	
	<div>학력
<%

ArrayList<School> schoolList = dao.selectSchool(school);
for(int i=0; i<schoolList.size(); i++){
	school = schoolList.get(i);
%>

		<input type="radio" name="school" value="<%=school.getNo()%>"/><%=school.getGraduate() %>
	
<%
}
%>

	</div>
	
	<div>기술
<%

ArrayList<Skill> skillList = dao.selectSkill(skill);
for(int i=0; i<skillList.size(); i++){
	skill = skillList.get(i);
%>
	
		<input type="checkbox" name="checkbox" value="<%=skill.getNo()%>"/><%=skill.getName() %>

<%
}
%>
	</div>
	<div>졸업일
		<input name="date" type="date"/>
	</div>
	
	<div>
		<input name="submit" type="submit" value="등록">
		<input type="reset">
	</div>
</form>

</body>
</html>