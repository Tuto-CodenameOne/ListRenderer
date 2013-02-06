package tuto.codenameone.ListRenderer.renderer;

import com.codename1.ui.CheckBox;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.ui.List;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.list.ListCellRenderer;

/**
 *
 * @author bcirot
 * Renderer programmatic
 * Donne le même résultat que le "HddRenderer" créé dans le GUI Builder.
 * 
 */
public class ProgrammaticHddRenderer extends Container implements ListCellRenderer {
    
    private CheckBox checkBox = new CheckBox();
    private Label image = new Label("");
    private Label ligne1 = new Label("");
    private Label ligne2 = new Label("");
    
    /**
     * Constructeur : Définie la structure du renderer
     */
    public ProgrammaticHddRenderer() {
        
        // Layout utilisé par le renderer
        setLayout(new BoxLayout(BoxLayout.X_AXIS));
        
        // On ajoute la CheckBox et l'Image
        addComponent(checkBox);
        addComponent(image);
        
        // On crée ensuite un conteneur vertical
        Container vContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        
        // On ajoute nos deux Labels à ce conteneur
        vContainer.addComponent(ligne1);
        vContainer.addComponent(ligne2);
        
        // Enfin il reste à ajouter ce conteneur au renderer
        addComponent(vContainer);
    }
    
    public Component getListCellRendererComponent(List list, Object value, int index, boolean isSelected) {
        return null;
    }

    public Component getListFocusComponent(List list) {
        return null;
    }
    
}
