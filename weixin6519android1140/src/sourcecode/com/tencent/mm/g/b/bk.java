package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bk
  extends c
{
  private static final int eZB;
  private static final int eZC;
  public static final String[] eZt;
  private static final int faG;
  private static final int fag;
  private static final int fbu;
  private static final int ffb;
  private static final int fra;
  private static final int frb;
  private static final int frc;
  private static final int frd;
  private static final int fre;
  private static final int frf;
  private static final int frg;
  private static final int frh;
  private static final int fri;
  private boolean eZx;
  private boolean fac;
  private boolean fak;
  private boolean fbd;
  private boolean feN;
  public String field_appId;
  public long field_createTime;
  public long field_expireTime;
  public String field_gameMsgId;
  public boolean field_isHidden;
  public boolean field_isRead;
  public String field_label;
  public String field_mergerId;
  public long field_msgId;
  public int field_msgType;
  public String field_rawXML;
  public long field_receiveTime;
  public boolean field_showInMsgList;
  public String field_weight;
  private boolean fqR;
  private boolean fqS;
  private boolean fqT;
  private boolean fqU;
  private boolean fqV;
  private boolean fqW;
  private boolean fqX;
  private boolean fqY;
  private boolean fqZ;
  
  static
  {
    GMTrace.i(4136187723776L, 30817);
    eZt = new String[0];
    eZB = "msgId".hashCode();
    fra = "mergerId".hashCode();
    frb = "gameMsgId".hashCode();
    ffb = "msgType".hashCode();
    faG = "createTime".hashCode();
    frc = "expireTime".hashCode();
    fbu = "appId".hashCode();
    frd = "showInMsgList".hashCode();
    fre = "isRead".hashCode();
    frf = "label".hashCode();
    frg = "isHidden".hashCode();
    frh = "weight".hashCode();
    fag = "rawXML".hashCode();
    fri = "receiveTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4136187723776L, 30817);
  }
  
  public bk()
  {
    GMTrace.i(4135785070592L, 30814);
    this.eZx = true;
    this.fqR = true;
    this.fqS = true;
    this.feN = true;
    this.fak = true;
    this.fqT = true;
    this.fbd = true;
    this.fqU = true;
    this.fqV = true;
    this.fqW = true;
    this.fqX = true;
    this.fqY = true;
    this.fac = true;
    this.fqZ = true;
    GMTrace.o(4135785070592L, 30814);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4135919288320L, 30815);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4135919288320L, 30815);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (eZB == k)
      {
        this.field_msgId = paramCursor.getLong(i);
        this.eZx = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fra == k)
        {
          this.field_mergerId = paramCursor.getString(i);
        }
        else if (frb == k)
        {
          this.field_gameMsgId = paramCursor.getString(i);
        }
        else if (ffb == k)
        {
          this.field_msgType = paramCursor.getInt(i);
        }
        else if (faG == k)
        {
          this.field_createTime = paramCursor.getLong(i);
        }
        else if (frc == k)
        {
          this.field_expireTime = paramCursor.getLong(i);
        }
        else if (fbu == k)
        {
          this.field_appId = paramCursor.getString(i);
        }
        else
        {
          boolean bool;
          if (frd == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_showInMsgList = bool;
              break;
            }
          }
          if (fre == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_isRead = bool;
              break;
            }
          }
          if (frf == k)
          {
            this.field_label = paramCursor.getString(i);
          }
          else
          {
            if (frg == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_isHidden = bool;
                break;
              }
            }
            if (frh == k) {
              this.field_weight = paramCursor.getString(i);
            } else if (fag == k) {
              this.field_rawXML = paramCursor.getString(i);
            } else if (fri == k) {
              this.field_receiveTime = paramCursor.getLong(i);
            } else if (eZC == k) {
              this.vmr = paramCursor.getLong(i);
            }
          }
        }
      }
    }
    GMTrace.o(4135919288320L, 30815);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4136053506048L, 30816);
    ContentValues localContentValues = new ContentValues();
    if (this.eZx) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.fqR) {
      localContentValues.put("mergerId", this.field_mergerId);
    }
    if (this.fqS) {
      localContentValues.put("gameMsgId", this.field_gameMsgId);
    }
    if (this.feN) {
      localContentValues.put("msgType", Integer.valueOf(this.field_msgType));
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.fqT) {
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fqU) {
      localContentValues.put("showInMsgList", Boolean.valueOf(this.field_showInMsgList));
    }
    if (this.fqV) {
      localContentValues.put("isRead", Boolean.valueOf(this.field_isRead));
    }
    if (this.field_label == null) {
      this.field_label = "";
    }
    if (this.fqW) {
      localContentValues.put("label", this.field_label);
    }
    if (this.fqX) {
      localContentValues.put("isHidden", Boolean.valueOf(this.field_isHidden));
    }
    if (this.field_weight == null) {
      this.field_weight = "";
    }
    if (this.fqY) {
      localContentValues.put("weight", this.field_weight);
    }
    if (this.field_rawXML == null) {
      this.field_rawXML = "";
    }
    if (this.fac) {
      localContentValues.put("rawXML", this.field_rawXML);
    }
    if (this.fqZ) {
      localContentValues.put("receiveTime", Long.valueOf(this.field_receiveTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4136053506048L, 30816);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */