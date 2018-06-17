/**
 * @(#)IronMaiden.java
 *
 *
 * @Joseph Tierney
 * @version 1.00 2018/2/12
 */

import javax.swing.*;
import java.awt.*;

public class IronMaiden extends Band{

	Icon bruceIcon = new ImageIcon("images/ironmaiden/bruce.png");
	Icon daveIcon = new ImageIcon("images/ironmaiden/dave.png");
	Icon nickoIcon = new ImageIcon("images/ironmaiden/nicko.png");
	Icon bookIcon = new ImageIcon("images/albums/book.png");
	Icon finalIcon = new ImageIcon("images/albums/final.png");
	Icon bookTrack = new ImageIcon("images/tracklists/booktracks.png");
	Icon finalTrack = new ImageIcon("images/tracklists/finaltracks.png");

    public BandFactory getVocals(){
		return new BandFactory(bruceIcon, "Bruce Dickinson", "59", "Bruce Dickinson is the vocalist of Iron Maiden.");
	}// End getVocals

	public BandFactory getGuitar(){
		return new BandFactory(daveIcon, "Dave Murray", "61", "Dave Murray is the guitarst of Iron Maiden.");
	}// End getGuitar

	public BandFactory getDrum(){
		return new BandFactory(nickoIcon, "Nicko McBrian", "65", "Nicko McBrian is the drummer of Iron Maiden.");
	}// End getDrum

	public AlbumFactory getFirstAlbum(){
		return new AlbumFactory(bookIcon, bookTrack);
	}// End getFirstAlbum

	public AlbumFactory getSecondAlbum(){
		return new AlbumFactory(finalIcon, finalTrack);
	}// End getSecondAlbum

}// End class