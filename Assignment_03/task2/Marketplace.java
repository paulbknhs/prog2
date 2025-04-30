import java.util.Locale.Category;

import auth.User;
import offerings.Item;

/**
 * This class represents a marketplace where users can offer and list items for sale.
 * It maintains a list of registered users and allows listing all items currently offered.
 *
 * @author Paul Bakenhus
 * @version 2025-04-29
 */
public class Marketplace {
  /** Array of registered users in the marketplace. */
  User[] users;

  /**
   * Adds a user to the marketplace.
   * Ensures no duplicate usernames exist and initializes the user array if necessary.
   *
   * @param user The user to be added.
   * @return {@code true} if the user was added successfully, {@code false} otherwise.
   * @author Paul Bakenhus
   */
  public boolean addUser(User user) {
    if (users == null) {
      users = new User[10];
      users[0] = user;
      return true;
    }
    for (int i = 0; i < users.length; i++) {
      if (users[i] != null && users[i].getUsername().equals(user.getUsername()))
        return false;
      else if (users[i] == null) {
        users[i] = user;
        return true;
      }
    }
    return false;
  }

  /**
   * Returns a string listing all items currently offered in the marketplace.
   * Iterates over all users and collects their items if present.
   *
   * @return A formatted string of all offered items
   * @author Paul Bakenhus
   */
  public String str() {
    String items = "";
    if (users == null) {
      return "No users";
    }
    for (User user : users) {
      if (user != null) {
        Item[] userItems = user.getItems();
        if (userItems == null) {
          continue;
        }
        for (Item item : userItems) {
          if (item != null) {
            items += "[";
            items += "Item: " + item.getName() + " ";
            items += "Preis: " + item.getVerkaufspreis() + " ";
            items += "Verkäufer: " + item.getVerkaeufer().getUsername() + " ";
            items += "Beschreibung: " + item.getBeschreibung();
            items += "Kategorie: " + item.getCategory();
            items += "]\n";
          }
        }
      }
    }
    return items;
  }

  /**
   * Main method for testing purposes.
   * Adds a user and an item, and prints the current marketplace state.
   *
   * @param args Command line arguments (unused).
   * @author Paul Bakenhus
   */
  public static void main(String[] args) {
    User newuser = new User("user1", "password1");
    Marketplace marketplace = new Marketplace();
    marketplace.addUser(newuser);
    System.out.println(marketplace.str());

    Item newitem = new Item("Item1", 0.99f, newuser, "Beschreibung1", Categoty.ELECTRONICS);
    newuser.addItem(newitem);
    System.out.println(marketplace.str());
  }

  /**
   * Returns a string listing all items in a certain {@link Categoty} currently offered in the marketplace.
   * Iterates over all users and collects their items if present.
   *
   * @param category The category that should be filtered for
   * @return A formatted string of all offered items
   * @author Paul Bakenhus
   */
  public String filterMarket(Category category) {
    String items = "";
    if (users == null) {
      return "No users";
    }
    for (User user : users) {
      if (user != null) {
        Item[] userItems = user.getItems();
        if (userItems == null) {
          continue;
        }
        for (Item item : userItems) {
          if (item != null && item.getCategory().equals(category)) {
            items += "[";
            items += "Item: " + item.getName() + " ";
            items += "Preis: " + item.getVerkaufspreis() + " ";
            items += "Verkäufer: " + item.getVerkaeufer().getUsername() + " ";
            items += "Beschreibung: " + item.getBeschreibung();
            items += "Kategorie: " + item.getCategory();
            items += "]\n";
          }
        }
      }
    }
    return items;
  }
}
