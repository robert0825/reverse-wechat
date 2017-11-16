package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class u
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int feQ;
  private static final int feZ;
  private static final int ffA;
  private static final int ffp;
  private static final int ffq;
  private static final int ffr;
  private static final int ffs;
  private static final int fft;
  private static final int ffu;
  private static final int ffv;
  private static final int ffw;
  private static final int ffx;
  private static final int ffy;
  private static final int ffz;
  private boolean feC;
  private boolean feL;
  private boolean ffd;
  private boolean ffe;
  private boolean fff;
  private boolean ffg;
  private boolean ffh;
  private boolean ffi;
  private boolean ffj;
  private boolean ffk;
  private boolean ffl;
  private boolean ffm;
  private boolean ffn;
  private boolean ffo;
  public String field_addMemberUrl;
  public int field_bitFlag;
  public long field_bizChatLocalId;
  public String field_bizChatServId;
  public String field_brandUserName;
  public String field_chatName;
  public String field_chatNamePY;
  public int field_chatType;
  public int field_chatVersion;
  public String field_headImageUrl;
  public int field_maxMemberCnt;
  public boolean field_needToUpdate;
  public String field_ownerUserId;
  public String field_userList;
  
  static
  {
    GMTrace.i(4114847105024L, 30658);
    eZt = new String[0];
    ffp = "bizChatLocalId".hashCode();
    ffq = "bizChatServId".hashCode();
    feQ = "brandUserName".hashCode();
    feZ = "chatType".hashCode();
    ffr = "headImageUrl".hashCode();
    ffs = "chatName".hashCode();
    fft = "chatNamePY".hashCode();
    ffu = "chatVersion".hashCode();
    ffv = "needToUpdate".hashCode();
    ffw = "bitFlag".hashCode();
    ffx = "maxMemberCnt".hashCode();
    ffy = "ownerUserId".hashCode();
    ffz = "userList".hashCode();
    ffA = "addMemberUrl".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4114847105024L, 30658);
  }
  
  public u()
  {
    GMTrace.i(4114444451840L, 30655);
    this.ffd = true;
    this.ffe = true;
    this.feC = true;
    this.feL = true;
    this.fff = true;
    this.ffg = true;
    this.ffh = true;
    this.ffi = true;
    this.ffj = true;
    this.ffk = true;
    this.ffl = true;
    this.ffm = true;
    this.ffn = true;
    this.ffo = true;
    GMTrace.o(4114444451840L, 30655);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4114578669568L, 30656);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4114578669568L, 30656);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ffp == k)
      {
        this.field_bizChatLocalId = paramCursor.getLong(i);
        this.ffd = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (ffq == k)
        {
          this.field_bizChatServId = paramCursor.getString(i);
        }
        else if (feQ == k)
        {
          this.field_brandUserName = paramCursor.getString(i);
        }
        else if (feZ == k)
        {
          this.field_chatType = paramCursor.getInt(i);
        }
        else if (ffr == k)
        {
          this.field_headImageUrl = paramCursor.getString(i);
        }
        else if (ffs == k)
        {
          this.field_chatName = paramCursor.getString(i);
        }
        else if (fft == k)
        {
          this.field_chatNamePY = paramCursor.getString(i);
        }
        else if (ffu == k)
        {
          this.field_chatVersion = paramCursor.getInt(i);
        }
        else
        {
          if (ffv == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_needToUpdate = bool;
              break;
            }
          }
          if (ffw == k) {
            this.field_bitFlag = paramCursor.getInt(i);
          } else if (ffx == k) {
            this.field_maxMemberCnt = paramCursor.getInt(i);
          } else if (ffy == k) {
            this.field_ownerUserId = paramCursor.getString(i);
          } else if (ffz == k) {
            this.field_userList = paramCursor.getString(i);
          } else if (ffA == k) {
            this.field_addMemberUrl = paramCursor.getString(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4114578669568L, 30656);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4114712887296L, 30657);
    ContentValues localContentValues = new ContentValues();
    if (this.ffd) {
      localContentValues.put("bizChatLocalId", Long.valueOf(this.field_bizChatLocalId));
    }
    if (this.ffe) {
      localContentValues.put("bizChatServId", this.field_bizChatServId);
    }
    if (this.field_brandUserName == null) {
      this.field_brandUserName = "";
    }
    if (this.feC) {
      localContentValues.put("brandUserName", this.field_brandUserName);
    }
    if (this.feL) {
      localContentValues.put("chatType", Integer.valueOf(this.field_chatType));
    }
    if (this.fff) {
      localContentValues.put("headImageUrl", this.field_headImageUrl);
    }
    if (this.field_chatName == null) {
      this.field_chatName = "";
    }
    if (this.ffg) {
      localContentValues.put("chatName", this.field_chatName);
    }
    if (this.field_chatNamePY == null) {
      this.field_chatNamePY = "";
    }
    if (this.ffh) {
      localContentValues.put("chatNamePY", this.field_chatNamePY);
    }
    if (this.ffi) {
      localContentValues.put("chatVersion", Integer.valueOf(this.field_chatVersion));
    }
    if (this.ffj) {
      localContentValues.put("needToUpdate", Boolean.valueOf(this.field_needToUpdate));
    }
    if (this.ffk) {
      localContentValues.put("bitFlag", Integer.valueOf(this.field_bitFlag));
    }
    if (this.ffl) {
      localContentValues.put("maxMemberCnt", Integer.valueOf(this.field_maxMemberCnt));
    }
    if (this.ffm) {
      localContentValues.put("ownerUserId", this.field_ownerUserId);
    }
    if (this.ffn) {
      localContentValues.put("userList", this.field_userList);
    }
    if (this.ffo) {
      localContentValues.put("addMemberUrl", this.field_addMemberUrl);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4114712887296L, 30657);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */