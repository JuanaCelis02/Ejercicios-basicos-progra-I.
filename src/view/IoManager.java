package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IoManager {
		
		private Scanner input;
		
		public IoManager() {
			input = new Scanner(System.in);
		}
		public void showMessage(String message) {
			System.out.println(message);
		}
		public short readShort(String message) {
			this.showMessage(message);
			return input.nextShort();
		}
		
		public int readInt(String message) {
			this.showMessage(message);
			return input.nextInt();
		}
		
		public double readDouble(String message) {
			this.showMessage(message);
			return input.nextDouble();
		}
		public String readString(String message) {
			this.showMessage(message);  
			return input.next();
		}
		
		public void showGraphicMessage(String message) {
			JOptionPane.showMessageDialog(null, message);
		}
		public short readGraphicShort(String message) {
			return Short.parseShort(JOptionPane.showInputDialog(message));
		}
		public int readGraphicInt(String message) {
			return Integer.parseInt(JOptionPane.showInputDialog(message));
		}
		public double readGraphicDouble(String message) {
			return Double.parseDouble(JOptionPane.showInputDialog(message));
		}
		public String readGraphicString(String message) {
			return JOptionPane.showInputDialog(message);
		}
		
}
