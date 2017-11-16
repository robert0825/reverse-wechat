package com.tencent.mm.plugin.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  implements o
{
  public static volatile m hnH;
  public static volatile l hnI;
  
  public a()
  {
    GMTrace.i(8931652927488L, 66546);
    GMTrace.o(8931652927488L, 66546);
  }
  
  public final void a(l paraml)
  {
    GMTrace.i(8931921362944L, 66548);
    w.i("MicroMsg.AccountSyncApplication", "regitMMModelCallback %s", new Object[] { paraml });
    hnI = paraml;
    GMTrace.o(8931921362944L, 66548);
  }
  
  public final void a(m paramm)
  {
    GMTrace.i(8931787145216L, 66547);
    hnH = paramm;
    GMTrace.o(8931787145216L, 66547);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */