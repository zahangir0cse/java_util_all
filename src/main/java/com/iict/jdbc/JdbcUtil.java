package com.iict.jdbc;

import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class JdbcUtil {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234Zah";
    public static final String URL = "jdbc:mysql://localhost:3306/masum_db";
    private JdbcUtil() {
    }

    public static Connection getConnection(String driverName, String username, String password, String url) throws ClassNotFoundException, SQLException {
        Class.forName(driverName);
//        Connection connection = DriverManager.getConnection(url, username, password);
        return DriverManager.getConnection(url, username, password);
    }

    public static Connection getConnection( String url) throws ClassNotFoundException, SQLException {
        return getConnection(DRIVER, USERNAME, PASSWORD, url);
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        return getConnection(URL);
    }

    public static int insertOrUpdateData(String query, List<Object> parameters) {
        try(Connection connection = getConnection()) {
            PreparedStatement ps = getPreparedStatement(connection, query);
            if(parameters != null && parameters.size() > 0){
                for (int i = 0; i < parameters.size(); i++) {
                    ps.setObject(i+1,  parameters.get(i));
                }
            }
            return ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }

    }

    public static <T extends Object> List<T>  getResultSet(Map<String, Object> parameters, Class<T> tClass) {
        try(Connection connection = getConnection()){
            StringBuilder queryBuilder = new StringBuilder("select * from " + tClass.getSimpleName().toLowerCase() + " where 1=1 ");
            if(parameters != null && parameters.size() > 0){
                for(Map.Entry entry: parameters.entrySet()){
                    queryBuilder.append(" and ").append(entry.getKey()).append("=? ");
                }
            }
            PreparedStatement ps = getPreparedStatement(connection, queryBuilder.toString());
            if(parameters != null && parameters.size() > 0){
                int index = 0;
                for(Map.Entry entry: parameters.entrySet()){
                    ps.setObject(++index,  entry.getValue());
                }
            }
            ResultSet resultSet = ps.executeQuery();
            List<T> tList = new ArrayList<>();
            while (resultSet != null && resultSet.next()){
                T t = tClass.newInstance();
                for (Method method : t.getClass().getMethods()) {
                    if(method.getName().startsWith("set")){
                        method.invoke(t, resultSet.getObject(method.getName().substring(3).toLowerCase()));
                    }
                }
                tList.add(t);
            }
            return tList;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static PreparedStatement getPreparedStatement(Connection connection, String query) throws SQLException {
//        PreparedStatement statement = connection.prepareStatement(query);
        return connection.prepareStatement(query);
    }
}
