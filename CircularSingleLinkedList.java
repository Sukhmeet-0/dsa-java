class Node{
    public int value;//-------------->O(1)
    public Node next;//-------------->O(1)
}
class createCircularLinkedList{
    int size;//-------------->O(1)
    Node head;//-------------->O(1)
    Node tail;//-------------->O(1)
    Node create(int nodeValue){
        head=new Node();//-------------->O(1)
        Node node=new Node();//-------------->O(1)
        node.next=node;//-------------->O(1)
        node.value=nodeValue;//-------------->O(1)
        head=node;//-------------->O(1)
        tail=node;//-------------->O(1)
        size=1;//-------------->O(1)
        return head;//-------------->O(1)
    }
}
public class CircularSingleLinkedList {
    public static void main(String[] args) {
        createCircularLinkedList cll=new createCircularLinkedList();
        cll.create(0);
        System.out.println(cll.head.value);
        System.out.println(cll.head.next.value);
    }
    
}