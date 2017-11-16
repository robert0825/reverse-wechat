package com.tencent.mm.g.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;

public final class kg
  extends b
{
  public a eOy;
  
  public kg()
  {
    this((byte)0);
    GMTrace.i(4303288795136L, 32062);
    GMTrace.o(4303288795136L, 32062);
  }
  
  private kg(byte paramByte)
  {
    GMTrace.i(4303423012864L, 32063);
    this.eOy = new a();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4303423012864L, 32063);
  }
  
  public static final class a
  {
    public Context context;
    public String group;
    public Intent intent;
    public int type;
    
    public a()
    {
      GMTrace.i(4331877171200L, 32275);
      this.type = 0;
      GMTrace.o(4331877171200L, 32275);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\kg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */