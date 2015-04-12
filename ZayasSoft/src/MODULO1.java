import java.util.Scanner;

public class MODULO1 {
    public static void main(String[] args) {
        
    	int num;
        System.out.print("Introduzca un numero: ");
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        System.out.println("---------------------------");
        mostrar(num);
        System.out.println("---------------------------");
    }
    static void mostrar(int num){
        for (int i=0;i<num;i++){
            System.out.println("Módulo ejecutándose");
        }
    }
}