package motilabs.system.commands.events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class test extends ListenerAdapter {

	/**
	 * 
	 * Method with which we will capture the event of our command
	 * @param event
	 * 
	 */
	 public void onSlashCommandInteraction( SlashCommandInteractionEvent event) {
		if(event.getName().equals("test")) {
			System.err.println("hola");
			EmbedBuilder embed = new EmbedBuilder()
                    .setTitle("¡Command test!")
                    .setDescription("**Command test**");
            event.replyEmbeds(embed.build()).setEphemeral(true).queue();
		}
	}
}
