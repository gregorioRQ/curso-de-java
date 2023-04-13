import java.util.Scanner;


public class Logica {
    Scanner inp = new Scanner(System.in);
    Suma sum = new Suma();
    Division div = new Division();
    Resta res = new Resta();
    Multiplicar mult = new Multiplicar();
    int a;
    int b;
    int op;
    
    public void operacion(){
        
       do{
    System.out.println("Que operacion desea realizar? presione: ");
    System.out.println("1 para sumar");
    System.out.println("2 para restar");
    System.out.println("3 para dividir");
    System.out.println("4 para multiplicar");
    System.out.println("o 5 para salir");
        op = inp.nextInt();
    

    if(op == 1){
        System.out.println("digite un numero");
         a = inp.nextInt(); 
        System.out.println("digite otro numero");
        b = inp.nextInt();
        System.out.println("RESULTADO => " + sum.sumar(a, b));
    }else if(op == 2){
        System.out.println("digite un numero");
        a = inp.nextInt(); 
        System.out.println("digite otro numero");
        b = inp.nextInt();
        System.out.println("RESULTADO => " + res.restar(a, b));
    }else if(op == 3){
        System.out.println("digite un numero");
        a = inp.nextInt(); 
        System.out.println("digite otro numero");
        b = inp.nextInt();
        System.out.println("RESULTADO => " + div.dividir(a, b));
    }else if(op == 4){
        System.out.println("digite un numero");
        a = inp.nextInt(); 
        System.out.println("digite otro numero");
        b = inp.nextInt();
        System.out.println("RESULTADO => " + mult.multiplicacion(a, b));
    }else{
        System.out.println(" ");

        System.out.println("El caracter ingresado no esta permitindo");
    }


}while(op !=1 || op !=2 || op != 3 || op != 4) ;
   

   
}}
