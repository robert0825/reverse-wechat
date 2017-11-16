package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class db
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fBO;
  private static final int fBP;
  private static final int fBQ;
  private static final int fBR;
  private static final int fBS;
  private static final int fBT;
  private static final int fBU;
  private static final int fBV;
  private static final int faG;
  private static final int faJ;
  private static final int ffa;
  private static final int fnq;
  private static final int fre;
  private boolean fBG;
  private boolean fBH;
  private boolean fBI;
  private boolean fBJ;
  private boolean fBK;
  private boolean fBL;
  private boolean fBM;
  private boolean fBN;
  private boolean fak;
  private boolean fan;
  private boolean feM;
  public String field_clientId;
  public long field_commentSvrID;
  public int field_commentflag;
  public int field_createTime;
  public byte[] field_curActionBuf;
  public short field_isRead;
  public boolean field_isSend;
  public int field_isSilence;
  public long field_parentID;
  public byte[] field_refActionBuf;
  public long field_snsID;
  public String field_talker;
  public int field_type;
  private boolean fna;
  private boolean fqV;
  
  static
  {
    GMTrace.i(4138335207424L, 30833);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS SnsComment_snsID_index ON SnsComment(snsID)", "CREATE INDEX IF NOT EXISTS SnsComment_parentID_index ON SnsComment(parentID)", "CREATE INDEX IF NOT EXISTS SnsComment_isRead_index ON SnsComment(isRead)", "CREATE INDEX IF NOT EXISTS SnsComment_isSend_index ON SnsComment(isSend)" };
    fBO = "snsID".hashCode();
    fBP = "parentID".hashCode();
    fre = "isRead".hashCode();
    faG = "createTime".hashCode();
    fnq = "talker".hashCode();
    faJ = "type".hashCode();
    ffa = "isSend".hashCode();
    fBQ = "curActionBuf".hashCode();
    fBR = "refActionBuf".hashCode();
    fBS = "commentSvrID".hashCode();
    fBT = "clientId".hashCode();
    fBU = "commentflag".hashCode();
    fBV = "isSilence".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4138335207424L, 30833);
  }
  
  public db()
  {
    GMTrace.i(4137932554240L, 30830);
    this.fBG = true;
    this.fBH = true;
    this.fqV = true;
    this.fak = true;
    this.fna = true;
    this.fan = true;
    this.feM = true;
    this.fBI = true;
    this.fBJ = true;
    this.fBK = true;
    this.fBL = true;
    this.fBM = true;
    this.fBN = true;
    GMTrace.o(4137932554240L, 30830);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4138066771968L, 30831);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4138066771968L, 30831);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fBO == k) {
        this.field_snsID = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fBP == k)
        {
          this.field_parentID = paramCursor.getLong(i);
        }
        else if (fre == k)
        {
          this.field_isRead = paramCursor.getShort(i);
        }
        else if (faG == k)
        {
          this.field_createTime = paramCursor.getInt(i);
        }
        else if (fnq == k)
        {
          this.field_talker = paramCursor.getString(i);
        }
        else if (faJ == k)
        {
          this.field_type = paramCursor.getInt(i);
        }
        else
        {
          if (ffa == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_isSend = bool;
              break;
            }
          }
          if (fBQ == k) {
            this.field_curActionBuf = paramCursor.getBlob(i);
          } else if (fBR == k) {
            this.field_refActionBuf = paramCursor.getBlob(i);
          } else if (fBS == k) {
            this.field_commentSvrID = paramCursor.getLong(i);
          } else if (fBT == k) {
            this.field_clientId = paramCursor.getString(i);
          } else if (fBU == k) {
            this.field_commentflag = paramCursor.getInt(i);
          } else if (fBV == k) {
            this.field_isSilence = paramCursor.getInt(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4138066771968L, 30831);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4138200989696L, 30832);
    ContentValues localContentValues = new ContentValues();
    if (this.fBG) {
      localContentValues.put("snsID", Long.valueOf(this.field_snsID));
    }
    if (this.fBH) {
      localContentValues.put("parentID", Long.valueOf(this.field_parentID));
    }
    if (this.fqV) {
      localContentValues.put("isRead", Short.valueOf(this.field_isRead));
    }
    if (this.fak) {
      localContentValues.put("createTime", Integer.valueOf(this.field_createTime));
    }
    if (this.fna) {
      localContentValues.put("talker", this.field_talker);
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.feM) {
      localContentValues.put("isSend", Boolean.valueOf(this.field_isSend));
    }
    if (this.fBI) {
      localContentValues.put("curActionBuf", this.field_curActionBuf);
    }
    if (this.fBJ) {
      localContentValues.put("refActionBuf", this.field_refActionBuf);
    }
    if (this.fBK) {
      localContentValues.put("commentSvrID", Long.valueOf(this.field_commentSvrID));
    }
    if (this.fBL) {
      localContentValues.put("clientId", this.field_clientId);
    }
    if (this.fBM) {
      localContentValues.put("commentflag", Integer.valueOf(this.field_commentflag));
    }
    if (this.fBN) {
      localContentValues.put("isSilence", Integer.valueOf(this.field_isSilence));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4138200989696L, 30832);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */