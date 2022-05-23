public interface FinctionalInterfaceeg {
int add(int a, int b);
}


public class LambdaExpressionEg{
public static void main(String args[]) {

FunctionalInterface d = new (a,b)->{
//System.out.println(a+b);
return (a+b);
//System.out.println("I am functional interface implement by lambda expression.");
};
System.out.println(d.add(40,40));
//d.add();
}
}


