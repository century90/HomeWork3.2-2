public class Main {

    public static void main(String[] args) {
        int balans = 100; // первоначальная сумма на балансе
        int sum = 1000; // сумма пополнения

        if (sum >= 1000) {
            int bonus = sum / 100 * 1;
            System.out.println(" Бонус " + bonus);
            System.out.println(" Итоговый счёт " + (balans + sum + bonus));
        } else {
            int bonus = 0;
            System.out.println(" Итоговый счёт " + (balans + sum + bonus));
        }
    }
}
