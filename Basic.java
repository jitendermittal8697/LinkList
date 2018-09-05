class practiceLL
{
    node head;
    static class node{
        int data;
        node next;
        node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    void LLtraversal()
    {
        node headLL = head;
        if(headLL==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            while(headLL!=null)
            {
                System.out.print(headLL.data+"->");
                headLL = headLL.next;
            }
        }
    }
    
    void InsertBeg(int data)
    {
        node new_head = new node(data);
        new_head.next = head;
        head = new_head;
    }
    
    void InsertEnd(int data)
    {
        node end_node = new node(data);
        node ptrnode = head;
        while(ptrnode.next!=null)
        {
            ptrnode=ptrnode.next;
        }
        ptrnode.next = end_node;
    }
    
    void DeleteNode(int data)
    {
        node ptr1 = head;
        node ptr2 = head;
        if(ptr1.data==data)
        {
            head=ptr1.next;
        }
        while(ptr1.data != data)
        {
            ptr2 = ptr1;
            ptr1 = ptr1.next;
        }
        ptr2.next = ptr1.next;
    }
    
    void InsertAfter(int data,int key)
    {
        node new_node = new node(data);
        node ptr1 = head;
        while(ptr1 != null && ptr1.data != key)
        {
            ptr1 = ptr1.next;
        }
        if(ptr1 == null)
        {
            System.out.println("Key Not Found");
        }
        else
        {
            node ptr2 = ptr1.next;
            ptr1.next = new_node;
            new_node.next = ptr2;
        }
    }
     
    void InsertBefore(int data,int key)
    {
        node new_node = new node(data);
        node ptr1 = head;
        node ptr2 = head;
        while(ptr1.data != key && ptr1 != null)
        {
            ptr2 = ptr1;
            ptr1 = ptr1.next;
        }
        ptr2.next = new_node;
        new_node.next = ptr1;
    }
    public static void main(String args[])
    {
        practiceLL obj = new practiceLL();
        obj.head = new practiceLL.node(0);
        practiceLL.node node1 = new practiceLL.node(1);
        practiceLL.node node2 = new practiceLL.node(2);
        practiceLL.node node3 = new practiceLL.node(3);
        practiceLL.node node4 = new practiceLL.node(4);
        obj.head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        obj.LLtraversal();
        System.out.println("\n");
        obj.InsertBeg(-1);
        obj.LLtraversal();
        System.out.println("\n");
        obj.InsertEnd(5);
        obj.LLtraversal();
        System.out.println("\n");
        obj.DeleteNode(5);
        obj.DeleteNode(-1);
        obj.LLtraversal();
        System.out.println("\n");
        obj.InsertAfter(5,4);
        obj.InsertAfter(6,5);
        obj.InsertAfter(3,3);
        obj.LLtraversal();
        System.out.println("\n");
        obj.InsertAfter(5,7);
        obj.LLtraversal();
        System.out.println("\n");
        obj.InsertBefore(4,4);
        obj.InsertBefore(5,5);
        obj.InsertBefore(3,3);
        obj.LLtraversal();
        
        
    }
}
