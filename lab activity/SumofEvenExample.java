import java.util.Scanner;

class SumofEvenExample {
public static void main(String args[]){

int num, i, sum=0;
Scanner s = new Scanner(System.in);

System.out.println("Enter the num:");
num=s.nextInt();

for(i=0;i<num;i++)
{
if(i%2==0)
{
sum=sum+i;
}
}
System.out.println("The Sum of Even Number" +num+" = " +sum);
}
}