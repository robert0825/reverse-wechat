package com.tencent.mm.k;

import android.view.ContextMenu.ContextMenuInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class d
{
  public static final int[] fSJ;
  HashMap<String, HashMap<String, String>> fSK;
  public Map<String, String> fSL;
  private int id;
  int version;
  
  static
  {
    GMTrace.i(13611422449664L, 101413);
    fSJ = new int[] { 1 };
    GMTrace.o(13611422449664L, 101413);
  }
  
  public d(int paramInt)
  {
    GMTrace.i(13610885578752L, 101409);
    this.fSK = new HashMap();
    this.fSL = null;
    this.id = paramInt;
    GMTrace.o(13610885578752L, 101409);
  }
  
  private static LinkedList<a> c(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(13611154014208L, 101411);
    LinkedList localLinkedList = null;
    int i = 0;
    Object localObject2 = new StringBuilder().append(paramString);
    Object localObject1;
    if (i == 0)
    {
      localObject1 = "";
      label33:
      String str = localObject1;
      if (paramMap.get(str) == null) {
        break label210;
      }
      localObject1 = str + ".id";
      localObject2 = str + ".title";
      str = str + ".url";
      if (!paramMap.containsKey(localObject1)) {
        break label210;
      }
      localObject1 = new a((String)paramMap.get(localObject1), (String)paramMap.get(localObject2), (String)paramMap.get(str));
      if (localLinkedList != null) {
        break label220;
      }
      localLinkedList = new LinkedList();
    }
    label210:
    label220:
    for (;;)
    {
      localLinkedList.add(localObject1);
      i += 1;
      break;
      localObject1 = Integer.valueOf(i);
      break label33;
      GMTrace.o(13611154014208L, 101411);
      return localLinkedList;
    }
  }
  
  static boolean dV(String paramString)
  {
    GMTrace.i(13611019796480L, 101410);
    for (;;)
    {
      int i;
      try
      {
        boolean bool = bg.nm(paramString);
        if (bool)
        {
          GMTrace.o(13611019796480L, 101410);
          return false;
        }
        Object localObject = new ArrayList();
        if (!bg.nm(paramString))
        {
          paramString = paramString.split(",");
          if ((paramString != null) && (paramString.length > 0))
          {
            i = 0;
            if (i < paramString.length)
            {
              if (bg.nm(paramString[i])) {
                break label292;
              }
              ((List)localObject).add(paramString[i]);
              break label292;
            }
          }
        }
        paramString = v.bPK();
        bool = bg.nm(paramString);
        if (bool)
        {
          GMTrace.o(13611019796480L, 101410);
          return false;
        }
        w.d("MicroMsg.ConfigListInfo", "locale is " + paramString);
        localObject = ((List)localObject).iterator();
        if (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if ((str.trim().toLowerCase().equals("other")) && (!paramString.equals("zh_CN")))
          {
            w.d("MicroMsg.ConfigListInfo", "find other");
            GMTrace.o(13611019796480L, 101410);
            return true;
          }
          if (!str.trim().toLowerCase().equals(paramString.trim().toLowerCase())) {
            continue;
          }
          w.d("MicroMsg.ConfigListInfo", "find ");
          GMTrace.o(13611019796480L, 101410);
          return true;
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.ConfigListInfo", "exception:%s", new Object[] { bg.f(paramString) });
        w.d("MicroMsg.ConfigListInfo", "isContainLocale failed " + paramString.getMessage());
        GMTrace.o(13611019796480L, 101410);
        return false;
      }
      label292:
      i += 1;
    }
  }
  
  public static LinkedList<a> j(Map<String, String> paramMap)
  {
    GMTrace.i(13611288231936L, 101412);
    Object localObject1 = null;
    int i = 0;
    Object localObject3 = new StringBuilder(".ConfigList.Config");
    if (i == 0) {}
    for (Object localObject2 = "";; localObject2 = Integer.valueOf(i))
    {
      localObject3 = localObject2;
      if (paramMap.get((String)localObject3 + ".$name") == null) {
        break label246;
      }
      if (!((String)paramMap.get((String)localObject3 + ".$name")).equalsIgnoreCase("JDWebViewMenu")) {
        break label256;
      }
      localObject2 = c(paramMap, (String)localObject3 + ".menuItems.menuItem");
      localObject3 = c(paramMap, (String)localObject3 + ".menuItems.newMenuItem");
      if (localObject2 != null) {
        break;
      }
      GMTrace.o(13611288231936L, 101412);
      return (LinkedList<a>)localObject3;
    }
    localObject1 = localObject2;
    if (localObject3 != null)
    {
      localObject1 = localObject2;
      if (((LinkedList)localObject3).size() > 0)
      {
        w.d("MicroMsg.ConfigListInfo", "has menuItem2, %s, %s", new Object[] { Integer.valueOf(((LinkedList)localObject2).size()), Integer.valueOf(((LinkedList)localObject3).size()) });
        ((LinkedList)localObject2).addAll((Collection)localObject3);
        localObject1 = localObject2;
      }
    }
    label246:
    label256:
    for (;;)
    {
      i += 1;
      break;
      GMTrace.o(13611288231936L, 101412);
      return (LinkedList<a>)localObject1;
    }
  }
  
  public static final class a
  {
    public String id;
    public String title;
    public String url;
    
    public a(String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(13611556667392L, 101414);
      this.id = paramString1;
      this.title = paramString2;
      this.url = paramString3;
      GMTrace.o(13611556667392L, 101414);
    }
  }
  
  public static final class b
    implements ContextMenu.ContextMenuInfo
  {
    private static int fSM;
    public final String amf;
    public final int id;
    public final String title;
    
    static
    {
      GMTrace.i(13613033062400L, 101425);
      fSM = 10000;
      GMTrace.o(13613033062400L, 101425);
    }
    
    public b(String paramString1, String paramString2)
    {
      GMTrace.i(13612898844672L, 101424);
      int i = fSM;
      fSM = i + 1;
      this.id = i;
      this.amf = paramString1;
      this.title = paramString2;
      GMTrace.o(13612898844672L, 101424);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\k\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */