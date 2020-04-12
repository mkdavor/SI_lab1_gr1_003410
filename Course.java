import java.util.List;

class Course {
	List<Student> students;	
	
	public Course () {
		
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void removeStudent(Student s) {
		students.remove(s);
	}
	
	public int SignaturesCount() {
		int signatures = 0;
		for (Student student : students) {
			if (student.hasSignature()) {
				signatures++;
			}
		}
		
		return signatures;
	}
	
	public String FindStudentByIndex(String index) {
		for (Student student : students) {
			if (student.getIndex().equals(index)) {
				return student.getFirstName() + " " + student.getLastName();
			}
		}
		
		return null;
	}
}
