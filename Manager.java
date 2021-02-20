package Project;

import java.sql.SQLException;
import java.util.Scanner;

public class Manager extends Connect  {
    static Scanner input=new Scanner(System.in);

    public static void mainMenu() throws SQLException {
        System.out.println("1- Add employees");
        System.out.println("2 - remove employees");
        System.out.println("3- Update time of employee");
        int choice =input.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter ID ");
                int id = input.nextInt();
                System.out.println("Enter first name ");
                String fn = input.next();
                System.out.println("Enter last name ");
                String ln = input.next();
                System.out.println("Enter Password ");
                String pwd = input.next();
                System.out.println("Enter Department ");
                String dp = input.next();
                //  System.out.println("Enter state");
                Connect.connect().createStatement().execute("INSERT INTO `employee`(empID,first_name,last_name ,password,Department) VALUES ('" + id + "' ,' " + fn + "',' " + ln + " ',' " + pwd + " ',' " + dp + " ')");
                System.out.println("Done...!!");
                Connect.connect().close();
                break;

            }
            case 2: {
                System.out.println("Enter ID of employee");
                int id = input.nextInt();

                //  System.out.println("Enter state");


                Connect.connect().createStatement().execute("delete from employee where empID='" + id + "'");
                System.out.println("Employee deleted ...!!");
                Connect.connect().close();
                break;

            }
            case 3: {
                System.out.println("Enter ID of employee");
                int id = input.nextInt();
                System.out.println("1- update first_name ");
                System.out.println("2- update last name ");
                System.out.println("3- Change your password");

                int aa = input.nextInt();

                if (aa == 1) {

                    System.out.println("Enter first name ");
                    String fn = input.next();

                    Connect.connect().createStatement().execute("update employee SET first_name = '" + fn + "' where empID='" + id + "'");
                    System.out.println("Employee First name updated ...!!");
                    Connect.connect().close();
                    break;
                }

                if (aa == 2) {

                    System.out.println("Enter last name ");
                    String ln = input.next();

                    Connect.connect().createStatement().execute("update employee SET last_name = '" + ln + "' where empID='" + id + "'");
                    System.out.println("Employee Last name updated ...!!");
                    Connect.connect().close();
                    break;
                }
                if (aa == 3) {

                    System.out.println("Enter  your  new Password ");
                    String pwd = input.next();

                    Connect.connect().createStatement().execute("update employee SET password = '" + pwd + "' where empID='" + id + "'");
                    System.out.println("your password  updated ...!!");
                    Connect.connect().close();
                    break;
                }
            }
        }}}