package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.webview.ui.tools.widget.h;
import com.tencent.mm.plugin.webview.ui.tools.widget.h.a;
import com.tencent.mm.protocal.c.aiy;
import com.tencent.mm.protocal.c.ajo;
import com.tencent.mm.protocal.c.ajp;
import com.tencent.mm.protocal.c.ajq;
import com.tencent.mm.protocal.c.ajr;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class aa
  extends a
{
  public static final int CTRL_BYTE = 231;
  public static final String NAME = "login";
  
  public aa()
  {
    GMTrace.i(17064576155648L, 127141);
    GMTrace.o(17064576155648L, 127141);
  }
  
  public final void a(final d paramd, final JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17064710373376L, 127142);
    w.i("MicroMsg.GameJsApiLogin", "invoke");
    paramJSONObject = paramd.aEo();
    LinkedList localLinkedList = new LinkedList();
    final String str = paramd.aEs();
    if (bg.nm(str))
    {
      w.e("MicroMsg.GameJsApiLogin", "appId is null!");
      paramd.v(paramInt, a.d("login:fail", null));
      GMTrace.o(17064710373376L, 127142);
      return;
    }
    paramd = new a.a(paramd, paramInt);
    com.tencent.mm.ad.b.a locala = new com.tencent.mm.ad.b.a();
    ajq localajq = new ajq();
    locala.gtF = localajq;
    locala.gtG = new ajr();
    locala.uri = "/cgi-bin/mmbiz-bin/js-login";
    locala.gtE = 1029;
    locala.gtH = 0;
    locala.gtI = 0;
    localajq.lQa = str;
    localajq.uyr = localLinkedList;
    localajq.uyw = 0;
    localajq.lPM = "";
    localajq.uyx = "";
    localajq.uyt = 0;
    com.tencent.mm.ipcinvoker.wx_extension.b.a(locala.DA(), new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final String paramAnonymousString, final com.tencent.mm.ad.b paramAnonymousb)
      {
        GMTrace.i(17031558594560L, 126895);
        w.i("MicroMsg.GameJsApiLogin", "errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          paramAnonymousString = paramd;
          paramAnonymousb = aa.this;
          paramAnonymousString.qp(a.d("loginfail", null));
          GMTrace.o(17031558594560L, 126895);
          return;
        }
        paramAnonymousb = (ajr)paramAnonymousb.gtD.gtK;
        if ((paramAnonymousb == null) || (paramAnonymousb.uyv == null))
        {
          paramAnonymousString = paramd;
          paramAnonymousb = aa.this;
          paramAnonymousString.qp(a.d("loginfail", null));
          GMTrace.o(17031558594560L, 126895);
          return;
        }
        paramAnonymousInt1 = paramAnonymousb.uyv.eGy;
        final Object localObject = paramAnonymousb.uyv.eGz;
        paramAnonymousString = paramAnonymousb.uyx;
        w.i("MicroMsg.GameJsApiLogin", "NetSceneJSLogin jsErrcode %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
        if (paramAnonymousInt1 == 53536)
        {
          localObject = paramAnonymousb.uod;
          final String str = paramAnonymousb.lRT;
          paramAnonymousb = paramAnonymousb.tOY;
          w.d("MicroMsg.GameJsApiLogin", "appName %s, appIconUrl %s", new Object[] { str, paramAnonymousb });
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(17834851696640L, 132880);
              Object localObject1 = new h(aa.1.this.val$context);
              Object localObject2 = new h.a()
              {
                public final void c(int paramAnonymous3Int, Bundle paramAnonymous3Bundle)
                {
                  GMTrace.i(17835120132096L, 132882);
                  w.i("MicroMsg.GameJsApiLogin", "onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramAnonymous3Int) });
                  switch (paramAnonymous3Int)
                  {
                  default: 
                    w.i("MicroMsg.GameJsApiLogin", "press back button!");
                    paramAnonymous3Bundle = aa.1.this.lGU;
                    localaa = aa.this;
                    paramAnonymous3Bundle.qp(a.d("loginfail_auth_cancel", null));
                  }
                  do
                  {
                    GMTrace.o(17835120132096L, 132882);
                    return;
                    localaa = aa.this;
                    String str1 = aa.1.this.eud;
                    String str2 = aa.1.1.this.lHw;
                    a.a locala = aa.1.this.lGU;
                    Object localObject = (ArrayList)paramAnonymous3Bundle.getSerializable("key_scope");
                    paramAnonymous3Bundle = new LinkedList();
                    localObject = ((ArrayList)localObject).iterator();
                    while (((Iterator)localObject).hasNext()) {
                      paramAnonymous3Bundle.add((String)((Iterator)localObject).next());
                    }
                    localObject = new com.tencent.mm.ad.b.a();
                    ajo localajo = new ajo();
                    ((com.tencent.mm.ad.b.a)localObject).gtF = localajo;
                    ((com.tencent.mm.ad.b.a)localObject).gtG = new ajp();
                    ((com.tencent.mm.ad.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-login-confirm";
                    ((com.tencent.mm.ad.b.a)localObject).gtE = 1117;
                    ((com.tencent.mm.ad.b.a)localObject).gtH = 0;
                    ((com.tencent.mm.ad.b.a)localObject).gtI = 0;
                    localajo.lQa = str1;
                    localajo.uyr = paramAnonymous3Bundle;
                    localajo.uyw = 0;
                    localajo.uyx = str2;
                    localajo.uyt = 0;
                    localajo.uys = paramAnonymous3Int;
                    com.tencent.mm.ipcinvoker.wx_extension.b.a(((com.tencent.mm.ad.b.a)localObject).DA(), new aa.2(localaa, locala, paramAnonymous3Int));
                  } while (paramAnonymous3Int != 2);
                  w.e("MicroMsg.GameJsApiLogin", "fail auth deny!");
                  paramAnonymous3Bundle = aa.1.this.lGU;
                  aa localaa = aa.this;
                  paramAnonymous3Bundle.qp(a.d("loginfail_auth_deny", null));
                  GMTrace.o(17835120132096L, 132882);
                }
              };
              if ((localObject != null) && (localObject.size() > 0))
              {
                if (!((h)localObject1).a(localObject, str, paramAnonymousb, (h.a)localObject2))
                {
                  localObject1 = aa.1.this.lGU;
                  localObject2 = aa.this;
                  ((a.a)localObject1).qp(a.d("loginfail", null));
                }
                GMTrace.o(17834851696640L, 132880);
                return;
              }
              w.e("MicroMsg.GameJsApiLogin", "scopeInfoList is empty!");
              localObject1 = aa.1.this.lGU;
              localObject2 = aa.this;
              ((a.a)localObject1).qp(a.d("loginfail", null));
              GMTrace.o(17834851696640L, 132880);
            }
          });
          GMTrace.o(17031558594560L, 126895);
          return;
        }
        if (paramAnonymousInt1 == 0)
        {
          paramAnonymousString = paramAnonymousb.uyy;
          new HashMap().put("code", paramAnonymousString);
          w.d("MicroMsg.GameJsApiLogin", "resp data code [%s]", new Object[] { paramAnonymousString });
          paramAnonymousString = paramd;
          paramAnonymousb = aa.this;
          paramAnonymousString.qp(a.d("loginok", null));
          GMTrace.o(17031558594560L, 126895);
          return;
        }
        w.e("MicroMsg.GameJsApiLogin", "onSceneEnd NetSceneJSLogin %s", new Object[] { localObject });
        paramAnonymousString = paramd;
        paramAnonymousb = aa.this;
        paramAnonymousString.qp(a.d("loginfail", null));
        GMTrace.o(17031558594560L, 126895);
      }
    });
    GMTrace.o(17064710373376L, 127142);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */