public class Toilet {
    private boolean available;
    private boolean toiletPaper;
    private boolean openSeatCover;
    private boolean openDoor;

    public void use(int toiletNumber) {
        if (!this.isAvailable()) {
            System.out.println("El banio numero " + toiletNumber + " no esta disponible");
            return;
        }
        System.out.println("Usando el banio numero " + toiletNumber);
    }

    public boolean isAvailable() {
        return this.available;
    }
}