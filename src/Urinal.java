public class Urinal {
    private boolean available;

    public Urinal(){
        this.available = true;
    }

    public void use(int toiletNumber) {
        if (!this.isAvailable()) {
            System.out.println("El banio numero " + toiletNumber + " no esta disponible");
            return;
        }
        this.available = false;
        System.out.println("Usando el banio numero " + toiletNumber);
    }

    public void leave(int toiletNumber) {
        this.available = true;
        System.out.println("Saliendo del banio numero " + toiletNumber);
    }

    public boolean isAvailable() {
        return this.available;
    }
}