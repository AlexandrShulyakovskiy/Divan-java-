public class Divan {
    private int width;
    private int length;
    private String color;
    private String brand;
    
    private String type;	
    private double price;
    
    protected String condition;
    protected String field;
    static int count = 0;
    
    public Divan() {
     count++;   
    }
    
        
    public Divan(int width, int length, String color, String brand) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.brand = brand;
        count++;
        
    }
    
    
    public Divan(int width, int length, String color, String brand, String type, double price, String condition,
			String field) {
		super();
		this.width = width;
		this.length = length;
		this.color = color;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.condition = condition;
		this.field = field;
	}




	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Divan.count = count;
	}

	public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }
    
    
    public String toString() {
        return "Brand: " + getBrand() + "\n"
                + "Color: " + getColor() + "\n"
                + "Length: " + getLength() + "\n"
                + "Width: " + getWidth() + "\n"
                + "Type: " + getType() + "\n"
                + "Price: " + getPrice() + "\n"
                + "Condition: " + getCondition() + "\n"
                + "Field: " + getField() + "\n"
                + "Count: " + getCount() + "\n";
    }
    
    public static int getStaticField(){
        return count;
    }
    
    
    public static void main(String[] args) {
        Divan divan1 = new Divan();
        Divan divan2 = new Divan(10, 10, "Red", "Brand2");
        Divan divan3 = new Divan(10, 10, "Red", "Brand3", "type1", 100.50, "condition1", "field1");
        
        System.out.println(divan1.toString());
        System.out.println(divan2.toString());
        System.out.println(divan3.toString());
    }
  
    }
