package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bn
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int fcc;
  private static final int fgD;
  private static final int frM;
  private static final int frN;
  private static final int frO;
  private static final int frP;
  private static final int frQ;
  private static final int frR;
  private static final int frS;
  private static final int frT;
  private static final int frU;
  private static final int frV;
  private static final int frW;
  private static final int frX;
  private static final int frY;
  private boolean eZF;
  private boolean fcb;
  private boolean fgz;
  public String field_big_url;
  public String field_contecttype;
  public int field_googlecgistatus;
  public String field_googlegmail;
  public String field_googleid;
  public String field_googleitemid;
  public String field_googlename;
  public String field_googlenamepy;
  public String field_googlephotourl;
  public String field_nickname;
  public String field_nicknameqp;
  public int field_ret;
  public String field_small_url;
  public int field_status;
  public String field_username;
  public String field_usernamepy;
  private boolean frA;
  private boolean frB;
  private boolean frC;
  private boolean frD;
  private boolean frE;
  private boolean frF;
  private boolean frG;
  private boolean frH;
  private boolean frI;
  private boolean frJ;
  private boolean frK;
  private boolean frL;
  private boolean frz;
  
  static
  {
    GMTrace.i(4130147926016L, 30772);
    eZt = new String[0];
    frM = "googleid".hashCode();
    frN = "googlename".hashCode();
    frO = "googlephotourl".hashCode();
    frP = "googlegmail".hashCode();
    fcc = "username".hashCode();
    fgD = "nickname".hashCode();
    frQ = "nicknameqp".hashCode();
    frR = "usernamepy".hashCode();
    frS = "small_url".hashCode();
    frT = "big_url".hashCode();
    frU = "ret".hashCode();
    eZI = "status".hashCode();
    frV = "googleitemid".hashCode();
    frW = "googlecgistatus".hashCode();
    frX = "contecttype".hashCode();
    frY = "googlenamepy".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4130147926016L, 30772);
  }
  
  public bn()
  {
    GMTrace.i(4129745272832L, 30769);
    this.frz = true;
    this.frA = true;
    this.frB = true;
    this.frC = true;
    this.fcb = true;
    this.fgz = true;
    this.frD = true;
    this.frE = true;
    this.frF = true;
    this.frG = true;
    this.frH = true;
    this.eZF = true;
    this.frI = true;
    this.frJ = true;
    this.frK = true;
    this.frL = true;
    GMTrace.o(4129745272832L, 30769);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4129879490560L, 30770);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4129879490560L, 30770);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (frM == k) {
        this.field_googleid = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (frN == k)
        {
          this.field_googlename = paramCursor.getString(i);
        }
        else if (frO == k)
        {
          this.field_googlephotourl = paramCursor.getString(i);
        }
        else if (frP == k)
        {
          this.field_googlegmail = paramCursor.getString(i);
        }
        else if (fcc == k)
        {
          this.field_username = paramCursor.getString(i);
        }
        else if (fgD == k)
        {
          this.field_nickname = paramCursor.getString(i);
        }
        else if (frQ == k)
        {
          this.field_nicknameqp = paramCursor.getString(i);
        }
        else if (frR == k)
        {
          this.field_usernamepy = paramCursor.getString(i);
        }
        else if (frS == k)
        {
          this.field_small_url = paramCursor.getString(i);
        }
        else if (frT == k)
        {
          this.field_big_url = paramCursor.getString(i);
        }
        else if (frU == k)
        {
          this.field_ret = paramCursor.getInt(i);
        }
        else if (eZI == k)
        {
          this.field_status = paramCursor.getInt(i);
        }
        else if (frV == k)
        {
          this.field_googleitemid = paramCursor.getString(i);
          this.frI = true;
        }
        else if (frW == k)
        {
          this.field_googlecgistatus = paramCursor.getInt(i);
        }
        else if (frX == k)
        {
          this.field_contecttype = paramCursor.getString(i);
        }
        else if (frY == k)
        {
          this.field_googlenamepy = paramCursor.getString(i);
        }
        else if (eZC == k)
        {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4129879490560L, 30770);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4130013708288L, 30771);
    ContentValues localContentValues = new ContentValues();
    if (this.frz) {
      localContentValues.put("googleid", this.field_googleid);
    }
    if (this.frA) {
      localContentValues.put("googlename", this.field_googlename);
    }
    if (this.frB) {
      localContentValues.put("googlephotourl", this.field_googlephotourl);
    }
    if (this.frC) {
      localContentValues.put("googlegmail", this.field_googlegmail);
    }
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.fgz) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if (this.frD) {
      localContentValues.put("nicknameqp", this.field_nicknameqp);
    }
    if (this.frE) {
      localContentValues.put("usernamepy", this.field_usernamepy);
    }
    if (this.frF) {
      localContentValues.put("small_url", this.field_small_url);
    }
    if (this.frG) {
      localContentValues.put("big_url", this.field_big_url);
    }
    if (this.frH) {
      localContentValues.put("ret", Integer.valueOf(this.field_ret));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.frI) {
      localContentValues.put("googleitemid", this.field_googleitemid);
    }
    if (this.frJ) {
      localContentValues.put("googlecgistatus", Integer.valueOf(this.field_googlecgistatus));
    }
    if (this.frK) {
      localContentValues.put("contecttype", this.field_contecttype);
    }
    if (this.frL) {
      localContentValues.put("googlenamepy", this.field_googlenamepy);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4130013708288L, 30771);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */