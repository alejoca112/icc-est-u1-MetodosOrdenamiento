public class App {
    public static void main(String[] args) throws Exception {
        //tipoVariable nombreVariable = valorVariable;
        //int[]numeros = {10,0,-5,5,15,2};
        //printArray(numeros); //Imprimo
        //String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        System.out.println("Estudiante: Geovanny Cabrera");
        System.out.println("Metodo Ordenado");
        
        
        
        //bubblesort(numeros);
        //printArray(numeros);
        //CREO LA CLASE SORTBUBBLE
        //CREAR LA CLASE == INSTANCIAR LA CLASE
        //SortBubble claseSortBubble = new SortBubble();
        //claseSortBubble.printArray(numeros); //Imprime
        //claseSortBubble.sortBubble(numeros); //ORDENA
        //System.out.println("Ordenado");
        //claseSortBubble.printArray(numeros);//Imprime

        //claseSortBubble.sortBubbleAvzAscendente(numeros);
        //claseSortBubble.printArray(numeros); //Imprime

        //claseSortBubble.sortBubbleAvzDescendente(numeros);
        //claseSortBubble.printArray(numeros);

        //Selection
        //SortSelection claseSortSelection = new SortSelection();
        //System.out.println("Metodo Seleccion");
        //System.out.println("Original");
        //claseSortSelection.printArray(numeros);
        //claseSortSelection.SortAscendente(numeros);
        //System.out.println("Ordenado Ascendente: ");
        //claseSortSelection.printArray(numeros);
        //System.out.println("Ordenado Descendente: ");
        //claseSortSelection.SortDescendente(numeros);
        //claseSortSelection.printArray(numeros);

        //InsertionSort
        //InsertionSort insertionSortAsc = new InsertionSort();
         //System.out.println("Metodo Insertion Sort: ");
        //System.out.println("Original: ");
        //insertionSortAsc.printArray(numeros);
        //insertionSortAsc.insertionSortAsc(numeros, false);
        //System.out.println("Ordenado: ");
        //insertionSortAsc.printArray(numeros);

        InsertionSort sortCadena = new InsertionSort();

        //System.out.println("Arreglo Original");
        //sortCadena.printArray(nombres);
        //sortCadena.insertionSortName(nombres);
        //System.out.println("Arreglo Ordenado");
        //sortCadena.printArray(nombres);

            System.out.println("Ordenamiento de nombres");
            Persona[] personas = new Persona[] {
            new Persona("Pedro", 30),
            new Persona("Ana", 25 ),
            new Persona("Maria", 28 ),



        }; 
        
        //System.out.println("Arrays de personas originales");
        //sortCadena.printArray(personas);
        //sortCadena.insertionSortByName(personas);
        //System.out.println("Arrays de personas ordenados");
        //sortCadena.printArray(personas);


        System.out.println("Arrays de Edades originales");
        sortCadena.printArray(personas);
        sortCadena.insertionSortByAge(personas);
        System.out.println("Arrays de Edades ordenados");
        sortCadena.printArray(personas);
    }
}