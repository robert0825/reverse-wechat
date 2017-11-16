package com.tencent.mm.plugin.fts.a.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public final class h
{
  public String eQb;
  public int gRk;
  public long gpK;
  public String lwH;
  public long lxc;
  public long lxd;
  public long lxe;
  public String lxf;
  public long timestamp;
  public int type;
  
  public h()
  {
    GMTrace.i(18632373436416L, 138822);
    this.lxc = 0L;
    this.eQb = "";
    this.gpK = 0L;
    this.lxd = 0L;
    this.lwH = "";
    this.lxe = 0L;
    this.type = 0;
    this.gRk = 0;
    this.timestamp = 0L;
    this.lxf = "";
    GMTrace.o(18632373436416L, 138822);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(18632507654144L, 138823);
    this.lxc = paramCursor.getLong(0);
    this.eQb = paramCursor.getString(1);
    this.lxd = paramCursor.getLong(2);
    this.gpK = paramCursor.getLong(3);
    this.lwH = paramCursor.getString(4);
    this.lxe = paramCursor.getLong(5);
    this.type = paramCursor.getInt(6);
    this.gRk = paramCursor.getInt(7);
    this.timestamp = paramCursor.getLong(8);
    this.lxf = paramCursor.getString(9);
    GMTrace.o(18632507654144L, 138823);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */