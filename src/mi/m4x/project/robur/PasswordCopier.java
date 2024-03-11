package mi.m4x.project.robur;

/**
 * This class is used to copy the generated password to the clipboard.
 *
 * @author M4ximumPizza
 */
public class PasswordCopier {
    public void copyToClipboard(String text) {
        java.awt.datatransfer.StringSelection selection = new java.awt.datatransfer.StringSelection(text);
        java.awt.datatransfer.Clipboard clipboard = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
    }
}

