package com.lista.total;
import static java.lang.Math.*;
public class Equation{

        private double a;
        private double b;
        private double c;

    public Equation(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }


        public void setA(double a) {
            this.a = a;
        }

        public void setB(double b) {
            this.b = b;
        }

        public void setC(double c) {
            this.c = c;
        }

        public double findDiscriminant ( double a, double b, double c) {
            return pow(b, 2) - 4*a*c;
        }

        public double firstX (double a, double b, double c) {
            return ((-1*b + sqrt(findDiscriminant(a, b, c)))/(2*a));
        }

        public double secondX ( double a, double b, double c) {
            return ((-1 * b - sqrt(findDiscriminant(a, b, c))) / (2 * a));
        }
    }