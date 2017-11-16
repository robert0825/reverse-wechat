package com.tencent.mm.plugin.voip_cs.c;

import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public aj htb;
  public TextView jU;
  public int qLA;
  public int[] qLy;
  public int qLz;
  
  public a()
  {
    GMTrace.i(11282610651136L, 84062);
    this.htb = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(11282476433408L, 84061);
        int i = a.this.qLy[(a.this.qLA % a.this.qLy.length)];
        if (a.this.jU != null)
        {
          if (-1 != i) {
            break label84;
          }
          a.this.jU.setText(null);
        }
        for (;;)
        {
          a locala = a.this;
          locala.qLA += 1;
          GMTrace.o(11282476433408L, 84061);
          return true;
          label84:
          a.this.jU.setText(i);
        }
      }
    }, true);
    GMTrace.o(11282610651136L, 84062);
  }
  
  public final void bvA()
  {
    GMTrace.i(11282744868864L, 84063);
    if (this.htb != null) {
      this.htb.stopTimer();
    }
    w.j("MicroMsg.DynamicTextWrap", "stop textview: " + this.jU, new Object[0]);
    this.jU = null;
    GMTrace.o(11282744868864L, 84063);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */