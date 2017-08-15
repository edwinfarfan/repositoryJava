package com.courses.java8.basic;

public class Identifiers {

	// examples of legal identifiers
		int okidentifier;
		int $OK2Identifier;
		int _alsoOK1d3ntifi3r;
		int __SStillOkbutKnotsonice$;
		
		//Compila
		String $name = "ABC";
		String _name = "ABC";
		String $name1 = "ABC";
		String _name2 = "ABC";
		
		//No Compila
//		String %name = "Sara";
//		String *name = "Sara";
//		String @name = "Sara";
//		String #name = "Sara";

		/* illegal identifiers
		int 3DPointClass   // identifiers cannot begin with a number
		int hollywood@vine // @ is not a letter, digit, $ or _
		int *$coffee       // * is not a letter, digit, $ or _
		int public         // public is a reserved word
		 */
		
		
		public void A$B() {
			System.out.println("Legal identifier");
		}

		public void Public() {
			System.out.println("Legal identifier");
		}

		public void _helloWorld() {
			System.out.println("Legal identifier");
		}
		
//		public void true() {
//			System.out.println("Illegal identifier caused by keyword usage");
//		}

		
	//	public void java.lang() {
	//		System.out.println("Illegal identifier caused by dot usage");
	//	}

	//	public void 1980_s() {
	//		System.out.println("Illegal identifier caused by starting with a number");
	//	}

}
