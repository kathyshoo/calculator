import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //      Первое число
        // запрос
        System.out.print("Введите a: ");
        Scanner ain = new Scanner (System.in);
        //присвоение
        double a = ain.nextDouble();

        //      Второе число
        //запрос
        System.out.print("Введите b: ");
        Scanner bin = new Scanner (System.in);
        //присвоение
        double b = bin.nextDouble();

        //      Действие
        //запрос
        System.out.print("Введите номер действия: ");
        Scanner input3 = new Scanner (System.in);
        int znak = input3.nextInt();
        //отступ
        System.out.println("");
        //сложение
        if(znak==1){
            System.out.print("Сумма чисел: " + (a + b));
        }
        //умножение
        else if(znak==2){
            System.out.print("Произведение чисел: " + (a * b));
        }
        //деление
        else if(znak==3){
            System.out.print("Частное чисел: " + (a / b));
        }
        //вычитание
        else if(znak==4){
            System.out.print("Разность чисел: " + (a - b));
        }
        //квадратное уравнение
        else if(znak==5){
            System.out.print("Введите c: ");
            //ввод c
            Scanner cin = new Scanner (System.in);
            double c = cin.nextDouble();
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