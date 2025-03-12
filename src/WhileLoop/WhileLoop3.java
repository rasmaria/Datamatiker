package WhileLoop;

public class WhileLoop3 {
    public static void main(String[] args) {
        int tal = 5;
        int i = 1;

        while (true) {
            int result = tal + i * 3;
            if (result >= 30) {
                break;
            }
            System.out.println(result);
        }
    }
}