package json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhangke
 * @version 1.0
 * @className ComparatorTest
 * @description
 * @date 2019/8/13 10:15 AM
 **/
public class JsonTest {
	private static  String weather ="{\n" +
			"  \"data\": {\n" +
			"    \"city\": \"深圳\",\n" +
			"    \"temphigh\": \"25\",\n" +
			"    \"templow\": \"19\",\n" +
			"    \"updatetime\": \"2017-11-04 13:23:00\",\n" +
			"    \"tempnow\": \"24\",\n" +
			"    \"sendibletemp\": \"27\",\n" +
			"    \"winddirect\": \"东北风\",\n" +
			"    \"windpower\": \"2级\",\n" +
			"    \"humidity\": \"42\",\n" +
			"    \"sunrise\": \"06:29\",\n" +
			"    \"sunset\": \"17:45\",\n" +
			"    \"weather\": \"多云\",\n" +
			"    \"week\": \"星期六\",\n" +
			"    \"nl\": null,\n" +
			"    \"date\": \"2017-11-04\",\n" +
			"    \"index\": [\n" +
			"      {\n" +
			"        \"name\": \"化妆指数\",\n" +
			"        \"level\": \"控油\",\n" +
			"        \"msg\": \"建议用露质面霜打底，水质无油粉底霜，透明粉饼，粉质胭脂。\"\n" +
			"      },\n" +
			"      {\n" +
			"        \"name\": \"感冒指数\",\n" +
			"        \"level\": \"易发\",\n" +
			"        \"msg\": \"感冒容易发生，少去人群密集的场所有利于降低感冒的几率。\"\n" +
			"      },\n" +
			"      {\n" +
			"        \"name\": \"洗车指数\",\n" +
			"        \"level\": \"不宜\",\n" +
			"        \"msg\": \"雨(雪)水和泥水会弄脏您的爱车，不适宜清洗车辆。\"\n" +
			"      },\n" +
			"      {\n" +
			"        \"name\": \"穿衣指数\",\n" +
			"        \"level\": \"舒适\",\n" +
			"        \"msg\": \"白天温度适中，但早晚凉，易穿脱的便携外套很实用。\"\n" +
			"      },\n" +
			"      {\n" +
			"        \"name\": \"紫外线强度指数\",\n" +
			"        \"level\": \"弱\",\n" +
			"        \"msg\": \"辐射较弱，涂擦SPF12-15、PA+护肤品。\"\n" +
			"      },\n" +
			"      {\n" +
			"        \"name\": \"运动指数\",\n" +
			"        \"level\": \"不适宜\",\n" +
			"        \"msg\": \"受到阵雨天气的影响，不宜在户外运动。\"\n" +
			"      }\n" +
			"    ],\n" +
			"    \"pm25\": {\n" +
			"      \"aqi\": 0,\n" +
			"      \"co\": 8,\n" +
			"      \"o3\": 42,\n" +
			"      \"pm10\": 63,\n" +
			"      \"pm2_5\": 64,\n" +
			"      \"quality\": \"良\",\n" +
			"      \"so2\": 4,\n" +
			"      \"no2\": 11,\n" +
			"      \"updatetime\": \"2017-11-04 13:00:00\"\n" +
			"    },\n" +
			"    \"daily\": [\n" +
			"      {\n" +
			"        \"date\": \"2017-11-04\",\n" +
			"        \"week\": \"星期六\",\n" +
			"        \"sunrise\": \"06:29\",\n" +
			"        \"sunset\": \"17:45\",\n" +
			"        \"temphigh\": \"25\",\n" +
			"        \"templow\": \"19\",\n" +
			"        \"weather\": \"多云\"\n" +
			"      },\n" +
			"      {\n" +
			"        \"date\": \"2017-11-05\",\n" +
			"        \"week\": \"星期日\",\n" +
			"        \"sunrise\": \"06:29\",\n" +
			"        \"sunset\": \"17:45\",\n" +
			"        \"temphigh\": \"26\",\n" +
			"        \"templow\": \"19\",\n" +
			"        \"weather\": \"多云\"\n" +
			"      },\n" +
			"      {\n" +
			"        \"date\": \"2017-11-06\",\n" +
			"        \"week\": \"星期一\",\n" +
			"        \"sunrise\": \"06:29\",\n" +
			"        \"sunset\": \"17:45\",\n" +
			"        \"temphigh\": \"27\",\n" +
			"        \"templow\": \"20\",\n" +
			"        \"weather\": \"多云\"\n" +
			"      },\n" +
			"      {\n" +
			"        \"date\": \"2017-11-07\",\n" +
			"        \"week\": \"星期二\",\n" +
			"        \"sunrise\": \"06:29\",\n" +
			"        \"sunset\": \"17:45\",\n" +
			"        \"temphigh\": \"28\",\n" +
			"        \"templow\": \"21\",\n" +
			"        \"weather\": \"多云\"\n" +
			"      },\n" +
			"      {\n" +
			"        \"date\": \"2017-11-08\",\n" +
			"        \"week\": \"星期三\",\n" +
			"        \"sunrise\": \"06:29\",\n" +
			"        \"sunset\": \"17:45\",\n" +
			"        \"temphigh\": \"29\",\n" +
			"        \"templow\": \"22\",\n" +
			"        \"weather\": \"多云\"\n" +
			"      },\n" +
			"      {\n" +
			"        \"date\": \"2017-11-09\",\n" +
			"        \"week\": \"星期四\",\n" +
			"        \"sunrise\": \"06:29\",\n" +
			"        \"sunset\": \"17:45\",\n" +
			"        \"temphigh\": \"28\",\n" +
			"        \"templow\": \"22\",\n" +
			"        \"weather\": \"多云\"\n" +
			"      },\n" +
			"      {\n" +
			"        \"date\": \"2017-11-03\",\n" +
			"        \"week\": \"星期五\",\n" +
			"        \"sunrise\": \"06:29\",\n" +
			"        \"sunset\": \"17:45\",\n" +
			"        \"temphigh\": \"28\",\n" +
			"        \"templow\": \"18\",\n" +
			"        \"weather\": \"晴\"\n" +
			"      }\n" +
			"    ]\n" +
			"  },\n" +
			"  \"status\": 0,\n" +
			"  \"msg\": \"ok\"\n" +
			"}";
	public static  void main(String [] args){
		JSONObject jsonObject = JSON.parseObject(weather);
		JSONObject jsonData = jsonObject.getJSONObject("data");
		//解析天气
		String jsonTemplow = jsonData.getString("templow");
		String jsonTempHigh = jsonData.getString("temphigh");
		String jsonWeather = jsonData.getString("weather");
		String jsonTempnow = jsonData.getString("tempnow");
		String jsonWinddirect = jsonData.getString("winddirect");
		String jsonWindpower = jsonData.getString("windpower");
		String jsonHumidity = jsonData.getString("humidity");
		System.out.println(jsonTemplow);

		//利用JSONArray进行复杂解析
		JSONArray jsonIndex =jsonData.getJSONArray("index");
		/**
		 * 我们通过两个嵌套循环进行遍历。首先，外层根据数组长度进行for循环遍历；然后内层使用迭代器进行遍历。
		 */
		//String[] Index = new String[20];//数组长度声明为20确保够用
		//int j=1;
		//for (int i=0;i<jsonIndex.size();i++){
		//	JSONObject partIndex = jsonIndex.getJSONObject(i);
		//	Iterator iterator = partIndex.getString(i);
		//	String key;
		//	while(iterator.hasNext()){
		//		//hasNext方法，只是判断下一个元素的有无，并不移动指针
		//		key = (String) iterator.next();//next方法，向下移动指针，并且返回指针指向的元素，如果指针指向的内存中没有元素，会报异常
		//		Index[j] = partIndex.getString(key);
		//		j++;
		//	}
		//}

		JSONArray jsonDaily =jsonData.getJSONArray("daily");
		List<String> dates = new ArrayList<>();
		List<String> weeks = new ArrayList<>();
		List<String> weathers = new ArrayList<>();

		int j=1;
		for (int i=0;i<jsonDaily.size();i++){
			JSONObject partDaily = jsonDaily.getJSONObject(i);
			String date = partDaily.getString("date");
			dates.add(date);
			String week = partDaily.getString("week");
			weeks.add(week);
			String weather = partDaily.getString("weather");
			weathers.add(weather);
		}
		dates.forEach((p)->System.out.println(p));


	}
}