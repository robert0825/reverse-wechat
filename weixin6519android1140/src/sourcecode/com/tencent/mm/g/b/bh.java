package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public abstract class bh
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int fcK;
  private static final int fqF;
  private static final int fqG;
  private static final int fqH;
  private static final int fqI;
  private static final int fqJ;
  private static final int fqK;
  private static final int fqL;
  private static final int fqM;
  private static final int fqN;
  private static final int fqO;
  private static final int fqP;
  private static final int fqQ;
  private boolean eZF;
  private boolean fcD;
  public bu field_addMsg;
  public String field_cgi;
  public int field_cmdid;
  public String field_custombuff;
  public int field_failkey;
  public int field_finalfailkey;
  public String field_functionmsgid;
  public boolean field_needShow;
  public long field_preVersion;
  public int field_reportid;
  public int field_retryinterval;
  public int field_status;
  public int field_successkey;
  public long field_version;
  private boolean fqA;
  private boolean fqB;
  private boolean fqC;
  private boolean fqD;
  private boolean fqE;
  private boolean fqt;
  private boolean fqu;
  private boolean fqv;
  private boolean fqw;
  private boolean fqx;
  private boolean fqy;
  private boolean fqz;
  
  static
  {
    GMTrace.i(4169473720320L, 31065);
    eZt = new String[0];
    fqF = "cgi".hashCode();
    fqG = "cmdid".hashCode();
    fqH = "functionmsgid".hashCode();
    fcK = "version".hashCode();
    fqI = "preVersion".hashCode();
    fqJ = "retryinterval".hashCode();
    fqK = "reportid".hashCode();
    fqL = "successkey".hashCode();
    fqM = "failkey".hashCode();
    fqN = "finalfailkey".hashCode();
    fqO = "custombuff".hashCode();
    fqP = "addMsg".hashCode();
    eZI = "status".hashCode();
    fqQ = "needShow".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4169473720320L, 31065);
  }
  
  public bh()
  {
    GMTrace.i(4169071067136L, 31062);
    this.fqt = true;
    this.fqu = true;
    this.fqv = true;
    this.fcD = true;
    this.fqw = true;
    this.fqx = true;
    this.fqy = true;
    this.fqz = true;
    this.fqA = true;
    this.fqB = true;
    this.fqC = true;
    this.fqD = true;
    this.eZF = true;
    this.fqE = true;
    GMTrace.o(4169071067136L, 31062);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4169205284864L, 31063);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4169205284864L, 31063);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fqF == k) {
        this.field_cgi = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fqG == k)
        {
          this.field_cmdid = paramCursor.getInt(i);
        }
        else if (fqH == k)
        {
          this.field_functionmsgid = paramCursor.getString(i);
          this.fqv = true;
        }
        else if (fcK == k)
        {
          this.field_version = paramCursor.getLong(i);
        }
        else if (fqI == k)
        {
          this.field_preVersion = paramCursor.getLong(i);
        }
        else if (fqJ == k)
        {
          this.field_retryinterval = paramCursor.getInt(i);
        }
        else if (fqK == k)
        {
          this.field_reportid = paramCursor.getInt(i);
        }
        else if (fqL == k)
        {
          this.field_successkey = paramCursor.getInt(i);
        }
        else if (fqM == k)
        {
          this.field_failkey = paramCursor.getInt(i);
        }
        else if (fqN == k)
        {
          this.field_finalfailkey = paramCursor.getInt(i);
        }
        else if (fqO == k)
        {
          this.field_custombuff = paramCursor.getString(i);
        }
        else if (fqP == k)
        {
          try
          {
            byte[] arrayOfByte = paramCursor.getBlob(i);
            if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
              continue;
            }
            this.field_addMsg = ((bu)new bu().aD(arrayOfByte));
          }
          catch (IOException localIOException)
          {
            w.e("MicroMsg.SDK.BaseFunctionMsgItem", localIOException.getMessage());
          }
        }
        else if (eZI == k)
        {
          this.field_status = paramCursor.getInt(i);
        }
        else
        {
          if (fqQ == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_needShow = bool;
              break;
            }
          }
          if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4169205284864L, 31063);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4169339502592L, 31064);
    ContentValues localContentValues = new ContentValues();
    if (this.fqt) {
      localContentValues.put("cgi", this.field_cgi);
    }
    if (this.fqu) {
      localContentValues.put("cmdid", Integer.valueOf(this.field_cmdid));
    }
    if (this.fqv) {
      localContentValues.put("functionmsgid", this.field_functionmsgid);
    }
    if (this.fcD) {
      localContentValues.put("version", Long.valueOf(this.field_version));
    }
    if (this.fqw) {
      localContentValues.put("preVersion", Long.valueOf(this.field_preVersion));
    }
    if (this.fqx) {
      localContentValues.put("retryinterval", Integer.valueOf(this.field_retryinterval));
    }
    if (this.fqy) {
      localContentValues.put("reportid", Integer.valueOf(this.field_reportid));
    }
    if (this.fqz) {
      localContentValues.put("successkey", Integer.valueOf(this.field_successkey));
    }
    if (this.fqA) {
      localContentValues.put("failkey", Integer.valueOf(this.field_failkey));
    }
    if (this.fqB) {
      localContentValues.put("finalfailkey", Integer.valueOf(this.field_finalfailkey));
    }
    if (this.fqC) {
      localContentValues.put("custombuff", this.field_custombuff);
    }
    if ((this.fqD) && (this.field_addMsg != null)) {}
    try
    {
      localContentValues.put("addMsg", this.field_addMsg.toByteArray());
      if (this.eZF) {
        localContentValues.put("status", Integer.valueOf(this.field_status));
      }
      if (this.fqE) {
        localContentValues.put("needShow", Boolean.valueOf(this.field_needShow));
      }
      if (this.vmr > 0L) {
        localContentValues.put("rowid", Long.valueOf(this.vmr));
      }
      GMTrace.o(4169339502592L, 31064);
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.SDK.BaseFunctionMsgItem", localIOException.getMessage());
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */