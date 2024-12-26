//package com.test;
//
//public class Epam {
//    public static void main(String[] args) {
//        char[][] keypad = {{'1','2','3'},
//                            {'4','5','6'},
//                            {'7','8','9'},
//                             {'*','0','#'},
//        };
//        findSevenDigitCombination(keypad, '1');
//    }
//
//    public static void findSevenDigitCombination(char[][] keypad, char currentPosition){
//        int currentLeft = 0;
//        int currentRight = 0;
//        char[] sevenDigits = new char[7];
//
//        System.out.println(String.valueOf(findNext(currentLeft, currentRight, keypad, sevenDigits, 0)));
//
//    }
//
//    public static char[] findNext(int currentLeft, int currentRight, char[][] keypad,
//                                char[] sevenDigits, int index){
//        //        (0,0) -> (0,2) -> (1,2),  _> Right (-1,2)
////                (0,0) -> (2,1)  _> Bottom, (2, -1)
////        (0,0) _> (-2, 1) _> Top -> (-2, -1)
////              -> (-1,-2) -> left -> (1, -2)
//        char c;
//        int length = 4;
//        int breadth = 3;
//        int nextLeft = 0;
//        int nextRight =0;
//        if(index ==7)
//            return sevenDigits;
//
//        while(index < 7) {
//            calcuteNextMove(currentLeft, currentRight, nextLeft, nextRight, "RIGHT_DOWN");
//                c = keypad[nextLeft][nextRight];
//                sevenDigits[index] = c;
//                findNext(nextLeft, nextRight, keypad, sevenDigits, index++);
//        }
////        try{
////            c = keypad[currentLeft + 2][currentRight -1 ];
////            sevenDigits[index] = c;
////            findNext(currentLeft +2, currentRight+1, keypad, sevenDigits, index++);
////        }
////
////        try{
////            c = keypad[currentLeft -2][currentRight -1];
////            sevenDigits[index] = c;
////            findNext(currentLeft -2, currentRight-1, keypad, sevenDigits, index++);
////        }
////        catch (IndexOutOfBoundsException e){
////        }
////        try{
////            c = keypad[currentLeft + 1][currentRight -2];
////            sevenDigits[index] = c;
////            findNext(currentLeft +1, currentRight-2, keypad, sevenDigits, index++);
////        }
////        catch (IndexOutOfBoundsException e){
////        }
//        return sevenDigits;
//    }
//
//    public static  void calcuteNextMove(int currentLeft, int currentRight, int nextLeft, int nextRight){
//        int length = 4;
//        int breadth = 3;
//        String directions =
//        for(int i=0; i< 8; i++){
//            calcuteNextMove(currentLeft, currentRight, nextLeft, nextRight);
//        }
//        if (nextLeft < length && nextRight < breadth) {
//            return;
//        }
//    }
//    public static void nextMove(int currentLeft, int currentRight, int nextLeft, int nextRight, String direction){
//        if(direction == "RIGHT_DOWN") {
//            nextLeft = currentLeft + 1;
//            nextRight = currentRight + 2;
//        }
//        if(direction == "RIGHT_DOWN") {
//            nextLeft = currentLeft + 1;
//            nextRight = currentRight + 2;
//        }
//        if(direction == "RIGHT_DOWN") {
//            nextLeft = currentLeft + 1;
//            nextRight = currentRight + 2;
//        }
//        if(direction == "RIGHT_DOWN") {
//            nextLeft = currentLeft + 1;
//            nextRight = currentRight + 2;
//        }
//        if(direction == "RIGHT_DOWN") {
//            nextLeft = currentLeft + 1;
//            nextRight = currentRight + 2;
//        }
//        if(direction == "RIGHT_DOWN") {
//            nextLeft = currentLeft + 1;
//            nextRight = currentRight + 2;
//        }
//        if(direction == "RIGHT_DOWN") {
//            nextLeft = currentLeft + 1;
//            nextRight = currentRight + 2;
//        }
//        if(direction == "RIGHT_DOWN") {
//            nextLeft = currentLeft + 1;
//            nextRight = currentRight + 2;
//        }
//    }
//}
