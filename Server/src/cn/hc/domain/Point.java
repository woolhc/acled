package cn.hc.domain;

public class Point {
  private double jing;
  private double wei;
  private String information;
  private String color;
  private String eventType;
  
public String getEventType() {
	return eventType;
}
public void setEventType(String eventType) {
	this.eventType = eventType;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getJing() {
	return jing;
}
public void setJing(double jing) {
	this.jing = jing;
}
public double getWei() {
	return wei;
}
public void setWei(double wei) {
	this.wei = wei;
}
public String getInformation() {
	return information;
}
public void setInformation(String information) {
	this.information = information;
}
public Point() {
	super();
	// TODO Auto-generated constructor stub
}
public Point(double jing, double wei, String information) {
	super();
	this.jing = jing;
	this.wei = wei;
	this.information = information;
}
public Point(double jing, double wei, String information, String color) {
	super();
	this.jing = jing;
	this.wei = wei;
	this.information = information;
	this.color = color;
}
public Point(double jing, double wei, String information, String color,
		String eventType) {
	super();
	this.jing = jing;
	this.wei = wei;
	this.information = information;
	this.color = color;
	this.eventType = eventType;
}
@Override
public String toString() {
	return "Point [jing=" + jing + ", wei=" + wei + ", information="
			+ information + ", color=" + color + "]";
}

}
