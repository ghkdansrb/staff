<%@page import="dto.*"%>
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
<form action="<%=request.getContextPath()%>/StaffInsert" method="post">
	<table border="1">
		<tr>
			<td>이름</td>
			<td>
				<input name="name" type="text">
			</td>
			
			<td>주민번호</td>
			<td>
				<input name="jumin" type="text" maxLength="6" size="12"/>-<input name="jumind" type="password" maxLength="7" size="12"/>
			</td>
			
			<td>종교</td>
			<td>
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
			</td>
		</tr>
		
		<tr>
			<td>학력</td>
			<td>
<%
ArrayList<School> schoolList = dao.selectSchool(school);
for(int i=0; i<schoolList.size(); i++){
	school = schoolList.get(i);
%>				
				<input type="radio" name="school" value="<%=school.getNo()%>"/><%=school.getGraduate() %>
<%
}
%>			
			</td>
			
			<td>기술</td>
			<td colspan="3">
<%
ArrayList<Skill> skillList = dao.selectSkill(skill);
for(int i=0; i<skillList.size(); i++){
	skill = skillList.get(i);
%>
				<input type="checkbox" name="skill" value="<%=skill.getNo()%>"/><%=skill.getName() %>
<%
}
%>			
			</td>
		</tr>
		
		<tr>
			<td>졸업일</td>
			<td colspan="5">
				<input name="date" type="date"/>
			</td>
		</tr>
		
		<tr>
			<td colspan="6" align="center">
				<input name="submit" type="submit" value="등록">
				<input type="reset">
			</td>
		</tr>
	</table>
</form>

</body>
</html>