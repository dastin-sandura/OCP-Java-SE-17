class MainA {
	//Runtime error
	//Error: Main method not found in class MainA, please define the main method as:
   	//public static void main(String[] args)
	//or a JavaFX application class must extend javafx.application.Application
	private static void main(String[] args) {
		System.out.println("Main A. First argument: " + args[0] + " from total" + args.length);
	}
}
