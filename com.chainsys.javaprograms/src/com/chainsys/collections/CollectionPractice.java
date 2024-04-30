package com.chainsys.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
public class CollectionPractice 
{
	public static <E> void main (String [] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList arrayList = new ArrayList();//1
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
		arrayList.remove(4);//remove 0th position numbers
		System.out.println("Remove: "+arrayList);
		System.out.println("Contins: "+arrayList.contains(4));
		//arrayList.replaceAll(null);
		//System.out.println("Replaceall: "+arrayList);
		
		
		
		
		@SuppressWarnings("rawtypes")
		Vector v = new Vector();//2
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
		HashSet hs = new HashSet();//3
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
		LinkedList q = new LinkedList();//4
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
		
	
		
		@SuppressWarnings("rawtypes")
		HashMap hm = new HashMap();//5
		for(int h=1;h<=5;h++)
		{
			hm.size();
			System.out.println("Put: "+hm.put(1,10));
		}
		hm.size();
		System.out.println("Put: "+hm.put(1, 10));
		System.out.println("Hash Map: "+hm);
		System.out.println("ToString: "+hm.toString());
		hm.putAll(hm);
		System.out.println("Remove: "+hm.remove(hm));
		hm.remove(hm, v);
		System.out.println("Remove: "+hm);
		hm.entrySet();
		System.out.println("Entry set: "+hm);
		
		
		
	
		
		LinkedHashMap copy = new LinkedHashMap();//6
		System.out.println("\ncopy: "+copy.put("R", 100)); //r variable 100 assingning to it
		//copy.putAll(copy);
		System.out.println("LinkedHashMap: "+copy);
		System.out.println("ToString: "+copy.toString());
		copy.replace("R", 20);
		System.out.println("Replace: "+copy);
		System.out.println("Values: "+copy.values());
		copy.replace("R", 40);
		System.out.println(copy);
		System.out.println(copy.remove(copy));
		
		
		
		
		
		Queue q1 = new LinkedList();//7
		for(int i1=1; i1<=10; i1++)
		{
			System.out.println(q1.add(i1));
			
		}
		System.out.println(q.equals(hs));
		System.out.println("LinkedList add: "+q1);
		System.out.println("LinkedList poll: "+q1.poll());
		System.out.println(q1);
		System.out.println(q1.offer(100));
		System.out.println(q1);
		
		
		
		
		Deque dq = new LinkedList();//8
		for(int i1=1; i1<=10; i1++)
		{
			System.out.println(dq.add(i1));
			
		}
		System.out.println(q.equals(hs));
		System.out.println("LinkedList add: "+dq);
		System.out.println("LinkedList poll: "+dq.poll());
		System.out.println(dq);
		System.out.println(dq.offer(100));
		System.out.println(dq);
		dq.descendingIterator();
		System.out.println("Decending: "+dq);
		System.out.println("PeekFirst: "+dq.peekFirst());//print first
		System.out.println("PeekLast: "+dq.peekLast());
		dq.addFirst(200);
		System.out.println("AddFirst: "+dq);//add number
		dq.addLast(300);
		System.out.println("AddLast: "+dq);
		dq.offerLast(400);
		System.out.println("Offer last: "+dq);//add number
		System.out.println("PollFirst: "+dq.pollFirst());//remove number
		System.out.println(dq);
		dq.push(12);//push number first
		System.out.println("Push: "+dq);
		dq.removeLastOccurrence(dq);
		System.out.println("RemoveLastOccerence: "+dq);
		System.out.println("Remove last: "+dq.removeLast());//removeLast number
		System.out.println(dq);
	
		
		
		
		TreeSet ts = new TreeSet();//9
		for(int t=1;t<=5;t++)
		{
			ts.add(t);
		}
		ts.add(12);//add at last
		System.out.println("Add: "+ts);
		
		System.out.println("Contains: "+ts.contains(2));
		System.out.println("Cealing:"+ts.ceiling(3));
		
		System.out.println("Containsall: "+ts.containsAll(dq));
		System.out.println("Containsall: "+ts.containsAll(arrayList));
		ts.add(13);
		System.out.println(ts);
		System.out.println("Size: "+ts.size());
		ts.pollLast();
		System.out.println(ts);//remove last

		
	
		ArrayDeque adq = new ArrayDeque();//10
		for(int a1=10;a1<=20;a1++)
		{
			adq.add(a1);
		}
		System.out.println("Add: "+adq);
		System.out.println("Add: "+adq.add(120));
		System.out.println(adq);
		System.out.println("Contains: "+adq.contains(120));
		System.out.println("Size: "+adq.size());
		System.out.println("Descending: "+adq.descendingIterator());

		TreeMap tm = new TreeMap();
		for(int t=1;t<=5;t++)
		{
			tm.put("TreeMap", 12);
			tm.put("TreeMap", 13);
			tm.put("TreeMap", 14);
			tm.putAll(tm);
		}
		System.out.println("Ceiling entry: "+tm);
		
		
	}

}
