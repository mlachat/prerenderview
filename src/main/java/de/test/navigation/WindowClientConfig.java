package de.test.navigation;

import javax.enterprise.inject.Specializes;
import javax.faces.context.FacesContext;

import org.apache.deltaspike.jsf.spi.scope.window.DefaultClientWindowConfig;

@Specializes
public class WindowClientConfig extends DefaultClientWindowConfig {

	private static final long serialVersionUID = 1L;

	@Override
	public ClientWindowRenderMode getClientWindowRenderMode(final FacesContext facesContext) {
		String path = facesContext.getExternalContext().getRequestPathInfo();
		if (path == null) {
			path = facesContext.getExternalContext().getRequestServletPath();
		}
		ClientWindowRenderMode mode = ClientWindowRenderMode.CLIENTWINDOW;
		if (path.contains("lazy")) {
			mode = ClientWindowRenderMode.LAZY;
		}
		return mode;
	}

	@Override
	public boolean isClientWindowStoreWindowTreeEnabledOnButtonClick() {
		return true;
	}

	@Override
	public boolean isClientWindowTokenizedRedirectEnabled() {
		return true;
	}
}
