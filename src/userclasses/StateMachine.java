/**
 * Your application code goes here
 */

package userclasses;

import com.codename1.io.Log;
import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.util.Resources;
import java.util.Vector;
import tuto.codenameone.ListRenderer.vo.HddVo;
import tuto.codenameone.ListRenderer.renderer.ProgrammaticHddRenderer;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    
    private Resources res;
    
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
        this.res = res;
    }

    @Override
    protected void beforeMain(Form f) {
        List list = findProgrammaticList(f);
        if (list != null) {
            list.setRenderer(new ProgrammaticHddRenderer());
            
            Vector items = new Vector();
            HddVo hdd1 = new HddVo(false, res.getImage("hdd.png"), "Local Disk (C:)", "95.2 GB free of 185 GB");
            HddVo hdd2 = new HddVo(false, res.getImage("hdd.png"), "Local Disk (D:)", "1.11 GB free of 112 GB");
            items.add(hdd1);
            items.add(hdd2);
            
            list.setModel(new DefaultListModel(items));
        }
    }

    @Override
    protected void onMain_ProgrammaticListAction(Component c, ActionEvent event) {
        List list = (List) c;
        HddVo hddVo = (HddVo) list.getModel().getItemAt(list.getSelectedIndex());
        hddVo.checked = !hddVo.checked;
    }
}
