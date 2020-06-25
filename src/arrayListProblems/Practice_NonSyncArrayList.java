package arrayListProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class C implements Runnable{
	List<Integer> numList;
	public C(List<Integer> numList) {
		this.numList=numList;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			numList.add(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}



public class Practice_NonSyncArrayList {

	public static void main(String[] args) throws Throwable {
		//creating empty ArrayList
		//List<Integer> numList=Collections.synchronizedList(new ArrayList<Integer>());
		List<Integer> numList=new ArrayList<Integer>();
		
		//Creating obj of C class by passing ArrayList obj
		C a1 =new C(numList);
		C a2 =new C(numList);
		C a3 =new C(numList);
		
		//Creating obj of Thread
		
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a2);
		Thread t3=new Thread(a3);
		
		//Start the thread 
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		//print the size of the arrayList
		System.out.println(numList.size());//we expect 30
		System.out.println(numList);//we expect 30

	}

}
