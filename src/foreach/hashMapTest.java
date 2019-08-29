package foreach;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zhangke
 * @version 1.0
 * @className hashMapTest
 * @description TODO
 * @date 2019/3/1 下午12:56
 **/
public class hashMapTest {
    public static  void main(String [] args){
        Map map=new HashMap();
        map.put("1","zhangke");
        map.put("2","zhangkfasfe");
        map.put("3","zhangfdfke");
        map.put("4","zhssangke");
       Iterator iterator= map.entrySet().iterator();
       while (iterator.hasNext()){
           Map.Entry entry=(Map.Entry)iterator.next();
           // 获取key
           System.out.println(entry.getKey());

           //key = (String)entry.getKey();
           // 获取value
           System.out.println(entry.getValue());

          // integ = (Integer)entry.getValue();


       }

    }
}