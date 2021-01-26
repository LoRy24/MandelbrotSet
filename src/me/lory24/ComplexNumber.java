package me.lory24;

public class ComplexNumber {

    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public static ComplexNumber convertToComplex(int x, int y, int WIDTH, int HEIGHT) {
        final double startX = -2, width = 4, height = 4, dx = width / (WIDTH - 1), dy = height / (HEIGHT - 1);
        double real = startX + x * dx, imaginary = 2 - y * dy;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber powComplex(ComplexNumber number){
        double a = this.real * number.real, b = this.imaginary * number.real, c = this.real * number.imaginary, d = this.imaginary * number.imaginary * -1;
        double newReal = a + d, newImaginary = b + c;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber addition(ComplexNumber number){
        double newReal = this.real + number.real;
        double newImaginary = this.imaginary + number.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public double abs() { return Math.hypot(this.real, this.imaginary); }
}
