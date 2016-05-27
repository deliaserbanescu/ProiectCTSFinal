package designPatterns;

import java.util.Hashtable;

public class NivelCache {
	public static Hashtable<String, NivelPrototype> nivelMap = new Hashtable<String, NivelPrototype>();
	
	public static NivelPrototype getNivel(String tip) throws CloneNotSupportedException{
		return (NivelPrototype) nivelMap.get(tip).clone();
	}
	
	static public void loadCache(){
		NivelGimnaziu ng = new NivelGimnaziu("NG");
		NivelLiceu nl = new NivelLiceu("NL");
		nivelMap.put("NG", ng);
		nivelMap.put("NL", nl);
	}
}
