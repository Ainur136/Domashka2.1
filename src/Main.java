public class Main {
    public static void main(String[] args) {

        int balance = 100; // Начальный баланс
        int deposit = 1100;// Сумма пополнения
        int bonus = 0;

        if (deposit > 1000){
            bonus = deposit/100;
        }
        int finalbonus = balance +deposit+bonus;
        System.out.println("Начальный баланс: " + balance + " Рублей");
        System.out.println("Пополнено на: " + deposit + " рублей");
        System.out.println("Начислено бонусов: " + bonus + " Рублей");
        System.out.println("Итого: "+ finalbonus + " Рублей");

    }
}
