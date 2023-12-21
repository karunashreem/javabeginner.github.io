class area_of_a_circle {
    int rad;
    public double area(int rad){
        double arr= 3.14*rad*rad;
        return arr;
    }
}
class Main{
    public static void main(String[] args) {
        area_of_a_circle obj1= new area_of_a_circle();
        System.out.println(obj1.area(5));
    }
}
