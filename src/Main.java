public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2() {
        for (int d = 10; d >= 1; d--) {
            System.out.println(d);
        }
    }

    public static void task3() {
        for (int c = 0; c <= 17; c = c + 2) {
            System.out.println(c);
        }
    }

    public static void task4() {
        for (int z = 10; z >= -10; z--) {
            System.out.println(z);
        }
    }

    public static void task5() {
        for (int g = 1904; g <= 2096; g = g + 4) {
            System.out.println("Высокосный год " +g);
        }
    }

    public static void task6() {
        for (int l = 7; l <= 98; l = l + 7) {
            System.out.println(l);
        }
    }

    public static void task7() {
        for (int w = 1; w <= 512; w = w * 2) {
            System.out.println(w);
        }

}
}