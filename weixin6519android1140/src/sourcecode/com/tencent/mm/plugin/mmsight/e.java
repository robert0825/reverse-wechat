package com.tencent.mm.plugin.mmsight;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.po;
import com.tencent.mm.g.a.px;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.x.a;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.model.m;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import java.util.HashMap;
import java.util.List;

public class e
  implements aq
{
  private m mWX;
  private c mWY;
  private c mWZ;
  
  public e()
  {
    GMTrace.i(18673712496640L, 139130);
    this.mWX = new m();
    this.mWY = new c() {};
    this.mWZ = new c() {};
    GMTrace.o(18673712496640L, 139130);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(18674115149824L, 139133);
    x.a locala = o.Nm();
    m localm = this.mWX;
    w.k("MicroMsg.VideoService", "addVideoMsgSendCallback %s", new Object[] { localm });
    if ((localm != null) && (locala.hdc != null) && (!locala.hdc.contains(localm))) {
      locala.hdc.add(localm);
    }
    a.vgX.a(this.mWZ);
    a.vgX.b(this.mWY);
    GMTrace.o(18674115149824L, 139133);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(18674249367552L, 139134);
    GMTrace.o(18674249367552L, 139134);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(18673980932096L, 139132);
    GMTrace.o(18673980932096L, 139132);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(18674383585280L, 139135);
    x.a locala = o.Nm();
    m localm = this.mWX;
    if ((localm != null) && (locala.hdc != null)) {
      locala.hdc.remove(localm);
    }
    a.vgX.c(this.mWZ);
    j.naP.ye();
    a.vgX.c(this.mWY);
    GMTrace.o(18674383585280L, 139135);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(18673846714368L, 139131);
    GMTrace.o(18673846714368L, 139131);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */