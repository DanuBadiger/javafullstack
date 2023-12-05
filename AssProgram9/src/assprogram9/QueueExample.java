package assprogram9;

import java.util.*;

public class QueueExample 
{
public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
                locationsQueue.add("Dharwad");
        		locationsQueue.add("Belgavi");
        		locationsQueue.add("Banglore");
        		locationsQueue.add("Bijapur");
        		locationsQueue.add("Hubli");
                System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}
