package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.a;
import com.tencent.mm.ui.base.p.b;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.v;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.k;

public final class m
  extends q
{
  public LayoutInflater CJ;
  public boolean pYc;
  public p.c qik;
  public p.d qil;
  public n qim;
  public p.a xhT;
  public p.b xhU;
  private a xhY;
  
  public m(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1910992011264L, 14238);
    this.pYc = true;
    this.CJ = v.fb(paramContext);
    this.qim = new n();
    GMTrace.o(1910992011264L, 14238);
  }
  
  protected final BaseAdapter aiO()
  {
    GMTrace.i(1911394664448L, 14241);
    if (this.xhY == null) {
      this.xhY = new a((byte)0);
    }
    a locala = this.xhY;
    GMTrace.o(1911394664448L, 14241);
    return locala;
  }
  
  public final boolean dK()
  {
    GMTrace.i(1911126228992L, 14239);
    if (this.qik != null) {
      this.qik.a(this.qim);
    }
    if ((this.qim.Kq != null) && (this.qim.Kq.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.pYc = bool;
      bool = super.dK();
      GMTrace.o(1911126228992L, 14239);
      return bool;
    }
  }
  
  public final CharSequence getTitle()
  {
    GMTrace.i(16088679055360L, 119870);
    if ((this.qim.Kq == null) || (this.qim.Kq.length() == 0))
    {
      localObject = this.mContext.getResources().getString(a.k.ggg);
      GMTrace.o(16088679055360L, 119870);
      return (CharSequence)localObject;
    }
    Object localObject = this.qim.Kq;
    GMTrace.o(16088679055360L, 119870);
    return (CharSequence)localObject;
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(1911260446720L, 14240);
    if ((this.pYc) && (paramInt == 0))
    {
      GMTrace.o(1911260446720L, 14240);
      return;
    }
    int i = paramInt;
    if (this.pYc) {
      i = paramInt - 1;
    }
    if (this.qil != null) {
      this.qil.c(this.qim.getItem(i), i);
    }
    dismiss();
    GMTrace.o(1911260446720L, 14240);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(1948572975104L, 14518);
      GMTrace.o(1948572975104L, 14518);
    }
    
    public final int getCount()
    {
      GMTrace.i(1948707192832L, 14519);
      if (m.this.pYc)
      {
        i = m.this.qim.size();
        GMTrace.o(1948707192832L, 14519);
        return i + 1;
      }
      int i = m.this.qim.size();
      GMTrace.o(1948707192832L, 14519);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(1948841410560L, 14520);
      GMTrace.o(1948841410560L, 14520);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(1948975628288L, 14521);
      GMTrace.o(1948975628288L, 14521);
      return 0L;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(1949109846016L, 14522);
      if (m.this.pYc)
      {
        if (paramInt == 0)
        {
          GMTrace.o(1949109846016L, 14522);
          return 0;
        }
        GMTrace.o(1949109846016L, 14522);
        return 1;
      }
      GMTrace.o(1949109846016L, 14522);
      return 1;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(1949378281472L, 14524);
      if ((m.this.pYc) && (paramInt == 0)) {
        if (paramView == null)
        {
          paramView = m.this.CJ.inflate(a.h.gfJ, paramViewGroup, false);
          paramViewGroup = new a();
          paramViewGroup.ikm = ((TextView)paramView.findViewById(a.g.title));
          paramViewGroup.iCr = ((ImageView)paramView.findViewById(a.g.icon));
          paramView.setTag(paramViewGroup);
          paramViewGroup.ikm.setText(m.this.getTitle());
        }
      }
      for (;;)
      {
        GMTrace.o(1949378281472L, 14524);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        int i = paramInt;
        if (m.this.pYc) {
          i = paramInt - 1;
        }
        label212:
        MenuItem localMenuItem;
        if (paramView == null)
        {
          paramView = m.this.CJ.inflate(a.h.cCn, paramViewGroup, false);
          paramViewGroup = new a();
          paramViewGroup.ikm = ((TextView)paramView.findViewById(a.g.title));
          paramViewGroup.iCr = ((ImageView)paramView.findViewById(a.g.icon));
          paramViewGroup.pKI = paramView.findViewById(a.g.bZf);
          paramView.setTag(paramViewGroup);
          localMenuItem = m.this.qim.getItem(i);
          paramViewGroup.ikm.setText(localMenuItem.getTitle());
          if (localMenuItem.getIcon() == null) {
            break label341;
          }
          paramViewGroup.iCr.setVisibility(0);
          paramViewGroup.iCr.setImageDrawable(localMenuItem.getIcon());
        }
        for (;;)
        {
          if (m.this.xhU != null) {
            m.this.xhU.a(paramViewGroup.ikm, localMenuItem);
          }
          if (i != m.this.qim.size() - 1) {
            break label392;
          }
          paramViewGroup.pKI.setBackgroundResource(a.f.baI);
          break;
          paramViewGroup = (a)paramView.getTag();
          break label212;
          label341:
          if (m.this.xhT != null)
          {
            paramViewGroup.iCr.setVisibility(0);
            m.this.xhT.a(paramViewGroup.iCr, localMenuItem);
          }
          else
          {
            paramViewGroup.iCr.setVisibility(8);
          }
        }
        label392:
        paramViewGroup.pKI.setBackgroundResource(a.f.baH);
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(1949244063744L, 14523);
      if (m.this.pYc)
      {
        GMTrace.o(1949244063744L, 14523);
        return 2;
      }
      GMTrace.o(1949244063744L, 14523);
      return 1;
    }
    
    private final class a
    {
      ImageView iCr;
      TextView ikm;
      View pKI;
      
      public a()
      {
        GMTrace.i(1995012308992L, 14864);
        GMTrace.o(1995012308992L, 14864);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */