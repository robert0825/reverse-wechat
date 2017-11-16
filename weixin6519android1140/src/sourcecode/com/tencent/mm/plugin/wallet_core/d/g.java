package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.x;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.HashMap;
import java.util.Map;

public final class g
  extends i<x>
{
  public static final String[] fTX;
  public static Map<String, x> hpu;
  private e fTZ;
  
  static
  {
    GMTrace.i(6916373741568L, 51531);
    fTX = new String[] { i.a(x.fTp, "WalletLuckyMoney") };
    hpu = new HashMap();
    GMTrace.o(6916373741568L, 51531);
  }
  
  public g(e parame)
  {
    super(parame, x.fTp, "WalletLuckyMoney", null);
    GMTrace.i(6916239523840L, 51530);
    this.fTZ = parame;
    GMTrace.o(6916239523840L, 51530);
  }
  
  public final x Kr(String paramString)
  {
    GMTrace.i(18040070602752L, 134409);
    paramString = this.fTZ.rawQuery("select * from WalletLuckyMoney where mNativeUrl=?", new String[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(18040070602752L, 134409);
      return null;
    }
    if (paramString.getCount() == 0)
    {
      paramString.close();
      GMTrace.o(18040070602752L, 134409);
      return null;
    }
    paramString.moveToFirst();
    x localx = new x();
    localx.b(paramString);
    paramString.close();
    GMTrace.o(18040070602752L, 134409);
    return localx;
  }
  
  public final boolean a(x paramx)
  {
    GMTrace.i(18040204820480L, 134410);
    if ((paramx != null) && (hpu.containsKey(paramx.field_mNativeUrl))) {
      hpu.put(paramx.field_mNativeUrl, paramx);
    }
    boolean bool = super.a(paramx);
    GMTrace.o(18040204820480L, 134410);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */