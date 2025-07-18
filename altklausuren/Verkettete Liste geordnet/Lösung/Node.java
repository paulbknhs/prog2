public class Node{
	String info;
	Node next;
	
	public Node(String info, Node next){
		
		this.info = info;
		this.next = next;
	}
	
	public String getInfo(){
		return this.info;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public void setInfo(String info){
		this.info = info;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	@Override
	public String toString() {
        return this.info + "_";
    }
}