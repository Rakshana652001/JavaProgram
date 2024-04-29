package com.chainsys.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;
public class CollectionPractice 
{
	@SuppressWarnings("unchecked")
	public static void main (String [] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList arrayList = new ArrayList();
		for(int initial=1 ; initial<=5; initial++)
		{
			arrayList.add(initial);
			//arrayList.addAll(arrayList);
			//arrayList.clear();
			//arrayList.contains(arrayList);
			//arrayList.trimToSize();
			//arrayList.toArray();
			//arrayList.spliterator();
			//arrayList.size();
			//arrayList.removeIf(null);
			//System.out.println(arrayList);
			//arrayList.remove(2);
			
			
		}
		System.out.println(arrayList);
		
		@SuppressWarnings("rawtypes")
		Vector v = new Vector();
		for(int initial=1;initial<=10;initial++) 
		{
			v.add(initial);
			v.firstElement();
			v.addElement("hi");
			v.get(initial);
			v.toString();
			v.size();
			//v.removeElementAt(1);
			v.remove(1);
			v.setSize(initial);
		}
		System.out.println(v);
		
		@SuppressWarnings("rawtypes")
		HashSet hs = new HashSet();
		for(int i=1; i<=5 ; i++)
		{
			hs.clear();
			hs.hashCode();
			hs.add(i);
			hs.toArray();
			hs.removeAll(v);
			hs.addAll(arrayList);
			
		}
		System.out.println(hs);
		
	}

}
