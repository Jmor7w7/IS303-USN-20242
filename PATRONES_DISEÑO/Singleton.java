// FUNDACION UNIVERSITARIA UNIMONSERRATE
// JORDAN STIVEN MARIN CARDOZO
// ING. SISTEMAS NOCTURNA

// EJEMPLO DE SINGLETON DEDICADO A UN UNICORNIO QUE ES UNICO EN EL MUNDO

public class Unicornio {
    // Instancia privada estática
    private static Unicornio instance;

    // Constructor privado para evitar la instanciación desde otras clases
    private Unicornio() {
        // Constructor privado
    }

    // Método estático para obtener la única instancia de Unicornio
    public static synchronized Unicornio getInstance() {
        // Si no hay instancia, crear una nueva
        if (instance == null) {
            instance = new Unicornio();
        }
        return instance;
    }

    // Método para mostrar los poderes mágicos del unicornio
    public void showMagicalPowers() {
        System.out.println("¡Soy el único Unicornio mágico del mundo!");
    }
}

// Clase Main sin modificador de acceso público
class Main {
    public static void main(String[] args) {
        // Obtener la única instancia de Unicornio
        Unicornio unicornio = Unicornio.getInstance();
        // Mostrar los poderes mágicos del unicornio
        unicornio.showMagicalPowers();
    }
}
