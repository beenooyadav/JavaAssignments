class SList<T> {
	private Node<T> head= new Node<T>();
	SListIterator<T> iterator() { return new SListIterator<T> (head) {//anynomous class emplementation
						Node<T> current=head;
						public boolean hasNext(){ return  current.next != null;}
						public Node<T> next() { 
							current=current.next;
							return current;
						}
						public void insert(T data) {
							current.next=new Node<T> (data,current.next);
							current=current.next;
						}
						public void remove() {
							if(current.next != null)
								current.next=current.next.next;
						}
					}; 
				    }

	public String toString() {
		SListIterator<T> it =this.iterator();
		StringBuilder s = new StringBuilder("SList: ["); 
		while(it.hasNext()) {
			s.append(it.next() + (it.hasNext() ? ", " : ""));
		}
		return s + "]";
	}
}
/*
class SListIterator<T> {
	Node<T> current;
	SListIterator (Node<T> head){
		current=head;
	}
        public boolean hasNext(){ return  current.next != null;}
        public Node<T> next() { 
        	current=current.next;
                return current;
        }
        public void insert(T data) {
        	current.next=new Node<T> (data,current.next);
                current=current.next;
        }
        public void remove() {
                if(current.next != null)
         	       current.next=current.next.next;
        }
}*/

class Node<T> {
	T data;
	Node<T> next;
	Node (T data, Node<T> next){
		this.data=data;
		this.next=next;
	}
	Node (T data){
                this.data=data;
                this.next=null;
        }
	Node (){
                this.data=null;
                this.next=null;
        }
	public String toString() {
		if(data == null) return "null";
		return data.toString();
	}
}

public class Iterator {
	public static void main(String[] args){
		SList<String> sl = new SList<String>();
		System.out.println(sl);
		SListIterator<String> slIter = sl.iterator();
		System.out.println("inserting \"hi\"");
		slIter.insert("hi");
		System.out.println(sl);
		System.out.println("inserting \"there\"");
		slIter.insert("there");
		System.out.println(sl);
		System.out.println("inserting \"krsna\"");
		slIter.insert("krsna");
		System.out.println(sl);
		System.out.println("inserting \"balram\"");
		slIter.insert("balram");
		System.out.println(sl);
		SListIterator<String> slIter2 = sl.iterator();
		System.out.println("removing \"hi\"");
		slIter2.remove();
		System.out.println(sl);
		System.out.println("inserting \"hello\"");
		slIter2.insert("hello");
		System.out.println(sl);
		System.out.println("removing \"there\"");
		slIter2.remove();
		System.out.println(sl);
		System.out.println("removing \"krsna\"");
		slIter2.remove();
		System.out.println(sl);
		System.out.println("removing \"balram\"");
		slIter2.remove();
		System.out.println(sl);
		System.out.println("removing \"hello\"");
		SListIterator slIter3 = sl.iterator();
		slIter3.remove();
		System.out.println(sl);	
	}
}
