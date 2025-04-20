package auth;

import java.util.ArrayList;
import java.util.Arrays;
import offerings.Item;

class User {
  String Username;
  String Password;
  Item[] Items;

  public User(String Username, String Password) {
    this.Username = username;
    this.Password = password;
  }

  public String getUsername() {
    return this.Username;
  }

  public String getPassword() {
    return this.Password;
  }

  public void setUsername(String newUsername) {
    this.Username = newUsername;
  }

  public void setPassword(String newPassword) {
    this.Password = newPassword;
  }

  public boolean removeItem(Item item) {
    ArrayList items = new ArrayList<>(Arrays.asList(this.Items));
    return items.remove(item);
  }

  public boolean addItem(Item item) {
    ArrayList items = new ArrayList<>(Arrays.asList(this.Items));
    return items.add(item);
  }

}
