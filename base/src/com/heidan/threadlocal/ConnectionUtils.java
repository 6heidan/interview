package com.heidan.threadlocal;


public class ConnectionUtils {
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    public static Connection getConnection(){
        Connection connection = threadLocal.get();
        if (connection == null){
            connection = new Connection();
            threadLocal.set(connection);
        }
        return connection;
    }
}
