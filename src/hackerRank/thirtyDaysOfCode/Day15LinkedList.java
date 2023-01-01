package hackerRank.thirtyDaysOfCode;

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Day15LinkedList {

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node current = head;
        Node temp = null;
        // 헤드가 null일 경우 아직 아무것도 리스트에 없는 상태
        if(current == null) {
            temp = new Node(data);
            current = temp;
            return temp;
        } else {
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
            return head;
        }
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
