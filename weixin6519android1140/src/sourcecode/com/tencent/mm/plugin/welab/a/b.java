package com.tencent.mm.plugin.welab.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.welab.e.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.HashMap;
import java.util.Map;

public final class b
  implements com.tencent.mm.plugin.welab.a.a.a
{
  private Map<String, Integer> saP;
  private String tag;
  
  public b()
  {
    GMTrace.i(15677838589952L, 116809);
    this.saP = new HashMap();
    this.tag = "";
    bGx();
    GMTrace.o(15677838589952L, 116809);
  }
  
  private void bGx()
  {
    GMTrace.i(15677972807680L, 116810);
    this.tag = ((String)h.xy().xh().get(w.a.vxY, null));
    w.i("LabAppLifeService", "load red tag " + this.tag);
    if (!TextUtils.isEmpty(this.tag))
    {
      String[] arrayOfString = this.tag.split("&");
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = arrayOfString[i];
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          localObject = ((String)localObject).split("=");
          if ((localObject != null) && (localObject.length == 2)) {
            this.saP.put(localObject[0], Integer.valueOf(bg.Sy(localObject[1])));
          }
        }
        i += 1;
      }
    }
    GMTrace.o(15677972807680L, 116810);
  }
  
  public final boolean Np(String paramString)
  {
    GMTrace.i(15678107025408L, 116811);
    if (com.tencent.mm.plugin.welab.b.bGu().Nl(paramString).field_Switch == 2)
    {
      GMTrace.o(15678107025408L, 116811);
      return true;
    }
    GMTrace.o(15678107025408L, 116811);
    return false;
  }
  
  public final boolean Nq(String paramString)
  {
    GMTrace.i(16004256104448L, 119241);
    if ((this.saP.get(paramString) == null) || (((Integer)this.saP.get(paramString)).intValue() == 0))
    {
      GMTrace.o(16004256104448L, 119241);
      return true;
    }
    GMTrace.o(16004256104448L, 119241);
    return false;
  }
  
  public final boolean Nr(String paramString)
  {
    GMTrace.i(15678375460864L, 116813);
    if (com.tencent.mm.plugin.welab.b.bGu().Nl(paramString).isRunning())
    {
      GMTrace.o(15678375460864L, 116813);
      return true;
    }
    GMTrace.o(15678375460864L, 116813);
    return false;
  }
  
  public final void open(String paramString)
  {
    GMTrace.i(15678241243136L, 116812);
    this.saP.put(paramString, Integer.valueOf(1));
    this.tag = (this.tag + "&" + paramString + "=1");
    h.xy().xh().a(w.a.vxY, this.tag);
    com.tencent.mm.plugin.welab.c.a.a locala = com.tencent.mm.plugin.welab.b.bGu().Nl(paramString);
    e.a locala1 = new e.a();
    locala1.eSd = paramString;
    locala1.saN = locala.field_expId;
    locala1.gVB = System.currentTimeMillis();
    locala1.action = 3;
    com.tencent.mm.plugin.welab.e.a(locala1);
    GMTrace.o(15678241243136L, 116812);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */