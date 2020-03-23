import java.text.NumberFormat;

public class VideoDVDs extends Library{

	@Override
	public int getItemNumber(int itemNumber) {
		return itemNumber;
	}

	@Override
	public double calculateFinesAccrued() {
		double fines;
		long lateDays = getDaysLate();
		if (lateDays > 0) {
			fines = lateDays * 0.50;
		} else {
			fines = 0.00;
		}
		return fines;
	}

	public String toString() {
		return ("Item #"+this.itemNumber+"\n"
				+ "Title: "+super.title+"\n"
				+ "The Video DVD was rented on "+super.borrowDate+" and must be returned by "+super.MUSTreturnDate+"\n"
				+ "You returned it on "+super.ACTUALreturnDate+"\n"
				+ "Your fine is "+NumberFormat.getCurrencyInstance().format(calculateFinesAccrued()));
	}
}
