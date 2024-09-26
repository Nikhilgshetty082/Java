package pkg1;
class Shape{
    public void draw(){
        System.out.println("Drawing a shape");}
    public void earse(){
        System.out.println("Erasing a shape");}

    void erase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle");}
    @Override
    public void erase(){
        System.out.println("Erasing a circle");}}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a triangle");}
    @Override
    public void erase(){
        System.out.println("Erasing a triangle");}}
class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a square");}
    @Override
    public void erase(){
        System.out.println("Erasing a square");}}

public class N5 {
    public static void main(String[] args){
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Triangle();
        shapes[2]=new Square();
        for (Shape shape : shapes) {
            int i = 0;
            shapes[i].draw();
            shapes[i].erase();
            System.out.println("---------");}}}
      
    

