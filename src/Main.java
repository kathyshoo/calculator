import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double c=0;
        //      Действие
        //пример
        System.out.println("1. a + b = ?");
        System.out.println("2. a * b = ?");
        System.out.println("3. a / b = ?");
        System.out.println("4. a - b = ?");
        System.out.println("5. ax² + bx + c = 0      x-?");
        //запрос
        System.out.print("Введите номер действия: ");
        Scanner input3 = new Scanner (System.in);
        int znak = input3.nextInt();

        //      Первое число
        System.out.print("Введите a: ");
        Scanner ain = new Scanner (System.in);
        double a = ain.nextDouble();
        //      Второе число
        System.out.print("Введите b: ");
        Scanner bin = new Scanner (System.in);
        double b = bin.nextDouble();
        if (znak==5) {//      Третье число (если уравнение)
            System.out.print("Введите c: ");
            Scanner cin = new Scanner(System.in);
            c = cin.nextDouble();
        }

        //      Решение
        //сложение
        if(znak==1){
            System.out.print("a + b = " + (a + b));
        }
        //умножение
        else if(znak==2){
            System.out.print("a * b = " + (a * b));
        }
        //деление
        else if(znak==3){
            System.out.print("a / b = " + (a / b));
        }
        //вычитание
        else if(znak==4){
            System.out.print("a - b " + (a - b));
        }
        //квадратное уравнение
        else if(znak==5){
            //решение уравнения
            double d = b * b - 4 * a * c;
            if (d > 0){
                //дескриминант>0
                double x1 = (-1 * b - Math.sqrt(d)) / (2 * a);
                double x2 = (-1 * b + Math.sqrt(d)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            else if (d == 0){
                //дескриминант=0
                double x = (-1 * b) / (2 * a);
                System.out.println("x = " + x);
            }
            else {
                //дескриминант<0
                System.out.println("Нет корней");
            }
        }
        //другое число в знаке
        else {
            System.out.println("Неверное действие");
        }
    }
}