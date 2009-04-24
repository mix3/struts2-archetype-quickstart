package ${packageName};

import junit.framework.TestCase;

public class IndexActionTest extends TestCase {
    
    public void testIndexAction() throws Exception {
        IndexAction action = new IndexAction();
        String result = action.execute();
        assertEquals("index", result);
    }
}
