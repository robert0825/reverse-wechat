package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.widget.input.b.a.b;
import com.tencent.mm.plugin.appbrand.widget.input.y;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.List;

final class a
  extends ArrayAdapter<a.b>
  implements g
{
  private final LayoutInflater CJ;
  private b iOv;
  h iOw;
  private boolean iOx;
  
  a(Context paramContext, List<a.b> paramList)
  {
    super(paramContext, o.g.hCS, paramList);
    GMTrace.i(18262469378048L, 136066);
    this.iOx = false;
    this.CJ = LayoutInflater.from(paramContext);
    GMTrace.o(18262469378048L, 136066);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(18262737813504L, 136068);
    this.iOv = paramb;
    this.iOv.setOnDismissListener(new PopupWindow.OnDismissListener()
    {
      public final void onDismiss()
      {
        GMTrace.i(18265690603520L, 136090);
        if ((a.a(a.this) != null) && (!a.b(a.this))) {
          a.a(a.this).a("", h.a.iPh);
        }
        GMTrace.o(18265690603520L, 136090);
      }
    });
    GMTrace.o(18262737813504L, 136068);
  }
  
  public final void adp()
  {
    GMTrace.i(18262872031232L, 136069);
    this.iOv.setOnDismissListener(null);
    this.iOv = null;
    GMTrace.o(18262872031232L, 136069);
  }
  
  public final Filter getFilter()
  {
    GMTrace.i(18263140466688L, 136071);
    Filter localFilter = super.getFilter();
    GMTrace.o(18263140466688L, 136071);
    return localFilter;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int j = 8;
    GMTrace.i(18263006248960L, 136070);
    View localView = paramView;
    if (paramView == null) {
      localView = this.CJ.inflate(o.g.hCS, paramViewGroup, false);
    }
    paramView = (a)localView.getTag();
    if (paramView == null)
    {
      paramView = new a(localView);
      localView.setTag(paramView);
    }
    for (;;)
    {
      paramViewGroup = (a.b)getItem(paramInt);
      paramView.iOC = paramViewGroup;
      paramView.iOz.setText(paramViewGroup.title);
      paramView.iOA.setText(paramViewGroup.content);
      TextView localTextView = paramView.iOA;
      int i;
      if (bg.nm(paramViewGroup.content))
      {
        i = 8;
        localTextView.setVisibility(i);
        paramView = paramView.hrj;
        if (paramInt != getCount() - 1) {
          break label166;
        }
      }
      label166:
      for (paramInt = j;; paramInt = 0)
      {
        paramView.setVisibility(paramInt);
        GMTrace.o(18263006248960L, 136070);
        return localView;
        i = 0;
        break;
      }
    }
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(18262603595776L, 136067);
    super.notifyDataSetChanged();
    GMTrace.o(18262603595776L, 136067);
  }
  
  private final class a
    implements View.OnClickListener
  {
    View UU;
    View hrj;
    TextView iOA;
    View iOB;
    a.b iOC;
    TextView iOz;
    
    a(View paramView)
    {
      GMTrace.i(18257637539840L, 136030);
      this.UU = paramView;
      this.iOz = ((TextView)paramView.findViewById(o.f.title));
      this.iOA = ((TextView)paramView.findViewById(o.f.content));
      this.iOB = paramView.findViewById(o.f.hBs);
      this.hrj = paramView.findViewById(o.f.divider);
      paramView.setBackgroundResource(o.e.aYX);
      paramView.setOnClickListener(this);
      this.iOB.setOnClickListener(this);
      GMTrace.o(18257637539840L, 136030);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(18257771757568L, 136031);
      if (this.iOC != null) {
        if (paramView.getId() == o.f.hBs)
        {
          a.this.remove(this.iOC);
          if (a.a(a.this) != null)
          {
            a.a(a.this).a(this.iOC.id, h.a.iPi);
            GMTrace.o(18257771757568L, 136031);
          }
        }
        else if ((paramView == this.UU) && (a.a(a.this) != null))
        {
          if (this.iOC != null) {
            a.a(a.this).a(this.iOC.id, h.a.iPj);
          }
          a.c(a.this);
          if (a.d(a.this) != null) {
            a.d(a.this).iOD.getView().clearFocus();
          }
        }
      }
      GMTrace.o(18257771757568L, 136031);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\autofill\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */