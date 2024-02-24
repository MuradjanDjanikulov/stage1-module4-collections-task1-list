package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> resultLinkedList = new LinkedList<>();

        for (Integer number : sourceList) {
            if (number % 2 == 1) {
                resultLinkedList.addFirst(number);
            } else {
                resultLinkedList.addLast(number);
            }
        }
        return resultLinkedList;    }
}
