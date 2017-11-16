package com.tencent.mm.g.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.sdk.b.b;

public final class qi
  extends b
{
  public a eUY;
  public b eUZ;
  
  public qi()
  {
    this((byte)0);
    GMTrace.i(4230945439744L, 31523);
    GMTrace.o(4230945439744L, 31523);
  }
  
  private qi(byte paramByte)
  {
    GMTrace.i(4231079657472L, 31524);
    this.eUY = new a();
    this.eUZ = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4231079657472L, 31524);
  }
  
  public static final class a
  {
    public String appId;
    public Context context;
    public String eAv;
    public Bundle eDm;
    public String eIP;
    public String eVa;
    public int eVb;
    public int eVc;
    public String eVd;
    public boolean eVe;
    public boolean eVf;
    public LaunchParamsOptional eVg;
    public int eVh;
    public int eVi;
    public String eVj;
    public int scene;
    public String userName;
    
    public a()
    {
      GMTrace.i(4312147165184L, 32128);
      this.eVf = true;
      this.eVg = new LaunchParamsOptional();
      GMTrace.o(4312147165184L, 32128);
    }
  }
  
  public static final class b
  {
    public boolean eVk;
    public String eVl;
    
    public b()
    {
      GMTrace.i(4199806926848L, 31291);
      GMTrace.o(4199806926848L, 31291);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\qi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */