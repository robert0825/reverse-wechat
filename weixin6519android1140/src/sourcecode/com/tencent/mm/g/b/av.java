package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class av
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fmh;
  private static final int fnA;
  private static final int fnB;
  private static final int fnC;
  private static final int fnD;
  private static final int fnE;
  private static final int fnF;
  private static final int fnq;
  private static final int fnr;
  private static final int fns;
  private static final int fnt;
  private static final int fnu;
  private static final int fnv;
  private static final int fnw;
  private static final int fnx;
  private static final int fny;
  private static final int fnz;
  public int field_addScene;
  public String field_contentFromUsername;
  public String field_contentFullPhoneNumMD5;
  public String field_contentNickname;
  public String field_contentPhoneNumMD5;
  public String field_contentVerifyContent;
  public String field_displayName;
  public String field_encryptTalker;
  public String field_fmsgContent;
  public int field_fmsgIsSend;
  public long field_fmsgSysRowId;
  public int field_fmsgType;
  public int field_isNew;
  public long field_lastModifiedTime;
  public int field_recvFmsgType;
  public int field_state;
  public String field_talker;
  private boolean flI;
  private boolean fna;
  private boolean fnb;
  private boolean fnc;
  private boolean fnd;
  private boolean fne;
  private boolean fnf;
  private boolean fng;
  private boolean fnh;
  private boolean fni;
  private boolean fnj;
  private boolean fnk;
  private boolean fnl;
  private boolean fnm;
  private boolean fnn;
  private boolean fno;
  private boolean fnp;
  
  static
  {
    GMTrace.i(4131221667840L, 30780);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS fmconversation_isnew_Index ON fmessage_conversation(isNew)" };
    fnq = "talker".hashCode();
    fnr = "encryptTalker".hashCode();
    fns = "displayName".hashCode();
    fmh = "state".hashCode();
    fnt = "lastModifiedTime".hashCode();
    fnu = "isNew".hashCode();
    fnv = "addScene".hashCode();
    fnw = "fmsgSysRowId".hashCode();
    fnx = "fmsgIsSend".hashCode();
    fny = "fmsgType".hashCode();
    fnz = "fmsgContent".hashCode();
    fnA = "recvFmsgType".hashCode();
    fnB = "contentFromUsername".hashCode();
    fnC = "contentNickname".hashCode();
    fnD = "contentPhoneNumMD5".hashCode();
    fnE = "contentFullPhoneNumMD5".hashCode();
    fnF = "contentVerifyContent".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4131221667840L, 30780);
  }
  
  public av()
  {
    GMTrace.i(4130819014656L, 30777);
    this.fna = true;
    this.fnb = true;
    this.fnc = true;
    this.flI = true;
    this.fnd = true;
    this.fne = true;
    this.fnf = true;
    this.fng = true;
    this.fnh = true;
    this.fni = true;
    this.fnj = true;
    this.fnk = true;
    this.fnl = true;
    this.fnm = true;
    this.fnn = true;
    this.fno = true;
    this.fnp = true;
    GMTrace.o(4130819014656L, 30777);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4130953232384L, 30778);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4130953232384L, 30778);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fnq == k)
      {
        this.field_talker = paramCursor.getString(i);
        this.fna = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fnr == k) {
          this.field_encryptTalker = paramCursor.getString(i);
        } else if (fns == k) {
          this.field_displayName = paramCursor.getString(i);
        } else if (fmh == k) {
          this.field_state = paramCursor.getInt(i);
        } else if (fnt == k) {
          this.field_lastModifiedTime = paramCursor.getLong(i);
        } else if (fnu == k) {
          this.field_isNew = paramCursor.getInt(i);
        } else if (fnv == k) {
          this.field_addScene = paramCursor.getInt(i);
        } else if (fnw == k) {
          this.field_fmsgSysRowId = paramCursor.getLong(i);
        } else if (fnx == k) {
          this.field_fmsgIsSend = paramCursor.getInt(i);
        } else if (fny == k) {
          this.field_fmsgType = paramCursor.getInt(i);
        } else if (fnz == k) {
          this.field_fmsgContent = paramCursor.getString(i);
        } else if (fnA == k) {
          this.field_recvFmsgType = paramCursor.getInt(i);
        } else if (fnB == k) {
          this.field_contentFromUsername = paramCursor.getString(i);
        } else if (fnC == k) {
          this.field_contentNickname = paramCursor.getString(i);
        } else if (fnD == k) {
          this.field_contentPhoneNumMD5 = paramCursor.getString(i);
        } else if (fnE == k) {
          this.field_contentFullPhoneNumMD5 = paramCursor.getString(i);
        } else if (fnF == k) {
          this.field_contentVerifyContent = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4130953232384L, 30778);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4131087450112L, 30779);
    ContentValues localContentValues = new ContentValues();
    if (this.field_talker == null) {
      this.field_talker = "0";
    }
    if (this.fna) {
      localContentValues.put("talker", this.field_talker);
    }
    if (this.field_encryptTalker == null) {
      this.field_encryptTalker = "";
    }
    if (this.fnb) {
      localContentValues.put("encryptTalker", this.field_encryptTalker);
    }
    if (this.field_displayName == null) {
      this.field_displayName = "";
    }
    if (this.fnc) {
      localContentValues.put("displayName", this.field_displayName);
    }
    if (this.flI) {
      localContentValues.put("state", Integer.valueOf(this.field_state));
    }
    if (this.fnd) {
      localContentValues.put("lastModifiedTime", Long.valueOf(this.field_lastModifiedTime));
    }
    if (this.fne) {
      localContentValues.put("isNew", Integer.valueOf(this.field_isNew));
    }
    if (this.fnf) {
      localContentValues.put("addScene", Integer.valueOf(this.field_addScene));
    }
    if (this.fng) {
      localContentValues.put("fmsgSysRowId", Long.valueOf(this.field_fmsgSysRowId));
    }
    if (this.fnh) {
      localContentValues.put("fmsgIsSend", Integer.valueOf(this.field_fmsgIsSend));
    }
    if (this.fni) {
      localContentValues.put("fmsgType", Integer.valueOf(this.field_fmsgType));
    }
    if (this.field_fmsgContent == null) {
      this.field_fmsgContent = "";
    }
    if (this.fnj) {
      localContentValues.put("fmsgContent", this.field_fmsgContent);
    }
    if (this.fnk) {
      localContentValues.put("recvFmsgType", Integer.valueOf(this.field_recvFmsgType));
    }
    if (this.field_contentFromUsername == null) {
      this.field_contentFromUsername = "";
    }
    if (this.fnl) {
      localContentValues.put("contentFromUsername", this.field_contentFromUsername);
    }
    if (this.field_contentNickname == null) {
      this.field_contentNickname = "";
    }
    if (this.fnm) {
      localContentValues.put("contentNickname", this.field_contentNickname);
    }
    if (this.field_contentPhoneNumMD5 == null) {
      this.field_contentPhoneNumMD5 = "";
    }
    if (this.fnn) {
      localContentValues.put("contentPhoneNumMD5", this.field_contentPhoneNumMD5);
    }
    if (this.field_contentFullPhoneNumMD5 == null) {
      this.field_contentFullPhoneNumMD5 = "";
    }
    if (this.fno) {
      localContentValues.put("contentFullPhoneNumMD5", this.field_contentFullPhoneNumMD5);
    }
    if (this.field_contentVerifyContent == null) {
      this.field_contentVerifyContent = "";
    }
    if (this.fnp) {
      localContentValues.put("contentVerifyContent", this.field_contentVerifyContent);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4131087450112L, 30779);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */