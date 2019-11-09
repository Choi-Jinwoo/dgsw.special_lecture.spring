package Controller;

import Model.Lottery;
import Model.Region;
import View.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        View.printSelectCountry();
        String countryStr = sc.next();

        Region region = Region.KR;

        if (countryStr.equals("usa"))
            region = Region.US;
        if (countryStr.equals("korea") || countryStr.equals("usa")) {
            Lottery lottery = new Lottery(region);
            scanLotteryNumber(lottery);
            scanBonousNumber(lottery);
            int ranking = lottery.getRanking();
            View.printRanking(ranking);
        } else {
            View.printCheckCountry();
        }
    }

    public static void scanLotteryNumber(Lottery lottery) {
        View.printScanLotteryNumber(lottery.getCountry().getLotteryLen());
        while (!lottery.scanInputLottery()) {
            View.printImpossibleLotteryNumber();
        }
    }

    public static void scanBonousNumber(Lottery lottery) {
        View.printScanBonousNumber();
        while (!lottery.scanInputBonous()) {
            View.printImpossibleBonousNumber();
        }
    }
}