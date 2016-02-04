# prerenderview
In total there are 2 pages for cars, both with an input field and outputs.
	   Use the 'open link in new tab' to open the second site. This destroys the first bean @ViewAccesScoped.
	   
	   
	   Switch back to first tab and edit the input field again. On the console you will see 'target not reachable'
	   for the Car object, which has never been initialized, because @PreRenderView method did not run. 
	    
	    
	    Hit F5/Page refreh --> bean ID is now different and car brand is reset, since prerenderview worked on F5
	    