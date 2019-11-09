package Model;

import sun.plugin2.gluegen.runtime.StructAccessor;

import java.sql.Struct;

public class Country {
    private int minNum;
    private int maxNum;
    private int lotteryLen;

    public int getMaxNum() {
        return maxNum;
    }

    public int getMinNum() {
        return minNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public int getLotteryLen() {
        return lotteryLen;
    }

    public void setLotteryLen(int lotteryLen) {
        this.lotteryLen = lotteryLen;
    }

    public int getRanking(int sameNumberCnt, boolean sameBonous) {
        return 0;
    }

    @Override
    public String toString() {
        return "minNum " + minNum + " maxNum " + maxNum + " lotteryLen " + lotteryLen;
    }
}
