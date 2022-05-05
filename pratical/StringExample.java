class StringExample{
public static void main(String args[]){
String a,b;
a="Hello";
b="World";
System.out.println(a.compareTo(b)>0) ? "Yes":"No";
System.out.println(a.length() + b.length());
System.out.println(a.substring(0,1).toUpperCase()+ a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));
}

}


