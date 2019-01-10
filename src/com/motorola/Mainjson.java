package com.motorola;

import org.codehaus.jackson.map.ObjectMapper;
import java.sql.*;
import java.util.*;

public class Mainjson {

    public static void main(String [] args){
        Map <String,Integer> mplan = new HashMap<String, Integer>();
        List list = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;
        String ConnectionUrl = null;
        String jsonFormat = null;
        Months months = new Months();
              // String json =
              //  "[{ \"category_name\": \"בדיקה1\",\"category_id\": \"260\", \"category_value\": 2,\"months\": {\"month_0\": 1,\"month_1\": 0,\"month_2\": 0,\"month_3\": 0,\"month_4\": 0,\"month_5\": 0,\"month_6\": 0,\"month_7\": 0,\"month_8\": 0,\"month_9\": 0,\"month_10\": 0,\"month_11\": 0 }},{\"category_name\": \"בדיקה3\",\"category_id\": \"270\",\"category_value\": 0}, {\"category_name\": \"אחר\",\"category_id\": \"264\",\"category_value\": 1,\"months\": {\"month_0\": 0,\"month_1\": 0,\"month_2\": 0,\"month_3\": 1,\"month_4\": 0,\"month_5\": 0,\"month_6\": 0,\"month_7\": 0,\"month_8\": 0,\"month_9\": 0,\"month_10\": 0,\"month_11\": 0 } }]";
        ObjectMapper mapper = new ObjectMapper();

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ConnectionUrl = "jdbc:sqlserver://10.108.150.15:1433;databaseName=sysaid;user=sa;password=Motorola1;";
            conn=DriverManager.getConnection(ConnectionUrl);
            ps = conn.prepareStatement("select sr_cust_planmounth as planMonth from service_req where id = ?");
            ps.setInt(1,2448);
            rs = ps.executeQuery();
            while (rs.next()){
                jsonFormat = rs.getString("planMonth");
            }

            if(conn != null){
                System.out.println("connect"+jsonFormat);
            }

        }catch (SQLException sq){
            sq.getStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {if(rs != null) {rs.close();}} catch(Exception ee) {}
            try {if(ps != null) {ps.close();}} catch(Exception ee) {}
            try {if(conn != null) {conn.close();}} catch(Exception ee) {}
        }


        //Convert json to java
        try {
//check
                Category [] mp = mapper.readValue(jsonFormat, Category[].class);
                for(int i=0; i<mp.length; i++){

                    System.out.println(mp[i].getCategory());
                    int catValue = Integer.parseInt(mp[i].getCategoryValue());
                    System.out.println(catValue);
                    if(catValue > 0){

                        mplan.put(mp[i].getCategory()+"%"+"jan",Integer.parseInt(mp[i].getMonths().getJan()));
                        mplan.put(mp[i].getCategory()+"%"+"feb",Integer.parseInt(mp[i].getMonths().getFeb()));
                        mplan.put(mp[i].getCategory()+"%"+"march",Integer.parseInt(mp[i].getMonths().getMar()));
                        mplan.put(mp[i].getCategory()+"%"+"Apr",Integer.parseInt(mp[i].getMonths().getMar()));
                        mplan.put(mp[i].getCategory()+"%"+"May",Integer.parseInt(mp[i].getMonths().getMay()));
                        mplan.put(mp[i].getCategory()+"%"+"Jun",Integer.parseInt(mp[i].getMonths().getJun()));
                        mplan.put(mp[i].getCategory()+"%"+"Jul",Integer.parseInt(mp[i].getMonths().getJul()));
                        mplan.put(mp[i].getCategory()+"%"+"Aug",Integer.parseInt(mp[i].getMonths().getAug()));
                        mplan.put(mp[i].getCategory()+"%"+"Sept",Integer.parseInt(mp[i].getMonths().getSept()));
                        mplan.put(mp[i].getCategory()+"%"+"Oct",Integer.parseInt(mp[i].getMonths().getOct()));
                        mplan.put(mp[i].getCategory()+"%"+"Nov",Integer.parseInt(mp[i].getMonths().getNov()));
                        mplan.put(mp[i].getCategory()+"%"+"Dec",Integer.parseInt(mp[i].getMonths().getDec()));

                        System.out.println("mmm"+mp[i].getMonths().getJun());
                    }

                }
            System.out.println(mplan.values());

        }catch (Exception e){
                e.printStackTrace();
        }
    }
}

