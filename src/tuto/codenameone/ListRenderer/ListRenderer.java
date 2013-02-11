package tuto.codenameone.ListRenderer;


import com.codename1.ui.Display;
import com.codename1.ui.Form;
import tuto.codenameone.ListRenderer.controller.HddListController;
import userclasses.StateMachine;

public class ListRenderer {
   
    private Form current;

    public void init(Object context) {
    }

    public void start() {
        if(current != null){
            current.show();
            return;
        }
        new StateMachine("/theme");
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }
    
    public void destroy() {
    }
}
