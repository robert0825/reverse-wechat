package com.tencent.mm.plugin.qmessage.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bg;
import junit.framework.Assert;

public final class e
  extends j
{
  public static final String[] fTX;
  private g goN;
  
  static
  {
    GMTrace.i(8938900684800L, 66600);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS qcontact ( username text  PRIMARY KEY , qq long  , extinfo text  , needupdate int  , extupdateseq long  , imgupdateseq long  , reserved1 int  , reserved2 int  , reserved3 int  , reserved4 int  , reserved5 text  , reserved6 text  , reserved7 text  , reserved8 text  ) " };
    GMTrace.o(8938900684800L, 66600);
  }
  
  public e(g paramg)
  {
    GMTrace.i(8938363813888L, 66596);
    this.goN = paramg;
    GMTrace.o(8938363813888L, 66596);
  }
  
  public final d EQ(String paramString)
  {
    Object localObject = null;
    GMTrace.i(8938766467072L, 66599);
    paramString = "select qcontact.username,qcontact.qq,qcontact.extinfo,qcontact.needupdate,qcontact.extupdateseq,qcontact.imgupdateseq,qcontact.reserved1,qcontact.reserved2,qcontact.reserved3,qcontact.reserved4,qcontact.reserved5,qcontact.reserved6,qcontact.reserved7,qcontact.reserved8 from qcontact   where qcontact.username = \"" + bg.nk(paramString) + "\"";
    Cursor localCursor = this.goN.a(paramString, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(8938766467072L, 66599);
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new d();
      paramString.username = localCursor.getString(0);
      paramString.gDV = localCursor.getLong(1);
      paramString.extInfo = localCursor.getString(2);
      paramString.nRm = localCursor.getInt(3);
      paramString.nRn = localCursor.getLong(4);
      paramString.nRo = localCursor.getLong(5);
      paramString.goJ = localCursor.getInt(6);
      paramString.gDs = localCursor.getInt(7);
      paramString.gsQ = localCursor.getInt(8);
      paramString.gsR = localCursor.getInt(9);
      paramString.nRp = localCursor.getString(10);
      paramString.nRq = localCursor.getString(11);
      paramString.nRr = localCursor.getString(12);
      paramString.nRs = localCursor.getString(13);
    }
    localCursor.close();
    GMTrace.o(8938766467072L, 66599);
    return paramString;
  }
  
  public final boolean a(d paramd)
  {
    GMTrace.i(8938498031616L, 66597);
    paramd.eQl = -1;
    paramd = paramd.qL();
    if ((int)this.goN.insert("qcontact", "username", paramd) != -1)
    {
      GMTrace.o(8938498031616L, 66597);
      return true;
    }
    GMTrace.o(8938498031616L, 66597);
    return false;
  }
  
  public final boolean a(String paramString, d paramd)
  {
    GMTrace.i(8938632249344L, 66598);
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (paramd != null) {
        break;
      }
      GMTrace.o(8938632249344L, 66598);
      return false;
    }
    if (this.goN.update("qcontact", paramd.qL(), "username=?", new String[] { paramString }) > 0)
    {
      GMTrace.o(8938632249344L, 66598);
      return true;
    }
    GMTrace.o(8938632249344L, 66598);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qmessage\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */