package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class t
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faO;
  private static final int feP;
  private static final int feQ;
  private static final int feR;
  private static final int feS;
  private static final int feT;
  private static final int feU;
  private static final int feV;
  private static final int feW;
  private static final int feX;
  private static final int feY;
  private static final int feZ;
  private static final int fer;
  private static final int ffa;
  private static final int ffb;
  private static final int ffc;
  private boolean eZF;
  private boolean fas;
  private boolean feB;
  private boolean feC;
  private boolean feD;
  private boolean feE;
  private boolean feF;
  private boolean feG;
  private boolean feH;
  private boolean feI;
  private boolean feJ;
  private boolean feK;
  private boolean feL;
  private boolean feM;
  private boolean feN;
  private boolean feO;
  private boolean fep;
  public int field_atCount;
  public long field_bizChatId;
  public String field_brandUserName;
  public int field_chatType;
  public String field_content;
  public String field_digest;
  public String field_digestUser;
  public String field_editingMsg;
  public long field_flag;
  public int field_isSend;
  public long field_lastMsgID;
  public long field_lastMsgTime;
  public int field_msgCount;
  public String field_msgType;
  public int field_newUnReadCount;
  public int field_status;
  public int field_unReadCount;
  
  static
  {
    GMTrace.i(4149609496576L, 30917);
    eZt = new String[0];
    feP = "bizChatId".hashCode();
    feQ = "brandUserName".hashCode();
    feR = "unReadCount".hashCode();
    feS = "newUnReadCount".hashCode();
    feT = "lastMsgID".hashCode();
    feU = "lastMsgTime".hashCode();
    faO = "content".hashCode();
    feV = "digest".hashCode();
    feW = "digestUser".hashCode();
    feX = "atCount".hashCode();
    feY = "editingMsg".hashCode();
    feZ = "chatType".hashCode();
    eZI = "status".hashCode();
    ffa = "isSend".hashCode();
    ffb = "msgType".hashCode();
    ffc = "msgCount".hashCode();
    fer = "flag".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4149609496576L, 30917);
  }
  
  public t()
  {
    GMTrace.i(4149206843392L, 30914);
    this.feB = true;
    this.feC = true;
    this.feD = true;
    this.feE = true;
    this.feF = true;
    this.feG = true;
    this.fas = true;
    this.feH = true;
    this.feI = true;
    this.feJ = true;
    this.feK = true;
    this.feL = true;
    this.eZF = true;
    this.feM = true;
    this.feN = true;
    this.feO = true;
    this.fep = true;
    GMTrace.o(4149206843392L, 30914);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4149341061120L, 30915);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4149341061120L, 30915);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (feP == k)
      {
        this.field_bizChatId = paramCursor.getLong(i);
        this.feB = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (feQ == k) {
          this.field_brandUserName = paramCursor.getString(i);
        } else if (feR == k) {
          this.field_unReadCount = paramCursor.getInt(i);
        } else if (feS == k) {
          this.field_newUnReadCount = paramCursor.getInt(i);
        } else if (feT == k) {
          this.field_lastMsgID = paramCursor.getLong(i);
        } else if (feU == k) {
          this.field_lastMsgTime = paramCursor.getLong(i);
        } else if (faO == k) {
          this.field_content = paramCursor.getString(i);
        } else if (feV == k) {
          this.field_digest = paramCursor.getString(i);
        } else if (feW == k) {
          this.field_digestUser = paramCursor.getString(i);
        } else if (feX == k) {
          this.field_atCount = paramCursor.getInt(i);
        } else if (feY == k) {
          this.field_editingMsg = paramCursor.getString(i);
        } else if (feZ == k) {
          this.field_chatType = paramCursor.getInt(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (ffa == k) {
          this.field_isSend = paramCursor.getInt(i);
        } else if (ffb == k) {
          this.field_msgType = paramCursor.getString(i);
        } else if (ffc == k) {
          this.field_msgCount = paramCursor.getInt(i);
        } else if (fer == k) {
          this.field_flag = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4149341061120L, 30915);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4149475278848L, 30916);
    ContentValues localContentValues = new ContentValues();
    if (this.feB) {
      localContentValues.put("bizChatId", Long.valueOf(this.field_bizChatId));
    }
    if (this.feC) {
      localContentValues.put("brandUserName", this.field_brandUserName);
    }
    if (this.feD) {
      localContentValues.put("unReadCount", Integer.valueOf(this.field_unReadCount));
    }
    if (this.feE) {
      localContentValues.put("newUnReadCount", Integer.valueOf(this.field_newUnReadCount));
    }
    if (this.feF) {
      localContentValues.put("lastMsgID", Long.valueOf(this.field_lastMsgID));
    }
    if (this.feG) {
      localContentValues.put("lastMsgTime", Long.valueOf(this.field_lastMsgTime));
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.field_digest == null) {
      this.field_digest = "";
    }
    if (this.feH) {
      localContentValues.put("digest", this.field_digest);
    }
    if (this.field_digestUser == null) {
      this.field_digestUser = "";
    }
    if (this.feI) {
      localContentValues.put("digestUser", this.field_digestUser);
    }
    if (this.feJ) {
      localContentValues.put("atCount", Integer.valueOf(this.field_atCount));
    }
    if (this.feK) {
      localContentValues.put("editingMsg", this.field_editingMsg);
    }
    if (this.feL) {
      localContentValues.put("chatType", Integer.valueOf(this.field_chatType));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.feM) {
      localContentValues.put("isSend", Integer.valueOf(this.field_isSend));
    }
    if (this.field_msgType == null) {
      this.field_msgType = "";
    }
    if (this.feN) {
      localContentValues.put("msgType", this.field_msgType);
    }
    if (this.feO) {
      localContentValues.put("msgCount", Integer.valueOf(this.field_msgCount));
    }
    if (this.fep) {
      localContentValues.put("flag", Long.valueOf(this.field_flag));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4149475278848L, 30916);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */