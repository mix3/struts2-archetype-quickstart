package ${packageName};

import junit.framework.TestCase;

public class HelloWorldActionTest extends TestCase {
    
    public void testHelloWorldAction() throws Exception {
        HelloWorldAction action = new HelloWorldAction();
        String result = action.execute();
        assertEquals("helloWorld", result);
    }
}

