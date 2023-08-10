import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Создание массива
        double[] numbers = {8.0, -2.0, -4.0, 2.0, 3.0, 6.0, -7.0, 5.0, -1.0, 0.0, 9.0, -3.0, 4.0, -6.0, 1.0};
        // Поиск первого отриц. числа
        int firstNegative = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegative = i;
                break;
            }
        }
        // Если найдено отрицательное число, вычисление среднего арифметического положительных чисел после
        if (firstNegative != -1) {
            double sum = 0;
            int count = 0;
            for (int i = firstNegative + 1; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    sum += numbers[i];
                    count++;
                }
            }
            double average = sum / count;
            System.out.println("Средн. арифм.: " + average);
        } else {
            System.out.println("В массиве нет отриц. чисел.");
        }
        // Сортировка массива по возрастанию
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
            // Вывод текущего массива на каждой итерации
            System.out.println(Arrays.toString(numbers));
        }
    }
}
