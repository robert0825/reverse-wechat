package com.tencent.mm.plugin.facedetect;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.model.i;
import com.tencent.mm.plugin.facedetect.model.j;
import com.tencent.mm.plugin.facedetect.model.m;
import com.tencent.mm.plugin.facedetect.model.n;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class b
  implements com.tencent.mm.vending.c.a<Void, Void>
{
  private static j kRo;
  private static m kRp;
  private static i kRq;
  private com.tencent.mm.vending.g.b how;
  
  static
  {
    GMTrace.i(19906502328320L, 148315);
    kRo = new j();
    kRp = new m();
    kRq = new i();
    GMTrace.o(19906502328320L, 148315);
  }
  
  public b()
  {
    GMTrace.i(19906099675136L, 148312);
    this.how = null;
    GMTrace.o(19906099675136L, 148312);
  }
  
  private static void safeAddListener(c paramc)
  {
    GMTrace.i(19906233892864L, 148313);
    if (paramc == null)
    {
      w.w("MicroMsg.TaskInitFace", "hy: listener is null or id is invalid");
      GMTrace.o(19906233892864L, 148313);
      return;
    }
    if (com.tencent.mm.sdk.b.a.vgX.d(paramc))
    {
      w.w("MicroMsg.TaskInitFace", "hy: already has listener");
      GMTrace.o(19906233892864L, 148313);
      return;
    }
    com.tencent.mm.sdk.b.a.vgX.b(paramc);
    GMTrace.o(19906233892864L, 148313);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */