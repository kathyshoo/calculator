import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //      Первое число
        // запрос
        System.out.print("Введите число: ");
        Scanner ain = new Scanner (System.in);
        //присвоение
        double a = ain.nextDouble();

        //      Второе число
        //запрос
        System.out.print("Введите второе число: ");
        Scanner bin = new Scanner (System.in);
        //присвоение
        double b = bin.nextDouble();

        //      Действие
        //запрос
        System.out.print("Введите номер действия: ");
        Scanner input3 = new Scanner (System.in);
        int znak = input3.nextInt();
        //сложение
        if(znak==1){
            System.out.print("Сумма чисел: " + (a + b));
        }
        //умножение
        if(znak==2){
            System.out.print("Произведение чисел: " + (a * b));
        }
        //деление
        if(znak==3){
            System.out.print("Частное чисел: " + (a / b));
        }
        //вычитание
        if(znak==4){
            System.out.print("Разность чисел: " + (a - b));
        }
    }
}