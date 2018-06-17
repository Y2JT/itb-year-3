/**
 * @(#)GreenDay.java
 *
 *
 * @Joseph Tierney
 * @version 1.00 2018/2/12
 */

import javax.swing.*;
import java.awt.*;

public class GreenDay extends Band{

	Icon billieIcon = new ImageIcon("images/greenday/billie.png");
	Icon mikeIcon = new ImageIcon("images/greenday/mike.png");
	Icon treIcon = new ImageIcon("images/greenday/tre.png");
	Icon revIcon = new ImageIcon("images/albums/rev.png");
	Icon unoIcon = new ImageIcon("images/albums/uno.png");
	Icon revTrack = new ImageIcon("images/tracklists/revtracks.png");
	Icon unoTrack = new ImageIcon("images/tracklists/unotracks.png");

    public BandFactory getVocals(){
		return new BandFactory(billieIcon, "Billie Joe Armstrong", "46", "Billie Joe Armstrong is the vocalist of Green Day.");
	}// End getVocals

	public BandFactory getGuitar(){
		return new BandFactory(mikeIcon, "Mike Dirnt", "45", "Mike Dirnt is the guitarst of Green Day.");
	}// End getGuitar

	public BandFactory getDrum(){
		return new BandFactory(treIcon, "Tré Cool", "45", "Tré Cool is the drummer of Green Day.");
	}// End getDrum

	public AlbumFactory getFirstAlbum(){
		return new AlbumFactory(revIcon, revTrack);
	}// End getFirstAlbum

	public AlbumFactory getSecondAlbum(){
		return new AlbumFactory(unoIcon, unoTrack);
	}// End getSecondAlbum

}// End class