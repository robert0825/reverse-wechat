package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cf
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faG;
  private static final int fmh;
  private static final int fmo;
  private static final int fwM;
  private static final int fwN;
  private static final int fwO;
  private static final int fwP;
  private static final int fwQ;
  private static final int fwR;
  private boolean fak;
  public long field_createTime;
  public String field_groupId;
  public String field_inviteUserName;
  public int field_memberCount;
  public int field_roomId;
  public long field_roomKey;
  public int field_routeId;
  public int field_state;
  public String field_wxGroupId;
  private boolean flI;
  private boolean flP;
  private boolean fwG;
  private boolean fwH;
  private boolean fwI;
  private boolean fwJ;
  private boolean fwK;
  private boolean fwL;
  
  static
  {
    GMTrace.i(4122229080064L, 30713);
    eZt = new String[0];
    fwM = "wxGroupId".hashCode();
    fmo = "groupId".hashCode();
    fwN = "roomId".hashCode();
    fwO = "roomKey".hashCode();
    fwP = "routeId".hashCode();
    fwQ = "inviteUserName".hashCode();
    fwR = "memberCount".hashCode();
    faG = "createTime".hashCode();
    fmh = "state".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4122229080064L, 30713);
  }
  
  public cf()
  {
    GMTrace.i(4121826426880L, 30710);
    this.fwG = true;
    this.flP = true;
    this.fwH = true;
    this.fwI = true;
    this.fwJ = true;
    this.fwK = true;
    this.fwL = true;
    this.fak = true;
    this.flI = true;
    GMTrace.o(4121826426880L, 30710);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4121960644608L, 30711);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4121960644608L, 30711);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fwM == k)
      {
        this.field_wxGroupId = paramCursor.getString(i);
        this.fwG = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fmo == k) {
          this.field_groupId = paramCursor.getString(i);
        } else if (fwN == k) {
          this.field_roomId = paramCursor.getInt(i);
        } else if (fwO == k) {
          this.field_roomKey = paramCursor.getLong(i);
        } else if (fwP == k) {
          this.field_routeId = paramCursor.getInt(i);
        } else if (fwQ == k) {
          this.field_inviteUserName = paramCursor.getString(i);
        } else if (fwR == k) {
          this.field_memberCount = paramCursor.getInt(i);
        } else if (faG == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (fmh == k) {
          this.field_state = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4121960644608L, 30711);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4122094862336L, 30712);
    ContentValues localContentValues = new ContentValues();
    if (this.fwG) {
      localContentValues.put("wxGroupId", this.field_wxGroupId);
    }
    if (this.flP) {
      localContentValues.put("groupId", this.field_groupId);
    }
    if (this.fwH) {
      localContentValues.put("roomId", Integer.valueOf(this.field_roomId));
    }
    if (this.fwI) {
      localContentValues.put("roomKey", Long.valueOf(this.field_roomKey));
    }
    if (this.fwJ) {
      localContentValues.put("routeId", Integer.valueOf(this.field_routeId));
    }
    if (this.fwK) {
      localContentValues.put("inviteUserName", this.field_inviteUserName);
    }
    if (this.fwL) {
      localContentValues.put("memberCount", Integer.valueOf(this.field_memberCount));
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.flI) {
      localContentValues.put("state", Integer.valueOf(this.field_state));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4122094862336L, 30712);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */