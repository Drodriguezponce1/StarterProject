package main;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Just wanted to say hello");

        for(int i  = Integer.parseInt(args[0]); i <= Integer.parseInt(args[1]) + 1; i++){
            System.out.println(i);
        }
    }
}
