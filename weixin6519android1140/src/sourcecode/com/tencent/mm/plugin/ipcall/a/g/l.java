package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class l
  extends i<k>
{
  public static final String[] fTX;
  public static final String[] mmY;
  public e fTZ;
  
  static
  {
    GMTrace.i(11577621217280L, 86260);
    fTX = new String[] { i.a(k.fTp, "IPCallRecord") };
    mmY = new String[] { "*", "rowid" };
    GMTrace.o(11577621217280L, 86260);
  }
  
  public l(e parame)
  {
    super(parame, k.fTp, "IPCallRecord", null);
    GMTrace.i(11577084346368L, 86256);
    this.fTZ = parame;
    GMTrace.o(11577084346368L, 86256);
  }
  
  public final Cursor Ao(String paramString)
  {
    GMTrace.i(11577218564096L, 86257);
    paramString = this.fTZ.query("IPCallRecord", mmY, "phonenumber=?", new String[] { paramString }, null, null, "calltime desc");
    GMTrace.o(11577218564096L, 86257);
    return paramString;
  }
  
  public final void a(k paramk)
  {
    GMTrace.i(11577486999552L, 86259);
    if (paramk != null) {
      a(paramk.vmr, paramk);
    }
    GMTrace.o(11577486999552L, 86259);
  }
  
  public final Cursor cG(long paramLong)
  {
    GMTrace.i(11577352781824L, 86258);
    Cursor localCursor = this.fTZ.query("IPCallRecord", mmY, "addressId=?", new String[] { String.valueOf(paramLong) }, null, null, "calltime desc");
    GMTrace.o(11577352781824L, 86258);
    return localCursor;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\g\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */