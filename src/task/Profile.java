package task;

public class Profile {
	
	public static StudentProfile createStudentProfile(StudentExam stdExam) {
		
		StudentProfile stdProfile = new StudentProfile();
		
		stdProfile.setName(stdExam.getName());
		stdProfile.setAge(stdExam.getAge());
		stdProfile.setDeskNo("1234");
		stdProfile.setSalary(stdExam.getSalary());
		stdProfile.setTeamName("ExTra");
		stdProfile.setOrgName(stdExam.getOrgName());
		
		return stdProfile;
	}

}
