package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class aj
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faO;
  private static final int fcc;
  private static final int feR;
  private static final int feV;
  private static final int feW;
  private static final int feX;
  private static final int feY;
  private static final int fer;
  private static final int ffa;
  private static final int ffb;
  private static final int ffc;
  private static final int fkf;
  private static final int fkg;
  private static final int fkh;
  private static final int fki;
  private static final int fkj;
  private static final int fkk;
  private static final int fkl;
  private static final int fkm;
  private static final int fkn;
  private static final int fko;
  private static final int fkp;
  private static final int fkq;
  private static final int fkr;
  private boolean eZF;
  private boolean fas;
  private boolean fcb;
  private boolean feD;
  private boolean feH;
  private boolean feI;
  private boolean feJ;
  private boolean feK;
  private boolean feM;
  private boolean feN;
  private boolean feO;
  private boolean fep;
  public int field_UnDeliverCount;
  public int field_UnReadInvite;
  public int field_atCount;
  public int field_attrflag;
  public int field_chatmode;
  public String field_content;
  public long field_conversationTime;
  private String field_customNotify;
  public String field_digest;
  public String field_digestUser;
  public String field_editingMsg;
  public long field_firstUnDeliverSeq;
  public long field_flag;
  private int field_hasTrunc;
  public int field_isSend;
  public long field_lastSeq;
  public int field_msgCount;
  public String field_msgType;
  public String field_parentRef;
  public int field_showTips;
  public long field_sightTime;
  public int field_status;
  public int field_unReadCount;
  public int field_unReadMuteCount;
  public String field_username;
  private boolean fjS;
  private boolean fjT;
  private boolean fjU;
  public boolean fjV;
  private boolean fjW;
  private boolean fjX;
  private boolean fjY;
  public boolean fjZ;
  private boolean fka;
  private boolean fkb;
  private boolean fkc;
  private boolean fkd;
  private boolean fke;
  
  static
  {
    GMTrace.i(13361240604672L, 99549);
    eZt = new String[0];
    ffc = "msgCount".hashCode();
    fcc = "username".hashCode();
    feR = "unReadCount".hashCode();
    fkf = "chatmode".hashCode();
    eZI = "status".hashCode();
    ffa = "isSend".hashCode();
    fkg = "conversationTime".hashCode();
    faO = "content".hashCode();
    ffb = "msgType".hashCode();
    fkh = "customNotify".hashCode();
    fki = "showTips".hashCode();
    fer = "flag".hashCode();
    feV = "digest".hashCode();
    feW = "digestUser".hashCode();
    fkj = "hasTrunc".hashCode();
    fkk = "parentRef".hashCode();
    fkl = "attrflag".hashCode();
    feY = "editingMsg".hashCode();
    feX = "atCount".hashCode();
    fkm = "sightTime".hashCode();
    fkn = "unReadMuteCount".hashCode();
    fko = "lastSeq".hashCode();
    fkp = "UnDeliverCount".hashCode();
    fkq = "UnReadInvite".hashCode();
    fkr = "firstUnDeliverSeq".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(13361240604672L, 99549);
  }
  
  public aj()
  {
    GMTrace.i(13357482508288L, 99521);
    this.feO = false;
    this.fcb = false;
    this.feD = false;
    this.fjS = false;
    this.eZF = false;
    this.feM = false;
    this.fjT = false;
    this.fas = false;
    this.feN = false;
    this.fjU = false;
    this.fjV = false;
    this.fep = false;
    this.feH = false;
    this.feI = false;
    this.fjW = false;
    this.fjX = false;
    this.fjY = false;
    this.feK = false;
    this.feJ = false;
    this.fjZ = false;
    this.fka = false;
    this.fkb = false;
    this.fkc = false;
    this.fkd = false;
    this.fke = false;
    GMTrace.o(13357482508288L, 99521);
  }
  
  public final void A(long paramLong)
  {
    GMTrace.i(13360837951488L, 99546);
    this.field_firstUnDeliverSeq = paramLong;
    this.fke = true;
    GMTrace.o(13360837951488L, 99546);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(13360972169216L, 99547);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(13360972169216L, 99547);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ffc == k) {
        this.field_msgCount = paramCursor.getInt(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fcc == k)
        {
          this.field_username = paramCursor.getString(i);
          this.fcb = true;
        }
        else if (feR == k)
        {
          this.field_unReadCount = paramCursor.getInt(i);
        }
        else if (fkf == k)
        {
          this.field_chatmode = paramCursor.getInt(i);
        }
        else if (eZI == k)
        {
          this.field_status = paramCursor.getInt(i);
        }
        else if (ffa == k)
        {
          this.field_isSend = paramCursor.getInt(i);
        }
        else if (fkg == k)
        {
          this.field_conversationTime = paramCursor.getLong(i);
        }
        else if (faO == k)
        {
          this.field_content = paramCursor.getString(i);
        }
        else if (ffb == k)
        {
          this.field_msgType = paramCursor.getString(i);
        }
        else if (fkh == k)
        {
          this.field_customNotify = paramCursor.getString(i);
        }
        else if (fki == k)
        {
          this.field_showTips = paramCursor.getInt(i);
        }
        else if (fer == k)
        {
          this.field_flag = paramCursor.getLong(i);
        }
        else if (feV == k)
        {
          this.field_digest = paramCursor.getString(i);
        }
        else if (feW == k)
        {
          this.field_digestUser = paramCursor.getString(i);
        }
        else if (fkj == k)
        {
          this.field_hasTrunc = paramCursor.getInt(i);
        }
        else if (fkk == k)
        {
          this.field_parentRef = paramCursor.getString(i);
        }
        else if (fkl == k)
        {
          this.field_attrflag = paramCursor.getInt(i);
        }
        else if (feY == k)
        {
          this.field_editingMsg = paramCursor.getString(i);
        }
        else if (feX == k)
        {
          this.field_atCount = paramCursor.getInt(i);
        }
        else if (fkm == k)
        {
          this.field_sightTime = paramCursor.getLong(i);
        }
        else if (fkn == k)
        {
          this.field_unReadMuteCount = paramCursor.getInt(i);
        }
        else if (fko == k)
        {
          this.field_lastSeq = paramCursor.getLong(i);
        }
        else if (fkp == k)
        {
          this.field_UnDeliverCount = paramCursor.getInt(i);
        }
        else if (fkq == k)
        {
          this.field_UnReadInvite = paramCursor.getInt(i);
        }
        else if (fkr == k)
        {
          this.field_firstUnDeliverSeq = paramCursor.getLong(i);
        }
        else if (eZC == k)
        {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(13360972169216L, 99547);
  }
  
  public final void cN(String paramString)
  {
    GMTrace.i(13358958903296L, 99532);
    this.field_msgType = paramString;
    this.feN = true;
    GMTrace.o(13358958903296L, 99532);
  }
  
  public final void cO(String paramString)
  {
    GMTrace.i(13359227338752L, 99534);
    this.field_digest = paramString;
    this.feH = true;
    GMTrace.o(13359227338752L, 99534);
  }
  
  public final void cP(String paramString)
  {
    GMTrace.i(13359361556480L, 99535);
    this.field_digestUser = paramString;
    this.feI = true;
    GMTrace.o(13359361556480L, 99535);
  }
  
  public final void cQ(String paramString)
  {
    GMTrace.i(13359629991936L, 99537);
    this.field_parentRef = paramString;
    this.fjX = true;
    GMTrace.o(13359629991936L, 99537);
  }
  
  public final void cR(String paramString)
  {
    GMTrace.i(13359898427392L, 99539);
    this.field_editingMsg = paramString;
    this.feK = true;
    GMTrace.o(13359898427392L, 99539);
  }
  
  public final void dA(int paramInt)
  {
    GMTrace.i(13358287814656L, 99527);
    this.field_chatmode = paramInt;
    this.fjS = true;
    GMTrace.o(13358287814656L, 99527);
  }
  
  public final void dB(int paramInt)
  {
    GMTrace.i(13358422032384L, 99528);
    this.field_status = paramInt;
    this.eZF = true;
    GMTrace.o(13358422032384L, 99528);
  }
  
  public final void dC(int paramInt)
  {
    GMTrace.i(13358556250112L, 99529);
    this.field_isSend = paramInt;
    this.feM = true;
    GMTrace.o(13358556250112L, 99529);
  }
  
  public final void dD(int paramInt)
  {
    GMTrace.i(13359495774208L, 99536);
    this.field_hasTrunc = paramInt;
    this.fjW = true;
    GMTrace.o(13359495774208L, 99536);
  }
  
  public final void dE(int paramInt)
  {
    GMTrace.i(13359764209664L, 99538);
    this.field_attrflag = paramInt;
    this.fjY = true;
    GMTrace.o(13359764209664L, 99538);
  }
  
  public final void dF(int paramInt)
  {
    GMTrace.i(13360032645120L, 99540);
    this.field_atCount = paramInt;
    this.feJ = true;
    GMTrace.o(13360032645120L, 99540);
  }
  
  public final void dG(int paramInt)
  {
    GMTrace.i(13360166862848L, 99541);
    this.field_unReadMuteCount = paramInt;
    this.fka = true;
    GMTrace.o(13360166862848L, 99541);
  }
  
  public final void dH(int paramInt)
  {
    GMTrace.i(13360569516032L, 99544);
    this.field_UnDeliverCount = paramInt;
    this.fkc = true;
    GMTrace.o(13360569516032L, 99544);
  }
  
  public final void dI(int paramInt)
  {
    GMTrace.i(13360703733760L, 99545);
    this.field_UnReadInvite = paramInt;
    this.fkd = true;
    GMTrace.o(13360703733760L, 99545);
  }
  
  public final void dy(int paramInt)
  {
    GMTrace.i(13357616726016L, 99522);
    this.field_msgCount = paramInt;
    this.feO = true;
    GMTrace.o(13357616726016L, 99522);
  }
  
  public final void dz(int paramInt)
  {
    GMTrace.i(13358019379200L, 99525);
    this.field_unReadCount = paramInt;
    this.feD = true;
    GMTrace.o(13358019379200L, 99525);
  }
  
  public final String getUsername()
  {
    GMTrace.i(16290274082816L, 121372);
    String str = this.field_username;
    GMTrace.o(16290274082816L, 121372);
    return str;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(13361106386944L, 99548);
    ContentValues localContentValues = new ContentValues();
    if (this.feO) {
      localContentValues.put("msgCount", Integer.valueOf(this.field_msgCount));
    }
    if (this.field_username == null) {
      this.field_username = "";
    }
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.feD) {
      localContentValues.put("unReadCount", Integer.valueOf(this.field_unReadCount));
    }
    if (this.fjS) {
      localContentValues.put("chatmode", Integer.valueOf(this.field_chatmode));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.feM) {
      localContentValues.put("isSend", Integer.valueOf(this.field_isSend));
    }
    if (this.fjT) {
      localContentValues.put("conversationTime", Long.valueOf(this.field_conversationTime));
    }
    if (this.field_content == null) {
      this.field_content = "";
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.field_msgType == null) {
      this.field_msgType = "";
    }
    if (this.feN) {
      localContentValues.put("msgType", this.field_msgType);
    }
    if (this.field_customNotify == null) {
      this.field_customNotify = "";
    }
    if (this.fjU) {
      localContentValues.put("customNotify", this.field_customNotify);
    }
    if (this.fjV) {
      localContentValues.put("showTips", Integer.valueOf(this.field_showTips));
    }
    if (this.fep) {
      localContentValues.put("flag", Long.valueOf(this.field_flag));
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
    if (this.fjW) {
      localContentValues.put("hasTrunc", Integer.valueOf(this.field_hasTrunc));
    }
    if (this.fjX) {
      localContentValues.put("parentRef", this.field_parentRef);
    }
    if (this.fjY) {
      localContentValues.put("attrflag", Integer.valueOf(this.field_attrflag));
    }
    if (this.field_editingMsg == null) {
      this.field_editingMsg = "";
    }
    if (this.feK) {
      localContentValues.put("editingMsg", this.field_editingMsg);
    }
    if (this.feJ) {
      localContentValues.put("atCount", Integer.valueOf(this.field_atCount));
    }
    if (this.fjZ) {
      localContentValues.put("sightTime", Long.valueOf(this.field_sightTime));
    }
    if (this.fka) {
      localContentValues.put("unReadMuteCount", Integer.valueOf(this.field_unReadMuteCount));
    }
    if (this.fkb) {
      localContentValues.put("lastSeq", Long.valueOf(this.field_lastSeq));
    }
    if (this.fkc) {
      localContentValues.put("UnDeliverCount", Integer.valueOf(this.field_UnDeliverCount));
    }
    if (this.fkd) {
      localContentValues.put("UnReadInvite", Integer.valueOf(this.field_UnReadInvite));
    }
    if (this.fke) {
      localContentValues.put("firstUnDeliverSeq", Long.valueOf(this.field_firstUnDeliverSeq));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(13361106386944L, 99548);
    return localContentValues;
  }
  
  public final long qU()
  {
    GMTrace.i(16290408300544L, 121373);
    long l = this.field_lastSeq;
    GMTrace.o(16290408300544L, 121373);
    return l;
  }
  
  public final int qV()
  {
    GMTrace.i(16290542518272L, 121374);
    int i = this.field_UnDeliverCount;
    GMTrace.o(16290542518272L, 121374);
    return i;
  }
  
  public final long qW()
  {
    GMTrace.i(16290676736000L, 121375);
    long l = this.field_firstUnDeliverSeq;
    GMTrace.o(16290676736000L, 121375);
    return l;
  }
  
  public final void setContent(String paramString)
  {
    GMTrace.i(13358824685568L, 99531);
    this.field_content = paramString;
    this.fas = true;
    GMTrace.o(13358824685568L, 99531);
  }
  
  public final void setUsername(String paramString)
  {
    GMTrace.i(13357750943744L, 99523);
    this.field_username = paramString;
    this.fcb = true;
    GMTrace.o(13357750943744L, 99523);
  }
  
  public final void x(long paramLong)
  {
    GMTrace.i(13358690467840L, 99530);
    this.field_conversationTime = paramLong;
    this.fjT = true;
    GMTrace.o(13358690467840L, 99530);
  }
  
  public final void y(long paramLong)
  {
    GMTrace.i(13359093121024L, 99533);
    this.field_flag = paramLong;
    this.fep = true;
    GMTrace.o(13359093121024L, 99533);
  }
  
  public final void z(long paramLong)
  {
    GMTrace.i(13360435298304L, 99543);
    this.field_lastSeq = paramLong;
    this.fkb = true;
    GMTrace.o(13360435298304L, 99543);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */