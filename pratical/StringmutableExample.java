class StringmutableExample{
public static void main(String args[]){

StringBuffer s = new StringBuffer("hello");
s.append(" how ");
System.out.println("String is:" +s);
s.insert(2, "are");
System.out.println("Insert is:" +s);
s.replace(1,2,"you");
System.out.println("replace is:" +s);
s.delete(1,2);
System.out.println("delete is:" +s);
s.reverse();
System.out.println("Reverse is:" +s);
}
}
 