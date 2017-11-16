package com.tencent.mm.plugin.sport.c;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.protocal.c.brm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONObject;

public final class f
{
  public static e gvj;
  private static long qqG;
  private static JSONObject qqH;
  public static a qqI;
  
  static
  {
    GMTrace.i(16733461020672L, 124674);
    gvj = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(16737219117056L, 124702);
        if ((paramAnonymousk instanceof d))
        {
          com.tencent.mm.kernel.h.wS().b(1947, f.gvj);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousString = ((d)paramAnonymousk).qqE;
            w.i("MicroMsg.Sport.SportConfigLogic", "onSceneEnd config=%s", new Object[] { paramAnonymousString.tQC });
            paramAnonymousk = paramAnonymousString.tQC;
            if (!ab.bPY()) {
              break label154;
            }
            ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getSportFileStorage().setString(2, paramAnonymousk);
            f.Ju(paramAnonymousString.tQC);
            paramAnonymousk = ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getDeviceStepManager().qqx;
            if (paramAnonymousk == null) {}
          }
        }
        try
        {
          paramAnonymousk.Jt(paramAnonymousString.tQC);
          if (f.qqI != null) {
            f.qqI.bqN();
          }
          GMTrace.o(16737219117056L, 124702);
          return;
          label154:
          throw new RuntimeException(String.format("not support set value in %s process", new Object[] { ab.vM() }));
        }
        catch (RemoteException paramAnonymousString)
        {
          for (;;) {}
        }
      }
    };
    GMTrace.o(16733461020672L, 124674);
  }
  
  public static void Ju(String paramString)
  {
    GMTrace.i(16733058367488L, 124671);
    if (bg.nm(paramString))
    {
      GMTrace.o(16733058367488L, 124671);
      return;
    }
    try
    {
      qqH = new JSONObject(paramString);
      GMTrace.o(16733058367488L, 124671);
      return;
    }
    catch (Exception paramString)
    {
      qqH = null;
      GMTrace.o(16733058367488L, 124671);
    }
  }
  
  public static void a(a parama)
  {
    GMTrace.i(17482932813824L, 130258);
    qqI = parama;
    GMTrace.o(17482932813824L, 130258);
  }
  
  public static boolean bqZ()
  {
    GMTrace.i(16732924149760L, 124670);
    if (qqG == 0L) {
      qqG = h.J(1, 0L);
    }
    if (System.currentTimeMillis() - qqG > 86400000L)
    {
      qqG = System.currentTimeMillis();
      h.K(1, qqG);
      w.i("MicroMsg.Sport.SportConfigLogic", "start to request sport config");
      com.tencent.mm.kernel.h.wS().a(1947, gvj);
      com.tencent.mm.kernel.h.wS().a(new d(), 0);
      GMTrace.o(16732924149760L, 124670);
      return true;
    }
    w.i("MicroMsg.Sport.SportConfigLogic", "last request time is %s", new Object[] { k.ax(qqG) });
    GMTrace.o(16732924149760L, 124670);
    return false;
  }
  
  public static JSONObject bra()
  {
    GMTrace.i(16733192585216L, 124672);
    Object localObject;
    if (qqH == null)
    {
      if (!ab.bPY()) {
        break label131;
      }
      localObject = ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getSportFileStorage().getString(2, "");
      if (bg.nm((String)localObject)) {
        break label152;
      }
    }
    for (;;)
    {
      label131:
      try
      {
        qqH = new JSONObject((String)localObject);
        localObject = "server config";
        if (qqH == null)
        {
          qqH = brb();
          localObject = "asset";
        }
        if (qqH == null)
        {
          qqH = new JSONObject();
          localObject = "new";
        }
        w.i("MicroMsg.Sport.SportConfigLogic", "get sport config from %s: %s", new Object[] { localObject, qqH.toString() });
        localObject = qqH;
        GMTrace.o(16733192585216L, 124672);
        return (JSONObject)localObject;
      }
      catch (Exception localException) {}
      localObject = new g(com.tencent.mm.plugin.sport.b.a.qqs).getString(2, "");
      break;
      label152:
      String str = "";
    }
  }
  
  private static JSONObject brb()
  {
    GMTrace.i(16733326802944L, 124673);
    Object localObject4 = ab.getContext().getAssets();
    localObject3 = null;
    localObject1 = null;
    try
    {
      localObject4 = ((AssetManager)localObject4).open("sport_config.json");
      localObject1 = localObject4;
      localObject3 = localObject4;
      localJSONObject2 = new JSONObject(new String(b.c((InputStream)localObject4)));
      localObject3 = localJSONObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.printErrStackTrace("MicroMsg.Sport.SportConfigLogic", localException, "get assets sport config json", new Object[0]);
        localObject3 = localObject1;
        JSONObject localJSONObject1 = new JSONObject();
        localObject3 = localJSONObject1;
        if (localObject1 != null) {
          try
          {
            ((InputStream)localObject1).close();
            localObject3 = localJSONObject1;
          }
          catch (IOException localIOException1)
          {
            localObject3 = localJSONObject1;
          }
        }
      }
    }
    finally
    {
      if (localObject3 == null) {}
    }
    try
    {
      ((InputStream)localObject4).close();
      localObject3 = localJSONObject2;
    }
    catch (IOException localIOException2)
    {
      try
      {
        ((InputStream)localObject3).close();
        throw ((Throwable)localObject2);
        localIOException2 = localIOException2;
        localObject3 = localJSONObject2;
      }
      catch (IOException localIOException3)
      {
        for (;;) {}
      }
    }
    GMTrace.o(16733326802944L, 124673);
    return (JSONObject)localObject3;
  }
  
  public static abstract interface a
  {
    public abstract void bqN();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */