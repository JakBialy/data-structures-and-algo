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
        employeeLinkedList.printList();

        Employee toAdd = new Employee("NewOne", "Hoe", 126);

        employeeLinkedList.addBefore(toAdd, one);
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.printList();

    }
}
