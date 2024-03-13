package practice;

public class JavaPracticeQuestions {
    public static void main(String[] args) {
        System.out.println(reverseString("string to reverse"));
        swapNumbers(13,21);
        System.out.println(fibonacciNumber(5));
    }

    //1. Write a Java Program that reverses a string
    public static String reverseString (String input){
        String result="";
        for (int i = input.length()-1 ; i >= 0; i-- ){
            result += input.charAt(i);
        }
        return result;
    }

    //2. Write a Java Program to swap two numbers
    public static void swapNumbers(int a, int b){
        System.out.println("before swap:");
        System.out.print("a: " + a + " ");
        System.out.println("b: " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.print( "a :" + a + " ");
        System.out.println( "b :" + b);
    }

    //3. Write a Java Program that prints fibonacci number due to given integer (11235811...)
    public static String fibonacciNumber(int digit){

        if (digit>100){
            System.out.println("please enter a digit which is less than 100");
            return "";
        }if (digit<1){
            System.out.println("please enter a positive digit");
            return "";
        }
        int first = 1;
        int second = 1;
        int temp = 0;
        String result = first+""+second;
        for (int i = 2; i<digit; i++){
             temp = first + second;
             result += temp;
             first = second;
             second = temp;
        }

        return result;
    }

}
