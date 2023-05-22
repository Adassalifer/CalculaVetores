import java.util.Scanner;
public class Main { 

public static void main(String[] args) { 

   Scanner sc = new Scanner(System.in); 
    System.out.println("Este programa recebe números inteiros,
    negativos e positivos e zero. Calcula a maior diferença entre dois elementos distintos no vetor,
    e informa se os vetores estão em ordem crescente ou não."); 
     System.out.println("___________________________________________________________");
     
     System.out.println("Informe o número de vetores, e tecle Enter:"); 
       int n = sc.nextInt(); 
       int[] vet = new int[n]; 
        System.out.println("___________________________________________________________"); 
        
        System.out.println("Digite o valor e aperte Enter para continuar:"); 
         for (int i = 0; i < n; i++) { 
         int valor = sc.nextInt(); 
          vet[i] = valor; }   
           System.out.println("___________________________________________________________");
         
         System.out.println("A maior diferença entre dois elementos é: " + DifElem(vet, n)); 
          System.out.println();
          if (cresc(vet, n) == 1) {
            System.out.println("Os vetores estão em ordem crescente!");
            } else
                System.out.println("Os vetores não estão em ordem crescente!");

          sc.close(); 
          
       System.out.println();
        System.out.println("______________________________FIM___________________________") ;
 
 

                     }  static int DifElem(int[] vet, int n) {
                      
                       int dif = 0;
                        int maior = vet[0]; 
                         for (int i = 0; i < n; i++) {
                           if (vet[i] > maior) { 
                             maior = vet[i]; } }
                          
                          int menor = vet[0]; 
                          for (int i = 0; i < n; i++){
                          if (vet[i] < menor) { menor = vet[i]; } } 
                           return dif = maior - menor; } 
                          
                          static int cresc(int[] vet, int n) { 
                           for (int i = 1; i < n; i++) { 
                            if (vet[i - 1] > vet[i]) { 
                             return 0; }
                                  }return 1; 
                        
                        } 
                        
      }
