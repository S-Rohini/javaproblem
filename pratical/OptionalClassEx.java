import java.util.Optional;

public class OptionalClassEx {
public static void main(String args[]) {
String [] str = new String[4];
str[3] = "anudip";
Optional<String> c = Optional.ofNullable(str[3]);
//if(c.isPresent()) {
//String l = str[3].toUpperCase();
//System.out.println(l);
//}
//else {
//System.out.println("valuse not there");
//}
System.out.println(c.isPresent());
System.out.println(c.orElse("value is not present "));
}
}
 