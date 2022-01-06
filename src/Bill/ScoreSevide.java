/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import ConectDatabase.Conect.conect.DBconect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import test52.Score789;
import test52.Sinhvien;

/**
 *
 * @author ASUS
 */
public class ScoreSevide {
    public List <Score789> getAll(){
    List <Score789> users =new ArrayList<Score789>();
    Connection connection =DBconect.getDBcConnection();
    String sql ="SELECT * FROM hi.score2";
    try{
    PreparedStatement preparedStatement =connection.prepareStatement(sql);
    ResultSet rs =preparedStatement.executeQuery();
        while (rs.next())
        {
            Score789 user=new Score789();
            user.setID(rs.getString("ID"));
            user.setDiemnganh1(rs.getString("nganh1"));
            user.setDiemnganh2(rs.getString("nganh2"));
            user.setDiemnganh3(rs.getString("nganh3"));
            user.setMalop(rs.getString("malop"));
            user.setTenSV(rs.getString("tênSV"));
            users.add(user);
        }
    }catch(Exception e){
        e.printStackTrace();
}    
    return users;
    }

}
