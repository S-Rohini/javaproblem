classs Producer extends Thread{
Data d;
public Consumer(Data d) {
this.d = d;
}
public void run() {
for(int k = 1;k <= 5;k++) {
d.produce(k);
}
}
}

public class ThreadCommExample {
public static void main(String args[]) {
Data d = new Dta();
Producer p = new Producer(d);
Consumer c = new Consumer(c);
p.start();
c.start();
}
}