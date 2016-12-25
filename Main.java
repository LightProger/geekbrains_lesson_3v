package game_guess_the_number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число от 0 до 10");
        int range = 10;
        int number = (int)(Math.random() * range);
        while (true){
            System.out.println("Введите число: ");
            int input_number = scanner.nextInt();
            if(input_number == number){
                System.out.println("Поздравляем! Вы угадали!!");
                break;
            } else if(input_number > number){
                System.out.println("Загаданное число меньше... ");
            } else {
                System.out.println("Загаданное число больше...");
            }
        }scanner.close();
    }
}
