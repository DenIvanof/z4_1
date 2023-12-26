public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        System.out.println();
        int price;
        price = 13_676;
        System.out.println("При покупке билета по цене " + (price) + "руб");
        System.out.println("Буден начисленно миль");
        System.out.println(service.calculate(price));
        System.out.println();
        System.out.println("Тест");
        System.out.println(service.calculate(13676));
        System.out.println(service.calculate(10000));
        System.out.println(service.calculate(19));
        System.out.println(service.calculate(20));
        System.out.println(service.calculate(50100));
        System.out.println(service.calculate(22220));
        System.out.println(service.calculate(12345));
        System.out.println(service.calculate(54321));

    }
}