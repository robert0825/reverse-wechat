package com.tencent.mm.s;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import java.util.ArrayList;
import java.util.HashMap;

public final class c
  implements aq
{
  private static c fUG;
  private a fUH;
  
  private c()
  {
    GMTrace.i(1425794924544L, 10623);
    if (a.fUl == null) {
      a.fUl = new a();
    }
    this.fUH = a.fUl;
    GMTrace.o(1425794924544L, 10623);
  }
  
  public static a vK()
  {
    GMTrace.i(14594164654080L, 108735);
    h.xw().wG();
    if (fUG == null)
    {
      localObject = new c();
      fUG = (c)localObject;
      ((c)localObject).fUH.init();
    }
    Object localObject = fUG.fUH;
    GMTrace.o(14594164654080L, 108735);
    return (a)localObject;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(1426197577728L, 10626);
    this.fUH.init();
    GMTrace.o(1426197577728L, 10626);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(1426331795456L, 10627);
    GMTrace.o(1426331795456L, 10627);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(1426063360000L, 10625);
    GMTrace.o(1426063360000L, 10625);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(1425929142272L, 10624);
    a locala = this.fUH;
    locala.fUn.clear();
    b localb = locala.fUm;
    w.d("MicroMsg.NewBadgeDecoder", "[carl] decoder.clear()");
    localb.fUw.clear();
    localb.fUy.clear();
    localb.fUx.clear();
    localb.fUz.clear();
    locala.fUo = false;
    GMTrace.o(1425929142272L, 10624);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(1426466013184L, 10628);
    GMTrace.o(1426466013184L, 10628);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\s\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */