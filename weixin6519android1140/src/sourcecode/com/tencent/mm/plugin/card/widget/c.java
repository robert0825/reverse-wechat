package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import java.util.LinkedList;

public final class c
  extends a
{
  protected TextView jLT;
  protected TextView jLU;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4887538565120L, 36415);
    GMTrace.o(4887538565120L, 36415);
  }
  
  protected final void ane()
  {
    GMTrace.i(4887672782848L, 36416);
    this.jLU = ((TextView)and().findViewById(R.h.bjf));
    this.jLT = ((TextView)and().findViewById(R.h.blE));
    GMTrace.o(4887672782848L, 36416);
  }
  
  protected final void anf()
  {
    GMTrace.i(4887807000576L, 36417);
    if ((this.jwZ.ajv().tZI != null) && (this.jwZ.ajv().tZI.size() > 0))
    {
      np localnp = (np)this.jwZ.ajv().tZI.get(0);
      if (this.jLK != null) {
        this.jLK.setText(localnp.title);
      }
      if (this.jLT != null)
      {
        if (TextUtils.isEmpty(localnp.jxI)) {
          break label144;
        }
        this.jLT.setText(localnp.jxI);
      }
      while (this.jLU != null) {
        if (!TextUtils.isEmpty(localnp.jxJ))
        {
          this.jLU.setText(localnp.jxJ);
          GMTrace.o(4887807000576L, 36417);
          return;
          label144:
          this.jLT.setVisibility(8);
        }
        else
        {
          this.jLU.setVisibility(8);
        }
      }
    }
    GMTrace.o(4887807000576L, 36417);
  }
  
  public final void l(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4887941218304L, 36418);
    GMTrace.o(4887941218304L, 36418);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */