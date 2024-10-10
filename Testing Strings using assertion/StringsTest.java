import org.junit.Test;
import static org.junit.Assert.*;
public class StringsTest{
    @Test
    public void c0TestString(){
        assertEquals(true, StringUtils.isPalindrome("radar"));
        assertEquals(true, StringUtils.areAnagrams("Palme","Ampel"));
        assertEquals(true, StringUtils.hasPrefix("entscheiden","ent"));
        assertEquals(true, StringUtils.hasSuffix("beenden","en"));
    }
    @Test
    public void c1TestString(){
        assertEquals(true, StringUtils.isPalindrome("radar"));
        assertEquals(false, StringUtils.isPalindrome("Radar"));
        assertEquals(false, StringUtils.isPalindrome("radar  "));
        assertEquals(false, StringUtils.isPalindrome(null));
        assertEquals(true, StringUtils.areAnagrams("Palme","Ampel"));
        assertEquals(false, StringUtils.areAnagrams("Palmee","Ampel"));
        assertEquals(false, StringUtils.areAnagrams("Paime","Ampel"));
        assertEquals(false, StringUtils.areAnagrams("Palme","Ampel  "));
        assertEquals(false, StringUtils.areAnagrams("Palme",null));
        assertEquals(true, StringUtils.hasPrefix("entscheiden","ent"));
        assertEquals(false, StringUtils.hasPrefix("en","ent"));
        assertEquals(false, StringUtils.hasPrefix("entscheiden","ant"));
        assertEquals(false, StringUtils.hasPrefix("entscheiden  ","ent"));
        assertEquals(false, StringUtils.hasPrefix(null,"ent"));
        assertEquals(true, StringUtils.hasSuffix("beenden","en"));
        assertEquals(true, StringUtils.hasSuffix("b","en"));
        assertEquals(true, StringUtils.hasSuffix(null,"en"));
        assertEquals(true, StringUtils.hasSuffix("beend","en"));
        assertEquals(true, StringUtils.hasSuffix("beenden  ","en"));

    }
}