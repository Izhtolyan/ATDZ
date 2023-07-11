package Zadacha;
import java.util.Random;
import java.util.Arrays;
// Реализуйте функцию, которая для данного массива целых чисел (int) возвращает значение наиболее близкое к 10.
//Если существуют два одинаково близких значения (например, 8 и 12), считайте большее значение более близким.
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            // заполняем каждый элемент случайным числом от 0 до 19
            numbers[i] = random.nextInt(19);
        }
        int closestToTen = findClosestToTen(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Наиболее близкое значение к 10: " + closestToTen);
    }

    public static int findClosestToTen(int[] numbers) {
        int closest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (Math.abs(numbers[i] - 10) < Math.abs(closest - 10)) {
                closest = numbers[i];
            } else if (Math.abs(numbers[i] - 10) == Math.abs(closest - 10) && numbers[i] > closest) {
                closest = numbers[i];
            }
        }

        return closest;
    }
}
