package com.tencent.mm.view.footer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bg.a.g;
import com.tencent.mm.bl.b;

public final class c
  extends a
{
  private Bitmap xBH;
  private Bitmap xBI;
  
  public c(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
    GMTrace.i(19632966598656L, 146277);
    GMTrace.o(19632966598656L, 146277);
  }
  
  protected final boolean EG(int paramInt)
  {
    GMTrace.i(19633100816384L, 146278);
    boolean bool = super.EG(paramInt);
    switch (1.tJj[EF(paramInt).ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(19633100816384L, 146278);
      return bool;
      bool = false;
    }
  }
  
  protected final Bitmap a(com.tencent.mm.api.d paramd, boolean paramBoolean)
  {
    GMTrace.i(19632832380928L, 146276);
    Bitmap localBitmap = null;
    if (paramd == com.tencent.mm.api.d.eqD) {
      if (!paramBoolean) {
        break label36;
      }
    }
    label36:
    for (localBitmap = this.xBI;; localBitmap = this.xBH)
    {
      GMTrace.o(19632832380928L, 146276);
      return localBitmap;
    }
  }
  
  protected final void ckU()
  {
    GMTrace.i(19632698163200L, 146275);
    super.ckU();
    this.xBH = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlu));
    this.xBI = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlt));
    GMTrace.o(19632698163200L, 146275);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\view\footer\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */