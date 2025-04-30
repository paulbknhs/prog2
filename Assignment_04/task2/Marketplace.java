import java.util.Scanner;

import auth.User;
import offerings.Item;
import offerings.Category;

/**
 * This class represents a marketplace where users can offer and list items for
 * sale.
 * It maintains a list of registered users and allows listing all items
 * currently offered.
 *
 * @author Paul Bakenhus
 * @version 2025-04-29
 */
public class Marketplace {
  /** Array of registered users in the marketplace. */
  User[] users;

  /**
   * Adds a user to the marketplace.
   * Ensures no duplicate usernames exist and initializes the user array if
   * necessary.
   *
   * @param user The user to be added.
   * @return {@code true} if the user was added successfully, {@code false}
   *         otherwise.
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

    Item newitem = new Item("Item1", 0.99f, newuser, "Beschreibung1", Category.ELECTRONICS);
    newuser.addItem(newitem);
    System.out.println(marketplace.str());
  }

  /**
   * Returns a string listing all items in a certain {@link Category}
   * currently offered in the marketplace.
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

  public User login() {
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
        System.out.print("Username: ");
        String username = scan.next();
        System.out.print("Password: ");
        String password = scan.next();

        for (User user : this.users) {
            if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        System.out.println("Invalid credentials. Try again.");
    }
    System.out.println("Too many failed attempts. Exiting.");
    System.exit(1);
    return null;
}


public void cli() {
  Scanner scan = new Scanner(System.in);
  User currentUser = login();
  if (currentUser == null) return;

  while (true) {
      drawMenu();
      int selection = scan.nextInt();
      scan.nextLine();

      switch (selection) {
          case 1:
              System.out.print("Item Name: ");
              String itemName = scan.nextLine();
              System.out.print("Price: ");
              float itemPrice = scan.nextFloat();
              scan.nextLine();
              System.out.print("Description: ");
              String description = scan.nextLine();
              Category cat = categoryPrompt(scan);
              currentUser.addItem(new Item(itemName, itemPrice, currentUser, description, cat));
              break;

          case 2:
              System.out.print("Name of item to delete: ");
              String toDelete = scan.nextLine();
              for (int i = 0; i < currentUser.getItems().length; i++) {
                  Item it = currentUser.getItems()[i];
                  if (it != null && it.getName().equals(toDelete)) {
                      currentUser.getItems()[i] = null;
                      System.out.println("Item removed.");
                      break;
                  }
              }
              break;

          case 3:
              Item[] items = currentUser.getItems();
              for (int i = 0; i < items.length; i++) {
                  if (items[i] != null)
                      System.out.printf("%d) %s\n", i, items[i].getName());
              }
              System.out.print("Select item index: ");
              int idx = scan.nextInt();
              scan.nextLine();
              if (idx >= 0 && idx < items.length && items[idx] != null) {
                  System.out.print("New name: ");
                  items[idx].setName(scan.nextLine());
                  System.out.print("New price: ");
                  items[idx].setVerkaufspreis(scan.nextFloat());
                  scan.nextLine();
                  System.out.print("New description: ");
                  items[idx].setBeschreibung(scan.nextLine());
              }
              break;

          case 4:
              Category filter = categoryPrompt(scan);
              System.out.println(filterMarket(filter));
              break;

          case 5:
              System.out.println("Goodbye!");
              return;

          default:
              System.out.println("Invalid option.");
      }
  }
}


private Category categoryPrompt(Scanner scan) {
  System.out.println("1. FURNITURE\n2. ELECTRONICS\n3. OTHER\n4. Back");
  int choice = scan.nextInt();
  scan.nextLine();
  switch (choice) {
      case 1: return Category.FURNITURE;
      case 2: return Category.ELECTRONICS;
      case 3: return Category.OTHER;
      default: return null;
  }
}


  private void drawMenu() {
    System.out.println("Marketplace Menu");
    System.out.println("1. Add Item");
    System.out.println("2. Remove Item");
    System.out.println("3. View Marketplace");
    System.out.println("4. Modify your listings");
    System.out.println("5. Exit");
  }

}
