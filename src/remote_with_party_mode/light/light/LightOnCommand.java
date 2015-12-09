package remote_with_party_mode.light.light;

import remote_with_party_mode.Command;
import remote_with_party_mode.light.Light;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	public void undo() {
		light.off();
	}
}
