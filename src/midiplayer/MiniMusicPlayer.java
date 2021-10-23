package midiplayer;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMusicPlayer {

	public static void main(String[] args) {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();

			Sequence seq = new Sequence(Sequence.PPQ, 4); // make a sequence
			Track track = seq.createTrack(); // make a track

			for (int i = 61; i < 100; i += 4) { // making events to keep notes going up from 61 to 100

				track.add(makeEvent(144, 1, i, 100, i));
				track.add(makeEvent(128, 1, i, 100, i + 2));
			}
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
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
