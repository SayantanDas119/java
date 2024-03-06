class student { /* creat a student id and name using created object */

	int student_id;
	String student_name;

	void display() {
		System.out.println("student id: " + student_id);
		System.out.println("student name: " + student_name);
	}

	public static void main(String[] args) {

		student s1 = new student();
		s1.student_id = 1;
		s1.student_name = "sonu";
		s1.display();
	}
}