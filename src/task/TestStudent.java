package task;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentExam stdExam = new StudentExam();
		
		stdExam.setAge(20);
		stdExam.setName("Java Traning");
		stdExam.setSalary(1000000);
		stdExam.setOrgName("Trading application");
		
		StudentProfile stdProfile =  Profile.createStudentProfile(stdExam);

		//print team name and desk number
		System.out.println(stdProfile.getTeamName() +" = "+stdProfile.getDeskNo());
		
		//print organization here like as above
		System.out.println("orgName "+stdProfile.getOrgName());
		
	}

}
