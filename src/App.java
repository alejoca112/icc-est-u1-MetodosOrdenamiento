public class App {
    public static void main(String[] args) throws Exception {
        //tipoVariable nombreVariable = valorVariable;
        int[]numeros = {10,0,-5,5,15,2};
        printArray(numeros); //Imprimo
        System.out.println("Metodo Ordenado");
        
        
        
        //bubblesort(numeros);
        //printArray(numeros);
        //CREO LA CLASE SORTBUBBLE
        //CREAR LA CLASE == INSTANCIAR LA CLASE
        SortBubble claseSortBubble = new SortBubble();
        //claseSortBubble.printArray(numeros); //Imprime
        //claseSortBubble.sortBubble(numeros); //ORDENA
        //System.out.println("Ordenado");
        //claseSortBubble.printArray(numeros);//Imprime

        claseSortBubble.sortBubbleAvzAscendente(numeros);
        claseSortBubble.printArray(numeros); //Imprime

        claseSortBubble.sortBubbleAvzDescendente(numeros);
        claseSortBubble.printArray(numeros);
    }
    public static void printArray(int[] numeros) {
        System.out.println("[");
        for (int i = 0; i < numeros.length; i++) {

            if (i == numeros.length - 1) {
                System.out.println(numeros[i]);
            } else {
                System.out.print(numeros[i]+ ", ");
            }
            
            
        }
        System.out.println("]");
    }   
    
}
