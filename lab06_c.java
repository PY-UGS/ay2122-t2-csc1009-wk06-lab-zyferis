import java.util.LinkedList;
import java.util.Random;

public class lab06_c {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random r = new Random(55); //set seed for random 
        for (int i = 0; i < 500; i++) {
            list.add(r.nextInt(9000) + 1000);
        }
        System.out.println(list);
        
        find(list, 1119);
    }

    public static void find(LinkedList<Integer> list, int findThis) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == findThis) {
                System.out.println("found at pos: " + i);
                return;
            }
        }
        System.out.println("int " + findThis+ " not found");
    }
}