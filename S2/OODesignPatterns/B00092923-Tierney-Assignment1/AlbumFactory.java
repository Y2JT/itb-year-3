/**
 * @(#)AlbumFactory.java
 * THIS IS NOT A FACTORY
 *
 * @Joseph Tierney
 * @version 1.00 2018/2/12
 */

import javax.swing.*;
import java.awt.*;

public class AlbumFactory {

	private Icon cover;
    private Icon tracklist;

    public AlbumFactory(Icon acover, Icon atracks) {
    	cover = acover;
    	tracklist = atracks;
    }// End AlbumFactory

    public Icon getAlbumCover(){
    	return cover;
    }// End getCover

    public Icon getTracklist(){
    	return tracklist;
    }// End getTracklist

}// End class