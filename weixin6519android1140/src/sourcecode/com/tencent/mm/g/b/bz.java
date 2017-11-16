package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bz
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faJ;
  private static final int faO;
  private static final int fbb;
  private static final int fbc;
  private static final int fer;
  private static final int ffa;
  private static final int fme;
  private static final int fnq;
  private static final int ftO;
  private static final int ftP;
  private static final int ftQ;
  private static final int ftR;
  private static final int ftS;
  private boolean eZF;
  private boolean faZ;
  private boolean fan;
  private boolean fas;
  private boolean fba;
  private boolean feM;
  private boolean fep;
  public String field_content;
  public long field_createtime;
  public int field_flag;
  public String field_imgpath;
  public int field_isSend;
  public String field_sayhicontent;
  public String field_sayhiencryptuser;
  public String field_sayhiuser;
  public int field_scene;
  public int field_status;
  public long field_svrid;
  public String field_talker;
  public String field_ticket;
  public int field_type;
  private boolean flF;
  private boolean fna;
  private boolean ftJ;
  private boolean ftK;
  private boolean ftL;
  private boolean ftM;
  private boolean ftN;
  
  static
  {
    GMTrace.i(4155112423424L, 30958);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS lbsverifymessage_unread_index ON LBSVerifyMessage(status)", "CREATE INDEX IF NOT EXISTS lbsverifymessage_createtimeIndex ON LBSVerifyMessage(createtime)" };
    fme = "svrid".hashCode();
    eZI = "status".hashCode();
    faJ = "type".hashCode();
    fbb = "scene".hashCode();
    ftO = "createtime".hashCode();
    fnq = "talker".hashCode();
    faO = "content".hashCode();
    ftP = "sayhiuser".hashCode();
    ftQ = "sayhicontent".hashCode();
    ftR = "imgpath".hashCode();
    ffa = "isSend".hashCode();
    ftS = "sayhiencryptuser".hashCode();
    fbc = "ticket".hashCode();
    fer = "flag".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4155112423424L, 30958);
  }
  
  public bz()
  {
    GMTrace.i(4154709770240L, 30955);
    this.flF = true;
    this.eZF = true;
    this.fan = true;
    this.faZ = true;
    this.ftJ = true;
    this.fna = true;
    this.fas = true;
    this.ftK = true;
    this.ftL = true;
    this.ftM = true;
    this.feM = true;
    this.ftN = true;
    this.fba = true;
    this.fep = true;
    GMTrace.o(4154709770240L, 30955);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4154843987968L, 30956);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4154843987968L, 30956);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fme == k)
      {
        this.field_svrid = paramCursor.getLong(i);
        this.flF = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (fbb == k) {
          this.field_scene = paramCursor.getInt(i);
        } else if (ftO == k) {
          this.field_createtime = paramCursor.getLong(i);
        } else if (fnq == k) {
          this.field_talker = paramCursor.getString(i);
        } else if (faO == k) {
          this.field_content = paramCursor.getString(i);
        } else if (ftP == k) {
          this.field_sayhiuser = paramCursor.getString(i);
        } else if (ftQ == k) {
          this.field_sayhicontent = paramCursor.getString(i);
        } else if (ftR == k) {
          this.field_imgpath = paramCursor.getString(i);
        } else if (ffa == k) {
          this.field_isSend = paramCursor.getInt(i);
        } else if (ftS == k) {
          this.field_sayhiencryptuser = paramCursor.getString(i);
        } else if (fbc == k) {
          this.field_ticket = paramCursor.getString(i);
        } else if (fer == k) {
          this.field_flag = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4154843987968L, 30956);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4154978205696L, 30957);
    ContentValues localContentValues = new ContentValues();
    if (this.flF) {
      localContentValues.put("svrid", Long.valueOf(this.field_svrid));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.faZ) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.ftJ) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.fna) {
      localContentValues.put("talker", this.field_talker);
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.ftK) {
      localContentValues.put("sayhiuser", this.field_sayhiuser);
    }
    if (this.ftL) {
      localContentValues.put("sayhicontent", this.field_sayhicontent);
    }
    if (this.ftM) {
      localContentValues.put("imgpath", this.field_imgpath);
    }
    if (this.feM) {
      localContentValues.put("isSend", Integer.valueOf(this.field_isSend));
    }
    if (this.ftN) {
      localContentValues.put("sayhiencryptuser", this.field_sayhiencryptuser);
    }
    if (this.fba) {
      localContentValues.put("ticket", this.field_ticket);
    }
    if (this.fep) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4154978205696L, 30957);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */