class DoublyNode{
    public int value;//--------------->O(1)
    public DoublyNode next;//--------------->O(1)
    public DoublyNode back;//--------------->O(1)
}
class Dll{
    DoublyNode head;//--------------->O(1)
    DoublyNode tail;//--------------->O(1)
    int size;//--------------->O(1)
    DoublyNode create(int nodeValue){
        head=new DoublyNode();//--------------->O(1)
        DoublyNode newNode=new DoublyNode();//--------------->O(1)
        newNode.value=nodeValue;//--------------->O(1)
        newNode.next=null;//--------------->O(1)
        newNode.back=null;//--------------->O(1)
        head=newNode;//--------------->O(1)
        tail=newNode;//--------------->O(1)
        size=1;//--------------->O(1)
        return head;//--------------->O(1)
    }
}
public class DoubleLinkedList{
    public static void main(String[] args) {
        Dll d=new Dll();
        d.create(7);
        System.out.println(d.head.value);
    }
}