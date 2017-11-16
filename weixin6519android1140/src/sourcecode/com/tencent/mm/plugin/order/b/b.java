package com.tencent.mm.plugin.order.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class b
  extends i<a>
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(6633576988672L, 49424);
    fTX = new String[] { i.a(a.fTp, "OrderCommonMsgXml") };
    GMTrace.o(6633576988672L, 49424);
  }
  
  public b(e parame)
  {
    super(parame, a.fTp, "OrderCommonMsgXml", null);
    GMTrace.i(6632905900032L, 49419);
    this.fTZ = parame;
    GMTrace.o(6632905900032L, 49419);
  }
  
  public final Cursor Mx()
  {
    GMTrace.i(6633040117760L, 49420);
    Cursor localCursor = this.fTZ.rawQuery("select * from OrderCommonMsgXml order by msgId desc", null);
    GMTrace.o(6633040117760L, 49420);
    return localCursor;
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(6633174335488L, 49421);
    boolean bool = super.b(parama);
    GMTrace.o(6633174335488L, 49421);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */