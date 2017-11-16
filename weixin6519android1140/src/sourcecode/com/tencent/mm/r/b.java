package com.tencent.mm.r;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.aam;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class b
  implements com.tencent.mm.ad.e
{
  private List<d> fTP;
  private List<d> fTQ;
  private d fTR;
  private a fTS;
  
  public b(List<d> paramList, a parama)
  {
    GMTrace.i(4505689128960L, 33570);
    this.fTP = null;
    this.fTQ = null;
    this.fTR = null;
    this.fTP = paramList;
    this.fTQ = new ArrayList();
    this.fTS = parama;
    GMTrace.o(4505689128960L, 33570);
  }
  
  private void vv()
  {
    GMTrace.i(4505957564416L, 33572);
    w.d("MicroMsg.FunctionMsgFetchLooper", "fetchNext, fetchItemList.size: %s", new Object[] { Integer.valueOf(this.fTP.size()) });
    if (this.fTP.size() > 0)
    {
      this.fTR = ((d)this.fTP.remove(0));
      Object localObject = this.fTR;
      if (localObject != null)
      {
        w.i("MicroMsg.FunctionMsgFetchLooper", "fetchInternal, functionMsgId: %s", new Object[] { ((d)localObject).field_functionmsgid });
        ((d)localObject).field_status = 0;
        localObject = new g((d)localObject);
        h.wS().a((k)localObject, 0);
      }
      GMTrace.o(4505957564416L, 33572);
      return;
    }
    h.wS().b(825, this);
    if (this.fTS != null) {
      this.fTS.r(this.fTQ);
    }
    GMTrace.o(4505957564416L, 33572);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4506091782144L, 33573);
    w.i("MicroMsg.FunctionMsgFetchLooper", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramk.getType() == 825)
    {
      paramk = (g)paramk;
      paramString = paramk.fUc;
      paramk = paramk.fUe;
      if ((paramk != null) && (paramk.field_functionmsgid.equals(this.fTR.field_functionmsgid)))
      {
        if ((paramInt1 == 0) || (paramInt2 == 0)) {
          break label182;
        }
        w.i("MicroMsg.FunctionMsgFetchLooper", "functionMsgId: %s, fetch failed, mark as fetch failed, preVersion: %s, version: %s", new Object[] { paramk.field_functionmsgid, Long.valueOf(paramk.field_preVersion), Long.valueOf(paramk.field_version) });
        paramk.field_status = 3;
        paramk.field_version = paramk.field_preVersion;
        i.vF().a(paramk.field_functionmsgid, paramk);
      }
    }
    for (;;)
    {
      vv();
      GMTrace.o(4506091782144L, 33573);
      return;
      label182:
      w.i("MicroMsg.FunctionMsgFetchLooper", "functionMsgId: %s fetch success, response.version: %s, fetchItem.version: %s", new Object[] { paramk.field_functionmsgid, Long.valueOf(paramString.urf), Long.valueOf(paramk.field_version) });
      if (paramString.urf >= paramk.field_version)
      {
        paramk.field_preVersion = paramk.field_version;
        paramk.field_version = paramString.urf;
        paramk.field_status = 2;
        paramk.b(paramString.urg);
        i.vF().a(paramk.field_functionmsgid, paramk);
        this.fTQ.add(paramk);
      }
    }
  }
  
  public final boolean start()
  {
    GMTrace.i(4505823346688L, 33571);
    if ((this.fTP != null) && (this.fTP.size() > 0))
    {
      w.i("MicroMsg.FunctionMsgFetchLooper", "start, fetchItemList.size: %s", new Object[] { Integer.valueOf(this.fTP.size()) });
      h.wS().a(825, this);
      vv();
      GMTrace.o(4505823346688L, 33571);
      return true;
    }
    GMTrace.o(4505823346688L, 33571);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void r(List<d> paramList);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\r\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */