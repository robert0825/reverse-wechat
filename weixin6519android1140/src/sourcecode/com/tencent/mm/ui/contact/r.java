package com.tencent.mm.ui.contact;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.contact.a.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class r
  extends q
{
  private String eQb;
  private ae handler;
  private m.a wSA;
  private List<String> wST;
  private Map<String, String> wTh;
  private List<String> wTi;
  
  public r(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean, String paramString)
  {
    super(paramMMBaseSelectContactUI, paramList, paramBoolean, 0);
    GMTrace.i(1764157816832L, 13144);
    this.wTh = new HashMap();
    this.wTi = new ArrayList();
    this.handler = new ae(Looper.getMainLooper());
    this.wST = paramList;
    if (!bg.nm(paramString))
    {
      this.wTi = bg.g(paramString.split(","));
      if (this.wTi != null)
      {
        paramMMBaseSelectContactUI = this.wTi.iterator();
        while (paramMMBaseSelectContactUI.hasNext())
        {
          paramList = (String)paramMMBaseSelectContactUI.next();
          paramString = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fs(paramList);
          if (!bg.nm(paramString)) {
            this.wTh.put(paramString, paramList);
          }
        }
      }
    }
    PY();
    GMTrace.o(1764157816832L, 13144);
  }
  
  private void PY()
  {
    GMTrace.i(1764560470016L, 13147);
    this.eQb = null;
    clearCache();
    GMTrace.o(1764560470016L, 13147);
  }
  
  public final void a(m.a parama)
  {
    GMTrace.i(1764292034560L, 13145);
    this.wSA = parama;
    GMTrace.o(1764292034560L, 13145);
  }
  
  public final void bg(String paramString, boolean paramBoolean)
  {
    GMTrace.i(1764426252288L, 13146);
    if (this.wSA != null) {
      this.wSA.r(paramString, getCount(), paramBoolean);
    }
    GMTrace.o(1764426252288L, 13146);
  }
  
  protected final boolean c(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(1765097340928L, 13151);
    GMTrace.o(1765097340928L, 13151);
    return true;
  }
  
  public final void finish()
  {
    GMTrace.i(1764963123200L, 13150);
    super.finish();
    PY();
    GMTrace.o(1764963123200L, 13150);
  }
  
  public final int getCount()
  {
    GMTrace.i(1764694687744L, 13148);
    if (this.wTi == null)
    {
      GMTrace.o(1764694687744L, 13148);
      return 0;
    }
    int i = this.wTi.size();
    GMTrace.o(1764694687744L, 13148);
    return i;
  }
  
  protected final com.tencent.mm.ui.contact.a.a hG(int paramInt)
  {
    GMTrace.i(1764828905472L, 13149);
    d locald = new d(paramInt);
    locald.eQb = this.eQb;
    com.tencent.mm.kernel.h.xz();
    locald.iBi = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC((String)this.wTi.get(paramInt));
    locald.wSC = bhh();
    GMTrace.o(1764828905472L, 13149);
    return locald;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */