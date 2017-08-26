package newpackage;
        
import java.util.NoSuchElementException;

public class SLinkedList<E> implements List<E> {
	private SNode<E> top;
	private int size;
	
	public SLinkedList() {
		top = new SNode<E>();
		size = 0;
	}

	@Override
	public void addFirst(E e) {
		SNode<E> newNode = new SNode<E>(e);
		newNode.next = top.next;
		top.next = newNode;
		size++;// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(E e) {
            SNode<E> newNode = new SNode<E>(e);
            
            SNode<E> current = top;
            while(current.next!=null)
                current = current.next;
            current.next=newNode;
            size++;// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int index, E element) {
            SNode<E> aux=top;
            SNode<E> nuevo= null;
            int cont=0;
            if(index<0 || index<size){
                System.out.println("La posicion no es correcta");
            }else{
                if(index==0){
                    addFirst(element);
                }else if(index==size){
                    addLast(element);
                }else{
                    while(aux!=null){
                        if(index==cont){
                            nuevo=new SNode<>(element);
                            aux.next=nuevo;
                            size++;
                        }
                        cont++;
                    }
                }
            }

	}

	@Override
	public E removeFirst() {
		if(top.next==null){
                throw new NoSuchElementException();
            }
            
            SNode<E> nodeToRemove=top.next;
            top.next=nodeToRemove.next;
            nodeToRemove.next=null;
            size--;
            return nodeToRemove.value;// TODO Auto-generated method stub
		
	}

	@Override
	public E removeLast() {
		if(top.next==null){
                throw new NoSuchElementException();
            }
            
            SNode<E> current=top;
            while(current.next.next!=null)
                current=current.next;
            SNode<E> nodeToRemove= current.next;
            current.next=null;
            size--;
            return nodeToRemove.value;// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
            SNode<E> current=top;
            SNode<E> NodetORemove;
            int count=0;
            if(index==0){
                removeFirst();
            }else{
                if(index==size){
                    removeLast();
                }else{
                    while(current!=null){
                        if(index==count){
                            NodetORemove = current.next;
                            
                            current.next=current.next.next;
                            
                            size--;
                            return NodetORemove.value;
                        }else{
                        current=current.next;
                        count++;
                        }
                        
                    }
                    size--;   
                }
               
            }
            return null;
	}

	@Override
	public boolean remove(Object o) {
		SNode<E> current = top;
            
                while(current!=null){
                    if(o.equals(current.next.value)){
                       
                        current.next=current.next.next;
                        size--;
                        return true;
                    }else{
                    current=current.next;
                    }
                    
                }
		return false;
	}

	@Override
	public E getFirst(){
                if(top.next==null){
                throw new NoSuchElementException();
            }
            return top.next.value;
	
	}

	@Override
	public E getLast() {
		if(top.next==null){
                throw new NoSuchElementException();
            } 
           SNode<E> current= top.next;
           while(current.next!=null)
               current=current.next;
           return current.value;
	}

	@Override
	public E get(int index) {
		SNode<E> current=top;
                int count=0;
                while(current!=null){
                    if(count==index){
                        return current.next.value;
                    }else{
                        count++;
                        current=current.next;
                    }
                }
		return null;
	}

	@Override
	public E set(int index, E element) {
                SNode<E> current=top;
                int count=0;
                while(current!=null){
                    if(count==index){
                        current.next.value=element;
                        return current.value;
                    }else{
                        count++;
                        current=current.next;
                    }
                }
		return null;
	}

	@Override
	public boolean contains(E e) {
		SNode<E> current=top;
                while(current!=null){
                   if(current.value==e){
                       return true;}else{
                       current=current.next;
                       }
                   
               
               
	}return false;}

	@Override
	public int indexOf(Object o) {
		int index = 0;
		
		if(o == null) {
			for(SNode<E> x = top.next; x != null; x = x.next) {
				if(x.value == null)
					return index;
				index++;
			}
		}
		else {
			for(SNode<E> x = top.next; x != null; x = x.next) {
				if(o.equals(x.value))
					return index;
				index++;
			}
		}
		return -1;// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		top.next = null;
		size= 0;
// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size()==0;
	}

	@Override
	public Object[] toArray() {
		String [] arr;
                String aux="";
                SNode<E> current=top;
                while(current!=null){
                    
                    aux+=current.value+" ";
                    current=current.next;
                }
		arr=aux.split(" ");
                return arr;
	}
	
	public String toString() {
            		if(top.next == null)
			return "[]";
		
		SNode<E> current = top.next;
		String returnValue = "[" + current.value;
		while(current.next != null) {
			current = current.next;
			returnValue += ", " + current.value;
		}
		
		returnValue += "]";
		return returnValue;	
	}
}
