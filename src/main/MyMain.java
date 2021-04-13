package main;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        // and perform insert, search, traversal, delete
        MyBinarySearchTree<Integer> bst=new MyBinarySearchTree<>();
        bst.insert(50);
        bst.insert(60);
        bst.insert(40);
        bst.search(50);
        bst.inOrder(bst.getRoot());
        bst.delete(50);
    }
}
