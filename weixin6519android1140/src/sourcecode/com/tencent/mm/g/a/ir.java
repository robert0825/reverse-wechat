package com.tencent.mm.g.a;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.b.b;

public final class ir
  extends b
{
  public a eMh;
  public b eMi;
  
  public ir()
  {
    this((byte)0);
    GMTrace.i(4281008652288L, 31896);
    GMTrace.o(4281008652288L, 31896);
  }
  
  private ir(byte paramByte)
  {
    GMTrace.i(4281142870016L, 31897);
    this.eMh = new a();
    this.eMi = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4281142870016L, 31897);
  }
  
  public static final class a
  {
    public k eEg;
    public int eMj;
    public String eMk;
    public float eMl;
    public float eMm;
    public int eMn;
    public String filename;
    public int height;
    public View view;
    public int width;
    
    public a()
    {
      GMTrace.i(4292148723712L, 31979);
      this.eMj = 0;
      this.eMl = 0.0F;
      this.eMm = 0.0F;
      this.width = 0;
      this.height = 0;
      this.eMn = 0;
      GMTrace.o(4292148723712L, 31979);
    }
  }
  
  public static final class b
  {
    public String path;
    
    public b()
    {
      GMTrace.i(4279934910464L, 31888);
      GMTrace.o(4279934910464L, 31888);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\a\ir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */