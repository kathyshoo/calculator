import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //пример
        System.out.println("1. a + b = ?");
        System.out.println("2. a * b = ?");
        System.out.println("3. a / b = ?");
        System.out.println("4. a - b = ?");
        System.out.println("5. ax² + bx + c = 0      x-?");

        int znak = 1;
        while (znak != 0) {
            //запрос знака
            System.out.println("Если вы хотите выйти из программы введите 0");
            znak = znak_();
            if (znak != 0) {
                //      Первое число
                System.out.print("Введите a: ");
                double a = input.nextDouble();
                //      Второе число
                System.out.print("Введите b: ");
                double b = input.nextDouble();
                //проверка на уравнение
                if (znak == 5) {//      Третье число (если уравнение)
                    System.out.print("Введите c: ");
                    double c = input.nextDouble();
                    urav(a, b, c);
                } else {
                    otvet(a, b, znak);
                }
            }
        }
    }

    public static void otvet(double a, double b, int z) {
        if (z == 1) {
            System.out.println("Ответ: a + b = " + (a + b) + "\n");
        }
        //умножение
        else if (z == 2) {
            System.out.println("Ответ: a * b = " + (a * b) + "\n");
        }
        //деление
        else if (z == 3) {
            System.out.println("Ответ: a / b = " + (a / b) + "\n");
        }
        //вычитание
        else if (z == 4) {
            System.out.println("Ответ: a - b " + (a - b) + "\n");
        }
    }

    public static void urav(double a, double b, double c){
        double d = b * b - 4 * a * c;
        if (d > 0){
            //дескриминант>0
            double x1 = (-1 * b - Math.sqrt(d)) / (2 * a);
            double x2 = (-1 * b + Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2 + "\n");
        }
        else if (d == 0){
            //дескриминант=0
            double x = (-1 * b) / (2 * a);
            System.out.println("x = " + x + "\n");
        }
        else {
            //дескриминант<0
            System.out.println("Нет корней" + "\n");
        }
    }

    public static int znak_(){
        //запрос действия
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер действия: ");
        int zn = input.nextInt();
        //проверка на правильность номера действия
        while (zn < 0 | zn > 5){
            System.out.println("Если вы хотите выйти из программы введите 0");
            System.out.print("Неверный номер действия, попробуйте ещё раз: ");
            zn = input.nextInt();
        }
        return (zn);
    }
}