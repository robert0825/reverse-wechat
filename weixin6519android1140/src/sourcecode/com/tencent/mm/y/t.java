package com.tencent.mm.y;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

public final class t
{
  private static final List<a> gmE;
  
  static
  {
    GMTrace.i(695650484224L, 5183);
    gmE = new ArrayList();
    GMTrace.o(695650484224L, 5183);
  }
  
  public static int G(String paramString1, String paramString2)
  {
    GMTrace.i(694979395584L, 5178);
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      w.w("MicroMsg.ConversationLogic", "get total unread, but has not set uin");
      GMTrace.o(694979395584L, 5178);
      return 0;
    }
    paramString1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().ff(paramString1, paramString2);
    if ((paramString1 != null) && (paramString1.getCount() > 0)) {
      paramString1.moveToFirst();
    }
    for (int i = paramString1.getInt(0);; i = 0)
    {
      if (paramString1 != null) {
        paramString1.close();
      }
      GMTrace.o(694979395584L, 5178);
      return i;
    }
  }
  
  public static int H(String paramString1, String paramString2)
  {
    GMTrace.i(695382048768L, 5181);
    if (bg.nm(paramString1))
    {
      GMTrace.o(695382048768L, 5181);
      return 0;
    }
    if ("notification_messages".equals(paramString1)) {}
    for (int i = 8;; i = 2)
    {
      GMTrace.o(695382048768L, 5181);
      return i;
      if ((paramString2 == null) || (!paramString2.endsWith("@chatroom"))) {
        break;
      }
    }
    PInt localPInt = new PInt();
    List localList = gmE;
    i = 0;
    int j = 0;
    for (;;)
    {
      try
      {
        if (i < gmE.size())
        {
          a locala = (a)gmE.get(i);
          if (locala == null) {
            break label173;
          }
          boolean bool = locala.a(paramString1, paramString2, localPInt);
          j = bool;
          if (!bool) {
            break label173;
          }
          i = localPInt.value;
          j = bool;
          if (j != 0) {
            break;
          }
          i = 1;
          break;
        }
      }
      finally {}
      i = 0;
      continue;
      label173:
      i += 1;
    }
  }
  
  public static int a(String paramString, List<String> paramList)
  {
    GMTrace.i(694845177856L, 5177);
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      w.w("MicroMsg.ConversationLogic", "get total unread with black list, but has not set uin");
      GMTrace.o(694845177856L, 5177);
      return 0;
    }
    long l1 = bg.Pw();
    paramList = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().q(paramString, paramList);
    long l2 = bg.Pw();
    int j = 0;
    int i = j;
    if (paramList != null)
    {
      i = j;
      if (paramList.getCount() > 0)
      {
        paramList.moveToFirst();
        i = paramList.getInt(0);
      }
    }
    if (paramList != null) {
      paramList.close();
    }
    w.d("MicroMsg.ConversationLogic", "unreadcheck unRead getTotalUnread %d", new Object[] { Integer.valueOf(i) });
    if (i <= 0) {
      i = 0;
    }
    for (;;)
    {
      paramList.close();
      w.i("MicroMsg.ConversationLogic", "get count with black list use %d ms", new Object[] { Long.valueOf(bg.aI(l1)) });
      GMTrace.o(694845177856L, 5177);
      return i;
      paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TX(paramString);
      if (paramString != null) {
        break;
      }
      w.w("MicroMsg.ConversationLogic", "cursor is null, return");
      w.i("MicroMsg.ConversationLogic", "get count use %d ms", new Object[] { Long.valueOf(bg.aI(l2)) });
    }
    paramString.moveToFirst();
    label237:
    if (!paramString.isAfterLast())
    {
      x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString.getString(0));
      if ((localx == null) || (localx.fji != 0)) {
        break label387;
      }
      i -= paramString.getInt(1);
      w.d("MicroMsg.ConversationLogic", "unreadcheck chatroom mute %s, unRead %d,", new Object[] { localx.field_username, Integer.valueOf(i) });
    }
    label387:
    for (;;)
    {
      paramString.moveToNext();
      break label237;
      w.i("MicroMsg.ConversationLogic", "unreadcheck  result talker count is %d", new Object[] { Integer.valueOf(i) });
      paramString.close();
      w.i("MicroMsg.ConversationLogic", "unreadcheck get count use %d ms", new Object[] { Long.valueOf(bg.aI(l2)) });
      i = Math.max(0, i);
      break;
    }
  }
  
  public static void a(a parama)
  {
    GMTrace.i(695516266496L, 5182);
    Assert.assertNotNull(parama);
    synchronized (gmE)
    {
      gmE.add(parama);
      GMTrace.o(695516266496L, 5182);
      return;
    }
  }
  
  public static int gu(String paramString)
  {
    GMTrace.i(694710960128L, 5176);
    int i = a(paramString, null);
    GMTrace.o(694710960128L, 5176);
    return i;
  }
  
  public static int gv(String paramString)
  {
    GMTrace.i(695113613312L, 5179);
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      w.w("MicroMsg.ConversationLogic", "get Total Unread Talker, but has not set uin");
      GMTrace.o(695113613312L, 5179);
      return 0;
    }
    long l = bg.Pw();
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().r(paramString, null);
    if (((Cursor)localObject).getCount() > 0) {
      ((Cursor)localObject).moveToFirst();
    }
    for (int i = ((Cursor)localObject).getInt(0);; i = 0)
    {
      ((Cursor)localObject).close();
      if (i <= 0)
      {
        GMTrace.o(695113613312L, 5179);
        return 0;
      }
      paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TX(paramString);
      if (paramString == null)
      {
        w.w("MicroMsg.ConversationLogic", "cursor is null, return");
        w.i("MicroMsg.ConversationLogic", "get count use %d ms", new Object[] { Long.valueOf(bg.aI(l)) });
        GMTrace.o(695113613312L, 5179);
        return i;
      }
      paramString.moveToFirst();
      if (!paramString.isAfterLast())
      {
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString.getString(0));
        if ((localObject == null) || (((af)localObject).fji != 0)) {
          break label306;
        }
        i -= 1;
      }
      label306:
      for (;;)
      {
        paramString.moveToNext();
        break;
        w.i("MicroMsg.ConversationLogic", "result talker count is %d", new Object[] { Integer.valueOf(i) });
        paramString.close();
        w.i("MicroMsg.ConversationLogic", "get count use %d ms", new Object[] { Long.valueOf(bg.aI(l)) });
        i = Math.max(0, i);
        GMTrace.o(695113613312L, 5179);
        return i;
      }
    }
  }
  
  public static List<String> w(String paramString, int paramInt)
  {
    GMTrace.i(695247831040L, 5180);
    ArrayList localArrayList = null;
    Object localObject = null;
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      w.w("MicroMsg.ConversationLogic", "get Total Unread Talker T, but has not set uin");
    }
    for (;;)
    {
      GMTrace.o(695247831040L, 5180);
      return (List<String>)localObject;
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().cM(paramString, -1);
      if (((Cursor)localObject).moveToNext())
      {
        localArrayList = new ArrayList();
        do
        {
          w.d("MicroMsg.ConversationLogic", "jacks need notify talker display name: %s", new Object[] { ((Cursor)localObject).getString(0) });
          localArrayList.add(((Cursor)localObject).getString(0));
        } while (((Cursor)localObject).moveToNext());
      }
      ((Cursor)localObject).close();
      localObject = localArrayList;
      if (localArrayList != null)
      {
        paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TX(paramString);
        localObject = localArrayList;
        if (paramString != null)
        {
          paramString.moveToFirst();
          while (!paramString.isAfterLast())
          {
            localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString.getString(0));
            if ((localObject != null) && (((af)localObject).fji == 0))
            {
              w.d("MicroMsg.ConversationLogic", "jacks need mute notify:  %s", new Object[] { ((x)localObject).vj() });
              localArrayList.remove(((x)localObject).vj());
            }
            paramString.moveToNext();
          }
          paramString.close();
          localObject = localArrayList;
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean a(String paramString1, String paramString2, PInt paramPInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */