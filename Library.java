import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Library {
	protected int itemNumber;
	private static int nextItemNumber = 1;
	protected String title;
	

	String borrowDate;
	String MUSTreturnDate;

	String ACTUALreturnDate;

	public String getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}

	public String getMUSTreturnDate() {
		return MUSTreturnDate;
	}

	public void setMUSTreturnDate(String mUSTreturnDate) {
		MUSTreturnDate = mUSTreturnDate;
	}

	public String getACTUALreturnDate() {
		return ACTUALreturnDate;
	}

	public void setACTUALreturnDate(String aCTUALreturnDate) {
		ACTUALreturnDate = aCTUALreturnDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String reserved() {
		return title + " is currently reserved!";
	}

	public String chekedIN() {
		return title + " has checked in";

	}

	public abstract int getItemNumber(int itemNumber);

	{
		itemNumber = nextItemNumber;
		nextItemNumber++;
	}

	public abstract double calculateFinesAccrued();

	public long getRentalDays() {
		LocalDate borrowD = LocalDate.parse(borrowDate);
		LocalDate returnD = LocalDate.parse(MUSTreturnDate);
		long rentalDays = ChronoUnit.DAYS.between(borrowD, returnD);
		return rentalDays;
	}

	public long getDaysLate() {
		LocalDate MUSTReturn = LocalDate.parse(MUSTreturnDate);
		LocalDate ACTUALReturn = LocalDate.parse(ACTUALreturnDate);
		long lateDays = ChronoUnit.DAYS.between(MUSTReturn, ACTUALReturn);
		return lateDays;
	}
}
