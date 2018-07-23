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
//     public List<Integer> preorder(Node root) {
//         List<Integer> list = new ArrayList<>();
//         if (root == null) return list;
//         list.add(root.val);
//         pre(root, list);       
//         return list;
//     }
    
//     private void pre(Node node, List<Integer> list) {
//         if (node != null) {
//             for (Node n : node.children) {
//                 list.add(n.val);
//                 pre(n, list);
//             }
//         }
//     }
    
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.empty()) {
            Node node = st.pop();
            list.add(node.val);
            for (int i = node.children.size()-1; i >= 0; i--)
                st.push(node.children.get(i));
        }
        return list;
    }
}