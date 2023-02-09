public class Main {
    public static void main(String[] args) {
        task6();
        task7();
        task8();
    }

    public static void task6() {
        System.out.println("");
        System.out.println("Задача №6");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(-result);
    }

    public static void task7() {
        System.out.println("");
        System.out.println("Задача №7");
        int a = 5;
        int b = 7;
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void task8() {
        System.out.println("");
        System.out.println("Задача №8");
        int a = 977;
        int b = (a - a / 100 * 100) / 10;
        System.out.println(b);
    }

}