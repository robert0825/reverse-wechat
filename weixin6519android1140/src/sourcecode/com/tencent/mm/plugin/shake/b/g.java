package com.tencent.mm.plugin.shake.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends i<f>
{
  public static final String[] eZt;
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(6508083412992L, 48489);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS  shakemessage_status_index ON shakemessage ( status )", "CREATE INDEX IF NOT EXISTS shakemessage_type_index ON shakemessage ( type )" };
    fTX = new String[] { i.a(f.fTp, "shakemessage") };
    GMTrace.o(6508083412992L, 48489);
  }
  
  public g(e parame)
  {
    super(parame, f.fTp, "shakemessage", eZt);
    GMTrace.i(6507546542080L, 48485);
    this.fTZ = parame;
    GMTrace.o(6507546542080L, 48485);
  }
  
  public final int ME()
  {
    GMTrace.i(6507814977536L, 48487);
    Cursor localCursor = this.fTZ.a("select count(*) from " + getTableName() + " where status != 1", null, 2);
    if (localCursor.moveToFirst()) {}
    for (int i = localCursor.getInt(0);; i = 0)
    {
      localCursor.close();
      if (i > 0)
      {
        GMTrace.o(6507814977536L, 48487);
        return i;
      }
      GMTrace.o(6507814977536L, 48487);
      return 0;
    }
  }
  
  public final boolean a(f paramf)
  {
    GMTrace.i(6507680759808L, 48486);
    if (paramf == null)
    {
      w.e("MicroMsg.ShakeMessageStorage", "insert fail, shakeMsg is null");
      GMTrace.o(6507680759808L, 48486);
      return false;
    }
    if (super.b(paramf))
    {
      SS(paramf.vmr);
      GMTrace.o(6507680759808L, 48486);
      return true;
    }
    GMTrace.o(6507680759808L, 48486);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */