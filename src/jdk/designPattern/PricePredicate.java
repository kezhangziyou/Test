package jdk.designPattern;

import jdk.Product;

/**
 * @author zhangke
 * @version 1.0
 * @className PricePredicate
 * @description 价格过滤类
 * @date 2019/5/16 4:18 PM
 **/
public class PricePredicate implements MyPredicate<Product> {
//如果想要筛选价格小于8000的商品，那么新建一个价格过滤类既可
    @Override
    public boolean test(Product product) {
        return product.getPrice() < 8000;
    }
}