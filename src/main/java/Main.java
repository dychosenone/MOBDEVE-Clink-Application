import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        APIHelper api = new APIHelper();
        User user = new User();

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(exit != true) {
            int input = Integer.parseInt(sc.nextLine());

            switch (input) {
                case 1:
                    user.setAccessToken(api.login("hello", "helloworld"));
                    break;
                case 2:
                    api.register("jacobdy2", "Jacob Dy", "jacobdy1@google.com", "010101", "helloworld");
                    break;
                case 3:
                    api.getProfile("611bcefe4854e212fc371e67");
                    break;
                case 4:
                    api.editProfile("universe@google.com", "Hello Universe", "10102001");
                    break;
                case 5:
                    api.changePassword("hellouniverse", "helloworld");
            }
        }
    }

}
