package test;

/**
 * @author zhangke
 * @version 1.0
 * @className Test.SanDongExamModeInfo
 * @description TODO
 * @date 2019/1/2 上午10:54
 **/
public class SanDongExamModeInfo {
    // 等级A
    private String rankLevel;

    // 比例 3%
    private Float rankPercent;
    // 排名比例下界0%

    private Float rankPercentMin;
    // 排名比例上界3%
    private Float rankPercentMax;
    // 对应选考分数下界91
    private Float rankScoreMin;
    // 对应选考分数上界100
    private Float rankScoreMax;
    // 区间原始分下界
    private Float originalScoreMin;
    // 对应选考分数上界
    private Float originalScoreMax;

    public SanDongExamModeInfo(String rankLevel, Float rankPercent, Float rankPercentMin, Float rankPercentMax, Float rankScoreMin, Float rankScoreMax) {
        this.rankLevel = rankLevel;
        this.rankPercent = rankPercent;
        this.rankPercentMin = rankPercentMin;
        this.rankPercentMax = rankPercentMax;
        this.rankScoreMin = rankScoreMin;
        this.rankScoreMax = rankScoreMax;
    }



    public String getRankLevel() {
        return rankLevel;
    }

    public void setRankLevel(String rankLevel) {
        this.rankLevel = rankLevel;
    }

    public Float getRankPercent() {
        return rankPercent;
    }

    public void setRankPercent(Float rankPercent) {
        this.rankPercent = rankPercent;
    }

    public Float getRankPercentMin() {
        return rankPercentMin;
    }

    public void setRankPercentMin(Float rankPercentMin) {
        this.rankPercentMin = rankPercentMin;
    }

    public Float getRankPercentMax() {
        return rankPercentMax;
    }

    public void setRankPercentMax(Float rankPercentMax) {
        this.rankPercentMax = rankPercentMax;
    }

    public Float getRankScoreMin() {
        return rankScoreMin;
    }

    public void setRankScoreMin(Float rankScoreMin) {
        this.rankScoreMin = rankScoreMin;
    }

    public Float getRankScoreMax() {
        return rankScoreMax;
    }

    public void setRankScoreMax(Float rankScoreMax) {
        this.rankScoreMax = rankScoreMax;
    }

    public Float getOriginalScoreMin() {
        return originalScoreMin;
    }

    public void setOriginalScoreMin(Float originalScoreMin) {
        this.originalScoreMin = originalScoreMin;
    }

    public Float getOriginalScoreMax() {
        return originalScoreMax;
    }

    public void setOriginalScoreMax(Float originalScoreMax) {
        this.originalScoreMax = originalScoreMax;
    }



}