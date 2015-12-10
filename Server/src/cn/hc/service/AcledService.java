package cn.hc.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.junit.Test;

import cn.hc.dao.AcledDao;
import cn.hc.daoImpl.AcledDaoImpl;
import cn.hc.domain.Percentage;
import cn.hc.domain.Point;
//数据处理的业务逻辑层
/**
 * 
 * @author Administrator
 *
 */
public class AcledService {
	private AcledDao acledDao=new AcledDaoImpl();
	
	/**
	 * 该方法的功能为将获取到的某国家的冲突数据按照分类转换为百分比输出
	 * @param countryname 国家名称
	 * @return 返回查询到的某个国家的各种冲突类型所占的百分比
	 */
	public List<Percentage> getPercentagesByCountryName(String countryname){
	    List<Percentage> percentages=new ArrayList<Percentage>();
	 	List<Point> points= acledDao.findAllByCountryName(countryname);
	 	Map<String,Integer> map=new HashMap<String, Integer>();
	 	int count=points.size();
	 	for(Point point: points){
	 		String eventType=point.getEventType();
	 		if(!map.containsKey(eventType)){
	 			map.put(eventType, 1);
	 		}else{
	 			map.put(eventType, map.get(eventType)+1);
	 		}
	 	}
	 	int i=0;
	 	 DecimalFormat df = new DecimalFormat( "0.00");
	 	for(String type:map.keySet()){
	 	  int counts=map.get(type);
	 	 // System.out.println(counts);
	 	  double per=(double)counts/(double)count;
	 	  per=per*100;
	 	  per=Double.parseDouble(df.format(per));
	 	 // System.out.println(per);
	 	  percentages.add(new Percentage(type, per));
	 	}
		return percentages;
	}
	public Map<String, Integer>  getMonthmonCountBycountryName(String countryname){
		Map<String, Integer> map=new TreeMap<String, Integer>();
		for(int i=1;i<8;i++){
			String s=i+"";
		  int count=	acledDao.findBymonthAndCountry(s, countryname).size();
		  map.put("m"+s, count);
		}
		return map;
		
	}
	//测试方法
	@Test
	public void Test(){
		//getPercentagesByCountryName("India");
		//System.out.println(new JSONArray().fromObject(getPercentagesByCountryName("India")));
		List<Percentage> percentages=getPercentagesByCountryName("India");
		//System.out.println(getPercentagesByCountryName("India"));
		System.out.println(getMonthmonCountBycountryName("India"));
		System.out.println(new JSONArray().fromObject(getMonthmonCountBycountryName("India")));
		
	}
}
