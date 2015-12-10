package cn.hc.testcode;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import net.sf.json.JSONArray;

import cn.hc.daoImpl.AcledDaoImpl;
import cn.hc.domain.Point;


public class TestDemo {
	@Test
  public void test1(){
	  List<Point> points=new ArrayList<Point>();
	    Point point1=new Point(111.11, 22.22, "测试信息");
	    Point point2=new Point(134.56,33.8,"测试信息");
	    points.add(point2);
	    points.add(point1);
	    AcledDaoImpl acledDaoImpl=new AcledDaoImpl();
	   // System.out.println(new JSONArray().fromObject(points));
	   // System.out.println(acledDaoImpl.findAllp());
	  
	    //acledDaoImpl.findAllp();
	    StringBuilder sb=new StringBuilder();
	    sb.append('{');
	    System.out.println(sb);
	    System.out.println(acledDaoImpl.findBymonthAndCountry("2", "India").size());
  }
}
