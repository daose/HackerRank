/*
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Node root = new Node(3);
        root.left = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.left.left.right = new Node(9);
        root.right = new Node(2);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);

        top_view(root);
    }

*/

    public static void top_view(Node node){
        if(node == null) return;

        printLeftTopView(node.left);
        System.out.print(node.data + " ");
        printRightTopView(node.right);

        System.out.println("");
    }

    public static void printLeftTopView(Node node){
        if(node == null) return;
        printLeftTopView(node.left);
        System.out.print(node.data + " ");
    }

    public static void printRightTopView(Node node){
        if(node == null) return;
        System.out.print(node.data + " ");
        printRightTopView(node.right);
    }

/*

    public static class Node {
        public int data;
        public Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
*/
