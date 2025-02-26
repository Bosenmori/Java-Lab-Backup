package Lab7.Lib;
public class Chess extends Toy implements MyRectangle {
    private double height;
    private double width;
    public Chess() {
        super("Board game ",7);
        setWidth(100);
        setHeight(80);
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;   
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double calculateArea(){
        return height*width;
    }
    public double calculateCircumference(){
        return (height*2)+(width*2);
    }
    public void play(){
        System.out.println("Game Start !!!");
    }
}
