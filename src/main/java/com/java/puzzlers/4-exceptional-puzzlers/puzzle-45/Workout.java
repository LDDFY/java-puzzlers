public class Workout {
    public static void main(String[] args) {
        workHard();
        System.out.println("It's nap time.");
    }

    private static void workHard() {
        try {
            System.out.println("1");
            workHard();
        } finally {
            System.out.println("2");
            workHard();
        }
    }
}
