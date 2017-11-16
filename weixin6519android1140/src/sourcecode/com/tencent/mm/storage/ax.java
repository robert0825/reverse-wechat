package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class ax
  extends i<aw>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(1536524550144L, 11448);
    fTX = new String[] { i.a(aw.fTp, "OpenMsgListener") };
    GMTrace.o(1536524550144L, 11448);
  }
  
  public ax(e parame)
  {
    super(parame, aw.fTp, "OpenMsgListener", null);
    GMTrace.i(1535987679232L, 11444);
    this.fTZ = parame;
    parame.eZ("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerAppIdIndex ON OpenMsgListener ( appId )");
    parame.eZ("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerStatusIndex ON OpenMsgListener ( status )");
    GMTrace.o(1535987679232L, 11444);
  }
  
  public final aw Us(String paramString)
  {
    GMTrace.i(1536121896960L, 11445);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(1536121896960L, 11445);
      return null;
    }
    Cursor localCursor = this.fTZ.a("OpenMsgListener", null, "appId=?", new String[] { bg.nk(paramString) }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      w.w("MicroMsg.OpenMsgListenerStorage", "get null with appId:" + paramString);
      localCursor.close();
      GMTrace.o(1536121896960L, 11445);
      return null;
    }
    paramString = new aw();
    paramString.b(localCursor);
    localCursor.close();
    GMTrace.o(1536121896960L, 11445);
    return paramString;
  }
  
  public final Cursor bUk()
  {
    GMTrace.i(1536256114688L, 11446);
    Cursor localCursor = rawQuery("select * from OpenMsgListener where (status = ?) ", new String[] { "1" });
    GMTrace.o(1536256114688L, 11446);
    return localCursor;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\storage\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */