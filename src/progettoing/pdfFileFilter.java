
package progettoing;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class pdfFileFilter extends FileFilter{

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) return true;
            String fname = file.getName().toLowerCase();
            return fname.endsWith("pdf");
    }

    @Override
    public String getDescription() {
      return ".pdf";
    }
}
