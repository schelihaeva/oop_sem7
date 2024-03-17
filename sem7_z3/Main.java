public class Main {
public static void main(String[] args) {
ComputerBuilder builder = new StandardComputerBuilder();
Computer computer = builder.setCPU("Intel i7")
.setRAM("16GB")
.setStorage("256GB SSD")
.build();

computer.displayConfiguration(); // Вывод конфигурации собранного компьютера
}
}