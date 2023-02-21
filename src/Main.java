public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        System.out.println("Задача 1");
        {
            int[] arr = generateRandomArray();
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            int sum = 0;
            for (int index = 0; index < arr.length; index++) {
                sum = sum + arr[index];


            }
            System.out.println(" Сумма трат за месяц составило " + sum + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        {
            int[] arr = generateRandomArray();
            int minMoney = 200001;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minMoney) {
                    minMoney = arr[i];
                }
            }
            int maxMoney = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxMoney) {
                    maxMoney = arr[i];
                }

            }
            System.out.println("Минимальная сумма трат за день составила " + minMoney + " рублей. Максимальная сумма трат за день составила " + maxMoney + " рублей");


        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        {
            int[] arr = generateRandomArray();

            double sum = 0;
            for (int index = 0; index < arr.length; index++) {
                sum = sum + arr[index];
            }
            double medium = sum / arr.length;

            System.out.println("Средняя сумма трат за месяц составила " + medium + " рублей");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }

}

