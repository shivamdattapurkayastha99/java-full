package com.shivam.shape;
public class Sphere extends shape {
    Sphere(int dim1){
        super(dim1, -1);
    }
    public double area(){
        return 4*Math.PI* this.dim1*this.dim1;
        
    }
}
