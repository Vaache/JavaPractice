package Algo;

class Node {
    int val;
    Node next;

    Node() {
        val = 0;
        next = null;
    }

    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class LinkedList{
    // add, insert, delete, print
    Node head;
    int size;

    LinkedList() {
        this.head = null;
        size = 0;
    }

    LinkedList(Node head) {
        this.head = head;
        size = lstSize(head);
    }

    void add(Node node) {
        if (head != null)
        {
            Node tmp = null;
            for (tmp = head; tmp.next != null; tmp = tmp.next)
                ;
            tmp.next = node;
        }
        else
            head = node;
        size++;
    }

    void insert(Node node, int pos) {
        if (pos > size)
            return;
        Node prev = null;
        Node tmp = null;
        int i = 0;
        for (tmp = head; tmp != null && i < pos - 1; tmp = tmp.next, i++)
            ;
        
        if (pos == size) {
            tmp.next = node;
        }
        else if (pos == 0) {
            node.next = head;
            head = node;
            size ++;
        }
        else {
            prev = tmp;
            tmp = tmp.next;
            prev.next = node;
            node.next = tmp;
        }
        size++;
    }

    void print() {
        Node tmp;
        for (tmp = head; tmp != null; tmp = tmp.next) {
            System.out.print(tmp.val + " ");
        }
        System.out.println();
    }

    int lstSize(Node head) {
        int res = 0;
        while (head != null) {
            head = head.next;
            res ++;
        }
        return res;
    }

    void delete(int pos) {
        Node prev = null;
        Node tmp = null;
        int i = 0;
        for (tmp = head; tmp != null && i < pos - 1; tmp = tmp.next, i++)
            ;
        prev = tmp;
        tmp = tmp.next;
        prev.next = tmp.next;
        size--;
    }

}
