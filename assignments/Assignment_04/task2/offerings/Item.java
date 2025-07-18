package offerings;

import auth.User;
/**
 * This class represents an item offered in the marketplace.
 * Each item has a name, price, owner (seller), and description.
 * Only the owner should be allowed to change item properties (not enforced here).
 *
 * @author Paul Bakenhus
 * @version 2025-04-29
 */
public class Item {

  /** The name of the item. */
  String Name;

  /** The price of the item. */
  float Verkaufspreis;

  /** The seller (owner) of the item. */
  User Verkaeufer;

  /** A short description of the item. */
  String Beschreibung;

  /**The items Category */
  Category Kategorie;

  /**
   * Constructs a new item with the given attributes.
   *
   * @param Name The name of the item.
   * @param Verkaufspreis The price of the item.
   * @param Verkaeufer The owner of the item.
   * @param Beschreibung The description of the item.
   * @author Paul Bakenhus
   */
  public Item(String Name, float Verkaufspreis, User Verkaeufer, String Beschreibung, Category Kategorie) {
    this.Name = Name;
    this.Verkaufspreis = Verkaufspreis;
    this.Verkaeufer = Verkaeufer;
    this.Beschreibung = Beschreibung;
    this.Kategorie = Kategorie;
  }

  /**
   * Returns the name of the item.
   *
   * @return The name.
   * @author Paul Bakenhus
   */
  public String getName() {
    return this.Name;
  }

  /**
   * Returns the category of the item.
   *
   * @return The category.
   * @author Paul Bakenhus
   */
  public String getCategory() {
    return this.Kategorie.str();
  }

  /**
   * Returns the price of the item.
   *
   * @return The price.
   * @author Paul Bakenhus
   */
  public float getVerkaufspreis() {
    return this.Verkaufspreis;
  }

  /**
   * Returns the seller of the item.
   *
   * @return The seller as a {@link User}.
   * @author Paul Bakenhus
   */
  public User getVerkaeufer() {
    return this.Verkaeufer;
  }

  /**
   * Returns the description of the item.
   *
   * @return The description text.
   * @author Paul Bakenhus
   */
  public String getBeschreibung() {
    return this.Beschreibung;
  }

  /**
   * Sets the name of the item.
   *
   * @param newName The new name.
   * @author Paul Bakenhus
   */
  public void setName(String newName) {
    this.Name = newName;
  }

  /**
   * Sets the price of the item.
   *
   * @param newVerkaufspreis The new price.
   * @author Paul Bakenhus
   */
  public void setVerkaufspreis(float newVerkaufspreis) {
    this.Verkaufspreis = newVerkaufspreis;
  }

  /**
   * Sets the seller of the item.
   *
   * @param newVerkaeufer The new seller.
   * @author Paul Bakenhus
   */
  public void setVerkaeufer(User newVerkaeufer) {
    this.Verkaeufer = newVerkaeufer;
  }

  /**
   * Sets the description of the item.
   *
   * @param newBeschreibung The new description.
   * @author Paul Bakenhus
   */
  public void setBeschreibung(String newBeschreibung) {
    this.Beschreibung = newBeschreibung;
  }
}
