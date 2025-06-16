package my.discordbot.project;

import net.dv8tion.jda.api.JDABuilder;

public class BotMain {
    public static void main(String[] args) throws Exception {
        String token = System.getenv("DISCORD_BOT_TOKEN");
        JDABuilder.createDeffault(token)
                .addEventListeners(new Scheduler())
                .build();
    }
}
