
public class Runner {
	
	public static void main(String[] args){
	
	PriorityQueue queue = new PriorityQueue();
	
	queue.enqueue(0 , "job1");
	queue.enqueue(1 , "job1");
	queue.dequeue();
	queue.enqueue(2, "job1");
	queue.enqueue(3 , "job1");
	queue.enqueue(4 , "job1");
	queue.enqueue(3 , "job2");
	queue.dequeue();

	queue.print();
 }
 
}