package com.vis.src.Step6_LearnLinkedLists.Basics;

public class LLMAIN {
    public static void solve() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        LinkedListImpl llimp = new LinkedListImpl();
        System.out.println("Before Inserting");
        llimp.traversal(n1);
//        Node foundNode = llimp.searchByNode(n1, n5);
//        if(foundNode == null){
//            System.out.println("NOT FOUND!!");
//        }else{
//            System.out.println(foundNode.val);
//        }
//        Node foundNodeVal = llimp.searchByVal(n1, 8);
//        System.out.println(foundNodeVal.val);
        llimp.insertNode(n2,n5);
        System.out.println("After Inserting");
        llimp.traversal(n1);
        System.out.println("After Deleting");
        llimp.deleteNode(n1, n1);
        llimp.traversal(n1);
    }
}
