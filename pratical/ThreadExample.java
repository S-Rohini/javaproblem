class ThreadExample extends Thread{
public void run() {
for(int i=0; i<=5; i++){
try{
Thread.sleep(200);
} catch(InterruptedException e) {
System.out.println(e);
}
System.out.println(i);
}
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[]) {
ThreadExample t = new ThreadExample();
ThreadExample t1= new ThreadExample();
ThreadExample t2= new ThreadExample();

t.start();
t1.start();
t2.start();
}
}
