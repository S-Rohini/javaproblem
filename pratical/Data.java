public class Data {
int i;
boolean valueset = false;

synchronized void produce(int i) {
if(valueset)
try{
wait();

}
catch(Exception e){
System.out.println(e);
}
this.i = i;
valueset = true;
System.out.println("Data production done" +i);
notify();
}
synchronized int consume() {
return i;
}
}