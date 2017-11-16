package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.c.ak;
import com.tencent.mm.plugin.game.c.ce;
import com.tencent.mm.plugin.game.c.v;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public class g
{
  private static g lMh;
  public ak lMi;
  
  public g()
  {
    GMTrace.i(16558575321088L, 123371);
    GMTrace.o(16558575321088L, 123371);
  }
  
  public static g aFi()
  {
    GMTrace.i(16558709538816L, 123372);
    if (lMh == null) {}
    try
    {
      if (lMh == null) {
        lMh = new g();
      }
      g localg = lMh;
      GMTrace.o(16558709538816L, 123372);
      return localg;
    }
    finally {}
  }
  
  public final void QP()
  {
    GMTrace.i(16558843756544L, 123373);
    c.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16559917498368L, 123381);
        byte[] arrayOfByte = SubCoreGameCenter.aGj().zI("pb_game_global_config");
        g.this.at(arrayOfByte);
        GMTrace.o(16559917498368L, 123381);
      }
    });
    GMTrace.o(16558843756544L, 123373);
  }
  
  public final v aFj()
  {
    GMTrace.i(16559112192000L, 123375);
    Object localObject = null;
    if (this.lMi != null)
    {
      v localv = this.lMi.lQP;
      localObject = localv;
      if (localv != null)
      {
        w.i("MicroMsg.GameConfigManager", "getGameDetailSettingControl jumpType:%d, jumpUrl:%s", new Object[] { Integer.valueOf(localv.lQl), localv.lPE });
        localObject = localv;
      }
    }
    for (;;)
    {
      GMTrace.o(16559112192000L, 123375);
      return (v)localObject;
      QP();
    }
  }
  
  public final ce aFk()
  {
    GMTrace.i(19312454664192L, 143889);
    if (this.lMi != null)
    {
      ce localce = this.lMi.lQR;
      GMTrace.o(19312454664192L, 143889);
      return localce;
    }
    QP();
    GMTrace.o(19312454664192L, 143889);
    return null;
  }
  
  public final void at(byte[] paramArrayOfByte)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(16558977974272L, 123374);
        if (bg.bq(paramArrayOfByte))
        {
          GMTrace.o(16558977974272L, 123374);
          return;
        }
      }
      finally
      {
        try
        {
          this.lMi = new ak();
          this.lMi.aD(paramArrayOfByte);
          GMTrace.o(16558977974272L, 123374);
        }
        catch (IOException paramArrayOfByte)
        {
          this.lMi = null;
          w.e("MicroMsg.GameConfigManager", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
          GMTrace.o(16558977974272L, 123374);
        }
        paramArrayOfByte = finally;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */