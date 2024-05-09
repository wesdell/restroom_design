public class WomenRestroom {
  public static final int TOILETS_AMOUNT = 4;

  private Toilet[] toilets;
  private AccessibleToilet accessibleToilet;

  public WomenRestroom() {
    this.accessibleToilet = new AccessibleToilet();
    this.toilets = new Toilet[TOILETS_AMOUNT];
    this.toilets[0] = new Toilet();
    this.toilets[1] = new Toilet();
    this.toilets[2] = new Toilet();
    this.toilets[3] = new Toilet();
  }

  public Toilet chooseToilet(int toiletNumber) {
    return this.toilets[toiletNumber];
  }

  public  AccessibleToilet chooseAccessibleToilet() {
    return accessibleToilet;
  }
}