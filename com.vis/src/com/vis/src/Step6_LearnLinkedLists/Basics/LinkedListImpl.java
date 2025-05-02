package com.vis.src.Step6_LearnLinkedLists.Basics;

public class LinkedListImpl {
    // Traversal
    public void traversal(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    // search
    public Node searchByNode(Node head, Node toFind){
        Node temp = head;
        while(temp != null){
            if(temp == toFind){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public Node searchByVal(Node head, int toFind){
        Node temp = head;
        while(temp != null){
            if(temp.val == toFind){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    // Insert
    public void insertNode(Node pos, Node newNode){
        newNode.next = pos.next;
        pos.next = newNode;
    }
    // Delete
    public void deleteNode(Node n1, Node nodeToDelete){
        Node temp = n1;
        Node prev = null;
        while(temp != null){
            if(temp == nodeToDelete){
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}
