
public class SinglyLinkedList {

    private static ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data=data;
            this.next=null;

        }
    }

    public void display(SinglyLinkedList.ListNode head2) {
        ListNode current = head;
        while(current!=null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current!=null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int position, int value){
        ListNode node = new ListNode(value);
        if (position == 1){
            node.next = head;
            head = node;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null; //breaks the chain
        return current;
    }

    public void delete(int position){
        //position is valid and is starting from 1
        if(position == 1){
            head = head.next;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public boolean find(ListNode head, int searchKey){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        return previous;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll= new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second; // 10-->1
        second.next = third; // 10-->1-->8
        third.next = fourth; // 10-->1-->8-->11-->null

        //sll.insert(3,5);
        //sll.display();

        //sll.insertFirst(11);
        //sll.insertFirst(2);

        //sll.insertLast(56);

       // sll.display();

        //System.out.println("The length of the Singly Linked List is: " + sll.length());
        //System.out.println(sll.deleteFirst().data);
        //System.out.println(sll.deleteFirst().data);
        //sll.display();
        //System.out.println(sll.deleteLast().data);
        //sll.display();
        //sll.delete(2);
        //sll.display();

        SinglyLinkedList singlylinkedlist = new SinglyLinkedList();
        singlylinkedlist.display(head);

        ListNode reverseListHead = singlylinkedlist.reverse(head);
        singlylinkedlist.display(reverseListHead);


    }
}



