package com.chainsys.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
public class CollectionPractice 
{
	@SuppressWarnings("unchecked")
	public static <E> void main (String [] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList arrayList = new ArrayList();
		for(int initial=1 ; initial<=5; initial++)
		{
			arrayList.add(initial);
			System.out.println("Array List contains: "+arrayList.contains(5));
			//arrayList.toArray();
			//arrayList.spliterator();
			//arrayList.removeIf(null);
			//System.out.println(arrayList);
		}
		System.out.println("Array List: "+arrayList);
		arrayList.trimToSize();
		//System.out.println("Trime: "+arrayList.ensureCapacity(0));
		System.out.println("ArrayList addall: "+arrayList.addAll(arrayList));
		System.out.println("ArrayList Size: "+arrayList.size());
		System.out.println("ArrayList remove: "+arrayList.remove(2));
		System.out.println("Array List after remove: "+arrayList);
		
		
		
		@SuppressWarnings("rawtypes")
		Vector v = new Vector();
		for(int initial=1;initial<=10;initial++) 
		{
			v.add(initial);
			v.trimToSize();
			v.addElement("99");
			
			v.toString();
			v.size();
			//v.removeElementAt(1);
			v.remove(1);
			//System.out.println("Vector size: "+v.setSize(initial));
			//System.out.println("Vector get: "+v.get(initial));
		}
		System.out.println("Capacity: "+v.capacity());
		System.out.println("trime: "+v);
		v.trimToSize();
		System.out.println("Afetr trim: "+v.capacity());
		System.out.println("vector: "+v);
		System.out.println("Vector firstelement: "+v.firstElement());
		System.out.println("Vector Clone: "+v.clone());
		
		
		
		@SuppressWarnings("rawtypes")
		HashSet hs = new HashSet();
		for(int i=1; i<=5 ; i++)
		{
			hs.add(i);
		}
		System.out.println("HashSet: "+hs.hashCode());
		System.out.println("HashSet ToArray: "+hs.toArray());
		System.out.println("HashSet Remove: "+hs.removeAll(v));
		System.out.println("HashSet AddAll: "+hs.addAll(arrayList));
		System.out.println("HashSet clone: "+hs.clone());
		System.out.println("HashSet Size: "+hs.size());
		
		@SuppressWarnings("rawtypes")
		LinkedList q = new LinkedList();
		for(int i=1; i<=10; i++)
		{
			System.out.println(q.add(i));
			
		}
		System.out.println(q.equals(hs));
		System.out.println("LinkedList add: "+q);
		System.out.println("LinkedList pop: "+q.pop());
		System.out.println("LinkedList offer 99: "+q.offerFirst(99));
		System.out.println(q);
		System.out.println("Offer last: "+q.offerLast(100));
		System.out.println(q);
		System.out.println("Decending:"+q.descendingIterator());
		System.out.println(q.indexOf(3)); //give size
		System.out.println("LinkedList hashCode(): "+q.hashCode());
		System.out.println("LinkedList peek: "+q.peek());
		System.out.println("LinkedList element: "+q.element());
		System.out.println("LinkedList Remove: "+q.remove());
		System.out.println("LinkedList add after remove: "+q);
		System.out.println("LinkedList Offer: "+q.offer(4));
		System.out.println(q);
		System.out.println("LinkedList Size: "+q.size());
		System.out.println("LinkedList itrator: "+q.iterator());
		//System.out.println("LinkedList Remove: "+q.removeAll(q));
		//System.out.println("LinkedList add: "+q);
		System.out.println("LinkedList remove last: "+q.removeLast());
		q.removeFirstOccurrence(4);
		System.out.println(q);
		q.removeLastOccurrence(100);
		System.out.println(q);
		q.push(200);
		System.out.println(q);
		q.spliterator();
		System.out.println(q);
		System.out.println(q.lastIndexOf(3));
		System.out.println(q);
		System.out.println(q.get(4));
		
		Iterator<E> i = q.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	
	}

}
