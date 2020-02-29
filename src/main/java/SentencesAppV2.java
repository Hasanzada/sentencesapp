import java.util.ArrayList;
import java.util.List;

public class SentencesAppV2 {


    public static void main(String[] args) {

        List<String> subjects = list("Noel", "The cat", "The dog");
        List<String> verbs =    list("wrote", "chased", "slept on");
        List<String> objects =  list("the book","the ball","the bed");


    }

    private static List<String> list(String s1, String s2, String s3) {
        ArrayList<String>strings = new ArrayList<>();
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        return strings;
    }

}
