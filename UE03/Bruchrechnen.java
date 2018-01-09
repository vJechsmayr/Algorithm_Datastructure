class Fraction{
	int Nenner;
	int Zaehler;
	
	public Fraction()
	{
		this.Nenner = 1;
		this.Zaehler = 1;
	}
	
	public Fraction(int newN, int newZ)
	{
		this.Nenner = newN;
		this.Zaehler = newZ;
	}
}

class Bruchrechnen{
	public static void main(String[] args) {
	
		Fraction operand1 = new Fraction();
		Fraction operand2 = new Fraction();
		String operator = "";

		System.out.println();
		System.out.println("Bitte geben Sie den Zaehler fuer die erste Bruchzahl ein!");
		operand1.Zaehler = Input.readInt();
		System.out.println("Bitte geben Sie den Nenner fuer die erste Bruchzahl ein!");
		operand1.Nenner = Input.readInt();
		System.out.println("Bitte geben Sie den Zaehler fuer die zweite Bruchzahl ein!");
		operand2.Zaehler = Input.readInt();
		System.out.println("Bitte geben Sie den Nenner fuer die zweite Bruchzahl ein!");
		operand2.Nenner = Input.readInt();
		
		System.out.println("Bitte geben Sie den gewuenschten Operator ein!");
		System.out.println("addieren, subtrahieren, dividieren, multiplizieren, +, -, x, / ");
		operator = Input.readString();

		Fraction erg = calculate(operand1, operand2, operator);
		System.out.println("Ergebnis: " + erg.Zaehler + "/" + erg.Nenner);
	
	}//ende Main
	
	public static Fraction calculate(Fraction o1, Fraction o2, String op)
	{
		Fraction ergebnis = new Fraction();
		
			switch (op){
				case "addieren":
						ergebnis=add(o1,o2);
						break;
				case "+":
						ergebnis=add(o1,o2);
						break;
				case "subtrahieren":
						ergebnis=sub(o1,o2);
						break;
				case "-":
						ergebnis=sub(o1,o2);
						break;
				case "multiplizieren":
						ergebnis=multi(o1,o2);
						break;
				case "x":
						ergebnis=multi(o1,o2);
						break;
				case "dividieren":
						ergebnis=div(o1,o2);
						break;
				case "/":
						ergebnis=div(o1,o2);
						break;
					   } //ende Switch
	
		return ergebnis;
	}
	
 public static Fraction add(Fraction a, Fraction b)
	{
		Fraction erg = new Fraction();
		int n1 = a.Nenner;
		int n2 = b.Nenner;
		
		if (a.Nenner != b.Nenner)
		{
			a.Zaehler = a.Zaehler * n2;
			a.Nenner = a.Nenner * n2;
			
			b.Zaehler = b.Zaehler * n1;
			b.Nenner = b.Nenner * n1;
			
			erg.Nenner = a.Nenner;
			erg.Zaehler = a.Zaehler + b.Zaehler;
		}else
		{
			erg.Nenner = a.Nenner;
			erg.Zaehler = a.Zaehler + b.Zaehler;
		}

		return erg;
	}
	
 public static Fraction sub(Fraction a, Fraction b)
	{
		Fraction erg = new Fraction();
		int n1 = a.Nenner;
		int n2 = b.Nenner;
		
		if (a.Nenner != b.Nenner)
		{
			a.Zaehler = a.Zaehler * n2;
			a.Nenner = a.Nenner * n2;
			
			b.Zaehler = b.Zaehler * n1;
			b.Nenner = b.Nenner * n1;
			
			erg.Nenner = a.Nenner;
			erg.Zaehler = a.Zaehler - b.Zaehler;
		}else
		{
			erg.Nenner = a.Nenner;
			erg.Zaehler = a.Zaehler - b.Zaehler;
		}

		return erg;
	}

	 public static Fraction multi(Fraction a, Fraction b)
	{
		Fraction erg = new Fraction();
		int n1 = a.Nenner;
		int n2 = b.Nenner;
		
		erg.Nenner = a.Nenner * b.Nenner;
		erg.Zaehler = a.Zaehler * b.Zaehler;

		return erg;
	}
	
	 public static Fraction div(Fraction a, Fraction b)
	{
		Fraction erg = new Fraction();
		int n1 = a.Nenner;
		int z1 = a.Zaehler;
		int n2 = b.Nenner;
		int z2 = b.Zaehler;
		
		erg.Nenner = z2 * n1;
		erg.Zaehler = n2 * z1;
		return erg;
	}
	
} //ende Bruchrechnen