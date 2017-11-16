package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.a.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.t;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  implements a<String>
{
  public long fTq;
  public String field_alias;
  public String field_conRemark;
  public int field_deleteFlag;
  public byte[] field_lvbuff;
  public String field_nickname;
  public String field_remarkDesc;
  public int field_showHead;
  public String field_signature;
  public String field_username;
  public int field_verifyFlag;
  public int field_weiboFlag;
  public CharSequence vpn;
  
  public f()
  {
    GMTrace.i(1536658767872L, 11449);
    GMTrace.o(1536658767872L, 11449);
  }
  
  private void bSh()
  {
    GMTrace.i(1536927203328L, 11451);
    if (this.field_lvbuff == null)
    {
      GMTrace.o(1536927203328L, 11451);
      return;
    }
    try
    {
      if (this.field_lvbuff != null)
      {
        i = this.field_lvbuff.length;
        if (i != 0) {}
      }
      else
      {
        GMTrace.o(1536927203328L, 11451);
        return;
      }
      t localt = new t();
      int i = localt.bl(this.field_lvbuff);
      if (i != 0)
      {
        GMTrace.o(1536927203328L, 11451);
        return;
      }
      localt.Ai(4);
      localt.Ai(4);
      localt.bPA();
      localt.Ai(8);
      localt.Ai(4);
      localt.bPA();
      localt.bPA();
      localt.Ai(4);
      localt.Ai(4);
      localt.bPA();
      localt.bPA();
      localt.Ai(4);
      localt.Ai(4);
      this.field_signature = localt.getString();
      localt.bPA();
      localt.bPA();
      localt.bPA();
      localt.Ai(4);
      localt.Ai(4);
      localt.bPA();
      localt.Ai(4);
      localt.bPA();
      localt.bPA();
      localt.Ai(4);
      localt.Ai(4);
      if (!localt.bPB()) {
        this.field_remarkDesc = localt.getString();
      }
      this.field_lvbuff = null;
      GMTrace.o(1536927203328L, 11451);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AddressUIContact", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(1536927203328L, 11451);
    }
  }
  
  public final void Q(int paramInt, long paramLong)
  {
    GMTrace.i(1537329856512L, 11454);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(1537329856512L, 11454);
      return;
      this.field_verifyFlag = ((int)paramLong);
      GMTrace.o(1537329856512L, 11454);
      return;
      this.field_showHead = ((int)paramLong);
      GMTrace.o(1537329856512L, 11454);
      return;
      this.field_weiboFlag = ((int)paramLong);
      GMTrace.o(1537329856512L, 11454);
      return;
      this.fTq = paramLong;
      GMTrace.o(1537329856512L, 11454);
      return;
      this.field_deleteFlag = ((int)paramLong);
    }
  }
  
  public final void aF(int paramInt, String paramString)
  {
    GMTrace.i(1537598291968L, 11456);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(1537598291968L, 11456);
      return;
      this.field_username = paramString;
      GMTrace.o(1537598291968L, 11456);
      return;
      this.field_nickname = paramString;
      GMTrace.o(1537598291968L, 11456);
      return;
      this.field_alias = paramString;
      GMTrace.o(1537598291968L, 11456);
      return;
      this.field_conRemark = paramString;
    }
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(1536792985600L, 11450);
    this.field_username = paramCursor.getString(0);
    this.field_nickname = paramCursor.getString(1);
    this.field_alias = paramCursor.getString(2);
    this.field_conRemark = paramCursor.getString(3);
    this.field_verifyFlag = paramCursor.getInt(4);
    this.field_showHead = paramCursor.getInt(5);
    this.field_weiboFlag = paramCursor.getInt(6);
    this.fTq = paramCursor.getLong(7);
    this.field_deleteFlag = paramCursor.getInt(8);
    this.field_lvbuff = paramCursor.getBlob(9);
    bSh();
    GMTrace.o(1536792985600L, 11450);
  }
  
  public final void bSi()
  {
    GMTrace.i(1537732509696L, 11457);
    bSh();
    GMTrace.o(1537732509696L, 11457);
  }
  
  public final void n(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(1537061421056L, 11452);
    if (paramInt == 9) {
      this.field_lvbuff = paramArrayOfByte;
    }
    GMTrace.o(1537061421056L, 11452);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */