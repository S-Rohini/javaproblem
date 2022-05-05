public class LogicalOperEx 
{
public static void main(String[] args)
{
//AND Operator
int a = 10, b = 20, c = 20, d = 0;
System.out.println("Var1 = " + a);
System.out.println("Var2 = " + b);
System.out.println("Var3 = " + c);

if ((a < b) && (b == c)) {
d = a + b + c;
System.out.println("The sum is: " + d);
}
else
System.out.println("False conditions");
//OR Operator
int e = 10, f = 1, g = 10, h = 30;
System.out.println("Var1 = " + e);
System.out.println("Var2 = " + f);
System.out.println("Var3 = " + g);
System.out.println("Var4 = " + h);
  
if (e > f || g == h)
System.out.println("One or both :"+" the conditions are true");
else
System.out.println("Both the"+ " conditions are false");
//NOT Operator
int l = 10, m = 1;
System.out.println("Var1 = " + l);
System.out.println("Var2 = " + m);
 // Using logical NOT operator
System.out.println("!(l < m) = " + !(l < m));
System.out.println("!(l > m) = " + !(l > m));
}
}
