package until;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.MycharSetUtils;
import util.MycharSetUtilsEx;

import static org.junit.Assert.*;

public class LangTestTest extends MycharSetUtilsEx {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
        MycharSetUtilsEx MSUE = new MycharSetUtilsEx ();
        MSUE.charSetUtilsDemo ();
    //    for(int i=1;i<5;i++) {
    //        MSUE.charSetUtilsDemo ( );
    //    }
        return ;
    }
}