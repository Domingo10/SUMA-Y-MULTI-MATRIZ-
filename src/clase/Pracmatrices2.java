package clase;

public class Pracmatrices2{
    public static void main (String args[]){
    
        //EJERCICIO 1 DEL EXAMEN DE ESTRUCTURA DE DATOS HEHCHO POR DOMINGO GONZALEZ 
        //NOTA: SE ESTA USANDO Math.random PARA DAR VALORES ALEATORIOS A LAS MATRICES POR ESO DARAN SIEMPRE RESULTADOS DIFERENTES 
        int M_1 [][] = new int [2][2];
        int M_2 [][] = new int [2][2];
        int M_3 [][] = new int [2][2];
        int M_resultado1 [][] = new int [2][2]; 
        int M_resultado2 [][] = new int [2][2];
        
        //PRIMERA MATRIZ 
        for (int i = 0; i < M_1.length; i++){
            for (int j = 0; j < M_1.length; j++){
               M_1 [i][j] = (int) (Math.random() * 5);
                
            }
            
        }    
        
        //SEUGNDA MATRIZ
        for (int i = 0; i < M_2.length; i++) {
            for (int j = 0; j < M_2.length; j++) {
                M_2[i][j] = (int) (Math.random() * 5);
                 
             }
       
        }
        
        //TERCERA MATRIZ 
        for (int i = 0; i < M_3.length; i++) {
            for (int j = 0; j < M_3.length; j++) {
                M_3[i][j] = (int) (Math.random() * 5);
                   
             }
       
        }        
        
        //SUMA 
        for (int i = 0; i < M_2.length; i++) {
            for (int j = 0; j < M_2.length; j++){
                M_resultado1 [i][j] = M_1 [i][j] + M_2 [i][j];
                //SI QUISIERAMOS RESTAR SERIA matriz_resultado1 [i][j] = M_1 [i][j] - M_2 [i][j];                
                    
            
            }
        
        }
        
        //MULTIPLICACION 
        for (int i = 0; i < M_2.length; i++) {
            for (int j = 0; j < M_2.length; j++){
                M_resultado2 [i][j] = M_resultado1 [i][j] * M_3 [i][j];
                //AQUI BASICAMENTE USAMOS LA MISMA ESTRUCTURA DE LA SUMA PERO LE INDICAMOS QUE VA A MULTIPLICAR EL RESULTADO OBTENIDO DE LA SUMA POR LA TERCERA;     
                }
        
        }        
        //IMPRIMIR MATRICES Y RESULTADOS DE LA SUMA
        for (int i = 0; i < M_1.length; i++){
            
            for (int j = 0; j < M_2.length ; j++){
                System.out.print("[ " + M_1[i][j] + " ]");
                
            }
            if (i == 1){
            System.out.print("  +   ");
            }else
            System.out.print("      ");    
                
            for (int j = 0; j < M_2.length; j++){
                System.out.print("[ " + M_2[i][j] + " ]");
            }    
            
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            
            for (int j = 0; j < M_resultado1.length; j++) {
                System.out.print("[ " + M_resultado1[i][j] + " ]");
            }
            
           
            //MULTIPLICAMOS EL VALOR OBTENIDO DE LA SUMA POR LA TERCERA MATRIZ  
            if (i == 1){
            System.out.print("  *   ");
            }else
            System.out.print("      ");    
                
            for (int j = 0; j < M_3.length; j++){
                System.out.print("[ " + M_3[i][j] + " ]");
            }    
            
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            
            for (int j = 0; j < M_resultado1.length; j++) {
                System.out.print("[ " + M_resultado2[i][j] + " ]");
            }
             System.out.println("");
             
          
            
            
             
            }
        }
    }

