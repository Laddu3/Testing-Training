package day2Assignment;

public class EngineeringBook extends Book{

	private String category;
	
	
	
	public EngineeringBook() {
		super();
	}



	public EngineeringBook(int bookNo, String title, String author, float price,String category) {
        super(bookNo, title, author, price);
        this.category=category;
    }
	
	

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
    public String toString() {
        return "EngineeringBook [Category=" + getCategory() + ", BookNo=" + getBookNo() + ", Title="
                + getTitle() + ", Author=" + getAuthor() + ", Price=" + getPrice() + "]";
    }
	
	public static void main(String[] args) {
        EngineeringBook eb=new EngineeringBook(1111, "JAVA", "Amit", 500, "DSA");
        System.out.println("Book details ::" +" " +eb.toString());
	}
	
	
}
