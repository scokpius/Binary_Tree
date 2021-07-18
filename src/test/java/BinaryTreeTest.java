import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
        public void checkTheCreateBinaryTree(){
        BinaryTree binaryTree = createBinaryTree();
        Assert.assertTrue("The tree does not exist", binaryTree.isEntity());
    }

    @Test
    public void checkTheCountNodesInBinaryTree(){
        BinaryTree binaryTree = createBinaryTree();
        Assert.assertEquals("The number of nodes does not match", 3,binaryTree.countNodesWithTwoDescendants(binaryTree));
    }

    @Test
    public void checkTheCountNodesInBinaryTreeNull(){
        BinaryTree binaryTree = new BinaryTree();
        Assert.assertEquals("The tree does not exist", 0,binaryTree.countNodesWithTwoDescendants(binaryTree));
    }

    private BinaryTree createBinaryTree() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(8);
        binaryTree.add(4);
        binaryTree.add(2);
        binaryTree.add(11);
        binaryTree.add(6);
        binaryTree.add(3);
        binaryTree.add(10);
        binaryTree.add(7);
        binaryTree.add(12);
        return binaryTree;
    }


}
