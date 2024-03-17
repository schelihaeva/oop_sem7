public class Computer {
private String cpu;
private String ram;
private String storage;

// Конструктор
public Computer(String cpu, String ram, String storage) {
this.cpu = cpu;
this.ram = ram;
this.storage = storage;
}

// Метод для вывода конфигурации компьютера
public void displayConfiguration() {
System.out.println("Computer Configuration: CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage);
}
}