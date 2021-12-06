package application;

public class BMI {
	public float CalculateBMI(float w, float h) {
		h=h/100;
		h=h*h;
		return w/h;
	}
}
