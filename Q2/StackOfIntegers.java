public class StackOfIntegers 
{
    private static int[] elements;
    private static int size ;
    int capacity;

    
    public StackOfIntegers()
    {
        capacity = 20;
        elements = new int [capacity];
        size = 0;
    }
    
    
    public StackOfIntegers(int newcapacity)
    {
        capacity = newcapacity;
        elements = new int [capacity];
        size = 0;
    }

    public boolean empty()
    {
        boolean isempty;
        if (getSize() == 0)
        {
            isempty = true;
        }
        else
        {
            isempty = false;
        }
        return isempty;
    }

    public int peek()
    {
        return elements[size];
    }

    public void push(int value)
    {
        elements[size] = value;
        size++;
    }

    public int pop()
    {
        int value = elements[size-1];
        size--;
        return value;
    }

    public static int getSize()
    {
        return size;
    }
}
