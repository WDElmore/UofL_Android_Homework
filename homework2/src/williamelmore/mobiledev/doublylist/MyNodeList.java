package williamelmore.mobiledev.doublylist;

public class MyNodeList {
	private Node nextNode = null;
	private Node firstNode = null;
	private Node prevNode = null;
	
	public void add(String value) {
		Node tmpNode = new Node(value);
		if(nextNode!=null){
			nextNode.setPointerNode(tmpNode);
			prevNode = nextNode;
		}else{
			firstNode = tmpNode;	
		}
		nextNode=tmpNode;
		nextNode.setPreviousNode(prevNode);
	}
	
	public String print() {
		StringBuffer sb = new StringBuffer();
		Node tempNode = this.nextNode;
		while (tempNode!=null){
			sb.append(tempNode.getValue() + " ");
			tempNode = tempNode.getPreviousNode();
		}
		return sb.toString();
	}
}
