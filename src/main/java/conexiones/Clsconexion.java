/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexiones;
import java.sql.*;

/**
 *
 * @author Usuario
 */
public class Clsconexion {
    
    
    public static void delete(int numero){//ingresa elnumero que quieres borrar
        String url = "jdbc:mysql://localhost:3306/db_comision?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","edwin");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "delete from tb_comisiones where numero="+numero ;
          
            //este print nos sirve para analizar qué instrucción sql se va a ejecutar
            //System.out.println(sql);
            // paso 5 ejecutamos el query
            // tome atención que es diferente del paso 5 de la funcion ej1
            sentencia.execute(sql);
           
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
        
        
    }
    
    
    
    
    public static void nombresyTotales(){//los nombres y totales
            String url = "jdbc:mysql://localhost:3306/db_comision?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","edwin");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM db_comision.tb_comisiones  "; //where nota1 >50
            //"SELECT * FROM dbalumnos.tb_alumnos where nota1 >50";
            
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
            System.out.println("Nombre         Total");             //usa un for e iteras los get
           
            while(resultado.next()){
                int total =resultado.getInt(4)+resultado.getInt(5)+resultado.getInt(6)+resultado.getInt(7)+resultado.getInt(8)+resultado.getInt(9);      
                
                System.out.println(resultado.getString(3)+"\t\t"+total);
                
                
            }
        } catch (SQLException ex) {
            System.out.println("Hubo problema= " + ex.getMessage());
        }
        
        
    }
    
    
    
    public static void nombreYdatos(int numero){//el numero de la persona
        String url = "jdbc:mysql://localhost:3306/db_comision?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","edwin");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM db_comision.tb_comisiones where numero =  "+numero; //where nota1 >50
            //"SELECT * FROM dbalumnos.tb_alumnos where nota1 >50";
            
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
            System.out.println("Numero  Codigo  Nombre         Enero            Febrero         Marzo           Abril           Mayo            Junio           Total");             //usa un for e iteras los get
            
            //   +resultado.getInt(5))+resultado.getInt(6)+resultado.getInt(7)+resultado.getInt(8)+resultado.getInt(9);
            // System.out.println(total);
            //System.out.println(resultado.getInt(1)+"\t"+resultado.getString(2)+"\t"+resultado.getString(3)+"\t\t"+resultado.getInt(4)+"\t\t"+resultado.getInt(5)+"\t\t"+resultado.getInt(6)+"\t\t"+resultado.getInt(7)+"\t\t"+resultado.getInt(8)+"\t\t"+resultado.getInt(9)); 
              
            while(resultado.next()){
                int total =resultado.getInt(4)+resultado.getInt(5)+resultado.getInt(6)+resultado.getInt(7)+resultado.getInt(8)+resultado.getInt(9);      
                
                System.out.println(resultado.getInt(1)+"\t"+resultado.getString(2)+"\t"+resultado.getString(3)+"\t\t"+resultado.getInt(4)+"\t\t"+resultado.getInt(5)+"\t\t"+resultado.getInt(6)+"\t\t"+resultado.getInt(7)+"\t\t"+resultado.getInt(8)+"\t\t"+resultado.getInt(9)+"\t\t"+total);
                
                
            }
        } catch (SQLException ex) {
            System.out.println("Hubo problema= " + ex.getMessage());
        }
        
    }
    
    public static void tabla(){
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/db_comision?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","edwin");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM db_comision.tb_comisiones "; //where nota1 >50
            //"SELECT * FROM dbalumnos.tb_alumnos where nota1 >50";
            
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
            System.out.println("Numero  Codigo  Nombre         Enero            Febrero         Marzo           Abril           Mayo            Junio  ");             //usa un for e iteras los get
            while(resultado.next()){
                System.out.println(resultado.getInt(1)+"\t"+resultado.getString(2)+"\t"+resultado.getString(3)+"\t\t"+resultado.getInt(4)+"\t\t"+resultado.getInt(5)+"\t\t"+resultado.getInt(6)+"\t\t"+resultado.getInt(7)+"\t\t"+resultado.getInt(8)+"\t\t"+resultado.getInt(9));
                
            }

//            while(resultado.next()){
//                System.out.println("id ="+resultado.getInt(1));
//                System.out.println("Nombre = "+resultado.getString(2));
//                System.out.println("nota 1 ="+resultado.getInt(3));
//                System.out.println("nota 2 ="+resultado.getInt(4));
//            }



        } catch (SQLException ex) {
            System.out.println("Hubo problema= " + ex.getMessage());
            
        }
}

    public static void cambiaNIV(int oldnum,int nextnum){
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/db_comision?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","edwin");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "update tb_comisiones  set numero = "+nextnum+" where numero = "+oldnum;
            //"update tb_alumnos  set enero = "+enero+" where numero = "+id;
            
            //este print nos sirve para analizar qué instrucción sql se va a ejecutar
            //System.out.println(sql);
            // paso 5 ejecutamos el query
            // tome atención que es diferente del paso 5 de la funcion ej1
            sentencia.execute(sql);
           
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
}
    
    
    
}
