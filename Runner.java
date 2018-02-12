
public class Runner {
	
	public static void main(String[] args){
	
	PriorityQueue queue = new PriorityQueue();
	
	queue.enqueue(4 , "job1");
	queue.enqueue(4 , "job10");
	queue.enqueue(4 , "job11");
	queue.enqueue(3 , "job4");
	queue.enqueue(6 , "job3");
	queue.enqueue(4 , "job11");
	queue.enqueue(3 , "job2");
	//queue.enqueue(5 , "job5");
	//queue.enqueue(7 , "job6");
	//queue.enqueue(9 , "job8");
	//queue.enqueue(5 , "job9");
	//queue.enqueue(8 , "job8");
	//queue.enqueue(10, "job12");
	queue.print();
 }
 
}