package com.tencent.mm.plugin.fts.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public abstract class b
  implements i
{
  private boolean evm;
  public boolean lvL;
  
  public b()
  {
    GMTrace.i(18626333638656L, 138777);
    w.i("MicroMsg.FTS.BaseFTS5SearchLogic", "Create %s", new Object[] { getName() });
    GMTrace.o(18626333638656L, 138777);
  }
  
  public a a(f paramf)
  {
    GMTrace.i(18627541598208L, 138786);
    GMTrace.o(18627541598208L, 138786);
    return null;
  }
  
  public void a(String paramString, com.tencent.mm.plugin.fts.a.a.i parami, int paramInt, HashMap<String, String> paramHashMap)
  {
    GMTrace.i(18627138945024L, 138783);
    GMTrace.o(18627138945024L, 138783);
  }
  
  public final boolean aCj()
  {
    GMTrace.i(18626467856384L, 138778);
    boolean bool = this.evm;
    GMTrace.o(18626467856384L, 138778);
    return bool;
  }
  
  public void addSOSHistory(String paramString)
  {
    GMTrace.i(18627273162752L, 138784);
    GMTrace.o(18627273162752L, 138784);
  }
  
  public final void create()
  {
    GMTrace.i(18626602074112L, 138779);
    w.i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnCreate %s | isCreated =%b", new Object[] { getName(), Boolean.valueOf(this.evm) });
    if ((!this.evm) && (onCreate()))
    {
      w.i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetCreated");
      this.evm = true;
    }
    GMTrace.o(18626602074112L, 138779);
  }
  
  public void deleteSOSHistory()
  {
    GMTrace.i(20968835645440L, 156230);
    GMTrace.o(20968835645440L, 156230);
  }
  
  public void deleteSOSHistory(String paramString)
  {
    GMTrace.i(18627407380480L, 138785);
    GMTrace.o(18627407380480L, 138785);
  }
  
  public final void destroy()
  {
    GMTrace.i(18626870509568L, 138781);
    w.i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnDestroy %s | isDestroyed %b | isCreated %b", new Object[] { getName(), Boolean.valueOf(this.lvL), Boolean.valueOf(this.evm) });
    if ((!this.lvL) && (this.evm) && (vt()))
    {
      w.i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetDestroyed");
      this.lvL = true;
    }
    GMTrace.o(18626870509568L, 138781);
  }
  
  public abstract boolean onCreate();
  
  public abstract boolean vt();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */