package jdk.design.pattern.predicate;

import jdk.design.pattern.model.Product;

/**
 * @author zhangke
 * @version 1.0
 * @className ColorPredicate
 * @description 如果想要筛选颜色为红色的商品，定义一个颜色过滤类
 * @date 2019/5/16 4:17 PM
 **/
public class ColorPredicate implements MyPredicate<Product> {

    private static final String RED = "红色";

    @Override
    public boolean test(Product product) {
        return RED.equals(product.getColor());
    }
}
