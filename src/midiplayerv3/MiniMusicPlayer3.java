package midiplayerv3;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.JFrame;

public class MiniMusicPlayer3 {
	static JFrame f = new JFrame("My First Music Video");
	// static MyDrawPanel ml;

	public static void main(String[] args) {
		MiniMusicPlayer3 mini = new MiniMusicPlayer3();

		mini.go();

	}

	public void setUpGui() {
		// ml = new MyDrawPanel();
		// f.setContentPane(ml);
		f.setBounds(30, 30, 300, 300);
		f.setVisible(true);
	}

	public void go() {
		setUpGui();

		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			// sequencer.addControllerEventListener(ml, new int[] {127});
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();

			int r = 0;
			for (int i = 0; i < 60; i += 4) {
				r = (int) ((Math.random() * 50) + 1);
				// track.add(makeEvent(144,1,r,100,i));
				// track.add(makeEvent(176,1,127,9,i));
				// track.add(makeEvent(128,1,r,100,i+2));
			}
			sequencer.setSequence(seq);
			sequencer.start();
			sequencer.setTempoInBPM(120);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
