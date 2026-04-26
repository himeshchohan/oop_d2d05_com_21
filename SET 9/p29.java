import java.util.ArrayList;
import java.util.Collections;
public class p29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(66);
        marks.add(78);

        System.out.println("Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("\nHighest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
}