/**
 * @(#)BandFactory.java
 * THIS IS NOT A FACTORY
 *
 * @Joseph Tierney
 * @version 1.00 2018/2/12
 */

import javax.swing.*;
import java.awt.*;

public class BandFactory {

    private Icon image;
    private String name;
    private String age;
    private String description;

	public BandFactory(Icon mimage, String mname, String mage, String mdescription){
		image = mimage;
		name = mname;
		age = mage;
		description = mdescription;
	}// End BandFactory

	public Icon getImage(){
		return image;
	}// End getName

	public String getName(){
		return name;
	}// End getName

	public String getAge(){
		return age;
	}// End getAge

	public String getDescription(){
		return description;
	}// End getDescription

}// End class