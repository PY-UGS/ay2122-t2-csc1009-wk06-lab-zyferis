import java.util.LinkedList;
import java.util.Scanner;

public class lab06_a {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int value;
        for (int i = 1; i < 13; i += 2) {
            list.addLast(i);
        }
        System.out.println("Enter value: ");
        Scanner s = new Scanner(System.in);
        value = s.nextInt();
        addAndSort(list, value);
        value = s.nextInt();
        addAndSort(list, value);
        value = s.nextInt();
        addAndSort(list, value);
        value = s.nextInt();
        addAndSort(list, value);
        s.close();
    }

    static void addAndSort(LinkedList<Integer> list, int value) {
        System.out.println("before: "+ list);
        if (list.size() == 0) {
            list.add(value);
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (value <= list.get(i)) {
                    list.add(i, value);
                    System.out.println("after: "+ list);
                    return;
                }
            }
            list.addLast(value);
        }
        System.out.println("after: "+ list);
    }

}