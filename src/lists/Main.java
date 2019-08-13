package lists;

public class Main {

    public static void main(String[] args) {
        Employee one = new Employee("Jane", "Doe", 123);
        Employee two = new Employee("Mary", "Doe", 124);
        Employee three = new Employee("John", "Doe", 125);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employeeLinkedList.addToFront(one);
        employeeLinkedList.addToFront(two);
        employeeLinkedList.addToFront(three);

        employeeLinkedList.printList();
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.addToFront(one);
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.removeFromTheFront();
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.printList();
    }
}
