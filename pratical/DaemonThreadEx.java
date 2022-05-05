class DaemonThreadEx extends Thread {
public void run() {
if(Thread.currentThread().isDaemon()) {

System.out.println(getName() +"isDaemon thread");
} else
System.out.println(getName() +"isUser thread");
}
public static void main(String args[]) {
DaemonThreadEx t= new DaemonThreadEx();
DaemonThreadEx t1= new DaemonThreadEx();


t.start();
t1.start();
}
}

