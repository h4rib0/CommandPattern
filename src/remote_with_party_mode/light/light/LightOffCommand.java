package remote_with_party_mode.light.light;

import remote_with_party_mode.Command;
import remote_with_party_mode.light.Light;

public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}

	public void undo() {
		light.on();
	}
}
