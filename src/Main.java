import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseFullName.length);
        for (int i = reverseFullName.length - 1; i < reverseFullName.length; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(reverseFullName);
    }

    private static void task3() {
        int arr[] = generateRandomArray();
        int days = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println("сумма трат за месяц составляет" + sum);
        }
        int average = sum / days;
        System.out.println("средняя значение трат за месяц равняется " + average);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        int arr[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            System.out.println("трата в этом месяце" + sum);

        }
        System.out.println("сумма трат за месяц составила" + sum);


    }

    public static void task2 () {
        int arr[] = generateRandomArray();
        int minimum =arr[0];
        int maximum = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minimum) {
                minimum = arr[i];
            }
            if (arr[i] > maximum){
                maximum = arr[i];
            }
        }
        System.out.println("минимальная трата составляет " + minimum + " а максимальная " + maximum);
    }
}