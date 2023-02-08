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

    public void test100M(Graph graph, String startName, String endName) {
        Graph g = graph;

        float average = 0;
        long[] time = new long[100];

        for (int j = 0; j < 100; j++) {
            long startTime = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                g.dijkstra(startName, endName);
            }
            long endTime = System.nanoTime();
            System.out.println("실행시간 : " + (endTime - startTime) / 1000000000.0 + " 초");
            time[j] = endTime - startTime;
        }
        long sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += time[i];
        }
        average = (float) sum / 10;
        System.out.println("평균 실행시간 : " + sum / 1000000000.0 + " 초");
    }
}
