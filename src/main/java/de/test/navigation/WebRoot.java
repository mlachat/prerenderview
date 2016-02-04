package de.test.navigation;

import org.apache.deltaspike.core.api.config.view.ViewConfig;
import org.apache.deltaspike.core.api.config.view.controller.ViewControllerRef;
import org.apache.deltaspike.jsf.api.config.view.Folder;
import org.apache.deltaspike.jsf.api.config.view.View;
import org.apache.deltaspike.jsf.api.config.view.View.NavigationMode;
import org.apache.deltaspike.jsf.api.config.view.View.ViewParameterMode;

import de.test.Testbean;
import de.test.Testbean2;

/**
 * This class is the parent for all other ViewConfig which inherit navigation and viewparameter mode as default
 */
@View(navigation = NavigationMode.REDIRECT, viewParams = ViewParameterMode.INCLUDE)
@Folder(name = "pages/")
public interface WebRoot extends ViewConfig {

	@View
	class index implements WebRoot { // br
	}

	@Folder(name = "lazy")
	interface Lazy extends WebRoot {
		@View
		@ViewControllerRef(Testbean.class)
		class audilazy implements Lazy { // br
		}

		@View
		@ViewControllerRef(Testbean2.class)
		class bmwlazy implements Lazy { // br
		}
	}


}
