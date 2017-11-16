package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cg
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faE;
  private static final int faG;
  private static final int fwM;
  private static final int fwQ;
  private static final int fwU;
  private static final int fwV;
  private boolean eZF;
  private boolean fai;
  private boolean fak;
  public long field_createTime;
  public String field_inviteUserName;
  public long field_memberId;
  public long field_memberUuid;
  public int field_status;
  public String field_userName;
  public String field_wxGroupId;
  private boolean fwG;
  private boolean fwK;
  private boolean fwS;
  private boolean fwT;
  
  static
  {
    GMTrace.i(4161823309824L, 31008);
    eZt = new String[0];
    fwU = "memberUuid".hashCode();
    fwM = "wxGroupId".hashCode();
    faE = "userName".hashCode();
    fwQ = "inviteUserName".hashCode();
    fwV = "memberId".hashCode();
    eZI = "status".hashCode();
    faG = "createTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4161823309824L, 31008);
  }
  
  public cg()
  {
    GMTrace.i(4161420656640L, 31005);
    this.fwS = true;
    this.fwG = true;
    this.fai = true;
    this.fwK = true;
    this.fwT = true;
    this.eZF = true;
    this.fak = true;
    GMTrace.o(4161420656640L, 31005);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4161554874368L, 31006);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4161554874368L, 31006);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fwU == k) {
        this.field_memberUuid = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fwM == k) {
          this.field_wxGroupId = paramCursor.getString(i);
        } else if (faE == k) {
          this.field_userName = paramCursor.getString(i);
        } else if (fwQ == k) {
          this.field_inviteUserName = paramCursor.getString(i);
        } else if (fwV == k) {
          this.field_memberId = paramCursor.getLong(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (faG == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4161554874368L, 31006);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4161689092096L, 31007);
    ContentValues localContentValues = new ContentValues();
    if (this.fwS) {
      localContentValues.put("memberUuid", Long.valueOf(this.field_memberUuid));
    }
    if (this.fwG) {
      localContentValues.put("wxGroupId", this.field_wxGroupId);
    }
    if (this.fai) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.fwK) {
      localContentValues.put("inviteUserName", this.field_inviteUserName);
    }
    if (this.fwT) {
      localContentValues.put("memberId", Long.valueOf(this.field_memberId));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4161689092096L, 31007);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */