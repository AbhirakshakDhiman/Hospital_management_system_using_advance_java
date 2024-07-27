package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Specialist;
//import com.entity.User;

public class SpecialistDao {
	private Connection con;

	public SpecialistDao(Connection con) {
		super();
		this.con = con;
	}

	public boolean addSpecialist(String spec) {
		boolean f=false;
		try {
			String q="insert into specialist(spec_name) values(?)";
			
			PreparedStatement ps=con.prepareStatement(q);
			
			ps.setString(1,spec);
		
			
			int i=ps.executeUpdate();
			
			if(i==1) {
				f=true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}


	public List<Specialist> getAllSpecialist(){
		List<Specialist> list=new ArrayList<Specialist>();
		Specialist s=null;
		
		try{String sql="select * from specialist";
		PreparedStatement ps=con.prepareStatement(sql);
		
		
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			s=new Specialist();
			s.setId(rs.getInt(1));
			s.setSpecialistName(rs.getString(2));
			list.add(s);
			//u.setPassword(rs.getString(3));
		}
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}
		return list;
	}
}