package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.jsapi.base.g;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.e.a;
import com.tencent.mm.plugin.appbrand.widget.e.a.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
  extends a
{
  public static final int CTRL_INDEX = 200;
  public static final String NAME = "translateMapMarker";
  public static final LinkedList<JSONObject> igN;
  private AppBrandPageView idw;
  public a.a igO;
  b.h igP;
  double igQ;
  double igR;
  private int igS;
  public g igT;
  public a igU;
  b igv;
  
  static
  {
    GMTrace.i(15492618125312L, 115429);
    igN = new LinkedList();
    GMTrace.o(15492618125312L, 115429);
  }
  
  public m()
  {
    GMTrace.i(15491275948032L, 115419);
    this.igU = new a()
    {
      public final void WW()
      {
        GMTrace.i(15497986834432L, 115469);
        com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
        {
          /* Error */
          public final void run()
          {
            // Byte code:
            //   0: ldc2_w 36
            //   3: ldc 38
            //   5: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
            //   8: aload_0
            //   9: monitorenter
            //   10: getstatic 44	com/tencent/mm/plugin/appbrand/jsapi/map/m:igN	Ljava/util/LinkedList;
            //   13: invokevirtual 50	java/util/LinkedList:pollFirst	()Ljava/lang/Object;
            //   16: checkcast 52	org/json/JSONObject
            //   19: astore_1
            //   20: aload_1
            //   21: ifnull +33 -> 54
            //   24: ldc 54
            //   26: ldc 56
            //   28: invokestatic 62	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
            //   31: new 13	com/tencent/mm/plugin/appbrand/jsapi/map/m$1$1$1
            //   34: dup
            //   35: aload_0
            //   36: aload_1
            //   37: invokespecial 65	com/tencent/mm/plugin/appbrand/jsapi/map/m$1$1$1:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/m$1$1;Lorg/json/JSONObject;)V
            //   40: invokestatic 71	com/tencent/mm/plugin/appbrand/o/d:runOnUiThread	(Ljava/lang/Runnable;)V
            //   43: aload_0
            //   44: monitorexit
            //   45: ldc2_w 36
            //   48: ldc 38
            //   50: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
            //   53: return
            //   54: ldc 54
            //   56: ldc 73
            //   58: invokestatic 62	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
            //   61: aload_0
            //   62: getfield 19	com/tencent/mm/plugin/appbrand/jsapi/map/m$1$1:igW	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m$1;
            //   65: getfield 77	com/tencent/mm/plugin/appbrand/jsapi/map/m$1:igV	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m;
            //   68: getfield 81	com/tencent/mm/plugin/appbrand/jsapi/map/m:igT	Lcom/tencent/mm/plugin/appbrand/jsapi/base/g;
            //   71: aload_0
            //   72: getfield 19	com/tencent/mm/plugin/appbrand/jsapi/map/m$1$1:igW	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m$1;
            //   75: getfield 77	com/tencent/mm/plugin/appbrand/jsapi/map/m$1:igV	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m;
            //   78: ldc 83
            //   80: aconst_null
            //   81: invokevirtual 88	com/tencent/mm/plugin/appbrand/jsapi/d:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
            //   84: invokevirtual 94	com/tencent/mm/plugin/appbrand/jsapi/base/g:qp	(Ljava/lang/String;)V
            //   87: aload_0
            //   88: getfield 19	com/tencent/mm/plugin/appbrand/jsapi/map/m$1$1:igW	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m$1;
            //   91: getfield 77	com/tencent/mm/plugin/appbrand/jsapi/map/m$1:igV	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m;
            //   94: getfield 98	com/tencent/mm/plugin/appbrand/jsapi/map/m:igO	Lcom/tencent/mm/plugin/appbrand/widget/e/a$a;
            //   97: invokeinterface 103 1 0
            //   102: goto -59 -> 43
            //   105: astore_1
            //   106: aload_0
            //   107: monitorexit
            //   108: aload_1
            //   109: athrow
            // Local variable table:
            //   start	length	slot	name	signature
            //   0	110	0	this	1
            //   19	18	1	localJSONObject	JSONObject
            //   105	4	1	localObject	Object
            // Exception table:
            //   from	to	target	type
            //   10	20	105	finally
            //   24	43	105	finally
            //   43	45	105	finally
            //   54	102	105	finally
            //   106	108	105	finally
          }
        });
        GMTrace.o(15497986834432L, 115469);
      }
    };
    GMTrace.o(15491275948032L, 115419);
  }
  
  protected final boolean VS()
  {
    GMTrace.i(15491678601216L, 115422);
    GMTrace.o(15491678601216L, 115422);
    return true;
  }
  
  protected final boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject, a.a parama, g paramg)
  {
    GMTrace.i(20709124341760L, 154295);
    this.igO = parama;
    this.idw = paramAppBrandPageView;
    this.igS = paramInt;
    this.igT = paramg;
    parama = paramAppBrandPageView.ivh.t(paramInt, false);
    if (parama == null)
    {
      w.e("MicroMsg.JsApiTranslateMapMarker", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      paramg.qp(d("fail", null));
      GMTrace.o(20709124341760L, 154295);
      return false;
    }
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiTranslateMapMarker", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20709124341760L, 154295);
      return false;
    }
    paramAppBrandPageView = paramJSONObject.optString("markerId");
    parama = (Map)parama.get("marker", null);
    if ((parama == null) || (parama.size() < 0))
    {
      w.e("MicroMsg.JsApiTranslateMapMarker", "markerMap is empty!");
      paramg.qp(d("fail", null));
      GMTrace.o(20709124341760L, 154295);
      return false;
    }
    this.igP = ((b.h)parama.get(paramAppBrandPageView));
    if (this.igP == null)
    {
      w.e("MicroMsg.JsApiTranslateMapMarker", "get marker failed!");
      paramg.qp(d("fail", null));
      GMTrace.o(20709124341760L, 154295);
      return false;
    }
    this.igv = ((com.tencent.mm.plugin.appbrand.compat.a.c)h.h(com.tencent.mm.plugin.appbrand.compat.a.c.class)).bE(((CoverViewContainer)paramView).J(View.class));
    try
    {
      this.igQ = this.igP.Uj().Uh();
      this.igR = this.igP.Uj().Ui();
      paramAppBrandPageView = new JSONArray(paramJSONObject.optString("keyFrames"));
      w.d("MicroMsg.JsApiTranslateMapMarker", "keyFramesArray size :%d", new Object[] { Integer.valueOf(paramAppBrandPageView.length()) });
      paramInt = 0;
      while (paramInt < paramAppBrandPageView.length())
      {
        paramView = (JSONObject)paramAppBrandPageView.get(paramInt);
        igN.add(paramView);
        paramInt += 1;
      }
      this.igU.WW();
      GMTrace.o(20709124341760L, 154295);
      return true;
    }
    catch (JSONException paramAppBrandPageView)
    {
      w.e("MicroMsg.JsApiTranslateMapMarker", "parse keyFrames error, exception : %s", new Object[] { paramAppBrandPageView });
      paramg.qp(d("fail", null));
      GMTrace.o(20709124341760L, 154295);
    }
    return false;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(15491410165760L, 115420);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(15491410165760L, 115420);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiTranslateMapMarker", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(15491410165760L, 115420);
    }
    return 0;
  }
  
  public static abstract interface a
  {
    public abstract void WW();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */