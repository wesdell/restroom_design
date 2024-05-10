public class Toilet {
    private boolean available;
    private boolean clean;

    public boolean isAvailableClean() {
        return this.available && this.clean;
    }

    public void use() {
        this.available = false;
    }

    @Override
    public String toString() {
        return this.available ? "Available" : "Not Available";
    }
}