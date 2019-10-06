package lists.SingleLinkedList;

public class IntegerSinglyLinkedList {
    private IntegerNode head;
    private int size;

    public void addToFront(Integer integer) {
        IntegerNode node = new IntegerNode(integer);
        node.setNext(head);
        head = node;
        size++;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.println("HEAD ->");
        while (current != null){
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public IntegerNode removeFromTheFront() {
        if (isEmpty()){
            return null;
        }
        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertInSortedOrder(Integer toAddInOrder) {
        // list is already sorted, otherwise there should be sorting in the beginning of this method

        if (isEmpty() || head.getInteger() >= toAddInOrder){
            addToFront(toAddInOrder);
        }

        IntegerNode current = head;
        IntegerNode lastNode = head;

        while (current != null && current.getInteger() <= toAddInOrder){
            lastNode = current;
            current = current.getNext();
        }

        IntegerNode integerNode = new IntegerNode(toAddInOrder);

        lastNode.setNext(integerNode);
        integerNode.setNext(current);
        size++;
    }

    public boolean isEmpty(){
        return head == null;
    }
}
