package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.a;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.protocal.c.afo;
import com.tencent.mm.protocal.c.afp;
import com.tencent.mm.protocal.c.um;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends a<afo, afp>
{
  public List<String> kCq;
  public List<String> kCr;
  public List<String> kCs;
  private final WeakReference<b<k>> kxl;
  
  public k(b<k> paramb)
  {
    GMTrace.i(11185571233792L, 83339);
    this.kxl = new WeakReference(paramb);
    GMTrace.o(11185571233792L, 83339);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11185839669248L, 83341);
    w.d("MicroMsg.NetSceneGetWeRunFollowerList", "ap: errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      Object localObject1 = (afp)afr();
      this.kCs = new ArrayList();
      Object localObject2 = ((afp)localObject1).uvq.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        at.AR();
        if (c.yK().TA(str)) {
          this.kCs.add(str);
        }
      }
      this.kCq = new ArrayList();
      this.kCr = new ArrayList();
      if (((afp)localObject1).uvr != null)
      {
        localObject1 = ((afp)localObject1).uvr.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (um)((Iterator)localObject1).next();
          if (((um)localObject2).umO) {
            this.kCr.add(((um)localObject2).username);
          }
          at.AR();
          if (c.yK().TA(((um)localObject2).username)) {
            this.kCq.add(((um)localObject2).username);
          }
        }
      }
      w.d("MicroMsg.NetSceneGetWeRunFollowerList", "follow:%s %s", new Object[] { Integer.valueOf(this.kCr.size()), this.kCr.toString() });
      w.d("MicroMsg.NetSceneGetWeRunFollowerList", "all follow:%s %s", new Object[] { Integer.valueOf(this.kCq.size()), this.kCq });
    }
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    paramq = (b)this.kxl.get();
    if (paramq != null)
    {
      w.d("MicroMsg.NetSceneGetWeRunFollowerList", "callback is not null");
      paramq.b(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11185839669248L, 83341);
      return;
    }
    w.d("MicroMsg.NetSceneGetWeRunFollowerList", "callback is null");
    GMTrace.o(11185839669248L, 83341);
  }
  
  public final int getType()
  {
    GMTrace.i(11185705451520L, 83340);
    GMTrace.o(11185705451520L, 83340);
    return 1758;
  }
  
  protected final String getUri()
  {
    GMTrace.i(11185973886976L, 83342);
    GMTrace.o(11185973886976L, 83342);
    return "/cgi-bin/mmoc-bin/hardware/getwerunfollowerlist";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */