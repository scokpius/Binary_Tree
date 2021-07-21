public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    Node(){

    }

    public int  preOrder(){
        int count = 0;
        count++;

        if (leftChild != null){
            count++;
        }
        if (rightChild != null){
            count++;
        }
        return count;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public void setLeftChild(final Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(final Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value = " + value + "\n" +
                "leftChild = " + leftChild +  "\n" +
                "rightChild = " + rightChild +
                '}' + "\n";
    }
}
