public class CreateList {  
    
    public class Node
    {  
        int data;  
        Node next;  
         
    }  
   
    public Node head = null;  
    public Node tail = null; 
  
   
    public void add(int data)
    {  
         
        Node node = new Node();
        node.data=data;
        
        if(head == null) 
        {   
            head = node;  
            tail = node;  
            node.next = head;  
        }  
        else {  
            
            tail.next = node;  
            
            tail = node;  
            
            tail.next = head;  
        }  
    }  
  
    public void display() 
    {  
        Node current = head;  
        if(head == null)   
            System.out.println("List is empty");  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
            do
            {  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
    
    
    public static void main(String[] args) {  
        CreateList cl = new CreateList();  
        
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4);  
        
        cl.display(); 
        
    }  
}
