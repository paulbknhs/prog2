package auth;

import java.util.ArrayList;
import java.util.Arrays;
import offerings.Item;

/**
 * This class represents a user in the marketplace.
 * A user has a username, password, and can manage up to 10 items.
 *
 * @author Paul Bakenhus
 * @version 2025-04-29
 */
public class User {
  /** The username of the user. */
  String Username;

  /** The password of the user. */
  String Password;

  /** The list of items offered by this user. */
  Item[] Items;

  /**
   * Constructs a new User with given username and password.
   *
   * @param Username The user's name.
   * @param Password The user's password.
   * @author Paul Bakenhus
   */
  public User(String Username, String Password) {
    this.Username = Username;
    this.Password = Password;
    Items = new Item[10];
  }

  /**
   * Returns the username of the user.
   *
   * @return The username.
   * @author Paul Bakenhus
   */
  public String getUsername() {
    return this.Username;
  }

  /**
   * Returns the array of items this user is offering.
   *
   * @return An array of items.
   * @author Paul Bakenhus
   */
  public Item[] getItems() {
    return this.Items;
  }

  /**
   * Returns the password of the user.
   *
   * @return The password.
   * @author Paul Bakenhus
   */
  public String getPassword() {
    return this.Password;
  }

  /**
   * Updates the username of the user.
   *
   * @param newUsername The new username.
   * @author Paul Bakenhus
   */
  public void setUsername(String newUsername) {
    this.Username = newUsername;
  }

  /**
   * Updates the password of the user.
   *
   * @param newPassword The new password.
   * @author Paul Bakenhus
   */
  public void setPassword(String newPassword) {
    this.Password = newPassword;
  }

  /**
   * Removes a specific item from the user's item list.
   *
   * @param item The item to remove.
   * @return {@code true} if the item was removed, {@code false} otherwise.
   * @author Paul Bakenhus
   */
  public boolean removeItem(Item item) {
    ArrayList<Item> items = new ArrayList<>(Arrays.asList(this.Items));
    return items.remove(item);
  }

  /**
   * Adds a new item to the user's item list.
   *
   * @param item The item to add.
   * @return {@code true} if the item was added successfully, {@code false} otherwise.
   * @author Paul Bakenhus
   */
  public boolean addItem(Item item) {
    for (int i = 0; i < Items.length; i++) {
      if (Items[i] == null) {
        Items[i] = item;
        return true;
      }
    }
    return false;
  }
}
