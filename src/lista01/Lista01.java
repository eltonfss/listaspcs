package lista01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lista01 {

    public static void main(String[] args) {
        try {
            Lista01 lista01 = new Lista01();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número do exercício que deseja executar:");
            Integer nexercicio = scanner.nextInt();
            Boolean invocou = false;
            Class c = Class.forName("lista01.Lista01");
            Method m[] = c.getDeclaredMethods();
            for(Method method : m){
                if(method.getName().equals("exercicio"+nexercicio)){
                    invocou = (Boolean) method.invoke(lista01);
                }
            }
        } catch (ClassNotFoundException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            Logger.getLogger(Lista01.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void exercicio1() {
            System.out.println("meu primeiro programa de PCS no Netbeans");
    }
    
    public void exercicio2(){
        
    }
    
    public void exercicio3(){
        
    }
    
    public void exercicio4(){
        
    }
    
    public void exercicio5(){
        
    }
    
    public void exercicio6(){
        
    }
    
    public void exercicio7(){
        
    }
    
    public void exercicio8(){
        
    }
    
    public void exercicio9(){
        
    }
    
    public void exercicio10(){
        
    }
    
    public void exercicio11(){
        
    }
    
    public void exercicio12(){
        
    }
    
    public void exercicio13(){
        
    }
    
    public void exercicio14(){
        
    }
    
}
