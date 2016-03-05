/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marathon_2;

import java.sql.SQLException;

/**
 * 
 * @author Mao
 */
public class Queries extends Conection{
    
    public String validateLogin(String email, String password){
        String response = null;
        
        try {
            conect();
            
            query = conection.prepareStatement("SELECT * FROM user WHERE Email = ? AND Password = ?");
            query.setString(1, email);
            query.setString(2, password);
            
            data = query.executeQuery();
            
            while(data.next()){
                response = data.getString("RoleId");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return response;
    }
}
