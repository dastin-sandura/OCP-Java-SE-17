class MainC {
	//Runtime error
	//Error: Main method is not static in class MainC, please define the main method as:
   	//public static void main(String[] args)
	public void main(String[] args) {
		System.out.println("Main C. First argument: " + args[0] + " from total" + args.length);
	}
}
