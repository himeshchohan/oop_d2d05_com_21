import java.util.LinkedList;

public class p32 {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        int searchRoll = 102;
        if (searchElement(rollNumbers, searchRoll)) {
            System.out.println("Roll number " + searchRoll + " found.");
        } 
        else {
            System.out.println("Roll number " + searchRoll + " not found.");
        }

        LinkedList<String> names = new LinkedList<>();
        names.add("Abc");
        names.add("Pqr");
        names.add("Xyz");
        names.add("Def");

        String searchName = "Xyz";
        if (searchElement(names, searchName)) {
            System.out.println("Name \"" + searchName + "\" found.");
        } 
        else {
            System.out.println("Name \"" + searchName + "\" not found.");
        }
    }
}