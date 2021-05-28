package computer;
public class Processor {
	
	private String brand;
	private String sereis;
	private int generation;
	private int cores;
	
	
	public Processor() {
		
		this.brand = "intel";
		this.sereis = "7200u";
		this.generation = 6;
		this.cores = 4;
	}
	
	public Processor(String brand, String sereis, int generation, int cores) {
		super();
		this.brand = brand;
		this.sereis = sereis;
		this.generation = generation;
		this.cores = cores;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", sereis=" + sereis + ", generation=" + generation + ", cores=" + cores
				+ "]";
	}

}
