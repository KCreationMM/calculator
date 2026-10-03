

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public int div(int a, int b) {
        if(b==0){
            System.out.println("pas de division par 0");
        }
        return a/b;
    }

}
