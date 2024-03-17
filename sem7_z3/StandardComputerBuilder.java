public class StandardComputerBuilder implements ComputerBuilder {
private String cpu;
private String ram;
private String storage;

@Override
public ComputerBuilder setCPU(String cpu) {
this.cpu = cpu;
return this;
}

@Override
public ComputerBuilder setRAM(String ram) {
this.ram = ram;
return this;
}

@Override
public ComputerBuilder setStorage(String storage) {
this.storage = storage;
return this;
}

@Override
public Computer build() {
return new Computer(cpu, ram, storage);
}
}