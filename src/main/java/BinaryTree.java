import java.util.Stack;

public class BinaryTree {
    public Node rootNode = null;
    private int count=0;
    int countNode = 0;

    public BinaryTree() {
        rootNode = null;
    }

    public int getCount() {
        return count;
    }

    public void add(int value) {
        new Node().setValue(value);
        if (rootNode == null){
            rootNode = new Node();
            count++;
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
                else  if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null){
                        parentNode.setLeftChild(new Node());
                        count++;
                        return;
                    }
                }
                else {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parentNode.setRightChild(new Node());
                        count++;
                        return;

                    }
                }
            }
        }
    }


    public int  preOrder(BinaryTree binaryTree){

        if (binaryTree.rootNode != null){
            countNode++;
            countNode += binaryTree.rootNode.preOrder();
        } else {return countNode;}
        if (binaryTree.rootNode.getRightChild() != null){
            countNode += binaryTree.rootNode.getRightChild().preOrder();
        }
        if (binaryTree.rootNode.getRightChild() != null){
            countNode += binaryTree.rootNode.getRightChild().preOrder();
        }
        return countNode;
    }

}
