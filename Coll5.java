//LinkedLists class...

//import java.util.Iterator;
//import java.util.LinkedList;
//
//public class Coll5 {
//    public static void main(String[] args) {
//
//        LinkedList<String> name=new LinkedList<>();
//
//        name.add("Books");
//        name.add("Pens");
//        name.add("Pencils");
//        name.add("Bags");
//        name.add("Scales");
//
//        System.out.println("LinkedLists elements are: " +name);
////        iterating Linkedlist elements using foreach loop
//
//
////        for (String s: name)
////            System.out.println("Using foreach loop :" +s);
//
//        Iterator<String> iterator= name.iterator();
//
//        System.out.print("Accessing elements: ");
//
//        while (iterator.hasNext()) {
//
//            System.out.print(iterator.next());
//            System.out.print(",");
//        }
//
//    }
//}



//LinkedLists implements Queue.....

//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Coll5 {
//    public static void main(String[] args) {
//
//        Queue<Integer> obj= new LinkedList<>();
//
//        obj.add(10);
//        obj.add(20);
//        obj.add(50);
//        obj.add(90);
//        obj.add(40);
//
//        System.out.println("Queue elements are :" +obj);
//
//        System.out.println("Peek Method :" +obj.peek());
//
//        System.out.println("Offer Method :" +obj.offer(100));
//
//        System.out.println(obj);
//
//        System.out.println("Poll Method :" +obj.poll());
//
//        }
//    }





//LinkedLists implements Dequeue...


import java.util.Deque;
import java.util.LinkedList;

public class Coll5{
    public static void main(String[] args) {
        Deque<Integer> a =new LinkedList<Integer>();
        a.add(100);
        a.add(200);
        a.add(300);
        System.out.println("Deque elements are :" +a);

        a.addFirst(20);
        System.out.println("Adding element at firs position :" +a);

        a.addLast(500);
        System.out.println("Adding element at last positon :" +a);

        a.removeFirst();
        System.out.println(a);

        a.removeLast();
        System.out.println(a);
    }
}

