package Examen1;
public class ArrayList<E> implements List<E> {
	public Object[] top;
	private int size;
	private int initialCapacity = 5;
	private int extraCapacity = 5;
	
	/**
	 * Creates a new ArrayList instance with the default initial capacity.
	 */
	public ArrayList() {
		top = new Object[initialCapacity];
		size = 0;
	}
	
	/**
	 * Increases the capacity of this ArrayList instance so that it 
	 * can hold at least extraCapacity elements more.
	 * This method allocates a new array with greater capacity than the
	 * current one (top.length + extraCapacity) and copies all elements
	 * from top to the newly allocated array. The reference top is then
	 * updated to point to the new array. 
	 * @param extraCapacity increase the capacity of this ArrayList by this amount
	 */
	private void reserveExtraCapacity(int extraCapacity) {
            
            ArrayList<E> temp;
            temp = new ArrayList();
            temp.initialCapacity+=extraCapacity;
            //size=initialCapacity+extraCapacity;
            top=temp.top;
            
            
	}
	
	/**
	 * Increases the capacity of this list if its size equals the length of the array
	 * where the data is stored. This method calls reserveExtraCapacity when (size() >= top.length).
	 * reserveExtraCapacity is called using the instance variable extraCapacity.
	 */
	private void ensureCapacity() {
            
            if(size() >= top.length){
                reserveExtraCapacity(extraCapacity);
                
            }
            
	}
	
	/**
	 * Shifts elements in the array (top) to the right, starting at the given position.
	 * @param index the position in which the shift will begin
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
	 */
	private void shiftContentsRight(int index) {
            
            if(index<0 || index>size())
                throw new IndexOutOfBoundsException();
            for(int i=index; i<top.length; i++){
                top[index]=top[index+1];
                }   
	}
	
	@Override
	public void addFirst(E e) {
            size++;
            shiftContentsRight(0);
            top[0]=e;
	}

	@Override
	public void addLast(E e) {
            size++;
            shiftContentsRight(size);
            top[size+1]=e;
	}

	@Override
	public void add(int index, E element) {
            int count=0;
            for(int i=0; i<top.length; i++){
                if(count==index){
                    size++;
                    shiftContentsRight(index);
                    top[i]=element;
                   
                }
                count++;
            }
	}

	@Override
	public E getFirst() {
		return (E) top[0];
	}

	
	@Override
	public E getLast() {
		return (E) top[size];
	}

	
	@Override
	public E get(int index) {
		int count =0;
                for(int i=0; i<top.length;i++){
                    if(count==index){
                        return (E) top[i];
                    }
                    count++;
                }
                return null;
	}

	@Override
	public E set(int index, E element) {
		int count=0;
                for(int i=0; i<top.length;i++){
                    if(index==count){
                        size++;
                        shiftContentsRight(index);
                        top[i]=element;
                    }
                    count++;
                }
                return (E) top;
	}

	@Override
	public void clear() {
            for(int i=0;i<top.length;i++){
            top[i]="";
        }
            size=0;
            
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public String toString() {
                String salida ="";
		if(top.length==0 || top.equals(null)){
                    return"[]";
                }
                for(int i=0; i<top.length;i++){
                    salida+=top[i];
                }
                return "["+salida+"]";
                
	}
}
