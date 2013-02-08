/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto.codenameone.ListRenderer.vo;

import com.codename1.ui.Image;

/**
 *
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
