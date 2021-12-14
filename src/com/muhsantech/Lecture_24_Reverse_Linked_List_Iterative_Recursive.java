package com.muhsantech;

public class Lecture_24_Reverse_Linked_List_Iterative_Recursive {

    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void reverseList() {
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    //add - first , last
    public void addFirst(int data){
       Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next =head;
        head = newNode;
    }
    // ad last
    public void addlast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode =head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Print
    public void printList(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }

        Node currNode =head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    // Reverse Recursive
    public Node reverseRecursive(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node newHead =reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        Lecture_24_Reverse_Linked_List_Iterative_Recursive list = new Lecture_24_Reverse_Linked_List_Iterative_Recursive();
//        list.addlast(1);
//        list.addlast(2);
//        list.addlast(3);
//        list.addlast(4);
        list.printList();

        list.reverseList();
        list.printList();

        System.out.println("\n Reverse Recursive ");

        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}
