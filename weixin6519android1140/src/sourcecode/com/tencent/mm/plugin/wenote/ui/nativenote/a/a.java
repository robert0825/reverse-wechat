package com.tencent.mm.plugin.wenote.ui.nativenote.a;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.RecyclerView.q;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
  extends LinearLayoutManager
{
  private final int sjh;
  public int sji;
  public boolean sjj;
  
  public a(Context paramContext)
  {
    GMTrace.i(17161884008448L, 127866);
    this.sjh = j.b(ab.getContext(), true);
    this.sji = -1;
    this.sjj = false;
    GMTrace.o(17161884008448L, 127866);
  }
  
  protected final int a(RecyclerView.q paramq)
  {
    GMTrace.i(17162152443904L, 127868);
    if (this.sji > 0)
    {
      int i = this.sji;
      GMTrace.o(17162152443904L, 127868);
      return i;
    }
    GMTrace.o(17162152443904L, 127868);
    return 900;
  }
  
  public final int b(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
  {
    int j = 1;
    GMTrace.i(17162018226176L, 127867);
    if (!this.sjj)
    {
      paramInt = super.b(paramInt, paramm, paramq);
      GMTrace.o(17162018226176L, 127867);
      return paramInt;
    }
    int i;
    if (paramInt < 0) {
      if (k.ak(49.0F) <= Math.abs(paramInt)) {
        i = 1;
      }
    }
    for (;;)
    {
      if (paramInt > 0) {
        if (this.sjh + k.ak(49.0F) < paramInt) {
          i = j;
        }
      }
      for (;;)
      {
        if ((i != 0) && (this.sjj))
        {
          GMTrace.o(17162018226176L, 127867);
          return 0;
          i = 0;
          break;
          i = 0;
          continue;
        }
        try
        {
          paramInt = super.b(paramInt, paramm, paramq);
          GMTrace.o(17162018226176L, 127867);
          return paramInt;
        }
        catch (Exception paramm)
        {
          GMTrace.o(17162018226176L, 127867);
          return 0;
        }
      }
      i = 0;
    }
  }
  
  public final void c(RecyclerView.m paramm, RecyclerView.q paramq)
  {
    GMTrace.i(17162286661632L, 127869);
    try
    {
      super.c(paramm, paramq);
      GMTrace.o(17162286661632L, 127869);
      return;
    }
    catch (IndexOutOfBoundsException paramm)
    {
      GMTrace.o(17162286661632L, 127869);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */