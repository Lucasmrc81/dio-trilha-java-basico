public class operadores3 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;  

        boolean simNao = numero1 == numero2;
        if(numero1 == numero2){
            System.out.println("a nossa condição é verdadeiro");
        }

        System.out.println("Numero um é igual a numero Dois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero um é diferente a numero Dois? " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("Numero um é maior que numero Dois? " + simNao);
    }
    
}
