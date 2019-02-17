package com.example.menga.gasf;
import java.lang.reflect.Array;
import java.util.*;

public class lnrReg {
    private double slope=0;
    private double step;
    private double start=50;
    public double h(double x){
        return start + (slope*x);
    }
    public double summation(int m, double x, double y){
        double sum = 0;
        for(int i =0; i<m;i++){
            sum+= Math.pow(this.h(x), y);
        }
        return sum;
    }
    public double J(double x, double y, int m){
        double sum = summation(m,x,y);
        double result = sum/(2*m);
        return result;
    }
    public double setSlope(int m, ArrayList<Double> x, ArrayList<Double> y){
        double sum = 0;
        for(int i =0; i<m ;i++){
            sum+=(h(x.get(i))-y.get(i));
        }
        double result = sum*step;
        result = result/m;
        result = slope-result;
        return result;
    }
    public double setStart(int m, ArrayList<Double> x, ArrayList<Double> y){
        double sum = 0;
        for(int i = 0;i < m; i++){
            sum+= ((h(x.get(i))-y.get(i))*x.get(i));
        }
        double result = sum*step;
        result = result/m;
        result = start-result;
        return result;
    }
    public void update(int m, ArrayList<Double> x, ArrayList<Double> y){
        double temp0 = this.setSlope(m, x, y);
        double temp1 = this.setStart(m, x, y);
        slope = temp0;
        start = temp1;
    }
    public static void main(String[] args){
        Array
        System.out.println("hello");
    }
}
