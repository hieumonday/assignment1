package code_yt.vong_lap;

public class so_nto {

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");

        for (int i = 2; i <= 100; i++) {
            boolean snt = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    snt = false;
                }
            }

            if (snt) {
                System.out.print(i + " ");
            }
        }
    }
}
