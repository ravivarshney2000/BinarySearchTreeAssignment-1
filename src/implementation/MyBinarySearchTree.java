package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    
    private Node<E> root;

    @Override
    public void insert(E data) {
        root = insert(root, data);

    }
    
    private Node<E> insert(Node<E> root, E data)
	{
		
		if (root == null)
		{
			return new Node<E>(data);
		}
		
		else if (data.compareTo(root.data) < 0)
		{
			root.left = insert(root.left, data);
		}
		
		else 
		{
			root.right = insert(root.right, data);
		}
		

		return root;
	}

    @Override
    public boolean search(E searchElement) {
        return search(root, data);
    }
    
    private boolean search(Node<E> root, E data)
	{
		
		if (root == null)
		{
			return false;
		}
		
		else if (data.compareTo(root.data) < 0)
		{
			return contains(root.left, data);
		}
		
		else if (data.compareTo(root.data) > 0)
		{
			return contains(root.right, data);
		}
		
		else
		{
			return true;
		}
	}

    @Override
    public void inOrder(Node<E> node) {
        if (root == null)
			return;

		inorder(root.left);
		System.out.print(" " + root.data);
		inorder(root.right);
     
    }

    @Override
    public void preOrder(Node<E> node) {
        if (root == null)
			return;

        System.out.print(" " + root.data);
		preorder(root.left);
		preorder(root.right);
        

    }

    @Override
    public void postOrder(Node<E> node) {
        if (root == null)
			return;

		postorder(root.left);
		postorder(root.right);
		System.out.print(" " + root.data);

    }

    @Override
    public void reverseInOrder(Node<E> node) {
        if (root == null)
			return;

		reverseInOrder(root.right);
		System.out.print(" " + root.data);
		reverseInOrder(root.left);

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        if (node==null){
            return -1;
        }
        else {
            return 1+Math.max(height(node.left()),height(node.right()));
        }
    }
}
