package jdk.Lambda;

import jdk.Product;
import jdk.designPattern.MyPredicate;

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

    /**
     * 如果想要筛选价格小于8000的商品，那么新建一个价格过滤类既可
     * @param list
     * @param mp
     * @return
     */
    public List<Product> filterProductByPrice(List<Product> list,MyPredicate<Product> mp){
        List<Product> prods = new ArrayList<>();
        for (Product prod : list){
            if (mp.test(prod)){
                prods.add(prod);
            }
        }
        return prods;
    }

}