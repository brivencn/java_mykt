package Follow.Days20;

import java.util.LinkedList;

/**
 * @Author 陈帅
 * @Date 2023/12/10 23:10
 * @QQ 976104170
 * @Description     双向链表的 add 实现
 **/

public class TestLinkedList<E>{
    private Node<E> first;  // 第一个节点
    private Node<E> last;   // 最后个节点
    private Integer size = 0;   // 容量

    /**
     * @Author          陈帅
     * @ClassName       TestLinkedList
     * @Description     内部类 Node<E>
     * @Date            2023/12/11
     **/
    private class Node<E> {
        private E item;     // 值
        private Node<E> prev;   // 上一个节点
        private Node<E> next;   // 下一个节点

        public Node(E item, Node<E> prev, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    /**
     * @Author          陈帅
     * @Description     添加节点
     * @Date            2023/12/11 1:46
     * @Param           [e]
     * @Return          void
     **/
    public void add(E e) {
        Node l = last;   // 最后一个节点
        Node<E> newNode = new Node<E>(e, last, null);   // 创建新的节点
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;   // 对链表不为空时，的最后一个node节点的next 赋值新的node 类里访问private没问题，可以访问修改到
        }
        size++;
    }

    /**
     * @Author          陈帅
     * @Description     通过index 获取Node<E>
     * @Date            2023/12/11 1:47
     * @Param           [index]
     * @Return          Follow.Days20.TestLinkedList<E>.Node<E>
     **/
    private Node<E> node(int index) {
        // size >> 1 代表 二进制往右移一位，相当于整除以2并向下取整 e.g. 9(1001) >> 1 = 4, >> 1 比 除以2 效率更高
        if (index < (size >> 1)) {
            // 从头开始找
            Node<E> head = first;
            for (int i =0; i < index ; i++)
                head = head.next;
            return head;
        } else {
            // 从尾开始找
            Node<E> tail = last;
            for (int i = size -1; i > index; i--)
                tail = tail.prev;
            return tail;
        }
    }

    /**
     * @Author          陈帅
     * @Description     通过Node<E>对象，对first，last属性进行修改，达到删除节点的目的
     * @Date            2023/12/11 1:48
     * @Param           [node] 不能为null
     * @Return          E
     **/
    private E unlink(Node<E> node) {
        // final修饰的对象 引用不变，但是对象里面的成员属性没有final修饰 是可以改变的
        final E element = node.item;
        final Node<E> prev = node.prev;
        final Node<E> next = node.next;

        /* 判断删除的三种情况：头，尾，中间
             如果prev为null 执行 first = next; 把node下一个节点赋值给first。
             next.prev = prev; 相当于修改first的prev值改成了null
             node.next = null; 用于gc回收
         */
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            node.prev = null;
        }
        /* 同理，next如果是null就是删除尾部， 执行 last = prev; 把node的上一个节点赋值给last。
            prev.next = next; 相当于修改last的next值改成了null。
            node.prev = null; 用于gc回收
        */
        if (next ==null) {
            last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }
        size--;
        node.item = null;   // gc 回收
        return element;
    }

    public E get(int index) {
        // 判断index越界问题
        rangeCheck(index);
        return node(index).item;
    }

    public E remove(int index) {
        // 判断index越界问题
        rangeCheck(index);
        return unlink(node(index));
    }

    private void rangeCheck(int index) {
        // 判断index越界问题
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        TestLinkedList<String> list = new TestLinkedList<>();
        list.add("abc");
        list.add("123");
        list.add("456");
        list.add("789");

        System.out.println("get---------------");

        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(1));
//        System.out.println(list.get(6));

        System.out.println("remove---------------");
        System.out.println(list.remove(1));
        System.out.println(list.get(1));
    }
}
