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
     * Initialisation de la liste
     * 
     * @param f : Main Form
     * @param resources : Application resources
     */
    public void initializeHddList(Form f, Resources resources) {
        List list = findProgrammaticList(f);
        if (list != null) {
            
            // Indique le renderer � utiliser
            list.setRenderer(new ProgrammaticHddRenderer());
            
            // Cr�ation du jeu de donn�es
            Vector<HddVo> items = new Vector<HddVo>(2);
            HddVo hdd1 = new HddVo(false, resources.getImage("hdd.png"), "Local Disk (C:)", "95.2 GB free of 185 GB");
            HddVo hdd2 = new HddVo(false, resources.getImage("hdd.png"), "Local Disk (D:)", "1.11 GB free of 112 GB");
            items.add(hdd1);
            items.add(hdd2);
            
            // Utilisation d'un Model g�n�rique associ� � notre jeu de donn�es
            list.setModel(new DefaultListModel(items));
        }
    }
    
    /**
     * G�re la synchronisation des donn�es en fonction des actions utilisateur
     * 
     * @param c : composant List
     * @param event : Event Click
     */
    public void updateListItems(Component c, ActionEvent event) {
        // On cast pour acc�der aux fonctions du composant List
        List list = (List) c;
        // On r�cup�re la ligne cliqu�e
        HddVo hddVo = (HddVo) list.getModel().getItemAt(list.getSelectedIndex());
        // On modifie la valeur en cons�quence
        hddVo.checked = !hddVo.checked;
    }
    
}
