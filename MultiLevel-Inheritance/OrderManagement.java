import java.util.Date;

class Order {
    int orderId;
    Date orderDate;

    public Order(int orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(int orderId, Date orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped";
    }

    public void displayShippingInfo() {
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    Date deliveryDate;

    public DeliveredOrder(int orderId, Date orderDate, String trackingNumber, Date deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered";
    }

    public void displayDeliveryInfo() {
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Date orderDate = new Date();
        Date deliveryDate = new Date(); 

        Order order = new Order(101, orderDate);
        order.displayOrderInfo();
        System.out.println("--------------------");

        ShippedOrder shippedOrder = new ShippedOrder(102, orderDate, "TRACK12345");
        shippedOrder.displayOrderInfo();
        shippedOrder.displayShippingInfo();
        System.out.println("--------------------");


        DeliveredOrder deliveredOrder = new DeliveredOrder(103, orderDate, "TRACK67890", deliveryDate);
        deliveredOrder.displayOrderInfo();
        deliveredOrder.displayShippingInfo();
        deliveredOrder.displayDeliveryInfo();
        System.out.println("--------------------");

        Order myOrder;

        myOrder = order;
        myOrder.displayOrderInfo();
        System.out.println("--------------------");

        myOrder = shippedOrder;
        myOrder.displayOrderInfo();
        System.out.println("--------------------");

        myOrder = deliveredOrder;
        myOrder.displayOrderInfo();
        System.out.println("--------------------");


    }
}