package com.tencent.mm.wallet_core.g.a;

import com.tencent.gmtrace.GMTrace;
import org.json.JSONObject;

public abstract class k
  extends h
{
  private String eAR;
  private int errCode;
  public boolean qZD;
  private boolean xEl;
  public boolean xEm;
  public boolean xEn;
  
  public k()
  {
    GMTrace.i(1518136721408L, 11311);
    this.xEl = false;
    this.errCode = 0;
    this.eAR = "";
    this.xEm = false;
    this.xEn = false;
    this.qZD = false;
    GMTrace.o(1518136721408L, 11311);
  }
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(1518405156864L, 11313);
    this.errCode = paramInt;
    this.eAR = paramString;
    GMTrace.o(1518405156864L, 11313);
  }
  
  public final boolean bbt()
  {
    GMTrace.i(1518673592320L, 11315);
    if (!this.xEm)
    {
      GMTrace.o(1518673592320L, 11315);
      return true;
    }
    GMTrace.o(1518673592320L, 11315);
    return false;
  }
  
  public boolean bjT()
  {
    GMTrace.i(1518539374592L, 11314);
    GMTrace.o(1518539374592L, 11314);
    return false;
  }
  
  public final void z(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1518270939136L, 11312);
    super.z(paramBoolean1, paramBoolean2);
    GMTrace.o(1518270939136L, 11312);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\g\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */