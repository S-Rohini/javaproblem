class ExceptionExample {
public void show() {
String a = " i am error";
System.out.println(a);

try{
int i = 50/0;
System.out.println(i);

String s = null;
System.out.println(s.length());

String s1 = "rohini";
System.out.println(s1.length());

int arr[] = new int[3];
arr[4] = 24;

int m = Integer.parseInt(s);
System.out.println(m);
}
catch(Exception e){
System.out.println(e);
}
String b = "i cannot handle";
System.out.println(a+b);
}
public static void main(String args[]) {
ExceptionExample ep = new ExceptionExample();
ep.show();
}
}