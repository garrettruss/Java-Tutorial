package Part_Two_Data_Structures_And_Algorithms.NonLinearDataStructures.Heaps.MinHeapExmp;

import java.util.ArrayList;

public class MinHeap {
    public ArrayList<Integer> heap;
    public int size;

    public MinHeap() {
        this.heap = new ArrayList<Integer>();
        this.heap.add(null);
        this.size = 0;
    }

    public void add(int value) {
        this.heap.add(value);
        this.size++;
        this.bubbleUp();
    }

    public int popMin() {
        if (this.size == 0) {
            throw new Error("Heap is empty!");
        }
        this.swap(1, this.size);
        int min = this.heap.remove(this.size);
        this.size--;
        this.heapify();
        return min;
    }

    private void bubbleUp() {
        int current = this.size;
        int swapCount = 0;
        while (current > 1 && this.heap.get(current) < this.heap.get(this.getParent(current))) {
            this.swap(current, this.getParent(current));
            current = this.getParent(current);
            swapCount++;
        }
        if (this.size == 10000) {
            System.out.println("A heap of " + this.size + " elements was restored with only " + swapCount + " swaps!");
        }
    }

    private void heapify() {
        int current = 1;
        int leftChild = this.getLeft(current);
        int rightChild = this.getRight(current);
        int swapCount = 0;
        while (this.canSwap(current, leftChild, rightChild)) {
            if (this.exists(leftChild) && this.exists(rightChild)) {
                if (this.heap.get(leftChild) < this.heap.get(rightChild)) {
                    this.swap(current, leftChild);
                    current = leftChild;
                    swapCount++;
                } else {
                    this.swap(current, rightChild);
                    current = rightChild;
                    swapCount++;
                }

            } else {
                this.swap(current, leftChild);
                current = leftChild;
                swapCount++;
            }
            leftChild = this.getLeft(current);
            rightChild = this.getRight(current);
        }
        if (this.size == 9999) {
            System.out.println("A heap of " + this.size + " elements was restored with only " + swapCount + " swaps!");
        }
    }

    private void swap(int a, int b) {
        int temp = this.heap.get(b);
        this.heap.set(b, this.heap.get(a));
        this.heap.set(a, temp);
    }

    private boolean exists(int index) {
        return index <= this.size;
    }

    private boolean canSwap(int current, int leftChild, int rightChild) {
        return (this.exists(leftChild) && (this.heap.get(current) > this.heap.get(leftChild)))
                || (this.exists(rightChild) && (this.heap.get(current) > this.heap.get(rightChild)));
    }

    public int getParent(int current) {
        return (int) Math.floor(current / 2);
    }

    public int getLeft(int current) {
        return current * 2;
    }

    public int getRight(int current) {
        return (current * 2) + 1;
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        // Populate minHeap with descending #s from 10001 to 1
        System.out.println("Adding 10000 individual elements...");
        for (int i = 10000; i >= 1; i--) {
            minHeap.add(i);
        }
        // Remove minimum value from minHeap
        System.out.println("Removing the minimum value...");
        System.out.println("Minimum value: " + minHeap.popMin());
    }
}