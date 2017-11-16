package com.tencent.mm.g.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.b.a.c;
import com.tencent.mm.protocal.b.a.d;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.storage.au;
import java.util.List;

public final class mn
  extends b
{
  public a eRu;
  public b eRv;
  
  public mn()
  {
    this((byte)0);
    GMTrace.i(4309194375168L, 32106);
    GMTrace.o(4309194375168L, 32106);
  }
  
  private mn(byte paramByte)
  {
    GMTrace.i(4309328592896L, 32107);
    this.eRu = new a();
    this.eRv = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4309328592896L, 32107);
  }
  
  public static final class a
  {
    public Context context;
    public String desc;
    public long eDr;
    public th eIc;
    public String eIu;
    public String eIy;
    public cf eQY;
    public List<au> eRA;
    public String eRB;
    public String eRC;
    public d eRD;
    public String eRw;
    public tt eRx;
    public int eRy;
    public au eRz;
    public String title;
    public String toUser;
    public int type;
    
    public a()
    {
      GMTrace.i(4247185784832L, 31644);
      this.type = 0;
      this.eDr = 0L;
      this.eRy = 0;
      GMTrace.o(4247185784832L, 31644);
    }
  }
  
  public static final class b
  {
    public String eIy;
    public cf eQY;
    public d eRD;
    public c eRE;
    public String eRF;
    public boolean eRG;
    public boolean eRH;
    
    public b()
    {
      GMTrace.i(4220879110144L, 31448);
      this.eRG = false;
      this.eRH = false;
      GMTrace.o(4220879110144L, 31448);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\mn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */