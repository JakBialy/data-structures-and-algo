package lists.DoubleLinkedList;

public class EmployeeDoubleLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void addToTail(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.println("HEAD ->");
        while (current != null){
            System.out.println(current);
            System.out.println(" <-> ");
            current = current.getNext();
        }
        System.out.println("TAIL");
    }

    public int getSize() {
        return size;
    }

    public EmployeeNode removeFromTheFront(){
        if (isEmpty()){
            return null;
        }
        EmployeeNode removedNode = head;
        if (head.getNext() == null){
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromTheEnd(){
        if (isEmpty()){
            return null;
        }

        EmployeeNode removedNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public boolean isEmpty(){
        return head == null;
    }
}
