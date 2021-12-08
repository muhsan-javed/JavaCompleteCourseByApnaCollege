package com.muhsantech;

import java.util.LinkedList;

public class Lecture_23_Introduction_to_Linked_List_Data_Structures_Algorithms_Java {

    Node head;
    private int size;

    Lecture_23_Introduction_to_Linked_List_Data_Structures_Algorithms_Java(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add - first , last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next =head;
        head = newNode;
    }

    public void addlast(String data){
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

    //delete first
    public void deleteFirst(){
        if (head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast(){
        if (head == null){
            System.out.println("The list emptyy");
            return;
        }
        size--;

        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next; // head.next  = null -> lastNode = null
        while (lastNode.next != null){ // null.next == ERROR
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //Size
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        Lecture_23_Introduction_to_Linked_List_Data_Structures_Algorithms_Java list = new Lecture_23_Introduction_to_Linked_List_Data_Structures_Algorithms_Java();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addlast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

//        list.getSize(); ==  EORROR
        System.out.println(list.getSize());
        list.addFirst("This ");
        System.out.println(list.getSize());
        list.printList();


        // Collection Framwork
        LinkedList<String> linkedList = new LinkedList<>();
         linkedList.addFirst("a");
         linkedList.addLast("is");
        System.out.println(linkedList);

        linkedList.addFirst("this");
        linkedList.add("List");
        System.out.println(linkedList);

        System.out.println(linkedList.size());
//        String valuess = "a";
//        for (int i=0; i<linkedList.size(); i++){ // old for loop
        for (String s : linkedList) { // New for loop design
//            if (linkedList.get(i) == valuess){
//                System.out.println("ok");
//            } // Search
            System.out.print(s + " -> ");
        }
        System.out.println("null");

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println(linkedList);

    }
}
