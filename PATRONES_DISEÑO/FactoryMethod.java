// FUNDACION UNIVERSITARIA UNIMONSERRATE
// JORDAN STIVEN MARIN CARDOZO
// ING. SISTEMAS NOCTURNA
// Clase abstracta que representa un postre
abstract class Postre {
    // Método abstracto que debe ser implementado por los subtipos de Postre
    abstract void servir();
}

// Clase concreta que representa un pastel
class Pastel extends Postre {
    // Implementación del método servir para el pastel
    void servir() {
        System.out.println("¡Estás sirviendo un delicioso pastel!");
    }
}

// Clase concreta que representa un helado
class Helado extends Postre {
    // Implementación del método servir para el helado
    void servir() {
        System.out.println("¡Estás sirviendo un refrescante helado!");
    }
}

// Clase abstracta que actúa como creador de postres
abstract class CreadorDePostres {
    // Método abstracto para crear un postre
    abstract Postre crearPostre();
}

// Clase concreta que crea pasteles
class CreadorDePastel extends CreadorDePostres {
    // Método que retorna un nuevo pastel
    Postre crearPostre() {
        return new Pastel();
    }
}

// Clase concreta que crea helados
class CreadorDeHelado extends CreadorDePostres {
    // Método que retorna un nuevo helado
    Postre crearPostre() {
        return new Helado();
    }
}

// Clase Main para ejecutar el programa
class Main {
    public static void main(String[] args) {
        // Crear un creador de pasteles y un pastel
        CreadorDePostres creadorPastel = new CreadorDePastel();
        Postre pastel = creadorPastel.crearPostre();
        pastel.servir(); // Servir el pastel

        // Crear un creador de helados y un helado
        CreadorDePostres creadorHelado = new CreadorDeHelado();
        Postre helado = creadorHelado.crearPostre();
        helado.servir(); // Servir el helado
    }
}
