package eu.zdw31.hws.src;

/**
 * Abstrakte Klasse zum lernen von Java und Unit Tests.
 * @version 1.0 
 * @author David Huber
 */
public abstract class AbstractMath {
	public int a, b;

    public AbstractMath() {	}
    
    public int add(int a, int b) {
        return a + b;
    }
    public int substract(int a, int b) {
    	return a - b;
    }
    
    /**
     * Diese Methode soll die Positionen zweier Zahlen in einem Integer Array ausgeben, 
     * die zusammen addiert die Summe von {@link target} ergeben.
     * <br/><br/>
     * <b>Beispiel:</b><br/> 
     * nums = {1,2,0,4}, target = 6
     * <br/>
     * Ergebnis lautet {1,3}
     * @param nums Zahlen gespeicher in einem Integer Array
     * @param target Gesuchte Summe als Integer
     * @return Ergebnis als Integer array [Position1, Position2]
     */
	public abstract int[] twoSum(int[] nums, int target);
	
	/**
	 * Diese Methode prüft das angegebene Integer Array ob in diesem Elemente, die den selben Wert enthalten, sind.
	 * @param numbers Zahlen gespeicher in einem Integer Array
	 * @return {@link boolean} true, wenn eine Zahl doppelt vorkommt.
	 */
	public abstract boolean containsDuplicate(int[] numbers);
	
}
