package com.tencent.mm.plugin.freewifi.d;

import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.anj;
import com.tencent.mm.protocal.c.ank;
import com.tencent.mm.protocal.c.anl;
import java.util.LinkedList;

public final class j
  extends c
{
  public j(LinkedList<anl> paramLinkedList, int paramInt)
  {
    GMTrace.i(7248965271552L, 54009);
    aBl();
    anj localanj = (anj)this.fUa.gtC.gtK;
    localanj.uCm = Build.BRAND;
    localanj.uCl = paramInt;
    localanj.uCk = paramLinkedList;
    GMTrace.o(7248965271552L, 54009);
  }
  
  protected final void aBl()
  {
    GMTrace.i(7248696836096L, 54007);
    b.a locala = new b.a();
    locala.gtF = new anj();
    locala.gtG = new ank();
    locala.uri = "/cgi-bin/mmo2o-bin/manufacturerapinfo";
    locala.gtE = 1707;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7248696836096L, 54007);
  }
  
  public final ank aBy()
  {
    GMTrace.i(7249099489280L, 54010);
    ank localank = (ank)this.fUa.gtD.gtK;
    GMTrace.o(7249099489280L, 54010);
    return localank;
  }
  
  public final int getType()
  {
    GMTrace.i(7248831053824L, 54008);
    GMTrace.o(7248831053824L, 54008);
    return 1707;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */