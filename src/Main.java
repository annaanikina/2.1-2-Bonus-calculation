public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int replenishmentAmount = 1001;
        int bonus;
        int limit = 1000;
        if (replenishmentAmount > limit) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = currentBalance + replenishmentAmount + bonus;

        System.out.println(totalAmount);
        System.out.println(bonus);

    }

}

