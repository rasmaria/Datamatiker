package Basic;

public class HurtigTest {
    public static void main(String[] args) {
        String fruit = "Jordbær";

        String result = fruit.equals("Jordbær") ? "Det et jordbær!" :
                fruit.equals("æble") ? "Det er et æble!" :
                        fruit.equals("banan") ? "Det er en banan!" :
                                "ukendt frugt";

        System.out.println(result);
    }
}
