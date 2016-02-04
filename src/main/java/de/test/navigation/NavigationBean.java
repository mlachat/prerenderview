package de.test.navigation;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.apache.deltaspike.core.api.config.view.ViewConfig;

@Named
@ApplicationScoped
public class NavigationBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public Class<? extends ViewConfig> getAudiLazyPage() {
		return WebRoot.Lazy.audilazy.class;
	}

	public Class<? extends ViewConfig> getBmwLazyPage() {
		return WebRoot.Lazy.bmwlazy.class;
	}

	public Class<? extends ViewConfig> getIndex() {
		return WebRoot.index.class;
	}

}
