// FUNDACION UNIVERSITARIA UNIMONSERRATE
// JORDAN STIVEN MARIN CARDOZO
// ING. SISTEMAS NOCTURNA

// Clase que representa una hamburguesa
class Hamburguesa {
    private String tamano;       // Tamaño de la hamburguesa
    private String ingredientes;  // Ingredientes de la hamburguesa

    // Método para establecer el tamaño de la hamburguesa
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    // Método para establecer los ingredientes de la hamburguesa
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    // Método que retorna la descripción de la hamburguesa
    @Override
    public String toString() {
        return "Hamburguesa de " + tamano + " con " + ingredientes;
    }
}

// Clase constructor para crear hamburguesas
class ConstructorDeHamburguesas {
    private Hamburguesa hamburguesa; // Objeto hamburguesa que se está construyendo

    // Constructor que inicializa la hamburguesa
    public ConstructorDeHamburguesas() {
        hamburguesa = new Hamburguesa();
    }

    // Método para establecer el tamaño de la hamburguesa en el constructor
    public ConstructorDeHamburguesas establecerTamano(String tamano) {
        hamburguesa.setTamano(tamano);
        return this; // Retorna el constructor para encadenar métodos
    }

    // Método para agregar ingredientes a la hamburguesa en el constructor
    public ConstructorDeHamburguesas agregarIngredientes(String ingredientes) {
        hamburguesa.setIngredientes(ingredientes);
        return this; // Retorna el constructor para encadenar métodos
    }

    // Método que retorna la hamburguesa construida
    public Hamburguesa construir() {
        return hamburguesa;
    }
}

// Clase Main para ejecutar el programa
class Main {
    public static void main(String[] args) {
        // Construir una hamburguesa grande con carne, lechuga y tomate
        Hamburguesa hamburguesa = new ConstructorDeHamburguesas()
                .establecerTamano("grande")
                .agregarIngredientes("carne, lechuga y tomate")
                .construir();

        // Mostrar la descripción de la hamburguesa creada
        System.out.println("Has creado: " + hamburguesa);
    }
}
