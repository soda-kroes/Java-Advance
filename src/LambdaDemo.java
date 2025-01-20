import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        Calculator calculator = new MyCalcultor();
        Calculator calculator2 = (n1, n2) -> n1 * n2 * 10;
    }

    static void test1() {
         /*
        MyPrinter printer = new MyPrinter() {
            @Override
            public void display(String text) {
                System.out.println(text);
            }
        };

        printer.display("Hello Java");
         */

        MyPrinter printer = (String text) -> System.out.println(text);
        printer.display("Hello Java");

        /*f
         # When we can use Lambda expression
               1. Functional Interface : single abstract method
               2. Parameter of lambda must be the as in method on interface
               3. Same return type
         */


        Infor myInfor = () -> System.out.println("Company Information");
        myInfor.showInfor();

        //call with param
        MyPrinter printer2 = text -> System.out.println(text); //if have one param we can call without use () but multi it we must use ()
        printer2.display("Welcome to Java");

        Comparator<Integer> compareByNumber = (p1, p2) -> p2 - p1; //when have multi param (p1, p2) use ()
        List<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(15);
        list1.add(42);

        System.out.println("Before sorting: " + list1);
        Collections.sort(list1, compareByNumber);
        System.out.println("After sorting: " + list1);

        System.out.println("=================================");
        System.out.println("Learning Short String");
        System.out.println("=================================");

        List<String> list2 = new ArrayList<>();
        list2.add("thida");
        list2.add("dara");
        list2.add("vanda");

        System.out.println("Before sorting: " + list2);
        Collections.sort(list2, (p1, p2) -> p1.compareTo(p2));
        System.out.println("After sorting: " + list2);

//        Map<String,Long> priceMap = new HashMap<>();
//        var priceMap = new HashMap<>();
//        priceMap.put("apple", 30L);

//        Calculator calculator = (a, b) -> a + b;
//        System.out.println(calculator.calcul(3,4));

        //when we do with body to custom
        Calculator calculator = (a, b) -> {
            a = a * 2;
            System.out.println(a + "*" + b + " = ?");
            return a * b;
        };
        System.out.println(calculator.calcul(3, 4));

    }

    static class MyCalcultor implements Calculator {

        @Override
        public int calcul(int a, int b) {
            return (a + b) * 2;
        }
    }


}