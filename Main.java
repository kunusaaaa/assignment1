import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/kunusa/Desktop/assignments/aluas/src/file1.txt");
        Scanner sc = new Scanner(file);
        Shape sh = new Shape();

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] arrOfStr = line.split(", ");

            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            Point p = new Point(x, y);
            sh.addPoint(p);
        }
        sh.calculatePerimeter();
        System.out.println(sh.perimeter);
        sh.avgLen();
        sh.longestSide();
        sh.getPoints();

    }
}