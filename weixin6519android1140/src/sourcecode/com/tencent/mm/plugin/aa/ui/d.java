package com.tencent.mm.plugin.aa.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.o;
import java.util.List;

public final class d
  extends o
{
  private String chatroomName;
  private List<String> hqV;
  
  public d(l paraml, String paramString)
  {
    super(paraml, null, true, true);
    GMTrace.i(5634728656896L, 41982);
    this.chatroomName = paramString;
    w.i("MicroMsg.AASelectInitAdapter", "resetData");
    this.hqV = com.tencent.mm.plugin.aa.a.h.ns(this.chatroomName);
    GMTrace.o(5634728656896L, 41982);
  }
  
  public final int getCount()
  {
    GMTrace.i(5634997092352L, 41984);
    int i = this.hqV.size();
    GMTrace.o(5634997092352L, 41984);
    return i;
  }
  
  protected final a hG(int paramInt)
  {
    GMTrace.i(5634862874624L, 41983);
    Object localObject = (String)this.hqV.get(paramInt);
    com.tencent.mm.kernel.h.xz();
    localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject);
    c localc = new c(paramInt);
    localc.eCK = this.chatroomName;
    localc.iBi = ((x)localObject);
    localc.wSC = true;
    GMTrace.o(5634862874624L, 41983);
    return localc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */