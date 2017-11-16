package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.g;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.bry;
import com.tencent.mm.protocal.c.brz;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.LinkedList;

public final class f
  extends c
{
  private String eCQ;
  private int type;
  private String username;
  
  public f(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(9188679876608L, 68461);
    this.username = paramString1;
    this.eCQ = paramString2;
    this.type = paramInt;
    GMTrace.o(9188679876608L, 68461);
  }
  
  public final String getName()
  {
    GMTrace.i(9188948312064L, 68463);
    GMTrace.o(9188948312064L, 68463);
    return "WearFriendCreateTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9188814094336L, 68462);
    Object localObject = a.bBm().rzv.KS(this.username);
    brz localbrz = new brz();
    if (this.type == 1)
    {
      bry localbry = new bry();
      localbry.lSW = ((com.tencent.mm.plugin.wear.model.f)localObject).id;
      localbry.jhi = this.username;
      localbry.jio = this.eCQ;
      localbry.nIp = ab.getContext().getString(R.l.dMy);
      localObject = com.tencent.mm.ac.b.a(this.username, false, -1);
      if (localObject != null) {
        localbry.vbn = new com.tencent.mm.bm.b(h.K((Bitmap)localObject));
      }
      localbrz.jhd.add(localbry);
    }
    try
    {
      a.bBm();
      r.a(20006, localbrz.toByteArray(), true);
      GMTrace.o(9188814094336L, 68462);
      return;
    }
    catch (IOException localIOException)
    {
      GMTrace.o(9188814094336L, 68462);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */