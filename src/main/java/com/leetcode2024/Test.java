//package com.leetcode2024;
//
//import com.sorrting.Common;
//import com.sun.source.tree.Tree;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Test {
//        public static void main(String[] args) {
//
////            List<Integer> numbers = Arrays.asList(5, 3, 2, 4, 1);
//////            List<Integer> sortedList =
//////                    System.out.println(sortedList); // prints [1, 2, 3, 4, 5]
////
////            List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
////
////            System.out.println(sortedNumbers);
//
////            System.out.println(onlyOddNumbers(Arrays.asList(5,1,3,9)));
//            List<String> list1 = new ArrayList<>();list1.add("1");
//            List<String> list2 = new ArrayList<>();
//            list2.add("2");
//            list2.add( "458");
//
//            List<String> mergedList = List.of(list1,list2).stream().flatMap(element -> element.stream()).collect(Collectors.toList());
//
//            System.out.println(mergedList);
//        }
//
//    public static boolean onlyOddNumbers(List<Integer> list) {
//            int count =0;
//            for(int i=0; i<list.size(); i++){
//                if(list.get(i)%2==1)
//                    count++;
//            }
//            if(count==list.size())
//                return true;
//            return false;
//    }
//
//
//    Select distinct name from student where gender = "F" order by name desc
//
//            selct gender, count(*) as count_gender from student having count_gender is > 10 group by gender;
//
//            F, 5
//            M, 2
//
//    Select * from student where gender = "F" order by length(name) desc limit 1
//
//    Item -> itemid, name
//
//    Order -> itemId, OrderId, quantity
//
//   // select sum(quantity) from order join item on order.itemid = item.itemid where item.name = "xyz"
//
//    select sum(quantity) from order where itemId = "xym"
//
//    Employee -> name, id, adress
//    --> Tree
//
//
//
//}
