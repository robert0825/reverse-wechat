package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class z
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fca;
  private static final int fdA;
  private static final int fgB;
  private static final int fgC;
  private static final int fgD;
  private static final int fgE;
  private boolean fbW;
  private boolean fde;
  private boolean fgA;
  private boolean fgx;
  private boolean fgy;
  private boolean fgz;
  public String field_brandUsername;
  public String field_headImgUrl;
  public int field_kfType;
  public String field_nickname;
  public String field_openId;
  public long field_updateTime;
  
  static
  {
    GMTrace.i(4174439776256L, 31102);
    eZt = new String[0];
    fdA = "openId".hashCode();
    fgB = "brandUsername".hashCode();
    fgC = "headImgUrl".hashCode();
    fgD = "nickname".hashCode();
    fgE = "kfType".hashCode();
    fca = "updateTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4174439776256L, 31102);
  }
  
  public z()
  {
    GMTrace.i(4174037123072L, 31099);
    this.fde = true;
    this.fgx = true;
    this.fgy = true;
    this.fgz = true;
    this.fgA = true;
    this.fbW = true;
    GMTrace.o(4174037123072L, 31099);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4174171340800L, 31100);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4174171340800L, 31100);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fdA == k)
      {
        this.field_openId = paramCursor.getString(i);
        this.fde = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fgB == k) {
          this.field_brandUsername = paramCursor.getString(i);
        } else if (fgC == k) {
          this.field_headImgUrl = paramCursor.getString(i);
        } else if (fgD == k) {
          this.field_nickname = paramCursor.getString(i);
        } else if (fgE == k) {
          this.field_kfType = paramCursor.getInt(i);
        } else if (fca == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4174171340800L, 31100);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4174305558528L, 31101);
    ContentValues localContentValues = new ContentValues();
    if (this.fde) {
      localContentValues.put("openId", this.field_openId);
    }
    if (this.field_brandUsername == null) {
      this.field_brandUsername = "";
    }
    if (this.fgx) {
      localContentValues.put("brandUsername", this.field_brandUsername);
    }
    if (this.fgy) {
      localContentValues.put("headImgUrl", this.field_headImgUrl);
    }
    if (this.fgz) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if (this.fgA) {
      localContentValues.put("kfType", Integer.valueOf(this.field_kfType));
    }
    if (this.fbW) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4174305558528L, 31101);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */