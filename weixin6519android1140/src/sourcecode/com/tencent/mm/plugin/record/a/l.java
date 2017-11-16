package com.tencent.mm.plugin.record.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends i<k>
{
  public static final String[] fTX;
  e fTZ;
  
  static
  {
    GMTrace.i(7516998074368L, 56006);
    fTX = new String[] { i.a(k.fTp, "RecordMessageInfo") };
    GMTrace.o(7516998074368L, 56006);
  }
  
  public l(e parame)
  {
    super(parame, k.fTp, "RecordMessageInfo", null);
    GMTrace.i(7516729638912L, 56004);
    this.fTZ = parame;
    GMTrace.o(7516729638912L, 56004);
  }
  
  public final void th(int paramInt)
  {
    GMTrace.i(7516863856640L, 56005);
    w.d("MicroMsg.RecordMsgStorage", "delete record msg item, local id %d, result %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.fTZ.delete("RecordMessageInfo", "localId=?", new String[] { String.valueOf(paramInt) })) });
    GMTrace.o(7516863856640L, 56005);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\record\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */