// FUNDACION UNIVERSITARIA UNIMONSERRATE
// JORDAN STIVEN MARIN CARDOZO
// ING. SISTEMAS NOCTURNA

// Interfaz que define el comportamiento de los animales de peluche
interface AnimalDePeluche {
    // Método que permite jugar con el animal de peluche
    void jugar();
}

// Clase que representa un perro de peluche
class PerroDePeluche implements AnimalDePeluche {
    public void jugar() {
        System.out.println("¡Estás jugando con un perro de peluche!");
    }
}

// Clase que representa un gato de peluche
class GatoDePeluche implements AnimalDePeluche {
    public void jugar() {
        System.out.println("¡Estás jugando con un gato de peluche!");
    }
}

// Interfaz que actúa como fábrica de animales
interface FabricaDeAnimales {
    // Método para crear un animal de peluche
    AnimalDePeluche crearAnimal();
}

// Clase que crea perros de peluche
class FabricaDePerros implements FabricaDeAnimales {
    public AnimalDePeluche crearAnimal() {
        return new PerroDePeluche(); // Retorna un nuevo perro de peluche
    }
}

// Clase que crea gatos de peluche
class FabricaDeGatos implements FabricaDeAnimales {
    public AnimalDePeluche crearAnimal() {
        return new GatoDePeluche(); // Retorna un nuevo gato de peluche
    }
}

// Clase Main para ejecutar el programa
class Main {
    public static void main(String[] args) {
        // Crear una fábrica de perros y jugar con el animal creado
        FabricaDeAnimales fabricaPerro = new FabricaDePerros();
        AnimalDePeluche perro = fabricaPerro.crearAnimal();
        perro.jugar();

        // Crear una fábrica de gatos y jugar con el animal creado
        FabricaDeAnimales fabricaGato = new FabricaDeGatos();
        AnimalDePeluche gato = fabricaGato.crearAnimal();
        gato.jugar();
    }
}
