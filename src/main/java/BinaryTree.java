

public class BinaryTree {
    public Node rootNode = null;
    int countNode = 0;

    public BinaryTree() {
        rootNode = null;
    }
    public boolean isEntity(){
        if (rootNode != null) return true;
        return false;
    }

    public void add(int value) {
   //     new Node().setValue(value);
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


    public int countNodesWithTwoDescendants(BinaryTree binaryTree){

        if (binaryTree.rootNode != null){
            if (binaryTree.rootNode.preOrder() == 3)
                countNode++;

        } else {return countNode;}
        if (binaryTree.rootNode.getLeftChild() != null){
            if (binaryTree.rootNode.getLeftChild().preOrder() == 3)
                countNode ++;
        }
        if (binaryTree.rootNode.getRightChild() != null){
            if (binaryTree.rootNode.getRightChild().preOrder() == 3)
                countNode ++;
        }
        return countNode;
    }

}
