public class PriorityQueue
{
	Node head;
	
	
	public void enqueue(int data, String job){
		Node newNode = new Node();
		Node temp = head;
		newNode.data = data;
		newNode.job  = job;
		newNode.next = null;
		
		if(head == null)
		{
			head = newNode;
		}
		
		else if (newNode.data > head.data)
		{
			if (temp.next == null)
			{
				head.next = newNode;
				//System.out.println(newNode.data);
			}
			else
			{
				Node temp4 = temp;
				int counter = 0;
				while (temp4.data < newNode.data && temp4.next != null){
					if (temp4.next != null){
					temp4 = temp4.next;
					counter++;
					}
					System.out.println(newNode.data);
				}
				
				for (int i =0; i != counter-1; i++)
				{
					temp = temp.next;
				}
				
				if (temp.next != null){
					Node temp2 = temp.next;
					temp.next = newNode;
					temp = temp.next;
					temp.next = temp2;
					//System.out.println(newNode.data);
				}
				
				else {
					//System.out.println(newNode.data);
					temp.next = newNode;
				}
			}
		}
		else {
		    //System.out.println("did it");
			Node temp3 = head;
			head = newNode;
			head.next = temp3;
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