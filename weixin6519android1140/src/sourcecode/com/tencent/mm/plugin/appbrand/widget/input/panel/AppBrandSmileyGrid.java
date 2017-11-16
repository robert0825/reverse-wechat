package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.bt.e;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.ui.v;

public class AppBrandSmileyGrid
  extends GridView
{
  AdapterView.OnItemClickListener WC;
  c iPo;
  a iPs;
  int iPt;
  int iPu;
  int iPw;
  int iPx;
  int iPy;
  int iPz;
  
  public AppBrandSmileyGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(19878048169984L, 148103);
    this.iPu = 0;
    this.iPx = 0;
    this.iPy = 0;
    this.iPz = 0;
    this.WC = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(19876169121792L, 148089);
        if (paramAnonymousInt == AppBrandSmileyGrid.a(AppBrandSmileyGrid.this).getCount() - 1)
        {
          if (AppBrandSmileyGrid.b(AppBrandSmileyGrid.this).iPI != null) {
            AppBrandSmileyGrid.b(AppBrandSmileyGrid.this).iPI.acZ();
          }
          GMTrace.o(19876169121792L, 148089);
          return;
        }
        if (AppBrandSmileyGrid.c(AppBrandSmileyGrid.this) * (AppBrandSmileyGrid.d(AppBrandSmileyGrid.this) - 1) + paramAnonymousInt >= AppBrandSmileyGrid.e(AppBrandSmileyGrid.this))
        {
          GMTrace.o(19876169121792L, 148089);
          return;
        }
        int i = AppBrandSmileyGrid.c(AppBrandSmileyGrid.this);
        int j = AppBrandSmileyGrid.d(AppBrandSmileyGrid.this);
        if (AppBrandSmileyGrid.b(AppBrandSmileyGrid.this).iPI != null) {
          AppBrandSmileyGrid.b(AppBrandSmileyGrid.this).iPI.append(AppBrandSmileyGrid.b(AppBrandSmileyGrid.this).adm().ki(i * (j - 1) + paramAnonymousInt));
        }
        GMTrace.o(19876169121792L, 148089);
      }
    };
    GMTrace.o(19878048169984L, 148103);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(19873618984960L, 148070);
      GMTrace.o(19873618984960L, 148070);
    }
    
    public final int getCount()
    {
      GMTrace.i(19873753202688L, 148071);
      int i = AppBrandSmileyGrid.d(AppBrandSmileyGrid.this);
      GMTrace.o(19873753202688L, 148071);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(19873887420416L, 148072);
      GMTrace.o(19873887420416L, 148072);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(19874021638144L, 148073);
      long l = paramInt;
      GMTrace.o(19874021638144L, 148073);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(19874155855872L, 148074);
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = v.fb(AppBrandSmileyGrid.this.getContext()).inflate(o.g.hDs, null);
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, (AppBrandSmileyGrid.b(AppBrandSmileyGrid.this).iPJ - a.V(AppBrandSmileyGrid.this.getContext(), o.d.aQu) - a.V(AppBrandSmileyGrid.this.getContext(), o.d.aRY)) / AppBrandSmileyGrid.f(AppBrandSmileyGrid.this)));
        paramViewGroup = new AppBrandSmileyGrid.b(paramView);
        paramView.setTag(paramViewGroup);
        if (paramInt != getCount() - 1) {
          break label170;
        }
        paramViewGroup.iub.setImageResource(o.e.aVV);
        paramViewGroup.iub.setContentDescription(AppBrandSmileyGrid.this.getContext().getString(o.i.dmB));
      }
      for (;;)
      {
        GMTrace.o(19874155855872L, 148074);
        return paramView;
        paramViewGroup = (AppBrandSmileyGrid.b)paramView.getTag();
        break;
        label170:
        paramInt = (AppBrandSmileyGrid.d(AppBrandSmileyGrid.this) - 1) * AppBrandSmileyGrid.c(AppBrandSmileyGrid.this) + paramInt;
        if (paramInt > AppBrandSmileyGrid.e(AppBrandSmileyGrid.this) - 1)
        {
          paramViewGroup.iub.setImageDrawable(null);
        }
        else
        {
          Drawable localDrawable = AppBrandSmileyGrid.b(AppBrandSmileyGrid.this).adm().kg(paramInt);
          paramViewGroup.iub.setImageDrawable(localDrawable);
        }
      }
    }
  }
  
  private static final class b
  {
    ImageView iub;
    
    public b(View paramView)
    {
      GMTrace.i(19880329871360L, 148120);
      this.iub = ((ImageView)paramView.findViewById(o.f.beT));
      GMTrace.o(19880329871360L, 148120);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\panel\AppBrandSmileyGrid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */