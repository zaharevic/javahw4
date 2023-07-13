package lesson4.hw;
import java.util.*;

public class first {
    public static void main(String[] args) {
        Deque<Integer> deq1 = new ArrayDeque<>(Arrays.asList(-1,-5,7));
        Deque<Integer> deq2 = new ArrayDeque<>(Arrays.asList(-2,3,5));
        LinkedList<Integer> sumList = new LinkedList<Integer>(sum(deq1, deq2));
        System.out.println(sumList);
    }

    public static LinkedList<Integer> sum(Deque<Integer> d1, Deque<Integer> d2){
        LinkedList<Integer> res = new LinkedList<Integer>();
        while(!d1.isEmpty()|| !d2.isEmpty()){
            int sum = 1;
            if(!d1.isEmpty()) sum *= d1.removeFirst();
            if(!d2.isEmpty()) sum *= d2.removeFirst();
            res.add(sum);
        }
        return res;
    }
}

