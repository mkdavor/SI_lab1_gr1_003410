import java.util.stream.IntStream;

class Student {
	String index;
	String firstName;
	String lastName;
	int[] labPoints;
	
	public Student () {
		
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int[] getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(int[] labPoints) {
		this.labPoints = labPoints;
	}

	public double getAverage() {
		int sum = IntStream.of(labPoints).sum();
		return (double)sum / labPoints.length;
	}

	public boolean hasSignature() {
		return labPoints.length > 8;
	}

	
}
