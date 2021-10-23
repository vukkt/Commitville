package midiplayerv2;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMusicPlayer2 implements ControllerEventListener {

	public static void main(String[] args) {
		MiniMusicPlayer2 mini = new MiniMusicPlayer2();
		mini.go();
	}

	public void go() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();

			int[] eventsIWant = { 127 };
			sequencer.addControllerEventListener(this, eventsIWant);

			Sequence seq = new Sequence(Sequence.PPQ, 4); // make a sequence
			Track track = seq.createTrack(); // make a track

			for (int i = 61; i < 100; i += 4) { // making events to keep notes going up from 61 to 100

				track.add(makeEvent(144, 1, i, 100, i));
				track.add(makeEvent(176, 1, 127, 0, i)); // #we pick up the beat in our own controllerEvent
				track.add(makeEvent(128, 1, i, 100, i + 2));
			}
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void controlChange(ShortMessage event) {
		System.out.println("la");
	}

	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;

		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);

		} catch (Exception e) {
		}
		return event;
	}
}
