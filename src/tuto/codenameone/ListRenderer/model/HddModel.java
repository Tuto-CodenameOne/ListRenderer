/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto.codenameone.ListRenderer.model;

import com.codename1.ui.events.DataChangedListener;
import com.codename1.ui.events.SelectionListener;
import com.codename1.ui.list.ListModel;
import com.codename1.ui.util.Resources;

/**
 *
 * @author bcirot
 */
public class HddModel implements ListModel {
    
    private HddVo[] hdds;
    private int selectedIndex;
    
    public HddModel(Resources res) {
        initializeCollection(res);
    }
    
    private void initializeCollection(Resources res) {
        hdds = new HddVo[2];
        HddVo hdd1 = new HddVo(false, res.getImage("hdd.png"), "Local Disk (C:)", "95.2 GB free of 185 GB");
        HddVo hdd2 = new HddVo(false, res.getImage("hdd.png"), "Local Disk (D:)", "1.11 GB free of 112 GB");
        hdds[0] = hdd1;
        hdds[1] = hdd2;
    }

    public Object getItemAt(int index) {
        return hdds[index];
    }

    public int getSize() {
        return hdds.length;
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    public void setSelectedIndex(int index) {
        selectedIndex = index;
    }

    public void addDataChangedListener(DataChangedListener l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeDataChangedListener(DataChangedListener l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addSelectionListener(SelectionListener l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeSelectionListener(SelectionListener l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addItem(Object item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeItem(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
