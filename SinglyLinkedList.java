public class SinglyLinkedList{
    public static Node head;
    public static Node tail;
    public static int size;

    public static Node createSingleLinkedList(int valueNode){
        head=new Node();//---------------------->O(1)
        Node node=new Node();//---------------------->O(1)
        node.next=null;//---------------------->O(1)
        node.value=valueNode;//---------------------->O(1)
        head=node;//---------------------->O(1)
        tail=node;//---------------------->O(1)
        size=1;//---------------------->O(1)
        return head;//---------------------->O(1)
    }

    static void Insert(int nodeValue,int location){
        Node node=new Node();//---------------------->O(1)
        node.value=nodeValue;//---------------------->O(1)
        if(head==null){//---------------------->O(1)
            createSingleLinkedList(nodeValue);//---------------------->O(1)
            return;//---------------------->O(1)
        }else if(location==0){//---------------------->O(1)
            node.next=head;//---------------------->O(1)
            head=node;//---------------------->O(1)
        }else if(location>=size){//---------------------->O(1)
            node.next=null;//---------------------->O(1)
            tail.next=node;//---------------------->O(1)
            tail=node;//---------------------->O(1)
        }else{
            Node tempNode=new Node();//---------------------->O(1)
            int index=0;//---------------------->O(1)
            while(index<location-1){//---------------------->O(1)
                tempNode=tempNode.next;//---------------------->O(1)
                index++;//---------------------->O(1)
            }
            Node nextNode=tempNode.next;//---------------------->O(1)
            tempNode.next=node;//---------------------->O(1)
            node.next=nextNode;//---------------------->O(1)
        }
        size++;//---------------------->O(1)
    }
}