package calMethods;

import java.util.Scanner;

public class CalculationMethods {

    public static void add(int a, int b){
        double c = a+b;
        System.out.println(a+ "+" + b + " = " + c + "\n");
    }
    public static void subtract(int a, int b){
        double c = a-b;
        System.out.println(a+ "-" + b + " = " + c + "\n");
    }
    public static void multiply(int a, int b){
        double c = a*b;
        System.out.println(a+ "*" + b + " = " + c + "\n");
    }
    public static void divide(int a, int b){
        double da=a; double db=b;
        double c = da/ db;
        System.out.println(a+ "/" + b + " = " + c + "\n");
    }
    public static void sinus(int a, int b){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String sinChoice = sc.next();
        if (sinChoice.equals("a")) {
            double da = Math.toRadians(a);
            double c = Math.sin(da);
            System.out.println("sin("+ a + ")" + " = " + c + "\n");
        }

        if (sinChoice.equals("b")) {
            double db = Math.toRadians(b);
            double c = Math.sin(db);
            System.out.println("sin("+ b + ")" + " = " + c + "\n");
        }

    }
    public static void cosinus(int a, int b){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String cosChoice = sc.next();
        if (cosChoice.equals("a")) {
            double da = Math.toRadians(a);
            double c = Math.cos(da);
            System.out.println("cos("+ a + ")" + " = " + c + "\n");
        }

        if (cosChoice.equals("b")) {
            double db = Math.toRadians(b);
            double c = Math.cos(db);
            System.out.println("cos("+ b + ")" + " = " + c + "\n");
        }
    }
    public static void tan(int a, int b){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String tanChoice = sc.next();
        if (tanChoice.equals("a")) {
            double da = Math.toRadians(a);
            double c = Math.tan(da);
            System.out.println("tan("+ a + ")" + " = " + c + "\n");
        }

        if (tanChoice.equals("b")) {
            double db = Math.toRadians(b);
            double c = Math.tan(db);
            System.out.println("tan("+ b + ")" + " = " + c + "\n");
        }
    }
    public static void sqrt(int a, int b){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String sqrtChoice = sc.next();
        if (sqrtChoice.equals("a")) {
            double c = Math.sqrt(a);
            System.out.println("sqrt("+ a + ")" + " = " + c + "\n");
        }
        if (sqrtChoice.equals("b")) {
            double c = Math.sqrt(b);
            System.out.println("sqrt("+ b + ")" + " = " + c + "\n");
        }
    }
    public static void power(int a, int b){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String powerChoice = sc.next();
        if (powerChoice.equals("a")) {
            double c = Math.pow(a,b);
            System.out.println( a + "^" + b+" = " + c + "\n");
        }
        if (powerChoice.equals("b")) {
            double c = Math.pow(b,a);
            System.out.println( b+ "^" +a+" = " + c + "\n");
        }
    }
    public static void mod(int a, int b){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String modChoice = sc.next();
        if (modChoice.equals("a")) {

            double c = a % b;
            System.out.println("mod("+a + "," + b+") = " + c + "\n");
        }
        if (modChoice.equals("b")) {
            double c = b % a;
            System.out.println("mod("+b + "," + a+") = " + c + "\n");
        }
    }

}
