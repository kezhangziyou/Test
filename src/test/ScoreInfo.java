package test;

/**
 * @author zhangke
 * @version 1.0
 * @className ComparatorTest.ScoreInfo
 * @description TODO
 * @date 2019/1/2 上午11:38
 **/
public class ScoreInfo implements Comparable<ScoreInfo> {
    public ScoreInfo(String id, Float orderRate) {
        this.id = id;
        this.orderRate = orderRate;
    }

    private String id;
    private Float orderRate;



    @Override
    public int compareTo(ScoreInfo o) {
        return Double.compare(orderRate,o.orderRate);
    }
}