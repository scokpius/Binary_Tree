import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BinaryTree binaryTreeTwo = new BinaryTree();
        BinaryTree binaryTreeThree =  new BinaryTree();
        BinaryTree binaryTreeFour =  new BinaryTree();
        final Logger LOGGER = LogManager.getLogger(Main.class);

        binaryTree.add(8);
        binaryTree.add(4);
        binaryTree.add(2);
        binaryTree.add(11);
        binaryTree.add(6);
        binaryTree.add(3);
        binaryTree.add(10);
        binaryTree.add(7);
        binaryTree.add(12);

        // второе дерево
        binaryTreeTwo.add(100);
        binaryTreeTwo.add(110);
        binaryTreeTwo.add(109);
        binaryTreeTwo.add(90);
        binaryTreeTwo.add(91);
        binaryTreeTwo.add(89);


        // трейтье дерево
        binaryTreeThree.add(7);
        binaryTreeThree.add(3);
        binaryTreeThree.add(9);
        binaryTreeThree.add(2);
        binaryTreeThree.add(5);
        binaryTreeThree.add(4);
        binaryTreeThree.add(6);
        binaryTreeThree.add(8);
        binaryTreeThree.add(10);
        binaryTreeThree.add(12);
        binaryTreeThree.add(11);

        // четвертое дерево
        binaryTreeFour.add(7);
        binaryTreeFour.add(3);
        binaryTreeFour.add(9);
        binaryTreeFour.add(2);
        binaryTreeFour.add(10);

        LOGGER.info("Ожидаемый результат: 3  " + "Фактический результат: " +
                binaryTree.countNodesWithTwoDescendants(binaryTree));
        LOGGER.info("Ожидаемый результат: 2  " + "Фактический результат: " +
                binaryTree.countNodesWithTwoDescendants(binaryTreeTwo));
        LOGGER.info("Ожидаемый результат: 5  " + "Фактический результат: " +
                binaryTree.countNodesWithTwoDescendants(binaryTreeThree));
        LOGGER.info("Ожидаемый результат: 1  " + "Фактический результат: " +
                binaryTree.countNodesWithTwoDescendants(binaryTreeFour));

    }
}
