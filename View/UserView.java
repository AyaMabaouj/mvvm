package View;
import ViewModel.UserViewModel;
import java.util.Scanner;

public class UserView {
   private UserViewModel userViewModel;

   public UserView(UserViewModel userViewModel) {
       this.userViewModel = userViewModel;
   }

   public void displayUser() {
       System.out.println("User name: " + userViewModel.getUserName());
       System.out.println("User age: " + userViewModel.getUserAge());
   }

   public void getUserInput() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter user name: ");
       String name = scanner.nextLine();
       System.out.println("Enter user age: ");
       int age = scanner.nextInt();

       userViewModel.setUserName(name);
       userViewModel.setUserAge(age);
   }
}
