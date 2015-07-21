package net.certware.argument.language.ui.preferences;

//import net.certware.core.ui.CertWareUI;

import net.certware.argument.language.ui.LUiModule;
import net.certware.argument.language.ui.internal.LActivator;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FontFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Preference page for outline view preference processing.
 * @author mrb
 */
public class OutlinePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	/**
	 * Constructor creates the grid and description.
	 * Creates image descriptor from plugin's image registry.
	 */
	public OutlinePreferencePage() {
		super(GRID);
		setPreferenceStore(LActivator.getInstance().getPreferenceStore());
		setDescription("Sets preferences for the L Language editor's outline view");
		this.setImageDescriptor( LActivator.getInstance().getImageRegistry().getDescriptor(LUiModule.L_CERTWARE_IMAGE));
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		addField(new ColorFieldEditor(PreferenceConstants.P_SET_EXPRESSION_TEXT_COLOR,
				"Set expression color &foreground:", getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_SET_EXPRESSION_TEXT_FONT, 
				"Set expression text &style:", getFieldEditorParent()));

		addField(new ColorFieldEditor(PreferenceConstants.P_TYPE_DECLARATION_TEXT_COLOR,
				"Type declaration color &foreground:", getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_TYPE_DECLARATION_TEXT_FONT, 
				"Type declaration text &style:", getFieldEditorParent()));

		addField(new ColorFieldEditor(PreferenceConstants.P_CONSTANT_DECLARATION_TEXT_COLOR,
				"Constant declaration color &foreground:", getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_CONSTANT_DECLARATION_TEXT_FONT, 
				"Constant declaration text &style:", getFieldEditorParent()));

		addField(new ColorFieldEditor(PreferenceConstants.P_RULE_TEXT_COLOR,
				"Rule text color &foreground:", getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_RULE_TEXT_FONT, 
				"Rule text &style:", getFieldEditorParent()));

		addField(new ColorFieldEditor(PreferenceConstants.P_CONDITIONAL_TEXT_COLOR,
				"Conditional statement color &foreground:", getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_CONDITIONAL_TEXT_FONT, 
				"Conditional statement &style:", getFieldEditorParent()));

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(LActivator.getInstance().getPreferenceStore());
	}

}