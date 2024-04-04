public class MathsCalci {

	
	private MathsCalculator cal;
	public void setMathsCalculator(MathsCalculator cal) {
		this.cal=cal;
		
	}
	public double add(double i,double j) {
		
		return cal.add(i, j);
	}
	
	
	public double sub(double i,double j) {
		
		return cal.sub(i, j);
	}

	public double mul(double i,double j) {
	
	return cal.mul(i, j);
}

	public double div(double i,double j) {
	
	return cal.div(i, j);
}
}
