public class Main {
    public static void main(String[] args) {

        //Task 1 & 2

        int month = 15_000;
        int total = 0;
        int i = 0;

        for (; total < 12_000_000; i++) {
            total = total + total / 100 * 7;
            total = total + month;
            if (i % 6 == 0) {
                System.out.println("Month0 " + i +" on deposit " + total + " dollars");
            }
        }
        //Task 3

        int monthSalary = 15000;
        int total0 = 0;
        int g = 0;

        for (; g < (g * 12 * 9); g ++) {
            total0 = total0 + total0 / 100 * 7;
            total0 = total0 + monthSalary;
            if (g % 6 == 0) {
                System.out.println("Month1 " + g +" on deposit " + total0 + " dollars");
            }
        }
        //Task 4

        int friday = 7;
        int total1 = 0;
        int a = 1;
        for (; a <= 31; a ++) {
            if (a % friday == 0) {
                System.out.println("Today is friday " + a + "th " + " need to prepare a report");

            }
        }

    }
}