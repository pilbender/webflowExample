package net.raescott.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Richard Scott Smith <scott@thescene.com>
 */
@Controller
public class MainController {
	@RequestMapping(value = "embeddedFlowContainer", method = RequestMethod.GET)
	public String getEmbedded() {
		return "embeddedFlowContainer";
	}

	@RequestMapping(value = "embeddedFlowInModalDialogContainer", method = RequestMethod.GET)
	public String getDialog() {
		return "embeddedFlowInModalDialogContainer";
	}
}
