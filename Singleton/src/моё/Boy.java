package моё;

public class Boy {
    private int Height; // рост
    private String ColorHair; // цвет волос
    private String EyeColor; // цвет глаз
    private boolean PresenceOfMillion; // наличие миллиона на счету

    private int generalAssessment; // общая оценка
    private static Boy boy; // статистическая переменная для хранения
// единственного экземпляра

    // приватный конструктор, чтобы только данный класс мог создавать экземпляры
    private Boy() {
        Height = 195;
        ColorHair = "брюнет";
        EyeColor = "зеленый";
        PresenceOfMillion = true;
        generalAssessment = 10;
    }

    // создаем и возвращаем экземпляр
    public static Boy getInstance() {
        if (boy == null) {
            boy = new Boy();
        }
        return boy;
    }

    public void scream() { // кричит
        if (generalAssessment > 0) {
            generalAssessment--;
        }
        System.out.println("*кричит*");
    }

    public void conducted() { // проводил
        if (generalAssessment < 10) {
            generalAssessment++;
        }
        System.out.println("*проводил до дома*");
    }

    public void madeMatan() { // сделал матан
        if (generalAssessment < 10) {
            generalAssessment++;
        }
        System.out.println("*сделал тебе матан*");
    }

    public int getAssesment() {
        return generalAssessment;
    }

    public void output() {
        System.out.println("рост: " + Height);
        System.out.println("цвет глаз: " + EyeColor);
        System.out.println("цвет волос: " + ColorHair);
        System.out.println("наличие миллиона: " + PresenceOfMillion);
        System.out.println("общая оценка: " + generalAssessment);
    }
}