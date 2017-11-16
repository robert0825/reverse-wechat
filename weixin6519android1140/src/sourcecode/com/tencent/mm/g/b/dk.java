package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dk
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int fDA;
  private static final int fDB;
  private static final int fDq;
  private static final int fDr;
  private static final int fDs;
  private static final int fDt;
  private static final int fDu;
  private static final int fDv;
  private static final int fDw;
  private static final int fDx;
  private static final int fDy;
  private static final int fDz;
  private static final int fbA;
  private static final int fmj;
  private static final int fmk;
  private static final int ftO;
  private boolean eZF;
  private boolean fDe;
  private boolean fDf;
  private boolean fDg;
  private boolean fDh;
  private boolean fDi;
  private boolean fDj;
  private boolean fDk;
  private boolean fDl;
  private boolean fDm;
  private boolean fDn;
  private boolean fDo;
  private boolean fDp;
  private boolean fbj;
  public String field_clientid;
  public long field_createtime;
  public String field_filename;
  public int field_filenowsize;
  public String field_human;
  public long field_lastmodifytime;
  public long field_msgid;
  public int field_msglocalid;
  public int field_nettimes;
  public int field_offset;
  public int field_reserved1;
  public String field_reserved2;
  public int field_status;
  public int field_totallen;
  public String field_user;
  public int field_voiceformat;
  public int field_voicelenght;
  private boolean flK;
  private boolean flL;
  private boolean ftJ;
  
  static
  {
    GMTrace.i(4168936849408L, 31061);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS voiceRemindFileNameIndex ON VoiceRemindInfo(filename)" };
    fDq = "filename".hashCode();
    fDr = "user".hashCode();
    fDs = "msgid".hashCode();
    fbA = "offset".hashCode();
    fDt = "filenowsize".hashCode();
    fDu = "totallen".hashCode();
    eZI = "status".hashCode();
    ftO = "createtime".hashCode();
    fDv = "lastmodifytime".hashCode();
    fDw = "clientid".hashCode();
    fDx = "voicelenght".hashCode();
    fDy = "msglocalid".hashCode();
    fDz = "human".hashCode();
    fDA = "voiceformat".hashCode();
    fDB = "nettimes".hashCode();
    fmj = "reserved1".hashCode();
    fmk = "reserved2".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4168936849408L, 31061);
  }
  
  public dk()
  {
    GMTrace.i(4168534196224L, 31058);
    this.fDe = true;
    this.fDf = true;
    this.fDg = true;
    this.fbj = true;
    this.fDh = true;
    this.fDi = true;
    this.eZF = true;
    this.ftJ = true;
    this.fDj = true;
    this.fDk = true;
    this.fDl = true;
    this.fDm = true;
    this.fDn = true;
    this.fDo = true;
    this.fDp = true;
    this.flK = true;
    this.flL = true;
    GMTrace.o(4168534196224L, 31058);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4168668413952L, 31059);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4168668413952L, 31059);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fDq == k) {
        this.field_filename = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fDr == k) {
          this.field_user = paramCursor.getString(i);
        } else if (fDs == k) {
          this.field_msgid = paramCursor.getLong(i);
        } else if (fbA == k) {
          this.field_offset = paramCursor.getInt(i);
        } else if (fDt == k) {
          this.field_filenowsize = paramCursor.getInt(i);
        } else if (fDu == k) {
          this.field_totallen = paramCursor.getInt(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (ftO == k) {
          this.field_createtime = paramCursor.getLong(i);
        } else if (fDv == k) {
          this.field_lastmodifytime = paramCursor.getLong(i);
        } else if (fDw == k) {
          this.field_clientid = paramCursor.getString(i);
        } else if (fDx == k) {
          this.field_voicelenght = paramCursor.getInt(i);
        } else if (fDy == k) {
          this.field_msglocalid = paramCursor.getInt(i);
        } else if (fDz == k) {
          this.field_human = paramCursor.getString(i);
        } else if (fDA == k) {
          this.field_voiceformat = paramCursor.getInt(i);
        } else if (fDB == k) {
          this.field_nettimes = paramCursor.getInt(i);
        } else if (fmj == k) {
          this.field_reserved1 = paramCursor.getInt(i);
        } else if (fmk == k) {
          this.field_reserved2 = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4168668413952L, 31059);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4168802631680L, 31060);
    ContentValues localContentValues = new ContentValues();
    if (this.fDe) {
      localContentValues.put("filename", this.field_filename);
    }
    if (this.fDf) {
      localContentValues.put("user", this.field_user);
    }
    if (this.fDg) {
      localContentValues.put("msgid", Long.valueOf(this.field_msgid));
    }
    if (this.fbj) {
      localContentValues.put("offset", Integer.valueOf(this.field_offset));
    }
    if (this.fDh) {
      localContentValues.put("filenowsize", Integer.valueOf(this.field_filenowsize));
    }
    if (this.fDi) {
      localContentValues.put("totallen", Integer.valueOf(this.field_totallen));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.ftJ) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.fDj) {
      localContentValues.put("lastmodifytime", Long.valueOf(this.field_lastmodifytime));
    }
    if (this.fDk) {
      localContentValues.put("clientid", this.field_clientid);
    }
    if (this.fDl) {
      localContentValues.put("voicelenght", Integer.valueOf(this.field_voicelenght));
    }
    if (this.fDm) {
      localContentValues.put("msglocalid", Integer.valueOf(this.field_msglocalid));
    }
    if (this.fDn) {
      localContentValues.put("human", this.field_human);
    }
    if (this.fDo) {
      localContentValues.put("voiceformat", Integer.valueOf(this.field_voiceformat));
    }
    if (this.fDp) {
      localContentValues.put("nettimes", Integer.valueOf(this.field_nettimes));
    }
    if (this.flK) {
      localContentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
    }
    if (this.flL) {
      localContentValues.put("reserved2", this.field_reserved2);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4168802631680L, 31060);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */