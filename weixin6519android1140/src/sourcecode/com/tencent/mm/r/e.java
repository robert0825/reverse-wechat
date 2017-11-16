package com.tencent.mm.r;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class e
  extends i<d>
{
  public static final String[] fTX;
  private static final String[] fTY;
  private com.tencent.mm.sdk.e.e fTZ;
  
  static
  {
    GMTrace.i(4504078516224L, 33558);
    fTX = new String[] { i.a(d.fTp, "FunctionMsgItem") };
    fTY = new String[] { "*", "rowid" };
    GMTrace.o(4504078516224L, 33558);
  }
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, d.fTp, "FunctionMsgItem", null);
    GMTrace.i(4503541645312L, 33554);
    this.fTZ = parame;
    GMTrace.o(4503541645312L, 33554);
  }
  
  public final void a(String paramString, d paramd)
  {
    GMTrace.i(4503810080768L, 33556);
    w.i("MicroMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s", new Object[] { paramString });
    d locald = ei(paramString);
    if (locald != null) {
      try
      {
        boolean bool1;
        if (paramd.field_addMsg == null)
        {
          bool1 = true;
          if (locald.field_addMsg != null) {
            break label174;
          }
        }
        label174:
        for (boolean bool2 = true;; bool2 = false)
        {
          w.i("MicroMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s, newFunctionMsgItem.msgContent==null: %s,oldFunctionMsgItem.msgContent==null: %s", new Object[] { paramString, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          paramd = paramd.qL();
          if ((paramd.get("addMsg") == null) && (locald.field_addMsg != null)) {
            paramd.put("addMsg", locald.field_addMsg.toByteArray());
          }
          w.i("MicroMsg.FunctionMsgStorage", "updateByFunctionMsgId, ret: %s", new Object[] { Integer.valueOf(this.fTZ.update("FunctionMsgItem", paramd, "functionmsgid=?", new String[] { paramString })) });
          GMTrace.o(4503810080768L, 33556);
          return;
          bool1 = false;
          break;
        }
        GMTrace.o(4503810080768L, 33556);
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.FunctionMsgStorage", "updateByFunctionMsgId error: %s", new Object[] { paramString.getMessage() });
      }
    }
  }
  
  public final d ei(String paramString)
  {
    GMTrace.i(4503675863040L, 33555);
    if (bg.nm(paramString))
    {
      GMTrace.o(4503675863040L, 33555);
      return null;
    }
    w.i("MicroMsg.FunctionMsgStorage", "getByFunctionMsgId, functionMsgId: %s", new Object[] { paramString });
    paramString = this.fTZ.a("FunctionMsgItem", fTY, "functionmsgid=?", new String[] { paramString }, null, null, null, 2);
    try
    {
      if (paramString.moveToFirst())
      {
        d locald = new d();
        locald.b(paramString);
        if (paramString != null) {
          paramString.close();
        }
        GMTrace.o(4503675863040L, 33555);
        return locald;
      }
      if (paramString != null) {
        paramString.close();
      }
      GMTrace.o(4503675863040L, 33555);
      return null;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.FunctionMsgStorage", "getByFunctionMsgId error: %s", new Object[] { localException.getMessage() });
      if (paramString != null) {
        paramString.close();
      }
      GMTrace.o(4503675863040L, 33555);
      return null;
    }
    finally
    {
      if (paramString != null) {
        paramString.close();
      }
    }
  }
  
  public final List<d> vA()
  {
    GMTrace.i(4503944298496L, 33557);
    localCursor = this.fTZ.a("FunctionMsgItem", fTY, "status<?", new String[] { "2" }, null, null, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(4503944298496L, 33557);
      return null;
    }
    try
    {
      if (localCursor.moveToFirst())
      {
        ArrayList localArrayList = new ArrayList();
        boolean bool;
        do
        {
          d locald = new d();
          locald.b(localCursor);
          localArrayList.add(locald);
          bool = localCursor.moveToNext();
        } while (bool);
        if (localCursor != null) {
          localCursor.close();
        }
        GMTrace.o(4503944298496L, 33557);
        return localArrayList;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.FunctionMsgStorage", "getAllNeedFetchFunctionMsg error: %s", new Object[] { localException.getMessage() });
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
    finally
    {
      if (localCursor == null) {
        break label187;
      }
      localCursor.close();
    }
    GMTrace.o(4503944298496L, 33557);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\r\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */