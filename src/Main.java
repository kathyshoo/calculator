import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //      Первое число
        // запрос
        System.out.print("Введите число: ");
        Scanner input = new Scanner (System.in);
        //присвоение
        double chislo1 = input.nextInt();

        //      Второе число
        //запрос
        System.out.print("Введите второе число: ");
        Scanner input2 = new Scanner (System.in);
        //присвоение
        double chislo2 = input2.nextInt();

        //      Действие
        //запрос
        System.out.print("Введите номер действия: ");
        Scanner input3 = new Scanner (System.in);
        int znak = input3.nextInt();
        //сложение
        if(znak==1){
            System.out.print("Сумма чисел: " + (chislo1 + chislo2));
        }
        //умножение
        if(znak==2){
            System.out.print("Произведение чисел: " + (chislo1 * chislo2));
        }
        //деление
        if(znak==3){
            System.out.print("Частное чисел: " + (chislo1 / chislo2));
        }
        //вычитание
        if(znak==4){
            System.out.print("Разность чисел: " + (chislo1 - chislo2));
        }
    }
}