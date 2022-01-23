package com.muhsantech;

// Definition for singly-linked list.
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class Lecture_25_Most_IMPORTANT_Linked_List_Questions {
    // Q1 -->> Find the nth node from the end & remove it ??
    public ListNode removeNthFromEnd(ListNode head, int n){
        if (head.next == null){
            return null;
        }
        // Size
        int size = 0;
        ListNode curr = head;
        while (curr != null){
            curr = curr.next;
            size++;
        }
        //removing SIZEth node from last i.e. head
        if (n == size){
            return head.next;
        }
        //find previous node
        int indexToSearch = size - n; // position to find
        ListNode prev  = head; // previous node
        int i = 1; // current position
        while (i < indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    // Q2 --->> Check if a Linked List is a palindrome ??
    public boolean isPalindrome(ListNode head){
        if (head == null || head.next == null) {
            return true;
        }
        ListNode middle = findMiddle(head); // 1st half ka end
        ListNode secondHalfStart = reverse(middle.next);
        ListNode firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
    // reverse Functions
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    // findMiddle Function
    private ListNode findMiddle(ListNode head) {
         ListNode hare = head;
         ListNode turtle = head;

         while (hare.next != null && hare.next.next != null){
             hare = hare.next.next;
             turtle = turtle.next;
         }
         return turtle;
    }
    // Q3 -->  Detecting Loop in a Linked List.??
    public boolean hasCycle(ListNode head){
        if (head == null){
            return false;
        }
        ListNode hare = head; // fast
        ListNode turtle = head; // slow

        while (hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {


    }
}
