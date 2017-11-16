package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class w
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faE;
  private static final int feQ;
  private static final int ffA;
  private static final int ffC;
  private static final int ffG;
  private static final int ffH;
  private static final int ffI;
  private static final int ffr;
  private static final int ffv;
  private static final int ffw;
  private boolean fai;
  private boolean feC;
  private boolean ffB;
  private boolean ffD;
  private boolean ffE;
  private boolean ffF;
  private boolean fff;
  private boolean ffj;
  private boolean ffk;
  private boolean ffo;
  public int field_UserVersion;
  public String field_addMemberUrl;
  public int field_bitFlag;
  public String field_brandUserName;
  public String field_headImageUrl;
  public boolean field_needToUpdate;
  public String field_profileUrl;
  public String field_userId;
  public String field_userName;
  public String field_userNamePY;
  
  static
  {
    GMTrace.i(4117934112768L, 30681);
    eZt = new String[0];
    ffC = "userId".hashCode();
    faE = "userName".hashCode();
    ffG = "userNamePY".hashCode();
    feQ = "brandUserName".hashCode();
    ffH = "UserVersion".hashCode();
    ffv = "needToUpdate".hashCode();
    ffr = "headImageUrl".hashCode();
    ffI = "profileUrl".hashCode();
    ffw = "bitFlag".hashCode();
    ffA = "addMemberUrl".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4117934112768L, 30681);
  }
  
  public w()
  {
    GMTrace.i(4117531459584L, 30678);
    this.ffB = true;
    this.fai = true;
    this.ffD = true;
    this.feC = true;
    this.ffE = true;
    this.ffj = true;
    this.fff = true;
    this.ffF = true;
    this.ffk = true;
    this.ffo = true;
    GMTrace.o(4117531459584L, 30678);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4117665677312L, 30679);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4117665677312L, 30679);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ffC == k)
      {
        this.field_userId = paramCursor.getString(i);
        this.ffB = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (faE == k)
        {
          this.field_userName = paramCursor.getString(i);
        }
        else if (ffG == k)
        {
          this.field_userNamePY = paramCursor.getString(i);
        }
        else if (feQ == k)
        {
          this.field_brandUserName = paramCursor.getString(i);
        }
        else if (ffH == k)
        {
          this.field_UserVersion = paramCursor.getInt(i);
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
          if (ffr == k) {
            this.field_headImageUrl = paramCursor.getString(i);
          } else if (ffI == k) {
            this.field_profileUrl = paramCursor.getString(i);
          } else if (ffw == k) {
            this.field_bitFlag = paramCursor.getInt(i);
          } else if (ffA == k) {
            this.field_addMemberUrl = paramCursor.getString(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4117665677312L, 30679);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4117799895040L, 30680);
    ContentValues localContentValues = new ContentValues();
    if (this.ffB) {
      localContentValues.put("userId", this.field_userId);
    }
    if (this.field_userName == null) {
      this.field_userName = "";
    }
    if (this.fai) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.field_userNamePY == null) {
      this.field_userNamePY = "";
    }
    if (this.ffD) {
      localContentValues.put("userNamePY", this.field_userNamePY);
    }
    if (this.field_brandUserName == null) {
      this.field_brandUserName = "";
    }
    if (this.feC) {
      localContentValues.put("brandUserName", this.field_brandUserName);
    }
    if (this.ffE) {
      localContentValues.put("UserVersion", Integer.valueOf(this.field_UserVersion));
    }
    if (this.ffj) {
      localContentValues.put("needToUpdate", Boolean.valueOf(this.field_needToUpdate));
    }
    if (this.fff) {
      localContentValues.put("headImageUrl", this.field_headImageUrl);
    }
    if (this.ffF) {
      localContentValues.put("profileUrl", this.field_profileUrl);
    }
    if (this.ffk) {
      localContentValues.put("bitFlag", Integer.valueOf(this.field_bitFlag));
    }
    if (this.ffo) {
      localContentValues.put("addMemberUrl", this.field_addMemberUrl);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4117799895040L, 30680);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */