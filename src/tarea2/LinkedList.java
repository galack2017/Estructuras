package tarea2;

import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E> {
	private Node<E> header;
	private int size;
	
	public LinkedList() {
		header = new Node<E>();
		size = 0;
	}
	
	/**
	 * Gets the node at the specified index.
	 * @param index the index of the node to get.
	 * @return the node at the specified position
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
	 */
	private Node<E> node(int index){
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index < (size >> 1)) {
			Node<E> x = header.next;
			for(int i=0; i<index; i++)
				x = x.next;
			return x;
		} else {
			Node<E> x = header.prev;
			for(int i = size - 1; i > index; i--)
				x = x.prev;
			return x;
		}
	}
	
	@Override
	public void addFirst(E e) {
		Node<E> newElement = new Node<E>(e);
		
		Node<E> firstElement = header.next;
		newElement.next = firstElement;
		firstElement.prev = newElement;
		
		newElement.prev = header;
		header.next = newElement;
		
		size++;
                
	}

	@Override
	public void addLast(E e) {
		Node<E> newElement= new Node<E>(e);
                Node<E> current = header;
                while(current.next!=header){
                    current=current.next;
                }
                current.next=newElement;
                newElement.next=header;
                newElement.prev=current;
                header.prev=newElement;
                size++;
                
        }
              
		
            
        

	@Override
	public void add(int index, E element) {
		if(index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index == size()) {
			addLast(element);
		} else {
			Node<E> newNode = new Node<E>(element);
			Node<E> current = node(index);
			Node<E> previousNode = current.prev;
			
			newNode.prev = previousNode;
			previousNode.next = newNode;
			
			newNode.next = current;
			current.prev = newNode;
			size++;
		}
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		if(header.next==null){
                    throw new NoSuchElementException();
                };
                
                Node<E> NodeToRemove = header.next;
                header.next=NodeToRemove.next;
                NodeToRemove.prev=NodeToRemove.next;
                size--;
                return NodeToRemove.value;
               
                
                
	}

	@Override
	public E removeLast() {
            if(header.next==null){
                throw new NoSuchElementException();
            }
		Node<E> current=header;
                while(current.next.next!=header){
                    current=current.next;
                }
                Node<E> NodeToRemove = current.next;
                current.next=header;
                header.prev=current;
                size--;
                return NodeToRemove.value;
		
	}

	@Override
	public E remove(int index) {
            if(index<0 || index<size){
                System.out.println("La posicion no es correcta");}
		Node<E> current =header;
                Node<E> NodeToRemove;
                int count=0;
                if(index==0)
                    removeFirst();
                if(index==size)
                    removeLast();
                while(current!=null)
		if(index==count){
                    NodeToRemove=current.next;
                    Node<E> NUEVO= current.next.next;
                    current.next=NUEVO;
                    NUEVO.prev=current;
                    NodeToRemove.prev=null;
                    NodeToRemove.next=null;
                    
                    size--;
                    return NodeToRemove.value;
                }else{
                    current=current.next;
                    count++;
                }
            return null;    
	}

	@Override
	public boolean remove(Object o) {
		Node<E> current =header;
                if(current.equals(o)){
                    Node<E> NodeToRemove = current.next;
                    Node<E> siguiente=current.next.next;
                    NodeToRemove.next=null;
                    NodeToRemove.prev=null;
                    current.next=siguiente;
                    siguiente.prev=current;
                    size--;
                }
                while(current.next!=header){
                    current=current.next;
                    if(o.equals(current.next.value)){
                    Node<E> NodeToRemove = current.next;
                    Node<E> siguiente=current.next.next;
                    NodeToRemove.next=null;
                    NodeToRemove.prev=null;
                    current.next=siguiente;
                    siguiente.prev=current;
                    size--;
                    return true;
                    }
                }
               return false; 
	}

	@Override
	public E getFirst() {
		Node<E> current = header;// TODO Auto-generated method stub
		return current.next.value;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		Node<E> current = header.prev;
                return current.value;
	}

	@Override
	public E get(int index) {
		Node<E> current = header;
                int count=0;
		while(current.next!=header){
                    current=current.next;
                    if(index==count){
                        return current.value;
                    }
                    count++;
                }
                return null;
	}

	@Override
	public E set(int index, E element) {
                Node<E> NewNode = new Node<E>(element);
		Node<E> current = header;
                int cuenta=0;
                while(current.next!=header){
                    current=current.next;
                    if(cuenta==index-1){
                        Node<E> sig = current.next.next;
                        current.next=NewNode;
                        NewNode.prev=current;
                        NewNode.next=sig;
                        sig.prev=current;
                        size++;
                        return NewNode.value;
                        
                    }
                    cuenta++;
                }
                return null;
	}

	@Override
	public boolean contains(E e) {
		Node<E> current = header;
                if(current.value==e){
                    return true;
                }
                while(current.next!=header){
                    current=current.next;
                    if(current.value==e){
                        return true;
                    }
                }
		return false;
	}

	@Override
	public int indexOf(Object o) {
		int index=0;
                if(o == null) {
			for(Node<E> x = header.next; x != null; x = x.next) {
				if(x.value == null)
					return index;
				index++;
			}
		}
		else {
			for(Node<E> x = header.next; x != null; x = x.next) {
				if(o.equals(x.value))
					return index;
				index++;
			}
		}
		return -1;
	}

	@Override
	public void clear() {
            Node<E> cur=header;
            while(cur.next!=header){
                removeFirst();
            }
	}

	@Override
	public int size() {
		return size;// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size()==0;
	}

	@Override
	public Object[] toArray() {
                String arr[];
                String aux="";
                Node<E> current=header.next;
                while(current!=header){
                    aux+=current.value+" ";
                    current=current.next;
                }
                arr=aux.split(" ");
		return arr;
	}
        
        @Override
        public String toString(){
            if(header.next.value==null){
                return "[]";
            }
             
             Node<E> current = header.next;
             String returnValue= "["+current.value;
             while(current.next!=header){
                 current=current.next;
                 returnValue+=","+current.value;
             }
             
             returnValue+="]";
             return returnValue;
        }

}
