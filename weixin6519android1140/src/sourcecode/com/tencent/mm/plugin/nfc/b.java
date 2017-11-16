package com.tencent.mm.plugin.nfc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.y.aq;
import java.util.HashMap;

public final class b
  implements aq
{
  private static com.tencent.mm.plugin.hce.a.a nwW;
  
  static
  {
    GMTrace.i(20508871491584L, 152803);
    nwW = new com.tencent.mm.plugin.hce.a.a();
    GMTrace.o(20508871491584L, 152803);
  }
  
  public b()
  {
    GMTrace.i(8965207359488L, 66796);
    GMTrace.o(8965207359488L, 66796);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(8965744230400L, 66800);
    if (!com.tencent.mm.sdk.b.a.vgX.d(nwW)) {
      com.tencent.mm.sdk.b.a.vgX.a(nwW);
    }
    GMTrace.o(8965744230400L, 66800);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(8965610012672L, 66799);
    GMTrace.o(8965610012672L, 66799);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(8965475794944L, 66798);
    GMTrace.o(8965475794944L, 66798);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(8965878448128L, 66801);
    if (com.tencent.mm.sdk.b.a.vgX.d(nwW)) {
      com.tencent.mm.sdk.b.a.vgX.c(nwW);
    }
    GMTrace.o(8965878448128L, 66801);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(8965341577216L, 66797);
    GMTrace.o(8965341577216L, 66797);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */