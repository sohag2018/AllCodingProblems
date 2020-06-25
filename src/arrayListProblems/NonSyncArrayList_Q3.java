package arrayListProblems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class A implements Runnable{	
	List<Integer> numList;
	public A(List<Integer> numList) {
		this.numList=numList;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			numList.add(i);  //it will add 10 elements by one Thread
			System.out.println(Thread.currentThread());
			try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
}



public class NonSyncArrayList_Q3 {

	public static void main(String[] args) {
		List<Integer> numList=Collections.synchronizedList(new ArrayList<Integer>()); //Using synchronizedList() fron Collections class 
		
		Thread t1=new Thread(new A(numList));
		Thread t2=new Thread(new A(numList));
		Thread t3=new Thread(new A(numList));
		
		t1.start();
		t1.setName("Monir");
		t2.start();
		t1.setName("Sohag");
		t3.start();
		t1.setName("Tofayel");
		try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {    
            
        }
		
		System.out.println(numList.size()); //We expect 30 but.....? Let's see the console
		

	}

}
