import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestCode {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("one");
        sortedSet.add("two");
        sortedSet.add("three");

        Iterator iterator = sortedSet.iterator();
        while(iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }
    }
}
