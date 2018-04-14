package cn.guo.myCollection;

import java.util.ArrayList;

/**
 * 模拟
 */
public class MyArrayList {
    /**
     * The value is used for Object storage.
     */
    private Object[] value;

    /**
     * The size is the number of Objects used.
     */
    private int size;

    public MyArrayList(){
//    	value = new Object[16];
    	this(10);
    }
    public MyArrayList(int size){
     	if(size<0){
    		try {
				throw new Exception();//手动抛出异常
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	value = new Object[size];
    }
    
    
    public int size(){
    	return size;
    }
    
    public void add(Object obj){
    	value[size] = obj;
    	size++;
    	if(size>=value.length){
    		//装不下了。扩容吧
    		int newCapacity = value.length*2;
    		Object[] newList = new Object[newCapacity];
//    		System.arraycopy(src, srcPos, dest, destPos, length);
    		for(int i=0;i<value.length;i++){
    			newList[i] = value[i];
    			
    		}
    		value = newList;
    	}
    }

    public Object get(int index){
    	rangeCheck(index);
    	return value[index];
    }
    
    public int indexOf(Object obj){
    	if(obj == null){
    		return -1;
    	}else{
    		for(int i=0;i<value.length;i++){
    			if(obj==value[i]){
    				return i;
    			}
    		}
    		return -1;
    	}
    }
    
    public int lastindexOf(Object obj){
    	if(obj == null){
    		return -1;
    	}else{
    		for(int i=value.length;i>=0;i--){
    			if(obj==value[i]){
    				return i;
    			}
    		}
    		return -1;
    	}
    }
    
    public Object set(int index, Object object) {
    	rangeCheck(index);
    	Object old = value[index];
        value[index] = object;
        return old;
    }
    
    public void rangeCheck(int index){
    	if(index<0||index>size-1){
    		try {
				throw new Exception();//手动抛出异常
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    
    ArrayList al;
    public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add("aaa");
		list.add(new Human("郭帅"));
		list.add("5555");
		list.add("5555");
		list.add(1234);
		list.add("5555");
		list.add("5555");
		
		Human h = (Human)list.get(1);
		System.out.println(h.getName());

		System.out.println(list.get(2));
		
		System.out.println(list.size);
		
	}
}

