package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.z;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;

public final class g
  extends LinearLayoutManager
{
  public g(Context paramContext)
  {
    GMTrace.i(15099360182272L, 112499);
    GMTrace.o(15099360182272L, 112499);
  }
  
  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    GMTrace.i(15099494400000L, 112500);
    paramRecyclerView = new z(paramRecyclerView.getContext())
    {
      protected final float a(DisplayMetrics paramAnonymousDisplayMetrics)
      {
        GMTrace.i(15091307118592L, 112439);
        float f = 50.0F / paramAnonymousDisplayMetrics.densityDpi;
        GMTrace.o(15091307118592L, 112439);
        return f;
      }
      
      public final PointF aW(int paramAnonymousInt)
      {
        GMTrace.i(15091172900864L, 112438);
        PointF localPointF = g.this.aW(paramAnonymousInt);
        GMTrace.o(15091172900864L, 112438);
        return localPointF;
      }
    };
    paramRecyclerView.Uw = paramInt;
    a(paramRecyclerView);
    GMTrace.o(15099494400000L, 112500);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */