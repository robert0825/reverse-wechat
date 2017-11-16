package com.tencent.mm.y;

import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.chatroom.b.b;
import com.tencent.mm.plugin.messenger.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class r
{
  private static Set<String> gmv;
  
  static
  {
    GMTrace.i(655519383552L, 4884);
    gmv = new HashSet();
    GMTrace.o(655519383552L, 4884);
  }
  
  public static String F(String paramString1, String paramString2)
  {
    GMTrace.i(654177206272L, 4874);
    if (bg.nm(paramString2))
    {
      paramString1 = fs(paramString1);
      GMTrace.o(654177206272L, 4874);
      return paramString1;
    }
    String str = ft(paramString1);
    if (!bg.nm(str))
    {
      GMTrace.o(654177206272L, 4874);
      return str;
    }
    paramString2 = m.E(paramString1, paramString2);
    if (bg.nm(paramString2))
    {
      paramString1 = fs(paramString1);
      GMTrace.o(654177206272L, 4874);
      return paramString1;
    }
    GMTrace.o(654177206272L, 4874);
    return paramString2;
  }
  
  public static String a(x paramx, String paramString)
  {
    GMTrace.i(654714077184L, 4878);
    paramx = s.a(paramx, paramString);
    GMTrace.o(654714077184L, 4878);
    return paramx;
  }
  
  public static String a(x paramx, String paramString, boolean paramBoolean)
  {
    GMTrace.i(654848294912L, 4879);
    if (paramx == null)
    {
      GMTrace.o(654848294912L, 4879);
      return paramString;
    }
    if ((paramBoolean) && (bg.nm(paramx.field_nickname)))
    {
      paramx = ((b)com.tencent.mm.kernel.h.h(b.class)).yT().fs(paramString);
      GMTrace.o(654848294912L, 4879);
      return paramx;
    }
    if ((paramx.vk() != null) && (paramx.vk().length() > 0))
    {
      paramx = paramx.vk();
      GMTrace.o(654848294912L, 4879);
      return paramx;
    }
    if ((bg.nm(paramx.field_nickname)) && (s.gl(paramString)))
    {
      paramx = a.eg(paramString);
      GMTrace.o(654848294912L, 4879);
      return paramx;
    }
    GMTrace.o(654848294912L, 4879);
    return paramString;
  }
  
  public static void b(Set<String> paramSet)
  {
    GMTrace.i(655250948096L, 4882);
    gmv = paramSet;
    GMTrace.o(655250948096L, 4882);
  }
  
  public static String c(x paramx)
  {
    GMTrace.i(654982512640L, 4880);
    Object localObject = fs(paramx.field_username);
    if (s.eb(paramx.field_username))
    {
      if (!((String)localObject).equals(paramx.field_username))
      {
        GMTrace.o(654982512640L, 4880);
        return (String)localObject;
      }
      localObject = ((b)com.tencent.mm.kernel.h.h(b.class)).yT().gG(paramx.field_username);
      if ((localObject != null) && (((List)localObject).size() > 0))
      {
        paramx = new ArrayList();
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          paramx.add(fs((String)((Iterator)localObject).next()));
        }
        paramx = "(" + bg.c(paramx, ", ") + ")";
        GMTrace.o(654982512640L, 4880);
        return paramx;
      }
      paramx = ab.getResources().getString(b.a.cQO);
      GMTrace.o(654982512640L, 4880);
      return paramx;
    }
    GMTrace.o(654982512640L, 4880);
    return (String)localObject;
  }
  
  public static String fq(String paramString)
  {
    GMTrace.i(654042988544L, 4873);
    x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString);
    if (localx == null)
    {
      GMTrace.o(654042988544L, 4873);
      return paramString;
    }
    if (!bg.nm(localx.field_nickname))
    {
      paramString = localx.field_nickname;
      GMTrace.o(654042988544L, 4873);
      return paramString;
    }
    GMTrace.o(654042988544L, 4873);
    return paramString;
  }
  
  public static String fr(String paramString)
  {
    GMTrace.i(654311424000L, 4875);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(654311424000L, 4875);
      return "";
    }
    x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString);
    w.d("MicroMsg.ContactCommDisplay", "username: %s", new Object[] { paramString });
    if (localx == null)
    {
      GMTrace.o(654311424000L, 4875);
      return paramString;
    }
    if ((paramString.toLowerCase().endsWith("@chatroom")) && (bg.nm(localx.field_nickname)))
    {
      String str = ((b)com.tencent.mm.kernel.h.h(b.class)).yT().fs(paramString);
      if (!bg.nm(str))
      {
        GMTrace.o(654311424000L, 4875);
        return str;
      }
    }
    if ((localx.vj() != null) && (localx.vj().length() > 0))
    {
      paramString = localx.vj();
      GMTrace.o(654311424000L, 4875);
      return paramString;
    }
    GMTrace.o(654311424000L, 4875);
    return paramString;
  }
  
  public static String fs(String paramString)
  {
    GMTrace.i(654445641728L, 4876);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(654445641728L, 4876);
      return "";
    }
    paramString = s.a(((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString), paramString);
    GMTrace.o(654445641728L, 4876);
    return paramString;
  }
  
  public static String ft(String paramString)
  {
    GMTrace.i(655116730368L, 4881);
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString);
    if (paramString == null)
    {
      GMTrace.o(655116730368L, 4881);
      return "";
    }
    if (!bg.nm(paramString.field_conRemark))
    {
      paramString = paramString.field_conRemark;
      GMTrace.o(655116730368L, 4881);
      return paramString;
    }
    GMTrace.o(655116730368L, 4881);
    return "";
  }
  
  public static String fu(String paramString)
  {
    GMTrace.i(655385165824L, 4883);
    if (gmv.contains(paramString))
    {
      GMTrace.o(655385165824L, 4883);
      return "";
    }
    GMTrace.o(655385165824L, 4883);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */