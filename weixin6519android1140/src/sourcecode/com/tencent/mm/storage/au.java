package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.au.a.a;
import com.tencent.mm.c.f;
import com.tencent.mm.g.a.mg;
import com.tencent.mm.g.a.om;
import com.tencent.mm.g.a.oo;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.k.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.n;
import java.util.Map;
import junit.framework.Assert;

public final class au
  extends n
{
  public static String vBl;
  public static String vBm;
  public boolean vBn;
  private String vBo;
  
  static
  {
    GMTrace.i(13300171538432L, 99094);
    vBl = "voip_content_voice";
    vBm = "voip_content_video";
    GMTrace.o(13300171538432L, 99094);
  }
  
  public au()
  {
    GMTrace.i(13294131740672L, 99049);
    this.vBn = false;
    GMTrace.o(13294131740672L, 99049);
  }
  
  public au(String paramString)
  {
    GMTrace.i(13294265958400L, 99050);
    this.vBn = false;
    super.db(paramString);
    GMTrace.o(13294265958400L, 99050);
  }
  
  public static au ad(au paramau)
  {
    GMTrace.i(13297621401600L, 99075);
    if (paramau == null)
    {
      w.d("MicroMsg.MsgInfo", "convertFrom msg is null ");
      GMTrace.o(13297621401600L, 99075);
      return null;
    }
    au localau = new au();
    localau.C(paramau.field_msgId);
    localau.D(paramau.field_msgSvrId);
    localau.setType(paramau.field_type);
    localau.dB(paramau.field_status);
    localau.dC(paramau.field_isSend);
    localau.field_isShowTimer = paramau.field_isShowTimer;
    localau.fwc = true;
    localau.E(paramau.field_createTime);
    localau.db(paramau.field_talker);
    localau.setContent(paramau.field_content);
    localau.dc(paramau.field_imgPath);
    localau.dd(paramau.field_reserved);
    localau.field_lvbuffer = paramau.field_lvbuffer;
    localau.fso = true;
    localau.de(paramau.field_transContent);
    localau.dg(paramau.fwt);
    localau.dM(paramau.fwu);
    localau.dh(paramau.fwv);
    GMTrace.o(13297621401600L, 99075);
    return localau;
  }
  
  public static boolean ai(Map<String, String> paramMap)
  {
    GMTrace.i(13299232014336L, 99087);
    if ((paramMap != null) && (paramMap.containsKey(".sysmsg.$type")) && (((String)paramMap.get(".sysmsg.$type")).equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication"))) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.MsgInfo", "isAddChatroomInviteMsg:%s", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(13299232014336L, 99087);
      return bool;
    }
  }
  
  public static boolean aj(Map<String, String> paramMap)
  {
    GMTrace.i(13299366232064L, 99088);
    if ((paramMap != null) && (paramMap.containsKey(".sysmsg.$type")) && (((String)paramMap.get(".sysmsg.$type")).equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval"))) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.MsgInfo", "isAddChatroomInviteAcceptMsg:%s", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(13299366232064L, 99088);
      return bool;
    }
  }
  
  public static void eS(long paramLong)
  {
    GMTrace.i(13299634667520L, 99090);
    if ((100000000L > paramLong) && (-10L < paramLong)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("msgId not in the reasonable scope", bool);
      GMTrace.o(13299634667520L, 99090);
      return;
    }
  }
  
  public final void Aw(int paramInt)
  {
    GMTrace.i(13298829361152L, 99084);
    switch (paramInt)
    {
    default: 
      w.w("MicroMsg.MsgInfo", "Illgeal forwardflag !!!");
      GMTrace.o(13298829361152L, 99084);
      return;
    }
    dM(this.fwu | paramInt);
    GMTrace.o(13298829361152L, 99084);
  }
  
  public final boolean Ug(String paramString)
  {
    GMTrace.i(13298963578880L, 99085);
    if ((!bg.nm(this.fwv)) && (!bg.nm(paramString)))
    {
      Object localObject = bh.q(this.fwv, "msgsource");
      if (localObject == null)
      {
        GMTrace.o(13298963578880L, 99085);
        return false;
      }
      localObject = (String)((Map)localObject).get(".msgsource.atuserlist");
      if (!bg.nm((String)localObject))
      {
        localObject = ((String)localObject).split(",");
        int j = localObject.length;
        int i = 0;
        while (i < j)
        {
          if (localObject[i].trim().equals(paramString))
          {
            GMTrace.o(13298963578880L, 99085);
            return true;
          }
          i += 1;
        }
      }
    }
    GMTrace.o(13298963578880L, 99085);
    return false;
  }
  
  public final boolean aCp()
  {
    GMTrace.i(13294400176128L, 99051);
    if ((this.field_type & 0xFFFF) == 49)
    {
      GMTrace.o(13294400176128L, 99051);
      return true;
    }
    GMTrace.o(13294400176128L, 99051);
    return false;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(13299500449792L, 99089);
    super.b(paramCursor);
    paramCursor = this.field_content;
    if ((paramCursor != null) && (paramCursor.length() > 2097152))
    {
      final long l = this.field_msgId;
      StringBuilder localStringBuilder = new StringBuilder(1024);
      localStringBuilder.append("Very big message: \nmsgId = ").append(l).append('\n').append("msgSvrId = ").append(this.field_msgSvrId).append('\n').append("type = ").append(this.field_type).append('\n').append("createTime = ").append(this.field_createTime).append('\n').append("talker = ").append(this.field_talker).append('\n').append("flag = ").append(this.field_flag).append('\n').append("content.length() = ").append(paramCursor.length()).append('\n').append("content = ").append(paramCursor.substring(0, 256));
      w.e("MicroMsg.MsgInfo", localStringBuilder.toString());
      setType(1);
      setContent("");
      paramCursor = ad(this);
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18782563074048L, 139941);
          ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(l, this.vBp);
          GMTrace.o(18782563074048L, 139941);
        }
      });
    }
    eS(this.field_msgId);
    GMTrace.o(13299500449792L, 99089);
  }
  
  public final boolean bTA()
  {
    GMTrace.i(13295608135680L, 99060);
    if (this.field_type == 318767153)
    {
      GMTrace.o(13295608135680L, 99060);
      return true;
    }
    GMTrace.o(13295608135680L, 99060);
    return false;
  }
  
  public final boolean bTB()
  {
    GMTrace.i(13295742353408L, 99061);
    if (this.field_type == 10002)
    {
      GMTrace.o(13295742353408L, 99061);
      return true;
    }
    GMTrace.o(13295742353408L, 99061);
    return false;
  }
  
  public final boolean bTC()
  {
    GMTrace.i(13295876571136L, 99062);
    switch (this.field_type)
    {
    default: 
      GMTrace.o(13295876571136L, 99062);
      return false;
    }
    GMTrace.o(13295876571136L, 99062);
    return true;
  }
  
  public final boolean bTD()
  {
    GMTrace.i(13296010788864L, 99063);
    if (this.field_type == 42)
    {
      GMTrace.o(13296010788864L, 99063);
      return true;
    }
    GMTrace.o(13296010788864L, 99063);
    return false;
  }
  
  public final boolean bTE()
  {
    GMTrace.i(13296145006592L, 99064);
    if (this.field_type == 48)
    {
      GMTrace.o(13296145006592L, 99064);
      return true;
    }
    GMTrace.o(13296145006592L, 99064);
    return false;
  }
  
  public final boolean bTF()
  {
    GMTrace.i(13296279224320L, 99065);
    switch (this.field_type)
    {
    default: 
      GMTrace.o(13296279224320L, 99065);
      return false;
    }
    GMTrace.o(13296279224320L, 99065);
    return true;
  }
  
  public final boolean bTG()
  {
    GMTrace.i(13296547659776L, 99067);
    if (this.field_type == 43)
    {
      GMTrace.o(13296547659776L, 99067);
      return true;
    }
    GMTrace.o(13296547659776L, 99067);
    return false;
  }
  
  public final boolean bTH()
  {
    GMTrace.i(13296681877504L, 99068);
    if (this.field_type == 62)
    {
      GMTrace.o(13296681877504L, 99068);
      return true;
    }
    GMTrace.o(13296681877504L, 99068);
    return false;
  }
  
  public final boolean bTI()
  {
    GMTrace.i(13296816095232L, 99069);
    if (this.field_type == 47)
    {
      GMTrace.o(13296816095232L, 99069);
      return true;
    }
    GMTrace.o(13296816095232L, 99069);
    return false;
  }
  
  public final boolean bTJ()
  {
    GMTrace.i(13296950312960L, 99070);
    if (this.field_type == 1048625)
    {
      GMTrace.o(13296950312960L, 99070);
      return true;
    }
    GMTrace.o(13296950312960L, 99070);
    return false;
  }
  
  public final boolean bTK()
  {
    GMTrace.i(13297084530688L, 99071);
    if (this.field_type == 268435505)
    {
      GMTrace.o(13297084530688L, 99071);
      return true;
    }
    GMTrace.o(13297084530688L, 99071);
    return false;
  }
  
  public final boolean bTL()
  {
    GMTrace.i(13297218748416L, 99072);
    if (this.field_type == -1879048191)
    {
      GMTrace.o(13297218748416L, 99072);
      return true;
    }
    GMTrace.o(13297218748416L, 99072);
    return false;
  }
  
  public final boolean bTM()
  {
    GMTrace.i(13297352966144L, 99073);
    switch (this.field_type)
    {
    case 56: 
    default: 
      GMTrace.o(13297352966144L, 99073);
      return false;
    }
    GMTrace.o(13297352966144L, 99073);
    return true;
  }
  
  public final boolean bTN()
  {
    GMTrace.i(13297487183872L, 99074);
    String str = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("TranslateMsgOff");
    if ((!bg.nm(str)) && (bg.Sy(str) != 0)) {
      w.d("MicroMsg.MsgInfo", "isTranslateFeatureOn false");
    }
    for (int i = 0; (i != 0) && (!bg.nm(this.field_transContent)); i = 1)
    {
      GMTrace.o(13297487183872L, 99074);
      return true;
    }
    GMTrace.o(13297487183872L, 99074);
    return false;
  }
  
  public final boolean bTO()
  {
    GMTrace.i(13297889837056L, 99077);
    if ((this.fwy & 0x1) > 0)
    {
      GMTrace.o(13297889837056L, 99077);
      return true;
    }
    GMTrace.o(13297889837056L, 99077);
    return false;
  }
  
  public final void bTP()
  {
    GMTrace.i(21011919536128L, 156551);
    this.fwy |= 0x1;
    this.fso = true;
    GMTrace.o(21011919536128L, 156551);
  }
  
  public final void bTQ()
  {
    GMTrace.i(13298024054784L, 99078);
    if (bTR()) {
      dM(this.fwu & 0xFFFFFFDF);
    }
    GMTrace.o(13298024054784L, 99078);
  }
  
  public final boolean bTR()
  {
    GMTrace.i(13298158272512L, 99079);
    if ((this.fwu & 0x20) > 0)
    {
      GMTrace.o(13298158272512L, 99079);
      return true;
    }
    GMTrace.o(13298158272512L, 99079);
    return false;
  }
  
  public final boolean bTS()
  {
    GMTrace.i(13298292490240L, 99080);
    if ((bTN()) && ((this.fwu & 0x10) > 0))
    {
      GMTrace.o(13298292490240L, 99080);
      return true;
    }
    GMTrace.o(13298292490240L, 99080);
    return false;
  }
  
  public final void bTT()
  {
    GMTrace.i(13298426707968L, 99081);
    if (!bTN())
    {
      GMTrace.o(13298426707968L, 99081);
      return;
    }
    dM(this.fwu | 0x10);
    GMTrace.o(13298426707968L, 99081);
  }
  
  public final void bTU()
  {
    GMTrace.i(13298560925696L, 99082);
    dM(this.fwu | 0x300);
    GMTrace.o(13298560925696L, 99082);
  }
  
  public final boolean bTV()
  {
    GMTrace.i(13298695143424L, 99083);
    if ((this.fwu & 0x300) == 0)
    {
      if ((this.fwu & 0x300) == 0)
      {
        GMTrace.o(13298695143424L, 99083);
        return false;
      }
      GMTrace.o(13298695143424L, 99083);
      return true;
    }
    GMTrace.o(13298695143424L, 99083);
    return true;
  }
  
  public final boolean bTW()
  {
    GMTrace.i(14608123297792L, 108839);
    if ((this.fwu & 0x40) == 0)
    {
      GMTrace.o(14608123297792L, 108839);
      return false;
    }
    GMTrace.o(14608123297792L, 108839);
    return true;
  }
  
  public final boolean bTX()
  {
    GMTrace.i(14608257515520L, 108840);
    if ((!bg.nm(this.fwv)) && ((this.fwv.contains("announcement@all")) || (this.fwv.contains("notify@all")))) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.MsgInfo", "isAtAll isAtAll:%s", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(14608257515520L, 108840);
      return bool;
    }
  }
  
  public final String bTY()
  {
    GMTrace.i(13299903102976L, 99092);
    if (!bTB())
    {
      GMTrace.o(13299903102976L, 99092);
      return "";
    }
    if (this.vBo == null) {
      bTZ();
    }
    String str = this.vBo;
    GMTrace.o(13299903102976L, 99092);
    return str;
  }
  
  public final com.tencent.mm.au.a bTZ()
  {
    GMTrace.i(13300037320704L, 99093);
    w.i("MicroMsg.MsgInfo", "[parseNewXmlSysMsg]");
    com.tencent.mm.au.a locala = a.a.b(f.q(this.field_content, "sysmsg"), this);
    if (locala != null)
    {
      w.i("MicroMsg.MsgInfo", "BaseNewXmlMsg:%s", new Object[] { locala });
      locala.Ka();
      this.vBo = locala.gOS;
    }
    for (;;)
    {
      GMTrace.o(13300037320704L, 99093);
      return locala;
      w.e("MicroMsg.MsgInfo", "[parseNewXmlSysMsg] null == pBaseNewXmlMsg");
    }
  }
  
  public final boolean bTs()
  {
    GMTrace.i(13294534393856L, 99052);
    if (this.field_type == 285212721)
    {
      GMTrace.o(13294534393856L, 99052);
      return true;
    }
    GMTrace.o(13294534393856L, 99052);
    return false;
  }
  
  public final boolean bTt()
  {
    GMTrace.i(13294668611584L, 99053);
    if (this.field_type == 486539313)
    {
      GMTrace.o(13294668611584L, 99053);
      return true;
    }
    GMTrace.o(13294668611584L, 99053);
    return false;
  }
  
  public final boolean bTu()
  {
    GMTrace.i(13294802829312L, 99054);
    if (this.field_type == 34)
    {
      GMTrace.o(13294802829312L, 99054);
      return true;
    }
    GMTrace.o(13294802829312L, 99054);
    return false;
  }
  
  public final boolean bTv()
  {
    GMTrace.i(13294937047040L, 99055);
    if (this.field_type == 436207665)
    {
      GMTrace.o(13294937047040L, 99055);
      return true;
    }
    GMTrace.o(13294937047040L, 99055);
    return false;
  }
  
  public final boolean bTw()
  {
    GMTrace.i(13295071264768L, 99056);
    if (this.field_type == 469762097)
    {
      GMTrace.o(13295071264768L, 99056);
      return true;
    }
    GMTrace.o(13295071264768L, 99056);
    return false;
  }
  
  public final boolean bTx()
  {
    GMTrace.i(13295205482496L, 99057);
    if (this.field_type == 301989937)
    {
      GMTrace.o(13295205482496L, 99057);
      return true;
    }
    GMTrace.o(13295205482496L, 99057);
    return false;
  }
  
  public final boolean bTy()
  {
    GMTrace.i(13295339700224L, 99058);
    if ((this.field_type == 50) || (this.field_type == 53))
    {
      GMTrace.o(13295339700224L, 99058);
      return true;
    }
    GMTrace.o(13295339700224L, 99058);
    return false;
  }
  
  public final boolean bTz()
  {
    GMTrace.i(13295473917952L, 99059);
    if (this.field_type == 52)
    {
      GMTrace.o(13295473917952L, 99059);
      return true;
    }
    GMTrace.o(13295473917952L, 99059);
    return false;
  }
  
  public final void dB(int paramInt)
  {
    GMTrace.i(13297755619328L, 99076);
    super.dB(paramInt);
    Object localObject;
    if (this.field_isSend == 1)
    {
      if ((!bTF()) && (!bTE()) && (!bTD())) {
        paramInt = 1;
      }
      while (paramInt != 0) {
        if (this.field_status == 5)
        {
          w.e("MicroMsg.MsgInfo", "set msg status fail, msgId:%d, type:%d, userName:%s %s", new Object[] { Long.valueOf(this.field_msgId), Integer.valueOf(this.field_type), this.field_talker, bg.bQW() });
          localObject = new om();
          ((om)localObject).eTz.eAH = this;
          com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
          GMTrace.o(13297755619328L, 99076);
          return;
          paramInt = 0;
        }
        else
        {
          if (this.field_status != 2) {
            break label246;
          }
          w.d("MicroMsg.MsgInfo", "successfully send msgId:%d, type:%d", new Object[] { Long.valueOf(this.field_msgId), Integer.valueOf(this.field_type) });
          localObject = new oo();
          ((oo)localObject).eTB.eAH = this;
          com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
          GMTrace.o(13297755619328L, 99076);
          return;
        }
      }
    }
    if (this.field_isSend == 0)
    {
      localObject = new mg();
      ((mg)localObject).eRg.eAH = this;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
    }
    label246:
    GMTrace.o(13297755619328L, 99076);
  }
  
  public final boolean isSystem()
  {
    GMTrace.i(13296413442048L, 99066);
    if (this.field_type == 10000)
    {
      GMTrace.o(13296413442048L, 99066);
      return true;
    }
    GMTrace.o(13296413442048L, 99066);
    return false;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(13299768885248L, 99091);
    eS(this.field_msgId);
    ContentValues localContentValues = super.qL();
    GMTrace.o(13299768885248L, 99091);
    return localContentValues;
  }
  
  public static final class a
  {
    private String aEe;
    public String eCQ;
    public int fja;
    private String fjk;
    private String fjl;
    public String fjp;
    private String fjq;
    public String fsF;
    public String gDY;
    public String gDZ;
    public String gEa;
    public String gEd;
    public String nLE;
    public long nNL;
    public String nNN;
    public String rAP;
    public int rCC;
    public int scene;
    public String signature;
    public int vBr;
    public String vBs;
    public String vBt;
    public String vBu;
    public String vBv;
    public String vBw;
    
    private a()
    {
      GMTrace.i(13322854334464L, 99263);
      this.rAP = "";
      this.eCQ = "";
      this.fsF = "";
      this.gDZ = "";
      this.gDY = "";
      this.aEe = "";
      this.vBr = 0;
      this.scene = 0;
      this.vBs = "";
      this.vBt = "";
      this.nNL = 0L;
      this.gEa = "";
      this.gEd = "";
      this.rCC = 0;
      this.fjp = "";
      this.nLE = "";
      this.fjq = "";
      this.vBu = "";
      this.vBv = "";
      this.nNN = "";
      this.vBw = "";
      GMTrace.o(13322854334464L, 99263);
    }
    
    public static a Uh(String paramString)
    {
      GMTrace.i(13322988552192L, 99264);
      locala = new a();
      localObject = bg.aq(paramString, "").trim();
      paramString = (String)localObject;
      if (!((String)localObject).startsWith("<"))
      {
        int i = ((String)localObject).indexOf(":");
        paramString = (String)localObject;
        if (i != -1) {
          paramString = ((String)localObject).substring(i + 1);
        }
      }
      localObject = bh.q(paramString, "msg");
      if (localObject != null) {}
      for (;;)
      {
        try
        {
          if (((Map)localObject).get(".msg.$fromusername") != null) {
            continue;
          }
          locala.rAP = ((String)((Map)localObject).get(".msg.$username"));
          if (((Map)localObject).get(".msg.$fromnickname") != null) {
            continue;
          }
          locala.eCQ = ((String)((Map)localObject).get(".msg.$nickname"));
        }
        catch (Exception paramString)
        {
          w.e("MicroMsg.MsgInfo", "exception:%s", new Object[] { bg.f(paramString) });
          continue;
          locala.eCQ = ((String)((Map)localObject).get(".msg.$fromnickname"));
          continue;
          paramString = (String)((Map)localObject).get(".msg.$certflag");
          continue;
        }
        locala.fsF = ((String)((Map)localObject).get(".msg.$alias"));
        locala.gDZ = ((String)((Map)localObject).get(".msg.$fullpy"));
        locala.gDY = ((String)((Map)localObject).get(".msg.$shortpy"));
        locala.aEe = ((String)((Map)localObject).get(".msg.$source"));
        locala.vBr = Integer.valueOf((String)((Map)localObject).get(".msg.$imagestatus")).intValue();
        locala.scene = Integer.valueOf((String)((Map)localObject).get(".msg.$scene")).intValue();
        locala.vBs = ((String)((Map)localObject).get(".msg.$mobileidentify"));
        locala.vBt = ((String)((Map)localObject).get(".msg.$mobilelongidentify"));
        if ((((Map)localObject).get(".msg.$qqnum") != null) && (((String)((Map)localObject).get(".msg.$qqnum")).length() > 0)) {
          locala.nNL = Long.valueOf((String)((Map)localObject).get(".msg.$qqnum")).longValue();
        }
        locala.signature = ((String)((Map)localObject).get(".msg.$sign"));
        if ((((Map)localObject).get(".msg.$sex") != null) && (((String)((Map)localObject).get(".msg.$sex")).length() > 0)) {
          locala.fja = Integer.valueOf((String)((Map)localObject).get(".msg.$sex")).intValue();
        }
        locala.fjl = ((String)((Map)localObject).get(".msg.$city"));
        locala.fjk = ((String)((Map)localObject).get(".msg.$province"));
        locala.gEa = ((String)((Map)localObject).get(".msg.$qqnickname"));
        locala.gEd = ((String)((Map)localObject).get(".msg.$qqremark"));
        if (!TextUtils.isEmpty((CharSequence)((Map)localObject).get(".msg.$certflag"))) {
          continue;
        }
        paramString = "0";
        locala.rCC = Integer.valueOf(paramString).intValue();
        locala.fjp = bg.nl((String)((Map)localObject).get(".msg.$certinfo"));
        locala.nLE = bg.nl((String)((Map)localObject).get(".msg.$brandIconUrl"));
        locala.fjq = bg.nl((String)((Map)localObject).get(".msg.$regionCode"));
        locala.vBu = bg.nl((String)((Map)localObject).get(".msg.$bigheadimgurl"));
        locala.vBv = bg.nl((String)((Map)localObject).get(".msg.$smallheadimgurl"));
        locala.nNN = bg.nl((String)((Map)localObject).get(".msg.$googlecontact"));
        locala.vBw = bg.nl((String)((Map)localObject).get(".msg.$antispamticket"));
        w.i("MicroMsg.MsgInfo", "dkverify FriendContent user:[%s] ticket:[%s] big:[%s] sm:[%s]", new Object[] { locala.rAP, locala.vBw, locala.vBu, locala.vBv });
        GMTrace.o(13322988552192L, 99264);
        return locala;
        locala.rAP = ((String)((Map)localObject).get(".msg.$fromusername"));
      }
    }
    
    public final int aGs()
    {
      GMTrace.i(13323391205376L, 99267);
      int i = this.scene;
      GMTrace.o(13323391205376L, 99267);
      return i;
    }
    
    public final String bUa()
    {
      GMTrace.i(15694078935040L, 116930);
      String str = this.rAP;
      GMTrace.o(15694078935040L, 116930);
      return str;
    }
    
    public final String bUb()
    {
      GMTrace.i(13323525423104L, 99268);
      String str = this.vBs;
      GMTrace.o(13323525423104L, 99268);
      return str;
    }
    
    public final long bUc()
    {
      GMTrace.i(13323659640832L, 99269);
      long l = this.nNL;
      GMTrace.o(13323659640832L, 99269);
      return l;
    }
    
    public final String bUd()
    {
      GMTrace.i(13323793858560L, 99270);
      if ((this.gEd != null) && (this.gEd.length() > 0))
      {
        str = this.gEd;
        GMTrace.o(13323793858560L, 99270);
        return str;
      }
      if ((this.gEa != null) && (this.gEa.length() > 0))
      {
        str = this.gEa;
        GMTrace.o(13323793858560L, 99270);
        return str;
      }
      String str = Long.toString(this.nNL);
      GMTrace.o(13323793858560L, 99270);
      return str;
    }
    
    public final String bUe()
    {
      GMTrace.i(13323928076288L, 99271);
      String str = this.vBt;
      GMTrace.o(13323928076288L, 99271);
      return str;
    }
    
    public final int bUf()
    {
      GMTrace.i(13324330729472L, 99274);
      int i = this.rCC;
      GMTrace.o(13324330729472L, 99274);
      return i;
    }
    
    public final String getCity()
    {
      GMTrace.i(13324062294016L, 99272);
      Object localObject;
      if (!bg.nm(this.fjq))
      {
        localObject = this.fjq.split("_");
        if (localObject.length > 0)
        {
          if (localObject.length <= 2) {
            break label76;
          }
          this.fjl = RegionCodeDecoder.bUl().aj(localObject[0], localObject[1], localObject[2]);
        }
      }
      for (;;)
      {
        localObject = this.fjl;
        GMTrace.o(13324062294016L, 99272);
        return (String)localObject;
        label76:
        if (localObject.length == 2) {
          this.fjl = RegionCodeDecoder.bUl().fg(localObject[0], localObject[1]);
        } else {
          this.fjl = "";
        }
      }
    }
    
    public final String getDisplayName()
    {
      GMTrace.i(13323256987648L, 99266);
      if (!TextUtils.isEmpty(this.eCQ))
      {
        str = this.eCQ;
        GMTrace.o(13323256987648L, 99266);
        return str;
      }
      if (!TextUtils.isEmpty(this.fsF))
      {
        str = this.fsF;
        GMTrace.o(13323256987648L, 99266);
        return str;
      }
      w.f("MicroMsg.MsgInfo", "username is nullOrNil");
      String str = bg.nl(this.rAP);
      GMTrace.o(13323256987648L, 99266);
      return str;
    }
    
    public final String getProvince()
    {
      GMTrace.i(13324196511744L, 99273);
      Object localObject;
      if (!bg.nm(this.fjq))
      {
        localObject = this.fjq.split("_");
        if (localObject.length > 0) {
          if ((localObject.length <= 2) || (!RegionCodeDecoder.Uu(localObject[0]))) {
            break label82;
          }
        }
      }
      label82:
      for (this.fjk = RegionCodeDecoder.bUl().fg(localObject[0], localObject[1]);; this.fjk = RegionCodeDecoder.bUl().Uv(localObject[0]))
      {
        localObject = this.fjk;
        GMTrace.o(13324196511744L, 99273);
        return (String)localObject;
      }
    }
  }
  
  public static final class b
  {
    public int eMn;
    public String label;
    public double mwH;
    public double mwI;
    public String mzo;
    public String rAP;
    public String tmu;
    public String vBA;
    public String vBx;
    public String vBy;
    public String vBz;
    
    public b()
    {
      GMTrace.i(13312519569408L, 99186);
      this.rAP = "";
      this.mwH = 0.0D;
      this.mwI = 0.0D;
      this.eMn = 0;
      this.label = "";
      this.mzo = "";
      this.vBx = "";
      this.vBy = null;
      this.vBz = null;
      this.vBA = null;
      this.tmu = "";
      GMTrace.o(13312519569408L, 99186);
    }
    
    public static b Ui(String paramString)
    {
      GMTrace.i(13312788004864L, 99188);
      b localb = new b();
      paramString = bh.q(paramString, "msg");
      if (paramString != null)
      {
        localb.rAP = bg.aq((String)paramString.get(".msg.location.$fromusername"), "");
        localb.mwH = bg.SA((String)paramString.get(".msg.location.$x"));
        localb.mwI = bg.SA((String)paramString.get(".msg.location.$y"));
        localb.label = bg.aq((String)paramString.get(".msg.location.$label"), "");
        localb.vBx = bg.aq((String)paramString.get(".msg.location.$maptype"), "");
        localb.eMn = bg.Sy((String)paramString.get(".msg.location.$scale"));
        localb.vBA = bg.aq((String)paramString.get(".msg.location.$localLocationen"), "");
        localb.vBy = bg.aq((String)paramString.get(".msg.location.$localLocationcn"), "");
        localb.vBz = bg.aq((String)paramString.get(".msg.location.$localLocationtw"), "");
        localb.mzo = bg.aq((String)paramString.get(".msg.location.$poiname"), "");
        localb.tmu = bg.aq((String)paramString.get(".msg.location.$infourl"), "");
      }
      GMTrace.o(13312788004864L, 99188);
      return localb;
    }
    
    public final String toString()
    {
      GMTrace.i(13312385351680L, 99185);
      String str = String.format("%d-%d-%d", new Object[] { Integer.valueOf((int)(this.mwH * 1000000.0D)), Integer.valueOf((int)(this.mwI * 1000000.0D)), Integer.valueOf(this.eMn) });
      GMTrace.o(13312385351680L, 99185);
      return str;
    }
  }
  
  public static final class c
  {
    public String content;
    public String gTN;
    public boolean lgw;
    public String nRW;
    public String title;
    public String vBB;
    
    private c()
    {
      GMTrace.i(13305271812096L, 99132);
      this.title = "";
      this.content = "";
      this.gTN = "";
      this.vBB = "";
      this.lgw = false;
      GMTrace.o(13305271812096L, 99132);
    }
    
    public static c Uj(String paramString)
    {
      GMTrace.i(13305406029824L, 99133);
      c localc = new c();
      paramString = bh.q(paramString, "msg");
      if (paramString != null) {}
      try
      {
        localc.title = ((String)paramString.get(".msg.pushmail.content.subject"));
        localc.content = ((String)paramString.get(".msg.pushmail.content.digest"));
        localc.gTN = ((String)paramString.get(".msg.pushmail.content.sender"));
        localc.vBB = ((String)paramString.get(".msg.pushmail.waplink"));
        localc.lgw = bg.nl((String)paramString.get(".msg.pushmail.content.attach")).equalsIgnoreCase("true");
        localc.nRW = ((String)paramString.get(".msg.pushmail.mailid"));
        GMTrace.o(13305406029824L, 99133);
        return localc;
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          w.e("MicroMsg.MsgInfo", "exception:%s", new Object[] { bg.f(paramString) });
        }
      }
    }
    
    public final String bUg()
    {
      GMTrace.i(13305540247552L, 99134);
      String str = this.vBB;
      GMTrace.o(13305540247552L, 99134);
      return str;
    }
  }
  
  public static final class d
  {
    public String chatroomName;
    public String content;
    private String countryCode;
    public String eCQ;
    public int eHJ;
    public int fja;
    public String fsF;
    public String gDY;
    public String gDZ;
    public String gEa;
    private String gEd;
    private String goU;
    private String goV;
    public String nLA;
    public long nNL;
    public String nNN;
    public String rAP;
    public int scene;
    public String signature;
    public String twr;
    public String tws;
    public int vBC;
    public String vBD;
    public String vBE;
    public int vBF;
    public String vBG;
    public String vBH;
    public int vBr;
    public String vBs;
    public String vBt;
    public String vBu;
    public String vBv;
    
    private d()
    {
      GMTrace.i(13302453239808L, 99111);
      this.rAP = "";
      this.fsF = "";
      this.eCQ = "";
      this.gDZ = "";
      this.gDY = "";
      this.content = "";
      this.vBr = 0;
      this.scene = 0;
      this.vBs = "";
      this.vBt = "";
      this.nNL = 0L;
      this.gEa = "";
      this.gEd = "";
      this.vBC = 0;
      this.vBu = "";
      this.vBv = "";
      this.chatroomName = "";
      GMTrace.o(13302453239808L, 99111);
    }
    
    public static d Uk(String paramString)
    {
      GMTrace.i(13302587457536L, 99112);
      d locald = new d();
      paramString = bh.q(paramString, "msg");
      if (paramString != null) {}
      try
      {
        locald.rAP = ((String)paramString.get(".msg.$fromusername"));
        locald.fsF = ((String)paramString.get(".msg.$alias"));
        locald.eCQ = ((String)paramString.get(".msg.$fromnickname"));
        locald.gDZ = ((String)paramString.get(".msg.$fullpy"));
        locald.gDY = ((String)paramString.get(".msg.$shortpy"));
        locald.content = ((String)paramString.get(".msg.$content"));
        locald.vBr = Integer.valueOf((String)paramString.get(".msg.$imagestatus")).intValue();
        locald.scene = Integer.valueOf((String)paramString.get(".msg.$scene")).intValue();
        locald.vBs = ((String)paramString.get(".msg.$mhash"));
        locald.vBt = ((String)paramString.get(".msg.$mfullhash"));
        if ((paramString.get(paramString.get(".msg.$qqnum")) != null) && (((String)paramString.get(paramString.get(".msg.$qqnum"))).length() > 0)) {
          locald.nNL = Long.valueOf((String)paramString.get(".msg.$qqnum")).longValue();
        }
        locald.gEa = ((String)paramString.get(".msg.$qqnickname"));
        locald.gEd = ((String)paramString.get(".msg.$qqremark"));
        locald.signature = ((String)paramString.get(".msg.$sign"));
        if ((paramString.get(".msg.$sex") != null) && (((String)paramString.get(".msg.$sex")).length() > 0)) {
          locald.fja = Integer.valueOf((String)paramString.get(".msg.$sex")).intValue();
        }
        locald.goU = ((String)paramString.get(".msg.$city"));
        locald.goV = ((String)paramString.get(".msg.$province"));
        locald.countryCode = ((String)paramString.get(".msg.$country"));
        if (paramString.get(".msg.$snsflag") != null)
        {
          locald.vBC = Integer.valueOf((String)paramString.get(".msg.$snsflag")).intValue();
          locald.vBD = ((String)paramString.get(".msg.$snsbgimgid"));
        }
        locald.nLA = ((String)paramString.get(".msg.$ticket"));
        w.d("MicroMsg.MsgInfo", "dkverify ticket:%s", new Object[] { locald.nLA });
        locald.vBu = bg.nl((String)paramString.get(".msg.$bigheadimgurl"));
        locald.vBv = bg.nl((String)paramString.get(".msg.$smallheadimgurl"));
        locald.eHJ = Integer.valueOf(bg.aq((String)paramString.get(".msg.$opcode"), "0")).intValue();
        locald.vBE = bg.nl((String)paramString.get(".msg.$encryptusername"));
        locald.nNN = bg.nl((String)paramString.get(".msg.$googlecontact"));
        w.d("MicroMsg.MsgInfo", "dkavatar VerifyContent user:[%s] big:[%s] sm:[%s]", new Object[] { locald.rAP, locald.vBu, locald.vBv });
        locald.chatroomName = bg.nl((String)paramString.get(".msg.$chatroomusername"));
        locald.twr = ((String)paramString.get(".msg.$sourceusername"));
        locald.tws = ((String)paramString.get(".msg.$sourcenickname"));
        locald.vBF = bg.getInt((String)paramString.get(".msg.Antispam.$isSuspiciousUser"), 0);
        if (locald.vBF == 1)
        {
          locald.vBG = ((String)paramString.get(".msg.Antispam.safetyWarning"));
          locald.vBH = ((String)paramString.get(".msg.Antispam.safetyWarningDetail"));
        }
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.MsgInfo", paramString, "", new Object[0]);
        }
      }
      GMTrace.o(13302587457536L, 99112);
      return locald;
    }
    
    public final int aGs()
    {
      GMTrace.i(13302990110720L, 99115);
      int i = this.scene;
      GMTrace.o(13302990110720L, 99115);
      return i;
    }
    
    public final String bUa()
    {
      GMTrace.i(15693944717312L, 116929);
      String str = this.rAP;
      GMTrace.o(15693944717312L, 116929);
      return str;
    }
    
    public final String bUb()
    {
      GMTrace.i(13303124328448L, 99116);
      String str = this.vBs;
      GMTrace.o(13303124328448L, 99116);
      return str;
    }
    
    public final int bUh()
    {
      GMTrace.i(13303526981632L, 99119);
      int i = this.vBC;
      GMTrace.o(13303526981632L, 99119);
      return i;
    }
    
    public final String bUi()
    {
      GMTrace.i(13303661199360L, 99120);
      String str = this.vBD;
      GMTrace.o(13303661199360L, 99120);
      return str;
    }
    
    public final String getCity()
    {
      GMTrace.i(13303258546176L, 99117);
      if ((!bg.nm(this.countryCode)) && (!bg.nm(this.goV)))
      {
        if (bg.nm(this.goU))
        {
          str = RegionCodeDecoder.bUl().fg(this.countryCode, this.goV);
          GMTrace.o(13303258546176L, 99117);
          return str;
        }
        str = RegionCodeDecoder.bUl().aj(this.countryCode, this.goV, this.goU);
        GMTrace.o(13303258546176L, 99117);
        return str;
      }
      String str = this.goU;
      GMTrace.o(13303258546176L, 99117);
      return str;
    }
    
    public final String getDisplayName()
    {
      GMTrace.i(13302855892992L, 99114);
      if ((this.eCQ != null) && (this.eCQ.length() > 0))
      {
        str = this.eCQ;
        GMTrace.o(13302855892992L, 99114);
        return str;
      }
      w.f("MicroMsg.MsgInfo", "username is nullOrNil");
      String str = this.rAP;
      GMTrace.o(13302855892992L, 99114);
      return str;
    }
    
    public final String getProvince()
    {
      GMTrace.i(13303392763904L, 99118);
      if (!bg.nm(this.countryCode))
      {
        if ((!bg.nm(this.goV)) && (!bg.nm(this.goU)) && (RegionCodeDecoder.Uu(this.countryCode)))
        {
          str = RegionCodeDecoder.bUl().fg(this.countryCode, this.goV);
          GMTrace.o(13303392763904L, 99118);
          return str;
        }
        str = RegionCodeDecoder.bUl().Uv(this.countryCode);
        GMTrace.o(13303392763904L, 99118);
        return str;
      }
      String str = this.goV;
      GMTrace.o(13303392763904L, 99118);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */