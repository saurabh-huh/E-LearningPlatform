package training.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(13,3,12,45,75,214,32,233,23);

//        List<Integer> list = new ArrayList<>();
        // with external loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }

        // with enhanced external loops
        for (Integer integer : list) {
            System.out.print(integer +" ");
        }


        //use of stream and parallelStream
        //stream create a new stream of list that  can be use only ones. after one time utilization it destroys the stream.
        list.stream().sorted().forEach(num -> System.out.print(num + " "));

        list.parallelStream().filter(n -> n%2!=0).forEach(System.out::println);
        System.out.println();
        list.stream().map(n->n*2).limit(3).forEach(s-> System.out.print(s+1 + " "));

        System.out.println();
        System.out.println(list.stream().count());

        System.out.println(list.stream().findFirst());

    }
}
