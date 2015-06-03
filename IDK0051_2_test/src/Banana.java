
public class Banana {
	
	private double weight;
	private int readyLevel;  // How ready is this banana from 1 ... 10
	private String sort;
	private int angle = 0;  // Angle of the banan from 0 .. 45
	private int expireDate;
	
	public void setExpireDate(int expireDate) {
	}
	
	// Calculating remaining days till product expired
	public int getExpireDate() {
		expireDate = 10 - readyLevel;
		return expireDate;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getReadyLevel() {
		return readyLevel;
	}
	public void setReadyLevel(int readyLevel) {
		this.readyLevel = readyLevel;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public int getAngle() {
		return angle;
	}
	public void setAngle(int angle) {
		this.angle = angle;
	}
	

}
