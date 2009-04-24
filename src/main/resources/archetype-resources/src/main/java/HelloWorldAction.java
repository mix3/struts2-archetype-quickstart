package ${packageName};

import org.apache.struts2.config.Result;

@Result(name="helloWorld", value="/jsp/helloWorld.jsp")
public class HelloWorldAction {
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    public String execute() throws Exception {
        return "helloWorld";
    }
}
