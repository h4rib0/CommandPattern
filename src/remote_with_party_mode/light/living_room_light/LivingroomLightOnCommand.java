package remote_with_party_mode.light.living_room_light;

import remote_with_party_mode.Command;
import remote_with_party_mode.light.Light;

public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.on();
	}
	public void undo() {
		light.off();
	}
}
