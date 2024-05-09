public class AccessibleToilet {
    private boolean available;
    private boolean toiletPaper;
    private boolean openSeatCover;
    private boolean openDoor;

    public AccessibleToilet(){
        this.available = true;
        this.toiletPaper = true;
        this.openSeatCover = false;
        this.openDoor = false;
    }

    public void use(int toiletNumber) {
        if (!this.isAvailable()) {
            System.out.println("El banio numero " + toiletNumber + " no esta disponible");
            return;
        }
        this.available = false;
        if (!this.isOpenDoor()) {
            System.out.println("La puerta del banio numero " + toiletNumber + " esta cerrada");
            return;
        }
        if (!this.isOpenSeatCover()) {
            System.out.println("La tapa del banio numero " + toiletNumber + " esta cerrada");
            return;
        }
        System.out.println("Usando el banio numero " + toiletNumber);
    }

    public void leave(int toiletNumber) {
        this.available = true;
        System.out.println("Saliendo del banio numero " + toiletNumber);
    }

    public void openSeatCover() {
        this.openSeatCover = true;
    }

    public void closeSeatCover() {
        this.openSeatCover = false;
    }

    public void openDoor() {
        this.openDoor = true;
    }

    public void closeDoor() {
        this.openDoor = false;
    }

    public boolean isOpenSeatCover(){
        return this.openSeatCover;
    }

    public boolean isOpenDoor(){
        return this.openDoor;
    }

    public boolean isToiletPaper(){
        return this.toiletPaper;
    }

    public boolean isAvailable() {
        return this.available;
    }
}