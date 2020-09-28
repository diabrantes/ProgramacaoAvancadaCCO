public class Main {
    public static void main(String[] args) {
        System.out.println("Se o resultado for o mesmo valor duas vezes, o Singleton foi reutilizado. " + "\n" +
                "Se não, o Singleton foi criado" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
