/**
 * 
 */
package org.algorthmica.classroom.prirotiyQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kaamesh
 *
 */
public class HeapTreePQ implements IPQueue {
	private ArrayList<Integer> heaptree;

	public HeapTreePQ() {

	}

	// TC - O(1)
	@Override
	public Integer findMin() {
		// TODO Auto-generated method stub
		if (heaptree.isEmpty())
			return null;
		else
			return heaptree.get(0);
	}

	@Override
	public Integer removeMin() {
		
		return null;
		// TODO Auto-generated method stub
	}

	// TC -- O(n)
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(heaptree.toString());
	}

	private void swap(int i, int j) {
		Integer tmp = heaptree.get(i);
		heaptree.set(i, heaptree.get(j));
		heaptree.set(j, tmp);
	}

	// Adding the element at the last index
	// Recursive call to keep on moving to the last node and keep adding
	// O(logn)
	@Override
	public void add(Integer e) {
		// TODO Auto-generated method stub
		heaptree.add(e);
		int current = heaptree.size() - 1;
		while (current > 0) {

			int res = heaptree.get(current).compareTo(heaptree.get(current - 1 / 2));
			if (res < 0) {
				swap(current, (current - 1) / 2);
				current = (current - 1) / 2;
			} else
				break;
		}

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return heaptree.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return heaptree.isEmpty();
	}

}
