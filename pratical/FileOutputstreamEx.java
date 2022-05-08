import java.io.FileOutputstream;
public class FileOutputstreamEx {
public static void main(String args[]) {
try{
FileOutputstream f = new FileOutputstream("E:\\test.txt");
String s = "Welcome to Anudip Foundation";
byte b[] = s.getBytes();
f.write(b);
f.close();
System.out.println("Done");
}
catch(Exception e) {
System.out.println(e);
}
}
} 