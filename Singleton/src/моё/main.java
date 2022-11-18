package моё;

public class main {
    public static void main(String[] args) {
        Boy denis = Boy.getInstance();
        denis.output();
        System.out.println();
        System.out.println("- сегодня я пошла гулять с марком");
        denis.scream();
        System.out.println("- я опоздаю примерно на часа три");
        denis.scream();
        System.out.println("- ты слишком много кричишь...");
        denis.scream();
        System.out.println("- мне вообще-то нужно матан делать...");
        denis.madeMatan();
        System.out.println("- спасибо! проводишь меня до дома?");
        denis.conducted();
        System.out.println();
        System.out.println("- настя, я бы по 10бал. дала денису оценку " + denis.getAssesment());
        System.out.println("- но ведь есть еще Максим, он точно такой же");
        Boy maxim = Boy.getInstance();
        System.out.print("- знаешь, я сейчас всех сравниваю с денисом и все они у меня одинаковые...");
        System.out.print(" поэтому и оценка у него тоже " + maxim.getAssesment());
    }
}
