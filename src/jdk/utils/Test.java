package jdk.utils;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhangke
 * @version 1.0
 * @className ComparatorTest
 * @description 把字符串按逗号切割，转换为 List
 *
 * @date 2019/8/20 4:43 PM
 **/
public class Test {
	public static  void main(String [] args){

		//-------------------------把字符串按逗号切割，转换为List--------------------------------
		List<String> list = Lists.newArrayList("a","b","c"," ");
		//java8特性
		String ids= "1,2,3,4,5,6";
		List<Long> idsList1= Arrays.asList(ids.split(",")).stream().map(s -> Long.parseLong(s.trim())).collect(Collectors.toList());
		idsList1.forEach(s->System.out.println(s));

		List<String> cities = Arrays.asList("Milan","London","New York","San Francisco");
		String citiesCommaSeparated1 = String.join(",", cities);
		System.out.println(citiesCommaSeparated1);

		//--------------------------------------------------------------------
		String citiesCommaSeparated2 = String.join(",", cities);
		System.out.println(citiesCommaSeparated1);

		//将以逗号分割的字符串转换成List<Long>类型
		String[] strArray = {"aaa","bbb","ccc"};
		String  str1= StringUtils.join(strArray,",");
		System.out.println(str1);

		String str = "aaa,bbb,ccc";
		String[] strArray1 = str.split(",");
		for(String s : strArray1){
			System.out.println(s);
		}


		//去掉 List 空字符串
		List<String> dbsList = Arrays.asList("1","2","3","");
		dbsList.forEach(s->System.out.println(s));
		List<String> filtered = dbsList.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		filtered.forEach(s->System.out.println(s));
	}
}