package classAbstraction_Encapsulation.stack;

public class StackOfIntegers {
    private int[] elements;
    public static final int DEFAULT_CAPACITY = 16; // max capacity 16
    private int size; // By default, integer is always initialized to 0

    // Construct a stack with the default capacity 16
    public StackOfIntegers() { // default constructor
        this(DEFAULT_CAPACITY); // call the other constructor
    }

    // Construct a stack with the specified capacity
    public StackOfIntegers(int capacity) {
        elements = new int[capacity]; // create an array called elements
    }

    // Push a new integer to the top of the stack
    public void push(int value) {
        if (size >= elements.length) { // ? size哪里来
            int[] temp = new int[elements.length * 2]; // 使temp array的长度翻倍 // 下一行复制原始element array 到 temp array
            System.arraycopy(elements, 0, temp, 0, elements.length); // (source array, source array 起始位置， 目标array，目标array起始位置， 要copy array的长度)
            elements = temp; // 让elements array 的reference指向temp array
        }

        elements[size++] = value;
    }

    // Return and remove the top element from the stack
    public int pop() {
        return elements[--size]; // --在前，表示先执行--，后显示减后的结果。 // 相当于： int temp = elements[size-1];
    }                                                                        //  size--;
                                                                             //  return temp;
    // Return the top element from the stack
    public int peek() {
        return elements[size - 1];
    }

    // Test whether the stack is empty
    public boolean empty() {
        return size == 0;
    }

    // Return the number of elements in the stack
    public int getSize() {
        return size;
    }
}
