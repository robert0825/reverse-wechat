package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.widget.h;
import com.tencent.mm.plugin.webview.ui.tools.widget.h.a;
import com.tencent.mm.protocal.c.aiy;
import com.tencent.mm.protocal.c.ajk;
import com.tencent.mm.protocal.c.ajl;
import com.tencent.mm.protocal.c.ajm;
import com.tencent.mm.protocal.c.ajn;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_BYTE = 232;
  public static final String NAME = "authorize";
  
  public d()
  {
    GMTrace.i(17044443496448L, 126991);
    GMTrace.o(17044443496448L, 126991);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, final JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17044577714176L, 126992);
    w.i("MicroMsg.GameJsApiAuthorize", "invoke");
    final GameWebViewUI localGameWebViewUI = paramd.aEo();
    Object localObject = paramJSONObject.optJSONArray("scope");
    if (localObject == null)
    {
      w.e("MicroMsg.GameJsApiAuthorize", "scope is null!");
      paramd.v(paramInt, a.d("authorize:fail", null));
      GMTrace.o(17044577714176L, 126992);
      return;
    }
    paramJSONObject = paramd.aEs();
    if (bg.nm(paramJSONObject))
    {
      w.e("MicroMsg.GameJsApiAuthorize", "appId is null!");
      paramd.v(paramInt, a.d("authorize:fail", null));
      GMTrace.o(17044577714176L, 126992);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < ((JSONArray)localObject).length())
    {
      localLinkedList.add(((JSONArray)localObject).optString(i));
      i += 1;
    }
    localObject = new com.tencent.mm.ad.b.a();
    ajm localajm = new ajm();
    ((com.tencent.mm.ad.b.a)localObject).gtF = localajm;
    ((com.tencent.mm.ad.b.a)localObject).gtG = new ajn();
    ((com.tencent.mm.ad.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-authorize";
    ((com.tencent.mm.ad.b.a)localObject).gtE = 1157;
    ((com.tencent.mm.ad.b.a)localObject).gtH = 0;
    ((com.tencent.mm.ad.b.a)localObject).gtI = 0;
    localajm.lQa = paramJSONObject;
    localajm.uyr = localLinkedList;
    localajm.uyt = 0;
    paramd = new a.a(paramd, paramInt);
    com.tencent.mm.ipcinvoker.wx_extension.b.a(((com.tencent.mm.ad.b.a)localObject).DA(), new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb)
      {
        GMTrace.i(17052630777856L, 127052);
        w.i("MicroMsg.GameJsApiAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          paramd.qp(com.tencent.mm.plugin.game.gamewebview.a.d.zl("authorize:fail"));
          GMTrace.o(17052630777856L, 127052);
          return;
        }
        paramAnonymousString = (ajn)paramAnonymousb.gtD.gtK;
        if ((paramAnonymousString == null) || (paramAnonymousString.uyv == null))
        {
          paramAnonymousString = paramd;
          paramAnonymousb = d.this;
          paramAnonymousString.qp(a.d("authorize:fail", null));
          GMTrace.o(17052630777856L, 127052);
          return;
        }
        paramAnonymousInt1 = paramAnonymousString.uyv.eGy;
        paramAnonymousb = paramAnonymousString.uyv.eGz;
        w.i("MicroMsg.GameJsApiAuthorize", "jsErrcode = %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
        if (paramAnonymousInt1 == 53536)
        {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(17835657003008L, 132886);
              Object localObject1 = new h(d.1.this.val$context);
              Object localObject2 = new h.a()
              {
                public final void c(int paramAnonymous3Int, Bundle paramAnonymous3Bundle)
                {
                  GMTrace.i(17835388567552L, 132884);
                  w.i("MicroMsg.GameJsApiAuthorize", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramAnonymous3Int) });
                  switch (paramAnonymous3Int)
                  {
                  default: 
                    w.d("MicroMsg.GameJsApiAuthorize", "press back button!");
                    paramAnonymous3Bundle = d.1.this.lGU;
                    locald = d.this;
                    paramAnonymous3Bundle.qp(a.d("authorize:fail_auth_cancel", null));
                  }
                  do
                  {
                    GMTrace.o(17835388567552L, 132884);
                    return;
                    locald = d.this;
                    String str = d.1.this.eud;
                    a.a locala = d.1.this.lGU;
                    Object localObject = (ArrayList)paramAnonymous3Bundle.getSerializable("key_scope");
                    paramAnonymous3Bundle = new LinkedList();
                    localObject = ((ArrayList)localObject).iterator();
                    while (((Iterator)localObject).hasNext()) {
                      paramAnonymous3Bundle.add((String)((Iterator)localObject).next());
                    }
                    localObject = new com.tencent.mm.ad.b.a();
                    ajk localajk = new ajk();
                    ((com.tencent.mm.ad.b.a)localObject).gtF = localajk;
                    ((com.tencent.mm.ad.b.a)localObject).gtG = new ajl();
                    ((com.tencent.mm.ad.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-authorize-confirm";
                    ((com.tencent.mm.ad.b.a)localObject).gtE = 1158;
                    ((com.tencent.mm.ad.b.a)localObject).gtH = 0;
                    ((com.tencent.mm.ad.b.a)localObject).gtI = 0;
                    localajk.lQa = str;
                    localajk.uyr = paramAnonymous3Bundle;
                    localajk.uyt = 0;
                    localajk.uys = paramAnonymous3Int;
                    com.tencent.mm.ipcinvoker.wx_extension.b.a(((com.tencent.mm.ad.b.a)localObject).DA(), new d.2(locald, locala, paramAnonymous3Int));
                  } while (paramAnonymous3Int != 2);
                  paramAnonymous3Bundle = d.1.this.lGU;
                  d locald = d.this;
                  paramAnonymous3Bundle.qp(a.d("authorize:fail_auth_deny", null));
                  GMTrace.o(17835388567552L, 132884);
                }
              };
              if ((this.ibw != null) && (this.ibw.size() > 0))
              {
                if (!((h)localObject1).a(this.ibw, this.lGW, this.lGX, (h.a)localObject2))
                {
                  localObject1 = d.1.this.lGU;
                  localObject2 = d.this;
                  ((a.a)localObject1).qp(a.d("authorize:fail", null));
                }
                GMTrace.o(17835657003008L, 132886);
                return;
              }
              w.e("MicroMsg.GameJsApiAuthorize", "scopeInfoList is empty!");
              localObject1 = d.1.this.lGU;
              localObject2 = d.this;
              ((a.a)localObject1).qp(a.d("authorize:fail", null));
              GMTrace.o(17835657003008L, 132886);
            }
          });
          GMTrace.o(17052630777856L, 127052);
          return;
        }
        if (paramAnonymousInt1 == 0)
        {
          paramAnonymousString = paramd;
          paramAnonymousb = d.this;
          paramAnonymousString.qp(a.d("authorize:ok", null));
          GMTrace.o(17052630777856L, 127052);
          return;
        }
        w.e("MicroMsg.GameJsApiAuthorize", "ERROR = %s", new Object[] { paramAnonymousb });
        paramAnonymousString = paramd;
        paramAnonymousb = d.this;
        paramAnonymousString.qp(a.d("authorize:fail", null));
        GMTrace.o(17052630777856L, 127052);
      }
    });
    GMTrace.o(17044577714176L, 126992);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */