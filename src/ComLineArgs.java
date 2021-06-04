class ComLineArgs {
	public static void main(String args[]) {
		if (args.length != 0) {
			// With the help of CMA you can pass all arguments in String Only.
			System.out.println("This argument is coming from:" + args[0] + " " + args[1]);
			// int c = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
			// System.out.println(c);
		} else {
			System.out.println("Atleat 2 Arguments are required.");
		}
	}
}