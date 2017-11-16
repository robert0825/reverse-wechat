package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Rect;
import android.view.View;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.b.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Map;

final class c
  extends b<q>
{
  final String iLb;
  int iLc;
  q iLd;
  t iLe;
  h iLf;
  boolean iLg;
  boolean iLh;
  
  c(String paramString, AppBrandPageView paramAppBrandPageView)
  {
    super(paramString, paramAppBrandPageView);
    GMTrace.i(10048747077632L, 74869);
    this.iLc = 0;
    this.iLd = new q(paramAppBrandPageView.mContext);
    ad.b.setNoSystemInputOnEditText(this.iLd);
    this.iLb = String.valueOf(com.tencent.mm.plugin.appbrand.jsapi.base.f.a(paramAppBrandPageView, this.iLd));
    this.iLc = bg.a((Integer)m.iMq.get(paramString), 0);
    GMTrace.o(10048747077632L, 74869);
  }
  
  private t aco()
  {
    GMTrace.i(18248376516608L, 135961);
    if (this.iLe != null)
    {
      localt = this.iLe;
      GMTrace.o(18248376516608L, 135961);
      return localt;
    }
    t localt = (t)t.bU(this.iLd);
    this.iLe = localt;
    GMTrace.o(18248376516608L, 135961);
    return localt;
  }
  
  private boolean isFocused()
  {
    GMTrace.i(15420274769920L, 114890);
    if (this.iLd == null)
    {
      GMTrace.o(15420274769920L, 114890);
      return false;
    }
    if (this.iLd.isFocused())
    {
      GMTrace.o(15420274769920L, 114890);
      return true;
    }
    if (aco() == null)
    {
      GMTrace.o(15420274769920L, 114890);
      return false;
    }
    if (!aco().isShown())
    {
      GMTrace.o(15420274769920L, 114890);
      return false;
    }
    if (this.iLe.jZ == this.iLd)
    {
      GMTrace.o(15420274769920L, 114890);
      return true;
    }
    GMTrace.o(15420274769920L, 114890);
    return false;
  }
  
  final String acd()
  {
    GMTrace.i(10048881295360L, 74870);
    String str = this.iLb;
    GMTrace.o(10048881295360L, 74870);
    return str;
  }
  
  final Rect acf()
  {
    GMTrace.i(10049418166272L, 74874);
    Rect localRect = new Rect(this.iLf.iQo.intValue(), this.iLf.iQn.intValue(), this.iLf.iQo.intValue() + this.iLf.iQl.intValue(), this.iLf.iQn.intValue() + this.iLf.iQm.intValue());
    GMTrace.o(10049418166272L, 74874);
    return localRect;
  }
  
  public final View acl()
  {
    GMTrace.i(10049149730816L, 74872);
    aco();
    t localt = this.iLe;
    GMTrace.o(10049149730816L, 74872);
    return localt;
  }
  
  public final int acm()
  {
    GMTrace.i(10049283948544L, 74873);
    if ((this.iLf == null) || (this.iLf.iQI == null))
    {
      GMTrace.o(10049283948544L, 74873);
      return 0;
    }
    int i = this.iLf.iQI.intValue();
    GMTrace.o(10049283948544L, 74873);
    return i;
  }
  
  public final boolean acn()
  {
    GMTrace.i(14316333957120L, 106665);
    if (aco() == null)
    {
      GMTrace.o(14316333957120L, 106665);
      return false;
    }
    if (isFocused())
    {
      Object localObject = this.iLe;
      ((t)localObject).setVisibility(8);
      ((t)localObject).acP();
      w.d("MicroMsg.AppBrandInputComponentAsNumber", "[input_switch] disableInputFocus %s", new Object[] { this.iLd });
      if (this.iLd != null)
      {
        this.iLd.setFocusable(false);
        this.iLd.setFocusableInTouchMode(false);
        this.iLd.setEnabled(false);
      }
      localObject = (AppBrandPageView)this.iKW.get();
      if ((localObject != null) && (((AppBrandPageView)localObject).ivj != null)) {
        f.acq().p(((AppBrandPageView)localObject).ivj);
      }
      i.a(this.iKW).acD();
      GMTrace.o(14316333957120L, 106665);
      return true;
    }
    GMTrace.o(14316333957120L, 106665);
    return false;
  }
  
  public final h b(h paramh)
  {
    GMTrace.i(17818208698368L, 132756);
    if (this.iLf == null)
    {
      this.iLf = paramh;
      if ((ad.d(paramh.iQS)) && (this.iLd != null)) {
        this.iLd.cQ(true);
      }
    }
    while (this.iLd == null)
    {
      GMTrace.o(17818208698368L, 132756);
      return null;
      this.iLf.a(paramh);
    }
    a.a(this.iLd, this.iLf);
    paramh = this.iLf;
    GMTrace.o(17818208698368L, 132756);
    return paramh;
  }
  
  protected final boolean cK(boolean paramBoolean)
  {
    GMTrace.i(10050089254912L, 74879);
    w.d("MicroMsg.AppBrandInputComponentAsNumber", "[input_switch] onFocusChanged hasFocus %b, isFocused %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(isFocused()) });
    if (!paramBoolean)
    {
      if (this.iLg)
      {
        GMTrace.o(10050089254912L, 74879);
        return true;
      }
      if (!isFocused())
      {
        GMTrace.o(10050089254912L, 74879);
        return true;
      }
      this.iLg = true;
      a(acj());
      acn();
      aci();
      this.iLg = false;
      this.iLd = null;
    }
    for (;;)
    {
      GMTrace.o(10050089254912L, 74879);
      return true;
      if (this.iLh)
      {
        GMTrace.o(10050089254912L, 74879);
        return true;
      }
      if (isFocused())
      {
        GMTrace.o(10050089254912L, 74879);
        return true;
      }
      this.iLh = true;
      jW(-2);
      this.iLh = false;
    }
  }
  
  public final boolean jW(int paramInt)
  {
    GMTrace.i(18248242298880L, 135960);
    if (this.iLd == null)
    {
      GMTrace.o(18248242298880L, 135960);
      return false;
    }
    this.iLe = t.bV(((AppBrandPageView)this.iKW.get()).iuf);
    if (this.iLe == null)
    {
      GMTrace.o(18248242298880L, 135960);
      return false;
    }
    this.iLh = true;
    Object localObject = (AppBrandPageView)this.iKW.get();
    if ((localObject != null) && (((AppBrandPageView)localObject).ivj != null)) {
      f.acq().o(((AppBrandPageView)localObject).ivj);
    }
    localObject = this.iLe;
    int i = this.iLc;
    ((t)localObject).iMU.setXMode(i);
    localObject = this.iLe;
    q localq = this.iLd;
    if (localq != null)
    {
      if (((t)localObject).jZ != localq) {
        ((t)localObject).acP();
      }
      ((t)localObject).setInputEditText(localq);
      ad.b.c(((t)localObject).jZ);
      ((t)localObject).jZ.requestFocus();
      ((t)localObject).setVisibility(0);
    }
    this.iLe.iMT = new t.a()
    {
      public final void onDone()
      {
        GMTrace.i(10099078725632L, 75244);
        c.this.a(c.this.acj());
        c.this.cK(false);
        GMTrace.o(10099078725632L, 75244);
      }
    };
    jX(paramInt);
    i.a(this.iKW).acC();
    this.iLh = false;
    GMTrace.o(18248242298880L, 135960);
    return true;
  }
  
  public final boolean sP(String paramString)
  {
    GMTrace.i(10049686601728L, 74876);
    if (this.iLd == null)
    {
      GMTrace.o(10049686601728L, 74876);
      return false;
    }
    this.iLd.r(paramString);
    GMTrace.o(10049686601728L, 74876);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */