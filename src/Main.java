public class Main {
    public static void main(String[] args) {

        int wallet = 346;
        int refill = 1684;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println(wallet + refill + " рублей на счету");
        System.out.println(bonus + " бонусных рублей");
    }
}