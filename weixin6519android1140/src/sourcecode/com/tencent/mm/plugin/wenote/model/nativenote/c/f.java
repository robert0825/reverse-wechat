package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;

public final class f
{
  public static c cQ(View paramView)
  {
    GMTrace.i(20618930028544L, 153623);
    if (paramView == null)
    {
      GMTrace.o(20618930028544L, 153623);
      return null;
    }
    WXRTEditText localWXRTEditText1 = (WXRTEditText)paramView.findViewById(R.h.bZm);
    WXRTEditText localWXRTEditText2 = (WXRTEditText)paramView.findViewById(R.h.biA);
    paramView = (WXRTEditText)paramView.findViewById(R.h.biy);
    if (localWXRTEditText1 != null) {
      paramView = new c(localWXRTEditText1);
    }
    for (;;)
    {
      GMTrace.o(20618930028544L, 153623);
      return paramView;
      if ((localWXRTEditText2 != null) && (paramView != null)) {
        paramView = new c(localWXRTEditText2, paramView);
      } else {
        paramView = null;
      }
    }
  }
  
  public static View g(RecyclerView paramRecyclerView, int paramInt)
  {
    GMTrace.i(20618795810816L, 153622);
    if (paramRecyclerView == null)
    {
      GMTrace.o(20618795810816L, 153622);
      return null;
    }
    try
    {
      paramRecyclerView = paramRecyclerView.SW;
      if ((paramRecyclerView instanceof LinearLayoutManager))
      {
        paramRecyclerView = ((LinearLayoutManager)paramRecyclerView).aV(paramInt);
        GMTrace.o(20618795810816L, 153622);
        return paramRecyclerView;
      }
    }
    catch (Exception paramRecyclerView)
    {
      for (;;)
      {
        paramRecyclerView = null;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */