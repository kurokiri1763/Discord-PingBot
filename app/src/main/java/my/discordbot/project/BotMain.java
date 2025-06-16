package my.discordbot.project;

public class BotMain {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new BotMain().getGreeting());
    }
}
