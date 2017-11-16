package com.tencent.mm.plugin.safedevice.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends i<c>
{
  public static final String[] fTX;
  g orB;
  
  static
  {
    GMTrace.i(12854568681472L, 95774);
    fTX = new String[] { i.a(c.fTp, "SafeDeviceInfo") };
    GMTrace.o(12854568681472L, 95774);
  }
  
  public d(e parame)
  {
    super(parame, c.fTp, "SafeDeviceInfo", null);
    GMTrace.i(12853763375104L, 95768);
    this.orB = null;
    if ((parame instanceof g)) {
      this.orB = ((g)parame);
    }
    GMTrace.o(12853763375104L, 95768);
  }
  
  public final boolean a(c paramc)
  {
    GMTrace.i(12853897592832L, 95769);
    boolean bool = super.b(paramc);
    GMTrace.o(12853897592832L, 95769);
    return bool;
  }
  
  public final List<c> bcc()
  {
    GMTrace.i(12854031810560L, 95770);
    LinkedList localLinkedList = new LinkedList();
    if (getCount() > 0)
    {
      Cursor localCursor = super.Mx();
      while (localCursor.moveToNext())
      {
        c localc = new c();
        localc.b(localCursor);
        localLinkedList.add(localc);
      }
      localCursor.close();
    }
    GMTrace.o(12854031810560L, 95770);
    return localLinkedList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\safedevice\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */