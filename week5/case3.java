package week5;

public class case3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 6 == 0) {
                System.out.println(i + " Multiple of 3 and 6");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Multiple of 3 and 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " Multiple of 3");
            } else if (i % 6 == 0) {
                System.out.println(i + " Multiple of 6");
            } else if (i % 5 == 0) {
                System.out.println(i + " Multiple of 5");
            } else {
                System.out.println(i + " Not a Multiple of 3, 6, or 5");
            }
        }
    }
}
