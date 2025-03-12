package ForLoop;

public class ForLoop3 {
    public static void main(String[] args) {
        int tal = 5;
        for (int i = 0; i < 100; i++) {
            int result = tal +i*3;
            if (result >= 100) {
                break;
            }
            System.out.println(result);
        }
    }
}
