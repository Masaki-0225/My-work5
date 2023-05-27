import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> hirakawa = new ArrayList<>();


        hirakawa.add("小貧乏");
        hirakawa.add("背が低い");
        hirakawa.add("頭が良くない");

        hirakawa.forEach(System.out::println);
    }
}