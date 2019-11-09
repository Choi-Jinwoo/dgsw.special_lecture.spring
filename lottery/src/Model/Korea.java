package Model;

public class Korea extends Country {
    private final int MIN_NUM = 1;
    private final int MAX_NUM = 45;

    public Korea() {
        super.setMinNum(MIN_NUM);
        super.setMaxNum(MAX_NUM);
        super.setLotteryLen(6);
    }

    @Override
    public int getRanking(int sameNumberCnt, boolean isSameBonous) {
        int lotteryLen = getLotteryLen();
        if (sameNumberCnt == lotteryLen)
            return 1;
        else if (sameNumberCnt == lotteryLen - 1 && isSameBonous)
            return 2;
        else if (sameNumberCnt == lotteryLen - 1)
            return 3;
        else if (sameNumberCnt == lotteryLen - 2)
            return 4;
        return 0;
    }
}
