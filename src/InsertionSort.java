public class InsertionSort{


    public InsertionSort(){
    }

    public void insertionSortAsc (int[] numeros, boolean pasos) {
        for (int i = 1 ; i < numeros.length ; i++){
            int temp = numeros[i];
            int j = i-1;
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + temp);
            }
            while(j >= 0 && numeros[j] > temp){
                if (pasos) 
                    System.out.println("Compara aux o temp: " + temp + " con numeros [" + j + "]: " + numeros[j] );
                
                numeros[j+1] = numeros[j];
                if (pasos)
                printArray(numeros); 
                j--;
                if (pasos)
                System.out.println("Mueve numeros [" + (j+1) + "] a numeros[" + (j+2) + "]");
            } 
            numeros[j+1] = temp;
            if (pasos) {
                System.out.println("Inserta aux: " + temp + "en la posicion " + (j+1));
                System.out.print("Estado Actual");
                printArray(numeros);
            }

        }

    }

    public void insertionSortName(String[] nombres) {
        int len = nombres.length;
        for (int i = 1; i < len; i++){
            String temp = nombres[i];
            int j = i-1;
            while (j >=0 && temp.compareTo(nombres[j]) < 0 ) {
                nombres[j + 1] = nombres[j] ;
                j--;
            }
            nombres[j + 1] = temp;
            
        }
    }

    public void insertionSortByName(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona temp = personas[i];
            int j = i-1;

            while (j >= 0 && temp.getNombre().compareTo(personas[j].getNombre()) < 0){
                personas[j+1] = personas[j];
                j--;
            }

            personas[j+1] = temp;
        }

    }

    public void printArray(Persona[] personas) {
    for (Persona p : personas) {
        System.out.println("[Nombre: " + p.getNombre() + ", Edad: " + p.getEdad() + "]");
    }
}



    public void insertionSortByAge(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            int j = i-1;
            Persona temp = personas[i];
            while (j >=0 && temp.getEdad() < personas[j].getEdad()) {
                personas[j+1] = personas [j];
                j--;
            }
            personas[j+1] = temp;
        }
    }
    


        public  void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {

            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i]+ ", ");
            }
            
            
        }
        System.out.println("]");
    }
    public void printArray(String[] nombres) {
    System.out.print("[");
    for (int i = 0; i < nombres.length; i++) {
        if (i == nombres.length - 1) {
            System.out.print(nombres[i]);
        } else {
            System.out.print(nombres[i] + ", ");
        }
    }
    System.out.println("]");
}


}
