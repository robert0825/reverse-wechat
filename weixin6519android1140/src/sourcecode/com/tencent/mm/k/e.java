package com.tencent.mm.k;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.ck;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class e
{
  private HashMap<String, String> fSN;
  public boolean fSO;
  
  public e()
  {
    GMTrace.i(13611690885120L, 101415);
    this.fSN = new HashMap();
    this.fSO = false;
    GMTrace.o(13611690885120L, 101415);
  }
  
  private void a(Map<String, String> paramMap, boolean paramBoolean)
  {
    GMTrace.i(13612764626944L, 101423);
    if (paramMap == null)
    {
      GMTrace.o(13612764626944L, 101423);
      return;
    }
    if (!paramBoolean) {
      this.fSN.clear();
    }
    int i = 0;
    if (i < 10000)
    {
      Object localObject2;
      label64:
      String str1;
      HashMap localHashMap;
      String str2;
      if (paramBoolean)
      {
        localObject2 = new StringBuilder(".sysmsg.dynacfg_split.Item");
        if (i == 0)
        {
          localObject1 = "";
          localObject1 = localObject1;
          str1 = (String)localObject1 + ".$key";
          localObject2 = (String)paramMap.get(localObject1);
          str1 = (String)paramMap.get(str1);
          if ((str1 == null) || (bg.nm(str1.trim()))) {
            break label262;
          }
          localHashMap = this.fSN;
          str2 = str1.trim();
          if (localObject2 == null) {
            break label255;
          }
        }
      }
      label255:
      for (Object localObject1 = localObject2;; localObject1 = "")
      {
        localHashMap.put(str2, localObject1);
        w.d("MicroMsg.DynamicConfig", "put %s %s", new Object[] { str1.trim(), localObject2 });
        i += 1;
        break;
        localObject1 = Integer.valueOf(i);
        break label64;
        localObject2 = new StringBuilder(".sysmsg.dynacfg.Item");
        if (i == 0) {}
        for (localObject1 = "";; localObject1 = Integer.valueOf(i))
        {
          localObject1 = localObject1;
          break;
        }
      }
    }
    label262:
    w.d("MicroMsg.DynamicConfig", "All dynamicConfig:%s", new Object[] { this.fSN.toString() });
    GMTrace.o(13612764626944L, 101423);
  }
  
  public final void a(String paramString, Map<String, String> paramMap, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(13612496191488L, 101421);
        if (bg.nm(paramString))
        {
          GMTrace.o(13612496191488L, 101421);
          return;
        }
        w.i("MicroMsg.DynamicConfig", "update dynacfg. increment:%b, md5:%s", new Object[] { Boolean.valueOf(paramBoolean), g.bg(paramString) });
        if (paramBoolean)
        {
          h.xz();
          h.xy().xh().set(278530, paramString);
          if (paramMap == null) {
            break label151;
          }
          a(paramMap, paramBoolean);
          paramString = new ck();
          a.vgX.m(paramString);
          GMTrace.o(13612496191488L, 101421);
          continue;
        }
        h.xz();
      }
      finally {}
      h.xy().xh().set(278529, paramString);
      h.xz();
      h.xy().xh().set(278530, "");
      continue;
      label151:
      i(paramString, paramBoolean);
    }
  }
  
  public final List<String> dW(String paramString)
  {
    ArrayList localArrayList;
    try
    {
      GMTrace.i(13612093538304L, 101418);
      if (!this.fSO)
      {
        w.e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
        load();
      }
      localArrayList = new ArrayList();
      if (!bg.nm(paramString))
      {
        Iterator localIterator = this.fSN.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (str.matches(paramString)) {
            localArrayList.add(this.fSN.get(str));
          }
        }
      }
    }
    finally {}
    tmp117_114[0] = paramString;
    Object[] tmp121_117 = tmp117_114;
    tmp121_117[1] = Integer.valueOf(localArrayList.size());
    w.d("MicroMsg.DynamicConfig", "searchValues, entry:%s, size:%d", tmp121_117);
    GMTrace.o(13612093538304L, 101418);
    return localArrayList;
  }
  
  public final int getInt(String paramString, int paramInt)
  {
    GMTrace.i(13611959320576L, 101417);
    try
    {
      int i = Integer.parseInt(getValue(paramString));
      paramInt = i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.DynamicConfig", "parseInt failed, val: " + paramString);
      }
    }
    GMTrace.o(13611959320576L, 101417);
    return paramInt;
  }
  
  public final String getValue(String paramString)
  {
    try
    {
      GMTrace.i(13611825102848L, 101416);
      if (!this.fSO)
      {
        w.e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
        load();
      }
      w.d("MicroMsg.DynamicConfig", "get configs.get(config) %s %s", new Object[] { paramString.trim(), this.fSN.get(paramString) });
      paramString = (String)this.fSN.get(paramString);
      GMTrace.o(13611825102848L, 101416);
      return paramString;
    }
    finally {}
  }
  
  public final void i(String paramString, boolean paramBoolean)
  {
    GMTrace.i(13612630409216L, 101422);
    a(bh.q(paramString, "sysmsg"), paramBoolean);
    GMTrace.o(13612630409216L, 101422);
  }
  
  public void load()
  {
    try
    {
      GMTrace.i(13612361973760L, 101420);
      h.xz();
      if (h.xy() != null)
      {
        h.xz();
        if (h.xy().xh() != null)
        {
          this.fSO = true;
          h.xz();
          i((String)h.xy().xh().get(278529, null), false);
        }
      }
      h.xz();
      if (h.xy() != null)
      {
        h.xz();
        if (h.xy().xh() != null)
        {
          this.fSO = true;
          h.xz();
          i((String)h.xy().xh().get(278530, null), true);
        }
      }
      GMTrace.o(13612361973760L, 101420);
      return;
    }
    finally {}
  }
  
  @Deprecated
  public final void put(String paramString1, String paramString2)
  {
    try
    {
      GMTrace.i(13612227756032L, 101419);
      if ((paramString1 != null) && (paramString2 != null))
      {
        w.d("MicroMsg.DynamicConfig", "put configs.put(key,value) %s %s", new Object[] { paramString1.trim(), paramString2 });
        this.fSN.put(paramString1, paramString2);
      }
      GMTrace.o(13612227756032L, 101419);
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\k\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */