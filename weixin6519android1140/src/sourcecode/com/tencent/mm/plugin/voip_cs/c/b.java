package com.tencent.mm.plugin.voip_cs.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  public static final int nob;
  public static final int noc;
  public static final int nod;
  public static final int noe;
  public static final int nof;
  public static final int nog;
  public static final int noi;
  public static final int noj;
  public static final int nok;
  public static final int nol;
  private static int qTc;
  
  static
  {
    GMTrace.i(11282207997952L, 84059);
    nob = a.fromDPToPix(ab.getContext(), 3);
    noc = a.fromDPToPix(ab.getContext(), 4);
    nod = a.fromDPToPix(ab.getContext(), 8);
    noe = a.fromDPToPix(ab.getContext(), 10);
    nof = a.fromDPToPix(ab.getContext(), 14);
    nog = a.fromDPToPix(ab.getContext(), 30);
    noi = a.fromDPToPix(ab.getContext(), 32);
    noj = a.fromDPToPix(ab.getContext(), 96);
    nok = a.fromDPToPix(ab.getContext(), 76);
    nol = a.fromDPToPix(ab.getContext(), 230);
    qTc = 0;
    GMTrace.o(11282207997952L, 84059);
  }
  
  public static int dp(Context paramContext)
  {
    GMTrace.i(11282073780224L, 84058);
    if (qTc == 0) {
      qTc = a.eg(paramContext);
    }
    int i = qTc;
    GMTrace.o(11282073780224L, 84058);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */