package ${packageName};

import org.apache.struts2.config.Result;

@Result(name="index", value="/jsp/index.jsp")
public class IndexAction {
    public String execute() throws Exception {
        return "index";
    }
}
