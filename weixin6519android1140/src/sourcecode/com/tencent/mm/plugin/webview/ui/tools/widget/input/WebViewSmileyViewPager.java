package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.CustomViewPager;
import java.lang.ref.SoftReference;

public class WebViewSmileyViewPager
  extends CustomViewPager
{
  private int iPM;
  private int iPN;
  c rWp;
  a rWy;
  
  public WebViewSmileyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12072884633600L, 89950);
    this.iPM = 0;
    this.iPN = 0;
    if (d.et(9)) {
      setOverScrollMode(2);
    }
    GMTrace.o(12072884633600L, 89950);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(12073018851328L, 89951);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.rWp != null) && (((paramInt1 > 0) && (paramInt3 != paramInt1)) || ((paramInt2 > 0) && (paramInt4 != paramInt2) && (((paramInt2 > 0) && (paramInt2 != this.iPM)) || ((paramInt1 > 0) && (paramInt1 != this.iPN))))))
    {
      this.rWp.iPJ = paramInt2;
      this.rWp.iPK = paramInt1;
      if (this.rWy != null) {
        this.rWy.ady();
      }
    }
    if (paramInt2 > 0) {
      this.iPM = paramInt2;
    }
    if (paramInt1 > 0) {
      this.iPN = paramInt1;
    }
    GMTrace.o(12073018851328L, 89951);
  }
  
  public static abstract interface a
  {
    public abstract void ady();
  }
  
  static final class b
    extends u
  {
    SparseArray<SoftReference<View>> iPP;
    private boolean iPQ;
    c rWp;
    
    b()
    {
      GMTrace.i(12074629464064L, 89963);
      this.iPP = new SparseArray();
      this.iPQ = false;
      GMTrace.o(12074629464064L, 89963);
    }
    
    public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      GMTrace.i(12075300552704L, 89968);
      paramViewGroup.removeView((View)paramObject);
      GMTrace.o(12075300552704L, 89968);
    }
    
    public final boolean a(View paramView, Object paramObject)
    {
      GMTrace.i(12075166334976L, 89967);
      if (paramView == paramObject)
      {
        GMTrace.o(12075166334976L, 89967);
        return true;
      }
      GMTrace.o(12075166334976L, 89967);
      return false;
    }
    
    public final Object b(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(12075434770432L, 89969);
      View localView = null;
      if (this.iPP.get(paramInt) != null) {
        localView = (View)((SoftReference)this.iPP.get(paramInt)).get();
      }
      if (localView == null)
      {
        localView = this.rWp.bFY().kk(paramInt);
        if (localView != null)
        {
          paramViewGroup.addView(localView, 0);
          this.iPP.put(paramInt, new SoftReference(localView));
        }
        for (;;)
        {
          GMTrace.o(12075434770432L, 89969);
          return localView;
          w.e("MicroMsg.WebViewSmileyViewPagerAdapter", "contentView == null!");
        }
      }
      if (localView.getParent() != null) {
        ((ViewGroup)localView.getParent()).removeView(localView);
      }
      paramViewGroup.addView(localView, 0);
      GMTrace.o(12075434770432L, 89969);
      return localView;
    }
    
    public final int getCount()
    {
      GMTrace.i(12075032117248L, 89966);
      int i = this.rWp.bFY().getPageCount();
      GMTrace.o(12075032117248L, 89966);
      return i;
    }
    
    public final int j(Object paramObject)
    {
      GMTrace.i(12074763681792L, 89964);
      if (this.iPQ)
      {
        GMTrace.o(12074763681792L, 89964);
        return -2;
      }
      int i = super.j(paramObject);
      GMTrace.o(12074763681792L, 89964);
      return i;
    }
    
    public final void notifyDataSetChanged()
    {
      GMTrace.i(12074897899520L, 89965);
      this.iPQ = true;
      super.notifyDataSetChanged();
      this.iPQ = false;
      GMTrace.o(12074897899520L, 89965);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\input\WebViewSmileyViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */