package com.tencent.mm.plugin.appbrand.media;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.at.b;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class c
{
  public String eEs;
  public String eIH;
  public int eII;
  private HashMap<String, com.tencent.mm.sdk.b.c> gEO;
  public String irn;
  public String iro;
  
  public c()
  {
    GMTrace.i(19845970132992L, 147864);
    this.gEO = new HashMap();
    GMTrace.o(19845970132992L, 147864);
  }
  
  public final void a(com.tencent.mm.sdk.b.c paramc, String paramString)
  {
    GMTrace.i(19846372786176L, 147867);
    if (this.gEO.get(paramString) != null)
    {
      w.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already add appid: %s", new Object[] { paramString });
      GMTrace.o(19846372786176L, 147867);
      return;
    }
    a.vgX.b(paramc);
    this.gEO.put(paramString, paramc);
    GMTrace.o(19846372786176L, 147867);
  }
  
  public final boolean be(String paramString1, String paramString2)
  {
    GMTrace.i(19846104350720L, 147865);
    if (paramString2.equalsIgnoreCase("play"))
    {
      w.i("MicroMsg.AppBrandMusicPlayerManager", "play option appid %s, pre appid %s", new Object[] { paramString1, this.irn });
      GMTrace.o(19846104350720L, 147865);
      return true;
    }
    if (paramString1.equalsIgnoreCase(this.irn))
    {
      paramString1 = b.JS();
      if ((paramString1 != null) && (paramString1.ucY.equals(this.iro)))
      {
        GMTrace.o(19846104350720L, 147865);
        return true;
      }
    }
    GMTrace.o(19846104350720L, 147865);
    return false;
  }
  
  public final void c(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(19846238568448L, 147866);
    this.irn = paramString1;
    this.eII = paramInt;
    this.eEs = paramString2;
    this.eIH = paramString3;
    GMTrace.o(19846238568448L, 147866);
  }
  
  public final void qi(String paramString)
  {
    GMTrace.i(19846507003904L, 147868);
    if (this.gEO.get(paramString) == null)
    {
      w.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already remove appid: %s", new Object[] { paramString });
      GMTrace.o(19846507003904L, 147868);
      return;
    }
    a.vgX.c((com.tencent.mm.sdk.b.c)this.gEO.remove(paramString));
    this.gEO.remove(paramString);
    GMTrace.o(19846507003904L, 147868);
  }
  
  public final boolean rh(String paramString)
  {
    GMTrace.i(19846641221632L, 147869);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.AppBrandMusicPlayerManager", "appId is empty");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    if (!paramString.equalsIgnoreCase(this.irn))
    {
      w.e("MicroMsg.AppBrandMusicPlayerManager", "appId is not equals pre play id");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    if (TextUtils.isEmpty(this.iro))
    {
      w.e("MicroMsg.AppBrandMusicPlayerManager", "now app not play music");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    paramString = b.JS();
    if (paramString == null)
    {
      w.e("MicroMsg.AppBrandMusicPlayerManager", "wrapper is null");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    if (!this.iro.equalsIgnoreCase(paramString.ucY))
    {
      w.e("MicroMsg.AppBrandMusicPlayerManager", "musicId is diff");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    if (!b.JQ())
    {
      w.i("MicroMsg.AppBrandMusicPlayerManager", "MusicHelper.isPlayingMusic FALSE");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    GMTrace.o(19846641221632L, 147869);
    return true;
  }
  
  private static final class a
  {
    public static c irp;
    
    static
    {
      GMTrace.i(19859794558976L, 147967);
      irp = new c();
      GMTrace.o(19859794558976L, 147967);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */