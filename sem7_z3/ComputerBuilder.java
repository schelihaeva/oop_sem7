public interface ComputerBuilder {
ComputerBuilder setCPU(String cpu);
ComputerBuilder setRAM(String ram);
ComputerBuilder setStorage(String storage);
Computer build();
}