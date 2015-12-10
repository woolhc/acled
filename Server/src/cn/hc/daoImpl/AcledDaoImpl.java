package cn.hc.daoImpl;

import java.awt.image.DataBufferUShort;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;






import cn.hc.dao.AcledDao;
import cn.hc.domain.Point;
import cn.hc.utils.JdbcUtils;

public class AcledDaoImpl implements AcledDao {
	private static Connection conn=null;
	static{
		try {
			conn=JdbcUtils.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Point> findAllp(){
		PreparedStatement psmt=null;
		List<Point> points=new ArrayList<Point>();
		//String sql="select LOCATION,LATITUDE,LONGITUDE,EVENT_TYPE from africa_data where EVENT_DATE like '2015/1%' Limit 3000";
		String sql="select LOCATION,LATITUDE,LONGITUDE,EVENT_TYPE from africa_data";
		try {
			psmt=conn.prepareStatement(sql);
			ResultSet rs=psmt.executeQuery();
			while(rs.next()){
				String eventtype=rs.getString("EVENT_TYPE").replace(" ", "");
				//System.out.println(eventtype.trim());
				String color;
				Map<String, Integer> map=new HashMap<String,Integer>();
				String location=rs.getString("LOCATION");
				if (eventtype=="Riots/Protests") {
					color="red";
				}else if(eventtype.equalsIgnoreCase("Battle-Nochangeofterritory")){
					color="green";
				}else if(eventtype.equalsIgnoreCase("Violenceagainstcivilians")){
					color="yellow";
				}else if(eventtype.equalsIgnoreCase("Non-violentactivitybyaconflictactor")){
					color="orange";
				}else if(eventtype.equalsIgnoreCase("Remoteviolence")){
					color="black";
				}else if(eventtype.equalsIgnoreCase("Battle-Governmentregainsterritory")){
					color="pink";
				}else{
					color="red";
				}
	        if(!map.containsKey(location)){
	        	//points.add(new Point(rs.getDouble("LONGITUDE"), rs.getDouble("LATITUDE"), location));
	        	points.add(new Point(rs.getDouble("LONGITUDE"),rs.getDouble("LATITUDE"), location, color));
	        	map.put(location, 1);
	        }else{
	        	map.put(location, map.get(location)+1);
	        }
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				psmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println(points);
		return points;
	}
	
	@Test
	public Point findAll() {
		// TODO Auto-generated method stub
		
		System.out.println(conn);
		return null;
	}
	public Point findByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Point findByTime(String time) {
		// TODO Auto-generated method stub
		return null;
	}

	public Point findByYear(Integer year) {
		// TODO Auto-generated method stub
		return null;
	}
   public Point findByPlace(){
	   
	   return null;
   }

public List<Point> findByMonth(String month) {
	// TODO Auto-generated method stub
	PreparedStatement psmt=null;
	List<Point> points=new ArrayList<Point>();
	String sql="select LOCATION,LATITUDE,LONGITUDE,EVENT_TYPE from africa_data where EVENT_DATE like '2015/"+month+"%'";
	//String sql="select LOCATION,LATITUDE,LONGITUDE,EVENT_TYPE from africa_data";
	try {
		psmt=conn.prepareStatement(sql);
		ResultSet rs=psmt.executeQuery();
		while(rs.next()){
			String eventtype=rs.getString("EVENT_TYPE").replace(" ", "");
			//System.out.println(eventtype.trim());
			String color;
			Map<String, Integer> map=new HashMap<String,Integer>();
			String location=rs.getString("LOCATION");
			if (eventtype=="Riots/Protests") {
				color="red";
			}else if(eventtype.equalsIgnoreCase("Battle-Nochangeofterritory")){
				color="green";
			}else if(eventtype.equalsIgnoreCase("Violenceagainstcivilians")){
				color="yellow";
			}else if(eventtype.equalsIgnoreCase("Non-violentactivitybyaconflictactor")){
				color="orange";
			}else if(eventtype.equalsIgnoreCase("Remoteviolence")){
				color="black";
			}else if(eventtype.equalsIgnoreCase("Battle-Governmentregainsterritory")){
				color="pink";
			}else{
				color="red";
			}
        if(!map.containsKey(location)){
        	//points.add(new Point(rs.getDouble("LONGITUDE"), rs.getDouble("LATITUDE"), location));
        	points.add(new Point(rs.getDouble("LONGITUDE"),rs.getDouble("LATITUDE"), location, color));
        	map.put(location, 1);
        }else{
        	map.put(location, map.get(location)+1);
        }
		
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			psmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//System.out.println(points);
	return points;
}

public List<Point> findAllByCountryName(String countryname) {
	// TODO Auto-generated method stub
	PreparedStatement psmt=null;
	List<Point> points=new ArrayList<Point>();
	//String sql="select LOCATION,LATITUDE,LONGITUDE,EVENT_TYPE from africa_data where EVENT_DATE like '2015/1%' Limit 3000";
	String sql="select LOCATION,LATITUDE,LONGITUDE,EVENT_TYPE from africa_data where COUNTRY='"+countryname+"'";
	try {
		psmt=conn.prepareStatement(sql);
		ResultSet rs=psmt.executeQuery();
		while(rs.next()){
			String type=rs.getString("EVENT_TYPE");
			String eventtype=type.replace(" ", "");
			//System.out.println(eventtype.trim());
			String color;
			Map<String, Integer> map=new HashMap<String,Integer>();
			String location=rs.getString("LOCATION");
			if (eventtype=="Riots/Protests") {
				color="red";
			}else if(eventtype.equalsIgnoreCase("Battle-Nochangeofterritory")){
				color="green";
			}else if(eventtype.equalsIgnoreCase("Violenceagainstcivilians")){
				color="yellow";
			}else if(eventtype.equalsIgnoreCase("Non-violentactivitybyaconflictactor")){
				color="orange";
			}else if(eventtype.equalsIgnoreCase("Remoteviolence")){
				color="black";
			}else if(eventtype.equalsIgnoreCase("Battle-Governmentregainsterritory")){
				color="pink";
			}else{
				color="red";
			}
			points.add(new Point(rs.getDouble("LONGITUDE"),rs.getDouble("LATITUDE"), location, color,type));
		
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			psmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//System.out.println(points);
	return points;
}

public List<Point> findBymonthAndCountry(String month, String country) {
	PreparedStatement psmt=null;
	List<Point> points=new ArrayList<Point>();
	String sql="select LOCATION,LATITUDE,LONGITUDE,EVENT_TYPE from africa_data where EVENT_DATE like '2015/"+month+"%' and COUNTRY='"+country+"'";
	//String sql="select LOCATION,LATITUDE,LONGITUDE,EVENT_TYPE from africa_data";
	try {
		psmt=conn.prepareStatement(sql);
		ResultSet rs=psmt.executeQuery();
		while(rs.next()){
			String eventtype=rs.getString("EVENT_TYPE").replace(" ", "");
			//System.out.println(eventtype.trim());
			String color;
			Map<String, Integer> map=new HashMap<String,Integer>();
			String location=rs.getString("LOCATION");
			if (eventtype=="Riots/Protests") {
				color="red";
			}else if(eventtype.equalsIgnoreCase("Battle-Nochangeofterritory")){
				color="green";
			}else if(eventtype.equalsIgnoreCase("Violenceagainstcivilians")){
				color="yellow";
			}else if(eventtype.equalsIgnoreCase("Non-violentactivitybyaconflictactor")){
				color="orange";
			}else if(eventtype.equalsIgnoreCase("Remoteviolence")){
				color="black";
			}else if(eventtype.equalsIgnoreCase("Battle-Governmentregainsterritory")){
				color="pink";
			}else{
				color="red";
			}
        if(!map.containsKey(location)){
        	//points.add(new Point(rs.getDouble("LONGITUDE"), rs.getDouble("LATITUDE"), location));
        	points.add(new Point(rs.getDouble("LONGITUDE"),rs.getDouble("LATITUDE"), location, color));
        	map.put(location, 1);
        }else{
        	map.put(location, map.get(location)+1);
        }
		
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			psmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//System.out.println(points);
	return points;
}
}
