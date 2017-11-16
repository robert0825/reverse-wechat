package com.tencent.mm.plugin.webview.fts;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.az.q;
import com.tencent.mm.br.a;
import com.tencent.mm.ipcinvoker.k;
import com.tencent.mm.modelappbrand.f;
import com.tencent.mm.modelappbrand.p;
import com.tencent.mm.modelappbrand.s;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.25;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.31;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class b
{
  private static q rBz;
  public Context context;
  private MMWebView nXD;
  public HashMap<String, Object> rBr;
  private HashMap<String, Object> rBs;
  private HashMap<String, Object> rBt;
  public int rBu;
  public com.tencent.mm.modelappbrand.e rBv;
  public com.tencent.mm.plugin.webview.ui.tools.jsapi.d rBw;
  Map<String, c> rBx;
  private Map<String, b> rBy;
  
  static
  {
    GMTrace.i(20454244876288L, 152396);
    rBz = new q();
    GMTrace.o(20454244876288L, 152396);
  }
  
  public b(Context paramContext, MMWebView paramMMWebView)
  {
    GMTrace.i(19465060220928L, 145026);
    this.rBr = new HashMap();
    this.rBs = new HashMap();
    this.rBt = new HashMap();
    this.rBu = -1;
    this.rBx = new HashMap();
    this.rBy = new HashMap();
    this.context = paramContext;
    this.nXD = paramMMWebView;
    this.rBv = ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class));
    GMTrace.o(19465060220928L, 145026);
  }
  
  private void Lc(String paramString)
  {
    GMTrace.i(19465597091840L, 145030);
    if ((paramString != null) && (paramString.length() > 0))
    {
      View localView = (View)this.rBr.get(paramString);
      if (localView == null)
      {
        w.i("FTSSearchWidgetMgr", "removeWidget cacheKey %s, can not find view", new Object[] { paramString });
        GMTrace.o(19465597091840L, 145030);
        return;
      }
      w.i("FTSSearchWidgetMgr", "removing widget sessionId %s", new Object[] { localView.getTag().toString() });
      Object localObject;
      if (this.rBv != null)
      {
        localObject = (String)localView.getTag();
        this.rBv.a((String)localObject, localView);
      }
      this.rBr.remove(paramString);
      this.rBt.remove(paramString);
      localView = (View)this.rBs.get(paramString);
      if (localView != null)
      {
        localObject = (ViewGroup)this.nXD.getView();
        if ((localObject != null) && ((localObject instanceof AbsoluteLayout))) {
          ((ViewGroup)localObject).removeView(localView);
        }
        this.rBs.remove(paramString);
      }
    }
    GMTrace.o(19465597091840L, 145030);
  }
  
  public static q bBH()
  {
    GMTrace.i(20454110658560L, 152395);
    q localq = rBz;
    GMTrace.o(20454110658560L, 152395);
    return localq;
  }
  
  public final void N(Bundle paramBundle)
  {
    GMTrace.i(19465194438656L, 145027);
    paramBundle = (String)paramBundle.get("widgetId");
    paramBundle = (b)this.rBy.get(paramBundle);
    if (paramBundle != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("app_id", paramBundle.eSd);
      localBundle.putString("msg_id", paramBundle.rBK);
      localBundle.putInt("pkg_type", paramBundle.eII);
      localBundle.putInt("pkg_version", paramBundle.hKC);
      ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).CH().b(this.context, localBundle);
    }
    GMTrace.o(19465194438656L, 145027);
  }
  
  public final void O(Bundle paramBundle)
  {
    GMTrace.i(19465462874112L, 145029);
    Lc(paramBundle.getString("fts_key_widget_view_cache_key"));
    GMTrace.o(19465462874112L, 145029);
  }
  
  public final void P(Bundle paramBundle)
  {
    GMTrace.i(19465731309568L, 145031);
    final Object localObject1 = paramBundle.getString("fts_key_json_data");
    final Object localObject2 = paramBundle.getString("fts_key_widget_view_cache_key");
    w.i("FTSSearchWidgetMgr", "updating widget: widgetId %s, jsonData %s", new Object[] { localObject2, localObject1 });
    View localView;
    for (;;)
    {
      try
      {
        paramBundle = new JSONObject((String)localObject1);
        if ((localObject2 == null) || (((String)localObject2).length() <= 0)) {
          break label532;
        }
        localObject1 = (View)this.rBr.get(localObject2);
        localView = (View)this.rBs.get(localObject2);
        if (localObject1 == null) {
          break label532;
        }
        final Object localObject3 = (AbsoluteLayout.LayoutParams)((View)localObject1).getLayoutParams();
        AbsoluteLayout.LayoutParams localLayoutParams = (AbsoluteLayout.LayoutParams)localView.getLayoutParams();
        if ((paramBundle.has("width")) || (paramBundle.has("height")))
        {
          int i = ((AbsoluteLayout.LayoutParams)localObject3).height;
          int j = a.fromDPToPix(this.context, paramBundle.optInt("height"));
          int k = ((AbsoluteLayout.LayoutParams)localObject3).width;
          int m = a.fromDPToPix(this.context, paramBundle.optInt("width"));
          localObject2 = (View)this.rBt.get(localObject2);
          w.i("FTSSearchWidgetMgr", "animating  size beginH %d, endH %d, beginW %d, endW %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
          if ((i != j) || (k != m))
          {
            localObject3 = ((View)localObject1).getLayoutParams();
            final ViewGroup.LayoutParams localLayoutParams1 = ((View)localObject2).getLayoutParams();
            ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { i, j });
            localValueAnimator.setDuration(300L);
            localValueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
            localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
            {
              public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
              {
                GMTrace.i(19472710631424L, 145083);
                int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
                localObject3.height = i;
                localObject1.setLayoutParams(localObject3);
                localLayoutParams1.height = i;
                localObject2.setLayoutParams(localLayoutParams1);
                GMTrace.o(19472710631424L, 145083);
              }
            });
            localValueAnimator.start();
          }
        }
        if (paramBundle.has("offsetX")) {
          localLayoutParams.x = a.fromDPToPix(this.context, paramBundle.optInt("offsetX"));
        }
        if (paramBundle.has("offsetY")) {
          localLayoutParams.y = a.fromDPToPix(this.context, paramBundle.optInt("offsetY"));
        }
        localView.setLayoutParams(localLayoutParams);
        boolean bool = paramBundle.has("backgroundColor");
        if (bool) {}
        try
        {
          ((View)localObject1).setBackgroundColor(Color.parseColor(paramBundle.getString("backgroundColor")));
          if (!paramBundle.has("show")) {
            break label532;
          }
          if (paramBundle.has("show"))
          {
            bool = paramBundle.optBoolean("show");
            if (!bool) {
              break;
            }
            ((View)localObject1).setVisibility(0);
            localView.setVisibility(0);
            GMTrace.o(19465731309568L, 145031);
            return;
          }
        }
        catch (Exception localException)
        {
          w.e("FTSSearchWidgetMgr", bg.f(localException));
          continue;
        }
        bool = false;
      }
      catch (Exception paramBundle)
      {
        w.e("FTSSearchWidgetMgr", "the error is e");
        GMTrace.o(19465731309568L, 145031);
        return;
      }
    }
    ((View)localObject1).setVisibility(8);
    localView.setVisibility(8);
    label532:
    GMTrace.o(19465731309568L, 145031);
  }
  
  /* Error */
  public final void a(Bundle paramBundle, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 370
    //   3: ldc_w 372
    //   6: invokestatic 62	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: ldc -6
    //   12: invokevirtual 240	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   15: astore 5
    //   17: aload_1
    //   18: ldc -20
    //   20: invokevirtual 240	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   23: astore 7
    //   25: aload_0
    //   26: invokestatic 378	com/tencent/mm/plugin/appbrand/n/g:aQ	(Ljava/lang/Object;)Ljava/lang/String;
    //   29: astore 8
    //   31: ldc 126
    //   33: ldc_w 380
    //   36: iconst_3
    //   37: anewarray 4	java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aload 7
    //   44: aastore
    //   45: dup
    //   46: iconst_1
    //   47: aload 8
    //   49: aastore
    //   50: dup
    //   51: iconst_2
    //   52: aload 5
    //   54: aastore
    //   55: invokestatic 133	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: aload 5
    //   60: ifnull +11 -> 71
    //   63: aload 5
    //   65: invokevirtual 118	java/lang/String:length	()I
    //   68: ifne +21 -> 89
    //   71: ldc 126
    //   73: ldc_w 382
    //   76: invokestatic 384	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: ldc2_w 370
    //   82: ldc_w 372
    //   85: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   88: return
    //   89: aload_0
    //   90: getfield 93	com/tencent/mm/plugin/webview/fts/b:rBy	Ljava/util/Map;
    //   93: aload 7
    //   95: invokeinterface 183 2 0
    //   100: checkcast 25	com/tencent/mm/plugin/webview/fts/b$b
    //   103: astore_1
    //   104: aload_1
    //   105: ifnonnull +1213 -> 1318
    //   108: new 25	com/tencent/mm/plugin/webview/fts/b$b
    //   111: dup
    //   112: aload_0
    //   113: invokespecial 387	com/tencent/mm/plugin/webview/fts/b$b:<init>	(Lcom/tencent/mm/plugin/webview/fts/b;)V
    //   116: astore_1
    //   117: aload_0
    //   118: getfield 93	com/tencent/mm/plugin/webview/fts/b:rBy	Ljava/util/Map;
    //   121: aload 7
    //   123: aload_1
    //   124: invokeinterface 391 3 0
    //   129: pop
    //   130: new 254	org/json/JSONObject
    //   133: dup
    //   134: aload 5
    //   136: invokespecial 256	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   139: astore 9
    //   141: aload 9
    //   143: ldc_w 393
    //   146: invokevirtual 268	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   149: ifeq +1051 -> 1200
    //   152: aload 9
    //   154: ldc_w 395
    //   157: invokevirtual 268	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   160: ifeq +1040 -> 1200
    //   163: aload_0
    //   164: getfield 91	com/tencent/mm/plugin/webview/fts/b:rBx	Ljava/util/Map;
    //   167: aload 7
    //   169: invokeinterface 183 2 0
    //   174: checkcast 28	com/tencent/mm/plugin/webview/fts/b$c
    //   177: astore 6
    //   179: aload 6
    //   181: astore 5
    //   183: aload 6
    //   185: ifnonnull +27 -> 212
    //   188: new 28	com/tencent/mm/plugin/webview/fts/b$c
    //   191: dup
    //   192: aload_0
    //   193: invokespecial 396	com/tencent/mm/plugin/webview/fts/b$c:<init>	(Lcom/tencent/mm/plugin/webview/fts/b;)V
    //   196: astore 5
    //   198: aload_0
    //   199: getfield 91	com/tencent/mm/plugin/webview/fts/b:rBx	Ljava/util/Map;
    //   202: aload 7
    //   204: aload 5
    //   206: invokeinterface 391 3 0
    //   211: pop
    //   212: aload 5
    //   214: aload 9
    //   216: ldc_w 395
    //   219: invokevirtual 276	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   222: putfield 399	com/tencent/mm/plugin/webview/fts/b$c:rBL	I
    //   225: aload 5
    //   227: aload 9
    //   229: ldc_w 393
    //   232: invokevirtual 276	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   235: putfield 402	com/tencent/mm/plugin/webview/fts/b$c:rBM	I
    //   238: ldc 126
    //   240: ldc_w 404
    //   243: iconst_1
    //   244: anewarray 4	java/lang/Object
    //   247: dup
    //   248: iconst_0
    //   249: aload 5
    //   251: invokevirtual 405	com/tencent/mm/plugin/webview/fts/b$c:toString	()Ljava/lang/String;
    //   254: aastore
    //   255: invokestatic 133	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   258: aload 9
    //   260: ldc_w 407
    //   263: invokevirtual 410	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   266: astore 6
    //   268: aload 9
    //   270: ldc_w 412
    //   273: invokevirtual 410	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   276: astore 11
    //   278: aload 9
    //   280: ldc_w 414
    //   283: invokevirtual 410	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   286: astore 12
    //   288: aload 6
    //   290: invokestatic 417	com/tencent/mm/az/q:kQ	(Ljava/lang/String;)V
    //   293: aload 11
    //   295: ldc_w 419
    //   298: invokevirtual 423	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   301: ifeq +6 -> 307
    //   304: invokestatic 426	com/tencent/mm/az/q:KJ	()V
    //   307: aload 9
    //   309: ldc_w 428
    //   312: invokevirtual 410	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   315: astore 13
    //   317: aload 9
    //   319: ldc_w 430
    //   322: invokevirtual 433	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   325: istore 4
    //   327: aload 9
    //   329: ldc_w 435
    //   332: invokevirtual 268	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   335: ifne +926 -> 1261
    //   338: iconst_0
    //   339: istore_3
    //   340: getstatic 441	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   343: sipush 14452
    //   346: iconst_3
    //   347: anewarray 4	java/lang/Object
    //   350: dup
    //   351: iconst_0
    //   352: new 198	java/lang/StringBuilder
    //   355: dup
    //   356: invokespecial 199	java/lang/StringBuilder:<init>	()V
    //   359: aload 9
    //   361: ldc_w 414
    //   364: invokevirtual 410	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   367: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: ldc_w 443
    //   373: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: aload 6
    //   378: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   384: aastore
    //   385: dup
    //   386: iconst_1
    //   387: iconst_1
    //   388: invokestatic 292	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   391: aastore
    //   392: dup
    //   393: iconst_2
    //   394: invokestatic 449	java/lang/System:currentTimeMillis	()J
    //   397: invokestatic 454	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   400: aastore
    //   401: invokevirtual 457	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   404: aload_0
    //   405: getfield 107	com/tencent/mm/plugin/webview/fts/b:rBv	Lcom/tencent/mm/modelappbrand/e;
    //   408: aload_0
    //   409: getfield 95	com/tencent/mm/plugin/webview/fts/b:context	Landroid/content/Context;
    //   412: invokeinterface 461 2 0
    //   417: astore 10
    //   419: getstatic 441	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   422: sipush 14452
    //   425: iconst_3
    //   426: anewarray 4	java/lang/Object
    //   429: dup
    //   430: iconst_0
    //   431: new 198	java/lang/StringBuilder
    //   434: dup
    //   435: invokespecial 199	java/lang/StringBuilder:<init>	()V
    //   438: aload 9
    //   440: ldc_w 414
    //   443: invokevirtual 410	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   446: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: ldc_w 443
    //   452: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: aload 6
    //   457: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   463: aastore
    //   464: dup
    //   465: iconst_1
    //   466: iconst_2
    //   467: invokestatic 292	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   470: aastore
    //   471: dup
    //   472: iconst_2
    //   473: invokestatic 449	java/lang/System:currentTimeMillis	()J
    //   476: invokestatic 454	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   479: aastore
    //   480: invokevirtual 457	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   483: aload_0
    //   484: getfield 95	com/tencent/mm/plugin/webview/fts/b:context	Landroid/content/Context;
    //   487: invokestatic 467	com/tencent/mm/ui/v:fb	(Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   490: getstatic 472	com/tencent/mm/R$i:cyd	I
    //   493: aconst_null
    //   494: invokevirtual 478	android/view/LayoutInflater:inflate	(ILandroid/view/ViewGroup;)Landroid/view/View;
    //   497: checkcast 159	android/widget/AbsoluteLayout
    //   500: astore 5
    //   502: aload 5
    //   504: new 262	android/widget/AbsoluteLayout$LayoutParams
    //   507: dup
    //   508: iconst_m1
    //   509: bipush -2
    //   511: aload_0
    //   512: getfield 95	com/tencent/mm/plugin/webview/fts/b:context	Landroid/content/Context;
    //   515: aload 9
    //   517: ldc_w 323
    //   520: invokevirtual 433	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   523: invokestatic 282	com/tencent/mm/br/a:fromDPToPix	(Landroid/content/Context;I)I
    //   526: aload_0
    //   527: getfield 95	com/tencent/mm/plugin/webview/fts/b:context	Landroid/content/Context;
    //   530: aload 9
    //   532: ldc_w 328
    //   535: invokevirtual 433	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   538: invokestatic 282	com/tencent/mm/br/a:fromDPToPix	(Landroid/content/Context;I)I
    //   541: invokespecial 481	android/widget/AbsoluteLayout$LayoutParams:<init>	(IIII)V
    //   544: invokevirtual 482	android/widget/AbsoluteLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   547: new 262	android/widget/AbsoluteLayout$LayoutParams
    //   550: dup
    //   551: aload_0
    //   552: getfield 95	com/tencent/mm/plugin/webview/fts/b:context	Landroid/content/Context;
    //   555: aload 9
    //   557: ldc_w 264
    //   560: invokevirtual 433	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   563: invokestatic 282	com/tencent/mm/br/a:fromDPToPix	(Landroid/content/Context;I)I
    //   566: aload_0
    //   567: getfield 95	com/tencent/mm/plugin/webview/fts/b:context	Landroid/content/Context;
    //   570: aload 9
    //   572: ldc_w 270
    //   575: invokevirtual 433	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   578: invokestatic 282	com/tencent/mm/br/a:fromDPToPix	(Landroid/content/Context;I)I
    //   581: iconst_0
    //   582: iconst_0
    //   583: invokespecial 481	android/widget/AbsoluteLayout$LayoutParams:<init>	(IIII)V
    //   586: astore 15
    //   588: aload 10
    //   590: aload 15
    //   592: invokevirtual 335	android/view/View:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   595: aload 5
    //   597: aload 10
    //   599: invokevirtual 485	android/widget/AbsoluteLayout:addView	(Landroid/view/View;)V
    //   602: aload 5
    //   604: getstatic 490	com/tencent/mm/R$h:bKM	I
    //   607: invokevirtual 494	android/widget/AbsoluteLayout:findViewById	(I)Landroid/view/View;
    //   610: checkcast 496	android/widget/FrameLayout
    //   613: astore 14
    //   615: aload 14
    //   617: aload 15
    //   619: invokevirtual 497	android/widget/FrameLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   622: aload 5
    //   624: aload 14
    //   626: invokevirtual 498	android/widget/AbsoluteLayout:removeView	(Landroid/view/View;)V
    //   629: aload 5
    //   631: aload 14
    //   633: invokevirtual 485	android/widget/AbsoluteLayout:addView	(Landroid/view/View;)V
    //   636: aload 10
    //   638: aload 9
    //   640: ldc_w 337
    //   643: invokevirtual 338	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   646: invokestatic 343	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   649: invokevirtual 347	android/view/View:setBackgroundColor	(I)V
    //   652: aload 10
    //   654: aload 8
    //   656: invokevirtual 502	android/view/View:setTag	(Ljava/lang/Object;)V
    //   659: aload_0
    //   660: getfield 83	com/tencent/mm/plugin/webview/fts/b:rBr	Ljava/util/HashMap;
    //   663: aload 7
    //   665: aload 10
    //   667: invokevirtual 503	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   670: pop
    //   671: aload_0
    //   672: getfield 85	com/tencent/mm/plugin/webview/fts/b:rBs	Ljava/util/HashMap;
    //   675: aload 7
    //   677: aload 5
    //   679: invokevirtual 503	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   682: pop
    //   683: aload_0
    //   684: getfield 87	com/tencent/mm/plugin/webview/fts/b:rBt	Ljava/util/HashMap;
    //   687: aload 7
    //   689: aload 14
    //   691: invokevirtual 503	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   694: pop
    //   695: aload 5
    //   697: getstatic 506	com/tencent/mm/R$h:bKL	I
    //   700: invokevirtual 494	android/widget/AbsoluteLayout:findViewById	(I)Landroid/view/View;
    //   703: checkcast 508	com/tencent/mm/ui/widget/ThreeDotsLoadingView
    //   706: astore 14
    //   708: aload 5
    //   710: getstatic 511	com/tencent/mm/R$h:bsu	I
    //   713: invokevirtual 494	android/widget/AbsoluteLayout:findViewById	(I)Landroid/view/View;
    //   716: checkcast 513	android/widget/ImageView
    //   719: astore 15
    //   721: aload 9
    //   723: ldc_w 515
    //   726: invokevirtual 410	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   729: astore 17
    //   731: new 198	java/lang/StringBuilder
    //   734: dup
    //   735: invokespecial 199	java/lang/StringBuilder:<init>	()V
    //   738: aload 6
    //   740: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   743: ldc_w 517
    //   746: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   749: aload 17
    //   751: invokevirtual 520	java/lang/String:hashCode	()I
    //   754: invokevirtual 523	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   757: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   760: astore 18
    //   762: new 177	android/os/Bundle
    //   765: dup
    //   766: invokespecial 184	android/os/Bundle:<init>	()V
    //   769: astore 16
    //   771: aload 16
    //   773: ldc -70
    //   775: aload 6
    //   777: invokevirtual 194	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   780: aload 16
    //   782: ldc -60
    //   784: aload 18
    //   786: invokevirtual 194	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   789: aload 16
    //   791: ldc_w 525
    //   794: aload 12
    //   796: invokevirtual 194	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   799: aload 16
    //   801: ldc_w 527
    //   804: aload 17
    //   806: invokevirtual 194	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   809: aload 16
    //   811: ldc_w 529
    //   814: aload 13
    //   816: invokevirtual 194	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   819: aload 16
    //   821: ldc_w 531
    //   824: aload 11
    //   826: invokevirtual 194	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   829: aload 16
    //   831: ldc -38
    //   833: iload 4
    //   835: invokevirtual 216	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   838: aload 16
    //   840: ldc_w 533
    //   843: iload_3
    //   844: invokevirtual 216	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   847: aload 16
    //   849: ldc_w 535
    //   852: aload 9
    //   854: ldc_w 537
    //   857: invokevirtual 410	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   860: invokevirtual 194	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   863: aload 16
    //   865: ldc_w 539
    //   868: iconst_1
    //   869: invokevirtual 216	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   872: aload 16
    //   874: ldc_w 541
    //   877: iload_2
    //   878: invokestatic 547	com/tencent/mm/az/e:gO	(I)I
    //   881: invokevirtual 216	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   884: aload 16
    //   886: ldc_w 549
    //   889: aload_0
    //   890: getfield 95	com/tencent/mm/plugin/webview/fts/b:context	Landroid/content/Context;
    //   893: aload 9
    //   895: ldc_w 264
    //   898: invokevirtual 433	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   901: invokestatic 282	com/tencent/mm/br/a:fromDPToPix	(Landroid/content/Context;I)I
    //   904: invokevirtual 216	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   907: aload 16
    //   909: ldc_w 551
    //   912: aload_0
    //   913: getfield 95	com/tencent/mm/plugin/webview/fts/b:context	Landroid/content/Context;
    //   916: aload 9
    //   918: ldc_w 270
    //   921: invokevirtual 433	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   924: invokestatic 282	com/tencent/mm/br/a:fromDPToPix	(Landroid/content/Context;I)I
    //   927: invokevirtual 216	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   930: aload 16
    //   932: ldc_w 553
    //   935: aload 9
    //   937: ldc_w 515
    //   940: invokevirtual 410	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   943: invokevirtual 194	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   946: aload 14
    //   948: iconst_0
    //   949: invokevirtual 554	com/tencent/mm/ui/widget/ThreeDotsLoadingView:setVisibility	(I)V
    //   952: aload 15
    //   954: iconst_4
    //   955: invokevirtual 555	android/widget/ImageView:setVisibility	(I)V
    //   958: aload 14
    //   960: invokevirtual 558	com/tencent/mm/ui/widget/ThreeDotsLoadingView:cju	()V
    //   963: aload_1
    //   964: aload 6
    //   966: putfield 190	com/tencent/mm/plugin/webview/fts/b$b:eSd	Ljava/lang/String;
    //   969: aload_1
    //   970: iload_3
    //   971: putfield 212	com/tencent/mm/plugin/webview/fts/b$b:eII	I
    //   974: aload_1
    //   975: iload 4
    //   977: putfield 221	com/tencent/mm/plugin/webview/fts/b$b:hKC	I
    //   980: aload_1
    //   981: aload 18
    //   983: putfield 202	com/tencent/mm/plugin/webview/fts/b$b:rBK	Ljava/lang/String;
    //   986: ldc 126
    //   988: ldc_w 560
    //   991: iconst_1
    //   992: anewarray 4	java/lang/Object
    //   995: dup
    //   996: iconst_0
    //   997: aload_1
    //   998: invokevirtual 561	com/tencent/mm/plugin/webview/fts/b$b:toString	()Ljava/lang/String;
    //   1001: aastore
    //   1002: invokestatic 133	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1005: new 563	com/tencent/mm/modelappbrand/r
    //   1008: dup
    //   1009: new 6	com/tencent/mm/plugin/webview/fts/b$1
    //   1012: dup
    //   1013: aload_0
    //   1014: aload 8
    //   1016: aload 14
    //   1018: aload 15
    //   1020: aload 6
    //   1022: invokespecial 566	com/tencent/mm/plugin/webview/fts/b$1:<init>	(Lcom/tencent/mm/plugin/webview/fts/b;Ljava/lang/String;Lcom/tencent/mm/ui/widget/ThreeDotsLoadingView;Landroid/widget/ImageView;Ljava/lang/String;)V
    //   1025: invokespecial 569	com/tencent/mm/modelappbrand/r:<init>	(Lcom/tencent/mm/modelappbrand/f;)V
    //   1028: astore_1
    //   1029: aload_1
    //   1030: new 8	com/tencent/mm/plugin/webview/fts/b$2
    //   1033: dup
    //   1034: aload_0
    //   1035: aload 7
    //   1037: invokespecial 572	com/tencent/mm/plugin/webview/fts/b$2:<init>	(Lcom/tencent/mm/plugin/webview/fts/b;Ljava/lang/String;)V
    //   1040: invokevirtual 575	com/tencent/mm/modelappbrand/r:a	(Lcom/tencent/mm/modelappbrand/i;)V
    //   1043: aload_1
    //   1044: new 10	com/tencent/mm/plugin/webview/fts/b$3
    //   1047: dup
    //   1048: aload_0
    //   1049: aload 7
    //   1051: invokespecial 576	com/tencent/mm/plugin/webview/fts/b$3:<init>	(Lcom/tencent/mm/plugin/webview/fts/b;Ljava/lang/String;)V
    //   1054: invokevirtual 575	com/tencent/mm/modelappbrand/r:a	(Lcom/tencent/mm/modelappbrand/i;)V
    //   1057: aload_1
    //   1058: new 12	com/tencent/mm/plugin/webview/fts/b$4
    //   1061: dup
    //   1062: aload_0
    //   1063: aload 7
    //   1065: invokespecial 577	com/tencent/mm/plugin/webview/fts/b$4:<init>	(Lcom/tencent/mm/plugin/webview/fts/b;Ljava/lang/String;)V
    //   1068: invokevirtual 575	com/tencent/mm/modelappbrand/r:a	(Lcom/tencent/mm/modelappbrand/i;)V
    //   1071: aload_1
    //   1072: new 14	com/tencent/mm/plugin/webview/fts/b$5
    //   1075: dup
    //   1076: aload_0
    //   1077: invokespecial 578	com/tencent/mm/plugin/webview/fts/b$5:<init>	(Lcom/tencent/mm/plugin/webview/fts/b;)V
    //   1080: invokevirtual 575	com/tencent/mm/modelappbrand/r:a	(Lcom/tencent/mm/modelappbrand/i;)V
    //   1083: aload_0
    //   1084: getfield 107	com/tencent/mm/plugin/webview/fts/b:rBv	Lcom/tencent/mm/modelappbrand/e;
    //   1087: aload 8
    //   1089: aload 10
    //   1091: aload 16
    //   1093: aload_1
    //   1094: invokeinterface 581 5 0
    //   1099: pop
    //   1100: new 16	com/tencent/mm/plugin/webview/fts/b$6
    //   1103: dup
    //   1104: aload_0
    //   1105: aload 6
    //   1107: aload 14
    //   1109: aload 15
    //   1111: aload 8
    //   1113: aload 10
    //   1115: aload 5
    //   1117: aload 9
    //   1119: invokespecial 584	com/tencent/mm/plugin/webview/fts/b$6:<init>	(Lcom/tencent/mm/plugin/webview/fts/b;Ljava/lang/String;Lcom/tencent/mm/ui/widget/ThreeDotsLoadingView;Landroid/widget/ImageView;Ljava/lang/String;Landroid/view/View;Landroid/widget/AbsoluteLayout;Lorg/json/JSONObject;)V
    //   1122: invokestatic 590	com/tencent/mm/bv/a:post	(Ljava/lang/Runnable;)Z
    //   1125: pop
    //   1126: aload_0
    //   1127: getfield 97	com/tencent/mm/plugin/webview/fts/b:nXD	Lcom/tencent/mm/ui/widget/MMWebView;
    //   1130: invokevirtual 155	com/tencent/mm/ui/widget/MMWebView:getView	()Landroid/view/View;
    //   1133: checkcast 157	android/view/ViewGroup
    //   1136: astore_1
    //   1137: aload_1
    //   1138: ifnull +148 -> 1286
    //   1141: aload_1
    //   1142: instanceof 159
    //   1145: ifeq +141 -> 1286
    //   1148: aload_1
    //   1149: aload 5
    //   1151: invokevirtual 591	android/view/ViewGroup:addView	(Landroid/view/View;)V
    //   1154: ldc2_w 370
    //   1157: ldc_w 372
    //   1160: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1163: return
    //   1164: astore_1
    //   1165: ldc 126
    //   1167: new 198	java/lang/StringBuilder
    //   1170: dup
    //   1171: ldc_w 593
    //   1174: invokespecial 594	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1177: aload_1
    //   1178: invokevirtual 595	java/lang/Exception:toString	()Ljava/lang/String;
    //   1181: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1184: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1187: invokestatic 364	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1190: ldc2_w 370
    //   1193: ldc_w 372
    //   1196: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1199: return
    //   1200: aload_0
    //   1201: getfield 91	com/tencent/mm/plugin/webview/fts/b:rBx	Ljava/util/Map;
    //   1204: aload 7
    //   1206: invokeinterface 596 2 0
    //   1211: checkcast 28	com/tencent/mm/plugin/webview/fts/b$c
    //   1214: astore 5
    //   1216: ldc 126
    //   1218: new 198	java/lang/StringBuilder
    //   1221: dup
    //   1222: ldc_w 598
    //   1225: invokespecial 594	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1228: aload 5
    //   1230: invokevirtual 601	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1233: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1236: invokestatic 384	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1239: goto -981 -> 258
    //   1242: astore_1
    //   1243: ldc 126
    //   1245: ldc_w 603
    //   1248: invokestatic 364	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1251: ldc2_w 370
    //   1254: ldc_w 372
    //   1257: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1260: return
    //   1261: aload 9
    //   1263: ldc_w 435
    //   1266: invokevirtual 276	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   1269: istore_3
    //   1270: goto -930 -> 340
    //   1273: astore 15
    //   1275: ldc 126
    //   1277: ldc_w 605
    //   1280: invokestatic 364	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1283: goto -631 -> 652
    //   1286: ldc 126
    //   1288: new 198	java/lang/StringBuilder
    //   1291: dup
    //   1292: ldc_w 607
    //   1295: invokespecial 594	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1298: aload_1
    //   1299: invokevirtual 601	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1302: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1305: invokestatic 364	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1308: ldc2_w 370
    //   1311: ldc_w 372
    //   1314: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1317: return
    //   1318: goto -1188 -> 130
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1321	0	this	b
    //   0	1321	1	paramBundle	Bundle
    //   0	1321	2	paramInt	int
    //   339	931	3	i	int
    //   325	651	4	j	int
    //   15	1214	5	localObject1	Object
    //   177	929	6	localObject2	Object
    //   23	1182	7	str1	String
    //   29	1083	8	str2	String
    //   139	1123	9	localJSONObject	JSONObject
    //   417	697	10	localView	View
    //   276	549	11	str3	String
    //   286	509	12	str4	String
    //   315	500	13	str5	String
    //   613	495	14	localObject3	Object
    //   586	524	15	localObject4	Object
    //   1273	1	15	localException	Exception
    //   769	323	16	localBundle	Bundle
    //   729	76	17	str6	String
    //   760	222	18	str7	String
    // Exception table:
    //   from	to	target	type
    //   141	179	1164	java/lang/Exception
    //   188	212	1164	java/lang/Exception
    //   212	258	1164	java/lang/Exception
    //   258	307	1164	java/lang/Exception
    //   307	338	1164	java/lang/Exception
    //   340	636	1164	java/lang/Exception
    //   652	1137	1164	java/lang/Exception
    //   1141	1163	1164	java/lang/Exception
    //   1200	1239	1164	java/lang/Exception
    //   1261	1270	1164	java/lang/Exception
    //   1275	1283	1164	java/lang/Exception
    //   1286	1308	1164	java/lang/Exception
    //   89	104	1242	org/json/JSONException
    //   108	130	1242	org/json/JSONException
    //   130	141	1242	org/json/JSONException
    //   141	179	1242	org/json/JSONException
    //   188	212	1242	org/json/JSONException
    //   212	258	1242	org/json/JSONException
    //   258	307	1242	org/json/JSONException
    //   307	338	1242	org/json/JSONException
    //   340	636	1242	org/json/JSONException
    //   636	652	1242	org/json/JSONException
    //   652	1137	1242	org/json/JSONException
    //   1141	1163	1242	org/json/JSONException
    //   1165	1190	1242	org/json/JSONException
    //   1200	1239	1242	org/json/JSONException
    //   1261	1270	1242	org/json/JSONException
    //   1275	1283	1242	org/json/JSONException
    //   1286	1308	1242	org/json/JSONException
    //   1308	1317	1242	org/json/JSONException
    //   636	652	1273	java/lang/Exception
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19466133962752L, 145034);
    try
    {
      if (this.rBv == null) {
        break label184;
      }
      w.i("FTSSearchWidgetMgr", "remove all widget count %d", new Object[] { Integer.valueOf(this.rBr.size()) });
      Iterator localIterator = new HashMap(this.rBr).keySet().iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        if ((str1 != null) && (str1.length() > 0))
        {
          String str2 = (String)((View)this.rBr.get(str1)).getTag();
          this.rBv.hs(str2);
          if ((View)this.rBs.get(str1) != null)
          {
            Lc(str1);
            this.rBs.remove(str1);
          }
        }
      }
      this.rBr.clear();
    }
    catch (Exception localException)
    {
      w.e("FTSSearchWidgetMgr", bg.f(localException));
      GMTrace.o(19466133962752L, 145034);
      return;
    }
    this.rBt.clear();
    label184:
    GMTrace.o(19466133962752L, 145034);
  }
  
  public final void onPause()
  {
    GMTrace.i(19465999745024L, 145033);
    if (this.rBv != null)
    {
      Iterator localIterator = this.rBr.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((str != null) && (str.length() > 0))
        {
          str = (String)((View)this.rBr.get(str)).getTag();
          ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).CG().hq(str);
        }
      }
    }
    GMTrace.o(19465999745024L, 145033);
  }
  
  public final void onResume()
  {
    GMTrace.i(19465865527296L, 145032);
    if (this.rBv != null)
    {
      Iterator localIterator = this.rBr.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((str != null) && (str.length() > 0))
        {
          str = (String)((View)this.rBr.get(str)).getTag();
          ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).CG().hr(str);
        }
      }
    }
    GMTrace.o(19465865527296L, 145032);
  }
  
  private static class a
    implements k
  {
    private a()
    {
      GMTrace.i(19474052808704L, 145093);
      GMTrace.o(19474052808704L, 145093);
    }
    
    public final Bundle l(Bundle paramBundle)
    {
      GMTrace.i(19474187026432L, 145094);
      paramBundle = com.tencent.mm.y.c.c.Ct().er("100266");
      if (paramBundle.isValid()) {}
      for (int i = com.tencent.mm.platformtools.t.getInt((String)paramBundle.bSg().get("search_wa_widget_init_out_time"), 8000);; i = 8000)
      {
        paramBundle = new Bundle();
        paramBundle.putInt("search_wa_widget_init_out_time", i);
        GMTrace.o(19474187026432L, 145094);
        return paramBundle;
      }
    }
  }
  
  private final class b
  {
    int eII;
    String eSd;
    int hKC;
    String rBK;
    
    public b()
    {
      GMTrace.i(19470160494592L, 145064);
      GMTrace.o(19470160494592L, 145064);
    }
    
    public final String toString()
    {
      GMTrace.i(20362574168064L, 151713);
      String str = String.format("WidgetInfo appid %s, widgetId %s, pkgType %d, pkgVer %d", new Object[] { this.eSd, this.rBK, Integer.valueOf(this.eII), Integer.valueOf(this.hKC) });
      GMTrace.o(20362574168064L, 151713);
      return str;
    }
  }
  
  private final class c
  {
    int rBL;
    int rBM;
    
    public c()
    {
      GMTrace.i(19473113284608L, 145086);
      GMTrace.o(19473113284608L, 145086);
    }
    
    public final String toString()
    {
      GMTrace.i(19473247502336L, 145087);
      String str = String.format("minH %d, maxH %d", new Object[] { Integer.valueOf(this.rBL), Integer.valueOf(this.rBM) });
      GMTrace.o(19473247502336L, 145087);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */