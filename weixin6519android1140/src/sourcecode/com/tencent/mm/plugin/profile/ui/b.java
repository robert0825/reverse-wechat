package com.tencent.mm.plugin.profile.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.m.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.List;

public final class b
  extends m
{
  private String eQb;
  private ae handler;
  private x iBi;
  private com.tencent.mm.plugin.fts.a.a.a lwZ;
  private List<i> lzI;
  private j nLu;
  
  public b(com.tencent.mm.ui.contact.l paraml, int paramInt, x paramx)
  {
    super(paraml, false, paramInt);
    GMTrace.i(6760144306176L, 50367);
    this.handler = new ae();
    this.nLu = new j()
    {
      public final void a(g paramAnonymousg)
      {
        GMTrace.i(18473862299648L, 137641);
        if (paramAnonymousg.aGY == 0)
        {
          b.a(b.this, paramAnonymousg.lxb);
          if (b.a(b.this) != null) {
            b.c(b.this).r(paramAnonymousg.luZ.eQb, b.b(b.this).size(), true);
          }
        }
        b.this.notifyDataSetChanged();
        GMTrace.o(18473862299648L, 137641);
      }
    };
    this.iBi = paramx;
    GMTrace.o(6760144306176L, 50367);
  }
  
  public final void Ty()
  {
    GMTrace.i(6760681177088L, 50371);
    this.eQb = null;
    if (this.lwZ != null) {
      ((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).cancelSearchTask(this.lwZ);
    }
    GMTrace.o(6760681177088L, 50371);
  }
  
  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    GMTrace.i(6760546959360L, 50370);
    this.eQb = paramString;
    paramArrayOfInt = new f();
    paramArrayOfInt.eQb = paramString;
    paramArrayOfInt.handler = this.handler;
    paramArrayOfInt.lwY = this.nLu;
    paramArrayOfInt.eDs = this.iBi.field_username;
    paramArrayOfInt.lwS = 7;
    this.lwZ = ((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).search(2, paramArrayOfInt);
    GMTrace.o(6760546959360L, 50370);
  }
  
  public final int getCount()
  {
    GMTrace.i(6760412741632L, 50369);
    if (this.lzI == null)
    {
      GMTrace.o(6760412741632L, 50369);
      return 0;
    }
    int i = this.lzI.size();
    GMTrace.o(6760412741632L, 50369);
    return i;
  }
  
  protected final com.tencent.mm.ui.contact.a.a hG(int paramInt)
  {
    GMTrace.i(6760278523904L, 50368);
    e locale = new e(paramInt);
    at.AR();
    locale.iBi = c.yK().TE(((i)this.lzI.get(paramInt)).lwH);
    GMTrace.o(6760278523904L, 50368);
    return locale;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */