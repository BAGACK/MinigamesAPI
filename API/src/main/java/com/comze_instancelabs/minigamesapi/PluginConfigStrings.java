/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.comze_instancelabs.minigamesapi;

/**
 * Strings for plugins config.
 * 
 * @author mepeisen
 */
public interface PluginConfigStrings
{
    
    /**
     * debug flag for minigames lib.
     */
    String DEBUG = "config.debug"; //$NON-NLS-1$
    
    /**
     * flag to support the party command (playing with friends).
     */
    String PARTY_COMMAND_ENABLED = "config.party_command_enabled"; //$NON-NLS-1$
    
    /**
     * the update interval for arena signs.
     */
    String SIGNS_UPDATE_TIME = "signs_updating_time"; //$NON-NLS-1$
    
    /**
     * flag for controlling auto updates.
     */
    String AUTO_UPDATING = "config.auto_updating"; //$NON-NLS-1$
    
}