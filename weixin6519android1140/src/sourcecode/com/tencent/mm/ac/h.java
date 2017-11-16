package com.tencent.mm.ac;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class h
{
  public int eQl;
  public int fiZ;
  int gsS;
  public String gsT;
  public String gsU;
  private int gsV;
  int gsW;
  public String username;
  
  public h()
  {
    GMTrace.i(379165081600L, 2825);
    this.eQl = -1;
    this.username = "";
    this.fiZ = 0;
    this.gsS = 0;
    this.gsT = "";
    this.gsU = "";
    this.gsV = 0;
    this.gsW = 0;
    GMTrace.o(379165081600L, 2825);
  }
  
  public final ContentValues Dn()
  {
    GMTrace.i(379433517056L, 2827);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("imgflag", Integer.valueOf(this.fiZ));
    }
    if ((this.eQl & 0x4) != 0) {
      localContentValues.put("lastupdatetime", Integer.valueOf(this.gsS));
    }
    if ((this.eQl & 0x8) != 0) {
      localContentValues.put("reserved1", Do());
    }
    if ((this.eQl & 0x10) != 0) {
      localContentValues.put("reserved2", Dp());
    }
    if ((this.eQl & 0x20) != 0) {
      localContentValues.put("reserved3", Integer.valueOf(this.gsV));
    }
    if ((this.eQl & 0x40) != 0) {
      localContentValues.put("reserved4", Integer.valueOf(this.gsW));
    }
    GMTrace.o(379433517056L, 2827);
    return localContentValues;
  }
  
  public final String Do()
  {
    GMTrace.i(379701952512L, 2829);
    if (this.gsU == null)
    {
      GMTrace.o(379701952512L, 2829);
      return "";
    }
    String str = this.gsU;
    GMTrace.o(379701952512L, 2829);
    return str;
  }
  
  public final String Dp()
  {
    GMTrace.i(379836170240L, 2830);
    if (this.gsT == null)
    {
      GMTrace.o(379836170240L, 2830);
      return "";
    }
    String str = this.gsT;
    GMTrace.o(379836170240L, 2830);
    return str;
  }
  
  public final void Dq()
  {
    GMTrace.i(380104605696L, 2832);
    this.gsW = ((int)(bg.Pu() / 60L));
    this.eQl |= 0x40;
    GMTrace.o(380104605696L, 2832);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(379299299328L, 2826);
    this.username = paramCursor.getString(0);
    this.fiZ = paramCursor.getInt(1);
    this.gsS = paramCursor.getInt(2);
    this.gsU = paramCursor.getString(3);
    this.gsT = paramCursor.getString(4);
    this.gsV = paramCursor.getInt(5);
    this.gsW = paramCursor.getInt(6);
    GMTrace.o(379299299328L, 2826);
  }
  
  public final void bi(boolean paramBoolean)
  {
    GMTrace.i(379970387968L, 2831);
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.gsV = i;
      GMTrace.o(379970387968L, 2831);
      return;
    }
  }
  
  public final String getUsername()
  {
    GMTrace.i(379567734784L, 2828);
    if (this.username == null)
    {
      GMTrace.o(379567734784L, 2828);
      return "";
    }
    String str = this.username;
    GMTrace.o(379567734784L, 2828);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */