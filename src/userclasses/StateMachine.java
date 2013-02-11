/**
 * Your application code goes here
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.util.Resources;
import tuto.codenameone.ListRenderer.controller.HddListController;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    
    private Resources resources;
    
    private HddListController listController;
    
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
        resources = res;
        listController = new HddListController();
    }

    @Override
    protected void beforeMain(Form f) {
        listController.initializeHddList(f, resources);
    }

    @Override
    protected void onMain_ProgrammaticListAction(Component c, ActionEvent event) {
        listController.updateListItems(c, event);
    }
}
