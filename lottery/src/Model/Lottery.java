package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Lottery {
    private ArrayList<Integer> inputLottery = new ArrayList<Integer>();
    private ArrayList<Integer> randomLottery = new ArrayList<Integer>();
    private int inputBonous;
    private int randomBonous;
    private Country country;
    Scanner sc = new Scanner(System.in);

    public Lottery(Region region) {
        switch (region){
            case KR:
                country = new Korea();
                break;
            case US:
                country = new Usa();
                break;
        }

        setRandomLottery();
    }

    public boolean scanInputLottery() {
        for (int i = 0; i < country.getLotteryLen(); i++) {
            int scanData = sc.nextInt();
            if (!isPossibleNumber(scanData)) {
                return false;
            }
            inputLottery.add(scanData);
        }
        return true;
    }

    public boolean scanInputBonous() {
        int scanData = sc.nextInt();
        if (!isPossibleNumber(scanData)) {
            return false;
        }
        inputBonous = scanData;
        return true;
    }

    public void setRandomLottery() {
        for (int i = 0; i < country.getLotteryLen(); i++) {
            int randomValue = getRandomNum();
            randomLottery.add(randomValue);
        }
        randomBonous = getRandomNum();
    }

    public int getSameNumberCnt(int lotteryLen) {
        int sameNumberCnt = 0;
        for (int i = 0; i < lotteryLen; i++) {
            if (inputLottery.get(i) == randomLottery.get(i)) {
                sameNumberCnt++;
            }
        }
        return sameNumberCnt;
    }

    public boolean isPossibleNumber(int number) {
        if (number < country.getMinNum() || number > country.getMaxNum()) {
            return false;
        }
        return true;
    }

    public int getRandomNum() {
        int randomValue =
                (int)(Math.random() * (country.getMaxNum() - country.getMinNum() + 1)) + country.getMinNum();
        return randomValue;
    }

    public boolean isBonousSame() {
        return inputBonous == randomBonous;
    }

    public int getRanking() {
        int sameNumberCnt = getSameNumberCnt(country.getLotteryLen());
        int ranking = country.getRanking(sameNumberCnt, isBonousSame());
        return  ranking;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
