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
//     public List<Integer> postorder(Node root) {
//         List<Integer> list = new ArrayList<>();
//         if (root == null) return list;
//         post(root, list);
//         list.add(root.val);
//         return list;
//     }
    
//     private void post(Node node, List<Integer> list) {
//         if (node != null) {
//             for (Node n : node.children) {
//                 post(n, list);
//                 list.add(n.val);
//             }
//         }
//     }
    
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.empty()) {
            Node n = st.pop();
            list.add(n.val);
            for (Node child : n.children)
                st.push(child);
        }
        Collections.reverse(list);
        return list;        
    }
}