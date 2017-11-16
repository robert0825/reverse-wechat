package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.a.b;
import com.tencent.mm.ui.tools.s;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.i;

public class MMTabView
  extends ViewGroup
{
  private TextView hqH;
  private int index;
  public int oGI;
  private int padding;
  private TextView vJW;
  private ImageView vMK;
  
  private MMTabView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(3465099083776L, 25817);
    this.oGI = 3;
    this.padding = 0;
    init();
    GMTrace.o(3465099083776L, 25817);
  }
  
  public MMTabView(Context paramContext, int paramInt)
  {
    this(paramContext);
    GMTrace.i(3465233301504L, 25818);
    this.index = paramInt;
    bXO();
    GMTrace.o(3465233301504L, 25818);
  }
  
  public MMTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3464964866048L, 25816);
    this.oGI = 3;
    this.padding = 0;
    init();
    GMTrace.o(3464964866048L, 25816);
  }
  
  public MMTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3464830648320L, 25815);
    this.oGI = 3;
    this.padding = 0;
    init();
    GMTrace.o(3464830648320L, 25815);
  }
  
  private String bXP()
  {
    GMTrace.i(3465904390144L, 25823);
    String str = this.vJW.getText().toString();
    GMTrace.o(3465904390144L, 25823);
    return str;
  }
  
  private void init()
  {
    GMTrace.i(3465501736960L, 25820);
    this.padding = getResources().getDimensionPixelSize(a.e.aQQ);
    Object localObject = v.bPK();
    boolean bool1 = v.bPG();
    boolean bool2 = ((String)localObject).equalsIgnoreCase("en");
    if (bool1) {}
    for (int i = (int)(com.tencent.mm.br.a.dZ(getContext()) * com.tencent.mm.br.a.fromDPToPix(getContext(), 2));; i = 0)
    {
      this.hqH = new TextView(getContext());
      this.hqH.setSingleLine();
      this.hqH.setEllipsize(TextUtils.TruncateAt.END);
      this.hqH.setTextColor(getResources().getColorStateList(a.d.aPp));
      this.hqH.setTextSize(0, com.tencent.mm.br.a.V(getContext(), a.e.aQo));
      this.hqH.setText("");
      if (bool1)
      {
        localObject = this.hqH;
        float f = this.hqH.getTextSize();
        ((TextView)localObject).setTextSize(0, i + f);
        this.hqH.setTypeface(null, 0);
      }
      for (;;)
      {
        addView(this.hqH);
        this.vMK = new ImageView(getContext());
        this.vMK.setBackgroundResource(a.f.gcP);
        this.vMK.setVisibility(4);
        addView(this.vMK);
        this.vJW = new TextView(getContext());
        this.vJW.setTextColor(getResources().getColor(a.d.white));
        this.vJW.setTextSize(1, 11.0F);
        this.vJW.setBackgroundResource(s.fH(getContext()));
        this.vJW.setTypeface(Typeface.DEFAULT_BOLD);
        this.vJW.setGravity(17);
        this.vJW.setVisibility(4);
        addView(this.vJW);
        setBackgroundResource(a.f.aXD);
        GMTrace.o(3465501736960L, 25820);
        return;
        if (bool2) {
          this.hqH.setTypeface(null, 1);
        }
      }
    }
  }
  
  public final void Vh(final String paramString)
  {
    GMTrace.i(3466038607872L, 25824);
    if (bg.nm(paramString))
    {
      this.vJW.setVisibility(4);
      GMTrace.o(3466038607872L, 25824);
      return;
    }
    this.vJW.setVisibility(0);
    this.vJW.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3475165413376L, 25892);
        MMTabView.a(MMTabView.this).setText(paramString);
        MMTabView.this.bXO();
        GMTrace.o(3475165413376L, 25892);
      }
    });
    GMTrace.o(3466038607872L, 25824);
  }
  
  public final void bXO()
  {
    GMTrace.i(3465367519232L, 25819);
    w.d("MicroMsg.MMTabView", "jacks build : %d desc, unread: %s", new Object[] { Integer.valueOf(this.index), bXP() });
    com.tencent.mm.ui.a.a locala = a.a.vOX;
    String str1 = this.hqH.getText().toString();
    String str2 = bXP();
    int j = this.index;
    b localb;
    if (locala.bYo())
    {
      if ((this == null) || (bg.nm(str1)) || (locala.sN == null))
      {
        GMTrace.o(3465367519232L, 25819);
        return;
      }
      localb = new b();
      localb.Vl(str1);
      if (bg.nm(str2)) {
        break label233;
      }
    }
    for (;;)
    {
      try
      {
        i = bg.getInt(str2, 0);
        if (i > 0)
        {
          if (i > 0) {
            localb.Vl(locala.sN.getResources().getQuantityString(a.i.gfW, 1, new Object[] { Integer.valueOf(i) }));
          }
          localb.Vl(locala.sN.getResources().getQuantityString(a.i.gfX, 5, new Object[] { Integer.valueOf(3), Integer.valueOf(j + 1) }));
          localb.dc(this);
          GMTrace.o(3465367519232L, 25819);
          return;
        }
      }
      catch (Exception localException) {}
      label233:
      int i = 0;
    }
  }
  
  public final void ln(boolean paramBoolean)
  {
    GMTrace.i(3466172825600L, 25825);
    ImageView localImageView = this.vMK;
    if (paramBoolean) {}
    for (int i = 0;; i = 4)
    {
      localImageView.setVisibility(i);
      GMTrace.o(3466172825600L, 25825);
      return;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3466441261056L, 25827);
    paramInt3 -= paramInt1;
    paramInt1 = paramInt4 - paramInt2;
    paramInt2 = (paramInt3 - this.hqH.getMeasuredWidth()) / 2;
    paramInt4 = this.hqH.getMeasuredWidth() + paramInt2;
    int i = (paramInt1 - this.hqH.getMeasuredHeight()) / 2;
    int j = this.hqH.getMeasuredHeight();
    this.hqH.layout(paramInt2, i, paramInt4, j + i);
    i = this.padding + paramInt4;
    j = this.vMK.getMeasuredWidth();
    int k = (paramInt1 - this.vMK.getMeasuredHeight()) / 2;
    int m = this.vMK.getMeasuredHeight();
    this.vMK.layout(i, k, j + i, m + k);
    if (paramInt2 - this.padding < this.vJW.getMeasuredWidth())
    {
      paramInt2 = paramInt3 - this.vJW.getMeasuredWidth();
      paramInt3 = this.vJW.getMeasuredWidth();
      paramInt1 = (paramInt1 - this.vJW.getMeasuredHeight()) / 2;
      paramInt4 = this.vJW.getMeasuredHeight();
      this.vJW.layout(paramInt2, paramInt1, paramInt3 + paramInt2, paramInt4 + paramInt1);
      GMTrace.o(3466441261056L, 25827);
      return;
    }
    paramInt2 = this.padding + paramInt4;
    paramInt3 = this.vJW.getMeasuredWidth();
    paramInt1 = (paramInt1 - this.vJW.getMeasuredHeight()) / 2;
    paramInt4 = this.vJW.getMeasuredHeight();
    this.vJW.layout(paramInt2, paramInt1, paramInt3 + paramInt2, paramInt4 + paramInt1);
    GMTrace.o(3466441261056L, 25827);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3466307043328L, 25826);
    int i = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    int j = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) {}
    for (paramInt1 = View.MeasureSpec.makeMeasureSpec(j, Integer.MIN_VALUE);; paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      this.hqH.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), paramInt1);
      this.vMK.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), paramInt1);
      this.vJW.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), paramInt1);
      setMeasuredDimension(i, j);
      GMTrace.o(3466307043328L, 25826);
      return;
    }
  }
  
  public final void setText(int paramInt)
  {
    GMTrace.i(3465635954688L, 25821);
    this.hqH.setText(paramInt);
    GMTrace.o(3465635954688L, 25821);
  }
  
  public final void setTextColor(ColorStateList paramColorStateList)
  {
    GMTrace.i(3465770172416L, 25822);
    this.hqH.setTextColor(paramColorStateList);
    GMTrace.o(3465770172416L, 25822);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\MMTabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */