

// creating a node

class Node {
    public int value;
    public Node next;
}

// creating a single linked list

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

    // traverse

    static void travserseSingleLinkedList(){
        if(head==null){//------------------>O(1)
            System.out.println("Single Linked List doesnot exist");//------------------>O(1)
        }else{
            Node tempNode=head;//------------------>O(1)
            for(int i=0;i<size;i++){//------------------>O(n)
                System.out.print(tempNode.value);//------------------>O(1)
                if(i!=size-1){//------------------>O(1)
                    System.out.print(" -> ");//------------------>O(1)
                }
                tempNode=tempNode.next;//------------------>O(1)
            }
        }
        System.out.println("\n");//------------------>O(1)
    }

    //search for a node
    static boolean search(int value){//------------------>O(1)
        if(head!=null){//------------------>O(1)
            Node tempNode=head;//------------------>O(1)
            for(int i=0;i<size;i++){//------------------>O(n)
                if(tempNode.value==value){//------------------>O(1)
                    System.out.println("Found "+value+" at location "+i);//------------------>O(1)
                    return true;//------------------>O(1)
                }
                tempNode=tempNode.next;//------------------>O(1)
            }
        }
        System.out.println("Node not found !!");//------------------>O(1)
        return false;//------------------>O(1)
    }

    //delete node
    static void delete(int location){//------------------>O(1)
        if(head==null){//------------------>O(1)
            System.out.println("single linked list does not exist!!");//------------------>O(1)
            return;//------------------>O(1)
        }
        else if(location==0){//------------------>O(1)
            head=head.next;//------------------>O(1)
            size--;//------------------>O(1)
            if(size==0){//------------------>O(1)
                tail=null;//------------------>O(1)
            }
        }
        else if(location>=size){//------------------>O(1)
            Node tempNode=head;//------------------>O(1)
            for(int i=0;i<size-1;i++){//------------------>O(n)
                tempNode=tempNode.next;//------------------>O(1)
            }
            if(tempNode==head){//------------------>O(1)
                tail=head=null;//------------------>O(1)
                size--;//------------------>O(1)
                return;//------------------>O(1)
            }
            tempNode.next=null;//------------------>O(1)
            tail=tempNode;//------------------>O(1)
            size--;//------------------>O(1)
        }
        else{//------------------>O(1)
            Node tempNode=head;//------------------>O(1)
            for(int j=0;j<location-1;j++){//------------------>O(n)
                tempNode=tempNode.next;//------------------>O(1)
            }
            tempNode.next=tempNode.next.next;//------------------>O(1)
            size--;//------------------>O(1)
        }

    }

    // delete entire single linked list
    static void deleteEntirelist(){
        head =null;//------------------>O(1)
        tail=null;//------------------>O(1)
        System.out.println("Single linked list deleted successfully!!");//------------------>O(1)
    }

    // main function

    public static void main(String[] args) {
        // SinglyLinkedList s=new SinglyLinkedList();
        createSingleLinkedList(5);
        // System.out.println(SinglyLinkedList.head.value);
        Insert(6, 1);
        Insert(7, 3);
        Insert(8, 4);
        Insert(9, 0);
        // System.out.println(head.next.next.value);
        travserseSingleLinkedList();
        search(7);
        delete(3);
        travserseSingleLinkedList();
        deleteEntirelist();
        travserseSingleLinkedList();
    }

}