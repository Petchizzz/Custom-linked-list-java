public class main {
		  public static void main(String[] args) {
			  linkedlist list=new linkedlist();
			  list.add(10);
			  list.add(20);
			  list.addLast(70);
			  list.add(30);
			  list.addFirst(30);
			  list.print();
			  list.addLast(50);
			  list.add(3,40);
			  System.out.println(list.toString());
			  list.reverce();
			  System.out.println(list.toString());
			  
			  list.remove(0);
			 System.out.println(  list.get(7));
			 System.out.println(list);
			 System.out.println(list.size()); 
	          myIteretor pointer=list.iterator();	
	          while(pointer.Hasnext()) {
	        	  System.out.println(pointer.Next());
	          }
	          }  
		  }
