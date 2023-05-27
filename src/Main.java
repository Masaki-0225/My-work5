import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> hirakawa = new ArrayList<>();


        hirakawa.add("高収入");
        hirakawa.add("高身長");
        hirakawa.add("高学歴");

        hirakawa.forEach(System.out::println);
    }
}