package motilabs.system;

import javax.security.auth.login.LoginException;

import motilabs.config.Colors;
import motilabs.config.Config;
import motilabs.system.commands.Command;
import motilabs.system.commands.events.test;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

/**
 * 
 * @
 * @category Discord Bot
 * @version Beta
 * @author Moti#6503 in discord
 *
 */

public class Main {
	
	// Main variables
	public static JDA shardMan;
	private static JDABuilder builder;
	private final static String PRESSENCE = "Developed by Moti#6503";

	/**
	 * 
	 * Main method from which we will start the entire process of our discord bot.
	 * @param args
	 * 
	 */
	public static void main(String[] args) throws LoginException, InterruptedException{
		systemBot();
	}
	
	
	/**
	 * 
	 * Method with which we will start the bot.
	 * @throws LoginException
	 * @throws InterruptedException 
	 * 
	 */
	private static void systemBot() throws LoginException, InterruptedException {
		
		// Create config constructor
		
		Config config = new Config();
		
		// --------------------------
		
		builder = JDABuilder.createDefault(config.getToken()).addEventListeners(new test());
		
		builder.setActivity(Activity.watching(PRESSENCE)).setStatus(OnlineStatus.DO_NOT_DISTURB);
		
		shardMan = builder.build();
		
		System.out.println(Colors.YELLOW + "[Monitor] The bot has been started succesfully");
		System.out.println("[Monitor] Connected to Discord" + Colors.GREEN);
		
		// Create command Constructor
		
		Command command = new Command();
		
		// Push
		
		command.commandPush();
	
	}
} 
