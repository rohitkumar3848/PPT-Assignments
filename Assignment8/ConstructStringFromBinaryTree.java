class Node{
    int val;
    Node left,right,root;
    Node(int val){
        this.val=val;
        left=null;
        right=null;
        root=null;
    }
}
class ConstructStringFromBinaryTree {
    public static String tree2str(Node root) {
        if(root==null) return "";
        StringBuilder sb = new StringBuilder();
        preOrder(root,sb);
        return sb.toString();
    }
    public static void preOrder(Node root, StringBuilder sb){
        if(root == null) return;
        sb.append(root.val);
        if(root.left!=null){
            sb.append("(");
            preOrder(root.left, sb);
            sb.append(")");
        }
        if(root.right!=null){
            if(root.left==null) sb.append("()");
            sb.append("(");
            preOrder(root.right, sb);
            sb.append(")");
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.right=new Node(3);
        System.out.println(tree2str(root));
    }
}