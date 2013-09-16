package williamelmore.mobiledev.doublylist;

public class Node {
	private String value;
	private Node pointerNode;
	private Node previousNode;
	

	public Node(String value) {	
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public Node getPointerNode() {
		return pointerNode;
	}
	
	public void setPointerNode(Node pointerNode) {
		this.pointerNode = pointerNode;
	}
	
	public Node getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	@Override
	public String toString() {
		return "Node [value=;" + value + ",pointerNode=" +pointerNode + ", previousNode=" + previousNode + "]";
	}
}
