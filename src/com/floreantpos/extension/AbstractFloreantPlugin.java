/**
 * ************************************************************************
 * * The contents of this file are subject to the MRPL 1.2
 * * (the  "License"),  being   the  Mozilla   Public  License
 * * Version 1.1  with a permitted attribution clause; you may not  use this
 * * file except in compliance with the License. You  may  obtain  a copy of
 * * the License at http://www.floreantpos.org/license.html
 * * Software distributed under the License  is  distributed  on  an "AS IS"
 * * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * * License for the specific  language  governing  rights  and  limitations
 * * under the License.
 * * The Original Code is FLOREANT POS.
 * * The Initial Developer of the Original Code is OROCUBE LLC
 * * All portions are Copyright (C) 2015 OROCUBE LLC
 * * All Rights Reserved.
 * ************************************************************************
 */
package com.floreantpos.extension;

import java.util.List;

import javax.swing.AbstractAction;

import com.floreantpos.actions.PosAction;
import com.floreantpos.config.ui.ConfigurationDialog;



public class AbstractFloreantPlugin implements FloreantPlugin {

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void initBackoffice() {
		
	}


	@Override
	public String getId() {
		return null;
	}


	@Override
	public void initConfigurationView(ConfigurationDialog dialog) {
		
	}


	@Override
	public List<AbstractAction> getSpecialFunctionActions() {
		return null;
	}

	@Override
	public void initLicense() {
		//do something
	}

	@Override
	public boolean hasValidLicense() {
		return false;
	}


    @Override
    public void init() {
        // TODO Auto-generated method stub
        
    }

}