package pr4.game;

public class Main {
    public static void main(String[] args) {
        App app = new App();

        Game logic = new LogicGame();
        Game memory = new MemoryGame();

        app.getStatistics(logic);
        app.getStatistics(memory);
    }
}
