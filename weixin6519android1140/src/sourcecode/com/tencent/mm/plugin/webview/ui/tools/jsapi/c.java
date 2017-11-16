package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.model.l;
import com.tencent.mm.plugin.webview.model.m;
import com.tencent.mm.plugin.webview.model.o;
import com.tencent.mm.plugin.webview.stub.WebViewStubTempUI;
import com.tencent.mm.protocal.c.aiv;
import com.tencent.mm.protocal.c.aiw;
import com.tencent.mm.protocal.c.aix;
import com.tencent.mm.protocal.c.aiy;
import com.tencent.mm.protocal.c.aje;
import com.tencent.mm.protocal.c.ajf;
import com.tencent.mm.protocal.c.ajh;
import com.tencent.mm.protocal.c.aji;
import com.tencent.mm.protocal.c.ajw;
import com.tencent.mm.protocal.c.bnd;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements com.tencent.mm.ad.e
{
  private Context context;
  final HashMap<String, d> lKc;
  private com.tencent.mm.plugin.webview.stub.e rEM;
  final int rEk;
  final HashMap<String, aiv> rRH;
  final HashMap<String, String> rRI;
  
  public c(int paramInt)
  {
    GMTrace.i(12168716091392L, 90664);
    this.rRH = new HashMap();
    this.rRI = new HashMap();
    this.lKc = new HashMap();
    this.rEk = paramInt;
    GMTrace.o(12168716091392L, 90664);
  }
  
  private void a(int paramInt1, final int paramInt2, final String paramString, final l paraml)
  {
    GMTrace.i(12168984526848L, 90666);
    if (paraml == null)
    {
      w.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth scene is null");
      GMTrace.o(12168984526848L, 90666);
      return;
    }
    int j = 0;
    int i = j;
    if (paraml.bCf() != null)
    {
      i = j;
      if (paraml.bCf().uyc != null) {
        i = paraml.bCf().uyc.eGy;
      }
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth netscene error, %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt1 == 4)
      {
        paraml.rEi.a(c.a.a.rRN, paramString, null, paramInt2, i);
        GMTrace.o(12168984526848L, 90666);
        return;
      }
      paraml.rEi.a(c.a.a.rRN, null, null, paramInt2, i);
      GMTrace.o(12168984526848L, 90666);
      return;
    }
    if (bg.nm(paraml.rEj))
    {
      w.e("MicroMsg.webview.JSVerifyHelper", "scene.jsapi is null or nil.");
      paraml.rEi.a(c.a.a.rRN, null, null, paramInt2, i);
      GMTrace.o(12168984526848L, 90666);
      return;
    }
    paramString = paraml.bCf();
    if ((paramString == null) || (paramString.uyc == null))
    {
      w.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth resp is null");
      paraml.rEi.a(c.a.a.rRN, null, null, paramInt2, i);
      GMTrace.o(12168984526848L, 90666);
      return;
    }
    if (paramString.uyc.eGy != 0)
    {
      w.e("MicroMsg.webview.JSVerifyHelper", "auth jsapi_baseresponse %s, %s", new Object[] { Integer.valueOf(paramString.uyc.eGy), paramString.uyc.eGz });
      paraml.rEi.a(c.a.a.rRN, paramString.uyc.eGz, null, paramInt2, i);
      GMTrace.o(12168984526848L, 90666);
      return;
    }
    if (paraml.bCe() == null) {}
    for (paramInt1 = 0;; paramInt1 = paraml.bCe().uyb)
    {
      w.i("MicroMsg.webview.JSVerifyHelper", "signature flag : %d.", new Object[] { Integer.valueOf(paramInt1) });
      if (paramInt1 != 1) {
        break label584;
      }
      if (paramString.uyf != null) {
        break;
      }
      w.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPI scope_auth_info is null.");
      paraml.rEi.a(c.a.a.rRN, null, null, paramInt2, i);
      GMTrace.o(12168984526848L, 90666);
      return;
    }
    paramString = paramString.uyf.iterator();
    Object localObject;
    while (paramString.hasNext())
    {
      localObject = (ajw)paramString.next();
      if (((ajw)localObject).uyG == null)
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "authInfo.apiname is null.");
      }
      else
      {
        Iterator localIterator = ((ajw)localObject).uyG.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (!bg.nm(str))
          {
            aiv localaiv = new aiv();
            localaiv.uxW = str;
            localaiv.tSt = ((ajw)localObject).uyE;
            localaiv.uxX = ((ajw)localObject).uyF;
            this.rRH.put(localaiv.uxW + paraml.url, localaiv);
          }
        }
      }
    }
    label584:
    if (paramString.uyd == null)
    {
      w.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth auth_info is null");
      paraml.rEi.a(c.a.a.rRN, "nullAuthInfo", null, paramInt2, i);
      GMTrace.o(12168984526848L, 90666);
      return;
    }
    paramString = paramString.uyd.iterator();
    while (paramString.hasNext())
    {
      localObject = (aiv)paramString.next();
      if (!bg.nm(((aiv)localObject).uxW)) {
        this.rRH.put(((aiv)localObject).uxW + paraml.url, localObject);
      }
    }
    paramString = (aiv)this.rRH.get(paraml.rEj + paraml.url);
    if (paramString == null)
    {
      w.e("MicroMsg.webview.JSVerifyHelper", "The JSAPIAuthInfo is null. (jsapi : %s , url : %s)", new Object[] { paraml.rEj, paraml.url });
      paraml.rEi.a(c.a.a.rRN, null, null, paramInt2, i);
      GMTrace.o(12168984526848L, 90666);
      return;
    }
    if (paramString.tSt == 1)
    {
      paraml.rEi.a(c.a.a.rRM, null, null, paramInt2, i);
      GMTrace.o(12168984526848L, 90666);
      return;
    }
    if (this.context == null)
    {
      w.e("MicroMsg.webview.JSVerifyHelper", "JSVerify context not activity");
      a(paraml, paramInt2, paramString);
      GMTrace.o(12168984526848L, 90666);
      return;
    }
    WebViewStubTempUI.a(this.context, this.rEM, bg.nl(paramString.uxX), "", this.context.getString(R.l.dFW), this.context.getString(R.l.dFV), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12255554961408L, 91311);
        w.i("MicroMsg.webview.JSVerifyHelper", "showDlgForJSVerify click ok");
        c.this.a(paraml, paramInt2, paramString);
        GMTrace.o(12255554961408L, 91311);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12178782420992L, 90739);
        w.i("MicroMsg.webview.JSVerifyHelper", "showDlgForJSVerify click cancel");
        paraml.rEi.a(c.a.a.rRO, "cancel", null, paramInt2, paraml.bCf().uyc.eGy);
        GMTrace.o(12178782420992L, 90739);
      }
    });
    GMTrace.o(12168984526848L, 90666);
  }
  
  static String zB(String paramString)
  {
    GMTrace.i(12169252962304L, 90668);
    int i = paramString.indexOf("#");
    if (i < 0)
    {
      GMTrace.o(12169252962304L, 90668);
      return paramString;
    }
    paramString = paramString.substring(0, i);
    GMTrace.o(12169252962304L, 90668);
    return paramString;
  }
  
  public final String Ms(String paramString)
  {
    GMTrace.i(12168581873664L, 90663);
    if (paramString == null)
    {
      GMTrace.o(12168581873664L, 90663);
      return null;
    }
    String str2 = (String)this.rRI.get(paramString);
    String str1 = str2;
    if (bg.nm(str2))
    {
      String str3 = zB(paramString);
      w.i("MicroMsg.webview.JSVerifyHelper", "appid = %s, url = %s, drophash url = %s", new Object[] { str2, paramString, str3 });
      str1 = str2;
      if (!bg.nm(str3)) {
        str1 = (String)this.rRI.get(str3);
      }
    }
    GMTrace.o(12168581873664L, 90663);
    return str1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12168850309120L, 90665);
    w.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: type[%d], errType[%s], errCode[%s], errMsg[%s]", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!(paramk instanceof b))
    {
      w.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: net scene type mismatched, return");
      GMTrace.o(12168850309120L, 90665);
      return;
    }
    if (((b)paramk).bCg() != this.rEk)
    {
      w.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: this.binderId = %d, incoming binderId = %d, not equal, return", new Object[] { Integer.valueOf(this.rEk), Integer.valueOf(((b)paramk).bCg()) });
      GMTrace.o(12168850309120L, 90665);
      return;
    }
    int i = paramk.getType();
    if (i == 1093)
    {
      at.wS().b(1093, this);
      paramk = (m)paramk;
      if (paramk == null)
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "");
        GMTrace.o(12168850309120L, 90665);
        return;
      }
      if (paramk.rEi == null)
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIPreVerify, VerifyCallback is null");
        GMTrace.o(12168850309120L, 90665);
        return;
      }
      int j = 0;
      i = j;
      if (paramk.bCh() != null)
      {
        i = j;
        if (paramk.bCh().uyc != null) {
          i = paramk.bCh().uyc.eGy;
        }
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        if (paramInt1 == 4)
        {
          paramk.rEi.a(c.a.a.rRN, paramInt2 + "_" + paramString, null, paramInt2, i);
          GMTrace.o(12168850309120L, 90665);
          return;
        }
        paramk.rEi.a(c.a.a.rRN, null, null, paramInt2, i);
        GMTrace.o(12168850309120L, 90665);
        return;
      }
      ajf localajf = paramk.bCh();
      boolean bool1;
      label411:
      boolean bool3;
      if (paramk.fUa == null)
      {
        paramString = null;
        if ((localajf != null) && (!bg.nm(paramk.lHJ)) && (paramString != null) && (!bg.nm(paramString.eSd))) {
          break label522;
        }
        if (localajf != null) {
          break label510;
        }
        bool1 = true;
        bool3 = bg.nm(paramk.lHJ);
        if (paramString != null) {
          break label516;
        }
      }
      label510:
      label516:
      for (boolean bool2 = true;; bool2 = false)
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "something null %b, %b, %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool3), Boolean.valueOf(bool2) });
        paramk.rEi.a(c.a.a.rRN, null, null, paramInt2, i);
        GMTrace.o(12168850309120L, 90665);
        return;
        paramString = (aje)paramk.fUa.gtC.gtK;
        break;
        bool1 = false;
        break label411;
      }
      label522:
      if (localajf.uyc == null)
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "jsapi_baseresponse null");
        paramk.rEi.a(c.a.a.rRN, null, null, paramInt2, i);
        GMTrace.o(12168850309120L, 90665);
        return;
      }
      if (localajf.uyc.eGy != 0)
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "jsapi baseresponse errcode fail : %d, errmsg = %s", new Object[] { Integer.valueOf(localajf.uyc.eGy), localajf.uyc.eGz });
        paramk.rEi.a(c.a.a.rRN, localajf.uyc.eGz, null, paramInt2, i);
        GMTrace.o(12168850309120L, 90665);
        return;
      }
      this.rRI.put(zB(paramString.url), paramString.eSd);
      d locald = new d();
      locald.appId = paramString.eSd;
      locald.rRS = localajf.uyp;
      this.lKc.put(zB(paramString.url), locald);
      paramk.rEi.a(c.a.a.rRM, null, localajf.uyo, paramInt2, i);
      GMTrace.o(12168850309120L, 90665);
      return;
    }
    if (i == 1095)
    {
      at.wS().b(1095, this);
      a(paramInt1, paramInt2, paramString, (l)paramk);
      GMTrace.o(12168850309120L, 90665);
      return;
    }
    if (i == 1094)
    {
      at.wS().b(1094, this);
      paramk = (com.tencent.mm.plugin.webview.model.n)paramk;
      if (paramk == null)
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIRealtimeVerify scene is null");
        GMTrace.o(12168850309120L, 90665);
        return;
      }
      g.ork.a(157L, 24L, 1L, false);
      if ((paramk.bCi() == null) || (paramk.bCi().uyc == null)) {
        break label1510;
      }
    }
    label1510:
    for (i = paramk.bCi().uyc.eGy;; i = 0)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIRealtimeVerify netscene error", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        g.ork.a(157L, 25L, 1L, false);
        if (paramInt1 == 4)
        {
          paramk.rEi.a(c.a.a.rRN, paramInt2 + "_" + paramString, null, paramInt2, i);
          GMTrace.o(12168850309120L, 90665);
          return;
        }
        paramk.rEi.a(c.a.a.rRN, null, null, paramInt2, i);
        GMTrace.o(12168850309120L, 90665);
        return;
      }
      paramString = paramk.bCi();
      if ((paramString == null) || (paramString.uyc == null))
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIRealtimeVerify resp is null");
        paramk.rEi.a(c.a.a.rRN, null, null, paramInt2, i);
        GMTrace.o(12168850309120L, 90665);
        return;
      }
      if (paramString.uyc.eGy != 0)
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "realtime jsapi_baseresponse %s, %s", new Object[] { Integer.valueOf(paramString.uyc.eGy), paramString.uyc.eGz });
        paramk.rEi.a(c.a.a.rRN, paramString.uyc.eGz, null, paramInt2, i);
        GMTrace.o(12168850309120L, 90665);
        return;
      }
      paramString = paramString.uyq;
      if (paramString == null)
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "realtime not ok, vInfo is null");
        paramk.rEi.a(c.a.a.rRN, "verifyFail", null, paramInt2, i);
        GMTrace.o(12168850309120L, 90665);
        return;
      }
      if (paramString.uXe != 1)
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "realtime not ok, %s", new Object[] { Integer.valueOf(paramString.uXe) });
        paramk.rEi.a(c.a.a.rRN, "verifyFail", null, paramInt2, i);
        GMTrace.o(12168850309120L, 90665);
        return;
      }
      paramk.rEi.a(c.a.a.rRM, null, null, paramInt2, i);
      GMTrace.o(12168850309120L, 90665);
      return;
      if (i == 1096)
      {
        at.wS().b(1096, this);
        paramString = (o)paramk;
        if (paramString.fUa == null) {}
        for (paramString = null; paramString == null; paramString = (aji)paramString.fUa.gtC.gtK)
        {
          w.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, setAuthReq is null");
          GMTrace.o(12168850309120L, 90665);
          return;
        }
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          w.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, errType[%s], errCode[%s], %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString.uxW });
          GMTrace.o(12168850309120L, 90665);
          return;
        }
        if (com.tencent.mm.protocal.c.Qc(bg.nl(paramString.uxW)) == null)
        {
          w.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, errType[%s], errCode[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          GMTrace.o(12168850309120L, 90665);
          return;
        }
        paramk = ((o)paramk).rEl;
        paramk.tSt = 1;
        this.rRH.put(paramString.uxW + paramString.url, paramk);
      }
      GMTrace.o(12168850309120L, 90665);
      return;
    }
  }
  
  final void a(Context paramContext, com.tencent.mm.plugin.webview.stub.e parame)
  {
    GMTrace.i(19438216675328L, 144826);
    this.context = paramContext;
    this.rEM = parame;
    GMTrace.o(19438216675328L, 144826);
  }
  
  public final void a(l paraml, int paramInt, aiv paramaiv)
  {
    GMTrace.i(12169118744576L, 90667);
    aiw localaiw = paraml.bCe();
    Object localObject = paraml.bCf();
    if (localaiw == null)
    {
      w.e("MicroMsg.webview.JSVerifyHelper", "authReq is null");
      paraml.rEi.a(c.a.a.rRN, null, null, paramInt, paraml.bCf().uyc.eGy);
      GMTrace.o(12169118744576L, 90667);
      return;
    }
    if (localObject == null)
    {
      w.e("MicroMsg.webview.JSVerifyHelper", "authResp is null");
      paraml.rEi.a(c.a.a.rRN, null, null, paramInt, paraml.bCf().uyc.eGy);
      GMTrace.o(12169118744576L, 90667);
      return;
    }
    at.wS().a(1096, this);
    localObject = ((aix)localObject).uyf;
    if (localObject != null)
    {
      Iterator localIterator = ((LinkedList)localObject).iterator();
      ajw localajw;
      while (localIterator.hasNext())
      {
        localajw = (ajw)localIterator.next();
        if (localajw != null)
        {
          w.i("MicroMsg.webview.JSVerifyHelper", "apiname = %s, scope = %s, scope desc = %s, status = %d, now jsapi name = %s", new Object[] { localajw.uyG, localajw.scope, localajw.uyF, Integer.valueOf(localajw.uyE), localaiw.uxW });
          localajw.uyE = 1;
        }
      }
      localIterator = ((LinkedList)localObject).iterator();
      while (localIterator.hasNext())
      {
        localajw = (ajw)localIterator.next();
        if (localajw != null) {
          w.i("MicroMsg.webview.JSVerifyHelper", "apiname = %s, scope = %s, scope desc = %s, status = %d, now jsapi name = %s", new Object[] { localajw.uyG, localajw.scope, localajw.uyF, Integer.valueOf(localajw.uyE), localaiw.uxW });
        }
      }
    }
    paramaiv = new o(paramaiv, localaiw.url, localaiw.lPg, localaiw.uxW, localaiw.eDJ, localaiw.uxY, localaiw.signature, localaiw.uxZ, localaiw.uya, localaiw.uyb, (LinkedList)localObject, this.rEk);
    at.wS().a(paramaiv, 0);
    paraml.rEi.a(c.a.a.rRM, null, null, paramInt, paraml.bCf().uyc.eGy);
    GMTrace.o(12169118744576L, 90667);
  }
  
  public static abstract interface a
  {
    public abstract void a(a parama, String paramString, LinkedList<bnd> paramLinkedList, int paramInt1, int paramInt2);
    
    public static enum a
    {
      private int code;
      
      static
      {
        GMTrace.i(12163213164544L, 90623);
        rRM = new a("RET_OK", 0, 0);
        rRN = new a("RET_FAIL", 1, -1);
        rRO = new a("RET_REJECT", 2, -2);
        rRP = new a("RET_ACCESS_DENIED", 3, -3);
        rRQ = new a[] { rRM, rRN, rRO, rRP };
        GMTrace.o(12163213164544L, 90623);
      }
      
      private a(int paramInt)
      {
        GMTrace.i(12162944729088L, 90621);
        this.code = paramInt;
        GMTrace.o(12162944729088L, 90621);
      }
      
      public final int getCode()
      {
        GMTrace.i(12163078946816L, 90622);
        int i = this.code;
        GMTrace.o(12163078946816L, 90622);
        return i;
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract int bCg();
  }
  
  public static abstract class c
    implements c.a
  {
    public boolean rRR;
    
    public c()
    {
      GMTrace.i(12143483158528L, 90476);
      this.rRR = true;
      GMTrace.o(12143483158528L, 90476);
    }
    
    public boolean bFm()
    {
      GMTrace.i(12143617376256L, 90477);
      boolean bool = this.rRR;
      GMTrace.o(12143617376256L, 90477);
      return bool;
    }
    
    public final void jC(boolean paramBoolean)
    {
      GMTrace.i(12143751593984L, 90478);
      this.rRR = paramBoolean;
      GMTrace.o(12143751593984L, 90478);
    }
  }
  
  public static final class d
  {
    public String appId;
    public List<String> rRS;
    
    public d()
    {
      GMTrace.i(12141738328064L, 90463);
      GMTrace.o(12141738328064L, 90463);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\jsapi\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */