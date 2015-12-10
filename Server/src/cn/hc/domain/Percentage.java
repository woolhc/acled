package cn.hc.domain;

public class Percentage {
	@Override
	public String toString() {
		return "['"+actionType+"',"+per+"]";
	}
	private String actionType;
	private double per;
	public Percentage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Percentage(String actionType, double per2) {
		super();
		this.actionType = actionType;
		this.per = per2;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}

}
