public class Tree{
	
	Node root;
	
	public Tree(Node root){
		this.root = root;
	}
	
	public Node getRoot(){
		return this.root;
	}
	
	public void setRoot(Node root){
		this.root = root;	
	}
	
	public void add (String info){ //start of recursion
		if(this.root == null){		//if the root is null, this is the first element, so put this as the root
			this.setRoot(new Node(info, null, null));
		}else{						//the root ist not null, so start the recursion
			add(this.root, info);
		}
	}
	
    public void add(Node node, String info){
        if(info.compareTo(node.getInfo()) < 0){		//if the info to be inserted is smaller than the current one
            if(node.getLeft() == null){				//insert it left if left is empty
                node.setLeft(new Node(info, null, null));	
            }else{									//go to the left node if it is not empty
                add(node.getLeft(), info);
            }
        }else{										//if the info to be inserted is smaller than or equal to the current one
            if(node.getRight() == null){			//insert it right if right is empty
                node.setRight(new Node(info, null, null));
            }else{									//go to the right node if it is not empty
                add(node.getRight(), info);	
            }
        }
    }
	
	public String inOrder(Node node){ //append the infos with toString() until the end of the tree is reached
		if (node == null) {
			return "_";
		} else {
			return inOrder(node.getLeft()) + node.getInfo() + inOrder(node.getRight());
		}
	}
}