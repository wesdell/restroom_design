public class Person {
  private final Genre genre;
  private final Disability disability;
  private Toilet toiletInUse;
  private Urinal urinalInUse;
  private DisabilityToilet disabilityToiletInUse;

  public Person(Genre genre, Disability disability) {
    this.genre = genre;
    this.disability = disability;
  }

  public void useRestroom(Building building) {
    switch (genre) {
      case MAN:
        if (this.disability == Disability.YES) {
          this.disabilityToiletInUse = building.useFirstAvailableCleanDisabilityToiletMan();
          if (this.disabilityToiletInUse == null) {
            System.out.println("There is no disability toilet available.");
          }
        } else {
          this.urinalInUse = building.useFirstAvailableCleanUrinal();
          if (this.urinalInUse == null) {
            System.out.println("There is no urinal available.");
          }
        }
        break;
      case WOMAN:
        if (this.disability == Disability.YES) {
          this.disabilityToiletInUse = building.useFirstAvailableCleanDisabilityToiletWoman();
          if (this.disabilityToiletInUse == null) {
            System.out.println("There is no disability toilet available.");
          }
        } else {
          this.toiletInUse = building.useFirstAvailableCleanToiletWoman();
          if (this.toiletInUse == null) {
            System.out.println("There is no toilet available.");
          }
        }
        break;
      default:
        break;
    }
  }

  public void leaveCleanRestroom() {
    switch (genre) {
      case MAN:
        this.urinalInUse.leaveAndClean();
        break;
      case WOMAN:
        this.toiletInUse.leaveAndClean();
        break;
      default:
        break;
    }
  }
}
