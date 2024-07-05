package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import entities.enums.OrderStatus;

public class Order {

	// Atributos
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	private Client client = new Client();
	private LinkedList<OrderItem> orderItem = new LinkedList<OrderItem>();

	// Metodos Especificos
	public void addItem(OrderItem item) {
		this.orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.orderItem.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		
		for (OrderItem c : this.orderItem) {
			total += c.subTotal();
		}
		
		return total;
	}
	
	public String toString1() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + this.status + "\n");
		sb.append("Client: " + this.client.getNome());
		sb.append(" (" + sdf1.format(this.client.getBirthDate()) + ") - " + this.client.getEmail() + "\n");
		sb.append("Order items: \n");
		Double total = 0.0;
		for (OrderItem oI : orderItem) {
			sb.append(oI.getProduct().getNome() + ", $" + oI.getProduct().getPrice() + ", Quantity: " + oI.getQuantity() + ", Subtotal: $" + oI.subTotal() + "\n");
			total += oI.subTotal();
		}
		sb.append(String.format("Total price: $%.2f", total));
		
		return sb.toString();
	}

	// Metodos Especiais
	public Order() {
		super();
	}

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	@Override
	public String toString() {
		return "Order [moment=" + moment + ", status=" + status + ", client=" + client + ", orderItem=" + orderItem
				+ "]";
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LinkedList<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(LinkedList<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

}
