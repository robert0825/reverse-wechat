package com.tencent.mm.y;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.au.a.a;
import com.tencent.mm.au.d;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.chatroom.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class l
{
  public static void a(String paramString1, List<String> paramList, String paramString2, boolean paramBoolean, String paramString3)
  {
    GMTrace.i(600355897344L, 4473);
    a(paramString1, paramList, paramString2, paramBoolean, paramString3, 2);
    GMTrace.o(600355897344L, 4473);
  }
  
  public static void a(String paramString1, List<String> paramList, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    GMTrace.i(600490115072L, 4474);
    au localau = new au();
    localau.db(paramString1);
    localau.setType(10000);
    localau.E(System.currentTimeMillis());
    localau.dB(4);
    localau.dC(paramInt);
    paramString1 = new StringBuffer();
    if (paramList != null)
    {
      String str1 = q.zE();
      String str2 = ab.getContext().getString(c.a.deV);
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str3 = (String)paramList.next();
        if (!str3.equals(str1))
        {
          x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(str3);
          if ((localx != null) && ((int)localx.fTq != 0))
          {
            if (paramBoolean) {
              paramString1.append("<a href=\"" + paramString3 + str3 + "\">" + localx.vk() + "</a>" + str2);
            } else {
              paramString1.append(localx.vk() + str2);
            }
          }
          else if (paramBoolean) {
            paramString1.append("<a href=\"" + paramString3 + str3 + "\">" + str3 + "</a>" + str2);
          } else {
            paramString1.append(str3 + str2);
          }
        }
      }
      if (paramString1.length() > 0) {
        paramString1.deleteCharAt(paramString1.lastIndexOf(str2));
      }
    }
    localau.setContent(paramString2.replace("%s", paramString1));
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().P(localau);
    GMTrace.o(600490115072L, 4474);
  }
  
  public static boolean eZ(String paramString)
  {
    GMTrace.i(600087461888L, 4471);
    if (!s.eb(paramString))
    {
      GMTrace.o(600087461888L, 4471);
      return false;
    }
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO(paramString);
    long l1;
    if ((localObject != null) && (((aj)localObject).field_lastSeq != 0L) && (((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().C(paramString, ((aj)localObject).field_lastSeq).field_msgId == 0L)) {
      l1 = ((aj)localObject).field_lastSeq;
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2 = bool1;
      if (!bool1)
      {
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cx(paramString);
        bool2 = bool1;
        if (localObject != null)
        {
          bool2 = bool1;
          if (((ce)localObject).field_msgId != 0L) {
            bool2 = true;
          }
        }
      }
      long l2 = l1;
      if (l1 == 0L) {
        l2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cw(paramString);
      }
      if (l2 != 0L) {
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).zv().y(paramString, l2);
      }
      w.i("MicroMsg.ChatroomLogic", "summerbadcr deleteConv chatroomId[%s], needClear[%b], lastMsgSeq[%d]", new Object[] { paramString, Boolean.valueOf(bool2), Long.valueOf(l2) });
      GMTrace.o(600087461888L, 4471);
      return bool2;
      l1 = 0L;
    }
  }
  
  public static List<Boolean> s(List<String> paramList)
  {
    GMTrace.i(600221679616L, 4472);
    if (paramList == null)
    {
      GMTrace.o(600221679616L, 4472);
      return null;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(Boolean.valueOf(eZ((String)paramList.next())));
    }
    GMTrace.o(600221679616L, 4472);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */