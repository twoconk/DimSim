/*
 **************************************************************************
 *                                                                        *
 *               DDDDD   iii             DDDDD   iii                      *
 *               DD  DD      mm mm mmmm  DD  DD      mm mm mmmm           *
 *               DD   DD iii mmm  mm  mm DD   DD iii mmm  mm  mm          *
 *               DD   DD iii mmm  mm  mm DD   DD iii mmm  mm  mm          *
 *               DDDDDD  iii mmm  mm  mm DDDDDD  iii mmm  mm  mm          *
 *                                                                        *
 **************************************************************************
 **************************************************************************
 *                                                                        *
 * Part of the DimDim V 1.0 Codebase (http://www.dimdim.com)	          *
 *                                                                        *
 * Copyright (c) 2006 Communiva Inc. All Rights Reserved.                 *
 *                                                                        *
 *                                                                        *
 * This code is licensed under the DimDim License                         *
 * For details please visit http://www.dimdim.com/license                 *
 *                                                                        *
 **************************************************************************
 */

package com.dimdim.conference.ui.model.client;

import com.dimdim.conference.ui.json.client.UIEmailAttemptResult;
import com.dimdim.conference.ui.json.client.UIRosterEntry;

/**
 * @author Jayant Pandit
 * @email Jayant.Pandit@communiva.com
 * 
 */

public class RosterModelAdapter implements	RosterModelListener
{
	public void onEntryDenied(UIRosterEntry newUser)
	{
	}
	public void onEntryGranted(UIRosterEntry newUser)
	{
	}
	/*public void onPermissionsChanged(UIRosterEntry user)
	{
	}*/
	public void onUserArrived(UIRosterEntry newUser)
	{
	}
	public void onUserChanged(UIRosterEntry user)
	{
	}
	public void onUserJoined(UIRosterEntry newUser)
	{
	}
	public void onUserRejoined(UIRosterEntry newUser)
	{
	}
	public void onUserLeft(UIRosterEntry user)
	{
	}
	public	void	onUserRemoved(UIRosterEntry user)
	{
	}
	public void onUserRoleChanged(UIRosterEntry user)
	{
	}
	public void onEmailError(UIEmailAttemptResult emailResult)
	{
	}
	public void onEmailOK(UIEmailAttemptResult emailResult)
	{
	}
	public	void	onChatPermissionsChanged(UIRosterEntry user)
	{
	}
	public	void	onAudioVidoPermissionsChanged(UIRosterEntry user)
	{
	}
	
}