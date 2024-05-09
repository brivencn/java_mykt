package Follow.Days20;

/**
 * @Author 陈帅
 * @Date 2023/12/10 19:11
 * @QQ 976104170
 * @Description
 **/

public class Node<E> {
    private E value;

    public Node<E> next;

    public static void main(String[] args) {
        // 链表结构,单向链表创建
        Node<String> node1 = new Node<>();
        node1.value = "a";
        Node<String> node2 = new Node<>();
        node2.value = "b";
        Node<String> node3 = new Node<>();
        node3.value = "c";
        Node<String> node4 = new Node<>();
        node4.value = "d";
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node1.next = node3; // 删除node2
        show(node1);
    }


    public static void show(Node<?> node) {
        Node<?> currentNode = node;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public static void addNode(Node<String> lastNode, Node<String> newNode) {
        lastNode.next = newNode;
    }
}
