/**
 * @(#)Fozzy.java
 *
 *
 * @Joseph Tierney
 * @version 1.00 2018/2/12
 */

import javax.swing.*;
import java.awt.*;

public class Fozzy extends Band{

	Icon chrisIcon = new ImageIcon("images/fozzy/chris.png");
	Icon richIcon = new ImageIcon("images/fozzy/rich.png");
	Icon frankIcon = new ImageIcon("images/fozzy/frank.png");
	Icon judasIcon = new ImageIcon("images/albums/judas.png");
	Icon warIcon = new ImageIcon("images/albums/war.png");
	Icon judasTrack = new ImageIcon("images/tracklists/judastracks.png");
	Icon warTrack = new ImageIcon("images/tracklists/wartracks.png");

    public BandFactory getVocals(){
		return new BandFactory(chrisIcon, "Chris Jericho", "47", "Chris Jericho is the vocalist of Fozzy.");
	}// End getVocals

	public BandFactory getGuitar(){
		return new BandFactory(richIcon, "Rich Ward", "45", "Rich Ward is the guitarist of Fozzy.");
	}// End getGuitar

	public BandFactory getDrum(){
		return new BandFactory(frankIcon, "Frank Fontsere", "39", "Frank Fontsere is the drummer of Fozzy.");
	}// End getDrum

	public AlbumFactory getFirstAlbum(){
		return new AlbumFactory(judasIcon, judasTrack);
	}// End getFirstAlbum

	public AlbumFactory getSecondAlbum(){
		return new AlbumFactory(warIcon, warTrack);
	}// End getSecondAlbum

}// End class