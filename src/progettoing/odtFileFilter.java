/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progettoing;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Fortunso88
 */
public class odtFileFilter extends FileFilter{

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) return true;
            String fname = file.getName().toLowerCase();
            return fname.endsWith("odt");
    }

    @Override
    public String getDescription() {
      return ".odt";
    }
}