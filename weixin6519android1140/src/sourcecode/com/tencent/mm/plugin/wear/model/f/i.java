package com.tencent.mm.plugin.wear.model.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.c.bsl;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public final class i
  extends c
{
  private ArrayList<Integer> rAN;
  private boolean sh;
  
  public i()
  {
    GMTrace.i(9189485182976L, 68467);
    this.sh = true;
    GMTrace.o(9189485182976L, 68467);
  }
  
  public i(ArrayList<Integer> paramArrayList)
  {
    GMTrace.i(9189619400704L, 68468);
    this.rAN = paramArrayList;
    this.sh = false;
    GMTrace.o(9189619400704L, 68468);
  }
  
  public final String getName()
  {
    GMTrace.i(9189753618432L, 68469);
    GMTrace.o(9189753618432L, 68469);
    return "WearCancelNotificationTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9189887836160L, 68470);
    w.i("MicroMsg.WearCancelNotificationTask", "Id List=%s", new Object[] { this.rAN });
    bsl localbsl = new bsl();
    if (this.rAN != null) {
      localbsl.vbF.addAll(this.rAN);
    }
    localbsl.vbG = this.sh;
    try
    {
      a.bBm();
      r.a(20004, localbsl.toByteArray(), false);
      GMTrace.o(9189887836160L, 68470);
      return;
    }
    catch (IOException localIOException)
    {
      GMTrace.o(9189887836160L, 68470);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\f\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */