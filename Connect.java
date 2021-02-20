package Project;

import java.sql.*;

public class Connect {
     public static  Connection   connect() throws SQLException {
    String url="jdbc:mysql://127.0.0.1:3306/alilisoft?ServerTomeZone=utc";
    String user="root";
    String password="Alilisoft121";
    Connection con= DriverManager.getConnection(url,user,password);

    Statement stm=con.createStatement();
    return con;
}

public static void loginconnect(int empid, String pwd) throws SQLException {
//          Statement st= Connect.connect().createStatement();
//    String queryCheck = "SELECT * from employee WHERE empID = '" + empid + "' and password = '"+pwd+"'";

//   ResultSet rs = st.executeQuery(queryCheck);


       Statement stmt= Connect.connect().createStatement();
        ResultSet rs;
        String query =
                "SELECT * FROM employee WHERE empID = '" + empid + "' " ;
        //this.executeUpdate(conn, getValues);

        rs = stmt.executeQuery(query);

      //  String printValues = rs.getString(pwd);

       while(rs.next()){
           int id=rs.getInt("empid");
           String pwd1=rs.getString("password");
           String fn=rs.getString("first_name");
           String ln=rs.getString("last_name");


           System.out.println(id+"   "+pwd);
           if(id==empid && pwd1.equals(pwd)  ){
               System.out.println("connection  successfully ");
               System.out.println("Welcome to Manager Session " +fn+" "+ln);

               Manager choice=new Manager();
                  Manager.mainMenu();
           }else{
               System.out.println("not correct");
           }




}}

}
