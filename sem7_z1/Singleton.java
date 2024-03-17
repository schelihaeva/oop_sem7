public class Singleton {
    // Статическая переменная для хранения единственного экземпляра класса Singleton
    private static Singleton instance;
    
    // Приватный конструктор, чтобы предотвратить инстанцирование извне класса
    private Singleton() {}
    
    // Статический метод для получения экземпляра класса Singleton
    public static Singleton getInstance() {
    // Если экземпляр еще не создан, создаем его
    if (instance == null) {
    instance = new Singleton();
    }
    // Возвращаем экземпляр класса
    return instance;
    }
    
    // Метод, демонстрирующий действие класса
    public void doSomething() {
    System.out.println("Doing something...");
    }
    }