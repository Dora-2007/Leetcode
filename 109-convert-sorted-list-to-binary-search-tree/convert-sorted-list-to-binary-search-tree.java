/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
      ArrayList<Integer> l = new ArrayList<>();
        
        ListNode temp = head;
        
        if (temp == null) {
            return null;
        }
        
        // Store linked list values in ArrayList
        while (temp != null) {
            l.add(temp.val);
            temp = temp.next;
        }
        
        // Build BST
        return createBST(l, 0, l.size() - 1);
    }
    
    public TreeNode createBST(ArrayList<Integer> l, int start, int end) {
        
        if (start > end) {
            return null;
        }
        
        // Find middle element
        int mid = start + (end - start) / 2;
        
        // Middle becomes root
        TreeNode root = new TreeNode(l.get(mid));
        
        // Left half becomes left subtree
        root.left = createBST(l, start, mid - 1);
        
        // Right half becomes right subtree
        root.right = createBST(l, mid + 1, end);
        
        return root;  
    }
}