/**
 * @(#)App.java
 *
 *
 * @Joseph Tierney
 * @version 1.00 2018/2/12
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

// Illustrates use of Abstract Factory pattern
public class App extends JFrame implements ActionListener {
	// Declare a JPanel
	JPanel panel = new JPanel();

	// Declare JLabels
	private JLabel bandLabel;
	private JLabel nameLabel;
	private JLabel ageLabel;
	private JLabel descLabel;
	private JLabel image;
	private JLabel albumCover;
	private JLabel albumTracks;

	// Declare JTextFields
	private JTextField name;
	private JTextField age;
	private JTextField description;

	// Declare Checkboxes and Buttons
	private Checkbox CFOS, Fozzy, GreenDay, IronMaiden;
	private Button Vocals, Guitar, Drum, AlbumOne, AlbumTwo, Quit;

	// Declare variable of type band
	private Band band = null;

	public App(){
		// Declare the contentPane and set panel layout to null
		Container contentPane = getContentPane();
		panel.setLayout(null);

		// Declare and create the JMenus and sub-menus
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu sounds = new JMenu("Sample Tracks");

		// Set the menuItems for the sound and about menus
		JMenuItem cfosSound = new JMenuItem("End of Days by CFOS");
		JMenuItem fozzySound = new JMenuItem("Judas by Fozzy");
		JMenuItem greenSound = new JMenuItem("Bang Bang by Green Day");
		JMenuItem ironSound = new JMenuItem("Speed of Light by Iron Maiden");
		JMenuItem about = new JMenuItem("About");
		// Add actionListener to the about menu using inner class
		about.addActionListener(new ActionListener() {
			// Start of inner actionPerformed class
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel,
						"Created by:\nJoseph Tierney\nB00092923\nInstitue of Technology Blanchardstown", "About",
						JOptionPane.PLAIN_MESSAGE);
			}// End inner actionPerformed
		}); // End actionListener

		// Add the sub-options to the file and sounds menu
		file.add(about);
		sounds.add(cfosSound);
		sounds.add(fozzySound);
		sounds.add(greenSound);
		sounds.add(ironSound);

		// Create the labels and set their position on the panel
		JLabel bandLabel = new JLabel("Bands");
		bandLabel.setBounds(24, 23, 46, 14);
		nameLabel = new JLabel("Name:");
		nameLabel.setBounds(200, 23, 46, 14);
		ageLabel = new JLabel("Age:");
		ageLabel.setBounds(210, 48, 46, 14);
		descLabel = new JLabel("Bio:");
		descLabel.setBounds(210, 73, 68, 14);
		image = new JLabel();
		image.setBounds(250, 110, 150, 150);
		albumCover = new JLabel();
		albumCover.setBounds(420, 110, 150, 150);
		albumTracks = new JLabel();
		albumTracks.setBounds(580, 110, 150, 150);

		// Create the checkboxes and set their position on the panel
		CheckboxGroup group = new CheckboxGroup();
		CFOS = new Checkbox("CFOS", group, false);
		CFOS.setBounds(24, 68, 109, 23);
		Fozzy = new Checkbox("Fozzy", group, false);
		Fozzy.setBounds(24, 118, 122, 23);
		GreenDay = new Checkbox("Green Day", group, false);
		GreenDay.setBounds(24, 170, 78, 23);
		IronMaiden = new Checkbox("Iron Maiden", group, false);
		IronMaiden.setBounds(24, 224, 109, 23);

		// Create the textfields and set their position on the panel
		name = new JTextField();
		name.setBounds(250, 23, 122, 20);
		name.setColumns(10);
		age = new JTextField();
		age.setBounds(250, 48, 25, 20);
		age.setColumns(10);
		description = new JTextField();
		description.setColumns(50);
		description.setBounds(250, 73, 270, 31);

		// Create the buttons and set their position on the panel
		Vocals = new Button("Vocalist");
		Vocals.setBounds(10, 278, 93, 23);
		Guitar = new Button("Guitarist");
		Guitar.setBounds(110, 278, 93, 23);
		Drum = new Button("Drummer");
		Drum.setBounds(210, 278, 93, 23);
		AlbumOne = new Button("Album One");
		AlbumOne.setBounds(10, 320, 93, 23);
		AlbumTwo = new Button("Album Two");
		AlbumTwo.setBounds(110, 320, 93, 23);
		Quit = new Button("Quit");
		Quit.setBounds(210, 320, 93, 23);

		// Add itemListeners to all the checkboxes
		CFOS.addItemListener(new CFOSListener());
		Fozzy.addItemListener(new FozzyListener());
		GreenDay.addItemListener(new GreenDayListener());
		IronMaiden.addItemListener(new IronMaidenListener());

		// Add actionListeners to all the buttons
		Vocals.addActionListener(this);
		Guitar.addActionListener(this);
		Drum.addActionListener(this);
		AlbumOne.addActionListener(this);
		AlbumTwo.addActionListener(this);
		Quit.addActionListener(this);

		// Add actionListeners to the sounds menu
		cfosSound.addActionListener(this);
		fozzySound.addActionListener(this);
		greenSound.addActionListener(this);
		ironSound.addActionListener(this);

		/**
		 * Keep the textFields disabled by default
		 * Prevents user from making any changes
		 */
		name.setEnabled(false);
		age.setEnabled(false);
		description.setEnabled(false);

		/**
		 * Add the menu contents to the panel
		 * Add the panel to the content pane
		 */
		menu.add(file);
		menu.add(sounds);
		panel.add(bandLabel);
		panel.add(image);
		panel.add(nameLabel);
		panel.add(ageLabel);
		panel.add(descLabel);
		panel.add(albumCover);
		panel.add(albumTracks);
		panel.add(CFOS);
		panel.add(Fozzy);
		panel.add(GreenDay);
		panel.add(IronMaiden);
		panel.add(Vocals);
		panel.add(Guitar);
		panel.add(Drum);
		panel.add(AlbumOne);
		panel.add(AlbumTwo);
		panel.add(Quit);
		panel.add(name);
		panel.add(age);
		panel.add(description);
		contentPane.add(panel);

		/**
		 * Set the menu display
		 * Disable the ability to resize the frame
		 */
		setTitle("Band App");
		setJMenuBar(menu);
		setSize(750,420);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end AppClass

	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		if(obj == Vocals){
			setVocals();
		}// End if (Vocals)
		if(obj == Guitar){
			setGuitar();
		}// End if (Guitar)
		if(obj == Drum){
			setDrum();
		}// End if (Drum)
		if(obj == AlbumOne){
			setAlbumOne();
		}// End if (AlbumOne)
		if(obj == AlbumTwo){
			setAlbumTwo();
		}// End if (AlbumTwo)
		if(obj == Quit){
			System.exit(0);
		}// End if (Quit)
		if(e.getActionCommand().equals("End of Days by CFOS")){
			try{
				// Open an audio input stream
				File soundFile = new File("sounds/cfos/EndOfDays.wav");
				AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
				// Get a sound clip resource
				Clip clip = AudioSystem.getClip();
				// Open audio clip and load samples from audio input stream
				clip.open(audioIn);
				clip.start();
			}// End try
			catch(UnsupportedAudioFileException exception){
				exception.printStackTrace();
			}// End catch
			catch(IOException exception){
				exception.printStackTrace();
			}// End catch
			catch(LineUnavailableException exception){
				exception.printStackTrace();
			}// End catch
		}// End if
		if(e.getActionCommand().equals("Judas by Fozzy")){
			try{
				// Open an audio input stream
				File soundFile = new File("sounds/fozzy/Judas.wav");
				AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
				// Get a sound clip resource
				Clip clip = AudioSystem.getClip();
				// Open audio clip and load samples from audio input stream
				clip.open(audioIn);
				clip.start();
			}// End try
			catch(UnsupportedAudioFileException exception){
				exception.printStackTrace();
			}// End catch
			catch(IOException exception){
				exception.printStackTrace();
			}// End catch
			catch(LineUnavailableException exception){
				exception.printStackTrace();
			}// End catch
		}// End if
		if(e.getActionCommand().equals("Bang Bang by Green Day")){
			try{
				// Open an audio input stream
				File soundFile = new File("sounds/greenday/BangBang.wav");
				AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
				// Get a sound clip resource
				Clip clip = AudioSystem.getClip();
				// Open audio clip and load samples from audio input stream
				clip.open(audioIn);
				clip.start();
			}// End try
			catch(UnsupportedAudioFileException exception){
				exception.printStackTrace();
			}// End catch
			catch(IOException exception){
				exception.printStackTrace();
			}// End catch
			catch(LineUnavailableException exception){
				exception.printStackTrace();
			}// End catch
		}// End if
		if(e.getActionCommand().equals("Speed of Light by Iron Maiden")){
			try{
				// Open an audio input stream
				File soundFile = new File("sounds/ironmaiden/SpeedOfLight.wav");
				AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
				// Get a sound clip resource
				Clip clip = AudioSystem.getClip();
				// Open audio clip and load samples from audio input stream
				clip.open(audioIn);
				clip.start();
			}// End try
			catch(UnsupportedAudioFileException exception){
				exception.printStackTrace();
			}// End catch
			catch(IOException exception){
				exception.printStackTrace();
			}// End catch
			catch(LineUnavailableException exception){
				exception.printStackTrace();
			}// End catch
		}// End if
	}// End actionPerformed method

	private void setAlbumOne(){
		albumCover.setIcon(band.getFirstAlbum().getAlbumCover());
		albumTracks.setIcon(band.getFirstAlbum().getTracklist());
	}// End setAlbumOne

	private void setAlbumTwo(){
		albumCover.setIcon(band.getSecondAlbum().getAlbumCover());
		albumTracks.setIcon(band.getSecondAlbum().getTracklist());
	}// End setAlbumTwo

	private void setVocals(){
		image.setIcon(band.getVocals().getImage());
		name.setText(band.getVocals().getName());
		age.setText(band.getVocals().getAge());
		description.setText(band.getVocals().getDescription());
	}// End setVocals

	private void setGuitar(){
		image.setIcon(band.getGuitar().getImage());
		name.setText(band.getGuitar().getName());
		age.setText(band.getGuitar().getAge());
		description.setText(band.getGuitar().getDescription());
	}// End setGuitar

	private void setDrum(){
		image.setIcon(band.getDrum().getImage());
		name.setText(band.getDrum().getName());
		age.setText(band.getDrum().getAge());
		description.setText(band.getDrum().getDescription());
	}// End setDrum

	private void clearAll(){
		name.setText("");
		age.setText("");
		description.setText("");
		image.setIcon(null);
		albumCover.setIcon(null);
		albumTracks.setIcon(null);
	}// End clearAll

	class CFOSListener implements ItemListener{
    	public void itemStateChanged(ItemEvent e){
    		band = new CFOS();
    		clearAll();		// Call the clearAll method to clear textFields and labels
    	}// End itemStateChanged
    }// End CFOSListener

    class FozzyListener implements ItemListener{
    	public void itemStateChanged(ItemEvent e){
    		band = new Fozzy();
    		clearAll();		// Call the clearAll method to clear textFields and labels
    	}// End itemStateChanged
    }// End FozzyListener

    class GreenDayListener implements ItemListener{
    	public void itemStateChanged(ItemEvent e){
    		band = new GreenDay();
    		clearAll();		// Call the clearAll method to clear textFields and labels
    	}// End itemStateChanged
    }// End GreenDayListener

    class IronMaidenListener implements ItemListener{
    	public void itemStateChanged(ItemEvent e){
    		band = new IronMaiden();
    		clearAll();		// Call the clearAll method to clear textFields and labels
    	}// End itemStateChanged
    }// End IronMaidenListener

	public static void main(String args[]){
		App musicApp = new App();
	}// End main

}// End class