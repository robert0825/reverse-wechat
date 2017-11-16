package com.tencent.mm.plugin.scanner.history.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class b
  extends i<a>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(6045166469120L, 45040);
    fTX = new String[] { i.a(a.fTp, "ScanHistoryItem") };
    GMTrace.o(6045166469120L, 45040);
  }
  
  public b(e parame)
  {
    super(parame, a.fTp, "ScanHistoryItem", null);
    GMTrace.i(6044898033664L, 45038);
    this.fTZ = parame;
    GMTrace.o(6044898033664L, 45038);
  }
  
  public final Cursor Mx()
  {
    GMTrace.i(6045032251392L, 45039);
    Cursor localCursor = this.fTZ.rawQuery("select * from ScanHistoryItem order by ScanTime desc", null);
    GMTrace.o(6045032251392L, 45039);
    return localCursor;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\history\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */