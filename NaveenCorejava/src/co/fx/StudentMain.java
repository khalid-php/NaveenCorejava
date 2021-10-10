package co.fx;
/**
 * Student main to find the greatest fee of the student*/
import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student(1,"khalid",900.00d, "java");
		Student s2 = new Student(2, "hussain",1000d, "PMD");
		Student s3 = new Student(3, "md", 100d,"core");
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s3);
		al.add(s2);
		al.add(s1);
		
		for(Student s:al) {
			System.out.println(s);
		}
		al.stream().forEach(e->System.out.println(e));
		
		//name where maximum
		al.stream().filter(e->e.getSfee()>900)
				.forEach(e->System.out.println(e.getSname() +" "+
		e.getSid()+" "+e.getSubject()));
		
		//name who got the highest fee
		Double hm =al.stream().map(e->e.getSfee())
				.max(Double::compare).get();
		System.out.println(hm);
		
		al.stream().filter(e->e.getSfee()==hm)
					.forEach(e->System.out.println(e));
	}

}
