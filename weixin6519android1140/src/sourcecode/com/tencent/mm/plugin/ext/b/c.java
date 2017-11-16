package com.tencent.mm.plugin.ext.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.gy;
import com.tencent.mm.g.a.gy.b;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.bai;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class c
{
  private static Map<String, a> kMy;
  final e fUd;
  private String kMw;
  private boolean kMx;
  public Context mContext;
  
  static
  {
    GMTrace.i(5713648680960L, 42570);
    kMy = null;
    GMTrace.o(5713648680960L, 42570);
  }
  
  public c(Context paramContext, String paramString)
  {
    GMTrace.i(5712172285952L, 42559);
    this.kMw = "";
    this.kMx = false;
    this.mContext = null;
    this.fUd = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5712038068224L, 42558);
        at.wS().b(106, this);
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: searched data.");
          paramAnonymousString = ((ab)paramAnonymousk).LK();
          w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: contact count: %d", new Object[] { Integer.valueOf(paramAnonymousString.uqk) });
          if (paramAnonymousString.uqk > 0)
          {
            if (paramAnonymousString.uql.isEmpty())
            {
              w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: no result is retrieved. start to search UI");
              c.this.b(paramAnonymousString);
            }
            if (paramAnonymousString.uql.size() > 1) {
              try
              {
                paramAnonymousk = new Intent();
                paramAnonymousk.putExtra("add_more_friend_search_scene", 3);
                paramAnonymousk.putExtra("result", paramAnonymousString.toByteArray());
                w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: more than one contact is resolved. starting to ContactSearchResultUI");
                com.tencent.mm.plugin.ext.a.hnH.w(paramAnonymousk, c.this.mContext);
                GMTrace.o(5712038068224L, 42558);
                return;
              }
              catch (IOException paramAnonymousString)
              {
                w.printErrStackTrace("MicroMsg.RedirectToChattingByPhoneHelper", paramAnonymousString, "", new Object[0]);
                GMTrace.o(5712038068224L, 42558);
                return;
              }
            }
            c.this.a((bai)paramAnonymousString.uql.getFirst());
            GMTrace.o(5712038068224L, 42558);
            return;
          }
          w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: only one result is retrieved. start to chatting directly");
          c.this.a(paramAnonymousString);
          GMTrace.o(5712038068224L, 42558);
          return;
        }
        w.w("MicroMsg.RedirectToChattingByPhoneHelper", "hy: err net.errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        c.this.b(null);
        GMTrace.o(5712038068224L, 42558);
      }
    };
    this.mContext = paramContext;
    this.kMw = paramString;
    this.kMx = true;
    GMTrace.o(5712172285952L, 42559);
  }
  
  private int a(String paramString, bak parambak, bai parambai)
  {
    GMTrace.i(5712574939136L, 42562);
    if (this.mContext == null)
    {
      w.w("MicroMsg.RedirectToChattingByPhoneHelper", "hy: error param. start redirect param error: context is null");
      GMTrace.o(5712574939136L, 42562);
      return -1;
    }
    if (!bg.nm(paramString))
    {
      at.AR();
      if (com.tencent.mm.y.c.yK().TA(paramString))
      {
        w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: is friend. direct to chatting");
        xl(paramString);
        GMTrace.o(5712574939136L, 42562);
        return 0;
      }
    }
    if (parambak != null)
    {
      w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via searchResp");
      a(parambak);
      GMTrace.o(5712574939136L, 42562);
      return 1;
    }
    if (parambai != null)
    {
      w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via SearchContactItem");
      a(parambai);
      GMTrace.o(5712574939136L, 42562);
      return 1;
    }
    w.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: no matching for starting redirect");
    GMTrace.o(5712574939136L, 42562);
    return -1;
  }
  
  private static void a(String paramString, a parama)
  {
    GMTrace.i(5712440721408L, 42561);
    if (bg.nm(paramString))
    {
      w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: username is null when put to cache");
      GMTrace.o(5712440721408L, 42561);
      return;
    }
    if (kMy == null) {
      kMy = new HashMap();
    }
    kMy.put(paramString, parama);
    GMTrace.o(5712440721408L, 42561);
  }
  
  private void xl(String paramString)
  {
    GMTrace.i(5712709156864L, 42563);
    Intent localIntent = new Intent();
    localIntent.putExtra("Chat_User", paramString);
    localIntent.putExtra("finish_direct", false);
    com.tencent.mm.bj.d.a(this.mContext, ".ui.chatting.En_5b8fbb1e", localIntent);
    GMTrace.o(5712709156864L, 42563);
  }
  
  public final void a(bai parambai)
  {
    GMTrace.i(5712977592320L, 42565);
    if (parambai == null)
    {
      w.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: item or context is null");
      GMTrace.o(5712977592320L, 42565);
      return;
    }
    Object localObject = com.tencent.mm.platformtools.n.a(parambai.ufy);
    if (!bg.nm((String)localObject))
    {
      a(this.kMw, new a(com.tencent.mm.platformtools.n.a(parambai.ufy), null, parambai));
      at.AR();
      if (com.tencent.mm.y.c.yK().TA((String)localObject))
      {
        w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search item is friend. start to chatting");
        xl((String)localObject);
        GMTrace.o(5712977592320L, 42565);
        return;
      }
      localObject = new Intent();
      com.tencent.mm.pluginsdk.ui.tools.c.a((Intent)localObject, parambai, 15);
      ((Intent)localObject).putExtra("add_more_friend_search_scene", 2);
      com.tencent.mm.plugin.ext.a.hnH.d((Intent)localObject, this.mContext);
      GMTrace.o(5712977592320L, 42565);
      return;
    }
    w.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
    GMTrace.o(5712977592320L, 42565);
  }
  
  public final void a(bak parambak)
  {
    GMTrace.i(5712843374592L, 42564);
    if (parambak == null)
    {
      w.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: resp or context is null");
      GMTrace.o(5712843374592L, 42564);
      return;
    }
    Object localObject = com.tencent.mm.platformtools.n.a(parambak.ufy);
    if (!bg.nm((String)localObject))
    {
      a(this.kMw, new a(com.tencent.mm.platformtools.n.a(parambak.ufy), parambak, null));
      at.AR();
      if (com.tencent.mm.y.c.yK().TA((String)localObject))
      {
        w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search response is friend. start to chatting");
        xl((String)localObject);
        GMTrace.o(5712843374592L, 42564);
        return;
      }
      localObject = new Intent();
      com.tencent.mm.pluginsdk.ui.tools.c.a((Intent)localObject, parambak, 15);
      ((Intent)localObject).putExtra("add_more_friend_search_scene", 2);
      com.tencent.mm.plugin.ext.a.hnH.d((Intent)localObject, this.mContext);
      GMTrace.o(5712843374592L, 42564);
      return;
    }
    w.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
    GMTrace.o(5712843374592L, 42564);
  }
  
  public final int avp()
  {
    GMTrace.i(5712306503680L, 42560);
    if (this.mContext == null)
    {
      w.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: context is null");
      GMTrace.o(5712306503680L, 42560);
      return -1;
    }
    if (bg.nm(this.kMw))
    {
      w.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: phone is null");
      GMTrace.o(5712306503680L, 42560);
      return -1;
    }
    String str = an.Sa(this.kMw);
    if (bg.nm(str))
    {
      w.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: pure num is null");
      GMTrace.o(5712306503680L, 42560);
      return -1;
    }
    Object localObject = this.kMw;
    if (bg.nm((String)localObject)) {
      w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: username is null when get from cache");
    }
    int i;
    for (localObject = null; localObject != null; localObject = (a)kMy.get(localObject))
    {
      w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: got from cache");
      i = a(((a)localObject).userName, ((a)localObject).kMA, ((a)localObject).kMB);
      GMTrace.o(5712306503680L, 42560);
      return i;
      if (kMy == null) {
        kMy = new HashMap();
      }
    }
    localObject = new gy();
    ((gy)localObject).eKb.eKd = str;
    com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
    localObject = ((gy)localObject).eKc.userName;
    if (!bg.nm((String)localObject))
    {
      w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: has found username: %s", new Object[] { localObject });
      i = a((String)localObject, null, null);
      GMTrace.o(5712306503680L, 42560);
      return i;
    }
    w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: not found from local storage. Try to find from search");
    at.wS().a(106, this.fUd);
    localObject = new ab(com.tencent.mm.plugin.fts.a.d.yQ(str), 3);
    at.wS().a((k)localObject, 0);
    localObject = new Intent();
    ((Intent)localObject).setClassName(this.mContext, "com.tencent.mm.plugin.ext.ui.RedirectToChattingByPhoneStubUI");
    ((Intent)localObject).setFlags(268435456);
    this.mContext.startActivity((Intent)localObject);
    GMTrace.o(5712306503680L, 42560);
    return 2;
  }
  
  public final void b(bak parambak)
  {
    GMTrace.i(16027744206848L, 119416);
    Intent localIntent = new Intent();
    localIntent.putExtra("add_more_friend_search_scene", 3);
    if (parambak != null) {}
    try
    {
      localIntent.putExtra("result", parambak.toByteArray());
      w.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: more than one contact is resolved. starting to ContactSearchResultUI");
      com.tencent.mm.plugin.ext.a.hnH.w(localIntent, this.mContext);
      GMTrace.o(16027744206848L, 119416);
      return;
    }
    catch (IOException parambak)
    {
      for (;;)
      {
        w.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: IOException: %s", new Object[] { parambak.toString() });
      }
    }
  }
  
  final class a
  {
    bak kMA;
    bai kMB;
    String userName;
    
    public a(String paramString, bak parambak, bai parambai)
    {
      GMTrace.i(5713782898688L, 42571);
      this.userName = "";
      this.kMA = null;
      this.kMB = null;
      this.userName = paramString;
      this.kMA = parambak;
      this.kMB = parambai;
      GMTrace.o(5713782898688L, 42571);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */