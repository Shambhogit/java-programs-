package com.Microproject;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
    public static boolean insertStudentToDB(Student st){
        //jdbc code;
        boolean flag = false;
        try {
            Connection con = ConnectionProvider.createC();
            String q = "insert into students(sname,sphone,scity) values(?,?,?)";
            //preparedStatement
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,st.getStudentName());
            pstmt.setString(2,st.getStudentPhone());
            pstmt.setString(3,st.getStudentCity());
            pstmt.executeUpdate();
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
