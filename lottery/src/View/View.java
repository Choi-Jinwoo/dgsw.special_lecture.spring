package View;

public class View {
    public static void printSelectCountry() {
        System.out.println("국가를 입력하세요(korea, usa)");
    }

    public  static void printScanLotteryNumber(int inputCnt) {
        System.out.println("숫자를 입력해주세요 (" + inputCnt + ")");
    }

    public static void printScanBonousNumber() {
        System.out.println("보너스 숫자를 입력하세요");
    }

    public static void printImpossibleLotteryNumber() {
        System.out.println("범위를 벗어난 숫자입니다! 처음부터 다시 입력해주세요");
    }

    public static void printImpossibleBonousNumber() {
        System.out.println("범위를 벗어난 숫자입니다! 보너스를 다시 입력해주세요");
    }

    public static void printCheckCountry() {
        System.out.println("국가를 다시 확인하세요");
    }

    public static void printRanking(int ranking) {
        System.out.println(ranking + "등");
    }
}
