package com.tencent.mm.plugin.welab.d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.s.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
{
  private static final b sbr;
  public Map<String, Integer> saP;
  public String tag;
  
  static
  {
    GMTrace.i(15675556888576L, 116792);
    sbr = new b();
    GMTrace.o(15675556888576L, 116792);
  }
  
  private b()
  {
    GMTrace.i(15674483146752L, 116784);
    this.saP = new HashMap();
    this.tag = "";
    bGx();
    GMTrace.o(15674483146752L, 116784);
  }
  
  private boolean Nu(String paramString)
  {
    GMTrace.i(16419659972608L, 122336);
    if ((this.saP.containsKey(paramString)) && (((Integer)this.saP.get(paramString)).intValue() == 1))
    {
      GMTrace.o(16419659972608L, 122336);
      return true;
    }
    GMTrace.o(16419659972608L, 122336);
    return false;
  }
  
  public static b bGI()
  {
    GMTrace.i(15674348929024L, 116783);
    b localb = sbr;
    GMTrace.o(15674348929024L, 116783);
    return localb;
  }
  
  public static void bGJ()
  {
    GMTrace.i(16419794190336L, 122337);
    Object localObject = com.tencent.mm.plugin.welab.b.bGu().bGv();
    if ((localObject != null) && (((List)localObject).isEmpty())) {}
    localObject = ((List)localObject).iterator();
    com.tencent.mm.plugin.welab.c.a.a locala;
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
      locala = (com.tencent.mm.plugin.welab.c.a.a)((Iterator)localObject).next();
    } while ((locala == null) || (!sbr.e(locala)));
    for (int i = 0;; i = 1)
    {
      if (i != 0) {
        c.vK().aF(266267, 266241);
      }
      GMTrace.o(16419794190336L, 122337);
      return;
    }
  }
  
  public static boolean bGK()
  {
    GMTrace.i(15675288453120L, 116790);
    boolean bool = c.vK().aE(266267, 266241);
    GMTrace.o(15675288453120L, 116790);
    return bool;
  }
  
  public static boolean bGL()
  {
    GMTrace.i(16133105123328L, 120201);
    boolean bool = ab.bPV().getBoolean("key_has_enter_welab", false);
    GMTrace.o(16133105123328L, 120201);
    return bool;
  }
  
  private void bGx()
  {
    GMTrace.i(15674617364480L, 116785);
    this.tag = ((String)h.xy().xh().get(w.a.vxX, null));
    w.i("WeLabRedPointMgr", "load red tag " + this.tag);
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
    GMTrace.o(15674617364480L, 116785);
  }
  
  public final boolean e(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    GMTrace.i(16419525754880L, 122335);
    if (parama.field_RedPoint == 1) {
      if ((!parama.bBM()) && (parama.field_Switch != 3)) {
        break label47;
      }
    }
    label47:
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(16419525754880L, 122335);
      return false;
    }
    if (Nu(parama.field_LabsAppId))
    {
      GMTrace.o(16419525754880L, 122335);
      return false;
    }
    GMTrace.o(16419525754880L, 122335);
    return true;
  }
  
  public final void f(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    GMTrace.i(15675020017664L, 116788);
    if ((parama.field_RedPoint == 1) && (!Nu(parama.field_LabsAppId)) && (parama.bGE())) {
      c.vK().l(266267, true);
    }
    GMTrace.o(15675020017664L, 116788);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */