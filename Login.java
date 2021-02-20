package Project;
import java.sql.SQLException;
import java.util.Scanner;

public class Login extends Connect {
    static Scanner input=new Scanner(System.in);

    public static void session() throws SQLException {
        System.out.print ("Employee ID  : ");
        int empid=input.nextInt();
        System.out.print("Enter Password : ");
        String pwd=input.next();

     Connect.loginconnect(empid,pwd);

        }
 }
