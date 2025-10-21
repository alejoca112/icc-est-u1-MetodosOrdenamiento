public class SortBubble {

    // CONSTRUCTOR
    public SortBubble() {
        System.out.println("Se creo mi clase SortBubble");
    }

    public void sortBubble(int[] numeros) {
        int numerosSize = numeros.length;
        int preguntaCondiction = 0;
        // 10,0,-5,5,15,2
        int numeroCambios = 0;

        for (int i = 0; i < numerosSize; i++) {
            for (int j = i + 1; j < numerosSize; j++) {
                preguntaCondiction++;
                System.out.println("Pregunto" + preguntaCondiction);
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = temp;
                    numeroCambios++;
                }
            }

        }
        System.out.println("Preguntas= " + preguntaCondiction);
        System.out.println("Cambios= " + numeroCambios);
    }
    public void sortBubbleAvzAscendente(int[] numeros) {

        int contCambios = 0;
        int contPreguntas = 0;

        for(int i = 0; i < numeros.length - 1; i++){
            boolean haycambio = false; //tecnica swapped
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                contPreguntas++;
                if(numeros[j] > numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    contCambios++;
                    haycambio = true;
                }
            }
            if(!haycambio) {
                break;
            }
        }
        System.out.println("Preguntas Metodo Ascendente= " + contPreguntas);
        System.out.println("Cambios Metodo Ascendente= " + contCambios);

        
    }

    
    public void sortBubbleAvzDescendente(int[] numeros) {

        int contCambios = 0;
        int contPreguntas = 0;

        for(int i = 0; i < numeros.length - 1; i++){
            boolean haycambio = false; //tecnica swapped
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                contPreguntas++;
                if(numeros[j] < numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    contCambios++;
                    haycambio = true;
                }
            }
            if(!haycambio) {
                break;
            }
        }
        System.out.println("Orden descendente" + numeros);
    }

    public void printArray(int[] numeros) {
        System.out.println("[");
        for (int i = 0; i < numeros.length; i++) {

            if (i == numeros.length - 1) {
                System.out.println(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }

        }
        System.out.println("]");
    }

    } 