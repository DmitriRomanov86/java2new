public class Main {

    public static void main(String[] args) {

        int balance = 100;
        int deposit = 1500;
        int minimum = 100;
        boolean replenishes = true;

        int amount = balance + deposit;
        int bonus = deposit / 100;
        int percent = replenishes ? bonus : amount;
        int check = percent + amount;
        if (amount > minimum) {

            System.out.println("Итого на счёте: " + check + " рублей");
            System.out.println("Бонус: " + bonus + " рублей");
        }
    }
}
