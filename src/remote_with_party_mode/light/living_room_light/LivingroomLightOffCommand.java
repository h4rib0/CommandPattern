package remote_with_party_mode.light.living_room_light;

import remote_with_party_mode.Command;
import remote_with_party_mode.light.Light;

public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.off();
	}
	public void undo() {
		light.on();
	}
}
