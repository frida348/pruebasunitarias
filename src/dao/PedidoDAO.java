package dao;

import modelo.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    private List<Pedido> pedidos = new ArrayList<>();

    public void guardarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> obtenerPedidos() {
        return new ArrayList<>(pedidos);
    }
}
