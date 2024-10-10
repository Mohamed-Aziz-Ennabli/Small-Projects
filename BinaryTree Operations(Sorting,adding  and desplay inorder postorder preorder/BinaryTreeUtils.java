 
final class BinaryTreeUtils{
    public static Element constructBinaryTree(Pair[] data, int left, int right){
        if( left >= right ){
            return null;  // wir brauchen diese Bedingung für Abbruch der Rekursion
        }
        int x = (left + right)/2;
        Element root = new Element();
        root.setData(data[x]);
        Element el =constructBinaryTree(data, left, x);
        root.setLeft(el);
        Element er = constructBinaryTree(data, x+1, right);
        root.setRight(er);
        if(el != null){
            el.setParent(root);
        }
        if(er != null){
            er.setParent(root);
        }
        return root; 
    }
    public static void inorder(Element root){
        if(root == null){
            return ;
        }
        inorder(root.getleft());
        System.out.print(root.getData().getVal() + " ");
        inorder(root.getRight());
    }
    public static void preorder(Element root){
        if(root == null ){
            return ; 
        }
        System.out.print(root.getData().getVal() + " ");
        preorder(root.getleft());
        preorder(root.getRight());
    }
    public static void postorder(Element root ){
        if(root == null ){
            return ; 
        }
        postorder(root.getleft());
        postorder(root.getRight());
        System.out.print(root.getData().getVal() + " ");
    }
    public static int getHeight(Element root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.getleft()), getHeight(root.getRight()));
    }
}