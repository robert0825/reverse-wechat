package com.tencent.mm.g.a;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.Fragment;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.ue;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.ui.snackbar.b.c;

public final class cf
  extends b
{
  public a eDv;
  public b eDw;
  
  public cf()
  {
    this((byte)0);
    GMTrace.i(4363418337280L, 32510);
    GMTrace.o(4363418337280L, 32510);
  }
  
  private cf(byte paramByte)
  {
    GMTrace.i(4363552555008L, 32511);
    this.eDv = new a();
    this.eDw = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4363552555008L, 32511);
  }
  
  public static final class a
  {
    public Activity activity;
    public String desc;
    public String eDA;
    public int eDB;
    public int eDC;
    public DialogInterface.OnClickListener eDD;
    public b.c eDE;
    public String eDk;
    public tt eDx;
    public ue eDy;
    public int eDz;
    public Fragment nK;
    public String title;
    public int type;
    
    public a()
    {
      GMTrace.i(4278458515456L, 31877);
      this.type = 0;
      this.eDz = 0;
      this.eDB = 0;
      this.eDC = 0;
      GMTrace.o(4278458515456L, 31877);
    }
  }
  
  public static final class b
  {
    public int ret;
    
    public b()
    {
      GMTrace.i(4345835814912L, 32379);
      this.ret = 0;
      GMTrace.o(4345835814912L, 32379);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */