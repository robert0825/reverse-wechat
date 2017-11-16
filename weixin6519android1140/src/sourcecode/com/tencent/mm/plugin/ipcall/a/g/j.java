package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends com.tencent.mm.sdk.e.i<i>
  implements f.a
{
  public static final String[] fTX;
  public e fTZ;
  public m gDp;
  
  static
  {
    GMTrace.i(11579231830016L, 86272);
    fTX = new String[] { com.tencent.mm.sdk.e.i.a(i.fTp, "IPCallPopularCountry") };
    GMTrace.o(11579231830016L, 86272);
  }
  
  public j(e parame)
  {
    super(parame, i.fTp, "IPCallPopularCountry", null);
    GMTrace.i(11578560741376L, 86267);
    this.gDp = new m()
    {
      protected final boolean Hf()
      {
        GMTrace.i(11574802644992L, 86239);
        if ((j.this.fTZ == null) || (j.this.fTZ.bRk()))
        {
          if (j.this.fTZ == null) {}
          for (Object localObject = "null";; localObject = Boolean.valueOf(j.this.fTZ.bRk()))
          {
            w.w("MicroMsg.IPCallPopularCountryStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
            GMTrace.o(11574802644992L, 86239);
            return false;
          }
        }
        GMTrace.o(11574802644992L, 86239);
        return true;
      }
    };
    this.fTZ = parame;
    GMTrace.o(11578560741376L, 86267);
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(11578829176832L, 86269);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(11578829176832L, 86269);
    return 0;
  }
  
  public final String getTableName()
  {
    GMTrace.i(11578694959104L, 86268);
    GMTrace.o(11578694959104L, 86268);
    return "IPCallPopularCountry";
  }
  
  public final void w(int paramInt, long paramLong)
  {
    GMTrace.i(11578963394560L, 86270);
    i locali = new i();
    Cursor localCursor = this.fTZ.a("IPCallPopularCountry", null, "countryCode=?", new String[] { Integer.toString(paramInt) }, null, null, null, 2);
    boolean bool;
    if (!localCursor.moveToFirst())
    {
      w.i("MicroMsg.IPCallPopularCountryStorage", "get null with countryCode:" + paramInt);
      localCursor.close();
      locali.field_countryCode = paramInt;
      locali.field_lastCallTime = paramLong;
      locali.field_callTimeCount = 1L;
      bool = b(locali);
    }
    for (;;)
    {
      w.i("MicroMsg.IPCallPopularCountryStorage", "updatePopularCountryCode ret:" + bool);
      GMTrace.o(11578963394560L, 86270);
      return;
      locali.b(localCursor);
      locali.field_callTimeCount += 1L;
      locali.field_lastCallTime = paramLong;
      bool = super.a(locali);
      localCursor.close();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\g\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */