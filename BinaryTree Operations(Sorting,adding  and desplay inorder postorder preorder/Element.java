class Element{
    private Element left ; 
    private Element right; 
    private Element parent;
    private Pair data;
    public Element() { //Standard Constructor 
        this.left = null;
        this.right = null;
        this.parent = null;
        this.data = null;
    }
    public Element(Pair data){
        this.data = data ; 
        
    }
    public Element getleft(){ 
        return left ;
    }
    public Element getRight(){
        return right ;
    }
    public Element getParent(){
        return parent ;
    }
    public Pair getData(){
        return data ;
    }
    public void setData(Pair data){
        this.data = data;
    }
    public void setParent(Element parent){
        this.parent = parent ;
    }
    public void setLeft(Element left){
        this.left = left ;
    }
    public void setRight(Element right){
        this.right = right;
    }
    
}