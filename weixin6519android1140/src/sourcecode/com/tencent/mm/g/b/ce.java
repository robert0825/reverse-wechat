package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.t;
import com.tencent.mm.sdk.platformtools.w;

public abstract class ce
  extends c
{
  private static final int eZB;
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faG;
  private static final int faJ;
  private static final int faO;
  private static final int feP;
  private static final int fer;
  private static final int ffa;
  private static final int fnq;
  private static final int fry;
  private static final int fsA;
  private static final int fwk;
  private static final int fwl;
  private static final int fwm;
  private static final int fwn;
  private static final int fwo;
  private static final int fwp;
  private static final int fwq;
  private static final int fwr;
  private static final int fws;
  private String eTv;
  private boolean eZF;
  private boolean eZx;
  private boolean fak;
  private boolean fan;
  private boolean fas;
  private boolean feB;
  private boolean feM;
  private boolean fep;
  public long field_bizChatId;
  public String field_bizChatUserId;
  private String field_bizClientMsgId;
  public String field_content;
  public long field_createTime;
  public int field_flag;
  public String field_imgPath;
  public int field_isSend;
  public int field_isShowTimer;
  public byte[] field_lvbuffer;
  public long field_msgId;
  public long field_msgSeq;
  public long field_msgSvrId;
  public String field_reserved;
  public int field_status;
  public String field_talker;
  public int field_talkerId;
  public String field_transBrandWording;
  public String field_transContent;
  public int field_type;
  private boolean fna;
  private boolean frs;
  public boolean fso;
  public int fwA;
  public int fwB;
  public String fwC;
  public String fwD;
  public String fwE;
  public int fwF;
  private boolean fwb;
  public boolean fwc;
  private boolean fwd;
  private boolean fwe;
  public boolean fwf;
  private boolean fwg;
  private boolean fwh;
  private boolean fwi;
  public boolean fwj;
  public String fwt;
  public int fwu;
  public String fwv;
  public int fww;
  public int fwx;
  public int fwy;
  public int fwz;
  
  static
  {
    GMTrace.i(13348892573696L, 99457);
    eZt = new String[0];
    eZB = "msgId".hashCode();
    fwk = "msgSvrId".hashCode();
    faJ = "type".hashCode();
    eZI = "status".hashCode();
    ffa = "isSend".hashCode();
    fwl = "isShowTimer".hashCode();
    faG = "createTime".hashCode();
    fnq = "talker".hashCode();
    faO = "content".hashCode();
    fwm = "imgPath".hashCode();
    fwn = "reserved".hashCode();
    fsA = "lvbuffer".hashCode();
    fwo = "talkerId".hashCode();
    fwp = "transContent".hashCode();
    fwq = "transBrandWording".hashCode();
    fwr = "bizClientMsgId".hashCode();
    feP = "bizChatId".hashCode();
    fws = "bizChatUserId".hashCode();
    fry = "msgSeq".hashCode();
    fer = "flag".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(13348892573696L, 99457);
  }
  
  public ce()
  {
    GMTrace.i(13344060735488L, 99421);
    this.eZx = false;
    this.fwb = false;
    this.fan = false;
    this.eZF = false;
    this.feM = false;
    this.fwc = false;
    this.fak = false;
    this.fna = false;
    this.fas = false;
    this.fwd = false;
    this.fwe = false;
    this.fso = false;
    this.fwf = false;
    this.fwg = false;
    this.fwh = false;
    this.fwi = false;
    this.feB = false;
    this.fwj = false;
    this.frs = false;
    this.fep = false;
    GMTrace.o(13344060735488L, 99421);
  }
  
  public final void C(long paramLong)
  {
    GMTrace.i(13344194953216L, 99422);
    this.field_msgId = paramLong;
    this.eZx = true;
    GMTrace.o(13344194953216L, 99422);
  }
  
  public final void D(long paramLong)
  {
    GMTrace.i(13344463388672L, 99424);
    this.field_msgSvrId = paramLong;
    this.fwb = true;
    GMTrace.o(13344463388672L, 99424);
  }
  
  public final void E(long paramLong)
  {
    GMTrace.i(13345402912768L, 99431);
    this.field_createTime = paramLong;
    this.fak = true;
    GMTrace.o(13345402912768L, 99431);
  }
  
  public final void F(long paramLong)
  {
    GMTrace.i(13347013525504L, 99443);
    this.field_bizChatId = paramLong;
    this.feB = true;
    GMTrace.o(13347013525504L, 99443);
  }
  
  public final void G(long paramLong)
  {
    GMTrace.i(13347147743232L, 99444);
    this.field_msgSeq = paramLong;
    this.frs = true;
    GMTrace.o(13347147743232L, 99444);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(13347416178688L, 99446);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(13347416178688L, 99446);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (eZB == k)
      {
        this.field_msgId = paramCursor.getLong(i);
        this.eZx = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fwk == k) {
          this.field_msgSvrId = paramCursor.getLong(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (ffa == k) {
          this.field_isSend = paramCursor.getInt(i);
        } else if (fwl == k) {
          this.field_isShowTimer = paramCursor.getInt(i);
        } else if (faG == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (fnq == k) {
          this.field_talker = paramCursor.getString(i);
        } else if (faO == k) {
          this.field_content = paramCursor.getString(i);
        } else if (fwm == k) {
          this.field_imgPath = paramCursor.getString(i);
        } else if (fwn == k) {
          this.field_reserved = paramCursor.getString(i);
        } else if (fsA == k) {
          this.field_lvbuffer = paramCursor.getBlob(i);
        } else if (fwo == k) {
          this.field_talkerId = paramCursor.getInt(i);
        } else if (fwp == k) {
          this.field_transContent = paramCursor.getString(i);
        } else if (fwq == k) {
          this.field_transBrandWording = paramCursor.getString(i);
        } else if (fwr == k) {
          this.field_bizClientMsgId = paramCursor.getString(i);
        } else if (feP == k) {
          this.field_bizChatId = paramCursor.getLong(i);
        } else if (fws == k) {
          this.field_bizChatUserId = paramCursor.getString(i);
        } else if (fry == k) {
          this.field_msgSeq = paramCursor.getLong(i);
        } else if (fer == k) {
          this.field_flag = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    try
    {
      if (this.field_lvbuffer != null)
      {
        i = this.field_lvbuffer.length;
        if (i != 0) {}
      }
      else
      {
        GMTrace.o(13347416178688L, 99446);
        return;
      }
      paramCursor = new t();
      i = paramCursor.bl(this.field_lvbuffer);
      if (i != 0)
      {
        w.e("MicroMsg.SDK.BaseMsgInfo", "parse LVBuffer error:" + i);
        GMTrace.o(13347416178688L, 99446);
        return;
      }
      if (!paramCursor.bPB()) {
        this.fwt = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fwu = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fwv = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fww = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fwx = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fwy = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fwz = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fwA = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fwB = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fwC = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fwD = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fwE = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fwF = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.eTv = paramCursor.getString();
      }
      GMTrace.o(13347416178688L, 99446);
      return;
    }
    catch (Exception paramCursor)
    {
      w.e("MicroMsg.SDK.BaseMsgInfo", "get value failed");
      GMTrace.o(13347416178688L, 99446);
    }
  }
  
  public void dB(int paramInt)
  {
    GMTrace.i(13345000259584L, 99428);
    this.field_status = paramInt;
    this.eZF = true;
    GMTrace.o(13345000259584L, 99428);
  }
  
  public final void dC(int paramInt)
  {
    GMTrace.i(13345134477312L, 99429);
    this.field_isSend = paramInt;
    this.feM = true;
    GMTrace.o(13345134477312L, 99429);
  }
  
  public final void dL(int paramInt)
  {
    GMTrace.i(13347281960960L, 99445);
    this.field_flag = paramInt;
    this.fep = true;
    GMTrace.o(13347281960960L, 99445);
  }
  
  public final void dM(int paramInt)
  {
    GMTrace.i(13347818831872L, 99449);
    this.fwu = paramInt;
    this.fso = true;
    GMTrace.o(13347818831872L, 99449);
  }
  
  public final void dN(int paramInt)
  {
    GMTrace.i(13348087267328L, 99451);
    this.fww = paramInt;
    this.fso = true;
    GMTrace.o(13348087267328L, 99451);
  }
  
  public final void dO(int paramInt)
  {
    GMTrace.i(13348221485056L, 99452);
    this.fwx = paramInt;
    this.fso = true;
    GMTrace.o(13348221485056L, 99452);
  }
  
  public final void dP(int paramInt)
  {
    GMTrace.i(13348355702784L, 99453);
    this.fwB = paramInt;
    this.fso = true;
    GMTrace.o(13348355702784L, 99453);
  }
  
  public final void dQ(int paramInt)
  {
    GMTrace.i(13348758355968L, 99456);
    this.fwF = paramInt;
    this.fso = true;
    GMTrace.o(13348758355968L, 99456);
  }
  
  public final void db(String paramString)
  {
    GMTrace.i(13345671348224L, 99433);
    this.field_talker = paramString;
    this.fna = true;
    GMTrace.o(13345671348224L, 99433);
  }
  
  public final void dc(String paramString)
  {
    GMTrace.i(13346208219136L, 99437);
    this.field_imgPath = paramString;
    this.fwd = true;
    GMTrace.o(13346208219136L, 99437);
  }
  
  public final void dd(String paramString)
  {
    GMTrace.i(13346476654592L, 99439);
    this.field_reserved = paramString;
    this.fwe = true;
    GMTrace.o(13346476654592L, 99439);
  }
  
  public final void de(String paramString)
  {
    GMTrace.i(13346745090048L, 99441);
    this.field_transContent = paramString;
    this.fwg = true;
    GMTrace.o(13346745090048L, 99441);
  }
  
  public final void df(String paramString)
  {
    GMTrace.i(13346879307776L, 99442);
    this.field_bizClientMsgId = paramString;
    this.fwi = true;
    GMTrace.o(13346879307776L, 99442);
  }
  
  public final void dg(String paramString)
  {
    GMTrace.i(13347684614144L, 99448);
    this.fwt = paramString;
    this.fso = true;
    GMTrace.o(13347684614144L, 99448);
  }
  
  public final void dh(String paramString)
  {
    GMTrace.i(13347953049600L, 99450);
    this.fwv = paramString;
    this.fso = true;
    GMTrace.o(13347953049600L, 99450);
  }
  
  public final void di(String paramString)
  {
    GMTrace.i(13348489920512L, 99454);
    this.fwD = paramString;
    this.fso = true;
    GMTrace.o(13348489920512L, 99454);
  }
  
  public final void dj(String paramString)
  {
    GMTrace.i(13348624138240L, 99455);
    this.fwE = paramString;
    this.fso = true;
    GMTrace.o(13348624138240L, 99455);
  }
  
  public final int getType()
  {
    GMTrace.i(13344866041856L, 99427);
    int i = this.field_type;
    GMTrace.o(13344866041856L, 99427);
    return i;
  }
  
  public ContentValues qL()
  {
    GMTrace.i(13347550396416L, 99447);
    try
    {
      if (this.fso)
      {
        localObject = new t();
        ((t)localObject).bPC();
        ((t)localObject).RL(this.fwt);
        ((t)localObject).Ak(this.fwu);
        ((t)localObject).RL(this.fwv);
        ((t)localObject).Ak(this.fww);
        ((t)localObject).Ak(this.fwx);
        ((t)localObject).Ak(this.fwy);
        ((t)localObject).Ak(this.fwz);
        ((t)localObject).Ak(this.fwA);
        ((t)localObject).Ak(this.fwB);
        ((t)localObject).RL(this.fwC);
        ((t)localObject).RL(this.fwD);
        ((t)localObject).RL(this.fwE);
        ((t)localObject).Ak(this.fwF);
        ((t)localObject).RL(this.eTv);
        this.field_lvbuffer = ((t)localObject).bPD();
      }
      Object localObject = new ContentValues();
      if (this.eZx) {
        ((ContentValues)localObject).put("msgId", Long.valueOf(this.field_msgId));
      }
      if (this.fwb) {
        ((ContentValues)localObject).put("msgSvrId", Long.valueOf(this.field_msgSvrId));
      }
      if (this.fan) {
        ((ContentValues)localObject).put("type", Integer.valueOf(this.field_type));
      }
      if (this.eZF) {
        ((ContentValues)localObject).put("status", Integer.valueOf(this.field_status));
      }
      if (this.feM) {
        ((ContentValues)localObject).put("isSend", Integer.valueOf(this.field_isSend));
      }
      if (this.fwc) {
        ((ContentValues)localObject).put("isShowTimer", Integer.valueOf(this.field_isShowTimer));
      }
      if (this.fak) {
        ((ContentValues)localObject).put("createTime", Long.valueOf(this.field_createTime));
      }
      if (this.fna) {
        ((ContentValues)localObject).put("talker", this.field_talker);
      }
      if (this.field_content == null) {
        this.field_content = "";
      }
      if (this.fas) {
        ((ContentValues)localObject).put("content", this.field_content);
      }
      if (this.fwd) {
        ((ContentValues)localObject).put("imgPath", this.field_imgPath);
      }
      if (this.fwe) {
        ((ContentValues)localObject).put("reserved", this.field_reserved);
      }
      if (this.fso) {
        ((ContentValues)localObject).put("lvbuffer", this.field_lvbuffer);
      }
      if (this.fwf) {
        ((ContentValues)localObject).put("talkerId", Integer.valueOf(this.field_talkerId));
      }
      if (this.field_transContent == null) {
        this.field_transContent = "";
      }
      if (this.fwg) {
        ((ContentValues)localObject).put("transContent", this.field_transContent);
      }
      if (this.field_transBrandWording == null) {
        this.field_transBrandWording = "";
      }
      if (this.fwh) {
        ((ContentValues)localObject).put("transBrandWording", this.field_transBrandWording);
      }
      if (this.field_bizClientMsgId == null) {
        this.field_bizClientMsgId = "";
      }
      if (this.fwi) {
        ((ContentValues)localObject).put("bizClientMsgId", this.field_bizClientMsgId);
      }
      if (this.feB) {
        ((ContentValues)localObject).put("bizChatId", Long.valueOf(this.field_bizChatId));
      }
      if (this.field_bizChatUserId == null) {
        this.field_bizChatUserId = "";
      }
      if (this.fwj) {
        ((ContentValues)localObject).put("bizChatUserId", this.field_bizChatUserId);
      }
      if (this.frs) {
        ((ContentValues)localObject).put("msgSeq", Long.valueOf(this.field_msgSeq));
      }
      if (this.fep) {
        ((ContentValues)localObject).put("flag", Integer.valueOf(this.field_flag));
      }
      if (this.vmr > 0L) {
        ((ContentValues)localObject).put("rowid", Long.valueOf(this.vmr));
      }
      GMTrace.o(13347550396416L, 99447);
      return (ContentValues)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SDK.BaseMsgInfo", "get value failed, %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public final long qX()
  {
    GMTrace.i(13344329170944L, 99423);
    long l = this.field_msgId;
    GMTrace.o(13344329170944L, 99423);
    return l;
  }
  
  public final long qY()
  {
    GMTrace.i(13344597606400L, 99425);
    long l = this.field_msgSvrId;
    GMTrace.o(13344597606400L, 99425);
    return l;
  }
  
  public final int qZ()
  {
    GMTrace.i(13345268695040L, 99430);
    int i = this.field_isSend;
    GMTrace.o(13345268695040L, 99430);
    return i;
  }
  
  public final long ra()
  {
    GMTrace.i(13345537130496L, 99432);
    long l = this.field_createTime;
    GMTrace.o(13345537130496L, 99432);
    return l;
  }
  
  public final String rb()
  {
    GMTrace.i(13345805565952L, 99434);
    String str = this.field_talker;
    GMTrace.o(13345805565952L, 99434);
    return str;
  }
  
  public final String rc()
  {
    GMTrace.i(13346074001408L, 99436);
    String str = this.field_content;
    GMTrace.o(13346074001408L, 99436);
    return str;
  }
  
  public final String rd()
  {
    GMTrace.i(13346342436864L, 99438);
    String str = this.field_imgPath;
    GMTrace.o(13346342436864L, 99438);
    return str;
  }
  
  public final void setContent(String paramString)
  {
    GMTrace.i(13345939783680L, 99435);
    this.field_content = paramString;
    this.fas = true;
    GMTrace.o(13345939783680L, 99435);
  }
  
  public final void setType(int paramInt)
  {
    GMTrace.i(13344731824128L, 99426);
    this.field_type = paramInt;
    this.fan = true;
    GMTrace.o(13344731824128L, 99426);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */