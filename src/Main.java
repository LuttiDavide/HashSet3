import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set = fillHashSet(set);

        String element = "Two";

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(element)) {
                iterator.remove();
            }
        }

        set.clear();

        System.out.println("The HashSet is empty? " + set.isEmpty());
    }

    private static HashSet<String> fillHashSet(HashSet<String> set) {
        set.add("uno");
        set.add("due");
        set.add("tre");
        return set;
    }
}