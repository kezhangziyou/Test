package effectivejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zhangke
 * @version 1.0
 * @className mysqlConnectionTest
 * @description TODO
 * @date 2019/3/9 下午5:14
 **/
public class test {

    public static  void main(String [] args){
        List <String>list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(""+i);
        }
        //不带参数，数据类型从object转需要的，也会报错
        //String [] strings1= (String[]) list.toArray();
        String [] strings1=new String[list.size()];
        list.toArray(strings1);
        for(String str:strings1){
            System.out.println(str);
        }
        List <stu>list2=new ArrayList<>();
        stu [] stus=new stu[list.size()];
        list2.toArray(stus);

    }
}