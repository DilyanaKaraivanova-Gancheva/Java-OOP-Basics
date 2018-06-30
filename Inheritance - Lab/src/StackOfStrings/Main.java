package StackOfStrings;

public class Main {
    public static void main(String[] args) {
        StackOfStrings sos = new StackOfStrings();
        sos.push("aa");
        sos.push("bb");
        sos.push("cc");

        System.out.println(sos.pop());
        System.out.println(sos.peek());
    }


}
