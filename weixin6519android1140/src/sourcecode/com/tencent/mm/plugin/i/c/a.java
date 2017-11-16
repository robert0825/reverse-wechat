package com.tencent.mm.plugin.i.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.i.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;

public final class a
  implements Runnable
{
  private au eAH;
  private int opType;
  
  public a(au paramau, int paramInt)
  {
    GMTrace.i(20654497726464L, 153888);
    this.eAH = paramau;
    this.opType = paramInt;
    w.d("MicroMsg.MsgEventTask", "%d msg id[%d %d] optype[%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.eAH.field_msgId), Integer.valueOf(this.eAH.field_type), Integer.valueOf(this.opType) });
    GMTrace.o(20654497726464L, 153888);
  }
  
  public final void run()
  {
    GMTrace.i(20654631944192L, 153889);
    switch (this.opType)
    {
    default: 
      w.w("MicroMsg.MsgEventTask", "%d unknow op type [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.opType) });
      GMTrace.o(20654631944192L, 153889);
      return;
    }
    b.aiA().G(this.eAH);
    GMTrace.o(20654631944192L, 153889);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */