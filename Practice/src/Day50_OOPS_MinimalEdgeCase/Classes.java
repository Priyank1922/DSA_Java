package Day50_OOPS_MinimalEdgeCase;

public class Classes {
	public static void change(int x) {
		x = 7;
		return;
	}

	public static void changeStudent(Student s) {
		s.name = "zzz";
	}

	// creating a new dt with multiple attributes

	public static void main(String[] args) {
		Student x = new Student();
		x.name = "abc";
		x.rollno = 101;
		x.percent = 92.5;
		System.out.println(x.name);
		System.out.println(x.rollno + 2);

		Student y = new Student();
		y.name = "zxc";
		y.rollno = 109;
		y.percent = 94.2;
		System.out.println(y.name);
		System.out.println(x.rollno + 9);

		// passing class to func
		Student st = new Student();
		st.name = "qqq";
		st.rollno = 102;
		st.percent = 80.9;
		System.out.println(st.name); // qqq
		st.name = "asd";
		System.out.println(st.name); // asd

		int a = 5;
		System.out.println(a);

		change(a);
		System.out.println(a);

		Student e = new Student();
		e.name = "ppp";
		e.rollno = 33;
		e.percent = 89;
		System.out.println(e.name);
		changeStudent(e);
		System.out.println(e.name);

		// default
		Student q = new Student();
		System.out.println(q.name); // null

		// privateStudent
		privateStudent stt = new privateStudent();
		stt.name = "were";
//stt.rno = 123; //errror

		// getter setter
		privateStudent st2 = new privateStudent();
		st2.name = "private1";
		st2.percent = 90.5;
//		st2.rno = 113;
		System.out.println(st2.getRno());
		st2.setRno(75);
		System.out.println(st2.getRno());

		// constuctor
		ConstructorStudent sq = new ConstructorStudent("YYY", 23, 99);
		System.out.println(sq.name);
		System.out.println(sq.percent);
		System.out.println(sq.rollno);

		// final keyword use in privateStudent
		privateStudent d4 = new privateStudent();
//		d4.schoolName = "ab"; // cannot assign
		System.out.println(d4.schoolName);

		// static keyword use
		StaticStudent ss1 = new StaticStudent("abc", 33, 98);
		System.out.println(ss1.numberOfStudent);

		StaticStudent ss2 = new StaticStudent("cba", 35, 99);
		System.out.println(ss2.numberOfStudent);

		StaticStudent ss3 = new StaticStudent("bba", 36, 97);
		System.out.println(ss3.numberOfStudent);

		System.out.println(StaticStudent.numberOfStudent);// call eaasily because of static intNoStudent
//		System.out.println(StaticStudent.name); //error in name etc bcz they are not static
		StaticStudent.numberOfStudent = 102;

	}
}
