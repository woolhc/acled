package cn.hc.dao;

import java.util.List;

import cn.hc.domain.Point;

public interface AcledDao {
	public List<Point> findAllByCountryName(String countryname);
	public Point findAll();
	public Point findByname(String name);
	public Point findByTime(String time);
	public Point findByYear(Integer year);
	public List<Point> findByMonth(String month);
	public List<Point> findBymonthAndCountry(String month,String country);
}
