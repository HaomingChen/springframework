package demo.generic;

import java.util.LinkedList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
//        List linkedList = new LinkedList<>();
//        linkedList.add("words");
//        linkedList.add(1);
//        for(int i = 0; i < linkedList.size(); i++){
//            String item = (String)linkedList.get(i);
//            System.out.println(item);
//        }
        GenericClassExample<String> stringExample = new GenericClassExample<>("abc");
        GenericClassExample<Integer> integerExample = new GenericClassExample<>(123);
        System.out.println(stringExample.getMember().getClass());
        System.out.println(integerExample.getMember().getClass());
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        Double[] doubles = {1.1, 1.2, 1.3, 1.4, 1.5};
        Character[] characters = {'A', 'B', 'C'};
        stringExample.printArray(integers);
        stringExample.printArray(doubles);
        stringExample.printArray(characters);

    }
}
