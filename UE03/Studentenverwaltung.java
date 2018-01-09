class Adresse{
	String street;
	int zipcode;
	String city;
	
	
	public enum country
	{
	  Austria, Deutschland, Schweiz
	}

}

class Student{
	int id;
	String firstname;
	String lastname;
	int age;
	boolean married;
	int[] grades = new int[10];
	Adresse adress = new Adresse();
	
}

class Studentenverwaltung{
	public static void main(String[] args) {
	
		Student[] students = new Student[10];
		int i = 2;
		int status = 0;
		
		students[0].id = 3009;
		students[0].firstname = "Viktoria";
		students[0].lastname = "Jechsmayr";
		students[0].age = 22;
		students[0].married = false;
		students[0].adress.street = "Erlenstraße 14";
		students[0].adress.zipcode = 3324;
		students[0].adress.city = "Euratsfeld";
		students[0].grades[0] = 1;
		students[0].grades[1] = 2;
		students[0].grades[2] = 3;
		students[0].grades[3] = 4;
		students[0].grades[4] = 3;
		
		students[1].id = 2107;
		students[1].firstname = "Lisa";
		students[1].lastname = "Jechsmayr";
		students[1].age = 20;
		students[1].married = false;
		students[1].adress.street = "Erlenstraße 14";
		students[1].adress.zipcode = 3324;
		students[1].adress.city = "Euratsfeld";
		students[1].grades[0] = 4;
		students[1].grades[1] = 3;
		students[1].grades[2] = 2;
		students[1].grades[3] = 4;
		students[1].grades[4] = 3;
		
		while (status != 6)
		{
			System.out.println("Bitte geben Sie die Zahl ein, welche Aktion Sie durchfuehren wollen!");
			System.out.println("(1) neuen Studenten anlegen");
			System.out.println("(2) Studenten bearbeiten");
			System.out.println("(3) Studenten loeschen");
			System.out.println("(4) Durchschnittsalter ausgeben");
			System.out.println("(5) Notendurchschnitt");
			System.out.println("(6) Beenden");
			status = Input.readInt();
			
			while ((status < 1) || (status > 6))
			{
				System.out.println("Bitte geben Sie eine gueltige Zahl ein!");
				status = Input.readInt();
			}
			
			
			switch(status)
			{
				case 1: 
						System.out.println("Bitte geben Sie eine ID ein:");
						students[i].id = Input.readInt();
						System.out.println("Bitte geben Sie einen Vornamen ein:");
						students[i].firstname = Input.readString();
						System.out.println("Bitte geben Sie einen Nachnamen ein:");
						students[i].lastname = Input.readString();
						System.out.println("Bitte geben Sie ein Alter ein:");
						students[i].age = Input.readInt();
						System.out.println("Verheiratet? (j) Ja, (n) Nein ");
						String mar = Input.readString();
						switch(mar)
						{
							case "j": students[i].married = true; break;
							case "(j)": students[i].married = true; break;
							case "n": students[i].married = false; break;
							case "(n)": students[i].married = false; break;
						}
						System.out.println("Straße");
						students[i].adress.street = Input.readString();
						System.out.println("PLZ");
						students[i].adress.zipcode = Input.readInt();
						System.out.println("Stadt");
						students[i].adress.city = Input.readString();
						
						System.out.println("Bitte geben Sie eine Note ein!");
						int note = 0;
						int notenstatus = 0;
						while ((notenstatus == 0) && (note < 10))
						{
							students[i].grades[note] = Input.readInt();
							System.out.println("Wollen Sie noch eine Note eingeben? (0) Ja (1) Nein ");
							notenstatus = Input.readInt();
							 note++;
						}
						break;				
				case 2: 
				
				case 3: deleteStudent(students, 1);
						break;
				case 4:
				
				case 5:
			
			}//ende switch
			
			status = Input.readInt();
		}//ende endlos-while
	
	}//ende Main
	
	public static void deleteStudent(Student[] students, int index)
	{
		for (int j = index; j < students.length; j++) {
			students[index] = null;
			if (students[index + 1] != null) 
			{
				students[index] = students[index + 1];
			} else {
					students[index] = null;
				   }
			//i=i-1;
			//students[i]=null;
			System.out.println("Student removed successfully");
			//return true;
		}//end for

		
	}//end deleteStudent
	
} //ende Bruchrechnen