public class Person {
  private Genre genre;
  private Disability disability;
  private Toilet toiletInUse;
  private Urinal urinalInUse;

  public Person(Genre genre, Disability disability) {
    this.genre = genre;
    this.disability = disability;
  }

  public void useRestroom(Building building) {
    switch (genre) {
      case MAN:
        this.urinalInUse = building.useFirstAvailableCleanUrinal();
        if (this.urinalInUse == null) {
          System.out.println("There is no urinal available.");
        }
        break;
      case WOMAN:
        this.toiletInUse = building.useFirstAvailableCleanToilet();
        if (this.toiletInUse == null) {
          System.out.println("There is no toilet available.");
        }
        break;
      default:
        break;
    }
  }

  public void leaveCleanRestroom() {
    switch (genre) {
      case MAN:
        this.urinalInUse.leaveClean();
        break;
      case WOMAN:
        this.toiletInUse.leaveClean();
        break;
      default:
        break;
    }
  }
}