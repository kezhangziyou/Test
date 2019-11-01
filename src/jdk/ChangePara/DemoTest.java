package jdk.ChangePara;

/**
 * @author zhangke
 * @version 1.0
 * @className DemoTest
 * @description TODO jdk中的可变参数的介绍
 * @date 2019/6/26 10:00 PM
 **/
public class DemoTest {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(1, 2, 3));
        System.out.println(add(new int[]{1, 2, 3, 4}));
    }

    /**
     * 可变参数的方法，...表示可变参数
	 * 注意点:可变参数必须放在最后一个，一个方法只能有一个可变参数
     * @param data
     * @return
     */
    public static int add(int... data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }
}