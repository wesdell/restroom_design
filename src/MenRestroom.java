public class MenRestroom {
  public static final int TOILETS_AMOUNT = 4;
  public static final int URINALS_AMOUNT = 4;

  private Toilet[] toilets;
  private AccessibleToilet accessibleToilet;
  private Urinal[] urinals;

  public MenRestroom() {
    this.accessibleToilet = new AccessibleToilet();
    this.toilets = new Toilet[TOILETS_AMOUNT];
    this.toilets[0] = new Toilet();
    this.toilets[1] = new Toilet();
    this.toilets[2] = new Toilet();
    this.toilets[3] = new Toilet();
    this.urinals = new Urinal[URINALS_AMOUNT];
    this.urinals[0] = new Urinal();
    this.urinals[1] = new Urinal();
    this.urinals[2] = new Urinal();
    this.urinals[3] = new Urinal();
  }

  public Toilet chooseToilet(int toiletNumber) {
    return this.toilets[toiletNumber];
  }

  public  AccessibleToilet chooseAccessibleToilet() {
    return accessibleToilet;
  }

  public Urinal chooseUrinals(int urinalNumber) {
    return this.urinals[urinalNumber];
  }
}