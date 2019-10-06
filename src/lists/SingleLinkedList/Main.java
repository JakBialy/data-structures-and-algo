package lists.SingleLinkedList;

public class Main {

    public static void main(String[] args) {
        Integer one = 1;
        Integer two = 10;
        Integer three = 2;
        Integer four = 4;

        IntegerSinglyLinkedList integerSinglyLinkedList = new IntegerSinglyLinkedList();
        integerSinglyLinkedList.insertInSortedOrder(one);
        integerSinglyLinkedList.insertInSortedOrder(two);
        integerSinglyLinkedList.insertInSortedOrder(three);
        integerSinglyLinkedList.insertInSortedOrder(four);

        integerSinglyLinkedList.printList();
        System.out.println(integerSinglyLinkedList.getSize());


    }
}
