import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] frutas1 = { "Morango", "Uva", "Acerola", "Manga" };
        String[] frutas2 = { "Pêra", "Caju", "Morango", "Kiwi" };

        List<String> repeated = new ArrayList<String>();

        for (int i = 0; i < frutas1.length; i++) {
            for (int j = 0; j < frutas2.length; j++) {
                if (frutas1[i].equalsIgnoreCase(frutas2[j]) && !repeated.contains(frutas1[i])) {
                    repeated.add(frutas1[i]);
                    System.out.println(frutas1[i]);
                }
            }
        }
    }
}
