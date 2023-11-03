class AllActivity
{
public static void main(String[] args)
{
    System.out.println("Running main in AllActivity");
	
	Free free=new Free("java,sql","it is free for placed students","it is free for only placed students");
	free.displayFree();
	Free free1=new Free("html,css","it is free for placed students","it is free for only placed students");
	free1.displayFree();
	Free free2=new Free("reactjs","it is free for placed students","it is free for only placed students");
	free2.displayFree();
	Free free3=new Free("jpa,spring mvc","it is free for placed students","it is free for only placed students");
	free3.displayFree();
	Free free4=new Free("servlet","it is free for placed students","it is free for only placed students");
	free4.displayFree();
	Free free5=new Free("db","it is free for placed students","it is free for only placed students");
	free5.displayFree();
	Free free6=new Free("java,html","it is free for placed students","it is free for only placed students");
	free6.displayFree();
	Free free7=new Free("react js","it is free for placed students","it is free for only placed students");
	free7.displayFree();
	Free free8=new Free("node js","it is free for placed students","it is free for only placed students");
	free8.displayFree();
	Free free9=new Free("react js,bootstrap","it is free for placed students","it is free for only placed students");
	free9.displayFree();
	Free free10=new Free("java","it is free for placed students","it is free for only placed students");
	free10.displayFree();
	Free free11=new Free("react js,jpa","it is free for placed students","it is free for only placed students");
	free11.displayFree();
	
	Month month=new Month("October",31,4,1);
	month.showMonth();
	Month month1=new Month("November",30,4,2);
	month1.showMonth();
	Month month2=new Month("january",30,4,1);
	month2.showMonth();
	Month month3=new Month("febrauray",30,4,2);
	month3.showMonth();
	Month month4=new Month("march",28,4,2);
	month4.showMonth();
	Month month5=new Month("april",30,4,1);
	month5.showMonth();
	Month month6=new Month("may",30,4,2);
	month6.showMonth();
	Month month7=new Month("june",30,4,1);
	month7.showMonth();
	Month month8=new Month("july",30,4,2);
	month8.showMonth();
	Month month9=new Month("august",30,4,1);
	month9.showMonth();
	Month month10=new Month("september",30,4,2);
	month10.showMonth();
	Month month11=new Month("october",30,4,3);
	month11.showMonth();
	
	Course course=new Course("java,web","2-oct-23",60,"bootstrap,jpa",20.000,"1-dec-23",30);
	course.courseDisplay();
	Course course1=new Course("jcss,sql","2-oct-23",60,"java,sql",20.000,"1-dec-23",30);
	course1.courseDisplay();
    Course course2=new Course("jpa,web","2-oct-23",60,"java,web",20.000,"1-dec-23",30);
	course2.courseDisplay();
	Course course3=new Course("react js,web","2-oct-23",60,"bootstrap,jpa",20.000,"1-dec-23",30);
	course3.courseDisplay();
	Course course4=new Course("sql,servlet","2-oct-23",60,"java,sql",20.000,"1-dec-23",30);
	course4.courseDisplay();
	Course course5=new Course("java,web","2-oct-23",60,"java,sql",20.000,"1-dec-23",30);
	course5.courseDisplay();
	Course course6=new Course("bootstrap,jpa","2-oct-23",60,"java,sql",20.000,"1-dec-23",30);
	course6.courseDisplay();
	Course course7=new Course("servlet,web","2-oct-23",60,"java,sql",20.000,"1-dec-23",30);
	course7.courseDisplay();
	Course course8=new Course("java,sql","2-oct-23",60,"sql,servlet",20.000,"1-dec-23",30);
	course8.courseDisplay();
	Course course9=new Course("java,web","2-oct-23",60,"java,sql",20.000,"1-dec-23",30);
	course9.courseDisplay();
	Course course10=new Course("sql,servlet","2-oct-23",60,"servlet,web",20.000,"1-dec-23",30);
	course10.courseDisplay();
	Course course11=new Course("bootstrap,jpa","2-oct-23",60,"java,sql",20.000,"1-dec-23",30);
	course11.courseDisplay();

    Technology technology=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
	technology.displayTechnology();
    Technology technology1=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
    technology1.displayTechnology();
    Technology technology2=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
	technology2.displayTechnology();
    Technology technology3=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
    technology3.displayTechnology();
    Technology technology4=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
    technology4.displayTechnology();

    
	Technology technology5=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
    technology5.displayTechnology();
    Technology technology6=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
    technology6.displayTechnology();
    Technology technology7=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
    technology7.displayTechnology();
    Technology technology8=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
    technology8.displayTechnology();
    Technology technology9=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
    technology9.displayTechnology();
    Technology technology10=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
    technology10.displayTechnology();
    Technology technology11=new Technology("Xworkz",15,"java,sql,web,html,css","windows","notepad","omkar","speed",11,"alex","faster","user friendlt","easy to use");
	technology11.displayTechnology();

    Placement placement=new Placement("xworkz","tcs,capgemini,gogle",27,54.900,234516l,24.980,"davangere","product based",100000,3,"software developer","online");
	placement.showPlacement();
    Placement placement1=new Placement("xworkz","infosys,capgemini,microsoft",23,54.900,234516l,24.980,"davangere","product based",100000,3,"software developer","online");
    placement1.showPlacement();
    Placement placement2=new Placement("xworkz","tcs,cognizant,gogle",26,54.900,234516l,24.980,"davangere","product based",100000,3,"software developer","online");
    placement2.showPlacement();
    Placement placement3=new Placement("xworkz","tcs,capgemini,flipkart",23,54.900,234516l,24.980,"davangere","product based",100000,3,"software developer","online");
    placement3.showPlacement();
    Placement placement4=new Placement("xworkz","tcs,sonata,gogle",21,54.900,234516l,24.980,"davangere","product based",100000,3,"software developer","online");
	placement4.showPlacement();
    Placement placement5=new Placement("xworkz","rolex,capgemini,gogle",23,54.900,234516l,24.980,"davangere","product based",100000,3,"software developer","online");
	placement5.showPlacement();
    Placement placement6=new Placement("xworkz","orcale,capgemini,fastrack",13,54.900,234516l,26.980,"davangere","product based",100000,3,"software developer","online");
	placement6.showPlacement();
    Placement placement7=new Placement("xworkz","tcs,ather,gogle",19,45.000,234516l,24.980,"davangere","product based",100000,3,"software developer","online");
	placement7.showPlacement();
    Placement placement8=new Placement("xworkz","amazon,capgemini,gogle",23,54.900,234516l,24.980,"davangere","product based",100000,3,"software developer","online");
	placement8.showPlacement();
    Placement placement9=new Placement("xworkz","wipro,nice,accenture",14,53.900,234516l,23.980,"davangere","product based",100000,3,"software developer","online");
	placement9.showPlacement();
    Placement placement10=new Placement("xworkz","tcs,capgemini,gogle",23,52.900,234516l,22.980,"davangere","product based",100000,3,"software developer","online");
	placement10.showPlacement();
    Placement placement11=new Placement("xworkz","wipro,accenture,gogle",29,51.900,234516l,21.980,"davangere","product based",100000,3,"software developer","online");
	placement11.showPlacement();

    System.out.println("Ending main in AllActivity");

}
}