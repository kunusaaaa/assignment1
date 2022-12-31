import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;
    public double perimeter = 0;
    private int sides = 1;

    public Shape(){
        points = new ArrayList<>();
    }

    public void addPoint(Point point){
        points.add(point);
    }

    public void getPoints(){
        for(int i = 0; i < points.size(); i++){
            System.out.print(points.get(i).x);
            System.out.print(", ");
            System.out.println(points.get(i).y);
        }
    }

    public void calculatePerimeter(){
        perimeter += points.get(points.size() - 1).distance(points.get(0));
        for(int i = 0; i < points.size() - 1; i++){
            perimeter += points.get(i).distance(points.get(i + 1));
            sides++;
        }
    }

    public void longestSide(){
        double max = 0;
        for(int i = 0; i < points.size() - 1; i++){
            if(max < points.get(i).distance(points.get(i + 1))) {
                max = points.get(i).distance(points.get(i + 1));
            }
        }
        System.out.println(max);
    }

    public void avgLen(){
        System.out.println(perimeter/sides);
    }
}
