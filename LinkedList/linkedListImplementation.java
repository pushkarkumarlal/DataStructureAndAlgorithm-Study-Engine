
public class Main
{   
    
private Node head;
private Node current;
private Node previous;

    
    public class Node{
        int data;
        Node next;
   
    }
    
    public void add(int data){
        
        if(head==null){
            head=new Node();
            head.data=data;
            head.next=null;
            current=head;
        }else{
            
            current.next=new Node();
            current=current.next;
            current.data=data;
            current.next=null;
        }
    }
    
    public void display(){
        Node temp=head;
        
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.print("Message");
    }
    
    public void deleteTopFIFO(){
        
       if(head==null){
           System.out.println("Nothitng to Delete");
           return;
       }
       
      head=head.next;
       
    }
    
    
    public void deleteLastElementLIFO(){
        
        
            if (head == null) {
        return; // Nothing to delete from an empty list
    }

    if (head.next == null) {
        head = null; // Only one node in the list, make the list empty
        return;
    }
    
    
    
    Node prev = null;
    Node temp = head;
    
    while(temp.next!=null){
        prev=temp;
        temp=temp.next;
    }
    
    current=prev;
    prev.next=null;

    }
   
    
    
	public static void main(String[] args) {
	
		
		Main list=new Main();
		
		list.add(5);
		list.add(6);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(66);
		
		//queue
		list.display();
		list.deleteTopFIFO();
		
		list.display();
				
		//		
		list.deleteLastElementLIFO();
		list.display();
		
		
		//stack
		list.deleteLastElementLIFO();
		list.display();
		
		
				list.deleteLastElementLIFO();
		list.display();

		

	}
}
