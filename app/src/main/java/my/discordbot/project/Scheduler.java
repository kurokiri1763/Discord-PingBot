package my.discordbot.project;

import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class Scheduler extends ListenerAdapter {
    @Override
    public void onMassageReceived(MassageReceivedEvent event) {
        LocalDateTime now = LocalDateTime.now();
    }
    
}
