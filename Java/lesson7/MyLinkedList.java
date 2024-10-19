package telran.homework.lesson7;


import telran.lesson5.implementation.MyList;

public interface MyLinkedList extends MyList {
    int removeFirst();

    void addFirst(int i);

    int getFirst();
}
