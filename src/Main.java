public class Main {
    public static void main(String[] args) {
        double price = 10_000.99;
        int cost = 20;
        int bonus = (int) (price / cost);


        System.out.println("Количество миль =" + bonus);
    }

}