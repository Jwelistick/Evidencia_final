package Evidencia;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

            //Variables
            Scanner sc = new Scanner(System.in);
            int res = 0;
            int con = 0;
            String usuario;
            String contrasena;
            boolean admin =false;

        while (con == 0) {
            System.out.println("Iniciar sesión\n" +
                    "Nombre de usuario:");
            usuario = sc.next();
            System.out.println("Contraseña:");
            contrasena = sc.next();

            Conexión.connect();

            if(contrasena == /* contraseña de admin*/"admin"){
                //Acceso habilitado
                admin = true;
            }else if (contrasena == /*Contraseña normal*/"contraseña"){
                //Acceso habilitado
            }


            //Código con la sesión iniciada
            while (con == 0) {
                System.out.println("Consultorio\n" +
                        "Que desea hacer?");
                if (admin) {
                    System.out.println("0-Agregar doctor");
                }
                System.out.println("1-Agregar pacientes\n" +
                        "2-Crear cita\n" +
                        "3-Salir");
                res = sc.nextInt();
                sc.nextLine();

                switch (res) {
                    case 0:
                        Doctores();
                        break;
                    case 1:
                        Pacientes();
                        break;
                    case 2:
                        Citas();
                        break;
                    case 3:
                        con = Exit();
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            }
        }

    }


        //Métodos
        public static void Doctores () {
            //Agregar doctores a la base de datos
            System.out.println("Escribe el nombre del doctor");
            System.out.println("Doctor registrado!");
        }

        public static void Pacientes () {
            //Agregar pacientes a la base de datos
            System.out.println("Escribe el nombre del paciente");
            System.out.println("Paciente registrado!");
        }

        public static void Citas () {
            //Crear citas a la base de datos
            System.out.println("Escribe la fecha de la cita DD/MM/AA");
            System.out.println("Escribe el nombre del paciente");
            System.out.println("Escribe el nombre del doctor");
            System.out.println("El pago fué correcto? y/n");
            System.out.println("Cita realizada!");
        }

        public static int Exit(){
        return 1;
        }





}