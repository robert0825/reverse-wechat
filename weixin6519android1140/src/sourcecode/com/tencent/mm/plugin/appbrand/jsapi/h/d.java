package com.tencent.mm.plugin.appbrand.jsapi.h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.h;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 105;
  private static final String NAME = "showToast";
  public View iku;
  public aj ikv;
  
  public d()
  {
    GMTrace.i(17678219608064L, 131713);
    GMTrace.o(17678219608064L, 131713);
  }
  
  public static void bF(View paramView)
  {
    GMTrace.i(17678488043520L, 131715);
    if (paramView == null)
    {
      GMTrace.o(17678488043520L, 131715);
      return;
    }
    paramView.setVisibility(8);
    if (!ViewGroup.class.isInstance(paramView.getParent()))
    {
      GMTrace.o(17678488043520L, 131715);
      return;
    }
    ((ViewGroup)paramView.getParent()).removeView(paramView);
    GMTrace.o(17678488043520L, 131715);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17678353825792L, 131714);
    final AppBrandPageView localAppBrandPageView = b(paramj);
    if (localAppBrandPageView == null)
    {
      w.w("MicroMsg.JsApiShowToast", "invoke JsApi JsApiShowToast failed, current page view is null.");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(17678353825792L, 131714);
      return;
    }
    m.k(localAppBrandPageView);
    final int i = paramJSONObject.optInt("duration", 1500);
    final String str1 = paramJSONObject.optString("title");
    final String str2 = paramJSONObject.optString("icon", "success");
    final String str3 = paramJSONObject.optString("image");
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17679964438528L, 131726);
        if (d.this.iku != null)
        {
          d.bF(d.this.iku);
          d.this.iku = null;
          if (d.this.ikv != null) {
            d.this.ikv.stopTimer();
          }
        }
        d.this.iku = LayoutInflater.from(localAppBrandPageView.mContext).inflate(o.g.hDi, null);
        Object localObject1 = d.this.iku.findViewById(o.f.hCu);
        u.Av().p(paramj.hashCode() + "toast_name", true).o("toast_view", d.this.iku);
        if (this.ikw)
        {
          localObject2 = new ViewGroup.LayoutParams(-1, -1);
          d.this.iku.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          ((LinearLayout)d.this.iku.findViewById(o.f.hCt)).setBackgroundColor(0);
          d.this.iku.setOnTouchListener(new View.OnTouchListener()
          {
            public final boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
            {
              GMTrace.i(17680769744896L, 131732);
              GMTrace.o(17680769744896L, 131732);
              return true;
            }
          });
        }
        Object localObject2 = (TextView)d.this.iku.findViewById(o.f.title);
        final int i = com.tencent.mm.br.a.fromDPToPix(((TextView)localObject2).getContext(), 18);
        int j = com.tencent.mm.br.a.fromDPToPix(((TextView)localObject2).getContext(), 27);
        if (!bg.nm(str1))
        {
          ((TextView)localObject2).setLineSpacing(0.0F, 1.0F);
          ((TextView)localObject2).setSpannableFactory(new Spannable.Factory()
          {
            public final Spannable newSpannable(CharSequence paramAnonymous2CharSequence)
            {
              GMTrace.i(18242336718848L, 135916);
              paramAnonymous2CharSequence = super.newSpannable(paramAnonymous2CharSequence);
              if (!TextUtils.isEmpty(paramAnonymous2CharSequence)) {
                paramAnonymous2CharSequence.setSpan(new com.tencent.mm.plugin.appbrand.widget.f.a(i), 0, paramAnonymous2CharSequence.length(), 18);
              }
              GMTrace.o(18242336718848L, 135916);
              return paramAnonymous2CharSequence;
            }
          });
          ((TextView)localObject2).setText(str1, TextView.BufferType.SPANNABLE);
          ((TextView)localObject2).setVisibility(0);
          ((View)localObject1).setPadding(0, j, 0, 0);
          localObject2 = (ImageView)d.this.iku.findViewById(o.f.hBR);
          localObject1 = (ProgressBar)d.this.iku.findViewById(o.f.progress);
          if (!str2.equals("loading")) {
            break label470;
          }
          ((ImageView)localObject2).setVisibility(8);
          ((ProgressBar)localObject1).setVisibility(0);
        }
        label470:
        label577:
        label581:
        for (;;)
        {
          localAppBrandPageView.iui.addView(d.this.iku);
          d.this.ikv = new aj(new aj.a()
          {
            public final boolean pM()
            {
              GMTrace.i(18243007807488L, 135921);
              d.bF(d.this.iku);
              d.this.iku = null;
              u.Av().gx(d.1.this.hXV.hashCode() + "toast_name");
              w.d("MicroMsg.JsApiShowToast", "on timer expired!");
              GMTrace.o(18243007807488L, 135921);
              return true;
            }
          }, false);
          localObject1 = d.this.ikv;
          long l = i;
          ((aj)localObject1).z(l, l);
          paramj.v(paramInt, d.this.d("ok", null));
          GMTrace.o(17679964438528L, 131726);
          return;
          ((TextView)localObject2).setVisibility(8);
          break;
          ((ImageView)localObject2).setVisibility(0);
          ((ProgressBar)localObject1).setVisibility(8);
          if (!bg.nm(str3))
          {
            localObject1 = o.g(paramj.hzM, str3);
            if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
              break label577;
            }
            localObject1 = new BitmapDrawable(((ImageView)localObject2).getResources(), (Bitmap)localObject1);
          }
          for (;;)
          {
            if (localObject1 == null) {
              break label581;
            }
            ((ImageView)localObject2).setImageDrawable((Drawable)localObject1);
            ((ImageView)localObject2).setScaleType(ImageView.ScaleType.FIT_CENTER);
            break;
            localObject1 = com.tencent.mm.svg.a.a.c(((ImageView)localObject2).getResources(), o.h.hDI);
            continue;
            localObject1 = null;
          }
        }
      }
    });
    GMTrace.o(17678353825792L, 131714);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\h\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */