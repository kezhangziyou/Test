package test;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Object> result = new HashMap<String, Object>(4);
        System.out.println(result.size());

        System.out.println(System.currentTimeMillis());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));
        System.out.println(Calendar.getInstance().getTimeInMillis());


        System.out.println("Hello World!");
        SanDongExamModeInfo ModeInfo1 = new
                SanDongExamModeInfo("A", 0.03f, 0.00f, 0.03f, 91.00f, 100.00f);
        SanDongExamModeInfo ModeInfo2 = new
                SanDongExamModeInfo("B+", 0.07f, 0.04f, 0.10f, 81.00f, 90.00f);
        SanDongExamModeInfo ModeInfo3 = new
                SanDongExamModeInfo("B", 0.16f, 0.04f, 0.10f, 81.00f, 90.00f);
        ScoreInfo scoreInfo1 = new ScoreInfo("1", 0.02f);
        Long f1 = new Long(2);
        Long f2 = new Long(3);
        Long f3 = null;
        f3=f1/f2;
        System.out.println(f3);

//        System.out.println(f1.floatValue() < f2.floatValue());
//        System.out.println(f1);
//        System.out.println(f1.floatValue());
//        System.out.println(f1.floatValue() / f2.floatValue());
        //用接口指向接口的实现形式类，方面后期更换接口的实现形式类
        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator it=list.iterator();
        while(it.hasNext()){
            String x = (String) it.next();
            if(x.equals("a")){
                it.remove();
            }
        }
//        for (String str : list) {
//            if ("a".equals(str)) {
//                list.remove(str);
//            }
//        }
      System.out.println(list);

    }
}
