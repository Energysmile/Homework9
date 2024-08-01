public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int[] costAmount = {17_000, 20_000, 16_000, 21_000, 20_500};
        int sum = 0;
        for (int i = 0; i < costAmount.length; i++) {
            sum = sum + costAmount[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задание 2
        System.out.println("Задание 2");
        int minCostAmount = 1_000_000;
        for (int i = 0; i < costAmount.length; i++) {
            if (costAmount[i] < minCostAmount) {
                minCostAmount = costAmount[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minCostAmount + " рублей");
        int maxCostAmount = 0;
        for (int i = 0; i < costAmount.length; i++) {
            if (costAmount[i] > maxCostAmount) {
                maxCostAmount = costAmount[i];
            }

        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxCostAmount + " рублей");

        //Задание 3
        System.out.println("Задание 3");
        double averageAmount = sum / (costAmount.length);
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        //Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}