import javax.xml.transform.Source;

class DoublyNode {
    public int value;// --------------->O(1)
    public DoublyNode next;// --------------->O(1)
    public DoublyNode back;// --------------->O(1)
}

class Dll {
    DoublyNode head;// --------------->O(1)
    DoublyNode tail;// --------------->O(1)
    int size;// --------------->O(1)

    DoublyNode create(int nodeValue) {
        head = new DoublyNode();// --------------->O(1)
        DoublyNode newNode = new DoublyNode();// --------------->O(1)
        newNode.value = nodeValue;// --------------->O(1)
        newNode.next = null;// --------------->O(1)
        newNode.back = null;// --------------->O(1)
        head = newNode;// --------------->O(1)
        tail = newNode;// --------------->O(1)
        size = 1;// --------------->O(1)
        return head;// --------------->O(1)
    }

    void insert(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();// ------------>O(1)
        newNode.value = nodeValue;// ------------>O(1)
        if (head == null) {// ------------>O(1)
            create(7);// ------------>O(1)
            return;// ------------>O(1)
        } else if (location == 0) {// ------------>O(1)
            newNode.next = head;// ------------>O(1)
            newNode.back = null;// ------------>O(1)
            head.back = newNode;// ------------>O(1)
            head = newNode;// ------------>O(1)
        } else if (location >= size) {// ------------>O(1)
            newNode.next = null;// ------------>O(1)
            tail.next = newNode;// ------------>O(1)
            newNode.back = tail;// ------------>O(1)
            tail = newNode;// ------------>O(1)
        } else {
            DoublyNode tempNode = head;// ------------>O(1)
            int index = 0;// ------------>O(1)
            while (index < location - 1) {// ------------>O(n)
                tempNode = tempNode.next;// ------------>O(1)
                index++;// ------------>O(1)
            }
            newNode.back = tempNode;// ------------>O(1)
            newNode.next = tempNode.next;// ------------>O(1)
            tempNode.next = newNode;// ------------>O(1)
            newNode.next.back = newNode;// ------------>O(1)
        }
        size++;// ------------>O(1)
    }

    void traverse() {// ----------------->O(1)
        if (head == null) {// ----------------->O(1)
            System.out.println("Doubly linked list doesnot exist!!");// ----------------->O(1)
            return;// ----------------->O(1)
        } else {
            DoublyNode tempNode = head;// ----------------->O(1)
            for (int i = 0; i < size; i++) {// ----------------->O(n)
                System.out.print(tempNode.value);// ----------------->O(1)
                if (i != size - 1) {// ----------------->O(1)
                    System.out.print(" -> ");// ----------------->O(1)
                }
                tempNode = tempNode.next;// ----------------->O(1)
            }
            System.out.println("\n");// ----------------->O(1)
        }
    }

    void reverseTraverse() {
        if (head == null) {// --------------->O(1)
            System.out.println("Doubly linked list doesnot exist!!");// --------------->O(1)
            return;//--------------->O(1)
        } else {
            DoublyNode tempNode = tail;// --------------->O(1)
            for (int i = 0; i < size; i++) {// --------------->O(n)
                System.out.print(tempNode.value);// --------------->O(1)
                if (i != size - 1) {// --------------->O(1)
                    System.out.print(" <- ");// --------------->O(1)
                }
                tempNode = tempNode.back;// --------------->O(1)
            }
            System.out.println("\n");// --------------->O(1)
        }
    }
    boolean search(int nodeValue){
        if(head==null){//--------------->O(1)
            System.out.println("Double linked list doesnot exist!!");//--------------->O(1)
            return false;//--------------->O(1)
        }else{
            DoublyNode tempNode=head;//--------------->O(1)
            for(int i=0;i<size;i++){//--------------->O(n)
                if(tempNode.value==nodeValue){//--------------->O(1)
                    System.out.println(nodeValue+" is found at location "+i);//--------------->O(1)
                    return true;//--------------->O(1)
                }
                tempNode=tempNode.next;//--------------->O(1)
            }
        }
        System.out.println("Node value not found !!");//--------------->O(1)
        return false;//--------------->O(1)
    }
    void delete(int location){//--------------->O(1)
        if(head==null){//--------------->O(1)
            System.out.println("Doubly linked list doesnt exist!!");//--------------->O(1)
            return;//--------------->O(1)
        }else if(location==0){//--------------->O(1)
            if(size==1){//--------------->O(1)
                head=null;//--------------->O(1)
                tail=null;//--------------->O(1)
                size--;//--------------->O(1)
            }
            else {
                head=head.next;//--------------->O(1)
                head.back=null;//--------------->O(1)
                size--;//--------------->O(1)
            }
        }else if(location>=size){//--------------->O(1)
            DoublyNode tempNode=tail.back;//--------------->O(1)
            if(size==1){//--------------->O(1)
                head=null;//--------------->O(1)
                tail=null;//--------------->O(1)
                size--;//--------------->O(1)
            }else {
                tempNode.next=null;//--------------->O(1)
                tail=tempNode;//--------------->O(1)
                size--;//--------------->O(1)
            }
        }else{
            DoublyNode tempNode=head;//--------------->O(1)
            for(int i=0;i<location-1;i++){//--------------->O(n)
                tempNode=tempNode.next;//--------------->O(1)
            }
            tempNode.next=tempNode.next.next;//--------------->O(1)
            tempNode.next.back=tempNode;//--------------->O(1)
            size--;//--------------->O(1)
        }
    }
    void deleteEntire(){
        DoublyNode tempNode=head;//--------------->O(1)
        for(int i=0;i<size;i++){//--------------->O(n)
            tempNode.back=null;//--------------->O(1)
            tempNode=tempNode.next;//--------------->O(1)
        }
        head=null;//--------------->O(1)
        tail=null;//--------------->O(1)
        System.out.println("The Doubly circular linked list has been deleted!!");//--------------->O(1)
    }
}
public class DoubleLinkedList {
    public static void main(String[] args) {
        Dll d = new Dll();
        d.create(7);
        System.out.println(d.head.value);
        d.insert(5, 0);
        d.insert(3, 1);
        d.insert(6, 9);
        System.out.println(d.head.next.value);
        d.traverse();
        d.reverseTraverse();
        d.search(9);
        d.delete(9);
        d.traverse();
        d.deleteEntire();
        d.traverse();
    }
}