package com.tencent.mm.g.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tm;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.List;

public final class ft
  extends b
{
  public a eIo;
  public b eIp;
  
  public ft()
  {
    this((byte)0);
    GMTrace.i(4345298944000L, 32375);
    GMTrace.o(4345298944000L, 32375);
  }
  
  private ft(byte paramByte)
  {
    GMTrace.i(4345433161728L, 32376);
    this.eIo = new a();
    this.eIp = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4345433161728L, 32376);
  }
  
  public static final class a
  {
    public Context context;
    public String desc;
    public long eDp;
    public tt eDx;
    public k eEg;
    public th eIq;
    public Intent eIr;
    public j.a eIs;
    public Runnable eIt;
    public String eIu;
    public int eIv;
    public int eIw;
    public ae handler;
    public String path;
    public String title;
    public String toUser;
    public int type;
    
    public a()
    {
      GMTrace.i(4354962620416L, 32447);
      this.type = 0;
      this.eIv = 0;
      this.eIw = 0;
      GMTrace.o(4354962620416L, 32447);
    }
  }
  
  public static final class b
  {
    public e eIA;
    public List eIB;
    public boolean eIC;
    public boolean eID;
    public boolean eIE;
    public double eIF;
    public List eIx;
    public String eIy;
    public tm eIz;
    public String path;
    public int ret;
    public String thumbUrl;
    
    public b()
    {
      GMTrace.i(4200478015488L, 31296);
      this.ret = -1;
      this.eIC = false;
      this.eID = false;
      this.eIE = false;
      this.eIF = 0.0D;
      GMTrace.o(4200478015488L, 31296);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */