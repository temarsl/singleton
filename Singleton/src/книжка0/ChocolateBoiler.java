package книжка0;

public class ChocolateBoiler {
    private boolean empty; // пустой нагреватель
    private boolean boiled; // доведена ли смесь до кипения


    public ChocolateBoiler() {
        empty = true;
        boiled = false;
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
