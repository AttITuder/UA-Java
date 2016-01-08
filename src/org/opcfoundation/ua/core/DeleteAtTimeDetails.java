 /* Copyright (c) 1996-2015, OPC Foundation. All rights reserved.
   The source code in this file is covered under a dual-license scenario:
     - RCL: for OPC Foundation members in good-standing
     - GPL V2: everybody else
   RCL license terms accompanied with this source code. See http://opcfoundation.org/License/RCL/1.00/
   GNU General Public License as published by the Free Software Foundation;
   version 2 of the License are accompanied with this source code. See http://opcfoundation.org/License/GPLv2
   This source code is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package org.opcfoundation.ua.core;

import org.opcfoundation.ua.builtintypes.Structure;
import org.opcfoundation.ua.builtintypes.ExpandedNodeId;
import org.opcfoundation.ua.core.Identifiers;
import org.opcfoundation.ua.utils.ObjectUtils;
import java.util.Arrays;
import org.opcfoundation.ua.builtintypes.DateTime;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.core.HistoryUpdateDetails;



public class DeleteAtTimeDetails extends HistoryUpdateDetails implements Structure, Cloneable {
	
	public static final ExpandedNodeId ID = new ExpandedNodeId(Identifiers.DeleteAtTimeDetails);
	public static final ExpandedNodeId BINARY = new ExpandedNodeId(Identifiers.DeleteAtTimeDetails_Encoding_DefaultBinary);
	public static final ExpandedNodeId XML = new ExpandedNodeId(Identifiers.DeleteAtTimeDetails_Encoding_DefaultXml);
	
    protected DateTime[] ReqTimes;
    
    public DeleteAtTimeDetails() {}
    
    public DeleteAtTimeDetails(NodeId NodeId, DateTime[] ReqTimes)
    {
        super(NodeId);
        this.ReqTimes = ReqTimes;
    }
    
    public DateTime[] getReqTimes()
    {
        return ReqTimes;
    }
    
    public void setReqTimes(DateTime[] ReqTimes)
    {
        this.ReqTimes = ReqTimes;
    }
    
    /**
      * Deep clone
      *
      * @return cloned DeleteAtTimeDetails
      */
    public DeleteAtTimeDetails clone()
    {
        DeleteAtTimeDetails result = new DeleteAtTimeDetails();
        result.NodeId = NodeId;
        result.ReqTimes = ReqTimes==null ? null : ReqTimes.clone();
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        DeleteAtTimeDetails other = (DeleteAtTimeDetails) obj;
        if (NodeId==null) {
            if (other.NodeId != null) return false;
        } else if (!NodeId.equals(other.NodeId)) return false;
        if (ReqTimes==null) {
            if (other.ReqTimes != null) return false;
        } else if (!Arrays.equals(ReqTimes, other.ReqTimes)) return false;
        return true;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((NodeId == null) ? 0 : NodeId.hashCode());
        result = prime * result
                + ((ReqTimes == null) ? 0 : Arrays.hashCode(ReqTimes));
        return result;
    }
    


	public ExpandedNodeId getTypeId() {
		return ID;
	}

	public ExpandedNodeId getXmlEncodeId() {
		return XML;
	}

	public ExpandedNodeId getBinaryEncodeId() {
		return BINARY;
	}
	
	public String toString() {
		return "DeleteAtTimeDetails: "+ObjectUtils.printFieldsDeep(this);
	}

}