package lists.DoubleLinkedList;

public class Main {

    public static void main(String[] args) {
        Employee one = new Employee("Jane", "Doe", 123);
        Employee two = new Employee("Mary", "Doe", 124);
        Employee three = new Employee("John", "Doe", 125);

        EmployeeDoubleLinkedList employeeLinkedList = new EmployeeDoubleLinkedList();

        employeeLinkedList.addToTail(one);
        employeeLinkedList.addToTail(two);
        employeeLinkedList.addToTail(three);
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.removeFromTheEnd();
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.printList();

    }
}
