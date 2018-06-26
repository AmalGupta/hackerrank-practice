/**
 * 
 */
package com.hackerrank.ds.trees;

/**
 * Tree Operations 
 * @author agupt316
 *
 */
public class TreeOps {
	
	/**
	 * PreOrder traversal of the tree given the node
	 * @param root
	 */
	public static void preOrder(TreeNode root){
		if(root==null){
			return;
		}
		System.out.print(root.getData()+" ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	/**
	 * PostOrder traversal of the tree given the node
	 * @param root
	 */
	public static void postOrder(TreeNode root){
		if(root==null){
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getData()+" ");
	}
	
	/**
	 * InOrder traversal of the tree
	 * @param root
	 */
	public static void inOrder(TreeNode root){
		if(root==null){
			return;
		}
		inOrder(root.getLeft());
		System.out.print(root.getData()+" ");
		inOrder(root.getRight());
	}
	
	/**
	 * Height of a binary tree. Height is the number of edges connected between the root and the longest path to a leaf.
	 * @param root
	 * @return
	 */
	public static int height(TreeNode root){
		if(root==null){
			return 0;
		}
		
		int leftCount = height(root.getLeft());
		int rightCount = height(root.getRight());
		
		//if no edges are going out from the root, return 0 else return add 1 to the height of the node. 
		if(root.getLeft()==null&&root.getRight()==null){
            return (leftCount>rightCount)?(leftCount):(rightCount);
       }
      else{
          return (leftCount>rightCount)?(1+leftCount):(1+rightCount);
      }
		
	}
}
