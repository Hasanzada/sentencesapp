import java.util.ArrayList;
import java.util.List;

public class SentencesApp {


    private static List<String> list(String s1, String s2, String s3) {
        ArrayList<String>strings = new ArrayList<>();
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        return strings;
    }
    public static void main(String[] args) {

        List<String> subjects = list("Noel", "The cat", "The dog");
        List<String> verbs =    list("wrote", "chased", "slept on");
        List<String> objects =  list("the book","the ball","the bed");

        List<String> sentences = all_possible(subjects, verbs, objects);
        for(String sentence : sentences){
            System.out.println(sentence);
        }


    }


    private static List<String> all_possible(List<String> subjects, List<String> verbs, List<String> objects) {
        List<String>list = new ArrayList<>();
        String sentence;
        for (int i = 0; i < subjects.size(); i++) {
            for (int j = 0; j < verbs.size(); j++) {
                for (int k = 0; k < objects.size(); k++) {
                    sentence = (String.format("%s %s %s", subjects.get(i),verbs.get(j),objects.get(k)));
                    list.add(sentence);
                }
            }
        }
        return list;
    }
}
