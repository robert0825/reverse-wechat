package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;

public final class q
{
  private int gCt;
  long hcs;
  public int offset;
  private long pMI;
  public int pMJ;
  public String pMK;
  private int pML;
  private long pMM;
  public String pMN;
  public byte[] pMO;
  public int pMe;
  public int type;
  private String userName;
  
  public q()
  {
    GMTrace.i(8182583787520L, 60965);
    GMTrace.o(8182583787520L, 60965);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(8182852222976L, 60967);
    this.pMe = paramCursor.getInt(0);
    long l = paramCursor.getLong(1);
    this.pMI = l;
    this.pMN = i.dt(l);
    this.type = paramCursor.getInt(2);
    this.hcs = paramCursor.getLong(3);
    this.userName = paramCursor.getString(4);
    this.pMJ = paramCursor.getInt(5);
    this.offset = paramCursor.getInt(6);
    this.gCt = paramCursor.getInt(7);
    this.pMK = paramCursor.getString(8);
    this.pML = paramCursor.getInt(9);
    this.pMM = paramCursor.getLong(10);
    this.pMN = paramCursor.getString(11);
    this.pMO = paramCursor.getBlob(12);
    GMTrace.o(8182852222976L, 60967);
  }
  
  public final ContentValues bmt()
  {
    GMTrace.i(8182718005248L, 60966);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("seqId", Long.valueOf(this.pMI));
    localContentValues.put("type", Integer.valueOf(this.type));
    localContentValues.put("createTime", Long.valueOf(this.hcs));
    localContentValues.put("userName", this.userName);
    localContentValues.put("totallen", Integer.valueOf(this.pMJ));
    localContentValues.put("offset", Integer.valueOf(this.offset));
    localContentValues.put("local_flag", Integer.valueOf(this.gCt));
    localContentValues.put("tmp_path", this.pMK);
    localContentValues.put("nums", Integer.valueOf(this.pML));
    localContentValues.put("try_times", Long.valueOf(this.pMM));
    localContentValues.put("StrId", this.pMN);
    localContentValues.put("upload_buf", this.pMO);
    GMTrace.o(8182718005248L, 60966);
    return localContentValues;
  }
  
  public final void bmu()
  {
    GMTrace.i(8182986440704L, 60968);
    this.gCt |= 0x4;
    GMTrace.o(8182986440704L, 60968);
  }
  
  public final void bmv()
  {
    GMTrace.i(8183120658432L, 60969);
    this.gCt &= 0xFFFFFFFB;
    GMTrace.o(8183120658432L, 60969);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */