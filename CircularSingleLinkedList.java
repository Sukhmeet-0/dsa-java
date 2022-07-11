class Node{
    public int value;//-------------->O(1)
    public Node next;//-------------->O(1)
}
class createCircularLinkedList{
    static int size;//-------------->O(1)
    static Node head;//-------------->O(1)
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
    void  insert(int nodeValue,int location){
        Node node=new Node();//-------------->O(1)
        node.value=nodeValue;//-------------->O(1)
        if(head==null){//-------------->O(1)
            create(nodeValue);//-------------->O(1)
            return;//-------------->O(1)
        }else if(location==0){//-------------->O(1)
            node.next=head;//-------------->O(1)
            head=node;//-------------->O(1)
            tail.next=head;//-------------->O(1)
        }else if(location>=size){//-------------->O(1)
            tail.next=node;//-------------->O(1)
            tail=node;//-------------->O(1)
            tail.next=head;//-------------->O(1)
        }else{//-------------->O(1)
            Node tempNode=head;//-------------->O(1)
            int index=0;//-------------->O(1)
            while(index<location-1){//-------------->O(n)
                tempNode=tempNode.next;//-------------->O(1)
                index++;//-------------->O(1)
            }
            node.next=tempNode.next;//-------------->O(1)
            tempNode.next=node;//-------------->O(1)
        }
        size++;//-------------->O(1)
    }
    void traverse(){
        if(head==null){//-------------->O(1)
            System.out.println("Circular Single Linked List doesnot exit !!");//-------------->O(1)
        }else{
            Node tempNode=head;//-------------->O(1)
            for(int i=0;i<size;i++){//-------------->O(n)
                System.out.print(tempNode.value);//-------------->O(1)
                if(i!=size-1){//-------------->O(1)
                    System.out.print(" -> ");//-------------->O(1)
                }
                tempNode=tempNode.next;//-------------->O(1)
            }
        }
        System.out.println("\n");//-------------->O(1)
    }
    boolean search(int value ){
        if(head!=null){//-------------->O(1)
            Node tempNode=head;//-------------->O(1)
            for(int i=0;i<size;i++){//-------------->O(n)
                if(tempNode.value==value){//-------------->O(1)
                    System.out.println("value "+value+" found at location "+i);//-------------->O(1)
                    return true;//-------------->O(1)
                }
                tempNode=tempNode.next;//-------------->O(1)
            }
        }
        System.out.println("Value not Found !!");//-------------->O(1)
        return false;//-------------->O(1)
    }
    void delete(int location){
        if(head==null){//-------------->O(1)
            System.out.println("Circular single linked list does not exist !!");//-------------->O(1)
            return;//-------------->O(1)
        }else if(location==0){//-------------->O(1)
            head=head.next;//-------------->O(1)
            tail.next=head;//-------------->O(1)
            size--;//-------------->O(1)
            if(size==0){//-------------->O(1)
                tail=null;//-------------->O(1)
                head.next=null;//-------------->O(1)
                head=null;//-------------->O(1)
            }
        }else if(location>=size){//-------------->O(1)
            Node tempNode=head;//-------------->O(1)
            for(int i=0;i<size-1;i++){//-------------->O(n)
                tempNode=tempNode.next;//-------------->O(1)

            }
            if(tempNode==head){//-------------->O(1)
                head.next=null;//-------------->O(1)
                tail=head = null;//-------------->O(1)
                size--;//-------------->O(1)
                return;//-------------->O(1)
            }
            tempNode.next=head;//-------------->O(1)
            tail=tempNode;//-------------->O(1)
            size--;//-------------->O(1)
        }else{
            Node tempNode=head;//-------------->O(1)
            for(int j=0;j<location-1;j++){//-------------->O(n)
                tempNode=tempNode.next;//-------------->O(1)

            }
            tempNode.next=tempNode.next.next;//-------------->O(1)
            size--;//-------------->O(1)
        }
    }
    void deleteEntire(){
        if(head==null){
            System.out.println("Circular single linked list doesnot exist !!");
        }else{
            head=null;
            tail.next=null;
            tail=null;
            System.out.println("Circular single linked list has been deleted !!");
        }
    }
}
public class CircularSingleLinkedList {
    public static void main(String[] args) {
        createCircularLinkedList cll=new createCircularLinkedList();
        // cll.create(5);
        // System.out.println(cll.head.value);
        // System.out.println(cll.head.next.value);
        cll.insert(0, 0);
        cll.insert(1, 1);
        cll.insert(2, 2);
        cll.traverse();
        cll.search(1);
        cll.delete(1);
        cll.traverse();
        cll.deleteEntire();
        cll.traverse();
    }
    
}