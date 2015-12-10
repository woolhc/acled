package cn.hc.service;

import java.util.List;

import cn.hc.Servlet.pieSearchServlet;
import cn.hc.domain.Percentage;

/**
 * [{
            type: 'pie',
            name: 'Browser share',
            data: [
                ['Firefox',   45.0],
                ['IE',       26.8],
                {
                    name: 'Chrome',
                    y: 12.8,
                    sliced: true,
                    selected: true
                },
                ['Safari',    8.5],
                ['Opera',     6.2],
                ['Others',   0.7]
            ]
        }]
 * @author Administrator
 *
 */
public class CreatePiepicture {
	private String type;
	private String name;
	private List<Percentage> data;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Percentage> getData() {
		return data;
	}
	public void setData(List<Percentage> data) {
		this.data = data;
	}
	public CreatePiepicture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreatePiepicture(String type, String name,
			List<Percentage> list) {
		super();
		this.type = type;
		this.name = name;
		this.data = list;
	}
	
}
