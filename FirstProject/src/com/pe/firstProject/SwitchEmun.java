package com.pe.firstProject;

import com.pe.util.Imprime;

public class SwitchEmun {

	enum Choice {
		Choice1(1) {
			@Override
			public String option() {
				return "Option1";
			}
		},
		Choice2(2) {
			@Override
			public String option() {
				return "Option2";
			}
		},
		Choice3(3) {
			@Override
			public String option() {
				return "Option2";
			}
		};

		private int value;

		public abstract String option();

		private Choice(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		Choice ch = Choice.Choice2;

//		switch (ch) {
//		case Choice1:
//			Imprime.linea("Choice1 selected " + ch.option());
//			break;
//		case Choice2:
//			Imprime.linea("Choice2 selected " + ch.option());
//			break;
//		case Choice3:
//			Imprime.linea("Choice3 selected " + ch.option());
//			break;
//		}
//
//		for (Choice tmp : Choice.values()) {
//			Imprime.linea("posicion:"+ tmp.ordinal() + "\t nombre: " + tmp.name());
//		}

		 int c = Integer.parseInt(args[0]);
		
		 switch(c) {
		 case 1:
		 Imprime.linea("Choice1 selected");
		 break;
		 case 2:
		 Imprime.linea("Choice2 selected");
		 break;
		 case 3:
		 Imprime.linea("Choice3 selected");
		 break;
		 default:
		 Imprime.linea("no se escogio una opcion");
		 break;
		 }
	}
}
