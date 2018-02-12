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
		
		else if (newNode.data >= head.data)
		{
			if (temp.next == null)
			{
				head.next = newNode;
				//System.out.println(newNode.data);
			}
			else
			{
				while (temp.data < newNode.data && temp.next != null){
					if (temp.next != null){
					temp = temp.next;
					}
					//System.out.println(newNode.data);
				}
				
				if (temp.next == null){
					temp.next = newNode;
					//System.out.println(newNode.data);
				}
				
				else {
					//System.out.println(newNode.data);
					Node temp2 = temp.next;
					temp.next = newNode;
					temp = temp.next;
					temp.next = temp2;
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