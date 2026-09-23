class MyLinkedList {
      Node head;
      Node tail;
	int n;
    public class Node{
        int val;
        Node next;
        Node prev;
        
        Node(int val){
            this.val = val;
            next=null;
            prev=null;
        }
    }
    public MyLinkedList() {
        head=null;
        tail=null;
        n=0;
    }
    
    public int get(int i) {
        if(i<0 || i>=n || head==null){
        return -1;
        }else{
            Node temp=head;
            for(int k=0;k<i;k++) {
             temp=temp.next;
            }
            return temp.val;
        }
    }
    
    public void addAtHead(int val) {
       Node add = new Node(val);
        if(head == null) {
            head = add;
            tail=add;
        } else {

            add.next = head;
            head.prev=add;
            head = add;

        }
        n++;   
    }
    
    public void addAtTail(int val) {
        Node add=new Node(val);
        if(head==null){
            head=add;
            tail=add;
        }else{
            tail.next=add;
            add.prev=tail;
            tail=add;
        }
        n++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > n) {
            return;
        }
        if(index == 0) {
            addAtHead(val);
        } else if(index == n) {
            addAtTail(val);
        } else {
            Node add = new Node(val);
            Node temp = head;

            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            add.next = temp.next;
            temp.next = add;
            n++;
        } 
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= n || head == null) {
            return;
        } else if(head == tail) { 
            head = null;
            tail = null;
            n--;
        } else if(index == 0) { 
            head = head.next;
            n--;
        } else if(index == n - 1) {
            Node temp = head;
            while(temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            n--;
        } else { 
            Node temp = head;
            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            n--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */