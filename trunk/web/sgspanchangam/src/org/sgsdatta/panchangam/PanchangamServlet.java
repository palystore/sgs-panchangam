package org.sgsdatta.panchangam;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.*;

import org.sgsdatta.panchangam.data.loader.PanchangamDataLoader;

@SuppressWarnings("serial")
public class PanchangamServlet extends HttpServlet {

	private static final Logger log = Logger.getLogger(PanchangamServlet.class
			.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
	}
}
