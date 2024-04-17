package Marathon.Day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse; //Ссылка на склад для связи сотрудника и склада

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.getCountOrders();
        warehouse.setCountOrders(warehouse.getCountOrders()+1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrders()>1500){
            salary*=3;
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
