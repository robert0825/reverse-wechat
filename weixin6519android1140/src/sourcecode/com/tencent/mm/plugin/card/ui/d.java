package com.tencent.mm.plugin.card.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.model.al;

public final class d
  implements a
{
  private c jEf;
  
  public d(c paramc)
  {
    GMTrace.i(5028601397248L, 37466);
    this.jEf = paramc;
    GMTrace.o(5028601397248L, 37466);
  }
  
  public final void Bf()
  {
    GMTrace.i(5029004050432L, 37469);
    if (this.jEf != null) {
      this.jEf.a(null, null);
    }
    GMTrace.o(5029004050432L, 37469);
  }
  
  public final void onCreate()
  {
    GMTrace.i(5028735614976L, 37467);
    if (this.jEf != null) {
      al.akn().c(this.jEf);
    }
    GMTrace.o(5028735614976L, 37467);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(5028869832704L, 37468);
    if (this.jEf != null)
    {
      al.akn().j(this.jEf);
      this.jEf.release();
      this.jEf = null;
    }
    GMTrace.o(5028869832704L, 37468);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */