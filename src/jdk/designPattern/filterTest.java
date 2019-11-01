package jdk.designPattern;

import jdk.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangke
 * @version 1.0
 * @className filterTest
 * @description 定义过滤方法，将过滤接口当做参数传入，这样这个过滤方法就不用修改，在实际调用的时候将具体的实现类传入即可。
 * @date 2019/5/16 4:18 PM
 **/
public class filterTest {
    public List<Product> filterProductByPredicate(List<Product> list, MyPredicate<Product> mp){
        List<Product> prods = new ArrayList<>();
        for (Product prod : list){
            if (mp.test(prod)){
                prods.add(prod);
            }
        }
        return prods;
    }



}