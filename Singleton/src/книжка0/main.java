package книжка0;

public class main {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        chocolateBoiler.output();
        chocolateBoiler.fill(); // наполняем
        chocolateBoiler.boil(); // кипитим
        chocolateBoiler.output();
        chocolateBoiler.drain(); // сливаем
        chocolateBoiler.output();
        chocolateBoiler.fill();
        System.out.println("вывод первого:");
        chocolateBoiler.output();

        System.out.println("вывод второго:");
        // создаем полностью новый, хотя по факту это тот же самый
        ChocolateBoiler chocolateBoiler1 = new ChocolateBoiler();
        chocolateBoiler1.output();
    }
}
