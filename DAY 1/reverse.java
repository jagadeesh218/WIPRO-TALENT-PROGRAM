public class backwards {

	public backwards() {
		
	}

	public static void main(String[] args) {
		int number = 100;
		while (number> 0) {
		    for (int i = 100; i>number; i-=1) {
		        System.out.println(i + " ");
		    }
		    System.out.println("");
		    number-=1;
		}

	}

}
