import java.util.Vector;

/**
 *
 *
 *
 * This is a class to represent a Sun (Major Celestial Body) in Solar System
 */

public class Sun extends CelestialBody {

	private static Vector<Sun> sunList=new Vector<Sun>();
	private static int numSun;
	private double diameter; //default 1 milion kilometers
	private static SolarSystem solarSystem;
	private String name;
	private Vector<CelestialBody> orbitingBodies= new Vector<CelestialBody>();
	private static Sun f_sun;

	/**
	 * Construct a Sun with a solar system
	 *
	 * @param name The Sun should have a name, e.g., "The Sun" for Earth's Solar System
	 * @param solarSystem The Solar System for the Sun
	 */
	private Sun(String name, SolarSystem solarSystem) {
		this.name = name;
		this.solarSystem = solarSystem;
		diameter = 1000000; //Default Diameter
	}

	/**
	 * Construct a Sun with a solar system and specify diameter
	 * To enforce the Singleton Pattern the constructor is private
	 * Use the static createSun method to return a Sun instance
	 *
	 * @param name The Sun should have a name, e.g., "The Sun" for Earth's Solar System
	 * @param solarSystem The Solar System for the Sun
	 * @param diameter A double to represent the size of the Sun in kilometers
	 */
	private Sun(String name, SolarSystem solarSystem, double diameter) {
		this.name = name;
		this.solarSystem = solarSystem;
		this.diameter = diameter; //Default Diameter
	}

	/**
	 * This is a public access method to create Sun
	 * This is a singleton class and so the number of Sun's for creation
	 * is restricted to the number of Suns allowable in the solar system
	 * @return
	 * @throws SolarSystemHasSunAlreadyException
	 */

	 /**
	  * Renamed the createSun method to getSun
	  * Removed the creation of the suns
	  * Removed an else if statement that allowed more than one sun
	  */
	public static synchronized Sun getSun(String name, SolarSystem system) throws SolarSystemSunLimitException {
		if(f_sun == null) { //If no Sun has been created, allow Sun Singleton creation
			f_sun = new Sun(name, system);	//create a new Sun
			return f_sun; //return the Sun
		}
		//else if(numSun<solarSystem.getNumSuns()) { //If multiple Suns in the Solar System
		//	numSun++;
		//	solarSystem = system;
		//	sunList.add(new Sun(name,system));
		//	return sunList.lastElement(); //return most recent sun created
		//}
		else { //If the Singleton pattern is exceeded, i.e., more than allowed objects created
			throw new SolarSystemSunLimitException("This Solar System can only have " + solarSystem.getNumSuns() +" sun");
		}
	}

	/**
	 * Method to set the diameter of the Sun
	 *
	 * @param diameter Set the diameter of the Sun in KM (kilometers)
	 */
	public void setDiameter(double diameter) {
		this.diameter=diameter;
	}

	/**
	 * Method to add an orbit body to a Sun
	 *
	 * @param orbitObj The object to orbit the Sun
	 */
	public void addOrbitingBody(CelestialBody orbitObj) {
		orbitingBodies.add(orbitObj);
	}

	/**
	 * Method to return full list of Planet's orbiting objects
	 *
	 * @return Vector Return all of the orbiting objects
	 */
	public Vector<CelestialBody> getOrbitingBodies() {
		return orbitingBodies;
	}

	/**
	 * Override accessor from abstract base class
	 */
	public String getName() {
		return name;
	}

}
