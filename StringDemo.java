package DesignPattern;

public class StringDemo {
    public static void main(String[] args) {
        String k=new String("kj").intern();
        String j="kj";
        System.out.println(k==j);
    }
}
