
package my.discordbot.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BotMainTest {
    @Test void appHasAGreeting() {
        BotMain classUnderTest = new BotMain();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
