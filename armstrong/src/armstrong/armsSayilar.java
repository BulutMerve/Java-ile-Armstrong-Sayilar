package armstrong;

public class armsSayilar {

	public static void main(String[] args) {

		int a, b, c, sayi;
		double armstrong;

		System.out.println("100 ile 999 ars. arm sayýlar: ");

		for (a = 1; a <= 9; a++) {
			for (b = 0; b <= 9; b++) {
				for (c = 0; c <= 9; c++) {
					sayi = 100 * a + 10 * b + c;
					armstrong = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
					if (sayi == armstrong) {
						System.out.println(sayi);
					}

				}
			}
		}
		
	}
}
