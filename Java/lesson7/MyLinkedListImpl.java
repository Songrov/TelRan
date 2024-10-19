package telran.homework.lesson7;


import java.util.Iterator;

public class MyLinkedListImpl implements MyLinkedList {


    private Node head;

    @Override
    public String toString() {
        // [1,3]
        String result = "[";
        Node n = head;
        while(n != null) {
            int v = n.getValue();
            result += v;
            n = n.getNext();
            if ( n != null)
            {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    @Override
    public int removeFirst() {
        int result = get(0);
        remove(0);
        return result;
    }

    @Override
    public void addFirst(int i) {
        add(0, i);
    }

    @Override
    public int getFirst() {
        return get(0);
    }


    private static class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(int value) {

        Node n = head;
        while (n != null) {
            if(n.getValue() == value) {
                return true;
            }
            n = n.getNext();
        }
        return false;
    }


    private Node getNodeByIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node n = head;
        for (int i = 0; i < index; i++) {
            if(n != null) {
                n = n.getNext();
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if ( n == null) {
            throw new IndexOutOfBoundsException();
        }
        return n;
    }

    @Override
    public void set(int index, int value) {

        Node n = getNodeByIndex(index);
        if (n != null) {
            n.setValue(value);
        }
    }

    @Override
    public void add(int value) {

        size++;

        Node node = new Node(value, null);

        if(head == null) {
            head = node;
            return;
        }

        Node n = head;
        while (n.getNext() != null) {
            n = n.getNext();
        }
        n.setNext(node);
    }

    @Override
    public void add(int index, int value) {

        if(index < 0 || (index > size())) {
            throw new IndexOutOfBoundsException();
        }
        size++;

        if(index == 0) {
            Node prevHead = head;
            head = new Node(value, prevHead);
        } else {
            Node prev = getNodeByIndex(index - 1);
            Node next = prev.next;
            Node newNode = new Node(value, next);
            prev.setNext(newNode);
        }
    }

    @Override
    public void remove(int index) {
        if(index < 0 || (index >= size())) {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0) {
            if(head == null) {
                return;
            }
            head = head.getNext();
            return;
        }
        Node prev = getNodeByIndex(index - 1);
        Node next = getNodeByIndex(index).getNext();
        prev.setNext(next);
        size--;
    }

    @Override
    public int get(int index) {

        Node node = getNodeByIndex(index);

        return node.getValue();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            Node node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public Integer next() {
                int result = node.getValue();
                node = node.getNext();
                return result;
            }
        };
    }

    @Override
    public Iterator<Integer> backward() {
        return null;
    }
}
