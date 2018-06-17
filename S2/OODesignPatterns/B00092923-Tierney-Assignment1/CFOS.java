/**
 * @(#)CFOS.java
 *
 *
 * @Joseph Tierney
 * @version 1.00 2018/2/12
 */

import javax.swing.*;
import java.awt.*;

public class CFOS extends Band {

	Icon drakeIcon = new ImageIcon("images/cfos/drake.png");
	Icon andyIcon = new ImageIcon("images/cfos/andy.png");
	Icon baronIcon = new ImageIcon("images/cfos/baron.png");
	Icon sunIcon = new ImageIcon("images/albums/sun.png");
	Icon dayIcon = new ImageIcon("images/albums/day.png");
	Icon sunTrack = new ImageIcon("images/tracklists/suntracks.png");
	Icon dayTrack = new ImageIcon("images/tracklists/daytracks.png");

	public BandFactory getVocals(){
		return new BandFactory(drakeIcon, "Drake Bell", "31", "Drake Bell is the vocalist of CFOS.");
	}// End getVocals

	public BandFactory getGuitar(){
		return new BandFactory(andyIcon, "Andy Alt", "27", "Andy Alt is the guitarist of CFOS.");
	}// End getGuitar

	public BandFactory getDrum(){
		return new BandFactory(baronIcon, "Baron Corbin", "33", "Baron Corbin is the drummer of CFOS.");
	}// End getDrum

	public AlbumFactory getFirstAlbum(){
		return new AlbumFactory(sunIcon, sunTrack);
	}// End getFirstAlbum

	public AlbumFactory getSecondAlbum(){
		return new AlbumFactory(dayIcon, dayTrack);
	}// End getSecondAlbum

}// End class