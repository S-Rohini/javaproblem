class ThreadJoin extends Thread {
public void run() {
for (int i=0; i<=4; i++){
try {
Thread.sleep(400);
}catch(Exception e){
System.out.println(e);
}
System.out.println(i);
}
}

public static void main(String args[]){
ThreadJoin t = new ThreadJoin();
ThreadJoin t1 = new ThreadJoin();
ThreadJoin t2 = new ThreadJoin();
t.start();
try{
t.join();
}catch(Exception e)
{
System.out.println(e);
}
t1.start();
try{
t1.join();
}catch(Exception e)
{
System.out.println(e);
}
t2.start();
}
}
