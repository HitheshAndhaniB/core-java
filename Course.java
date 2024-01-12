class Course
{
    String language;
	String dateOfJoining;
	int noOfDaysCourse;
	String technologies;
	double fees;
	String endOfCourse;
	int joinedStudents;
	
	
	Course(String language,String dateOfJoining,int noOfDaysCourse,String technologies,double fees,String endOfCourse,int joinedStudents)
	{
		this.language=language;
		this.dateOfJoining=dateOfJoining;
		this.noOfDaysCourse=noOfDaysCourse;
		this.technologies=technologies;
		this.fees=fees;
		this.endOfCourse=endOfCourse;
		this.joinedStudents=joinedStudents;
	}
	void courseDisplay()
	{
	    System.out.println("Starting month in showMonth");
		System.out.println("language available:"+language);
	    System.out.println("dateOfJoining:"+dateOfJoining);
	    System.out.println("noOfDaysCourse:"+noOfDaysCourse);
	    System.out.println("technologies list:"+technologies);
	    System.out.println("fees:"+fees);
	    System.out.println("endOfCourse for students:"+endOfCourse);
	    System.out.println("joinedStudents for training:"+joinedStudents);
		System.out.println("Ending month in showMonth");

	}
	
}