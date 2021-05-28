package computer;

public class GraphicsCard {
	
	private String brand;
	
	private int sereis;
		
	
	
	public GraphicsCard() {
	
		this.brand = "nvidia";
		this.sereis = 940;
	}
	
	public GraphicsCard(String brand, int sereis) {
		super();
		this.brand = brand;
		this.sereis = sereis;
	}
	
	@Override
	public String toString() {
		return "GraphicsCard [brand=" + brand + ", sereis=" + sereis + "]";
	}

}
