package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.t;
import com.tencent.mm.sdk.platformtools.w;

public abstract class af
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faJ;
  private static final int fcc;
  private static final int fdD;
  private static final int fgD;
  private static final int fiK;
  private static final int fiL;
  private static final int fiM;
  private static final int fiN;
  private static final int fiO;
  private static final int fiP;
  private static final int fiQ;
  private static final int fiR;
  private static final int fiS;
  private static final int fiT;
  private static final int fiU;
  private static final int fiV;
  private static final int fiW;
  private static final int fiX;
  private static final int fiY;
  private int cfz;
  public String eMW;
  private boolean fan;
  private boolean fcb;
  private boolean fdh;
  private boolean fgz;
  private boolean fiA;
  private boolean fiB;
  private boolean fiC;
  private boolean fiD;
  private boolean fiE;
  private boolean fiF;
  private boolean fiG;
  private boolean fiH;
  private boolean fiI;
  private boolean fiJ;
  public int fiZ;
  private String field_alias;
  public int field_chatroomFlag;
  public String field_conRemark;
  public String field_conRemarkPYFull;
  public String field_conRemarkPYShort;
  public String field_contactLabelIds;
  public int field_deleteFlag;
  public String field_domainList;
  public String field_encryptUsername;
  public byte[] field_lvbuff;
  public String field_nickname;
  private String field_pyInitial;
  private String field_quanPin;
  public int field_showHead;
  public int field_type;
  public String field_username;
  public int field_verifyFlag;
  public int field_weiboFlag;
  public String field_weiboNickname;
  private boolean fiv;
  private boolean fiw;
  private boolean fix;
  private boolean fiy;
  private boolean fiz;
  public String fjA;
  private int fjB;
  public int fja;
  public String fjb;
  public long fjc;
  public String fjd;
  public int fje;
  public int fjf;
  public String fjg;
  public String fjh;
  public int fji;
  public int fjj;
  private String fjk;
  private String fjl;
  public String fjm;
  public int fjn;
  public String fjo;
  public String fjp;
  public String fjq;
  public int fjr;
  public int fjs;
  public String fjt;
  public String fju;
  public String fjv;
  public String fjw;
  public String fjx;
  public String fjy;
  public String fjz;
  public String signature;
  public int uin;
  
  static
  {
    GMTrace.i(13357348290560L, 99520);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS deleteflag_index ON Contact(deleteFlag)" };
    fcc = "username".hashCode();
    fiK = "alias".hashCode();
    fiL = "conRemark".hashCode();
    fiM = "domainList".hashCode();
    fgD = "nickname".hashCode();
    fiN = "pyInitial".hashCode();
    fiO = "quanPin".hashCode();
    fiP = "showHead".hashCode();
    faJ = "type".hashCode();
    fiQ = "weiboFlag".hashCode();
    fiR = "weiboNickname".hashCode();
    fiS = "conRemarkPYFull".hashCode();
    fiT = "conRemarkPYShort".hashCode();
    fdD = "lvbuff".hashCode();
    fiU = "verifyFlag".hashCode();
    fiV = "encryptUsername".hashCode();
    fiW = "chatroomFlag".hashCode();
    fiX = "deleteFlag".hashCode();
    fiY = "contactLabelIds".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(13357348290560L, 99520);
  }
  
  public af()
  {
    GMTrace.i(13349026791424L, 99458);
    this.fcb = false;
    this.fiv = false;
    this.fiw = false;
    this.fix = false;
    this.fgz = false;
    this.fiy = false;
    this.fiz = false;
    this.fiA = false;
    this.fan = false;
    this.fiB = false;
    this.fiC = false;
    this.fiD = false;
    this.fiE = false;
    this.fdh = false;
    this.fiF = false;
    this.fiG = false;
    this.fiH = false;
    this.fiI = false;
    this.fiJ = false;
    GMTrace.o(13349026791424L, 99458);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(13352248016896L, 99482);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(13352248016896L, 99482);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fcc == k)
      {
        this.field_username = paramCursor.getString(i);
        this.fcb = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fiK == k) {
          this.field_alias = paramCursor.getString(i);
        } else if (fiL == k) {
          this.field_conRemark = paramCursor.getString(i);
        } else if (fiM == k) {
          this.field_domainList = paramCursor.getString(i);
        } else if (fgD == k) {
          this.field_nickname = paramCursor.getString(i);
        } else if (fiN == k) {
          this.field_pyInitial = paramCursor.getString(i);
        } else if (fiO == k) {
          this.field_quanPin = paramCursor.getString(i);
        } else if (fiP == k) {
          this.field_showHead = paramCursor.getInt(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (fiQ == k) {
          this.field_weiboFlag = paramCursor.getInt(i);
        } else if (fiR == k) {
          this.field_weiboNickname = paramCursor.getString(i);
        } else if (fiS == k) {
          this.field_conRemarkPYFull = paramCursor.getString(i);
        } else if (fiT == k) {
          this.field_conRemarkPYShort = paramCursor.getString(i);
        } else if (fdD == k) {
          this.field_lvbuff = paramCursor.getBlob(i);
        } else if (fiU == k) {
          this.field_verifyFlag = paramCursor.getInt(i);
        } else if (fiV == k) {
          this.field_encryptUsername = paramCursor.getString(i);
        } else if (fiW == k) {
          this.field_chatroomFlag = paramCursor.getInt(i);
        } else if (fiX == k) {
          this.field_deleteFlag = paramCursor.getInt(i);
        } else if (fiY == k) {
          this.field_contactLabelIds = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    qT();
    GMTrace.o(13352248016896L, 99482);
  }
  
  public void cA(String paramString)
  {
    GMTrace.i(13354798153728L, 99501);
    this.fjl = paramString;
    this.fdh = true;
    GMTrace.o(13354798153728L, 99501);
  }
  
  public void cB(String paramString)
  {
    GMTrace.i(13354932371456L, 99502);
    this.fjm = paramString;
    this.fdh = true;
    GMTrace.o(13354932371456L, 99502);
  }
  
  public void cC(String paramString)
  {
    GMTrace.i(13355469242368L, 99506);
    this.fjo = paramString;
    this.fdh = true;
    GMTrace.o(13355469242368L, 99506);
  }
  
  public void cD(String paramString)
  {
    GMTrace.i(13355603460096L, 99507);
    this.fjp = paramString;
    this.fdh = true;
    GMTrace.o(13355603460096L, 99507);
  }
  
  public void cE(String paramString)
  {
    GMTrace.i(13355737677824L, 99508);
    this.fjq = paramString;
    this.fdh = true;
    GMTrace.o(13355737677824L, 99508);
  }
  
  public void cF(String paramString)
  {
    GMTrace.i(13356140331008L, 99511);
    this.fjt = paramString;
    this.fdh = true;
    GMTrace.o(13356140331008L, 99511);
  }
  
  public void cG(String paramString)
  {
    GMTrace.i(13356274548736L, 99512);
    this.fju = paramString;
    this.fdh = true;
    GMTrace.o(13356274548736L, 99512);
  }
  
  public void cH(String paramString)
  {
    GMTrace.i(13356408766464L, 99513);
    this.fjv = paramString;
    this.fdh = true;
    GMTrace.o(13356408766464L, 99513);
  }
  
  public void cI(String paramString)
  {
    GMTrace.i(13356542984192L, 99514);
    this.fjw = paramString;
    this.fdh = true;
    GMTrace.o(13356542984192L, 99514);
  }
  
  public void cJ(String paramString)
  {
    GMTrace.i(13356677201920L, 99515);
    this.fjx = paramString;
    this.fdh = true;
    GMTrace.o(13356677201920L, 99515);
  }
  
  public void cK(String paramString)
  {
    GMTrace.i(13356811419648L, 99516);
    this.fjy = paramString;
    this.fdh = true;
    GMTrace.o(13356811419648L, 99516);
  }
  
  public void cL(String paramString)
  {
    GMTrace.i(13356945637376L, 99517);
    this.fjz = paramString;
    this.fdh = true;
    GMTrace.o(13356945637376L, 99517);
  }
  
  public void cM(String paramString)
  {
    GMTrace.i(13357079855104L, 99518);
    this.fjA = paramString;
    this.fdh = true;
    GMTrace.o(13357079855104L, 99518);
  }
  
  public void ci(String paramString)
  {
    GMTrace.i(13349429444608L, 99461);
    this.field_alias = paramString;
    this.fiv = true;
    GMTrace.o(13349429444608L, 99461);
  }
  
  public void cj(String paramString)
  {
    GMTrace.i(13349697880064L, 99463);
    this.field_conRemark = paramString;
    this.fiw = true;
    GMTrace.o(13349697880064L, 99463);
  }
  
  public void ck(String paramString)
  {
    GMTrace.i(13349832097792L, 99464);
    this.field_domainList = paramString;
    this.fix = true;
    GMTrace.o(13349832097792L, 99464);
  }
  
  public void cl(String paramString)
  {
    GMTrace.i(13349966315520L, 99465);
    this.field_nickname = paramString;
    this.fgz = true;
    GMTrace.o(13349966315520L, 99465);
  }
  
  public void cm(String paramString)
  {
    GMTrace.i(13350100533248L, 99466);
    this.field_pyInitial = paramString;
    this.fiy = true;
    GMTrace.o(13350100533248L, 99466);
  }
  
  public void cn(String paramString)
  {
    GMTrace.i(13350368968704L, 99468);
    this.field_quanPin = paramString;
    this.fiz = true;
    GMTrace.o(13350368968704L, 99468);
  }
  
  public void co(String paramString)
  {
    GMTrace.i(13351040057344L, 99473);
    this.field_weiboNickname = paramString;
    this.fiC = true;
    GMTrace.o(13351040057344L, 99473);
  }
  
  public void cp(String paramString)
  {
    GMTrace.i(13351174275072L, 99474);
    this.field_conRemarkPYFull = paramString;
    this.fiD = true;
    GMTrace.o(13351174275072L, 99474);
  }
  
  public void cq(String paramString)
  {
    GMTrace.i(13351308492800L, 99475);
    this.field_conRemarkPYShort = paramString;
    this.fiE = true;
    GMTrace.o(13351308492800L, 99475);
  }
  
  public void cr(String paramString)
  {
    GMTrace.i(13351711145984L, 99478);
    this.field_encryptUsername = paramString;
    this.fiG = true;
    GMTrace.o(13351711145984L, 99478);
  }
  
  public void cs(String paramString)
  {
    GMTrace.i(13352113799168L, 99481);
    this.field_contactLabelIds = paramString;
    this.fiJ = true;
    GMTrace.o(13352113799168L, 99481);
  }
  
  public void ct(String paramString)
  {
    GMTrace.i(13352784887808L, 99486);
    this.fjb = paramString;
    this.fdh = true;
    GMTrace.o(13352784887808L, 99486);
  }
  
  public void cu(String paramString)
  {
    GMTrace.i(13353187540992L, 99489);
    this.fjd = paramString;
    this.fdh = true;
    GMTrace.o(13353187540992L, 99489);
  }
  
  public void cv(String paramString)
  {
    GMTrace.i(13353321758720L, 99490);
    this.eMW = paramString;
    this.fdh = true;
    GMTrace.o(13353321758720L, 99490);
  }
  
  public void cw(String paramString)
  {
    GMTrace.i(13353724411904L, 99493);
    this.fjg = paramString;
    this.fdh = true;
    GMTrace.o(13353724411904L, 99493);
  }
  
  public void cx(String paramString)
  {
    GMTrace.i(13353858629632L, 99494);
    this.fjh = paramString;
    this.fdh = true;
    GMTrace.o(13353858629632L, 99494);
  }
  
  public void cy(String paramString)
  {
    GMTrace.i(13354261282816L, 99497);
    this.signature = paramString;
    this.fdh = true;
    GMTrace.o(13354261282816L, 99497);
  }
  
  public void cz(String paramString)
  {
    GMTrace.i(13354529718272L, 99499);
    this.fjk = paramString;
    this.fdh = true;
    GMTrace.o(13354529718272L, 99499);
  }
  
  public void di(int paramInt)
  {
    GMTrace.i(13350637404160L, 99470);
    this.field_showHead = paramInt;
    this.fiA = true;
    GMTrace.o(13350637404160L, 99470);
  }
  
  public void dj(int paramInt)
  {
    GMTrace.i(13350905839616L, 99472);
    this.field_weiboFlag = paramInt;
    this.fiB = true;
    GMTrace.o(13350905839616L, 99472);
  }
  
  public void dk(int paramInt)
  {
    GMTrace.i(13351576928256L, 99477);
    this.field_verifyFlag = paramInt;
    this.fiF = true;
    GMTrace.o(13351576928256L, 99477);
  }
  
  public void dl(int paramInt)
  {
    GMTrace.i(13351845363712L, 99479);
    this.field_chatroomFlag = paramInt;
    this.fiH = true;
    GMTrace.o(13351845363712L, 99479);
  }
  
  public void dm(int paramInt)
  {
    GMTrace.i(13351979581440L, 99480);
    this.field_deleteFlag = paramInt;
    this.fiI = true;
    GMTrace.o(13351979581440L, 99480);
  }
  
  public void dn(int paramInt)
  {
    GMTrace.i(13352516452352L, 99484);
    this.fiZ = paramInt;
    this.fdh = true;
    GMTrace.o(13352516452352L, 99484);
  }
  
  public void jdMethod_do(int paramInt)
  {
    GMTrace.i(13352650670080L, 99485);
    this.fja = paramInt;
    this.fdh = true;
    GMTrace.o(13352650670080L, 99485);
  }
  
  public void dp(int paramInt)
  {
    GMTrace.i(13353053323264L, 99488);
    this.uin = paramInt;
    this.fdh = true;
    GMTrace.o(13353053323264L, 99488);
  }
  
  public void dq(int paramInt)
  {
    GMTrace.i(13353455976448L, 99491);
    this.fje = paramInt;
    this.fdh = true;
    GMTrace.o(13353455976448L, 99491);
  }
  
  public void dr(int paramInt)
  {
    GMTrace.i(13353590194176L, 99492);
    this.fjf = paramInt;
    this.fdh = true;
    GMTrace.o(13353590194176L, 99492);
  }
  
  public void ds(int paramInt)
  {
    GMTrace.i(13353992847360L, 99495);
    this.fji = paramInt;
    this.fdh = true;
    GMTrace.o(13353992847360L, 99495);
  }
  
  public void dt(int paramInt)
  {
    GMTrace.i(13354127065088L, 99496);
    this.fjj = paramInt;
    this.fdh = true;
    GMTrace.o(13354127065088L, 99496);
  }
  
  public void du(int paramInt)
  {
    GMTrace.i(13355066589184L, 99503);
    this.fjn = paramInt;
    this.fdh = true;
    GMTrace.o(13355066589184L, 99503);
  }
  
  public void dv(int paramInt)
  {
    GMTrace.i(13355871895552L, 99509);
    this.fjr = paramInt;
    this.fdh = true;
    GMTrace.o(13355871895552L, 99509);
  }
  
  public void dw(int paramInt)
  {
    GMTrace.i(13356006113280L, 99510);
    this.fjs = paramInt;
    this.fdh = true;
    GMTrace.o(13356006113280L, 99510);
  }
  
  public final void dx(int paramInt)
  {
    GMTrace.i(17535814598656L, 130652);
    this.fjB = paramInt;
    this.fdh = true;
    GMTrace.o(17535814598656L, 130652);
  }
  
  public String getCity()
  {
    GMTrace.i(13354663936000L, 99500);
    String str = this.fjl;
    GMTrace.o(13354663936000L, 99500);
    return str;
  }
  
  public String getProvince()
  {
    GMTrace.i(13354395500544L, 99498);
    String str = this.fjk;
    GMTrace.o(13354395500544L, 99498);
    return str;
  }
  
  public int getSource()
  {
    GMTrace.i(13355200806912L, 99504);
    int i = this.cfz;
    GMTrace.o(13355200806912L, 99504);
    return i;
  }
  
  public final String getUsername()
  {
    GMTrace.i(13349295226880L, 99460);
    String str = this.field_username;
    GMTrace.o(13349295226880L, 99460);
    return str;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(13352382234624L, 99483);
    try
    {
      if (this.fdh)
      {
        localObject = new t();
        ((t)localObject).bPC();
        ((t)localObject).Ak(this.fiZ);
        ((t)localObject).Ak(this.fja);
        ((t)localObject).RL(this.fjb);
        ((t)localObject).eH(this.fjc);
        ((t)localObject).Ak(this.uin);
        ((t)localObject).RL(this.fjd);
        ((t)localObject).RL(this.eMW);
        ((t)localObject).Ak(this.fje);
        ((t)localObject).Ak(this.fjf);
        ((t)localObject).RL(this.fjg);
        ((t)localObject).RL(this.fjh);
        ((t)localObject).Ak(this.fji);
        ((t)localObject).Ak(this.fjj);
        ((t)localObject).RL(this.signature);
        ((t)localObject).RL(this.fjk);
        ((t)localObject).RL(this.fjl);
        ((t)localObject).RL(this.fjm);
        ((t)localObject).Ak(this.fjn);
        ((t)localObject).Ak(this.cfz);
        ((t)localObject).RL(this.fjo);
        ((t)localObject).Ak(this.field_verifyFlag);
        ((t)localObject).RL(this.fjp);
        ((t)localObject).RL(this.fjq);
        ((t)localObject).Ak(this.fjr);
        ((t)localObject).Ak(this.fjs);
        ((t)localObject).RL(this.fjt);
        ((t)localObject).RL(this.fju);
        ((t)localObject).RL(this.fjv);
        ((t)localObject).RL(this.fjw);
        ((t)localObject).RL(this.fjx);
        ((t)localObject).RL(this.fjy);
        ((t)localObject).RL(this.fjz);
        ((t)localObject).RL(this.fjA);
        ((t)localObject).Ak(this.fjB);
        this.field_lvbuff = ((t)localObject).bPD();
      }
      Object localObject = new ContentValues();
      if (this.field_username == null) {
        this.field_username = "";
      }
      if (this.fcb) {
        ((ContentValues)localObject).put("username", this.field_username);
      }
      if (this.field_alias == null) {
        this.field_alias = "";
      }
      if (this.fiv) {
        ((ContentValues)localObject).put("alias", this.field_alias);
      }
      if (this.field_conRemark == null) {
        this.field_conRemark = "";
      }
      if (this.fiw) {
        ((ContentValues)localObject).put("conRemark", this.field_conRemark);
      }
      if (this.field_domainList == null) {
        this.field_domainList = "";
      }
      if (this.fix) {
        ((ContentValues)localObject).put("domainList", this.field_domainList);
      }
      if (this.field_nickname == null) {
        this.field_nickname = "";
      }
      if (this.fgz) {
        ((ContentValues)localObject).put("nickname", this.field_nickname);
      }
      if (this.field_pyInitial == null) {
        this.field_pyInitial = "";
      }
      if (this.fiy) {
        ((ContentValues)localObject).put("pyInitial", this.field_pyInitial);
      }
      if (this.field_quanPin == null) {
        this.field_quanPin = "";
      }
      if (this.fiz) {
        ((ContentValues)localObject).put("quanPin", this.field_quanPin);
      }
      if (this.fiA) {
        ((ContentValues)localObject).put("showHead", Integer.valueOf(this.field_showHead));
      }
      if (this.fan) {
        ((ContentValues)localObject).put("type", Integer.valueOf(this.field_type));
      }
      if (this.fiB) {
        ((ContentValues)localObject).put("weiboFlag", Integer.valueOf(this.field_weiboFlag));
      }
      if (this.field_weiboNickname == null) {
        this.field_weiboNickname = "";
      }
      if (this.fiC) {
        ((ContentValues)localObject).put("weiboNickname", this.field_weiboNickname);
      }
      if (this.field_conRemarkPYFull == null) {
        this.field_conRemarkPYFull = "";
      }
      if (this.fiD) {
        ((ContentValues)localObject).put("conRemarkPYFull", this.field_conRemarkPYFull);
      }
      if (this.field_conRemarkPYShort == null) {
        this.field_conRemarkPYShort = "";
      }
      if (this.fiE) {
        ((ContentValues)localObject).put("conRemarkPYShort", this.field_conRemarkPYShort);
      }
      if (this.fdh) {
        ((ContentValues)localObject).put("lvbuff", this.field_lvbuff);
      }
      if (this.fiF) {
        ((ContentValues)localObject).put("verifyFlag", Integer.valueOf(this.field_verifyFlag));
      }
      if (this.field_encryptUsername == null) {
        this.field_encryptUsername = "";
      }
      if (this.fiG) {
        ((ContentValues)localObject).put("encryptUsername", this.field_encryptUsername);
      }
      if (this.fiH) {
        ((ContentValues)localObject).put("chatroomFlag", Integer.valueOf(this.field_chatroomFlag));
      }
      if (this.fiI) {
        ((ContentValues)localObject).put("deleteFlag", Integer.valueOf(this.field_deleteFlag));
      }
      if (this.field_contactLabelIds == null) {
        this.field_contactLabelIds = "";
      }
      if (this.fiJ) {
        ((ContentValues)localObject).put("contactLabelIds", this.field_contactLabelIds);
      }
      if (this.vmr > 0L) {
        ((ContentValues)localObject).put("rowid", Long.valueOf(this.vmr));
      }
      GMTrace.o(13352382234624L, 99483);
      return (ContentValues)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SDK.BaseContact", "get value failed, %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public String qQ()
  {
    GMTrace.i(13349563662336L, 99462);
    String str = this.field_alias;
    GMTrace.o(13349563662336L, 99462);
    return str;
  }
  
  public String qR()
  {
    GMTrace.i(13350234750976L, 99467);
    String str = this.field_pyInitial;
    GMTrace.o(13350234750976L, 99467);
    return str;
  }
  
  public String qS()
  {
    GMTrace.i(13350503186432L, 99469);
    String str = this.field_quanPin;
    GMTrace.o(13350503186432L, 99469);
    return str;
  }
  
  public final void qT()
  {
    GMTrace.i(13357214072832L, 99519);
    try
    {
      if (this.field_lvbuff != null)
      {
        i = this.field_lvbuff.length;
        if (i != 0) {}
      }
      else
      {
        GMTrace.o(13357214072832L, 99519);
        return;
      }
      t localt = new t();
      int i = localt.bl(this.field_lvbuff);
      if (i != 0)
      {
        w.e("MicroMsg.SDK.BaseContact", "parse LVBuffer error:" + i);
        GMTrace.o(13357214072832L, 99519);
        return;
      }
      this.fiZ = localt.getInt();
      this.fja = localt.getInt();
      this.fjb = localt.getString();
      this.fjc = localt.getLong();
      this.uin = localt.getInt();
      this.fjd = localt.getString();
      this.eMW = localt.getString();
      this.fje = localt.getInt();
      this.fjf = localt.getInt();
      this.fjg = localt.getString();
      this.fjh = localt.getString();
      this.fji = localt.getInt();
      this.fjj = localt.getInt();
      this.signature = localt.getString();
      this.fjk = localt.getString();
      this.fjl = localt.getString();
      this.fjm = localt.getString();
      this.fjn = localt.getInt();
      this.cfz = localt.getInt();
      this.fjo = localt.getString();
      this.field_verifyFlag = localt.getInt();
      this.fjp = localt.getString();
      if (!localt.bPB()) {
        this.fjq = localt.getString();
      }
      if (!localt.bPB()) {
        this.fjr = localt.getInt();
      }
      if (!localt.bPB()) {
        this.fjs = localt.getInt();
      }
      if (!localt.bPB()) {
        this.fjt = localt.getString();
      }
      if (!localt.bPB()) {
        this.fju = localt.getString();
      }
      if (!localt.bPB()) {
        this.fjv = localt.getString();
      }
      if (!localt.bPB()) {
        this.fjw = localt.getString();
      }
      if (!localt.bPB()) {
        this.fjx = localt.getString();
      }
      if (!localt.bPB()) {
        this.fjy = localt.getString();
      }
      if (!localt.bPB()) {
        this.fjz = localt.getString();
      }
      if (!localt.bPB()) {
        this.fjA = localt.getString();
      }
      if (!localt.bPB()) {
        this.fjB = localt.getInt();
      }
      GMTrace.o(13357214072832L, 99519);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.SDK.BaseContact", "get value failed");
      GMTrace.o(13357214072832L, 99519);
    }
  }
  
  public void setSource(int paramInt)
  {
    GMTrace.i(13355335024640L, 99505);
    this.cfz = paramInt;
    this.fdh = true;
    GMTrace.o(13355335024640L, 99505);
  }
  
  public void setType(int paramInt)
  {
    GMTrace.i(13350771621888L, 99471);
    this.field_type = paramInt;
    this.fan = true;
    GMTrace.o(13350771621888L, 99471);
  }
  
  public void setUsername(String paramString)
  {
    GMTrace.i(13349161009152L, 99459);
    this.field_username = paramString;
    this.fcb = true;
    GMTrace.o(13349161009152L, 99459);
  }
  
  public void u(byte[] paramArrayOfByte)
  {
    GMTrace.i(13351442710528L, 99476);
    this.field_lvbuff = paramArrayOfByte;
    this.fdh = true;
    GMTrace.o(13351442710528L, 99476);
  }
  
  public void w(long paramLong)
  {
    GMTrace.i(13352919105536L, 99487);
    this.fjc = paramLong;
    this.fdh = true;
    GMTrace.o(13352919105536L, 99487);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */