
class main{
    public static void sort(Pair[] pairs){
        for( int i = pairs.length -1 ; i>0; i--){
            for(int j = 0 ; j < i-1; j++ ){
                if(pairs[j].compareTo(pairs[j+1])>0){
                    Pair temp = pairs[j]; 
                    pairs[j]= pairs[j+1];
                    pairs[j+1]= temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Pair[] pairs = {
            new Pair(8, "ist"),
            new Pair(7, "Baum"),
            new Pair(1, "ein "),
            new Pair(4, "binaerer"),
            new Pair(42, "Datenstruktur"),
            new Pair(13, "eine"),
            new Pair(21, "dynamische")           
        };
        // Pair Array sortieren: 
        sort(pairs);
        for(Pair pair : pairs){
            System.out.println("Key : "+ pair.getKey() + " ; Value : "+ pair.getVal());
        }
        Element root = BinaryTreeUtils.constructBinaryTree(pairs, 0, pairs.length);

        System.out.println("Inorder Ausgabe:");
        BinaryTreeUtils.inorder(root);
        System.out.println("\nPreorder Ausgabe:");
        BinaryTreeUtils.preorder(root);
        System.out.println("\nPostorder Ausgabe:");
        BinaryTreeUtils.postorder(root);

        System.out.println("\nHeight of the tree: " + BinaryTreeUtils.getHeight(root));
    }
}
