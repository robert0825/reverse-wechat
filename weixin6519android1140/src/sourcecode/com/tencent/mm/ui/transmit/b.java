package com.tencent.mm.ui.transmit;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.ui.contact.a.d;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.m.a;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class b
  extends m
{
  String eQb;
  private ae handler;
  private com.tencent.mm.plugin.fts.a.a.a lwZ;
  List<i> lxb;
  private MMCreateChatroomUI xky;
  private j xkz;
  
  public b(MMCreateChatroomUI paramMMCreateChatroomUI, int paramInt)
  {
    super(paramMMCreateChatroomUI, false, paramInt);
    GMTrace.i(17931085807616L, 133597);
    this.handler = new ae(Looper.getMainLooper());
    this.xkz = new j()
    {
      public final void a(g paramAnonymousg)
      {
        GMTrace.i(17932696420352L, 133609);
        if (paramAnonymousg.aGY == 0) {
          b.a(b.this, paramAnonymousg.lxb);
        }
        for (;;)
        {
          if (b.a(b.this) == null) {
            b.a(b.this, new ArrayList());
          }
          if (b.a(b.this).size() == 0)
          {
            i locali = new i();
            locali.lwH = "no_result​";
            b.a(b.this, new ArrayList());
            b.a(b.this).add(locali);
          }
          b.this.clearCache();
          b.this.notifyDataSetChanged();
          b.b(b.this).r(paramAnonymousg.luZ.eQb, b.a(b.this).size(), true);
          GMTrace.o(17932696420352L, 133609);
          return;
          b.a(b.this, null);
        }
      }
    };
    this.xky = paramMMCreateChatroomUI;
    GMTrace.o(17931085807616L, 133597);
  }
  
  public final void Ty()
  {
    GMTrace.i(17931354243072L, 133599);
    if (this.lwZ != null) {
      ((l)com.tencent.mm.kernel.h.j(l.class)).cancelSearchTask(this.lwZ);
    }
    this.eQb = null;
    GMTrace.o(17931354243072L, 133599);
  }
  
  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    GMTrace.i(17931220025344L, 133598);
    this.eQb = paramString;
    paramArrayOfInt = new f();
    paramArrayOfInt.handler = this.handler;
    paramArrayOfInt.lwY = this.xkz;
    paramArrayOfInt.eQb = paramString;
    paramArrayOfInt.lwX = com.tencent.mm.plugin.fts.a.b.b.lxs;
    paramArrayOfInt.lwT = new int[] { 131072 };
    paramArrayOfInt.lwW.add("filehelper");
    paramArrayOfInt.lwW.add(q.zE());
    paramArrayOfInt.lwW.addAll(this.xky.xkC.ciD());
    this.lwZ = ((l)com.tencent.mm.kernel.h.j(l.class)).search(2, paramArrayOfInt);
    GMTrace.o(17931220025344L, 133598);
  }
  
  public final int getCount()
  {
    GMTrace.i(17931622678528L, 133601);
    if (this.lxb != null)
    {
      int i = this.lxb.size();
      GMTrace.o(17931622678528L, 133601);
      return i;
    }
    GMTrace.o(17931622678528L, 133601);
    return 0;
  }
  
  protected final com.tencent.mm.ui.contact.a.a hG(int paramInt)
  {
    GMTrace.i(17931488460800L, 133600);
    i locali = (i)this.lxb.get(paramInt);
    Object localObject;
    if (locali.lwH.equals("no_result​")) {
      localObject = new com.tencent.mm.ui.contact.a.h(paramInt);
    }
    for (;;)
    {
      ((com.tencent.mm.ui.contact.a.a)localObject).eQb = this.eQb;
      ((com.tencent.mm.ui.contact.a.a)localObject).scene = this.scene;
      ((com.tencent.mm.ui.contact.a.a)localObject).wSC = false;
      GMTrace.o(17931488460800L, 133600);
      return (com.tencent.mm.ui.contact.a.a)localObject;
      localObject = new d(paramInt);
      ((d)localObject).hWl = locali;
      ((d)localObject).lxa = new String[] { this.eQb };
      ((com.tencent.mm.ui.contact.a.a)localObject).wSC = bhh();
      ((d)localObject).wUJ = true;
      ((d)localObject).lzY = (paramInt + 1);
      ((d)localObject).ci(((d)localObject).hWl.type, ((d)localObject).hWl.gRk);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\transmit\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */