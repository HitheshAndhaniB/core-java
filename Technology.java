class Technology
{
	 String institution;
	 int technologies;
	 String availableTechnologies;
	 String hardware;
	 String IDE;
	 String trainerName;
	 String technologiesFeature;
	 int version;
	 String technologyFounder;
	 String ubiquity;
	 String accessebility;
	 String scopeOfTechnologies;
	 
	 
	 
	 Technology(String institution,int technologies,String availableTechnologies,String hardware,String IDE, String trainerName,String technologiesFeature,int version,String technologyFounder,String ubiquity,String accessebility,String scopeOfTechnologies)
	 {
		 this.institution=institution;
		 this.technologies=technologies;
		 this.availableTechnologies=availableTechnologies;
		 this.hardware=hardware;
		 this.IDE=IDE;
		 this.trainerName=trainerName;
		 this.technologiesFeature=technologiesFeature;
		 this.version=version;
		 this.technologyFounder=technologyFounder;
		 this.ubiquity=ubiquity;
		 this.accessebility=accessebility;
		 this.scopeOfTechnologies=scopeOfTechnologies;
	 }
void displayTechnology()
	 {
		System.out.println("Starting Technology in displayTechnology");
		System.out.println("institution name:"+institution);
	    System.out.println("technologies name:"+technologies);
		System.out.println("availableTechnologies name:"+availableTechnologies);
		System.out.println("hardware name:"+hardware);
		System.out.println("IDE name:"+IDE);
		System.out.println("trainerName is:"+trainerName);
		System.out.println("technologiesFeature is:"+technologiesFeature);
		System.out.println("version is:"+version);
		System.out.println("technologyFounder name:"+technologyFounder);
		System.out.println("ubiquity :"+ubiquity);
		System.out.println("accessebility:"+accessebility);
		System.out.println("scopeOfTechnologies :"+scopeOfTechnologies);
        System.out.println("Ending Technology in displayTechnology");
}
}