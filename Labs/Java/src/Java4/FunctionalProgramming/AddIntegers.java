//public class AddIntegers implements Function<Integer, Integer> {
//    public Integer apply(Integer i, Integer j){
//        @Override
//        return i+j;
//    }
//}

import java.util.function.Function;

public class AddIntegers {
    public static Function<Integer, Integer> sumInt(int i) {
        return (item -> item + i);
    }

    public static Function<Integer, Function<Integer,Integer>>curryAdd = item -> item2 -> item + item2;

    public static void main(String[] args) {

        Function<Integer,Integer> sum= sumInt(3);
        System.out.println(sum.apply(4));
        System.out.println(curryAdd.apply(2).apply(10));
    }

}

//import java.util.function.Function;
//
//public class AddIntegers {
//    public static Function<Integer, Integer> sumInt(int i, int j) {
//        return (item -> item +( i + j));
//    }
//
//
//
//    public static void main(String[] args) {
//
//        Function<Integer,Integer> sum= sumInt(3, 4);
//        System.out.println(sum.apply(4));
//    }
//
//}