// Пример использования
public class Main {
    public static void main(String[] args) {
    // Получение единственного экземпляра класса Singleton
    Singleton singleton = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    //Singleton singleton2 = new Singleton создаем обьект исключительно в нашем методе
    System.out.println(singleton);
    System.out.println(singleton2);
    // Вызов метода экземпляра
    singleton.doSomething();
    }
    }
