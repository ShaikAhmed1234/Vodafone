package PurchaseOrder;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class work

{
	// ---( internal utility methods )---

	final static work _instance = new work();

	static work _newInstance() { return new work(); }

	static work _cast(Object o) { return (work)o; }

	// ---( server methods )---




	public static final void concatJS (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(concatJS)>> ---
		// @sigtype java 3.5
		// [i] field:0:required fName
		// [o] field:0:required FullName
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	fName = IDataUtil.getString( pipelineCursor, "fName" );
		pipelineCursor.destroy();
		
		String FullName =  "Mr." + fName;
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "FullName", FullName );
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}
}

