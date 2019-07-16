package snackBar;

public class Snack
{
    // Fields, state of the class, attributes
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // constructor
    public Snack(int id, String name, int quantity, double cost, int vendingMachineId)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // Methods, behaviors
    // getters and setters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double cost()
    {
        return cost;
    }

    public void cost(double cost)
    {
        this.cost = cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public int getQuantity()
    {
        return quantity;
    }

    
}