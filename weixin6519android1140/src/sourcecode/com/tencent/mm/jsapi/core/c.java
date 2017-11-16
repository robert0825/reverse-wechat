package com.tencent.mm.jsapi.core;

import android.content.Context;
import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.Map;

public final class c
{
  public a fXt;
  private com.tencent.mm.jsapi.c.a fXu;
  public d fXv;
  public b fXw;
  
  public c(Context paramContext, MiniJsBridge paramMiniJsBridge, com.tencent.mm.jsapi.c.a parama, b paramb)
  {
    GMTrace.i(20023540187136L, 149187);
    this.fXt = new a(paramContext, paramMiniJsBridge);
    this.fXu = parama;
    this.fXw = paramb;
    GMTrace.o(20023540187136L, 149187);
  }
  
  public final String b(String paramString1, String paramString2, final int paramInt)
  {
    GMTrace.i(20023674404864L, 149188);
    try
    {
      Object localObject = this.fXv;
      if (bg.nm(paramString1)) {}
      for (localObject = null; localObject == null; localObject = (com.tencent.mm.jsapi.b.b)((d)localObject).fXB.get(paramString1))
      {
        paramString2 = this.fXw.ev(paramString1);
        GMTrace.o(20023674404864L, 149188);
        return paramString2;
      }
      paramString2 = this.fXw.a(this.fXt, this.fXu, (com.tencent.mm.jsapi.b.b)localObject, paramString2, new b.a()
      {
        public final void ap(Object paramAnonymousObject)
        {
          GMTrace.i(20828443901952L, 155184);
          MiniJsBridge localMiniJsBridge = c.this.fXt.fXz;
          int i = paramInt;
          if (paramAnonymousObject == null) {}
          for (paramAnonymousObject = "";; paramAnonymousObject = paramAnonymousObject.toString())
          {
            Object localObject = paramAnonymousObject;
            if (bg.nm((String)paramAnonymousObject)) {
              localObject = "{}";
            }
            localMiniJsBridge.fXF.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.invokeCallbackHandler(%d, %s)", new Object[] { Integer.valueOf(i), localObject }), null);
            GMTrace.o(20828443901952L, 155184);
            return;
          }
        }
      });
      GMTrace.o(20023674404864L, 149188);
      return paramString2;
    }
    catch (Exception paramString2)
    {
      w.e("MicroMsg.MiniJsApiCore", "Invoke JsApi error: %s, %s", new Object[] { paramString1, Log.getStackTraceString(paramString2) });
      throw paramString2;
    }
  }
  
  private static final class a
    implements a
  {
    public u.b fXA;
    MiniJsBridge fXz;
    Context mContext;
    
    a(Context paramContext, MiniJsBridge paramMiniJsBridge)
    {
      GMTrace.i(20020587397120L, 149165);
      this.mContext = paramContext;
      this.fXz = paramMiniJsBridge;
      this.fXA = new u.b();
      GMTrace.o(20020587397120L, 149165);
    }
    
    public final Context getContext()
    {
      GMTrace.i(20020721614848L, 149166);
      Context localContext = this.mContext;
      GMTrace.o(20020721614848L, 149166);
      return localContext;
    }
    
    public final u.b wr()
    {
      GMTrace.i(20020855832576L, 149167);
      u.b localb = this.fXA;
      GMTrace.o(20020855832576L, 149167);
      return localb;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\jsapi\core\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */