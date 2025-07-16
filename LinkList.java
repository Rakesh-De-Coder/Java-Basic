public class LinkList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public void add(int index, int data) {

        if (index == 0) {
            addFirst(data);
            return;

        }
        int i = 0;
        Node newNode = new Node(data);

        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;

    }
    public int removeLast(){
        if(head==null){
            return Integer.MAX_VALUE;

        }
        else if(head.next==null){
            int val= head.data;
            head=tail=null;
            return val;

        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        return val;

    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();

        ll.addFirst(2);
        ll.printLL();
        // System.out.println("code complete");
        ll.addLast(3);
        ll.printLL();
        ll.addLast(9);
        ll.printLL();
        ll.addLast(19);
        ll.printLL();
        System.out.println(ll.removeLast());
        ll.printLL();


    }

}
