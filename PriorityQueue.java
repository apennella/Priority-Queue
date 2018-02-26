public class PriorityQueue
{
	Node head;
	
	
	public void enqueue(int data, String job){
		Node newNode = new Node();
		Node temp = head;
		newNode.data = data;
		newNode.job  = job;
		newNode.next = null;
		
		// set the head node if it is not already set
		if(head == null)
		{
			head = newNode;
		}
		
		// set of statements to organize and set nodes other than the head node
		else if (newNode.data > head.data)
		{
			// if the node after head is null sets head.next node to the new node
			if (temp.next == null)
			{
				head.next = newNode;
			}
			// if head.next isn't null then checks for certain conditions to find where it goes in the queue
			else
			{
				Node temp4 = temp;
				int counter = 0;
				
				/* initiates the counter variable for the next loop. It navigates to where the node needs to go*/
				while (temp4.data < newNode.data && temp4.next != null){
					if (temp4.next != null){
					temp4 = temp4.next;
					counter++;
					}
				}
				/* moves temp to the correct position*/
				for (int i =0; i != counter-1; i++)
				{
					temp = temp.next;
				}
				/* Used for setting a node that is not at the end of the queue*/
				if (temp.next != null){
					Node temp2 = temp.next;
					temp.next = newNode;
					temp = temp.next;
					temp.next = temp2;
					
				}
				// Sets the last node if that is where the node goes
				else {
					
					temp.next = newNode;
				}
			}
		}
		/* appends to the end of the list*/
		else {
			Node temp3 = head;
			head = newNode;
			head.next = temp3;
		}
		// checks the list to make sure its sorted and if it is not sorts it
		sort(head);
	}
	public void dequeue() {
		head = head.next;
	}
	
	public void sort(Node head){
		
		Node temp = head;
		Node check = temp.next;
		
		
		while (temp.next != null){
			
			if (temp.data > check.data){
				String job = check.job;
				int data = check.data;
				check.data = temp.data;
				check.job = temp.job;
				temp.data = data;
				temp.job = job;
			}
			temp = temp.next;
			if (check.next != null){
				
			check = check.next;
			}
		}

	}
	public void print()
	{
		Node temp = head;
		while (temp != null){
			System.out.println(temp.data + " " + temp.job);
			temp = temp.next;
		}
		
	}	
}