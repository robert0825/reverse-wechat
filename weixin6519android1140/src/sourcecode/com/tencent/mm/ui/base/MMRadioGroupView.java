package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;

public class MMRadioGroupView
  extends LinearLayout
{
  private c weA;
  private int wev;
  private int wew;
  private MMRadioImageButton.a wex;
  private b wey;
  private MMRadioImageButton wez;
  
  public MMRadioGroupView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3198676893696L, 23832);
    this.wev = -1;
    this.wew = -1;
    this.wex = new a();
    this.wey = new b();
    super.setOnHierarchyChangeListener(this.wey);
    GMTrace.o(3198676893696L, 23832);
  }
  
  private void ab(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(3199079546880L, 23835);
    View localView = findViewById(paramInt);
    if ((localView != null) && ((localView instanceof MMRadioImageButton))) {
      ((MMRadioImageButton)localView).setChecked(paramBoolean);
    }
    GMTrace.o(3199079546880L, 23835);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(3198945329152L, 23834);
    if ((paramView instanceof MMRadioImageButton))
    {
      MMRadioImageButton localMMRadioImageButton = (MMRadioImageButton)paramView;
      if (localMMRadioImageButton.isChecked())
      {
        if (this.wev != -1) {
          ab(this.wev, false);
        }
        this.wev = localMMRadioImageButton.getId();
        this.wez = localMMRadioImageButton;
      }
    }
    super.addView(paramView, paramInt, paramLayoutParams);
    GMTrace.o(3198945329152L, 23834);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(3198811111424L, 23833);
    super.onFinishInflate();
    if (this.wev != -1)
    {
      ab(this.wev, true);
      this.wev = this.wev;
    }
    GMTrace.o(3198811111424L, 23833);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3199213764608L, 23836);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (((paramInt1 > 0) || (paramInt2 > 0)) && (this.weA != null)) {
      this.weA.Cb(paramInt1);
    }
    GMTrace.o(3199213764608L, 23836);
  }
  
  final class a
    implements MMRadioImageButton.a
  {
    a()
    {
      GMTrace.i(3352087756800L, 24975);
      GMTrace.o(3352087756800L, 24975);
    }
    
    public final void a(MMRadioImageButton paramMMRadioImageButton)
    {
      GMTrace.i(3352221974528L, 24976);
      if (MMRadioGroupView.a(MMRadioGroupView.this) != -1) {
        MMRadioGroupView.a(MMRadioGroupView.this, MMRadioGroupView.a(MMRadioGroupView.this));
      }
      int i = paramMMRadioImageButton.getId();
      MMRadioGroupView.a(MMRadioGroupView.this, paramMMRadioImageButton);
      MMRadioGroupView.b(MMRadioGroupView.this, i);
      GMTrace.o(3352221974528L, 24976);
    }
    
    public final void b(MMRadioImageButton paramMMRadioImageButton)
    {
      GMTrace.i(3352356192256L, 24977);
      MMRadioGroupView.c(MMRadioGroupView.this, paramMMRadioImageButton.getId());
      GMTrace.o(3352356192256L, 24977);
    }
  }
  
  private final class b
    implements ViewGroup.OnHierarchyChangeListener
  {
    private ViewGroup.OnHierarchyChangeListener gG;
    
    public b()
    {
      GMTrace.i(3347121700864L, 24938);
      GMTrace.o(3347121700864L, 24938);
    }
    
    public final void onChildViewAdded(View paramView1, View paramView2)
    {
      GMTrace.i(3347255918592L, 24939);
      if ((paramView1 == MMRadioGroupView.this) && ((paramView2 instanceof MMRadioImageButton)))
      {
        if (paramView2.getId() == -1)
        {
          int j = paramView2.hashCode();
          int i = j;
          if (j < 0) {
            i = j & 0x7FFFFFFF;
          }
          paramView2.setId(i);
        }
        ((MMRadioImageButton)paramView2).weG = MMRadioGroupView.b(MMRadioGroupView.this);
      }
      if (this.gG != null) {
        this.gG.onChildViewAdded(paramView1, paramView2);
      }
      GMTrace.o(3347255918592L, 24939);
    }
    
    public final void onChildViewRemoved(View paramView1, View paramView2)
    {
      GMTrace.i(3347390136320L, 24940);
      if ((paramView1 == MMRadioGroupView.this) && ((paramView2 instanceof MMRadioImageButton))) {
        ((MMRadioImageButton)paramView2).weG = null;
      }
      if (this.gG != null) {
        this.gG.onChildViewRemoved(paramView1, paramView2);
      }
      GMTrace.o(3347390136320L, 24940);
    }
  }
  
  public static abstract interface c
  {
    public abstract void Cb(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMRadioGroupView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */