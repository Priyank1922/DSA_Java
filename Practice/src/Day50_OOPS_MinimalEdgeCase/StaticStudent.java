package Day50_OOPS_MinimalEdgeCase;

public class StaticStudent {
	String name;
	int rollno;
	double percent;
	static  int numberOfStudent;

	public StaticStudent(String name, int rollno, int percent) {
		this.name = name;
		this.rollno = rollno;
		this.percent = percent;
		numberOfStudent++;
	}
}