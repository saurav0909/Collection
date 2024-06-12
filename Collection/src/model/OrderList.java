package model;

import java.util.AbstractList;
import java.util.Arrays;

public class OrderList<E> extends AbstractList<E>{
	
	private Object[] orders;
	private int size;
	
	@SuppressWarnings("unchecked")
	public OrderList(int capacity) {
		orders=(E[])new Object[capacity];
		size=0;
	}
	
	@Override
	public E get(int index) {
		if(index>=size || index<0) {
			throw new IndexOutOfBoundsException("Index: " +index+ ", Size: "+size );
		}
		return (E) orders[index];
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public boolean add(E e) {
		if(size == orders.length) {
			resize();
		}
		
		orders[size++]=e;
		return true;
	}
	
	private void resize() {
		int newSize=orders.length*2;
		orders=Arrays.copyOf(orders, newSize);
		
	}

	public E remove(int index) {
		System.out.println("remove started");
		if(index>=size || index<0) {
			throw new IndexOutOfBoundsException("Index: " +index+ ", Size: "+size );
		}
		
		E oldValue=(E) orders[index];
		int numMoved=size-index-1;
		
		if(numMoved>0) {
			System.arraycopy(orders, index+1, orders, index, numMoved);
		}
		orders[--size]=null;
		System.out.println("remove ended");
		return oldValue;
	}
	

}
