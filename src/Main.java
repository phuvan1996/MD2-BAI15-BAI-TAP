import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException{
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap vao canh a");
            float a = Float.parseFloat(scanner.nextLine());
            System.out.println("nhap vao canh b ");
            float b = Float.parseFloat(scanner.nextLine());
            System.out.println("nhap vao canh c ");
            float c = Float.parseFloat(scanner.nextLine());
            if (a+b<c||a+c<b||b+c<a||a<0||b<0||c<0){
                throw new IllegalTriangleException("day khong phai 3 canh cua tam giac");
            }else {
                System.out.println("day la 3 canh cua tam giac");
            }

        }catch (Exception exception){
            throw new IllegalTriangleException("khong phai 3 canh cua tam giac");
        }
    }
}