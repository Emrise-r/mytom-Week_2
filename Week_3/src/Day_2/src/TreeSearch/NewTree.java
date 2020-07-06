package TreeSearch;

public class NewTree {
    class Node {
        int key;
        Node left;
        Node right;
        Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }
    Node root;
    public NewTree() {
        root = null;
    }
    public Node insertNode(Node root,int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else {
            if (key < root.key){
                root.left = insertNode(root.left, key);
            } else {
                root.right = insertNode(root.right, key);
            }
        }
        return root;
    }
    public Node search(Node root,int key){
        if(root == null){
            return null;
        }
        if (root.key == key) {
            return root;
        }
        if (root.key > key)
            return search(root.left, key);
        return search(root.right, key);
    }
    public void insertTree(int key){
        this.root = insertNode(this.root,key);
    }
    public void searchTree(int key){
        Node node = search(root, key);
        if (node == null) {
            System.out.println("Not Found");
        } else {
            System.out.println("Founded");
        }
    }
    public void printNode(Node root){
        if( root != null ){
            System.out.println(root.key);
            printNode(root.left);
            printNode(root.right);
        }
    }
}
