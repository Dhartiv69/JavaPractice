

public class AlpineProgram {



	public static void main(String[] args) {
		
		Yesterday alpine = new Yesterday (8, 1314.97);
		
		AlpineCompanyData[] company = {alpine};
		
		for(AlpineCompanyData Data : company) {
			
			System.out.println(Data.toString());
		}

	}

}

class Yesterday extends AlpineCompanyData {
	
	private int totalOrder;
	private double totalSeles;
	
	public Yesterday(int totalOrder, double totalSeles) {
		
		this.totalOrder = totalOrder;
		this.totalSeles = totalSeles;
		
		this.setDay("Thursday");
		this.setAverage(totalSeles / totalOrder);
	}
	
	public int getTotalOrder() {
		return totalOrder;
	}
	
	public double getTotalSeles() {
		return totalSeles;
	}
	
	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}
	
	public void setTotalSeles(double totalSeles) {
	    this.totalSeles = totalSeles;
	    
	}

	@Override
	public String toString() {
		return "Yesterday [totalOrder=" + totalOrder + ", totalSeles=" + totalSeles + ", day=" + getDay() + ", average=" + getAverage() + "]";
	}

}




class AlpineCompanyData {
	
	
	private String day;
	private double average;
	
	public AlpineCompanyData() {
	}
	
	
	
	public AlpineCompanyData(String day) {
		super();
		this.day = day;
	}



	public AlpineCompanyData(String day, double average) {
		super();
		this.day = day;
		this.average = average;
	}



	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}



	@Override
	public String toString() {
		return "AlpineCompanyData [day=" + day + ", average=" + average + "]";
	}
	
	
		
}


