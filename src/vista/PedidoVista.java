package vista;

import controlador.PedidoControlador;
import dao.PedidoDAO;
import java.util.Scanner;

public class PedidoVista {
    public static void main(String[] args) {
        PedidoDAO pedidoDAO = new PedidoDAO();
        PedidoControlador pedidoControlador = new PedidoControlador(pedidoDAO);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente:");
        String cliente = scanner.nextLine();
        System.out.println("Ingrese el total del pedido:");
        double total = scanner.nextDouble();
        
        try {
            pedidoControlador.agregarPedido(cliente, total);
            System.out.println("Pedido registrado para: " + cliente);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
