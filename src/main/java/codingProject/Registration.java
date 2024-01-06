package codingProject;
/*
Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid passwords cannot contain
userName.
 */

public class Registration {
    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        setEmail(email);
        setUserName(userName);
        setPassword(password);
    }

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("You can only use an email address from Yahoo.com");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
        } else if (userName.isEmpty()) {
            System.out.println("User Name must not be empty");
        } else {
            System.out.println("Your User Name must contain more than six characters");
        }
    }

    public void setPassword(String password) {
        if (password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else if (password.isEmpty()) {
            System.out.println("You must enter a Password");
        } else if (password.contains(userName)) {
            System.out.println("Your password can not be the same as your User Name");
        } else {
            System.out.println("Your password must contain more than six characters");
        }
    }

    public void printInfo() {
        System.out.println("User name: " + userName);
        System.out.println("Email address: " + email);
        System.out.println("Password: " + password);
    }
}

class RegistrationTester {
    public static void main(String[] args) {

        Registration register = new Registration("ivan@yahoo.com", "Ivan1234", "password123");
        register.printInfo();
        System.out.println("*********************************");
        register.setEmail("Carlos@yahoo.com");
        register.setUserName("LeatherFace123");
        register.setPassword("chainsaw123");
        register.printInfo();

    }
}
