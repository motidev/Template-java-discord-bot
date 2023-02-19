package motilabs.system.commands;

import static motilabs.system.Main.shardMan;

public class Command {

	/**
	 * Method with push command to discord
	 * @throws InterruptedException
	 */
	public  void commandPush() throws InterruptedException {
		shardMan.updateCommands().queue();
		test();
	}

	/**
	 * Command Test
	 */
	public void test() {
		shardMan.upsertCommand("test", "Command example").queue();
		System.out.println("[Monitor] Public slashcommands test");
	}
}
