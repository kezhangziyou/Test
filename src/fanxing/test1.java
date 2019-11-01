package fanxing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhangke
 * @version 1.0
 * @className ComparatorTest.test1
 * @description TODO
 * @date 2019/2/22 下午11:56
 **/
public class test1 {
    public static  void main(String [] args){
        /**
         * ArrayList可以存放任意类型，例子中添加了一个String类型，
         * 添加了一个Integer类型，再使用时都以String的方式使用，因此程序崩溃了。为了解决类似这样的问题（在编译阶段就可以解决），泛型应运而生。
         */
        //List arrayList = new ArrayList();
        //指定类型，在编译阶段就会报错
        @SuppressWarnings("unchecked")
        List<String> arrayList = new ArrayList<String>();
        Set<String> set= new HashSet<>();
        arrayList.add("aaaa");
        //arrayList.add(100);
        for(int i = 0; i< arrayList.size();i++){
            String item = (String)arrayList.get(i);
            System.out.println("泛型测试，item = " + item);
        }
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();
        //泛型类型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型。
        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();
        if(classStringArrayList.equals(classIntegerArrayList)){
            System.out.println("泛型测试,类型相同");
        }

    }
}