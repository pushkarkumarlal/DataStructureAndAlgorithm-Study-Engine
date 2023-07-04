// Create a singly Linked List and Perform its common Operation
// 1- AddData
// 2- Display Data


class singlyLinkedList{
    
    class node{
        int data;
        node next;
        
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public node head=null;
    public node tail=null;
    
    public void addNode(int data){
        node newNode=new node(data);
        
        if(head==null){
            head=newNode;
            tail=newNode;
            
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        
        
    }
    
    public void display(){
        
        node current=head;
        
        if(head==null){
        System.out.println("The linkedlist is empty");
            return;
        }
        else{
            while(current!=null){
                System.out.println(current.data +" ");
                current=current.next;
            }
        }
    }
}

class Main{
    public static void main(String[] args){
        // java code for singly linked list
        
        singlyLinkedList LinkedList=new singlyLinkedList();
        
        LinkedList.addNode(6);
        LinkedList.addNode(7);
        LinkedList.addNode(9);
        LinkedList.addNode(6);
        
        LinkedList.display();
        
    }
}
