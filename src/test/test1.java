package test;

import java.math.BigDecimal;

/**
 * @author zhangke
 * @version 1.0
 * @className ComparatorTest.test1
 * @description TODO
 * @date 2019/5/14 11:22 AM
 **/
public class test1 {
    public static  void main(String [] args){
        Long f1 = new Long(1);
        Long f2 = new Long(3);
        double f3 = 0;
        f3=f1.longValue()/f2.longValue();
        long percent = (long)(BigDecimal.valueOf(f1).divide(BigDecimal.valueOf(f2), 2, BigDecimal.ROUND_HALF_UP).floatValue()*100);

        System.out.println(percent);

		String a=null;
		String b="hello";
		System.out.println(a);


    }
}