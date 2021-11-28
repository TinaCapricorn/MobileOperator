public class Main {
    public static void main(String[] args) {
        int moneyOnMobile = 100;
        int transfer = 2000;
        int pureSum = moneyOnMobile+transfer;

        int bonus;
        int total;
        if (transfer>1000){
            bonus = pureSum/100;
            total = pureSum + bonus;
            System.out.println(total);
            System.out.println(bonus);
        } else {
            System.out.println(pureSum);
        }
    }
}
