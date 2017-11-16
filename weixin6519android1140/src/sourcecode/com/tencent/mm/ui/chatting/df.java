package com.tencent.mm.ui.chatting;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.am;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class df
  implements am
{
  final En_5b8fbb1e.a wBO;
  dl wBP;
  
  public df(En_5b8fbb1e.a parama)
  {
    GMTrace.i(2151778615296L, 16032);
    this.wBO = parama;
    this.wBP = new dl();
    GMTrace.o(2151778615296L, 16032);
  }
  
  private void cI(List<au> paramList)
  {
    GMTrace.i(2152315486208L, 16036);
    if ((this.wBP != null) && (this.wBO != null)) {
      this.wBP.a(this.wBO.bWQ(), paramList);
    }
    GMTrace.o(2152315486208L, 16036);
  }
  
  public final void a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Bundle paramBundle)
  {
    GMTrace.i(2152583921664L, 16038);
    GMTrace.o(2152583921664L, 16038);
  }
  
  public final void a(au paramau)
  {
    GMTrace.i(2151912833024L, 16033);
    if (this.wBO == null)
    {
      w.w("MicroMsg.ChattingUIKeywordChecker", "chatting ui is null.");
      GMTrace.o(2151912833024L, 16033);
      return;
    }
    this.wBO.cbI();
    if ((!paramau.field_talker.equals(this.wBO.cci())) || (!paramau.bTF()))
    {
      GMTrace.o(2151912833024L, 16033);
      return;
    }
    aA(paramau);
    GMTrace.o(2151912833024L, 16033);
  }
  
  public final void aA(au paramau)
  {
    GMTrace.i(2152181268480L, 16035);
    if (paramau == null)
    {
      GMTrace.o(2152181268480L, 16035);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramau);
    cI(localArrayList);
    GMTrace.o(2152181268480L, 16035);
  }
  
  public final Looper getLooper()
  {
    GMTrace.i(2152449703936L, 16037);
    Looper localLooper = Looper.getMainLooper();
    GMTrace.o(2152449703936L, 16037);
    return localLooper;
  }
  
  public final void q(List<au> paramList)
  {
    GMTrace.i(2152047050752L, 16034);
    if (this.wBO == null)
    {
      w.w("MicroMsg.ChattingUIKeywordChecker", "chatting ui is null.");
      GMTrace.o(2152047050752L, 16034);
      return;
    }
    if (s.eb(this.wBO.cci()))
    {
      GMTrace.o(2152047050752L, 16034);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      au localau = (au)paramList.next();
      if ((localau.field_talker.equals(this.wBO.cci())) && (localau.bTF())) {
        localArrayList.add(localau);
      }
    }
    cI(localArrayList);
    GMTrace.o(2152047050752L, 16034);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */