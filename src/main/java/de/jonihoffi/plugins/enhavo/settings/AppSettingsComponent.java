package de.jonihoffi.plugins.enhavo.settings;

import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import com.intellij.util.ui.FormBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Supports creating and managing a {@link JPanel} for the Settings Dialog.
 */
public class AppSettingsComponent {

    private final JPanel myMainPanel;
    private final JBTextField myTemplatePath = new JBTextField("config/block/templates");
    private final JBTextField myBlockPath = new JBTextField("config/block");
    private final JBTextField myEntityPath = new JBTextField("src/Entity");
    private final JBTextField myMigrationsPath = new JBTextField("src/Migrations");

    public AppSettingsComponent() {
        myMainPanel = FormBuilder.createFormBuilder()
                .addLabeledComponent(new JBLabel("Enter template path: "), myTemplatePath, 1, false)
                .addLabeledComponent(new JBLabel("Enter block path: "), myBlockPath, 1, false)
                .addLabeledComponent(new JBLabel("Enter entity path: "), myEntityPath, 1, false)
                .addLabeledComponent(new JBLabel("Enter migrations path: "), myMigrationsPath, 1, false)
                .addComponentFillVertically(new JPanel(), 0)
                .getPanel();
    }

    public JPanel getPanel() {
        return myMainPanel;
    }

    public JComponent getPreferredFocusedComponent() {
        return myTemplatePath;
    }

    @NotNull
    public String getTemplatePathText() {
        return myTemplatePath.getText();
    }

    public void setTemplatePathText(@NotNull String newText) {
        myTemplatePath.setText(newText);
    }

    @NotNull
    public String getBlockPathText() {
        return myBlockPath.getText();
    }

    public void setBlockPathText(@NotNull String newText) {
        myBlockPath.setText(newText);
    }

    @NotNull
    public String getEntityPathText() {
        return myEntityPath.getText();
    }

    public void setEntityPathText(@NotNull String newText) {
        myEntityPath.setText(newText);
    }

    @NotNull
    public String getMigrationsPathText() {
        return myMigrationsPath.getText();
    }

    public void setMigrationsPathText(@NotNull String newText) {
        myMigrationsPath.setText(newText);
    }
}