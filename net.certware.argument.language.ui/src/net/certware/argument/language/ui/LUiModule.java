/*
 * generated by Xtext
 * Updated manually.
 */
package net.certware.argument.language.ui;

import java.net.URL;

import net.certware.argument.language.ui.outline.FilterConstantDeclarationContribution;
import net.certware.argument.language.ui.outline.FilterRuleContribution;
import net.certware.argument.language.ui.outline.FilterTypeDeclarationContribution;
import net.certware.argument.language.ui.outline.LOutlinePage;
import net.certware.argument.language.ui.preferences.MainPreferencePage;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
public class LUiModule extends net.certware.argument.language.ui.AbstractLUiModule {

	// image key, temporary until moved into main repo
	public static final String L_CERTWARE_IMAGE = "L_CERTWARE_IMAGE"; //$NON-NLS-1$
	
	public LUiModule(AbstractUIPlugin plugin) {
		super(plugin);
		
		// load CertWare image descriptor as place-holder
		// normally acquire this from the core UI plugin
		IPath path = new Path("icons/obj16/certware.gif");
		URL url = FileLocator.find(plugin.getBundle(),path,null);
		ImageDescriptor desc = ImageDescriptor.createFromURL(url);
		plugin.getImageRegistry().put(L_CERTWARE_IMAGE,desc);

	}

	/**
	 * Bind the outline filters.
	 * @author MRB
	 */
	public void configureFilterOperationsContribution(Binder binder) {
		binder.bind(IOutlineContribution.class).annotatedWith(
				Names.named("FilterRuleContribution"))
				.to(FilterRuleContribution.class);
		
		binder.bind(IOutlineContribution.class).annotatedWith(
				Names.named("FilterTypeDeclarationContribution"))
				.to(FilterTypeDeclarationContribution.class);
		
		binder.bind(IOutlineContribution.class).annotatedWith(
				Names.named("FilterConstantDeclarationContribution"))
				.to(FilterConstantDeclarationContribution.class);
	}
	
	/**
	 * Bind preference pages.
	 * @return preference page
	 */
	public Class<? extends LanguageRootPreferencePage> bindLanguageRootPreferencePage() {
	    return MainPreferencePage.class;
	}
	
	/**
	 * Bind outline page.
	 * @return outline page
	 */
	public Class<? extends IContentOutlinePage> bindIContentOutlinePage() {
		return LOutlinePage.class;
	}
}
