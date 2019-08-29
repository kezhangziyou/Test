package foreach;

import java.security.PrivateKey;
import java.util.*;

import static com.sun.tools.corba.se.idl.InterfaceState.Private;

/**
 * @author zhangke
 * @version 1.0
 * @className mysqlConnectionTest
 * @description TODO 增强for循环需要集合类实现迭代器或者数组
 * @date 2019/2/25 上午10:49
 **/
public class test {
    public static  void main(String [] args){

        List<Integer> list1 =new ArrayList<>();
        int []ints={1,2,3,4,5};
        for (int i:ints){
            System.out.println(i);

        }
        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(3);
        List list2 =new ArrayList<String>();
        list2.add("ddd");
        list2.add("ddsafd");
        list2.add("ddadd");
        list2.add("dddfs");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + ",");
        }
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");

        }
        for (Integer j : list1) {
            System.out.print(j + ",");
        }
    }

}