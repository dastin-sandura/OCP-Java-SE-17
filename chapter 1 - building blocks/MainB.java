class MainB {
	//Compile error
	//MainB.java:3: error: invalid method declaration; return type required
        //public static final main(String[] args) {
        //                    ^
	//1 error
	public static final main(String[] args) {
		System.out.println("Main B. First argument: " + args[0] + " from total" + args.length);
	}
}
