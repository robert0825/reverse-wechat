package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import com.tencent.gmtrace.GMTrace;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class s
  implements Serializable
{
  public int eCt;
  public float height;
  public int pEA;
  public float pEB;
  public float pEC;
  public float pED;
  public float pEE;
  public float pEF;
  public float pEG;
  public boolean pEH;
  public int pEI;
  public int pEJ;
  public boolean pEK;
  public boolean pEL;
  public int pEM;
  public boolean pEN;
  public String pEz;
  public String pyc;
  public int type;
  public String uin;
  public float width;
  public String yvm;
  
  public s()
  {
    GMTrace.i(8289957969920L, 61765);
    this.pEF = -2.0F;
    this.pEG = -2.0F;
    this.yvm = "";
    GMTrace.o(8289957969920L, 61765);
  }
  
  public final void If(String paramString)
  {
    GMTrace.i(18949261492224L, 141183);
    this.pyc = paramString;
    Iterator localIterator = bkr().iterator();
    while (localIterator.hasNext()) {
      ((s)localIterator.next()).If(paramString);
    }
    GMTrace.o(18949261492224L, 141183);
  }
  
  public final void Ig(String paramString)
  {
    GMTrace.i(20835289006080L, 155235);
    this.uin = paramString;
    Iterator localIterator = bkr().iterator();
    while (localIterator.hasNext()) {
      ((s)localIterator.next()).Ig(paramString);
    }
    GMTrace.o(20835289006080L, 155235);
  }
  
  protected List<s> bkr()
  {
    GMTrace.i(18949395709952L, 141184);
    List localList = Collections.emptyList();
    GMTrace.o(18949395709952L, 141184);
    return localList;
  }
  
  public final void hU(boolean paramBoolean)
  {
    GMTrace.i(18577478385664L, 138413);
    this.pEN = paramBoolean;
    Iterator localIterator = bkr().iterator();
    while (localIterator.hasNext()) {
      ((s)localIterator.next()).hU(paramBoolean);
    }
    GMTrace.o(18577478385664L, 138413);
  }
  
  public final void uJ(int paramInt)
  {
    GMTrace.i(18577344167936L, 138412);
    this.pEM = paramInt;
    Iterator localIterator = bkr().iterator();
    while (localIterator.hasNext()) {
      ((s)localIterator.next()).uJ(paramInt);
    }
    GMTrace.o(18577344167936L, 138412);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */