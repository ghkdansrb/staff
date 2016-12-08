package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import dto.Religion;
import dto.School;
import dto.Skill;
import dto.Staff;
import dao.DBUtill;

public class StaffDao {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	int rowCount = 0;
	
	public void staffInsert(Staff staff,Skill[] skill){
		String sql = "INSERT INTO staff(No, NAME, SN, GRADUATEDAY, SCHOOLNO, RELIGIONNO) VALUES (STAFF_SEQ.nextval,?,?,?,?,?)";
		try{
			conn = DBUtill.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,staff.getName());
			stmt.setString(2,staff.getSn());
			stmt.setString(3,staff.getGraduateday());
			stmt.setInt(4, staff.getSchool().getNo());
			stmt.setInt(5,staff.getReligion().getNo());
			
			stmt.executeUpdate();
			
/*			for(i=0; i<skill[].length; i++){
				String staffsql = "INSERT INTO STAFFSKILL(NO, STAFF, SKILL) VALUES (STAFFSKILL_SEQ.NEXTVLA,(SELECT no FROM STAFF WHERE SN),?)";
				Stmt.setString(1,);
				Stmt.setString(2,);
				Stmt.setString(3,);
				
				stmt.executeUpdate();
			}*/
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			try{rs.close();}catch(Exception e){}
			try{stmt.close();}catch(Exception e){}
			try{conn.close();}catch(Exception e){}
		}

				
	}
	
	public ArrayList<Religion> selectReligion(Religion re){

		String sql = "select no, name From religion";
		ArrayList<Religion> religionList = new ArrayList<Religion>();
		try {
			conn = DBUtill.getConnection();
			stmt = conn.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				re = new Religion();
				re.setNo(rs.getInt("no"));
				re.setName(rs.getString("name"));
				
				religionList.add(re);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			try{rs.close();}catch(Exception e){}
			try{stmt.close();}catch(Exception e){}
			try{conn.close();}catch(Exception e){}
		}
		
		return religionList;
	}
	
	public ArrayList<School> selectSchool(School sc){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select no, graduate From School";
		ArrayList<School> schoolList = new ArrayList<School>();
		try {
			conn = DBUtill.getConnection();
			stmt = conn.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				sc = new School();
				sc.setNo(rs.getInt("no"));
				sc.setGraduate(rs.getString("graduate"));
				
				schoolList.add(sc);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			try{rs.close();}catch(Exception e){}
			try{stmt.close();}catch(Exception e){}
			try{conn.close();}catch(Exception e){}
		}
		
		return schoolList;
	}
	
	public ArrayList<Skill> selectSkill(Skill sk){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select no, name From Skill";
		ArrayList<Skill> skillList = new ArrayList<Skill>();
		try {
			
			conn = DBUtill.getConnection();
			stmt = conn.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				sk = new Skill();
				sk.setNo(rs.getInt("no"));
				sk.setName(rs.getString("name"));
				
				skillList.add(sk);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			try{rs.close();}catch(Exception e){}
			try{stmt.close();}catch(Exception e){}
			try{conn.close();}catch(Exception e){}
		}
		
		return skillList;
	}
		
	}	
	
	
	

