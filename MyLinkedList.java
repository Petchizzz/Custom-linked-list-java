
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
	}
}
public class linkedlist {
      node head;
      //add method
      public void add(int data) {
    	  node n=new node(data);
    	  if(head==null) {
    		  head=n;
    		  return;
    	  }
    	  node curr=head;
    	  while(curr.next!=null) {
    		  curr=curr.next;
    	  }
    	  curr.next=n;
      }
      //printmethod
      public void print() {
    	  node curr=head;
    	  while(curr!=null) {
    		  System.out.println(curr.data);
    		  curr=curr.next;
    	  }
      }
      //toString method
      public String toString() {
    	  //case1 if ll is empty
    	  StringBuffer s=new StringBuffer();
    	  if(head==null) {
    		  return "[]";
    	  }
    	  else {
    		  s.append("[");
    		 node curr=head;
    		 while(curr!=null) {
    			 s.append(curr.data);
    			 if(curr.next!=null)
    			 s.append(",");
    			 curr=curr.next;
    		 }
    		 s.append("]");
    	  }
    	  return s.toString();
      }
      //addFirstMethod
      public void addFirst(int data) {
    	  //case1 if ll is empty
    	  if(head==null) {
    		 node n=new node(data);
    		 head=n;
    	  }
    	  //case2 if ll is not empty
    	  else {
    		  node n=new node(data);
    		  n.next=head;
    		  head=n;
    	  }
      }
      //addLastt method
      public void addLast(int data) {
    	  add(data);
      }
      //Size method
      public int size() {
    	  int count=0;
    	  //if ll is empty
    	  if(head==null) {
    		  return count;
    	  }
    	  //if ll is not empty
    	  else {
    		  node curr=head;
    		  while(curr!=null) {
    			 curr= curr.next;
    			 count++;
    		  }
    	  }
    	  return count;
      }
      //add the data with index value
      public void add(int index,int data) {
    	  //case1 if ll is empty
    	  if(head==null&& index==0) {
    		  node n=new node(data);
    		  head=n;
    	  }
    	  else if(index<0 || index>0 &&head==null) {
    		  throw new IndexOutOfBoundsException("no node is present");
    	  }
    	  //case2 ll is not empty
    	  else {
    		  node n=new node(data);
    		  int count=0;
    		  node curr=head;
    		  while(count<index-1) {
    			  curr=curr.next;
    			  count++;
    		  }
    		  n.next=curr.next;
    		  curr.next=n;
    	  }
      }
      public void remove(int index) {
    	  if(index==0) {
    		  head=head.next;
    	  }
    	  node cur=head;
    	  int i=0;
    	  while(i<index-1) {
    		  cur=cur.next;
    		  i++;
    	  }
    	  cur.next=cur.next.next;
      }
      public int get(int index) {
    	  if(index<0||index>=size()) {
    		  throw new IndexOutOfBoundsException("nee first index oluinga kudu da potaa");
    	  }
    	 int i=0;
    	 node curr=head;
    	 while(i<index) {
    		 curr=curr.next;
    		i++;
    	 }
    	 return curr.data;
      }
      public myIteretor iterator() {
    	  return new myIt(head);
      }
      public void reverce() {
    	  node curr=head;
    	  node prev=null;
    	  while(curr!=null) {
    		  node next=curr.next;
    		  curr.next=prev;
    		  prev=curr;
    		  curr=next;
    		  
    	  }
    	 head=prev;
    	  
      }
}
	
	

