package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.ThumbnailUtils;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView.4;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView.5;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.a;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.h;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppBrandVideoView
  extends RelativeLayout
{
  String hyD;
  private int ifx;
  private int ilG;
  AppBrandVideoWrapper ilH;
  private TextView ilI;
  private DanmuView ilJ;
  AppBrandVideoViewControlBar ilK;
  private View ilL;
  private View ilM;
  TextView ilN;
  private LinearLayout ilO;
  private AppBrandDotPercentIndicator ilP;
  private TextView ilQ;
  private ImageView ilR;
  private ImageView ilS;
  String ilT;
  int ilU;
  private boolean ilV;
  e ilW;
  private boolean ilX;
  private boolean ilY;
  private f ilZ;
  a ima;
  private boolean imb;
  private int imc;
  private String imd;
  int kE;
  boolean mAutoPlay;
  private boolean mLoop;
  
  public AppBrandVideoView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17364284342272L, 129374);
    this.ilG = -1;
    init(paramContext);
    GMTrace.o(17364284342272L, 129374);
  }
  
  public AppBrandVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17364418560000L, 129375);
    this.ilG = -1;
    init(paramContext);
    GMTrace.o(17364418560000L, 129375);
  }
  
  public AppBrandVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17364552777728L, 129376);
    this.ilG = -1;
    init(paramContext);
    GMTrace.o(17364552777728L, 129376);
  }
  
  private void Xh()
  {
    GMTrace.i(18212137730048L, 135691);
    this.ilJ = ((DanmuView)findViewById(o.f.hBL));
    this.ilJ.inv = new com.tencent.mm.plugin.appbrand.jsapi.video.danmu.c()
    {
      public final int Gq()
      {
        GMTrace.i(19814160531456L, 147627);
        int i = AppBrandVideoView.b(AppBrandVideoView.this).XI();
        GMTrace.o(19814160531456L, 147627);
        return i;
      }
    };
    Object localObject1 = this.ilJ;
    ((DanmuView)localObject1).inr = 0.0F;
    ((DanmuView)localObject1).ins = 0.8F;
    this.ilJ.inq = 5;
    this.ilJ.inp = 200;
    this.ilJ.hide();
    int i;
    DanmuView localDanmuView;
    if ((this.ilH != null) && (this.ilH.getHeight() > 0))
    {
      localObject1 = this.ilJ;
      i = (int)((((DanmuView)localObject1).ins - ((DanmuView)localObject1).inr) * this.ilH.getHeight());
      float f = com.tencent.mm.plugin.appbrand.jsapi.video.danmu.b.bM(getContext());
      localDanmuView = this.ilJ;
      localDanmuView.ino = ((int)(i / f));
      if (localDanmuView.inw != null)
      {
        localObject1 = localDanmuView.inw;
        i = 0;
      }
    }
    for (;;)
    {
      try
      {
        if (i < localDanmuView.inw.size())
        {
          ArrayList localArrayList = (ArrayList)localDanmuView.inw.get(Integer.valueOf(i));
          if (localArrayList != null) {
            localArrayList.clear();
          }
        }
        else
        {
          localDanmuView.XQ();
          GMTrace.o(18212137730048L, 135691);
          return;
        }
      }
      finally {}
      i += 1;
    }
  }
  
  private boolean Xi()
  {
    GMTrace.i(20368479748096L, 151757);
    w.i("MicroMsg.AppBrandVideoView", "isLive %b %b", new Object[] { Boolean.valueOf(this.imb), Boolean.valueOf(this.ilH.Xi()) });
    if ((this.imb) || (this.ilH.Xi()))
    {
      GMTrace.o(20368479748096L, 151757);
      return true;
    }
    GMTrace.o(20368479748096L, 151757);
    return false;
  }
  
  static String iK(int paramInt)
  {
    GMTrace.i(17367505567744L, 129398);
    String str = iL(paramInt / 60) + ":" + iL(paramInt % 60);
    GMTrace.o(17367505567744L, 129398);
    return str;
  }
  
  private static String iL(int paramInt)
  {
    GMTrace.i(17367639785472L, 129399);
    if (paramInt < 10)
    {
      String str = "0" + paramInt;
      GMTrace.o(17367639785472L, 129399);
      return str;
    }
    GMTrace.o(17367639785472L, 129399);
    return String.valueOf(paramInt);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(17364686995456L, 129377);
    LayoutInflater.from(paramContext).inflate(o.g.hDo, this);
    this.ilH = ((AppBrandVideoWrapper)findViewById(o.f.ckL));
    this.ilI = ((TextView)findViewById(o.f.progress));
    this.ilL = findViewById(o.f.bsq);
    this.ilM = findViewById(o.f.hBI);
    this.ilN = ((TextView)findViewById(o.f.hBJ));
    this.ilO = ((LinearLayout)findViewById(o.f.bdm));
    this.ilP = ((AppBrandDotPercentIndicator)findViewById(o.f.bdn));
    this.ilQ = ((TextView)findViewById(o.f.bdk));
    this.ilR = ((ImageView)findViewById(o.f.bdl));
    this.ilS = ((ImageView)findViewById(o.f.bsp));
    paramContext = this.ilP;
    paramContext.ilo = 8;
    paramContext.removeAllViews();
    int i = 0;
    while (i < paramContext.ilo)
    {
      paramContext.addView((ImageView)paramContext.CJ.inflate(o.g.hCN, paramContext, false));
      i += 1;
    }
    ((ImageView)findViewById(o.f.hBH)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17370995228672L, 129424);
        AppBrandVideoView.this.start();
        GMTrace.o(17370995228672L, 129424);
      }
    });
    this.ilZ = new f(getContext(), this, new f.b()
    {
      public final void R(float paramAnonymousFloat)
      {
        GMTrace.i(19811476176896L, 147607);
        w.d("MicroMsg.AppBrandVideoView", "onAdjustVolume:" + paramAnonymousFloat);
        AppBrandVideoView.i(AppBrandVideoView.this).Q(paramAnonymousFloat);
        AppBrandVideoView.j(AppBrandVideoView.this).setText(o.i.hGF);
        AppBrandVideoView.k(AppBrandVideoView.this).setImageResource(o.h.hDU);
        AppBrandVideoView.l(AppBrandVideoView.this).setVisibility(0);
        GMTrace.o(19811476176896L, 147607);
      }
      
      public final void S(float paramAnonymousFloat)
      {
        GMTrace.i(19811610394624L, 147608);
        w.d("MicroMsg.AppBrandVideoView", "onAdjustBrightness:" + paramAnonymousFloat);
        AppBrandVideoView.i(AppBrandVideoView.this).Q(paramAnonymousFloat);
        AppBrandVideoView.j(AppBrandVideoView.this).setText(o.i.hGE);
        AppBrandVideoView.k(AppBrandVideoView.this).setImageResource(o.h.hDJ);
        AppBrandVideoView.l(AppBrandVideoView.this).setVisibility(0);
        GMTrace.o(19811610394624L, 147608);
      }
      
      public final void Xl()
      {
        GMTrace.i(19810670870528L, 147601);
        w.d("MicroMsg.AppBrandVideoView", "onSingleTap");
        if (AppBrandVideoView.f(AppBrandVideoView.this)) {
          AppBrandVideoView.g(AppBrandVideoView.this).XA();
        }
        GMTrace.o(19810670870528L, 147601);
      }
      
      public final void Xm()
      {
        GMTrace.i(19810805088256L, 147602);
        w.d("MicroMsg.AppBrandVideoView", "onDoubleTap");
        GMTrace.o(19810805088256L, 147602);
      }
      
      public final void Xn()
      {
        GMTrace.i(19810939305984L, 147603);
        if (AppBrandVideoView.b(AppBrandVideoView.this).Xi())
        {
          w.i("MicroMsg.AppBrandVideoView", "onStartDragProgress isLive: no seek");
          GMTrace.o(19810939305984L, 147603);
          return;
        }
        AppBrandVideoView.h(AppBrandVideoView.this).setVisibility(0);
        GMTrace.o(19810939305984L, 147603);
      }
      
      public final void Xo()
      {
        GMTrace.i(19811744612352L, 147609);
        AppBrandVideoView.l(AppBrandVideoView.this).setVisibility(8);
        GMTrace.o(19811744612352L, 147609);
      }
      
      public final void Xp()
      {
        GMTrace.i(19811878830080L, 147610);
        AppBrandVideoView.l(AppBrandVideoView.this).setVisibility(8);
        GMTrace.o(19811878830080L, 147610);
      }
      
      public final int d(int paramAnonymousInt, float paramAnonymousFloat)
      {
        int j = 0;
        GMTrace.i(19811073523712L, 147604);
        if (AppBrandVideoView.b(AppBrandVideoView.this).Xi())
        {
          w.i("MicroMsg.AppBrandVideoView", "onDragProgress isLive: no seek");
          GMTrace.o(19811073523712L, 147604);
          return 0;
        }
        w.i("MicroMsg.AppBrandVideoView", "onDragProgress:" + paramAnonymousInt + "/" + paramAnonymousFloat);
        paramAnonymousFloat /= AppBrandVideoView.this.getMeasuredWidth();
        int i = AppBrandVideoView.b(AppBrandVideoView.this).XG();
        paramAnonymousInt = getCurrentPosition();
        paramAnonymousInt = (int)(paramAnonymousFloat * i) + paramAnonymousInt;
        if (paramAnonymousInt < 0) {
          paramAnonymousInt = j;
        }
        for (;;)
        {
          String str = g.ax(i * 1000L);
          AppBrandVideoView.h(AppBrandVideoView.this).setText(g.ax(paramAnonymousInt * 1000L) + "/" + str);
          GMTrace.o(19811073523712L, 147604);
          return paramAnonymousInt;
          if (paramAnonymousInt > i) {
            paramAnonymousInt = i;
          }
        }
      }
      
      public final void e(int paramAnonymousInt, float paramAnonymousFloat)
      {
        GMTrace.i(19811207741440L, 147605);
        AppBrandVideoView.h(AppBrandVideoView.this).setVisibility(8);
        w.i("MicroMsg.AppBrandVideoView", "onEndDragProgress: dragPosition=%d currentPositon=%d totalDistanceX=%s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(AppBrandVideoView.b(AppBrandVideoView.this).XI()), Float.valueOf(paramAnonymousFloat) });
        if (AppBrandVideoView.b(AppBrandVideoView.this).Xi())
        {
          w.i("MicroMsg.AppBrandVideoView", "onEndDragProgress isLive: no seek");
          GMTrace.o(19811207741440L, 147605);
          return;
        }
        AppBrandVideoView.this.r(paramAnonymousInt, false);
        GMTrace.o(19811207741440L, 147605);
      }
      
      public final int getCurrentPosition()
      {
        GMTrace.i(19811341959168L, 147606);
        int i = AppBrandVideoView.b(AppBrandVideoView.this).XI();
        GMTrace.o(19811341959168L, 147606);
        return i;
      }
    });
    this.ilH.imw = new h.b()
    {
      public final void Xq()
      {
        GMTrace.i(19812684136448L, 147616);
        w.i("MicroMsg.AppBrandVideoView", "onPrepared");
        f localf = AppBrandVideoView.m(AppBrandVideoView.this);
        localf.imT = -1;
        localf.imU = 0;
        localf.imS = 0.0F;
        GMTrace.o(19812684136448L, 147616);
      }
      
      public final void Xr()
      {
        GMTrace.i(19812818354176L, 147617);
        w.i("MicroMsg.AppBrandVideoView", "onVideoEnded");
        AppBrandVideoView.n(AppBrandVideoView.this).setVisibility(0);
        if (AppBrandVideoView.o(AppBrandVideoView.this)) {
          AppBrandVideoView.p(AppBrandVideoView.this).setVisibility(8);
        }
        for (;;)
        {
          e locale;
          if (AppBrandVideoView.d(AppBrandVideoView.this) != null) {
            locale = AppBrandVideoView.d(AppBrandVideoView.this);
          }
          try
          {
            locale.a(new e.b(), locale.XK());
            locale.XL();
            if (AppBrandVideoView.s(AppBrandVideoView.this)) {
              AppBrandVideoView.this.r(0, true);
            }
            GMTrace.o(19812818354176L, 147617);
            return;
            if (AppBrandVideoView.q(AppBrandVideoView.this) <= 0) {
              AppBrandVideoView.r(AppBrandVideoView.this).setText(AppBrandVideoView.a(AppBrandVideoView.this, AppBrandVideoView.b(AppBrandVideoView.this).XG()));
            }
            AppBrandVideoView.p(AppBrandVideoView.this).setVisibility(0);
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              w.e("MicroMsg.JsApiVideoCallback", "OnVideoEnded e=%s", new Object[] { localJSONException });
            }
          }
        }
      }
      
      public final void Xs()
      {
        GMTrace.i(19813086789632L, 147619);
        w.i("MicroMsg.AppBrandVideoView", "onVideoPause");
        e locale;
        if (AppBrandVideoView.d(AppBrandVideoView.this) != null) {
          locale = AppBrandVideoView.d(AppBrandVideoView.this);
        }
        try
        {
          locale.a(new e.e(), locale.XK());
          locale.XL();
          GMTrace.o(19813086789632L, 147619);
          return;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.e("MicroMsg.JsApiVideoCallback", "OnVideoPause e=%s", new Object[] { localJSONException });
          }
        }
      }
      
      public final void Xt()
      {
        GMTrace.i(19813221007360L, 147620);
        w.i("MicroMsg.AppBrandVideoView", "onVideoPlay, isLive:%b", new Object[] { Boolean.valueOf(AppBrandVideoView.o(AppBrandVideoView.this)) });
        if ((AppBrandVideoView.q(AppBrandVideoView.this) <= 0) && (!AppBrandVideoView.o(AppBrandVideoView.this))) {
          AppBrandVideoView.r(AppBrandVideoView.this).setText(AppBrandVideoView.a(AppBrandVideoView.this, AppBrandVideoView.b(AppBrandVideoView.this).XG()));
        }
        AppBrandVideoView.g(AppBrandVideoView.this).cq(AppBrandVideoView.o(AppBrandVideoView.this));
        if (AppBrandVideoView.f(AppBrandVideoView.this)) {
          AppBrandVideoView.g(AppBrandVideoView.this).Xz();
        }
        if (AppBrandVideoView.d(AppBrandVideoView.this) != null)
        {
          e locale = AppBrandVideoView.d(AppBrandVideoView.this);
          try
          {
            locale.imL = 0;
            JSONObject localJSONObject = locale.XK();
            localJSONObject.put("timeStamp", System.currentTimeMillis());
            locale.a(new e.f(), localJSONObject);
            if (locale.imK == null) {
              locale.imK = new aj(new e.1(locale), true);
            }
            locale.imK.z(250L, 250L);
            GMTrace.o(19813221007360L, 147620);
            return;
          }
          catch (JSONException localJSONException)
          {
            w.e("MicroMsg.JsApiVideoCallback", "OnVideoPlay e=%s", new Object[] { localJSONException });
          }
        }
        GMTrace.o(19813221007360L, 147620);
      }
      
      public final void Xu()
      {
        GMTrace.i(20742276120576L, 154542);
        w.i("MicroMsg.AppBrandVideoView", "onVideoWaiting");
        if (AppBrandVideoView.d(AppBrandVideoView.this) != null)
        {
          e locale = AppBrandVideoView.d(AppBrandVideoView.this);
          try
          {
            JSONObject localJSONObject = locale.XK();
            localJSONObject.put("timeStamp", System.currentTimeMillis());
            locale.a(new e.h(), localJSONObject);
            GMTrace.o(20742276120576L, 154542);
            return;
          }
          catch (JSONException localJSONException)
          {
            w.e("MicroMsg.JsApiVideoCallback", "onVideoWaiting e=%s", new Object[] { localJSONException });
          }
        }
        GMTrace.o(20742276120576L, 154542);
      }
      
      public final void Xv()
      {
        GMTrace.i(20742410338304L, 154543);
        GMTrace.o(20742410338304L, 154543);
      }
      
      public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19812952571904L, 147618);
        w.i("MicroMsg.AppBrandVideoView", "onGetVideoSize width=%d height=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        AppBrandVideoView localAppBrandVideoView;
        if (AppBrandVideoView.t(AppBrandVideoView.this) == -1)
        {
          localAppBrandVideoView = AppBrandVideoView.this;
          if (paramAnonymousInt1 >= paramAnonymousInt2) {
            break label96;
          }
        }
        label96:
        for (paramAnonymousInt1 = 0;; paramAnonymousInt1 = 90)
        {
          AppBrandVideoView.b(localAppBrandVideoView, paramAnonymousInt1);
          w.i("MicroMsg.AppBrandVideoView", "onGetVideoSize adjust direction from AUTO to %s", new Object[] { Integer.valueOf(AppBrandVideoView.t(AppBrandVideoView.this)) });
          GMTrace.o(19812952571904L, 147618);
          return;
        }
      }
      
      public final void w(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(20742141902848L, 154541);
        w.i("MicroMsg.AppBrandVideoView", "onError errorMsg=%s what=%d extra=%d", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (AppBrandVideoView.d(AppBrandVideoView.this) != null)
        {
          e locale = AppBrandVideoView.d(AppBrandVideoView.this);
          locale.clean();
          try
          {
            JSONObject localJSONObject = locale.XK();
            localJSONObject.put("errMsg", paramAnonymousString);
            locale.a(new e.c(), localJSONObject);
            GMTrace.o(20742141902848L, 154541);
            return;
          }
          catch (JSONException paramAnonymousString)
          {
            w.e("MicroMsg.JsApiVideoCallback", "onError e=%s", new Object[] { paramAnonymousString });
          }
        }
        GMTrace.o(20742141902848L, 154541);
      }
    };
    this.ilK = new AppBrandVideoViewControlBar(getContext());
    this.ilK.setVisibility(8);
    paramContext = this.ilK;
    View.OnClickListener local8 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19813355225088L, 147621);
        if (!AppBrandVideoView.this.Xg()) {}
        for (boolean bool = true;; bool = false)
        {
          AppBrandVideoView.this.e(bool, AppBrandVideoView.t(AppBrandVideoView.this));
          GMTrace.o(19813355225088L, 147621);
          return;
        }
      }
    };
    paramContext.imh.setOnClickListener(local8);
    this.ilK.oSQ = new com.tencent.mm.plugin.sight.decode.ui.b()
    {
      public final void Xw()
      {
        GMTrace.i(19812281483264L, 147613);
        w.i("MicroMsg.AppBrandVideoView", "onSeekPre");
        GMTrace.o(19812281483264L, 147613);
      }
      
      public final void iM(int paramAnonymousInt)
      {
        GMTrace.i(19812415700992L, 147614);
        AppBrandVideoView.this.r(paramAnonymousInt, false);
        GMTrace.o(19812415700992L, 147614);
      }
    };
    this.ilK.d(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19814428966912L, 147629);
        if (AppBrandVideoView.b(AppBrandVideoView.this).isPlaying())
        {
          AppBrandVideoView.this.pause();
          GMTrace.o(19814428966912L, 147629);
          return;
        }
        AppBrandVideoView.this.start();
        GMTrace.o(19814428966912L, 147629);
      }
    });
    this.ilK.imn = new AppBrandVideoViewControlBar.b()
    {
      public final int Xj()
      {
        GMTrace.i(19813892096000L, 147625);
        int i = AppBrandVideoView.b(AppBrandVideoView.this).MU();
        GMTrace.o(19813892096000L, 147625);
        return i;
      }
      
      public final int Xk()
      {
        GMTrace.i(19814026313728L, 147626);
        int i = AppBrandVideoView.b(AppBrandVideoView.this).XG();
        GMTrace.o(19814026313728L, 147626);
        return i;
      }
    };
    this.ilK.cq(Xi());
    this.ilH.a(this.ilK);
    GMTrace.o(17364686995456L, 129377);
  }
  
  private com.tencent.mm.plugin.appbrand.jsapi.video.danmu.d m(JSONObject paramJSONObject)
  {
    GMTrace.i(17366968696832L, 129394);
    if (paramJSONObject == null)
    {
      GMTrace.o(17366968696832L, 129394);
      return null;
    }
    int j = paramJSONObject.optInt("time", 0);
    String str = paramJSONObject.optString("text", "");
    paramJSONObject = paramJSONObject.optString("color", "");
    try
    {
      i = Color.parseColor(paramJSONObject);
      paramJSONObject = new a(getContext(), new SpannableString(str), i, j);
      GMTrace.o(17366968696832L, 129394);
      return paramJSONObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.d("MicroMsg.AppBrandVideoView", "addDanmakuItemList parse color=%s exp=%s", new Object[] { paramJSONObject, localException });
        int i = getResources().getColor(o.c.white);
      }
    }
  }
  
  public final boolean Xg()
  {
    GMTrace.i(17367371350016L, 129397);
    if (this.ima == null)
    {
      w.w("MicroMsg.AppBrandVideoView", "isInFullScreen mFullScreenDelegate null");
      GMTrace.o(17367371350016L, 129397);
      return false;
    }
    boolean bool = this.ima.isFullScreen();
    GMTrace.o(17367371350016L, 129397);
    return bool;
  }
  
  /* Error */
  public final boolean bd(String arg1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 595
    //   3: ldc_w 597
    //   6: invokestatic 85	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 124	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:ilJ	Lcom/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView;
    //   13: ifnonnull +15 -> 28
    //   16: ldc -53
    //   18: ldc_w 599
    //   21: invokestatic 589	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: aload_0
    //   25: invokespecial 601	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:Xh	()V
    //   28: aload_2
    //   29: invokestatic 512	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   32: istore_3
    //   33: new 514	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/a
    //   36: dup
    //   37: aload_0
    //   38: invokevirtual 160	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:getContext	()Landroid/content/Context;
    //   41: new 516	android/text/SpannableString
    //   44: dup
    //   45: aload_1
    //   46: invokespecial 519	android/text/SpannableString:<init>	(Ljava/lang/CharSequence;)V
    //   49: iload_3
    //   50: aload_0
    //   51: getfield 150	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:ilH	Lcom/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoWrapper;
    //   54: invokevirtual 604	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoWrapper:XI	()I
    //   57: invokespecial 522	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/a:<init>	(Landroid/content/Context;Landroid/text/SpannableString;II)V
    //   60: astore_2
    //   61: aload_0
    //   62: getfield 124	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:ilJ	Lcom/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView;
    //   65: astore 4
    //   67: aload 4
    //   69: getfield 608	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView:inx	Ljava/util/Deque;
    //   72: astore_1
    //   73: aload_1
    //   74: monitorenter
    //   75: aload 4
    //   77: getfield 608	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView:inx	Ljava/util/Deque;
    //   80: aload_2
    //   81: invokeinterface 614 2 0
    //   86: pop
    //   87: new 616	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView$3
    //   90: dup
    //   91: aload 4
    //   93: aload_2
    //   94: invokespecial 619	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView$3:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView;Lcom/tencent/mm/plugin/appbrand/jsapi/video/danmu/d;)V
    //   97: ldc_w 621
    //   100: invokestatic 627	com/tencent/mm/sdk/f/e:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   103: aload_1
    //   104: monitorexit
    //   105: ldc2_w 595
    //   108: ldc_w 597
    //   111: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   114: iconst_1
    //   115: ireturn
    //   116: astore 4
    //   118: ldc -53
    //   120: ldc_w 524
    //   123: iconst_2
    //   124: anewarray 207	java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: aload_2
    //   130: aastore
    //   131: dup
    //   132: iconst_1
    //   133: aload 4
    //   135: aastore
    //   136: invokestatic 526	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: aload_0
    //   140: invokevirtual 530	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:getResources	()Landroid/content/res/Resources;
    //   143: getstatic 535	com/tencent/mm/plugin/appbrand/o$c:white	I
    //   146: invokevirtual 541	android/content/res/Resources:getColor	(I)I
    //   149: istore_3
    //   150: goto -117 -> 33
    //   153: astore_2
    //   154: aload_1
    //   155: monitorexit
    //   156: aload_2
    //   157: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	this	AppBrandVideoView
    //   0	158	2	paramString2	String
    //   32	118	3	i	int
    //   65	27	4	localDanmuView	DanmuView
    //   116	18	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   28	33	116	java/lang/Exception
    //   75	105	153	finally
    //   154	156	153	finally
  }
  
  public final void ci(boolean paramBoolean)
  {
    GMTrace.i(17364821213184L, 129378);
    w.i("MicroMsg.AppBrandVideoView", "setLoop loop=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.mLoop = paramBoolean;
    GMTrace.o(17364821213184L, 129378);
  }
  
  public final void cj(boolean paramBoolean)
  {
    GMTrace.i(17365760737280L, 129385);
    w.i("MicroMsg.AppBrandVideoView", "setIsShowBasicControls isShowBasicControls=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.ilV = paramBoolean;
    GMTrace.o(17365760737280L, 129385);
  }
  
  public final void ck(boolean paramBoolean)
  {
    GMTrace.i(17366029172736L, 129387);
    w.i("MicroMsg.AppBrandVideoView", "setShowDanmakuBtn showDanmakuBtn=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      if (this.ilJ == null) {
        Xh();
      }
      localAppBrandVideoViewControlBar = this.ilK;
      AppBrandVideoViewControlBar.a local4 = new AppBrandVideoViewControlBar.a()
      {
        public final void co(boolean paramAnonymousBoolean)
        {
          GMTrace.i(19814294749184L, 147628);
          if (paramAnonymousBoolean) {
            if (AppBrandVideoView.b(AppBrandVideoView.this).isPlaying()) {
              AppBrandVideoView.c(AppBrandVideoView.this).show();
            }
          }
          for (;;)
          {
            if (AppBrandVideoView.d(AppBrandVideoView.this) == null) {
              break label167;
            }
            e locale = AppBrandVideoView.d(AppBrandVideoView.this);
            int i = AppBrandVideoView.e(AppBrandVideoView.this);
            try
            {
              w.i("MicroMsg.JsApiVideoCallback", "onVideoClickDanmuBtn showDanmu=%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
              JSONObject localJSONObject = locale.XK();
              localJSONObject.put("showDanmu", paramAnonymousBoolean);
              localJSONObject.put("videoPlayerId", i);
              locale.a(new e.a(), localJSONObject);
              GMTrace.o(19814294749184L, 147628);
              return;
            }
            catch (JSONException localJSONException)
            {
              w.e("MicroMsg.JsApiVideoCallback", "onVideoClickDanmuBtn e=%s", new Object[] { localJSONException });
            }
            AppBrandVideoView.c(AppBrandVideoView.this).pause();
            continue;
            AppBrandVideoView.c(AppBrandVideoView.this).hide();
          }
          label167:
          GMTrace.o(19814294749184L, 147628);
        }
      };
      localAppBrandVideoViewControlBar.imi.setOnClickListener(new AppBrandVideoViewControlBar.1(localAppBrandVideoViewControlBar, local4));
    }
    AppBrandVideoViewControlBar localAppBrandVideoViewControlBar = this.ilK;
    if (paramBoolean)
    {
      localAppBrandVideoViewControlBar.imi.setVisibility(0);
      GMTrace.o(17366029172736L, 129387);
      return;
    }
    localAppBrandVideoViewControlBar.imi.setVisibility(8);
    GMTrace.o(17366029172736L, 129387);
  }
  
  public final void cl(boolean paramBoolean)
  {
    GMTrace.i(17366566043648L, 129391);
    w.i("MicroMsg.AppBrandVideoView", "setDisableScroll isDisableScroll=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.ilX = paramBoolean;
    GMTrace.o(17366566043648L, 129391);
  }
  
  public final void clean()
  {
    GMTrace.i(17365358084096L, 129382);
    w.i("MicroMsg.AppBrandVideoView", "clean");
    stop();
    this.ilH.XJ();
    if (this.ilJ != null)
    {
      localObject = this.ilJ;
      ((DanmuView)localObject).status = 3;
      ((DanmuView)localObject).XU();
      ((DanmuView)localObject).iny.clear();
      ((DanmuView)localObject).invalidate();
    }
    Object localObject = this.ilK;
    if (((AppBrandVideoViewControlBar)localObject).imp != null) {
      ((AppBrandVideoViewControlBar)localObject).imp.stopTimer();
    }
    if (((AppBrandVideoViewControlBar)localObject).imo != null) {
      ((AppBrandVideoViewControlBar)localObject).imo.stopTimer();
    }
    GMTrace.o(17365358084096L, 129382);
  }
  
  public final void cm(boolean paramBoolean)
  {
    GMTrace.i(18212003512320L, 135690);
    w.i("MicroMsg.AppBrandVideoView", "setPageGesture pageGesture=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.ilY = paramBoolean;
    GMTrace.o(18212003512320L, 135690);
  }
  
  final void cn(boolean paramBoolean)
  {
    GMTrace.i(18212271947776L, 135692);
    if (this.ilW == null)
    {
      GMTrace.o(18212271947776L, 135692);
      return;
    }
    e locale = this.ilW;
    int i = this.ilU;
    int j = this.ifx;
    try
    {
      w.i("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange videoPlayerId=%d isFullScreen=%b direction:%d", new Object[] { Integer.valueOf(i), Boolean.valueOf(paramBoolean), Integer.valueOf(j) });
      JSONObject localJSONObject = locale.XK();
      localJSONObject.put("fullScreen", paramBoolean);
      localJSONObject.put("videoPlayerId", i);
      localJSONObject.put("direction", j);
      locale.a(new e.d(), localJSONObject);
      GMTrace.o(18212271947776L, 135692);
      return;
    }
    catch (JSONException localJSONException)
    {
      w.e("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange e=%s", new Object[] { localJSONException });
      GMTrace.o(18212271947776L, 135692);
    }
  }
  
  public final void e(final String paramString, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(17365492301824L, 129383);
    w.i("MicroMsg.AppBrandVideoView", "setVideoPath path=%s isLive=%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (bg.nm(paramString))
    {
      w.v("MicroMsg.AppBrandVideoView", "setVideoPath videoPath empty");
      GMTrace.o(17365492301824L, 129383);
      return;
    }
    stop();
    this.imb = paramBoolean;
    AppBrandVideoWrapper localAppBrandVideoWrapper = this.ilH;
    Object localObject;
    if (bg.nm(paramString)) {
      localObject = paramString;
    }
    for (;;)
    {
      localAppBrandVideoWrapper.b(paramBoolean, (String)localObject, paramInt);
      if (this.imc > 0) {
        this.ilH.iN(this.imc);
      }
      if (this.mAutoPlay)
      {
        w.i("MicroMsg.AppBrandVideoView", "setVideoPath autoPlay");
        start();
      }
      if ((!paramString.startsWith("wxfile://")) || (bg.nm(paramString))) {
        break label391;
      }
      if (bg.nm(this.imd)) {
        break;
      }
      w.i("MicroMsg.AppBrandVideoView", "setCover mCoverUrl not null");
      GMTrace.o(17365492301824L, 129383);
      return;
      if (!paramString.startsWith("wxfile://"))
      {
        localObject = paramString;
      }
      else
      {
        w.i("MicroMsg.AppBrandVideoView", "convertPath appid=%s path=%s", new Object[] { this.hyD, paramString });
        localObject = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(this.hyD, paramString);
        if (localObject == null)
        {
          w.e("MicroMsg.AppBrandVideoView", "convertPath AppBrandLocalMediaObject null");
          localObject = paramString;
        }
        else
        {
          localObject = ((AppBrandLocalMediaObject)localObject).gpy;
          if (bg.nm((String)localObject))
          {
            w.e("MicroMsg.AppBrandVideoView", "convertPath fileFullPath null");
            localObject = paramString;
          }
          else
          {
            localObject = String.format("%s%s", new Object[] { "wxfile://", localObject });
            w.i("MicroMsg.AppBrandVideoView", "convertPath convertedPath=%s", new Object[] { localObject });
          }
        }
      }
    }
    paramString = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(this.hyD, paramString);
    if (paramString == null)
    {
      w.w("MicroMsg.AppBrandVideoView", "setCover AppBrandLocalMediaObject null");
      GMTrace.o(17365492301824L, 129383);
      return;
    }
    paramString = paramString.gpy;
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.AppBrandVideoView", "setCover fileFullPath null");
      GMTrace.o(17365492301824L, 129383);
      return;
    }
    com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19813623660544L, 147623);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19812147265536L, 147612);
            if ((this.val$bitmap != null) && (!this.val$bitmap.isRecycled())) {
              AppBrandVideoView.a(AppBrandVideoView.this).setImageBitmap(this.val$bitmap);
            }
            GMTrace.o(19812147265536L, 147612);
          }
        });
        GMTrace.o(19813623660544L, 147623);
      }
    });
    label391:
    GMTrace.o(17365492301824L, 129383);
  }
  
  public final void e(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(20741068161024L, 154533);
    w.i("MicroMsg.AppBrandVideoView", "operateFullScreen toFullScreen:%b direction:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (this.ima == null)
    {
      w.w("MicroMsg.AppBrandVideoView", "operateFullScreen mFullScreenDelegate null");
      GMTrace.o(20741068161024L, 154533);
      return;
    }
    if (paramBoolean == Xg())
    {
      w.i("MicroMsg.AppBrandVideoView", "operateFullScreen current same");
      GMTrace.o(20741068161024L, 154533);
      return;
    }
    if (paramInt == -1) {
      if (this.ilG == -1)
      {
        paramInt = 90;
        w.i("MicroMsg.AppBrandVideoView", "operateFullScreen target direction:%d", new Object[] { Integer.valueOf(paramInt) });
      }
    }
    for (;;)
    {
      if (paramBoolean)
      {
        this.ifx = paramInt;
        this.ima.iE(paramInt);
        AppBrandVideoViewControlBar localAppBrandVideoViewControlBar = this.ilK;
        localAppBrandVideoViewControlBar.imq = true;
        localAppBrandVideoViewControlBar.XB();
        cn(true);
        GMTrace.o(20741068161024L, 154533);
        return;
        paramInt = this.ilG;
        break;
      }
      this.ima.WT();
      this.ilK.WT();
      GMTrace.o(20741068161024L, 154533);
      return;
    }
  }
  
  public final void h(JSONArray paramJSONArray)
  {
    int j = 0;
    GMTrace.i(17366700261376L, 129392);
    if (paramJSONArray == null)
    {
      GMTrace.o(17366700261376L, 129392);
      return;
    }
    if (paramJSONArray != null) {}
    ArrayList localArrayList;
    for (int i = paramJSONArray.length();; i = 0)
    {
      w.i("MicroMsg.AppBrandVideoView", "setDanmakuItemList length=%d", new Object[] { Integer.valueOf(i) });
      if (this.ilJ == null)
      {
        w.w("MicroMsg.AppBrandVideoView", " setDanmakuItemList mDanmakuView null");
        Xh();
      }
      localArrayList = new ArrayList();
      i = j;
      while (i < paramJSONArray.length())
      {
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.d locald = m(paramJSONArray.optJSONObject(i));
        if (locald != null) {
          localArrayList.add(locald);
        }
        i += 1;
      }
    }
    paramJSONArray = this.ilJ;
    paramJSONArray.XS();
    paramJSONArray.XU();
    paramJSONArray.iny.clear();
    paramJSONArray.prepare();
    if (localArrayList.isEmpty())
    {
      paramJSONArray.XT();
      GMTrace.o(17366700261376L, 129392);
      return;
    }
    new DanmuView.4(paramJSONArray, localArrayList).start();
    paramJSONArray.XT();
    GMTrace.o(17366700261376L, 129392);
  }
  
  public final void iI(int paramInt)
  {
    GMTrace.i(20740933943296L, 154532);
    w.i("MicroMsg.AppBrandVideoView", "setFullScreenDirection %d", new Object[] { Integer.valueOf(paramInt) });
    this.ilG = paramInt;
    GMTrace.o(20740933943296L, 154532);
  }
  
  public final void iJ(int paramInt)
  {
    GMTrace.i(19807986515968L, 147581);
    w.i("MicroMsg.AppBrandVideoView", "setInitialTime initialTime=%d", new Object[] { Integer.valueOf(paramInt) });
    this.imc = paramInt;
    GMTrace.o(19807986515968L, 147581);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17367102914560L, 129395);
    if ((this.ilY) || (Xg()))
    {
      f localf;
      if (this.ilZ != null)
      {
        localf = this.ilZ;
        int i = paramMotionEvent.getActionMasked();
        if (i == 0)
        {
          localf.imS = paramMotionEvent.getRawX();
          localf.imR = ((AudioManager)localf.mContext.getSystemService("audio")).getStreamVolume(3);
          localf.hZu = g.bL(localf.mContext);
        }
        localf.imP.onTouchEvent(paramMotionEvent);
        if ((i == 1) || (i == 3))
        {
          if (localf.imO != f.a.ina) {
            break label183;
          }
          localf.imQ.e(localf.imU, paramMotionEvent.getRawX() - localf.imS);
          localf.imT = -1;
          localf.imU = 0;
          localf.imS = 0.0F;
        }
      }
      for (;;)
      {
        localf.imO = f.a.imX;
        GMTrace.o(17367102914560L, 129395);
        return true;
        label183:
        if (localf.imO == f.a.imY)
        {
          ((AudioManager)localf.mContext.getSystemService("audio")).getStreamMaxVolume(3);
          localf.imQ.Xo();
        }
        else if (localf.imO == f.a.imZ)
        {
          localf.imQ.Xp();
        }
      }
    }
    if ((paramMotionEvent.getAction() == 0) && (this.ilV) && (this.ilL.getVisibility() != 0)) {
      this.ilK.XA();
    }
    boolean bool = super.onTouchEvent(paramMotionEvent);
    GMTrace.o(17367102914560L, 129395);
    return bool;
  }
  
  public final void pause()
  {
    GMTrace.i(17365089648640L, 129380);
    w.i("MicroMsg.AppBrandVideoView", "pause");
    if (!this.ilH.isPlaying())
    {
      GMTrace.o(17365089648640L, 129380);
      return;
    }
    this.ilH.pause();
    if ((this.ilJ != null) && (this.ilK.imr)) {
      this.ilJ.pause();
    }
    GMTrace.o(17365089648640L, 129380);
  }
  
  public final void qO(String paramString)
  {
    GMTrace.i(19807852298240L, 147580);
    w.i("MicroMsg.AppBrandVideoView", "setCover coverUrl=%s", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      GMTrace.o(19807852298240L, 147580);
      return;
    }
    this.imd = paramString;
    com.tencent.mm.modelappbrand.a.b.CT().a(this.ilS, paramString, null, null);
    GMTrace.o(19807852298240L, 147580);
  }
  
  public final void qP(String paramString)
  {
    GMTrace.i(17366163390464L, 129388);
    w.i("MicroMsg.AppBrandVideoView", "setObjectFit objectFit=%s", new Object[] { paramString });
    if ("fill".equalsIgnoreCase(paramString))
    {
      this.ilH.a(h.d.tty);
      this.ilS.setScaleType(ImageView.ScaleType.FIT_XY);
      GMTrace.o(17366163390464L, 129388);
      return;
    }
    if ("cover".equalsIgnoreCase(paramString))
    {
      this.ilH.a(h.d.ttA);
      this.ilS.setScaleType(ImageView.ScaleType.CENTER_CROP);
      GMTrace.o(17366163390464L, 129388);
      return;
    }
    this.ilH.a(h.d.ttz);
    this.ilS.setScaleType(ImageView.ScaleType.FIT_CENTER);
    GMTrace.o(17366163390464L, 129388);
  }
  
  public final void r(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17365626519552L, 129384);
    int i = this.ilH.XI();
    w.i("MicroMsg.AppBrandVideoView", "seek to position=%d current=%d isLive=%b", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Boolean.valueOf(this.imb) });
    if (Xi())
    {
      GMTrace.o(17365626519552L, 129384);
      return;
    }
    this.ilL.setVisibility(8);
    if (paramBoolean) {
      this.ilH.o(paramInt, paramBoolean);
    }
    for (;;)
    {
      if ((this.ilJ != null) && (i > paramInt))
      {
        DanmuView localDanmuView = this.ilJ;
        w.i("MicroMsg.DanmuView", "seekToPlayTime playTime=%d", new Object[] { Integer.valueOf(paramInt) });
        localDanmuView.XS();
        localDanmuView.XU();
        localDanmuView.prepare();
        com.tencent.mm.sdk.f.e.post(new DanmuView.5(localDanmuView, paramInt), "DanmuView-seekToPlayTime");
      }
      GMTrace.o(17365626519552L, 129384);
      return;
      this.ilH.iN(paramInt);
    }
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(17366297608192L, 129389);
    w.i("MicroMsg.AppBrandVideoView", "setMute isMute=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.ilH.setMute(paramBoolean);
    GMTrace.o(17366297608192L, 129389);
  }
  
  public final void start()
  {
    GMTrace.i(17364955430912L, 129379);
    w.i("MicroMsg.AppBrandVideoView", "start");
    if (this.ilH.isPlaying())
    {
      GMTrace.o(17364955430912L, 129379);
      return;
    }
    if (this.ilV)
    {
      AppBrandVideoViewControlBar localAppBrandVideoViewControlBar = this.ilK;
      if (localAppBrandVideoViewControlBar.imp == null) {
        localAppBrandVideoViewControlBar.imp = new aj(new AppBrandVideoViewControlBar.3(localAppBrandVideoViewControlBar), true);
      }
      localAppBrandVideoViewControlBar.XC();
      localAppBrandVideoViewControlBar.imp.stopTimer();
      localAppBrandVideoViewControlBar.imp.z(500L, 500L);
    }
    this.ilL.setVisibility(8);
    this.ilH.start();
    if ((this.ilJ != null) && (this.ilK.imr)) {
      this.ilJ.show();
    }
    GMTrace.o(17364955430912L, 129379);
  }
  
  public final void stop()
  {
    GMTrace.i(17365223866368L, 129381);
    w.i("MicroMsg.AppBrandVideoView", "stop");
    if (!this.ilH.isPlaying())
    {
      GMTrace.o(17365223866368L, 129381);
      return;
    }
    this.ilH.stop();
    AppBrandVideoViewControlBar localAppBrandVideoViewControlBar = this.ilK;
    if (localAppBrandVideoViewControlBar.imp != null) {
      localAppBrandVideoViewControlBar.imp.stopTimer();
    }
    if (this.ilJ != null) {
      this.ilJ.hide();
    }
    GMTrace.o(17365223866368L, 129381);
  }
  
  public static abstract interface a
  {
    public abstract void WT();
    
    public abstract void iE(int paramInt);
    
    public abstract boolean isFullScreen();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\AppBrandVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */