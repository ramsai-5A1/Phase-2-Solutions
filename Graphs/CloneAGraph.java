/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    private Node cloneIt(Node node, HashMap<Node, Node> store) {
        if (store.containsKey(node)) {
            return store.get(node);
        }
        
        Node dummyNode = new Node(node.val);
        store.put(node, dummyNode);
        for(Node neighbour: node.neighbors) {
            dummyNode.neighbors.add(cloneIt(neighbour, store));
        }
        
        return dummyNode;
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        HashMap<Node, Node> store = new HashMap<>();
        return cloneIt(node, store);
    }
}