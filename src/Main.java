public class Main {
    public static void main(String[] args) {
        int price = 1753;
        System.out.println("Стоимость билета:" + price);
        int tick = 20;
        int miles = (int) (price / tick);
        System.out.println("Начисленные мили: " + miles + " миль");
    }
}