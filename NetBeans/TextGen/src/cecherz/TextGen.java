
package cecherz;

import javax.swing.SwingUtilities;

public class TextGen {
    public static void main(String args[]) {
	SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               new EngineApp();		
            }
	});
    }
}
