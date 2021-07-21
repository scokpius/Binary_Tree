import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private Node rootNode = null;
    List<Node> list = new ArrayList<Node>();
    int countNode = 0;

    public BinaryTree() {
        rootNode = null;
    }
    public boolean isEntity(){
        if (rootNode != null) return true;
        return false;
    }

    public void add(int value) {
        if (rootNode == null){
            rootNode = new Node();
            rootNode.setValue(value);
        }
        else {
            Node currentNode = rootNode;
            Node parentNode;
            while (true)
            {
                parentNode = currentNode;
                if(value == currentNode.getValue()) {
                    return;
                }
                else  if (value < parentNode.getValue()) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null){
                        parentNode.setLeftChild(new Node());
                        parentNode.getLeftChild().setValue(value);
                        return;
                    }
                }
                else if (value > currentNode.getValue()) {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parentNode.setRightChild(new Node());
                        parentNode.getRightChild().setValue(value);
                        return;

                    }
                }
            }
        }
    }
    public void preOrder(Node node){
        if (checksNodesWithTwoDescendants(node)){
            list.add(node);
        }
        if (node.getLeftChild() != null){
            preOrder(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            preOrder(node.getRightChild());
        }

    }

    public int countNodesWithTwoDescendants(BinaryTree binaryTree) {
        if (binaryTree.rootNode == null){
            return countNode;
        }
        preOrder(binaryTree.rootNode);
        countNode = list.size();
        list.clear();
        return countNode;
    }


    private boolean checksNodesWithTwoDescendants(Node node) {
        return node.preOrder() == 3;
    }

}
