package com.tencent.mm.plugin.search.ui;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;

public final class a
  extends b
  implements i.b
{
  private com.tencent.mm.plugin.search.ui.c.a oBK;
  protected boolean oBL;
  private ae oBM;
  
  public a(c paramc)
  {
    super(paramc);
    GMTrace.i(11822434353152L, 88084);
    this.oBM = new ae(Looper.getMainLooper());
    this.oBK = new com.tencent.mm.plugin.search.ui.c.a(paramc.getContext(), this, 0);
    GMTrace.o(11822434353152L, 88084);
  }
  
  public final void a(i parami, String paramString)
  {
    GMTrace.i(16476568289280L, 122760);
    int i = this.oBK.oa(0);
    tF(i);
    notifyDataSetChanged();
    C(i, true);
    GMTrace.o(16476568289280L, 122760);
  }
  
  protected final boolean a(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16476434071552L, 122759);
    GMTrace.o(16476434071552L, 122759);
    return false;
  }
  
  protected final void bdF()
  {
    GMTrace.i(11822702788608L, 88086);
    this.oBL = false;
    this.oBK.a(this.eQb, this.oBM, new HashSet());
    GMTrace.o(11822702788608L, 88086);
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a ob(int paramInt)
  {
    GMTrace.i(16476299853824L, 122758);
    com.tencent.mm.plugin.fts.d.a.a locala = this.oBK.ob(paramInt);
    GMTrace.o(16476299853824L, 122758);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */