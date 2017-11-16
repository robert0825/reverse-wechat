package com.tencent.mm.plugin.multitalk.ui.widget;

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
  public static final int noh;
  public static final int noi;
  public static final int noj;
  public static final int nok;
  public static final int nol;
  private static int nom;
  
  static
  {
    GMTrace.i(4773856149504L, 35568);
    nob = a.fromDPToPix(ab.getContext(), 3);
    noc = a.fromDPToPix(ab.getContext(), 4);
    nod = a.fromDPToPix(ab.getContext(), 8);
    noe = a.fromDPToPix(ab.getContext(), 10);
    nof = a.fromDPToPix(ab.getContext(), 14);
    nog = a.fromDPToPix(ab.getContext(), 30);
    noh = a.fromDPToPix(ab.getContext(), 26);
    noi = a.fromDPToPix(ab.getContext(), 32);
    noj = a.fromDPToPix(ab.getContext(), 96);
    nok = a.fromDPToPix(ab.getContext(), 76);
    nol = a.fromDPToPix(ab.getContext(), 230);
    nom = 0;
    GMTrace.o(4773856149504L, 35568);
  }
  
  public static int cS(Context paramContext)
  {
    GMTrace.i(4773721931776L, 35567);
    if (nom == 0) {
      nom = a.eg(paramContext) - nol;
    }
    int i = nom;
    GMTrace.o(4773721931776L, 35567);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\ui\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */