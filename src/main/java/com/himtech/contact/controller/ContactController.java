package com.himtech.contact.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.himtech.contact.model.Contact;


/**
 * @author himanshu
 *
 */
@Controller
public class ContactController {

	/**
	 * @param contact
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@Valid Contact contact, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			model.addAttribute("result", result);
			return "contact";
		} else {
			return "showContact";
		}
	}

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String showContacts(ModelMap model) {
		model.addAttribute("contact", new Contact());
		return "contact";
	}
}
