package com.tencent.mm.plugin.appbrand.jsapi.d;

import android.support.v4.view.z;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.ad;
import com.tencent.mm.plugin.appbrand.widget.input.b.a;
import com.tencent.mm.plugin.appbrand.widget.input.b.a.a;
import com.tencent.mm.plugin.appbrand.widget.input.b.a.b;
import com.tencent.mm.plugin.appbrand.widget.input.g;
import com.tencent.mm.plugin.appbrand.widget.input.g.10;
import com.tencent.mm.plugin.appbrand.widget.input.g.11;
import com.tencent.mm.plugin.appbrand.widget.input.g.12;
import com.tencent.mm.plugin.appbrand.widget.input.g.13;
import com.tencent.mm.plugin.appbrand.widget.input.g.4;
import com.tencent.mm.plugin.appbrand.widget.input.g.5;
import com.tencent.mm.plugin.appbrand.widget.input.g.6;
import com.tencent.mm.plugin.appbrand.widget.input.h;
import com.tencent.mm.plugin.appbrand.widget.input.h.1;
import com.tencent.mm.plugin.appbrand.widget.input.h.2;
import com.tencent.mm.plugin.appbrand.widget.input.h.a;
import com.tencent.mm.plugin.appbrand.widget.input.i;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.plugin.appbrand.widget.input.o;
import com.tencent.mm.plugin.appbrand.widget.input.r;
import com.tencent.mm.plugin.appbrand.widget.input.v;
import com.tencent.mm.plugin.appbrand.widget.input.y;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e
  extends a<com.tencent.mm.plugin.appbrand.widget.input.b.e>
{
  static final int CTRL_INDEX = 1;
  static final String NAME = "showKeyboard";
  
  public e()
  {
    GMTrace.i(10369527447552L, 77259);
    GMTrace.o(10369527447552L, 77259);
  }
  
  protected boolean WL()
  {
    GMTrace.i(10369795883008L, 77261);
    GMTrace.o(10369795883008L, 77261);
    return true;
  }
  
  protected boolean WM()
  {
    GMTrace.i(15479464787968L, 115331);
    GMTrace.o(15479464787968L, 115331);
    return true;
  }
  
  protected boolean WN()
  {
    GMTrace.i(10370064318464L, 77263);
    GMTrace.o(10370064318464L, 77263);
    return true;
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, final int paramInt1, final String paramString, final com.tencent.mm.plugin.appbrand.widget.input.b.e parame, final int paramInt2)
  {
    GMTrace.i(18203950448640L, 135630);
    h localh = h.a.iLT;
    com.tencent.mm.plugin.appbrand.widget.input.b localb = b.a.a(parame.iQf, paramAppBrandPageView);
    if (localb == null) {
      localObject1 = null;
    }
    while (!bg.nm((String)localObject1))
    {
      paramString = new HashMap(1);
      paramString.put("inputId", localObject1);
      paramAppBrandPageView.v(paramInt2, d("ok", paramString));
      GMTrace.o(18203950448640L, 135630);
      return;
      if (parame.iQk != null) {
        localb.sP(parame.iQk);
      }
      localb.a(parame);
      Object localObject2;
      label150:
      int j;
      int k;
      int m;
      boolean bool;
      if (parame.iQj != null)
      {
        localObject1 = parame.iQj;
        localObject2 = (AppBrandPageView)localb.iKW.get();
        if ((localObject2 != null) && (localb.ace() != null)) {}
      }
      else
      {
        i = parame.iQl.intValue();
        j = parame.iQm.intValue();
        k = parame.iQo.intValue();
        m = parame.iQn.intValue();
        localObject1 = (AppBrandPageView)localb.iKW.get();
        if ((localObject1 != null) && (((AppBrandPageView)localObject1).ivj != null)) {
          break label245;
        }
        bool = false;
      }
      label245:
      Object localObject3;
      for (;;)
      {
        if (bool) {
          break label333;
        }
        localObject1 = null;
        break;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.d.a((AppBrandPageView)localObject2, localb.ace(), (a.a)localObject1);
        break label150;
        localObject2 = localb.ace();
        if (localObject2 == null)
        {
          bool = false;
        }
        else
        {
          localObject3 = ((AppBrandPageView)localObject1).ivi;
          if (localObject3 == null)
          {
            bool = false;
          }
          else
          {
            bool = ((com.tencent.mm.plugin.appbrand.widget.input.e)localObject3).a(((AppBrandPageView)localObject1).ivj, (View)localObject2, i, j, k, m);
            if (bool)
            {
              ((y)localObject2).a(localb.iKX);
              ((EditText)localObject2).addTextChangedListener(localb);
            }
          }
        }
      }
      label333:
      if (!localb.jW(-2))
      {
        localObject1 = null;
      }
      else
      {
        localObject1 = new WeakReference(paramAppBrandPageView);
        localObject2 = localb.acd();
        localb.iKU = new h.2(localh, (WeakReference)localObject1, (String)localObject2, paramString);
        localObject1 = localObject2;
        if (paramAppBrandPageView != null)
        {
          localObject1 = localObject2;
          if (localb != null)
          {
            localObject3 = localb.acd();
            localObject1 = localObject2;
            if (!bg.nm((String)localObject3))
            {
              paramAppBrandPageView.a(new h.1(localh, (String)localObject3));
              localh.iLO.put(localObject3, localb);
              localObject1 = localObject2;
            }
          }
        }
      }
    }
    final Object localObject1 = paramAppBrandPageView.hyD;
    final int i = paramAppBrandPageView.hashCode();
    paramAppBrandPageView = new WeakReference(paramAppBrandPageView);
    parame.iKW = paramAppBrandPageView;
    paramString = new g()
    {
      private void WQ()
      {
        GMTrace.i(10364024520704L, 77218);
        AppBrandPageView localAppBrandPageView = (AppBrandPageView)paramAppBrandPageView.get();
        if ((localAppBrandPageView == null) || (localAppBrandPageView.ivj == null))
        {
          GMTrace.o(10364024520704L, 77218);
          return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.f.acq().p(localAppBrandPageView.ivj);
        GMTrace.o(10364024520704L, 77218);
      }
      
      public final void WO()
      {
        GMTrace.i(10363756085248L, 77216);
        if (paramAppBrandPageView.get() != null)
        {
          Object localObject = new HashMap(1);
          ((Map)localObject).put("inputId", this.iLx);
          ((AppBrandPageView)paramAppBrandPageView.get()).v(paramInt2, e.this.d("ok", (Map)localObject));
          e.aZ(this.iLx, paramString);
          localObject = this.iLx;
          AppBrandPageView localAppBrandPageView = (AppBrandPageView)paramAppBrandPageView.get();
          if (localAppBrandPageView == null)
          {
            GMTrace.o(10363756085248L, 77216);
            return;
          }
          u.Av().p("AppBrandJsInput@" + (String)localObject, true).o("webview_reference", new WeakReference(localAppBrandPageView));
        }
        GMTrace.o(10363756085248L, 77216);
      }
      
      public final void WP()
      {
        GMTrace.i(10363890302976L, 77217);
        com.tencent.mm.plugin.appbrand.o.d.aS(this);
        if (paramAppBrandPageView.get() != null)
        {
          ((AppBrandPageView)paramAppBrandPageView.get()).v(paramInt2, e.this.d("fail", null));
          WQ();
        }
        GMTrace.o(10363890302976L, 77217);
      }
      
      public final void b(String paramAnonymousString, int paramAnonymousInt, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(18204218884096L, 135632);
        if (e.this.WN()) {
          com.tencent.mm.plugin.appbrand.o.d.aS(this);
        }
        if (paramAppBrandPageView.get() != null) {}
        try
        {
          paramAnonymousString = com.tencent.mm.plugin.appbrand.o.d.sz(paramAnonymousString);
          paramAnonymousString = new JSONObject().put("value", paramAnonymousString).put("inputId", this.iLx).put("cursor", paramAnonymousInt).toString();
          if (paramAnonymousBoolean1) {
            ((AppBrandPageView)paramAppBrandPageView.get()).h("onKeyboardConfirm", paramAnonymousString, 0);
          }
          if (!paramAnonymousBoolean2) {
            ((AppBrandPageView)paramAppBrandPageView.get()).h("onKeyboardComplete", paramAnonymousString, 0);
          }
        }
        catch (JSONException paramAnonymousString)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.JsApiShowKeyboard", "dispatch input done, exp = %s", new Object[] { bg.f(paramAnonymousString) });
          }
        }
        if (!paramAnonymousBoolean2) {
          WQ();
        }
        GMTrace.o(18204218884096L, 135632);
      }
    };
    localObject1 = new com.tencent.mm.plugin.appbrand.widget.input.a.c()
    {
      public final void ak(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(18203816230912L, 135629);
        String str = paramString.iLx;
        if (bg.nm(str))
        {
          GMTrace.o(18203816230912L, 135629);
          return;
        }
        e.b localb = new e.b();
        HashMap localHashMap = new HashMap();
        localHashMap.put("value", com.tencent.mm.plugin.appbrand.o.d.sz(paramAnonymousString));
        localHashMap.put("data", u.Av().p("AppBrandJsInput@" + str, true).getString("passing_data", ""));
        localHashMap.put("cursor", Integer.valueOf(paramAnonymousInt));
        localHashMap.put("inputId", str);
        localb.ai(localObject1, i).r(localHashMap).VR();
        GMTrace.o(18203816230912L, 135629);
      }
    };
    paramString.iLC.iPl = ((com.tencent.mm.plugin.appbrand.widget.input.a.c)localObject1);
    a(paramString);
    com.tencent.mm.plugin.appbrand.o.d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10366037786624L, 77233);
        Object localObject1 = (AppBrandPageView)paramAppBrandPageView.get();
        if ((localObject1 == null) || (((AppBrandPageView)localObject1).ivj == null))
        {
          GMTrace.o(10366037786624L, 77233);
          return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.f.acq().o(((AppBrandPageView)localObject1).ivj);
        g localg = paramString;
        localObject1 = parame;
        int j = paramInt1;
        com.tencent.mm.plugin.appbrand.o.d.aR(localg);
        localg.iLw = ((com.tencent.mm.plugin.appbrand.widget.input.b.e)localObject1);
        localg.ieZ = localg.iLw.iKW;
        if (localg.ieZ == null) {}
        for (localObject1 = null; (localObject1 == null) || (((AppBrandPageView)localObject1).ivj == null); localObject1 = (AppBrandPageView)localg.ieZ.get())
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandInputInvokeHandler", "insertInputImpl, view not ready, return fail");
          localg.WP();
          GMTrace.o(10366037786624L, 77233);
          return;
        }
        Object localObject2;
        int k;
        int m;
        int n;
        if (ad.d(localg.iLw.iQE))
        {
          localObject2 = new o(((AppBrandPageView)localObject1).mContext);
          localg.iLy = ((com.tencent.mm.plugin.appbrand.widget.input.w)localObject2);
          localg.cL(true);
          localg.iLy.addTextChangedListener(new g.10(localg));
          localg.iLy.iNv = new g.11(localg);
          localObject2 = localg.iLy;
          i = localg.iLw.iQl.intValue();
          k = localg.iLw.iQm.intValue();
          m = localg.iLw.iQo.intValue();
          n = localg.iLw.iQn.intValue();
          if ((localObject2 != null) && (localg.ieZ != null) && (localg.ieZ.get() != null)) {
            break label357;
          }
          i = 0;
        }
        for (;;)
        {
          if (i != 0) {
            break label418;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandInputInvokeHandler", "add custom view into webView failed");
          localg.WP();
          GMTrace.o(10366037786624L, 77233);
          return;
          localObject2 = new r(((AppBrandPageView)localObject1).mContext);
          break;
          label357:
          com.tencent.mm.plugin.appbrand.widget.input.e locale = ((AppBrandPageView)localg.ieZ.get()).ivi;
          if ((locale != null) && (locale.a(((AppBrandPageView)localg.ieZ.get()).ivj, (View)localObject2, i, k, m, n))) {
            i = 1;
          } else {
            i = 0;
          }
        }
        label418:
        if ((localg.iLw.iQj != null) && (!bg.cc(localg.iLw.iQj.iPU))) {
          com.tencent.mm.plugin.appbrand.widget.input.autofill.d.a((AppBrandPageView)localObject1, localg.iLy, localg.iLw.iQj);
        }
        if (!ad.d(localg.iLw.iQE)) {
          if (j >= 0) {
            break label1021;
          }
        }
        label765:
        label828:
        label948:
        label961:
        label982:
        label1021:
        for (int i = localg.iLy.getText().length();; i = j)
        {
          localg.iLy.setSelection(i);
          if (ad.d(localg.iLw.iQE)) {
            localg.iLy.post(new g.12(localg));
          }
          if (("text".equalsIgnoreCase(localg.iLw.iQf)) || ("emoji".equalsIgnoreCase(localg.iLw.iQf)))
          {
            localObject2 = (AppBrandPageView)localg.ieZ.get();
            if (z.al(((AppBrandPageView)localObject2).iuf))
            {
              localg.iLz = v.bX(((AppBrandPageView)localObject2).iuf);
              localg.acv();
              localg.acz();
              localg.iLy.a(localg.iLs);
              localg.iLy.setOnKeyListener(new g.4(localg));
              m.a((AppBrandPageView)localg.ieZ.get(), localg.iLy);
              localObject2 = localg.iLz;
              if (!localg.iLw.iQg) {
                "emoji".equals(localg.iLw.iQf);
              }
              ((v)localObject2).acX();
              if (localg.iLw.iQE.booleanValue()) {
                break label961;
              }
              if (localg.iLw.iQJ != null) {
                break label948;
              }
              localObject2 = com.tencent.mm.plugin.appbrand.widget.input.b.b.adC();
              i = ((com.tencent.mm.plugin.appbrand.widget.input.b.b)localObject2).iQa;
              localg.iLy.setImeOptions(i);
              localg.iLy.setOnEditorActionListener(new g.5(localg, i));
              localg.iLz.cS(localg.iLw.iQF.booleanValue());
              localg.iLz.iNj = localg.iLy;
              if (localg.iLw.iQE.booleanValue()) {
                break label982;
              }
              localg.iLy.requestFocus();
              localg.iLz.show();
              if (!localg.iLw.iQE.booleanValue()) {
                i.a(localg.ieZ).acC();
              }
              ((AppBrandPageView)localg.ieZ.get()).a(new g.6(localg));
            }
          }
          for (;;)
          {
            localg.iLx = String.valueOf(com.tencent.mm.plugin.appbrand.jsapi.base.f.a((AppBrandPageView)localObject1, localg.iLy));
            localg.iLy.sU(localg.iLx);
            localg.iLy.setOnClickListener(new g.13(localg));
            m.a(localg.iLx, localg);
            localg.WO();
            GMTrace.o(10366037786624L, 77233);
            return;
            localObject2 = localg.iLw.iQJ;
            break;
            localg.iLy.setOnEditorActionListener(null);
            localg.iLy.setImeOptions(0);
            break label765;
            localg.iLy.setFocusable(false);
            localg.iLy.setFocusableInTouchMode(false);
            localg.iLz.hide();
            break label828;
            Assert.assertTrue("Number type implementation removed from here", false);
          }
        }
      }
    });
    GMTrace.o(18203950448640L, 135630);
  }
  
  public void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10369661665280L, 77260);
    final Object localObject = paramJSONObject.optString("inputId", "");
    final int i = paramJSONObject.optInt("cursor", -2);
    if ((WL()) && (!bg.nm((String)localObject)))
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10365232480256L, 77227);
          if (m.a(paramAppBrandPageView, localObject, i))
          {
            paramAppBrandPageView.v(paramInt, e.this.d("ok", null));
            GMTrace.o(10365232480256L, 77227);
            return;
          }
          paramAppBrandPageView.v(paramInt, e.this.d("fail:invalid data", null));
          GMTrace.o(10365232480256L, 77227);
        }
      });
      GMTrace.o(10369661665280L, 77260);
      return;
    }
    localObject = new com.tencent.mm.plugin.appbrand.widget.input.b.e();
    if (!a((com.tencent.mm.plugin.appbrand.widget.input.b.e)localObject, paramJSONObject, paramAppBrandPageView, paramInt))
    {
      GMTrace.o(10369661665280L, 77260);
      return;
    }
    com.tencent.mm.plugin.appbrand.o.d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10367648399360L, 77245);
        e.this.a(paramAppBrandPageView, i, this.ieN, localObject, paramInt);
        GMTrace.o(10367648399360L, 77245);
      }
    });
    GMTrace.o(10369661665280L, 77260);
  }
  
  protected void a(g paramg)
  {
    GMTrace.i(10369930100736L, 77262);
    GMTrace.o(10369930100736L, 77262);
  }
  
  protected boolean a(com.tencent.mm.plugin.appbrand.widget.input.b.e parame, JSONObject paramJSONObject, AppBrandPageView paramAppBrandPageView, int paramInt)
  {
    int j = 0;
    GMTrace.i(17388980404224L, 129558);
    if (!super.a(parame, paramJSONObject, paramAppBrandPageView, paramInt))
    {
      GMTrace.o(17388980404224L, 129558);
      return false;
    }
    parame.iQl = Integer.valueOf(Math.max(0, parame.iQl.intValue()));
    if (parame.iQm == null) {}
    for (int i = 0;; i = Math.max(0, parame.iQm.intValue()))
    {
      parame.iQm = Integer.valueOf(i);
      parame.iQf = paramJSONObject.optString("type", "text");
      if (m.iMr.contains(parame.iQf)) {
        break;
      }
      paramAppBrandPageView.v(paramInt, d("fail:unsupported input type", null));
      GMTrace.o(17388980404224L, 129558);
      return false;
    }
    parame.iQg = paramJSONObject.optBoolean("password");
    parame.iQS = Boolean.valueOf(paramJSONObject.optBoolean("password"));
    if (WM())
    {
      paramAppBrandPageView = paramJSONObject.optJSONObject("dropdown");
      if (paramAppBrandPageView != null)
      {
        paramJSONObject = new a.a();
        paramJSONObject.iPR = paramAppBrandPageView.optInt("marginLeft");
        paramJSONObject.iPS = paramAppBrandPageView.optInt("marginRight");
        paramJSONObject.iPT = paramAppBrandPageView.optString("width");
        paramAppBrandPageView = paramAppBrandPageView.optJSONArray("options");
        if ((paramAppBrandPageView != null) && (paramAppBrandPageView.length() > 0))
        {
          paramJSONObject.iPU = new ArrayList();
          paramInt = j;
          while (paramInt < paramAppBrandPageView.length())
          {
            Object localObject = paramAppBrandPageView.optJSONObject(paramInt);
            if (localObject != null)
            {
              String str1 = ((JSONObject)localObject).optString("id");
              String str2 = ((JSONObject)localObject).optString("title");
              localObject = ((JSONObject)localObject).optString("content");
              if ((!bg.nm(str1)) && (!bg.nm(str2)))
              {
                a.b localb = new a.b();
                localb.id = str1;
                localb.title = str2;
                localb.content = ((String)localObject);
                paramJSONObject.iPU.add(localb);
              }
            }
            paramInt += 1;
          }
          parame.iQj = paramJSONObject;
        }
      }
    }
    GMTrace.o(17388980404224L, 129558);
    return true;
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 207;
    public static final String NAME = "onKeyboardDropdownOperate";
    
    public a()
    {
      GMTrace.i(15479867441152L, 115334);
      GMTrace.o(15479867441152L, 115334);
    }
  }
  
  public static final class b
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 78;
    public static final String NAME = "onKeyboardValueChange";
    
    public b()
    {
      GMTrace.i(10367379963904L, 77243);
      GMTrace.o(10367379963904L, 77243);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */