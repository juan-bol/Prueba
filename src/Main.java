// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int factorialIteratico(int n) {
        int result = 1;
        for (int i = 2; i <=n ; i++) {
            result = result*i;
        }
        return result;
    }

    public static int factorial(int n){
        if(n==0){ // caso base
            return 1;
        } else {// caso recursivo
            return n*factorial(n-1);
        }
    }

    // 1 1 2 3 5 8 13 ...
    public static int fibonacci(int n){
        if (n==1) {
            return 1;
        } else if(n==2){
            return 1;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }


    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int n = 8;
        for (int i = 1; i < n; i++) {
            System.out.println("fibonacci de la posicion "+i);
            System.out.println(fibonacci(i));
        }


    }
}