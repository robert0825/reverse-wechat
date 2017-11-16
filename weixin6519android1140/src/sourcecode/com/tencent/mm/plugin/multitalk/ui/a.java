package com.tencent.mm.plugin.multitalk.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.List;

public final class a
  extends o
{
  private String chatroomName;
  private List<String> hqV;
  
  public a(l paraml, String paramString)
  {
    super(paraml, null, true, true);
    GMTrace.i(4791572889600L, 35700);
    this.chatroomName = paramString;
    w.i("MicroMsg.multitalk.MultiTalkSelectInitAdapter", "resetData");
    at.AR();
    this.hqV = c.yT().gG(this.chatroomName);
    if (this.hqV == null) {
      this.hqV = new ArrayList();
    }
    GMTrace.o(4791572889600L, 35700);
  }
  
  public final int getCount()
  {
    GMTrace.i(4791841325056L, 35702);
    int i = this.hqV.size();
    GMTrace.o(4791841325056L, 35702);
    return i;
  }
  
  protected final com.tencent.mm.ui.contact.a.a hG(int paramInt)
  {
    GMTrace.i(4791707107328L, 35701);
    Object localObject = (String)this.hqV.get(paramInt);
    at.AR();
    localObject = c.yK().TE((String)localObject);
    com.tencent.mm.plugin.multitalk.ui.widget.a locala = new com.tencent.mm.plugin.multitalk.ui.widget.a(paramInt);
    locala.iBi = ((x)localObject);
    locala.wSC = bhh();
    GMTrace.o(4791707107328L, 35701);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */