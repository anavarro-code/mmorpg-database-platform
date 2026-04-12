package com.biblioteca.menu;

import com.biblioteca.conexion.Conexion;
import java.sql.*;
import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);
    private static Connection conexion = Conexion.getConexion();

    public static void mostrarMenu() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n========================================");
            System.out.println("   AETHORIA CHRONICLES DATABASE");
            System.out.println("========================================");
            System.out.println("1. Ver todas las clases");
            System.out.println("2. Ver items del juego");
            System.out.println("3. Ver habilidades por clase");
            System.out.println("4. Añadir nueva clase");
            System.out.println("5. Añadir nuevo item");
            System.out.println("6. Eliminar clase");
            System.out.println("7. Eliminar item");
            System.out.println("0. Salir");
            System.out.println("========================================");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: verClases(); break;
                case 2: verItems(); break;
                case 3: verHabilidades(); break;
                case 4: añadirClase(); break;
                case 5: añadirItem(); break;
                case 6: eliminarClase(); break;
                case 7: eliminarItem(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion no valida");
            }
        }
    }

    private static void verClases() {
        try {
            String sql = "SELECT c.nombre, r.nombre AS rol, c.descripcion FROM CLASE c JOIN ROL r ON c.id_rol = r.id_rol";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("\n--- CLASES ---");
            while (rs.next()) {
                System.out.println("Clase: " + rs.getString("nombre") +
                        " | Rol: " + rs.getString("rol") +
                        " | " + rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void verItems() {
        try {
            String sql = "SELECT i.nombre, t.nombre AS tipo, i.rareza, i.descripcion FROM ITEM i JOIN TIPO_ITEM t ON i.id_tipo = t.id_tipo";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("\n--- ITEMS ---");
            while (rs.next()) {
                System.out.println("Item: " + rs.getString("nombre") +
                        " | Tipo: " + rs.getString("tipo") +
                        " | Rareza: " + rs.getString("rareza"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void verHabilidades() {
        try {
            String sql = "SELECT h.nombre, h.daño, c.nombre AS clase FROM HABILIDAD h JOIN CLASE c ON h.id_clase = c.id_clase ORDER BY c.nombre";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("\n--- HABILIDADES ---");
            while (rs.next()) {
                System.out.println("Habilidad: " + rs.getString("nombre") +
                        " | Daño: " + rs.getInt("daño") +
                        " | Clase: " + rs.getString("clase"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void añadirClase() {
        try {
            System.out.print("Nombre de la clase: ");
            String nombre = scanner.nextLine();
            System.out.print("Descripcion: ");
            String descripcion = scanner.nextLine();
            System.out.print("ID del rol (1=Tanque, 2=DPS, 3=Healer): ");
            int idRol = scanner.nextInt();
            scanner.nextLine();

            String sql = "INSERT INTO CLASE (nombre, descripcion, id_rol) VALUES (?, ?, ?)";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setInt(3, idRol);
            ps.executeUpdate();
            System.out.println("Clase añadida correctamente.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void añadirItem() {
        try {
            System.out.print("Nombre del item: ");
            String nombre = scanner.nextLine();
            System.out.print("Descripcion: ");
            String descripcion = scanner.nextLine();
            System.out.print("Rareza (Común, Raro, Épico, Legendario): ");
            String rareza = scanner.nextLine();
            System.out.print("ID del tipo (1=Arma, 2=Armadura, 3=Accesorio, 4=Poción): ");
            int idTipo = scanner.nextInt();
            scanner.nextLine();

            String sql = "INSERT INTO ITEM (nombre, descripcion, rareza, id_tipo) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setString(3, rareza);
            ps.setInt(4, idTipo);
            ps.executeUpdate();
            System.out.println("Item añadido correctamente.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void eliminarClase() {
        try {
            verClases();
            System.out.print("ID de la clase a eliminar: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            String sql = "DELETE FROM CLASE WHERE id_clase = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Clase eliminada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void eliminarItem() {
        try {
            verItems();
            System.out.print("ID del item a eliminar: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            String sql = "DELETE FROM ITEM WHERE id_item = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Item eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}