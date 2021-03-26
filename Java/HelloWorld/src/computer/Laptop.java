package computer;

public class Laptop {
	
		private float screen;
		private Processor processor;
		private GraphicsCard graphicsCard;
		private String hardDrive;
		
		
		public Laptop()
		{
			this.screen = 14.5f;
			this.processor = new Processor();
			this.graphicsCard = new GraphicsCard();
			this.hardDrive = "500GB";
		}
		public Laptop(float screen, Processor processor, GraphicsCard graphicsCard, String hardDrive) {
			super();
			this.screen = screen;
			this.processor = processor;
			this.graphicsCard = graphicsCard;
			this.hardDrive = hardDrive;
		}
		@Override
		public String toString() {
			return "Laptop [screen=" + screen + ", processor=" + processor + ", graphicsCard=" + graphicsCard
					+ ", hardDrive=" + hardDrive + "]";
		}
		
		
		
}
