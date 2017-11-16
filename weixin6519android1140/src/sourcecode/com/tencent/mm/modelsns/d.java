package com.tencent.mm.modelsns;

import com.tencent.gmtrace.GMTrace;

public final class d
{
  StringBuffer gVN;
  StringBuffer gVO;
  private int index;
  
  public d()
  {
    GMTrace.i(4458981359616L, 33222);
    this.gVN = new StringBuffer();
    this.gVO = new StringBuffer();
    this.index = 0;
    GMTrace.o(4458981359616L, 33222);
  }
  
  public final String LT()
  {
    GMTrace.i(4459518230528L, 33226);
    this.index = 0;
    this.gVN.append("--end--\n\n");
    String str = this.gVN.toString();
    GMTrace.o(4459518230528L, 33226);
    return str;
  }
  
  public final void p(String paramString, Object paramObject)
  {
    GMTrace.i(4459115577344L, 33223);
    this.gVN.append(this.index + " " + paramString + "->" + paramObject + "\n");
    this.gVO.append(paramObject);
    this.index += 1;
    GMTrace.o(4459115577344L, 33223);
  }
  
  public final void q(String paramString, Object paramObject)
  {
    GMTrace.i(4459249795072L, 33224);
    this.gVN.append(paramString + "->" + paramObject + "\n");
    this.gVO.append(paramObject);
    GMTrace.o(4459249795072L, 33224);
  }
  
  public final String toString()
  {
    GMTrace.i(4459384012800L, 33225);
    String str = this.gVO.toString();
    GMTrace.o(4459384012800L, 33225);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsns\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */