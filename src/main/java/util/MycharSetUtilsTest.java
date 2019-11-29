package util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class MycharSetUtilsTest extends MycharSetUtils {
    private MycharSetUtils MS = new MycharSetUtils ();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void squeeze1() {
    }

    @Test
    public void containsAny1() {
    }

    @Test
    public void count1() {
            int result = MS.count ("abcde","a");
        //    int expect =1;
            assertEquals (2,result,0 );

        }

    @Test
    public void keep1() {
        String result = MS.keep ("null","*");
        assertEquals ("null",result,"null");
    }

    /*  public static String delete(final String str, final String... set) {
        if (StringUtils.isEmpty(str) || deepEmpty(set)) {
            return str;
        }
        return modify(str, set, false);
    }
     */
    @Test
    public void delete1() {
        String result = MS.delete ("*",null);
        assertEquals (null,result,null);
    }
}




