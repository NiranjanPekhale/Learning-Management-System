import modelclass.Student;
import repository.Student_DAO;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student_DAO student_DAO= new Student_DAO();
		Student[] students=student_DAO.getAllStudents();
		for(Student st:students)
		{
			System.out.println(st.getStd_name());
			System.out.println(st.getStd_username());
		}

	}

}
