/**
 * 
 */
package org.algorthmica.classroom.setandmap;
 
import org.algorthmica.classroom.setandmap.interfaces.ISet;

/**
 * @author Kaamesh
 *
 */
public class HashSet implements ISet {
	
	
private ListNode[] htbl;
private int size;
private static final int INIT_BCKETS=11;

public HashSet() {
	htbl = new ListNode[INIT_BCKETS];
    for (int i=0;i<INIT_BCKETS;++i) {
    	htbl[i]=new ListNode();
    }
	
}

private void rehash() {
	
}
	/* (non-Javadoc)
	 * @see org.algorthmica.classroom.setandmap.interfaces.ISet#add(java.lang.Integer)
	 */
	@Override
	public boolean add(Integer key) {
		/*if (size/htbl.length>THRESHOLD) {
			rehash();
		}*/
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.algorthmica.classroom.setandmap.interfaces.ISet#contains(java.lang.Integer)
	 */
	@Override
	public boolean contains(Integer key) {
		// TODO Auto-generated method stub
		int bindex = key.hashCode()%htbl.length;
		ListNode current = htbl[bindex].next;
		for (;current!=null;current=current.next) {
			if (current.data.equals(key))
				return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.algorthmica.classroom.setandmap.interfaces.ISet#remove(java.lang.Integer)
	 */
	@Override
	public boolean remove(Integer key) {
		// TODO Auto-generated method stub
		int bindex = key.hashCode()%htbl.length;
		ListNode current = htbl[bindex];
		for (;current!=null;current=current.next) {
			if (current.next.data.equals(key))
			{
				current.next = current.next.next;
				--size;
				return true;
			}
				
		}
		
		return false;
	}

	/* (non-Javadoc)
	 * @see org.algorthmica.classroom.setandmap.interfaces.ISet#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	/* (non-Javadoc)
	 * @see org.algorthmica.classroom.setandmap.interfaces.ISet#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
         for (int i=0;i<htbl.length;++i) {
        	 System.out.println("buket is "+i);
        	 for (ListNode current=htbl[i].next;current!=null;current=current.next) {
        		 System.out.println(current.data+" ");
        	 }
         }
	}

}
