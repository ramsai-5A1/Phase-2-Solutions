

/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    private static void helper(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            result.add(new ArrayList<>(path));
        }
        helper(root.left, path, result);
        helper(root.right, path, result);
        path.remove(path.size() - 1);
    }
    
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        
        helper(root, path, result);
        return result;
    }
}
        