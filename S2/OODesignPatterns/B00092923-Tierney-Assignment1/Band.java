/**
 * @(#)Band.java
 * THIS IS A FACTORY
 *
 * @Joseph Tierney
 * @version 1.00 2018/2/12
 */


public abstract class Band {

	public abstract BandFactory getVocals();
	public abstract BandFactory getGuitar();
	public abstract BandFactory getDrum();
	public abstract AlbumFactory getFirstAlbum();
	public abstract AlbumFactory getSecondAlbum();

}// End class