/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.radiology.order.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(RadiologyDashboardFormController.RADIOLOGY_DASHBOARD_FORM_REQUEST_MAPPING)
public class RadiologyDashboardFormController {
    
    
    public static final String RADIOLOGY_DASHBOARD_FORM_REQUEST_MAPPING = "/module/radiology/radiologyDashboard.form";
    
    static final String RADIOLOGY_DASHBOARD_FORM_VIEW = "/module/radiology/radiologyDashboardForm";
    
    @RequestMapping(method = RequestMethod.GET)
    protected ModelAndView get() {
        return new ModelAndView(RADIOLOGY_DASHBOARD_FORM_VIEW);
    }
}
