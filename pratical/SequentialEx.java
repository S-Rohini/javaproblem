public class SequentialEx {
public void run() {
for(int i=1; i<=5; i++) {
try{
Thread.sleep(100);
}catch(InterruptedException e){
System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String args[]){
SequentialEx t1 = new SequentialEx();
SequentialEx t2 = new SequentialEx();
SequentialEx t3 = new SequentialEx();

t1.run();
t2.run();
t3.run();
}
}
