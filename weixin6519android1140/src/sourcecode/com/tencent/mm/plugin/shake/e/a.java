package com.tencent.mm.plugin.shake.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a
{
  public LinkedList<a> gVg;
  
  public a()
  {
    GMTrace.i(6614249635840L, 49280);
    this.gVg = new LinkedList();
    GMTrace.o(6614249635840L, 49280);
  }
  
  private static a a(Map<String, String> paramMap, int paramInt, String paramString)
  {
    GMTrace.i(6614518071296L, 49282);
    a locala = new a(paramInt);
    locala.title = bg.nl((String)paramMap.get(paramString + ".title"));
    locala.lRJ = bg.nl((String)paramMap.get(paramString + ".summary"));
    String str = paramString + ".thumburl";
    int i = 0;
    if (i < 100)
    {
      StringBuilder localStringBuilder = new StringBuilder().append(str);
      if (i > 0) {}
      for (Object localObject = Integer.valueOf(i);; localObject = "")
      {
        localObject = (String)paramMap.get(localObject);
        if (bg.nm((String)localObject)) {
          break label199;
        }
        locala.oRt.add(localObject);
        i += 1;
        break;
      }
    }
    label199:
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(6614518071296L, 49282);
      return locala;
      locala.oRs = bg.nl((String)paramMap.get(paramString + ".h5url.link"));
      locala.oRu = bg.nl((String)paramMap.get(paramString + ".h5url.title"));
      locala.oRv = bg.nl((String)paramMap.get(paramString + ".h5url.username"));
      continue;
      locala.oRs = bg.nl((String)paramMap.get(paramString + ".bizprofile.username"));
      locala.oRu = bg.nl((String)paramMap.get(paramString + ".bizprofile.showchat"));
      continue;
      locala.oRs = bg.nl((String)paramMap.get(paramString + ".nativepay.wx_pay_url"));
      continue;
      locala.oRs = bg.nl((String)paramMap.get(paramString + ".product.product_id"));
    }
  }
  
  public static LinkedList<a> j(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(6614383853568L, 49281);
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    int j = 0;
    a locala1;
    Object localObject2;
    Object localObject1;
    int k;
    Object localObject3;
    if (j < 1000)
    {
      locala1 = new a();
      localObject2 = new StringBuilder().append(paramString).append(".actionlist");
      if (j > 0)
      {
        localObject1 = Integer.valueOf(j);
        String str = localObject1;
        localObject2 = new LinkedList();
        k = 0;
        if (k >= 1000) {
          break label518;
        }
        localObject3 = new StringBuilder().append(str).append(".action");
        if (k <= 0) {
          break label197;
        }
      }
      label197:
      for (localObject1 = Integer.valueOf(k);; localObject1 = "")
      {
        localObject3 = localObject1;
        if (!bg.nm((String)paramMap.get((String)localObject3 + ".type"))) {
          break label228;
        }
        if (i == 0) {
          break label204;
        }
        GMTrace.o(6614383853568L, 49281);
        return localLinkedList;
        localObject1 = "";
        break;
      }
      label204:
      i = 1;
      locala1.gVg = ((LinkedList)localObject2);
    }
    label213:
    label228:
    label430:
    label518:
    for (;;)
    {
      localLinkedList.add(locala1);
      j += 1;
      break;
      for (;;)
      {
        int m;
        try
        {
          m = Integer.valueOf((String)paramMap.get((String)localObject3 + ".type")).intValue();
          localObject1 = null;
          if (m != 2) {
            break label430;
          }
          localObject1 = new a(m);
          ((a)localObject1).oRs = bg.nl((String)paramMap.get((String)localObject3 + ".comment.id"));
          ((a)localObject1).title = bg.nl((String)paramMap.get((String)localObject3 + ".comment.title"));
          if (localObject1 != null) {
            ((LinkedList)localObject2).add(localObject1);
          }
          k += 1;
          i = 0;
        }
        catch (Exception localException)
        {
          new StringBuilder("Exception in parseActionList: ").append(localException.getMessage());
          if (i != 0)
          {
            GMTrace.o(6614383853568L, 49281);
            return localLinkedList;
          }
          i = 1;
          locala1.gVg = ((LinkedList)localObject2);
        }
        break label213;
        a locala;
        if (m == 3) {
          locala = a(paramMap, m, (String)localObject3);
        } else if (m == 4) {
          locala = a(paramMap, m, (String)localObject3);
        } else if (m == 5) {
          locala = a(paramMap, m, (String)localObject3);
        } else if (m == 6) {
          locala = a(paramMap, m, (String)localObject3);
        }
      }
      GMTrace.o(6614383853568L, 49281);
      return localLinkedList;
    }
  }
  
  public static final class a
  {
    public String lRJ;
    public String oRs;
    public List<String> oRt;
    public String oRu;
    public String oRv;
    public String title;
    public int type;
    
    public a()
    {
      GMTrace.i(6613578547200L, 49275);
      this.oRt = new ArrayList();
      this.oRu = "";
      this.oRv = "";
      GMTrace.o(6613578547200L, 49275);
    }
    
    public a(int paramInt)
    {
      GMTrace.i(6613712764928L, 49276);
      this.oRt = new ArrayList();
      this.oRu = "";
      this.oRv = "";
      this.type = paramInt;
      GMTrace.o(6613712764928L, 49276);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */