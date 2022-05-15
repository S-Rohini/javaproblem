import java.util.Scanner;
class AlternatePrimeNumberEx {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");

int num = sc.nextInt();
System.out.println("The alternate Prime numbers "+num+"are:");
int n = 2;
for(int i=2;i<=num;i++){
if(isprime(i))
{
if(n%2==0)
System.out.println(i+" ");
n++;
}
}
}
static boolean isprime(int num){
int n=2;
boolean flage = true;
while(num>n){
if(num % n==0)
{
flage = false;
break;
}
n++;
}
return flage;
}
}
