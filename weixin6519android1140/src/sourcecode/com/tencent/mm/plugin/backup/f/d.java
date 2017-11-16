package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.backup.h.aa;
import com.tencent.mm.plugin.backup.h.z;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class d
  extends b
{
  private e gvj;
  private z jbF;
  public aa jbG;
  
  public d(String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3, LinkedList<String> paramLinkedList, e parame)
  {
    GMTrace.i(9500065005568L, 70781);
    this.jbF = new z();
    this.jbG = new aa();
    w.i("MicroMsg.BackupDataTagScene", "init DataTag, BakChatName:%s, startTime:%d, endTime:%d, mediaIdList size:%d", new Object[] { paramString1, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramLinkedList.size()) });
    this.jbF.jha = paramString1;
    this.jbF.jil = paramLong1;
    this.jbF.jim = paramLong2;
    this.jbF.jin = paramString2;
    this.jbF.jio = paramString3;
    this.jbF.jhS = paramLinkedList;
    this.gvj = parame;
    GMTrace.o(9500065005568L, 70781);
  }
  
  public final a afr()
  {
    GMTrace.i(9500467658752L, 70784);
    aa localaa = this.jbG;
    GMTrace.o(9500467658752L, 70784);
    return localaa;
  }
  
  public final a afs()
  {
    GMTrace.i(9500601876480L, 70785);
    z localz = this.jbF;
    GMTrace.o(9500601876480L, 70785);
    return localz;
  }
  
  public final void aft()
  {
    GMTrace.i(9500736094208L, 70786);
    w.i("MicroMsg.BackupDataTagScene", "onSceneEnd");
    f(0, 0, "success");
    this.gvj.a(0, 0, "", this);
    GMTrace.o(9500736094208L, 70786);
  }
  
  public final boolean afx()
  {
    GMTrace.i(9500199223296L, 70782);
    boolean bool = super.afy();
    if (!bool) {
      this.gvj.a(1, -2, "doScene failed", this);
    }
    GMTrace.o(9500199223296L, 70782);
    return bool;
  }
  
  public final int getType()
  {
    GMTrace.i(9500333441024L, 70783);
    GMTrace.o(9500333441024L, 70783);
    return 15;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */