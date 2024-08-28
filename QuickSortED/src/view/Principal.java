package view;

import javax.swing.JOptionPane;

import controller.SortsController;

public class Principal {
	public static void main(String[] args) {
		SortsController sort = new SortsController();
		
		int[] vetor = null;
		int opc = 0;
		
		while(opc < 1 || opc > 3 && opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha o vetor a ser organizado: \n 1 - Vetor: [74, 20, 74, 87, 81, 16, 25, 99, 44, 58] \n 2 - Vetor: [44, 43, 42, 41, 40, 39, 38] \n 3 - Vetor: [31, 32, 33, 34, 99, 98, 97, 96] \n 9 - Sair"));
			switch(opc) {
				case 1:
					vetor = new int[]{74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
					break;
				case 2:
					vetor = new int[]{44, 43, 42, 41, 40, 39, 38};
					break;
				case 3:
					vetor = new int[]{31, 32, 33, 34, 99, 98, 97, 96};
					break;
				case 9:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
		
		if(vetor == null) {
			System.exit(0);
		}else {
			vetor = sort.quick(vetor);
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
