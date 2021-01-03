import java.util.HashSet;
import java.util.Iterator;

public class Coll4 {
    public static void main(String[] args) {

        HashSet<Integer> obj = new HashSet<Integer>();

        obj.add(1);
        obj.add(2);
        obj.add(3);

        System.out.println("HashSet :" + obj);

        System.out.println("removed: " +obj.remove(1));

        System.out.println("HashSet :" +obj);

       for (Integer i : obj) {

           System.out.print("," +i);
       }
        System.out.println();

        Iterator<Integer> iterator = obj.iterator();
        System.out.print("Iterator: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(",");

        }
    }
}