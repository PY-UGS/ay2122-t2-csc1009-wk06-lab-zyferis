import java.util.LinkedList;

public class lab06_b {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i < 13; i += 2) {
            list.add(i);
        }
        System.out.println(list);
        swap(list, 1, 5);
        System.out.println(list);
    }

    public static void swap(LinkedList<Integer> list, int index1, int index2) {
        int temp;
        temp = list.get(index1);
        list.add(index1,list.get(index2));
        list.remove(index1+1);
        list.add(index2,temp);
        list.remove(index2+1);
    }
}