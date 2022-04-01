import java.util.Scanner;

import javax.swing.JOptionPane;

public class prueba {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String matriz[][];
		int filas, columnas;
		filas = Integer.parseInt(JOptionPane.showInputDialog("teclea numero de filas"));
		columnas = Integer.parseInt(JOptionPane.showInputDialog("teclea numero de columnas"));
		// CONSTRUYO MATRIZ
		matriz = new String[filas][columnas];
		System.out.println("teclear valores de matriz");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("matriz [" + i + "][" + j + "]:");
				String valor = input.nextLine();
				matriz[i][j] = valor;
			}
		}
		System.out.println("\n matriz");
		// imprimir valores de matriz
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j]);
				System.out.print("");
			}
			System.out.println();
		}
		// filas
		for (int i = 0; i < matriz.length; i++) {
			// vamos hasta -3, porque ir mas alla no sirve porque no hay 4 elementos
			for (int j = 0; j < matriz[0].length - 3; j++) {
				if (matriz[i][j] == matriz[i][j + 1] && matriz[i][j] == matriz[i][j + 2]
						&& matriz[i][j] == matriz[i][j + 3]) {
					String cadena = "mutacion";
					System.out.println(cadena);
				} else
					System.out.println();
			}
		}
		System.out.print("");
	}

}
