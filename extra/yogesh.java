class yogesh {
	public static void main(String[] args) {
		
		try {
			int a = 10;	//	number input	
			if(a<=0) {		//	if else etc...
				//	throwing manual exception
				throw new Exception("negative number found!");	
			}
			System.out.println("yogeshhhhh");
		}

		catch(Exception e) {
			System.out.println("error:" + e);
		}

		
	}
}