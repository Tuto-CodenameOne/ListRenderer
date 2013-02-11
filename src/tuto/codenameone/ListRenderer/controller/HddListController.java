/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto.codenameone.ListRenderer.controller;

import com.codename1.ui.Component;
import com.codename1.ui.Form;
import com.codename1.ui.List;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.util.Resources;
import generated.StateMachineBase;
import java.util.Vector;
import tuto.codenameone.ListRenderer.renderer.ProgrammaticHddRenderer;
import tuto.codenameone.ListRenderer.vo.HddVo;

/**
 *
 * @author bcirot
 */
public class HddListController extends StateMachineBase {
    
    /**
     * Initialise la liste avec un jeu de données
     * 
     * @param f : Main Form
     */
    public void initializeHddList(Form f, Resources resources) {
        List list = findProgrammaticList(f);
        if (list != null) {
            list.setRenderer(new ProgrammaticHddRenderer());
            
            Vector<HddVo> items = new Vector<HddVo>(2);
            HddVo hdd1 = new HddVo(false, resources.getImage("hdd.png"), "Local Disk (C:)", "95.2 GB free of 185 GB");
            HddVo hdd2 = new HddVo(false, resources.getImage("hdd.png"), "Local Disk (D:)", "1.11 GB free of 112 GB");
            items.add(hdd1);
            items.add(hdd2);
            
            list.setModel(new DefaultListModel(items));
        }
    }
    
    /**
     * Gère la synchronisation des données en fonction des actions utilisateur
     * 
     * @param c : composant List
     * @param event : Event Click
     */
    public void updateListItems(Component c, ActionEvent event) {
        List list = (List) c;
        HddVo hddVo = (HddVo) list.getModel().getItemAt(list.getSelectedIndex());
        hddVo.checked = !hddVo.checked;
    }
    
}
