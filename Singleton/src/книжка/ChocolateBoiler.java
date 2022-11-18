package книжка;

public class ChocolateBoiler {
    private boolean empty; // пустой нагреватель
    private boolean boiled; // доведена ли смесь до кипения
    private static ChocolateBoiler uniqueInstance; // статистическая переменная для
    // хранения единственного экземпляра

    // приватный конструктор, чтобы только данный класс мог создавать экземпляры
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // создает и возвращает экземпляр
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    // перед наполнением мы проверяем, что нагреватель пуст
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    // чтобы слить содержимое
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    // чтобы вскипятить смесь
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public void output() {
        System.out.print("Текущее состояние: ");
        System.out.print("empty = " + empty);
        System.out.print(", boiled = " + boiled);
        System.out.println();
        System.out.println();
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
