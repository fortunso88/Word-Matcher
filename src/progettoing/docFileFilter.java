
package progettoing;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class docFileFilter extends FileFilter{

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) return true;
            String fname = file.getName().toLowerCase();
            return fname.endsWith("doc");
    }

    @Override
    public String getDescription() {
      return ".doc";
    }
}