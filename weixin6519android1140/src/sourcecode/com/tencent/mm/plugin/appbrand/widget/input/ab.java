package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.view.z;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.page.r;

public final class ab
{
  public final ViewGroup iNZ;
  public boolean iOa;
  public boolean iOb;
  public boolean iOc;
  public final a<ViewGroup, e> iOd;
  public final a<ViewGroup, r> iOe;
  
  public ab(ViewGroup paramViewGroup)
  {
    GMTrace.i(20751537143808L, 154611);
    this.iOa = false;
    this.iOb = false;
    this.iOc = false;
    this.iOd = new a()
    {
      final boolean bY(View paramAnonymousView)
      {
        GMTrace.i(19882208919552L, 148134);
        if (paramAnonymousView.getId() == o.f.hBe)
        {
          GMTrace.o(19882208919552L, 148134);
          return true;
        }
        GMTrace.o(19882208919552L, 148134);
        return false;
      }
    };
    this.iOe = new a()
    {
      final boolean bY(View paramAnonymousView)
      {
        GMTrace.i(19880598306816L, 148122);
        boolean bool = paramAnonymousView instanceof r;
        GMTrace.o(19880598306816L, 148122);
        return bool;
      }
    };
    this.iNZ = paramViewGroup;
    GMTrace.o(20751537143808L, 154611);
  }
  
  private static abstract class a<Source extends View, Target extends View>
  {
    private Target mN;
    
    public a()
    {
      GMTrace.i(19880866742272L, 148124);
      GMTrace.o(19880866742272L, 148124);
    }
    
    abstract boolean bY(View paramView);
    
    abstract Target bZ(View paramView);
    
    public final Target ca(Source paramSource)
    {
      GMTrace.i(19881000960000L, 148125);
      if ((this.mN != null) && (z.al(this.mN)))
      {
        paramSource = this.mN;
        GMTrace.o(19881000960000L, 148125);
        return paramSource;
      }
      Object localObject = paramSource;
      if (!z.al(paramSource))
      {
        GMTrace.o(19881000960000L, 148125);
        return null;
      }
      do
      {
        localObject = (View)((View)localObject).getParent();
      } while ((localObject != null) && (!bY((View)localObject)));
      if (localObject == null)
      {
        GMTrace.o(19881000960000L, 148125);
        return null;
      }
      paramSource = bZ((View)localObject);
      this.mN = paramSource;
      GMTrace.o(19881000960000L, 148125);
      return paramSource;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */