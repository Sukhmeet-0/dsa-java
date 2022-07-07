public class Main {
    public static void main(String[] args) {
        // SinglyLinkedList s=new SinglyLinkedList();
        SinglyLinkedList.createSingleLinkedList(5);
        System.out.println(SinglyLinkedList.head.value);
        SinglyLinkedList.Insert(6, 1);
        SinglyLinkedList.Insert(7, 3);
        System.out.println(SinglyLinkedList.head.next.next.value);
    }
}
