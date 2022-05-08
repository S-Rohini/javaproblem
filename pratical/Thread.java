public class Sample {
void print(int num) {
for (int i=1; i<=5; i++){
System.out.println(num*i);
try {
Thread.sleep(400);
}
catch(Exception e) {
System.out.println(e);
}
}

class Thread1 extends Thread {
Sample t;
public Thread1(Sample t){
this.t = t;
}
public void run() {
t.print(3);
}
}
class Thread2 extends Thread{
Sample t1;
public Thread2(Sample t1){
this.t1 = t1;
}
public void run();
t1.println(5);
}

}
}
