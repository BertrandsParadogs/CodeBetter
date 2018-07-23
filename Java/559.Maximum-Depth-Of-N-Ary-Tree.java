/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    
    private int max = 0;
    
    public int maxDepth(Node root) {
        helper(root, 1);
        return max;
    }
    
    private void helper(Node root, int depth) {
        if (root != null) {
            if (root.children.isEmpty())
                max = Math.max(max, depth);
            for (Node node : root.children)
                helper(node, depth+1);
        }
    }
}