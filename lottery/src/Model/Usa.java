package Model;

public class Usa extends Country{
    private final int MIN_NUM = 1;
    private final int MAX_NUM = 65;

    public Usa() {
        super.setMinNum(MIN_NUM);
        super.setMaxNum(MAX_NUM);
        super.setLotteryLen(5);
    }

    @Override
    public int getRanking(int sameNumberCnt, boolean isSameBonous) {
        int lotteryLen = getLotteryLen();
        if (sameNumberCnt == lotteryLen && isSameBonous)
            return 1;
        else if (sameNumberCnt == lotteryLen)
            return 2;
        else if (sameNumberCnt == lotteryLen - 1 && isSameBonous)
            return 3;
        else if (sameNumberCnt == lotteryLen - 1)
            return 4;
        return 0;
    }
}
