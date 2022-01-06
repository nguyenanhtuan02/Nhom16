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
import test52.Sinhvien;

/**
 *
 * @author ASUS
 */
public class SinhvienServide {
    public List <Sinhvien> getAll(){
    List <Sinhvien> users =new ArrayList<Sinhvien>();
    Connection connection =DBconect.getDBcConnection();
    String sql ="SELECT * FROM hi.sinhvien2";
    try{
    PreparedStatement preparedStatement =connection.prepareStatement(sql);
    ResultSet rs =preparedStatement.executeQuery();
        while (rs.next())
        {
            Sinhvien user=new Sinhvien();
            user.setID(rs.getString("ID"));
            user.setTenSV(rs.getString("tênSV"));
            user.setMalop(rs.getString("malop"));
            user.setTuoi(rs.getString("tuoi"));
            user.setGioiTinh(rs.getString("gioitinh"));
            user.setDiaChi(rs.getString("diachi"));
            user.setSdt(rs.getString("sdt"));
            user.setEmail(rs.getString("Email"));
            users.add(user);
        }
    }catch(Exception e){
        e.printStackTrace();
}    
    return users;
    }

}
