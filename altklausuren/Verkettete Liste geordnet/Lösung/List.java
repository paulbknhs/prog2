public class List{
	
	Node head;
	Node prev;
	
	public List(Node head){
		this.head = head;
		this.prev = null;
	}
	
	public Node getHead(){
		return this.head;
	}
	
	public void add (String info){ //start of recursion
		
		if(this.head == null){		//if the head is null, this is the first element, so put this as the head
			this.head = new Node(info, null);
			this.prev = null;
			return;
		}else{						//the head ist not null, so start the recursion
			this.prev = null;
			add(this.head, info);
		}
	}
	
	public void add (Node node, String info){
		
		if(node == null){				//the current node is null (end of the list), so append this node to the previous node
			this.prev.setNext(new Node(info, null));
		} else {						//the end of the list is not already reached
			
			if (node.getInfo().compareTo(info) > 0){ //if the current info is bigger than the info to be inserted, insert the info here
				if(this.prev != null){		//if this is not the first node
					this.prev.setNext(new Node(info, this.prev.getNext())); //insert the info between the prev-node and the next-node
				}else{		//if this is the first node initialize this node as the predecessor and append the rest of the list
					this.prev = (new Node(info, null));
					this.prev.setNext(node);
					this.head = this.prev;
				}
			}else{			//if the input info is bigger than the current info go to the next node
				this.prev = node;
				add(node.getNext(), info);
			}
		}
	}
	
	public String output (Node node){ //append the infos with toString() until the end of the list is reached
		if (node == null) {
			return "";
		} else {
			return node.toString() + output(node.getNext());
		}
	}
}