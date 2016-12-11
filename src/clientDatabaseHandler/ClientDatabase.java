package clientDatabaseHandler;

import clientPackage.Register;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.sql.*;

/**
 * Created by Ayettey on 11/12/2016.
 */
@ManagedBean
@RequestScoped
public class ClientDatabase implements Serializable{
    @ManagedProperty(value ="#{register}")
    private Register message;
    private String firstName;
    private String surname;
    private String emailOrMobileNumber;
    private String secretID;
    private String reenterSecretID;
    private String day;
    private String month;
    private String year;
    private String dateOfBirth;

    private boolean isMale;
    private boolean isFemale;

    public void clientInformation(){

        Connection connection=null;
        Statement statement=null;
        firstName=message.getFirstName();
        surname=message.getSurname();
        emailOrMobileNumber=message.getEmailOrMobileNumber();
        secretID=message.getSecretID();
        reenterSecretID=message.getReenterSecretID();
        day=message.getDay();
        month=message.getMonth();
        year=message.getYear();
        dateOfBirth=day+":"+month+":"+year;




        try {
            Class.forName("jdbc:mysql://localhost:3306/panocinimaClientDatabase");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/panocinimaClientDatabase/root/0000");
            statement=connection.createStatement();

            String clientInput="INSERT INTO clientAccount(ID,FirstName,Surname,EmailAndPhone,SecretPassword,ReenterSecretPassword," +
                    "DateOfBirth,Gender)VALUES ()";
            ResultSet resultSet=statement.executeQuery(clientInput);

        }catch (ClassNotFoundException e){
            e.getException();

        }catch (SQLException x){
            x.getStackTrace();
        }


    }


}
