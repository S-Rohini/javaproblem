import java.util.Scanner;
class NestedExceptionEx {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number:");
try{
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println(x/y);
}
catch(Exception e)
{
System.out.println(e);
}
}
}