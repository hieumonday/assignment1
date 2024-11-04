package code_yt.vong_lap;

public class sum {

    public static void main(String[] args) {
        int sumc = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumc = sumc + i;
            }
        }
        System.out.println("sum of even numbers : " + sumc);
        int suml = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                suml = suml + i;
            }
        }
        System.out.println("sum of odd numbers : " + suml);
    }
}
