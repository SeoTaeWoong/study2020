package calc;

import java.util.Scanner;

public class CalcViewer {
	// °è»ê±â µ¡¼À »¬¼À ³ª´°¼À È­¸é ¸Þ´º
	// -----------------------
	// +(µ¡) -(»¬) *(°ö) /(³ª´°) %(³ª¸ÓÁö) D(ÃÊ±â) E(Á¾·á))
	// > ÀÔ·Â¼ýÀÚ È­¸éÃâ·Â
	// °è»ê°á°úÃâ·Â
	// -----------------------
	
	
	public static void viewer() {
		CalcDTO cDTO = new CalcDTO();
		CalcFunction cF = new CalcFunction();
		Scanner sc = new Scanner(System.in);

		// while('E') {
		while (true) {

			System.out.println("\t\t********************");
			System.out.println("\t\t********°è»ê±â********");
			System.out.println("\t\t********************");

			System.out.println("\t\t (+) (-) (*) (/) (%) ");
			System.out.println("\t\t   (D)ÃÊ±âÈ­ (E)Á¾·á");
			System.out.print("\t\t½Ä > ");
			cDTO.EXPLANATION = sc.nextLine();
			cDTO.RESULT = cF.decomposition(cDTO.EXPLANATION);
			
			System.out.println("\t\t´ä > "+ cDTO.RESULT);
			
			
		}
	}

}
