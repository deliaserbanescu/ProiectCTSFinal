package designPatterns;

import java.util.Hashtable;

public class PrototypeNivelCache {
	public static Hashtable<String, PrototypeNivel> nivelMap = new Hashtable<String, PrototypeNivel>();
	
	public static PrototypeNivel getNivel(String tip) throws CloneNotSupportedException{
		return (PrototypeNivel) nivelMap.get(tip).clone();
	}
	
	static public void loadCache(){
		PrototypeNivelGimnaziu ng = new PrototypeNivelGimnaziu("NG");
		PrototypeNivelLiceu nl = new PrototypeNivelLiceu("NL");
		nivelMap.put("NG", ng);
		nivelMap.put("NL", nl);
	}
}
