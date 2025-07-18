package offerings;

/**
 * Enum representing the available item categories
 * in the marketplace.
 *
 * @author Paul Bakenhus
 */
public enum Category {
  FURNITURE,
  ELECTRONICS,
  OTHER;

  /**
   * Converts the enum value to string.
   *
   * @return the formatted category name as a string
   */
  public String str() {
    switch (this) {
      case FURNITURE:
        return "Furniture";
      case ELECTRONICS:
        return "Electronics";
      case OTHER:
        return "Other";
      default:
        throw new IllegalArgumentException("Unknown category: " + this);
    }
  }
}
