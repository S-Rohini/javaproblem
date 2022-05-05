public class ThreadExample1 implements Runnable {
public void run(){
System.out.println(" I am Thread  .... thread is independ");
}
public static void main(String args[]){
ThreadExample1 t = new ThreadExample1();
Thread th = new Thread(t);
th.start();
}
}
