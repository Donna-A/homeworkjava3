public class Main {
    public static void main(String[] args) {

        int balans = 731; // начальный счет
        int amount = 1567; // сумма пополнения

        int bonus;

        if (amount + balans > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        //int bonus = amount + balans > 1000 ? amount/100 : 0; Вариант решения с тернарным оператором
        System.out.println((bonus) + " Бонусные рубли");
        System.out.println((bonus + balans + amount) + " Итоговый счет");


    }
}