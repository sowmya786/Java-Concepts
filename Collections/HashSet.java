package Collections;
		
		public class HashSet {
		    public static void main(String[] args) {

		        java.util.HashSet<String> set = new java.util.HashSet<>();
		        
		        set.add("get");
				 set.add("sendkeys");
				 set.add("getAttribute");
				 set.add("getTagName");
				 set.add("getText");
				 set.add("getSize");
				 set.add("close");
				 set.add("quit");
				 set.add("getTitle");
				 set.add("getCurrentUrl");
				 
				 System.out.println(set.clone());
				 
				 set.remove("get");
			        System.out.println("After removing element:");
			        System.out.println("set = " + set);
			        
			        System.out.println(set.isEmpty());
			        
			        System.out.println(set.size());
			        
			        System.out.println(set.contains("get"));
			        
			        set.clear();
	}

}
