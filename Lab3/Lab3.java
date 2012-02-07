import lejos.nxt.*;

public class Lab3 {
	public static void main(String[] args) {
		int buttonChoice;

		// Initialize any objects necessary
		Odometer odometer = new Odometer();
		OdometryDisplay odometryDisplay = new OdometryDisplay(odometer);
		Navigator navigator;

		do {
			// clear the display
			LCD.clear();

			// ask the user whether the motors should drive in a square or float
			LCD.drawString("< Left | Right >", 0, 0);
			LCD.drawString("       |        ", 0, 1);
			LCD.drawString(" Path  | Path   ", 0, 2);
			LCD.drawString(" One   | Two    ", 0, 3);

			buttonChoice = Button.waitForPress();
		} while (buttonChoice != Button.ID_LEFT
				&& buttonChoice != Button.ID_RIGHT);

		// Two choices, two paths
		// Path one
		if (buttonChoice == Button.ID_LEFT) {
			// Start the odometer, display, and navigator
			odometer.start();
			odometryDisplay.start();
			navigator = new Navigator(odometer);
			
		} else
		// Path two
		{
			
		}

		while (Button.waitForPress() != Button.ID_ESCAPE)
			;
		System.exit(0);
	}
}
