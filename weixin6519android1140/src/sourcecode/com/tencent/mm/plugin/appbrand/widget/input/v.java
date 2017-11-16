package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.support.v4.view.z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.h;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyPanelBase;
import com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyPanelBase.a;
import com.tencent.mm.plugin.appbrand.widget.input.panel.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

public final class v
  extends LinearLayout
  implements s.a
{
  private static final int iMf;
  private static final a iNl;
  private MMActivity ezR;
  private final Runnable iMY;
  c iMZ;
  b iNa;
  private boolean iNb;
  d iNc;
  private AppBrandSmileyPanel iNd;
  private f iNe;
  private ImageButton iNf;
  private boolean iNg;
  private View iNh;
  private boolean iNi;
  public EditText iNj;
  private int iNk;
  private int state;
  
  static
  {
    GMTrace.i(18280186118144L, 136198);
    iMf = o.f.hAV;
    iNl = new e();
    GMTrace.o(18280186118144L, 136198);
  }
  
  private v(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18275891150848L, 136166);
    this.iMY = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18253745225728L, 136001);
        if ((v.a(v.this) == null) || (!z.al(v.a(v.this))))
        {
          GMTrace.o(18253745225728L, 136001);
          return;
        }
        if (v.a(v.this).acR())
        {
          w.d("MicroMsg.AppBrandSmileyPanelWrapper", "postMeasure inLayout, skip");
          v.this.post(this);
          GMTrace.o(18253745225728L, 136001);
          return;
        }
        v.b(v.this);
        GMTrace.o(18253745225728L, 136001);
      }
    };
    this.iNb = false;
    this.state = 2;
    this.iNk = 0;
    this.ezR = ((MMActivity)paramContext);
    super.setId(iMf);
    setOrientation(1);
    this.iNe = new f(getContext());
    paramContext = this.iNe;
    StateListDrawable localStateListDrawable = new StateListDrawable();
    Drawable localDrawable = ab.getResources().getDrawable(o.h.cPb);
    localStateListDrawable.addState(new int[] { 16842913 }, localDrawable);
    localDrawable = ab.getResources().getDrawable(o.h.cPa);
    localStateListDrawable.addState(new int[0], localDrawable);
    this.iNf = ((ImageButton)paramContext.findViewById(o.f.hCw));
    this.iNf.setSelected(false);
    this.iNf.setImageDrawable(localStateListDrawable);
    this.iNf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18288507617280L, 136260);
        if (paramAnonymousView.isSelected())
        {
          v.acY().n(v.this);
          paramAnonymousView.setSelected(false);
          GMTrace.o(18288507617280L, 136260);
          return;
        }
        v.acY().o(v.this);
        paramAnonymousView.setSelected(true);
        GMTrace.o(18288507617280L, 136260);
      }
    });
    this.iNh = paramContext.findViewById(o.f.hCv);
    this.iNh.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18287299657728L, 136251);
        v.c(v.this);
        GMTrace.o(18287299657728L, 136251);
      }
    });
    addView(this.iNe);
    this.iNd = new AppBrandSmileyPanel(getContext());
    this.iNd.setVisibility(8);
    this.iNd.setBackgroundColor(0);
    paramContext = this.iNd;
    paramContext.iPB = new AppBrandSmileyPanelBase.a()
    {
      public final void acZ()
      {
        GMTrace.i(18248913387520L, 135965);
        if (v.d(v.this) != null) {
          v.d(v.this).sQ("[DELETE_EMOTION]");
        }
        GMTrace.o(18248913387520L, 135965);
      }
      
      public final void append(String paramAnonymousString)
      {
        GMTrace.i(18248779169792L, 135964);
        if (v.d(v.this) != null) {
          v.d(v.this).sQ(paramAnonymousString);
        }
        GMTrace.o(18248779169792L, 135964);
      }
    };
    paramContext.iPo.iPI = paramContext.iPB;
    addView(this.iNd);
    acW();
    GMTrace.o(18275891150848L, 136166);
  }
  
  private void acS()
  {
    GMTrace.i(18276159586304L, 136168);
    ((s)l.bQ(this).iMk).iMR = this;
    GMTrace.o(18276159586304L, 136168);
  }
  
  private void acT()
  {
    GMTrace.i(18276293804032L, 136169);
    ((s)l.bQ(this).iMk).iMR = null;
    GMTrace.o(18276293804032L, 136169);
  }
  
  private void acU()
  {
    GMTrace.i(18276562239488L, 136171);
    acy();
    if (this.iNj != null)
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)this.iNj.getContext().getSystemService("input_method");
      if (!localInputMethodManager.showSoftInput(this.iNj, 1)) {
        localInputMethodManager.showSoftInput(this.iNj, 2);
      }
      GMTrace.o(18276562239488L, 136171);
      return;
    }
    this.ezR.aLs();
    GMTrace.o(18276562239488L, 136171);
  }
  
  private void acV()
  {
    GMTrace.i(18276696457216L, 136172);
    iNl.m(this);
    this.iNf.setSelected(true);
    kc(1);
    GMTrace.o(18276696457216L, 136172);
  }
  
  private void acW()
  {
    int k = 1;
    GMTrace.i(18276964892672L, 136174);
    if (this.iNe == null)
    {
      GMTrace.o(18276964892672L, 136174);
      return;
    }
    f localf = this.iNe;
    int j;
    label52:
    boolean bool;
    if (!this.iNg)
    {
      i = 1;
      if (this.iNi) {
        break label127;
      }
      j = 1;
      if (((i & j) == 0) && (!g.bI(this))) {
        break label132;
      }
      bool = true;
      label68:
      if (bool == localf.iNp) {
        break label138;
      }
    }
    label127:
    label132:
    label138:
    for (int i = k;; i = 0)
    {
      localf.iNp = bool;
      if ((i != 0) && ((Build.VERSION.SDK_INT < 18) || (!localf.isInLayout()))) {
        localf.requestLayout();
      }
      GMTrace.o(18276964892672L, 136174);
      return;
      i = 0;
      break;
      j = 0;
      break label52;
      bool = false;
      break label68;
    }
  }
  
  private void acy()
  {
    GMTrace.i(18276830674944L, 136173);
    iNl.l(this);
    this.iNf.setSelected(false);
    kc(0);
    GMTrace.o(18276830674944L, 136173);
  }
  
  public static v bW(View paramView)
  {
    GMTrace.i(18274817409024L, 136158);
    paramView = (v)paramView.getRootView().findViewById(iMf);
    GMTrace.o(18274817409024L, 136158);
    return paramView;
  }
  
  public static v bX(View paramView)
  {
    GMTrace.i(18274951626752L, 136159);
    l locall = l.bQ(paramView);
    if ((locall.iMk == null) || (!(locall.iMk instanceof s))) {
      locall.iMk = new s();
    }
    v localv2 = bW(paramView);
    v localv1 = localv2;
    if (localv2 == null)
    {
      localv1 = new v(paramView.getContext());
      locall.bR(localv1);
    }
    GMTrace.o(18274951626752L, 136159);
    return localv1;
  }
  
  private void cN(boolean paramBoolean)
  {
    GMTrace.i(18275756933120L, 136165);
    if ((!this.iNb) && (this.iNa != null))
    {
      this.iNb = true;
      this.iNa.cN(paramBoolean);
      this.iNb = false;
    }
    GMTrace.o(18275756933120L, 136165);
  }
  
  private void kb(int paramInt)
  {
    GMTrace.i(18275488497664L, 136163);
    AppBrandSmileyPanel localAppBrandSmileyPanel = this.iNd;
    if ((paramInt > 0) && (localAppBrandSmileyPanel.iMX != paramInt)) {
      localAppBrandSmileyPanel.iMX = paramInt;
    }
    for (paramInt = 1;; paramInt = 0)
    {
      if (paramInt != 0) {
        this.iMY.run();
      }
      GMTrace.o(18275488497664L, 136163);
      return;
    }
  }
  
  private void kc(final int paramInt)
  {
    GMTrace.i(18276428021760L, 136170);
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18247973863424L, 135958);
        int i = v.e(v.this);
        if (!v.this.isShown()) {
          v.a(v.this, 2);
        }
        while (v.f(v.this) == null)
        {
          GMTrace.o(18247973863424L, 135958);
          return;
          v.a(v.this, paramInt);
        }
        if ((i != v.e(v.this)) && (!this.iNo)) {
          v.f(v.this).jY(v.e(v.this));
        }
        GMTrace.o(18247973863424L, 135958);
      }
    });
    GMTrace.o(18276428021760L, 136170);
  }
  
  public final void acX()
  {
    int i = 0;
    GMTrace.i(18277770199040L, 136180);
    this.iNg = false;
    ImageButton localImageButton;
    if (this.iNf != null)
    {
      localImageButton = this.iNf;
      if (!this.iNg) {
        break label54;
      }
    }
    for (;;)
    {
      localImageButton.setVisibility(i);
      acW();
      GMTrace.o(18277770199040L, 136180);
      return;
      label54:
      i = 4;
    }
  }
  
  public final void b(EditText paramEditText)
  {
    GMTrace.i(18845645406208L, 140411);
    if (paramEditText == this.iNj) {
      this.iNj = null;
    }
    GMTrace.o(18845645406208L, 140411);
  }
  
  public final void cR(boolean paramBoolean)
  {
    GMTrace.i(18275354279936L, 136162);
    w.d("MicroMsg.AppBrandSmileyPanelWrapper", "onKeyboardStateChanged, kbShown = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      kd(0);
      acy();
      GMTrace.o(18275354279936L, 136162);
      return;
    }
    if (isShown())
    {
      if ((this.iNg) && (1 == this.state))
      {
        acV();
        GMTrace.o(18275354279936L, 136162);
        return;
      }
      hide();
    }
    GMTrace.o(18275354279936L, 136162);
  }
  
  public final void cS(boolean paramBoolean)
  {
    GMTrace.i(18277904416768L, 136181);
    this.iNi = paramBoolean;
    View localView;
    if (this.iNh != null)
    {
      localView = this.iNh;
      if (!this.iNi) {
        break label54;
      }
    }
    label54:
    for (int i = 0;; i = 4)
    {
      localView.setVisibility(i);
      acW();
      GMTrace.o(18277904416768L, 136181);
      return;
    }
  }
  
  public final int getMinimumHeight()
  {
    GMTrace.i(18275622715392L, 136164);
    if (getVisibility() == 0)
    {
      int i = a.fromDPToPix(getContext(), 48);
      GMTrace.o(18275622715392L, 136164);
      return i;
    }
    GMTrace.o(18275622715392L, 136164);
    return 0;
  }
  
  public final void hide()
  {
    GMTrace.i(18278172852224L, 136183);
    if (!isShown())
    {
      GMTrace.o(18278172852224L, 136183);
      return;
    }
    kd(8);
    if ((this.ezR != null) && (!this.ezR.vKB.avJ())) {
      ad.cb(this).hideSoftInputFromWindow(getWindowToken(), 0);
    }
    acy();
    GMTrace.o(18278172852224L, 136183);
  }
  
  public final void ka(int paramInt)
  {
    GMTrace.i(18275085844480L, 136160);
    iNl.c(this, paramInt);
    GMTrace.o(18275085844480L, 136160);
  }
  
  final void kd(int paramInt)
  {
    GMTrace.i(18277635981312L, 136179);
    int i = paramInt;
    if (paramInt == 0)
    {
      i = paramInt;
      if (g.bI(this)) {
        i = 8;
      }
    }
    if (getVisibility() == i)
    {
      GMTrace.o(18277635981312L, 136179);
      return;
    }
    super.setVisibility(i);
    if (i == 0)
    {
      acS();
      GMTrace.o(18277635981312L, 136179);
      return;
    }
    acT();
    GMTrace.o(18277635981312L, 136179);
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(18277233328128L, 136176);
    super.onAttachedToWindow();
    acS();
    GMTrace.o(18277233328128L, 136176);
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(18277367545856L, 136177);
    super.onDetachedFromWindow();
    kd(8);
    if (this.ezR != null)
    {
      if (this.iNj == null) {
        break label144;
      }
      this.ezR.db(this.iNj);
    }
    for (;;)
    {
      AppBrandSmileyPanel localAppBrandSmileyPanel = this.iNd;
      c localc = localAppBrandSmileyPanel.iPo;
      localc.iPH = null;
      localc.iPn = null;
      if (localAppBrandSmileyPanel.Hw != null)
      {
        ((ViewGroup)localAppBrandSmileyPanel.Hw.getParent()).removeView(localAppBrandSmileyPanel.Hw);
        ((ViewGroup)localAppBrandSmileyPanel.Hw).removeAllViews();
        localAppBrandSmileyPanel.Hw = null;
      }
      localAppBrandSmileyPanel.iPC = null;
      this.iNf.setOnClickListener(null);
      this.iMZ = null;
      removeAllViews();
      this.ezR = null;
      acT();
      GMTrace.o(18277367545856L, 136177);
      return;
      label144:
      this.ezR.aLo();
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18275220062208L, 136161);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    w.v("MicroMsg.AppBrandSmileyPanelWrapper", "[scrollUp] SoftKeyboardPanel onLayout measuredHeight = %d", new Object[] { Integer.valueOf(getMeasuredHeight()) });
    GMTrace.o(18275220062208L, 136161);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(18277099110400L, 136175);
    super.onMeasure(paramInt1, paramInt2);
    w.d("MicroMsg.AppBrandSmileyPanelWrapper", "smileyPanelWrapper, onMeasure");
    GMTrace.o(18277099110400L, 136175);
  }
  
  public final void setId(int paramInt)
  {
    GMTrace.i(18276025368576L, 136167);
    GMTrace.o(18276025368576L, 136167);
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(18277501763584L, 136178);
    if (paramInt == 8)
    {
      if (getVisibility() != paramInt) {
        cN(false);
      }
      hide();
      GMTrace.o(18277501763584L, 136178);
      return;
    }
    if (paramInt == 0)
    {
      show();
      GMTrace.o(18277501763584L, 136178);
      return;
    }
    kd(paramInt);
    GMTrace.o(18277501763584L, 136178);
  }
  
  public final void show()
  {
    GMTrace.i(18278038634496L, 136182);
    acU();
    acX();
    cS(this.iNi);
    acW();
    if (!isShown()) {
      kd(0);
    }
    kb(j.aL(getContext()));
    GMTrace.o(18278038634496L, 136182);
  }
  
  static abstract interface a
  {
    public abstract void c(v paramv, int paramInt);
    
    public abstract void l(v paramv);
    
    public abstract void m(v paramv);
    
    public abstract void n(v paramv);
    
    public abstract void o(v paramv);
  }
  
  public static abstract interface b
  {
    public abstract void cN(boolean paramBoolean);
  }
  
  public static abstract interface c
  {
    public abstract boolean sQ(String paramString);
  }
  
  public static abstract interface d
  {
    public abstract void jY(int paramInt);
  }
  
  private static final class e
    implements v.a
  {
    public e()
    {
      GMTrace.i(18288641835008L, 136261);
      GMTrace.o(18288641835008L, 136261);
    }
    
    public final void c(v paramv, int paramInt)
    {
      GMTrace.i(18289044488192L, 136264);
      if (g.bI(paramv))
      {
        paramv.kd(8);
        GMTrace.o(18289044488192L, 136264);
        return;
      }
      if ((v.a(paramv) == null) || (paramInt <= 0))
      {
        GMTrace.o(18289044488192L, 136264);
        return;
      }
      v.b(paramv, paramInt);
      GMTrace.o(18289044488192L, 136264);
    }
    
    public final void l(v paramv)
    {
      GMTrace.i(18288776052736L, 136262);
      if (paramv.isShown()) {
        v.a(paramv).setVisibility(0);
      }
      v.a(paramv).adz();
      GMTrace.o(18288776052736L, 136262);
    }
    
    public final void m(v paramv)
    {
      GMTrace.i(18288910270464L, 136263);
      if (g.bI(paramv))
      {
        paramv.kd(8);
        v.g(paramv);
        GMTrace.o(18288910270464L, 136263);
        return;
      }
      if (paramv.isShown()) {
        v.a(paramv).setVisibility(0);
      }
      if (!v.h(paramv))
      {
        v.a(paramv).adz();
        GMTrace.o(18288910270464L, 136263);
        return;
      }
      paramv = v.a(paramv);
      if (paramv.Hw != null) {
        paramv.Hw.setVisibility(0);
      }
      GMTrace.o(18288910270464L, 136263);
    }
    
    public final void n(v paramv)
    {
      GMTrace.i(18289178705920L, 136265);
      v.i(paramv).aLs();
      v.j(paramv);
      GMTrace.o(18289178705920L, 136265);
    }
    
    public final void o(v paramv)
    {
      GMTrace.i(18289312923648L, 136266);
      v.i(paramv).aLo();
      v.k(paramv);
      paramv.ka(j.aL(v.i(paramv)));
      GMTrace.o(18289312923648L, 136266);
    }
  }
  
  private static final class f
    extends FrameLayout
  {
    boolean iNp;
    
    public f(Context paramContext)
    {
      super();
      GMTrace.i(18247571210240L, 135955);
      this.iNp = false;
      LayoutInflater.from(paramContext).inflate(o.g.hDv, this);
      GMTrace.o(18247571210240L, 135955);
    }
    
    protected final void onMeasure(int paramInt1, int paramInt2)
    {
      GMTrace.i(18247705427968L, 135956);
      if ((this.iNp) || (!isShown()))
      {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
      }
      super.onMeasure(paramInt1, paramInt2);
      GMTrace.o(18247705427968L, 135956);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */