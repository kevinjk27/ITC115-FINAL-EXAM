
public class LibraryClient {

	public static void main(String[] args) {
		Books ABC = new Books();
		Magazines DEF = new Magazines();
		VideoDVDs HIJ = new VideoDVDs();
		CDs KLM = new CDs();
		

		ABC.setBorrowDate("2020-05-23");
		ABC.setMUSTreturnDate("2020-05-30");
		ABC.setACTUALreturnDate("2020-06-02");
		ABC.setTitle("The Cat in the Hat");

		DEF.setBorrowDate("2020-07-23");
		DEF.setMUSTreturnDate("2020-08-30");
		DEF.setACTUALreturnDate("2020-08-09");
		DEF.setTitle("Vanity Fair January 2020");
		
		
		HIJ.setBorrowDate("2020-07-23");
		HIJ.setMUSTreturnDate("2020-07-30");
		HIJ.setACTUALreturnDate("2020-08-09");
		HIJ.setTitle("TOP GUN");
		
		KLM.setBorrowDate("2020-05-23");
		KLM.setMUSTreturnDate("2020-08-30");
		KLM.setACTUALreturnDate("2020-12-27");
		KLM.setTitle("24K Magic");
		
		

		System.out.println(ABC.toString());
		System.out.println(ABC.chekedIN());
		System.out.println("");
		
		System.out.println(DEF.toString());
		System.out.println(DEF.chekedIN());
		System.out.println("");
		
		System.out.println(HIJ.toString());
		System.out.println(HIJ.chekedIN());
		System.out.println("");
		
		System.out.println(KLM.toString());
		System.out.println(KLM.chekedIN());
		System.out.println("");

	}

}
