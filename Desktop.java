package org.system;

public class Desktop {

	public void desktopSize() {
		System.out.println("My desktop size is 18cm");
	}

	public static void main(String[] args) {

		Computer computer = new Computer();
		computer.computerModel();

		Desktop desktop = new Desktop();
		desktop.desktopSize();

	}

}
