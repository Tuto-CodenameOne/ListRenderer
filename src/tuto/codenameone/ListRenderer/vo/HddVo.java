package tuto.codenameone.ListRenderer.vo;

import com.codename1.ui.Image;

/**
 * Value Object
 * @author bcirot
 */
public class HddVo {

    public boolean checked;
    public Image image;
    public String ligne1;
    public String ligne2;
    
    public HddVo(boolean checked, Image image, String ligne1, String ligne2) {
        this.checked = checked;
        this.image = image;
        this.ligne1 = ligne1;
        this.ligne2 = ligne2;
    }
    
}
