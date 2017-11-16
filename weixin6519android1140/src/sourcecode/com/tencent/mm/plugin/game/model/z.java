package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class z
  extends i<y>
{
  public static final String[] fTX;
  
  static
  {
    GMTrace.i(12606534320128L, 93926);
    fTX = new String[] { i.a(y.fTp, "GamePBCache") };
    GMTrace.o(12606534320128L, 93926);
  }
  
  public z(e parame)
  {
    super(parame, y.fTp, "GamePBCache", null);
    GMTrace.i(12605997449216L, 93922);
    GMTrace.o(12605997449216L, 93922);
  }
  
  public final boolean a(String paramString, a parama)
  {
    GMTrace.i(12606265884672L, 93924);
    if ((bg.nm(paramString)) || (parama == null))
    {
      GMTrace.o(12606265884672L, 93924);
      return false;
    }
    try
    {
      parama = parama.toByteArray();
      boolean bool = n(paramString, parama);
      GMTrace.o(12606265884672L, 93924);
      return bool;
    }
    catch (IOException paramString)
    {
      w.e("MicroMsg.GamePBCacheStorage", "Saving Failed: %s", new Object[] { paramString.getMessage() });
      GMTrace.o(12606265884672L, 93924);
    }
    return false;
  }
  
  public final boolean n(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(12606400102400L, 93925);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(12606400102400L, 93925);
      return false;
    }
    y localy = new y();
    localy.field_key = paramString;
    if (super.b(localy, new String[0])) {
      localy.field_value = paramArrayOfByte;
    }
    for (boolean bool = super.c(localy, new String[0]);; bool = super.b(localy))
    {
      if (!bool) {
        w.e("MicroMsg.GamePBCacheStorage", "Saving cache failed (update or insert)");
      }
      GMTrace.o(12606400102400L, 93925);
      return bool;
      localy.field_value = paramArrayOfByte;
    }
  }
  
  public final byte[] zI(String paramString)
  {
    GMTrace.i(12606131666944L, 93923);
    if (bg.nm(paramString))
    {
      GMTrace.o(12606131666944L, 93923);
      return null;
    }
    if (!v.bPK().equals(ab.getContext().getSharedPreferences("game_center_pref", 0).getString("game_center_pref_lang", v.bPK())))
    {
      GMTrace.o(12606131666944L, 93923);
      return null;
    }
    y localy = new y();
    localy.field_key = paramString;
    if (super.b(localy, new String[0]))
    {
      paramString = localy.field_value;
      GMTrace.o(12606131666944L, 93923);
      return paramString;
    }
    GMTrace.o(12606131666944L, 93923);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */