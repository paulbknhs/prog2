public class Node{
	String info;
	Node left;
	Node right;
	
	public Node(String info, Node left, Node right){
		this.info = info;
		this.left = left;
		this.right = right;
	}
	
	public String getInfo(){
		return this.info;
	}
	
	public Node getLeft(){
		return this.left;
	}
	
	public Node getRight(){
		return this.right;
	}
	
	public void setInfo(String info){
		this.info = info;
	}
	
	public void setLeft(Node left){
		this.left = left;
	}
	
	public void setRight(Node right){
		this.right = right;
	}
}