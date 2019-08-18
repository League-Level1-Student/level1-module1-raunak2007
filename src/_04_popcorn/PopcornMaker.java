package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor=JOptionPane.showInputDialog("What flavor do you want the popcorn to be?");
		String minutes=JOptionPane.showInputDialog("How many minutes do you want your popcorn to be in the microwave?");
		Popcorn pop=new Popcorn(flavor);
		Microwave micro=new Microwave();
		micro.putInMicrowave(pop);
		micro.setTime(Integer.parseInt(minutes));
		micro.startMicrowave();
	}
}
