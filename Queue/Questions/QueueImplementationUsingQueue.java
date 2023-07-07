
     //if we implement Queue using an array, we have to shift the Elements to one place down when We need to Dequeue
     //Queue using Linked List is the More Efficient
    //First we will implement queue using Array then We will Move Forward with Linked List

// Question- Queue Implementation Using Array

import java.util.Scanner;
class Queue{
    private int rear;
    private int front;
    
    private int MaxSize;
    
    private int[] queueArray;
    
    
    //queue constructor
    public Queue(int maxSize){
        
       queueArray=new int[maxSize];
       rear=-1;
       front=-1;
       this.MaxSize=maxSize;
    }
    
    public void inqueue(int data){
        front=0;
        
        
        if(rear+1==MaxSize){
            System.out.println("Queue is Full"+data);
        }else{
            rear=(rear+1)% MaxSize;
            queueArray[rear]=data;
        }
        
    }
    
    // we will only DeQueue From the First Index
    //and shift all the elements one place Down

    public void dequeue(){
        if(front==-1){
            System.out.println("Queque is Empty !");
        }else{
            System.out.println("The Element Dequed is "+ queueArray[front]);
            //As we can see in this code we have to shif the elements
                for(int i=0;i<rear;i++){
                    queueArray[i]=queueArray[i+1];
                    queueArray[i+1]=0;
                }
            rear=(rear-1)%MaxSize;
        }
    }
    
    public void DisplayElementInQueue(){
        if(rear==-1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.print("[");
            for(int i=front;i<=rear;i++)
            System.out.print(queueArray[i]+",");
            System.out.print("]");
        }
    }
}

public class Main{
    public static void main(String[] TestArguments){
        
        Scanner input=new Scanner(System.in);
        int QueueSize;
        System.out.println("Enter The Size of the Queue");
        int MaxSize=input.nextInt();
        
        
        Queue Obj1=new Queue(MaxSize);
        
        
        //Obj1.inqueue(4);
        Obj1.inqueue(3);
        Obj1.inqueue(7);
        Obj1.inqueue(9);
        Obj1.inqueue(10);
        Obj1.dequeue();
        Obj1.dequeue();
        Obj1.dequeue();
        Obj1.inqueue(11);
        Obj1.dequeue();
        
        
      Obj1.DisplayElementInQueue();
      //DisplayElementInQueue();
       
        
    }
}
