package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import java.io.Serializable;
import java.util.LinkedList;

public final class c
  implements Serializable
{
  public String hPK;
  public int id;
  public boolean pEK;
  public String pLg;
  public boolean pLh;
  public LinkedList<s> pLi;
  public boolean pLj;
  
  public c()
  {
    GMTrace.i(8203655970816L, 61122);
    this.pLi = new LinkedList();
    this.pEK = true;
    GMTrace.o(8203655970816L, 61122);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */