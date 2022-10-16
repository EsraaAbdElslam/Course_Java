package EX11_01;

import java.util.Date;

public class GeometricObject {
    private String color = "";
    private boolean filled = false;
    private java.util.Date dateCreated;
    
    GeometricObject(){
        this("white", false);
    }
    GeometricObject(String Color , boolean filled){
        this.color = Color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    } 
    
    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public String toString() {
        return "created on " + dateCreated 
                + "\nthe color of Triangle is "  + color 
                + " it’s " + filled ;
    }
    
}
