
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;

public class Player
{
	private Clip clip;
public void playmusic(String musicfile) {
File soundFile = new File(musicfile);
try {
	if (musicfile.equals("stop"))
	{
		clip.stop();
		System.out.print("stopped");
	}
	else {
Clip clip = AudioSystem.getClip();
AudioInputStream inputStream= AudioSystem.getAudioInputStream(soundFile);
clip=AudioSystem.getClip();
clip.open(inputStream);
clip.loop(clip.LOOP_CONTINUOUSLY);
clip.start();
}
}	
catch(Exception e)
{
System.out.println(e);
}
}
}

