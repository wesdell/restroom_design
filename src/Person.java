public class Person {
  private Genre genre;
  private Disability disability;
  private Toilet toiletInUse;
  private Urinal urinalInUse;

  public Person(Genre genre, Disability disability) {
    this.genre = genre;
    this.disability = disability;
  }

  public void useUrinal(Building building) {
    switch (genre) {
      case MAN:
        this.urinalInUse = building.useFirstAvailableCleanUrinal();
        break;
      case WOMAN:
        this.toiletInUse = building.useFirstAvailableCleanToilet();
        break;
      default: {
        break;
      }
    }
  }
}