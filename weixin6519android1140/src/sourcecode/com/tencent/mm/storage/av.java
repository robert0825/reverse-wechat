package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.c;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.b;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import junit.framework.Assert;

public final class av
  extends com.tencent.mm.sdk.e.j
  implements c
{
  public static final String[] fTX;
  private final g goN;
  private final long vAG;
  private boolean vBI;
  private as vBJ;
  private ar vBK;
  private final List<e> vBL;
  private List<c.b> vBM;
  private final f<Integer, au.c> vBN;
  private final f<Integer, au.d> vBO;
  private final f<Integer, au.a> vBP;
  private final f<Integer, au.b> vBQ;
  private final f<Integer, Object> vBR;
  private final f<String, Long> vBS;
  private ah vBT;
  private final k<c.a, c.c> vBU;
  private Map<String, c.c> vBV;
  private boolean vBW;
  private String vBX;
  private long vBY;
  
  static
  {
    GMTrace.i(13230109884416L, 98572);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS " + "message" + " ( msgId INTEGER PRIMARY KEY, msgSvrId" + " INTEGER , type INT, status" + " INT, isSend INT, isShowTimer" + " INTEGER, createTime INTEGER, talker" + " TEXT, content TEXT, imgPath" + " TEXT, reserved TEXT, lvbuffer" + " BLOB, transContent TEXT,transBrandWording" + " TEXT ,talkerId INTEGER, bizClientMsgId" + " TEXT, bizChatId INTEGER DEFAULT -1, bizChatUserId" + " TEXT, msgSeq INTEGER, flag" + " INT) " };
    GMTrace.o(13230109884416L, 98572);
  }
  
  public av(g paramg, ar paramar, as paramas)
  {
    GMTrace.i(13216553893888L, 98471);
    this.vBI = false;
    this.vBL = new CopyOnWriteArrayList();
    this.vBN = new f(100);
    this.vBO = new f(100);
    this.vBP = new f(100);
    this.vBQ = new f(100);
    this.vBR = new f(100);
    this.vBS = new f(100);
    this.vBT = new ah();
    this.vBU = new k() {};
    this.vBV = new HashMap();
    this.vBW = false;
    this.vBX = "";
    this.vBY = 0L;
    this.vAG = 86400L;
    this.goN = paramg;
    this.vBK = paramar;
    this.vBJ = paramas;
    h.xz();
    if (((Integer)h.xy().xh().get(348169, Integer.valueOf(0))).intValue() == 0)
    {
      w.i("MicroMsg.MsgInfoStorage", "deleted dirty msg ,count is %d", new Object[] { Integer.valueOf(this.goN.delete("message", "msgId> ? ", new String[] { "80000000" })) });
      h.xz();
      h.xy().xh().set(348169, Integer.valueOf(1));
    }
    a(paramg, "message");
    bUj();
    if (this.vBM == null) {
      this.vBM = new LinkedList();
    }
    this.vBM.clear();
    a(new c.b(1, "message", c.b.a(1L, 1000000L, 10000000L, 90000000L)));
    GMTrace.o(13216553893888L, 98471);
  }
  
  private String Ul(String paramString)
  {
    GMTrace.i(13218164506624L, 98483);
    String str = Ct(paramString);
    if ((this.vBI) && (str.equals("message")))
    {
      paramString = " talkerId=" + Um(paramString) + " ";
      GMTrace.o(13218164506624L, 98483);
      return paramString;
    }
    paramString = " talker= '" + bg.nk(paramString) + "' ";
    GMTrace.o(13218164506624L, 98483);
    return paramString;
  }
  
  private long Um(String paramString)
  {
    GMTrace.i(13218298724352L, 98484);
    long l = this.vBK.TF(paramString);
    if (l < 0L) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool)
      {
        x localx = new x(paramString);
        localx.setType(2);
        this.vBK.R(localx);
        l = this.vBK.TF(paramString);
      }
      if (!b.bPs()) {
        w.i("MicroMsg.MsgInfoStorage", "getTalkerIdByTalkerName:%s id:%s needinsert:%s [%s]", new Object[] { paramString, Long.valueOf(l), Boolean.valueOf(bool), bg.bQW() });
      }
      GMTrace.o(13218298724352L, 98484);
      return l;
    }
  }
  
  private static String Un(String paramString)
  {
    GMTrace.i(13220580425728L, 98501);
    if (bg.nm(paramString))
    {
      GMTrace.o(13220580425728L, 98501);
      return null;
    }
    try
    {
      paramString = bh.q(paramString, "msgsource");
      if (paramString != null)
      {
        boolean bool = paramString.isEmpty();
        if (!bool) {}
      }
      else
      {
        GMTrace.o(13220580425728L, 98501);
        return null;
      }
      paramString = (String)paramString.get(".msgsource.bizmsg.msgcluster");
      GMTrace.o(13220580425728L, 98501);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.MsgInfoStorage", "exception:%s", new Object[] { bg.f(paramString) });
      w.e("MicroMsg.MsgInfoStorage", "Exception in getMsgcluster, %s", new Object[] { paramString.getMessage() });
      GMTrace.o(13220580425728L, 98501);
    }
    return null;
  }
  
  private String Uo(String paramString)
  {
    GMTrace.i(13225680699392L, 98539);
    if ((paramString == null) || (!paramString.equals("message")))
    {
      GMTrace.o(13225680699392L, 98539);
      return "";
    }
    if (this.vBI)
    {
      GMTrace.o(13225680699392L, 98539);
      return "INDEXED BY messageTaklerIdTypeCreateTimeIndex";
    }
    GMTrace.o(13225680699392L, 98539);
    return "INDEXED BY messageCreateTaklerTypeTimeIndex";
  }
  
  private c.b Up(String paramString)
  {
    GMTrace.i(20381633085440L, 151855);
    boolean bool;
    int i;
    if ((paramString != null) && (paramString.length() > 0))
    {
      bool = true;
      Assert.assertTrue("tableName == null", bool);
      i = 0;
    }
    for (;;)
    {
      if (i >= this.vBM.size()) {
        break label104;
      }
      if (paramString.equals(((c.b)this.vBM.get(i)).name))
      {
        paramString = (c.b)this.vBM.get(i);
        GMTrace.o(20381633085440L, 151855);
        return paramString;
        bool = false;
        break;
      }
      i += 1;
    }
    label104:
    Assert.assertTrue("no table match", false);
    GMTrace.o(20381633085440L, 151855);
    return null;
  }
  
  private String Uq(String paramString)
  {
    GMTrace.i(13227022876672L, 98549);
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      Iterator localIterator = this.vBL.iterator();
      String str;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        str = ((e)localIterator.next()).Tg(paramString);
      } while (bg.nm(str));
      GMTrace.o(13227022876672L, 98549);
      return str;
    }
    GMTrace.o(13227022876672L, 98549);
    return "message";
  }
  
  private c.b Ur(String paramString)
  {
    GMTrace.i(13227157094400L, 98550);
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("username == null", bool);
      paramString = Up(Uq(paramString));
      GMTrace.o(13227157094400L, 98550);
      return paramString;
    }
  }
  
  private static void ae(au paramau)
  {
    GMTrace.i(13220714643456L, 98502);
    if ((paramau == null) || (!paramau.aCp()))
    {
      GMTrace.o(13220714643456L, 98502);
      return;
    }
    try
    {
      String str = paramau.field_content;
      int i = str.indexOf("<msg>");
      Object localObject = str;
      if (i > 0)
      {
        localObject = str;
        if (i < str.length()) {
          localObject = str.substring(i).trim();
        }
      }
      localObject = bh.q((String)localObject, "msg");
      if ((localObject != null) && (((Map)localObject).size() > 0)) {
        paramau.dd(aw.ah((Map)localObject));
      }
      GMTrace.o(13220714643456L, 98502);
      return;
    }
    catch (Exception paramau)
    {
      w.e("MicroMsg.MsgInfoStorage", paramau.getMessage());
      GMTrace.o(13220714643456L, 98502);
    }
  }
  
  private void b(c.b paramb)
  {
    GMTrace.i(13216956547072L, 98474);
    Cursor localCursor = this.goN.a("select max(msgid) from " + paramb.name, null, 2);
    int i;
    if (localCursor.moveToFirst())
    {
      i = localCursor.getInt(0);
      w.i("MicroMsg.MsgInfoStorage", "id count is %d, now id:%d", new Object[] { Integer.valueOf(i), Long.valueOf(paramb.gGZ) });
      if (i >= paramb.gGZ)
      {
        w.i("MicroMsg.MsgTable", "summermsg setMsgLocalId [%d, %d]  regions[%d, %d] stack[%s]", new Object[] { Long.valueOf(paramb.gGZ), Integer.valueOf(i), Long.valueOf(paramb.mUV[0].mUY), Long.valueOf(paramb.mUV[1].mUX), bg.bQW() });
        if ((i <= paramb.mUV[0].mUY) || (i >= paramb.mUV[1].mUX)) {
          break label287;
        }
        w.i("MicroMsg.MsgTable", "summermsg setMsgLocalId revised msgLocalId to %d", new Object[] { Long.valueOf(paramb.mUV[1].mUX) });
        paramb.gGZ = paramb.mUV[1].mUX;
        d.oqe.a(111L, 169L, 1L, false);
      }
    }
    for (;;)
    {
      localCursor.close();
      w.w("MicroMsg.MsgInfoStorage", "loading new msg id:" + paramb.gGZ);
      GMTrace.o(13216956547072L, 98474);
      return;
      label287:
      paramb.gGZ = i;
    }
  }
  
  private void bUj()
  {
    GMTrace.i(13216285458432L, 98469);
    long l1 = System.currentTimeMillis();
    long l2 = this.goN.cE(Thread.currentThread().getId());
    long l3 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = new String[13];
    arrayOfString[0] = ("CREATE INDEX IF NOT EXISTS " + "message" + "IdIndex ON message ( msgId" + " )");
    arrayOfString[1] = ("CREATE INDEX IF NOT EXISTS " + "message" + "SvrIdIndex ON message ( msgSvrId" + " )");
    arrayOfString[2] = ("CREATE INDEX IF NOT EXISTS " + "message" + "SendCreateTimeIndex ON message ( status" + ",isSend,createTime" + " )");
    arrayOfString[3] = ("CREATE INDEX IF NOT EXISTS " + "message" + "CreateTimeIndex ON message ( createTime" + " )");
    arrayOfString[4] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TaklerIdTypeCreateTimeIndex ON message ( talkerId" + ",type,createTime" + " )");
    arrayOfString[5] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdStatusIndex ON message ( talkerId" + ",status )");
    arrayOfString[6] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdCreateTimeIsSendIndex ON message ( talkerId" + ",isSend,createTime" + " )");
    arrayOfString[7] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdCreateTimeIndex ON message ( talkerId" + ",createTime )");
    arrayOfString[8] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdSvrIdIndex ON message ( talkerId" + ",msgSvrId )");
    arrayOfString[9] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdTypeIndex ON message ( talkerId" + ",type )");
    arrayOfString[10] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerTypeIndex ON message ( talker" + ",type )");
    arrayOfString[11] = ("CREATE INDEX IF NOT EXISTS " + "message" + "messageTalkerMsgSeqIndex ON message ( talker" + ",msgSeq )");
    arrayOfString[12] = ("CREATE INDEX IF NOT EXISTS " + "message" + "messageTalkerFlagMsgSeqIndex ON message ( talker" + ",flag,msgSeq" + " )");
    if (!this.vBI)
    {
      arrayOfString[4] = "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTypeTimeIndex ON message ( talker,type,createTime )";
      arrayOfString[5] = "CREATE INDEX IF NOT EXISTS  messageTalkerStatusIndex ON message ( talker,status )";
      arrayOfString[6] = "CREATE INDEX IF NOT EXISTS  messageTalkerCreateTimeIsSendIndex ON message ( talker,isSend,createTime )";
      arrayOfString[7] = "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTimeIndex ON message ( talker,createTime )";
      arrayOfString[8] = "CREATE INDEX IF NOT EXISTS  messageTalkerSvrIdIndex ON message ( talker,msgSvrId )";
    }
    localArrayList.addAll(Arrays.asList(arrayOfString));
    int i = 0;
    while (i < localArrayList.size())
    {
      this.goN.eZ("message", (String)localArrayList.get(i));
      i += 1;
    }
    w.i("MicroMsg.MsgInfoStorage", "build new index last %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l3) });
    this.goN.aL(l2);
    w.i("MicroMsg.MsgInfoStorage", "executeMsgInitSQL last %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    GMTrace.o(13216285458432L, 98469);
  }
  
  private String eT(long paramLong)
  {
    GMTrace.i(13227425529856L, 98552);
    if ((paramLong == 0L) || (paramLong == -1L))
    {
      GMTrace.o(13227425529856L, 98552);
      return null;
    }
    au.eS(paramLong);
    int i = 0;
    while (i < this.vBM.size())
    {
      if (((c.b)this.vBM.get(i)).cR(paramLong))
      {
        String str = ((c.b)this.vBM.get(i)).name;
        GMTrace.o(13227425529856L, 98552);
        return str;
      }
      i += 1;
    }
    Assert.assertTrue(String.format("getTableNameByLocalId failed:%d", new Object[] { Long.valueOf(paramLong) }), false);
    GMTrace.o(13227425529856L, 98552);
    return null;
  }
  
  public final void A(String paramString, long paramLong)
  {
    GMTrace.i(13216151240704L, 98468);
    c.b localb = Ur(paramString);
    long l = localb.gGZ;
    Random localRandom = new Random();
    this.goN.eZ("message", "BEGIN;");
    au localau = new au(paramString);
    int i = 0;
    while (i < paramLong)
    {
      localau.E(System.currentTimeMillis());
      localau.setType(1);
      localau.setContent("纵观目前国内手游市场，大量同质类手游充斥玩家的视野，而在主机和PC平台上经久不衰的体育类游戏，却鲜有佳作。在获得了NBA官方认可以后。" + bg.bQX());
      localau.C(l);
      localau.dB(localRandom.nextInt(4));
      localau.dC(localRandom.nextInt(1));
      l += 1L;
      localb.gGZ += 1L;
      localau.D(System.currentTimeMillis() + bg.bQX());
      this.goN.eZ("message", "INSERT INTO " + Ct(localau.field_talker) + " (msgid,msgSvrid,type,status,createTime,talker,content,talkerid)  VALUES(" + localau.field_msgId + "," + localau.field_msgSvrId + "," + localau.field_type + "," + localau.field_status + "," + localau.field_createTime + ",'" + localau.field_talker + "','" + localau.field_content + "'," + Um(paramString) + ");");
      if (i % 10000 == 0)
      {
        this.goN.eZ("message", "COMMIT;");
        this.goN.eZ("message", "BEGIN;");
      }
      i += 1;
    }
    this.goN.eZ("message", "COMMIT;");
    this.vBJ.TP(paramString);
    localau.C(1L + l);
    P(localau);
    GMTrace.o(13216151240704L, 98468);
  }
  
  public final Cursor B(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(13228767707136L, 98562);
    String str = " SELECT * FROM " + Ct(paramString1) + " WHERE" + Ul(paramString1) + "AND content LIKE '" + paramString2 + "%' ORDER BY createTime DESC LIMIT " + paramInt;
    w.d("MicroMsg.MsgInfoStorage", "getInitCursorByMember getCursor talk:%s member:%s,limitCount:%d [%s]", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), str });
    paramString1 = this.goN.a(str, null, 0);
    GMTrace.o(13228767707136L, 98562);
    return paramString1;
  }
  
  public final au B(String paramString, long paramLong)
  {
    GMTrace.i(13217359200256L, 98477);
    au localau = new au();
    paramString = this.goN.a(Ct(paramString), null, "msgSvrId=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (paramString.moveToFirst()) {
      localau.b(paramString);
    }
    paramString.close();
    GMTrace.o(13217359200256L, 98477);
    return localau;
  }
  
  public final void BW(String paramString)
  {
    GMTrace.i(13215748587520L, 98465);
    w.i("MicroMsg.MsgInfoStorage", "lockForSync tag:%s islock:%b lockCnt[%d,%d] notifyCnt:%d last:[%s,%d]", new Object[] { paramString, Boolean.valueOf(this.vBW), Integer.valueOf(this.vmx.vmA), Integer.valueOf(this.vBU.vmA), Integer.valueOf(this.vBV.size()), this.vBX, Long.valueOf(bg.aH(this.vBY)) });
    if (bg.nm(paramString)) {
      Assert.assertTrue("lockForSync, do not call me by null tag.", false);
    }
    if (this.vBW)
    {
      w.w("MicroMsg.MsgInfoStorage", "lockForSync, has been locked by :%s  time:%d", new Object[] { this.vBX, Long.valueOf(bg.aH(this.vBY)) });
      GMTrace.o(13215748587520L, 98465);
      return;
    }
    this.vBX = paramString;
    this.vBY = bg.Pv();
    this.vBW = true;
    super.lock();
    this.vBU.lock();
    GMTrace.o(13215748587520L, 98465);
  }
  
  public final void BX(String paramString)
  {
    GMTrace.i(13215882805248L, 98466);
    w.i("MicroMsg.MsgInfoStorage", "unlockForSync tag:%s islock:%b lockCnt[%d,%d] notifyCnt:%d last:[%s,%d]", new Object[] { paramString, Boolean.valueOf(this.vBW), Integer.valueOf(this.vmx.vmA), Integer.valueOf(this.vBU.vmA), Integer.valueOf(this.vBV.size()), this.vBX, Long.valueOf(bg.aH(this.vBY)) });
    if (bg.nm(paramString)) {
      Assert.assertTrue("lockForSync, do not call me by null tag.", false);
    }
    if (!this.vBW)
    {
      w.w("MicroMsg.MsgInfoStorage", "unlockForSync, No one Locking Now , why this fucking tag:%s call it ! [%s]", new Object[] { paramString, bg.bQW() });
      GMTrace.o(13215882805248L, 98466);
      return;
    }
    if (!paramString.equals(this.vBX))
    {
      w.w("MicroMsg.MsgInfoStorage", "unlockForSync locking[%s] diff:%d, but unlock[%s] , Ignore this call.", new Object[] { this.vBX, Long.valueOf(bg.aH(this.vBY)), paramString });
      GMTrace.o(13215882805248L, 98466);
      return;
    }
    this.vBW = false;
    this.vBY = 0L;
    this.vBX = "";
    paramString = this.vBV.keySet().iterator();
    while (paramString.hasNext())
    {
      String str = (String)paramString.next();
      a((c.c)this.vBV.get(str));
    }
    this.vBV.clear();
    super.unlock();
    this.vBU.unlock();
    doNotify();
    GMTrace.o(13215882805248L, 98466);
  }
  
  public final Cursor BY(String paramString)
  {
    GMTrace.i(13217761853440L, 98480);
    g localg = this.goN;
    String str = Ct(paramString);
    paramString = Ul(paramString);
    paramString = localg.query(str, new String[] { "createTime", "msgId" }, paramString, null, "createTime", null, "createTime ASC");
    GMTrace.o(13217761853440L, 98480);
    return paramString;
  }
  
  public final au BZ(String paramString)
  {
    GMTrace.i(13218969812992L, 98489);
    au localau = new au();
    paramString = this.goN.a(Ct(paramString), null, Ul(paramString), null, null, null, "msgSvrId  DESC limit 1 ", 2);
    if (paramString.moveToFirst()) {
      localau.b(paramString);
    }
    paramString.close();
    GMTrace.o(13218969812992L, 98489);
    return localau;
  }
  
  public final au C(String paramString, long paramLong)
  {
    GMTrace.i(13217493417984L, 98478);
    au localau = new au();
    paramString = this.goN.a(Ct(paramString), null, Ul(paramString) + " AND msgSeq=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (paramString.moveToFirst()) {
      localau.b(paramString);
    }
    paramString.close();
    GMTrace.o(13217493417984L, 98478);
    return localau;
  }
  
  public final long CA(String paramString)
  {
    GMTrace.i(20381767303168L, 151856);
    if (bg.nm(paramString))
    {
      GMTrace.o(20381767303168L, 151856);
      return 0L;
    }
    paramString = Up(paramString);
    if (paramString == null)
    {
      GMTrace.o(20381767303168L, 151856);
      return 0L;
    }
    long l = paramString.gGZ;
    GMTrace.o(20381767303168L, 151856);
    return l;
  }
  
  public final au Ca(String paramString)
  {
    GMTrace.i(13219104030720L, 98490);
    if (bg.nm(paramString))
    {
      GMTrace.o(13219104030720L, 98490);
      return null;
    }
    au localau = new au();
    paramString = "select * from " + Ct(paramString) + " where" + Ul(paramString) + "order by createTime DESC limit 1";
    paramString = this.goN.a(paramString, null, 2);
    if (paramString.moveToFirst()) {
      localau.b(paramString);
    }
    paramString.close();
    GMTrace.o(13219104030720L, 98490);
    return localau;
  }
  
  public final au Cb(String paramString)
  {
    GMTrace.i(13219372466176L, 98492);
    if (bg.nm(paramString))
    {
      GMTrace.o(13219372466176L, 98492);
      return null;
    }
    au localau = new au();
    paramString = "select * from " + Ct(paramString) + " where" + Ul(paramString) + "and isSend = 0" + "  order by createTime DESC limit 1";
    paramString = this.goN.a(paramString, null, 2);
    if (paramString.moveToFirst()) {
      localau.b(paramString);
    }
    paramString.close();
    GMTrace.o(13219372466176L, 98492);
    return localau;
  }
  
  public final au Cc(String paramString)
  {
    GMTrace.i(17856594968576L, 133042);
    if (this.vBM == null)
    {
      w.e("MicroMsg.MsgInfoStorage", "getLastMsg failed lstTable is null");
      GMTrace.o(17856594968576L, 133042);
      return null;
    }
    au localau = new au();
    if (bg.nm(paramString)) {}
    for (paramString = "";; paramString = paramString.replaceFirst("and", "where"))
    {
      long l1 = 0L;
      int i = 0;
      while (i < this.vBM.size())
      {
        long l2 = l1;
        if ((((c.b)this.vBM.get(i)).mUW & 0x8) != 0)
        {
          Object localObject = "select * from " + ((c.b)this.vBM.get(i)).name + paramString + "  order by createTime DESC limit 1";
          localObject = this.goN.a((String)localObject, null, 2);
          l2 = l1;
          if (((Cursor)localObject).moveToFirst())
          {
            long l3 = ((Cursor)localObject).getLong(((Cursor)localObject).getColumnIndex("createTime"));
            l2 = l1;
            if (l1 < l3)
            {
              localau.b((Cursor)localObject);
              l2 = l3;
            }
          }
          ((Cursor)localObject).close();
        }
        i += 1;
        l1 = l2;
      }
    }
    GMTrace.o(17856594968576L, 133042);
    return localau;
  }
  
  public final List<au> Cd(String paramString)
  {
    au localau = null;
    GMTrace.i(13221117296640L, 98505);
    Cursor localCursor = this.goN.a("select * from " + paramString, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(13221117296640L, 98505);
      return null;
    }
    paramString = localau;
    if (localCursor.moveToFirst())
    {
      paramString = new ArrayList();
      do
      {
        localau = new au();
        localau.b(localCursor);
        paramString.add(localau);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    GMTrace.o(13221117296640L, 98505);
    return paramString;
  }
  
  public final Cursor Ce(String paramString)
  {
    GMTrace.i(13221519949824L, 98508);
    long l = System.currentTimeMillis();
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      GMTrace.o(13221519949824L, 98508);
      return null;
    }
    Object localObject = Ct(paramString);
    paramString = "select * from " + (String)localObject + " " + Uo((String)localObject) + " where" + Ul(paramString) + "AND type IN (3,39,13,43,62,44,49,268435505)  order by " + "createTime";
    localObject = this.goN.a(paramString, null, 0);
    w.d("MicroMsg.MsgInfoStorage", "all time: %d, sql: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramString });
    GMTrace.o(13221519949824L, 98508);
    return (Cursor)localObject;
  }
  
  public final void Cf(String paramString)
  {
    GMTrace.i(13221922603008L, 98511);
    b(paramString, "", null);
    if (this.goN.eZ(paramString, "delete from " + paramString))
    {
      SS("delete_all " + paramString);
      GMTrace.o(13221922603008L, 98511);
      return;
    }
    d.oqe.a(111L, 247L, 1L, false);
    GMTrace.o(13221922603008L, 98511);
  }
  
  public final int Cg(String paramString)
  {
    GMTrace.i(13222191038464L, 98513);
    w.w("MicroMsg.MsgInfoStorage", "deleteByTalker :%s  stack:%s", new Object[] { paramString, com.tencent.mm.sdk.platformtools.ah.bQl() });
    b(Ct(paramString), Ul(paramString), null);
    int i = this.goN.delete(Ct(paramString), Ul(paramString), null);
    if (i != 0)
    {
      SS("delete_talker " + paramString);
      paramString = new c.c(paramString, "delete", i);
      paramString.mVe = -1L;
      a(paramString);
    }
    GMTrace.o(13222191038464L, 98513);
    return i;
  }
  
  public final boolean Ch(String paramString)
  {
    GMTrace.i(13222593691648L, 98516);
    w.w("MicroMsg.MsgInfoStorage", "deleteMessageEndByName nameTag:%s  stack:%s", new Object[] { paramString, com.tencent.mm.sdk.platformtools.ah.bQl() });
    b(Ct(paramString), " talker like '%" + paramString + "'", null);
    boolean bool = this.goN.eZ(Ct(paramString), "delete from " + Ct(paramString) + " where talker like '%" + paramString + "'");
    if (bool) {
      doNotify();
    }
    GMTrace.o(13222593691648L, 98516);
    return bool;
  }
  
  public final int Ci(String paramString)
  {
    GMTrace.i(13223264780288L, 98521);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("status", Integer.valueOf(4));
    int i = this.goN.update(Ct(paramString), localContentValues, Ul(paramString) + "AND isSend=? AND status" + "!=? ", new String[] { paramString, "0", "4" });
    if (i != 0)
    {
      doNotify();
      a(new c.c(paramString, "update", null));
    }
    GMTrace.o(13223264780288L, 98521);
    return i;
  }
  
  public final Cursor Cj(String paramString)
  {
    GMTrace.i(13223533215744L, 98523);
    paramString = this.goN.query(Ct(paramString), null, Ul(paramString), null, null, null, "createTime ASC ");
    GMTrace.o(13223533215744L, 98523);
    return paramString;
  }
  
  public final Cursor Ck(String paramString)
  {
    GMTrace.i(13224204304384L, 98528);
    paramString = this.goN.query(Ct(paramString), null, "isSend=? AND" + Ul(paramString) + "AND status!=?", new String[] { "0", "4" }, null, null, null);
    GMTrace.o(13224204304384L, 98528);
    return paramString;
  }
  
  public final au.c Cl(String paramString)
  {
    GMTrace.i(13224606957568L, 98531);
    au.c localc2 = (au.c)this.vBN.get(Integer.valueOf(paramString.hashCode()));
    au.c localc1 = localc2;
    if (localc2 == null)
    {
      localc1 = au.c.Uj(paramString);
      this.vBN.m(Integer.valueOf(paramString.hashCode()), localc1);
    }
    GMTrace.o(13224606957568L, 98531);
    return localc1;
  }
  
  public final au.d Cm(String paramString)
  {
    GMTrace.i(13224741175296L, 98532);
    au.d locald2 = (au.d)this.vBO.get(Integer.valueOf(paramString.hashCode()));
    au.d locald1 = locald2;
    if (locald2 == null)
    {
      locald1 = au.d.Uk(paramString);
      this.vBO.m(Integer.valueOf(paramString.hashCode()), locald1);
    }
    GMTrace.o(13224741175296L, 98532);
    return locald1;
  }
  
  public final au.a Cn(String paramString)
  {
    GMTrace.i(13224875393024L, 98533);
    au.a locala1 = null;
    if ((!bg.nm(paramString)) && (this.vBP != null)) {
      locala1 = (au.a)this.vBP.get(Integer.valueOf(paramString.hashCode()));
    }
    for (;;)
    {
      au.a locala2 = locala1;
      if (locala1 == null)
      {
        locala1 = au.a.Uh(paramString);
        locala2 = locala1;
        if (this.vBP != null)
        {
          this.vBP.m(Integer.valueOf(bg.aq(paramString, "").hashCode()), locala1);
          locala2 = locala1;
        }
      }
      GMTrace.o(13224875393024L, 98533);
      return locala2;
      w.e("MicroMsg.MsgInfoStorage", "input text null ???? %B", new Object[] { Boolean.valueOf(bg.nm(paramString)) });
      w.e("MicroMsg.MsgInfoStorage", "[arthurdan.FriendContentCrash] Fatal error!!! cachesForFriend is null!");
    }
  }
  
  public final au.b Co(String paramString)
  {
    GMTrace.i(13225009610752L, 98534);
    au.b localb2 = (au.b)this.vBQ.get(Integer.valueOf(paramString.hashCode()));
    au.b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = au.b.Ui(paramString);
      this.vBQ.m(Integer.valueOf(paramString.hashCode()), localb1);
    }
    GMTrace.o(13225009610752L, 98534);
    return localb1;
  }
  
  public final int Cp(String paramString)
  {
    int i = 0;
    GMTrace.i(13225278046208L, 98536);
    if (Cq(paramString))
    {
      i = this.vBJ.Ue(paramString);
      if (i > 0)
      {
        w.i("MicroMsg.MsgInfoStorage", "getMsgCount conversationStorage.getMsgCountByUsername count:%d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(13225278046208L, 98536);
        return i;
      }
      w.i("MicroMsg.MsgInfoStorage", "getMsgCount contactMsgCount is 0 ,go normal %s", new Object[] { paramString });
    }
    while (!"appbrandmessage".equals(Ct(paramString)))
    {
      i = Cr(paramString);
      GMTrace.o(13225278046208L, 98536);
      return i;
    }
    paramString = "SELECT COUNT(*) FROM " + Ct(paramString) + " WHERE" + Ul(paramString);
    paramString = this.goN.a(paramString, null, 0);
    if (paramString.moveToLast()) {
      i = paramString.getInt(0);
    }
    paramString.close();
    GMTrace.o(13225278046208L, 98536);
    return i;
  }
  
  public final boolean Cq(String paramString)
  {
    GMTrace.i(13225412263936L, 98537);
    boolean bool = "message".equals(Ct(paramString));
    GMTrace.o(13225412263936L, 98537);
    return bool;
  }
  
  public final int Cr(String paramString)
  {
    GMTrace.i(13225546481664L, 98538);
    StringBuilder localStringBuilder = new StringBuilder("SELECT COUNT(*) FROM ").append(Ct(paramString)).append(" ");
    String str;
    if (this.vBI)
    {
      str = "INDEXED BY messageTalkerIdStatusIndex";
      paramString = str + " WHERE" + Ul(paramString);
      paramString = this.goN.a(paramString, null, 2);
      if (!paramString.moveToFirst()) {
        break label122;
      }
    }
    label122:
    for (int i = paramString.getInt(0);; i = 0)
    {
      paramString.close();
      GMTrace.o(13225546481664L, 98538);
      return i;
      str = "INDEXED BY messageTalkerStatusIndex";
      break;
    }
  }
  
  public final int Cs(String paramString)
  {
    int i = 0;
    GMTrace.i(13226217570304L, 98543);
    StringBuilder localStringBuilder = new StringBuilder("SELECT COUNT(*) FROM ");
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("username == null", bool);
      String str = Ur(paramString).name;
      paramString = new StringBuilder().append(str).append("  indexed by  ").append(str).append("TalkerTypeIndex ").toString() + " WHERE talker= '" + bg.nk(paramString) + "' AND type IN (3,39,13,43,62,44,268435505)";
      paramString = this.goN.a(paramString, null, 2);
      if (paramString.moveToFirst()) {
        i = paramString.getInt(0);
      }
      paramString.close();
      GMTrace.o(13226217570304L, 98543);
      return i;
    }
  }
  
  public final String Ct(String paramString)
  {
    GMTrace.i(13226888658944L, 98548);
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("username == null", bool);
      paramString = Ur(paramString).name;
      GMTrace.o(13226888658944L, 98548);
      return paramString;
    }
  }
  
  public final long Cu(String paramString)
  {
    GMTrace.i(13227559747584L, 98553);
    Object localObject = "select createTime from message where" + Ul(paramString) + "order by createTime LIMIT 1 OFFSET 0";
    w.d("MicroMsg.MsgInfoStorage", "get first message create time: " + (String)localObject);
    localObject = this.goN.a((String)localObject, null, 2);
    if (localObject == null)
    {
      w.e("MicroMsg.MsgInfoStorage", "get first message create time failed: " + paramString);
      GMTrace.o(13227559747584L, 98553);
      return -1L;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      long l = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      GMTrace.o(13227559747584L, 98553);
      return l;
    }
    ((Cursor)localObject).close();
    GMTrace.o(13227559747584L, 98553);
    return -1L;
  }
  
  public final long Cv(String paramString)
  {
    GMTrace.i(13227693965312L, 98554);
    Object localObject = "select createTime from message where" + Ul(paramString) + "order by createTime DESC LIMIT 1 ";
    w.d("MicroMsg.MsgInfoStorage", "get last message create time: " + (String)localObject);
    localObject = this.goN.a((String)localObject, null, 2);
    if (localObject == null)
    {
      w.e("MicroMsg.MsgInfoStorage", "get last message create time failed " + paramString);
      GMTrace.o(13227693965312L, 98554);
      return -1L;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      long l = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      GMTrace.o(13227693965312L, 98554);
      return l;
    }
    ((Cursor)localObject).close();
    GMTrace.o(13227693965312L, 98554);
    return -1L;
  }
  
  public final long Cw(String paramString)
  {
    GMTrace.i(13227828183040L, 98555);
    if (bg.nm(paramString))
    {
      GMTrace.o(13227828183040L, 98555);
      return 0L;
    }
    Object localObject = "select msgSeq from message where" + Ul(paramString) + "order by msgSeq DESC LIMIT 1 ";
    w.i("MicroMsg.MsgInfoStorage", "summerbadcr get last message msgseq: " + (String)localObject);
    localObject = this.goN.a((String)localObject, null, 2);
    if (localObject == null)
    {
      w.e("MicroMsg.MsgInfoStorage", "summerbadcr get last message msgseq failed " + paramString);
      GMTrace.o(13227828183040L, 98555);
      return 0L;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      long l = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      GMTrace.o(13227828183040L, 98555);
      return l;
    }
    ((Cursor)localObject).close();
    GMTrace.o(13227828183040L, 98555);
    return 0L;
  }
  
  public final au Cx(String paramString)
  {
    GMTrace.i(13228096618496L, 98557);
    if (bg.nm(paramString))
    {
      GMTrace.o(13228096618496L, 98557);
      return null;
    }
    w.i("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg talker[%s], onlyCache[%b]", new Object[] { paramString, Boolean.valueOf(false) });
    Object localObject1 = (Long)this.vBS.get(paramString);
    if ((localObject1 != null) && (((Long)localObject1).longValue() > 0L))
    {
      w.i("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg hit cache msgid[%d]", new Object[] { Long.valueOf(((Long)localObject1).longValue()) });
      localObject1 = cM(((Long)localObject1).longValue());
      if ((((ce)localObject1).field_flag & 0x1) != 0)
      {
        GMTrace.o(13228096618496L, 98557);
        return (au)localObject1;
      }
      this.vBS.remove(paramString);
      GMTrace.o(13228096618496L, 98557);
      return null;
    }
    w.i("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg not hit cache");
    localObject1 = new au();
    long l = System.currentTimeMillis();
    Object localObject2 = "SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND flag %2 = 1  ORDER BY msgSeq" + " DESC LIMIT 1 ";
    localObject2 = this.goN.a((String)localObject2, null, 2);
    w.d("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg take %dms, tid[%d]", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Long.valueOf(Thread.currentThread().getId()) });
    if (localObject2 == null)
    {
      w.e("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg failed " + paramString);
      GMTrace.o(13228096618496L, 98557);
      return (au)localObject1;
    }
    if (((Cursor)localObject2).moveToFirst()) {
      ((au)localObject1).b((Cursor)localObject2);
    }
    ((Cursor)localObject2).close();
    this.vBS.m(paramString, Long.valueOf(((ce)localObject1).field_msgId));
    GMTrace.o(13228096618496L, 98557);
    return (au)localObject1;
  }
  
  public final int Cy(String paramString)
  {
    GMTrace.i(13229170360320L, 98565);
    String str = " SELECT COUNT(*) FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND isSend=1";
    Cursor localCursor = this.goN.a(str, null, 2);
    for (;;)
    {
      try
      {
        if (!localCursor.moveToFirst()) {
          break label161;
        }
        i = localCursor.getInt(0);
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.MsgInfoStorage", localException, "", new Object[0]);
        localCursor.close();
        i = 0;
        continue;
      }
      finally
      {
        localCursor.close();
      }
      w.d("MicroMsg.MsgInfoStorage", "[getMsgCountBySelf] getCursor talk:%s,count:%s,[%s]", new Object[] { paramString, Integer.valueOf(i), str });
      GMTrace.o(13229170360320L, 98565);
      return i;
      label161:
      int i = 0;
    }
  }
  
  /* Error */
  public final List<au> Cz(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 1240
    //   3: ldc_w 1242
    //   6: invokestatic 61	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aconst_null
    //   10: astore_2
    //   11: new 577	java/util/ArrayList
    //   14: dup
    //   15: invokespecial 578	java/util/ArrayList:<init>	()V
    //   18: astore_3
    //   19: aload_0
    //   20: getfield 168	com/tencent/mm/storage/av:goN	Lcom/tencent/mm/bu/g;
    //   23: ldc 73
    //   25: aconst_null
    //   26: ldc_w 1244
    //   29: iconst_2
    //   30: anewarray 63	java/lang/String
    //   33: dup
    //   34: iconst_0
    //   35: aload_1
    //   36: invokestatic 294	com/tencent/mm/sdk/platformtools/bg:nk	(Ljava/lang/String;)Ljava/lang/String;
    //   39: aastore
    //   40: dup
    //   41: iconst_1
    //   42: invokestatic 562	java/lang/System:currentTimeMillis	()J
    //   45: ldc2_w 1245
    //   48: lsub
    //   49: invokestatic 793	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   52: aastore
    //   53: aconst_null
    //   54: aconst_null
    //   55: ldc_w 870
    //   58: iconst_2
    //   59: invokevirtual 796	com/tencent/mm/bu/g:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   62: astore_1
    //   63: aload_1
    //   64: astore_2
    //   65: aload_2
    //   66: astore_1
    //   67: aload_2
    //   68: invokeinterface 944 1 0
    //   73: ifeq +78 -> 151
    //   76: aload_2
    //   77: astore_1
    //   78: new 455	com/tencent/mm/storage/au
    //   81: dup
    //   82: invokespecial 789	com/tencent/mm/storage/au:<init>	()V
    //   85: astore 4
    //   87: aload_2
    //   88: astore_1
    //   89: aload 4
    //   91: aload_2
    //   92: invokevirtual 799	com/tencent/mm/storage/au:b	(Landroid/database/Cursor;)V
    //   95: aload_2
    //   96: astore_1
    //   97: aload_3
    //   98: aload 4
    //   100: invokevirtual 1247	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   103: pop
    //   104: goto -39 -> 65
    //   107: astore_3
    //   108: aload_2
    //   109: astore_1
    //   110: ldc -49
    //   112: aload_3
    //   113: ldc_w 1249
    //   116: iconst_1
    //   117: anewarray 211	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_3
    //   123: invokevirtual 378	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   126: aastore
    //   127: invokestatic 1238	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: aload_2
    //   131: ifnull +9 -> 140
    //   134: aload_2
    //   135: invokeinterface 548 1 0
    //   140: ldc2_w 1240
    //   143: ldc_w 1242
    //   146: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   149: aconst_null
    //   150: areturn
    //   151: aload_2
    //   152: ifnull +9 -> 161
    //   155: aload_2
    //   156: invokeinterface 548 1 0
    //   161: ldc2_w 1240
    //   164: ldc_w 1242
    //   167: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   170: aload_3
    //   171: areturn
    //   172: astore_1
    //   173: aload_2
    //   174: ifnull +9 -> 183
    //   177: aload_2
    //   178: invokeinterface 548 1 0
    //   183: aload_1
    //   184: athrow
    //   185: astore_3
    //   186: aload_1
    //   187: astore_2
    //   188: aload_3
    //   189: astore_1
    //   190: goto -17 -> 173
    //   193: astore_3
    //   194: aconst_null
    //   195: astore_2
    //   196: goto -88 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	this	av
    //   0	199	1	paramString	String
    //   10	186	2	str	String
    //   18	80	3	localArrayList	ArrayList
    //   107	64	3	localException1	Exception
    //   185	4	3	localObject	Object
    //   193	1	3	localException2	Exception
    //   85	14	4	localau	au
    // Exception table:
    //   from	to	target	type
    //   67	76	107	java/lang/Exception
    //   78	87	107	java/lang/Exception
    //   89	95	107	java/lang/Exception
    //   97	104	107	java/lang/Exception
    //   11	63	172	finally
    //   67	76	185	finally
    //   78	87	185	finally
    //   89	95	185	finally
    //   97	104	185	finally
    //   110	130	185	finally
    //   11	63	193	java/lang/Exception
  }
  
  public final au D(String paramString, long paramLong)
  {
    GMTrace.i(13217627635712L, 98479);
    au localau = new au();
    paramString = this.goN.a(Ct(paramString), null, "createTime=? AND" + Ul(paramString), new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (paramString.moveToFirst()) {
      localau.b(paramString);
    }
    paramString.close();
    GMTrace.o(13217627635712L, 98479);
    return localau;
  }
  
  public final List<au> E(String paramString, long paramLong)
  {
    GMTrace.i(13217896071168L, 98481);
    ArrayList localArrayList = new ArrayList();
    paramString = "Select * From " + Ct(paramString) + " Where " + Ul(paramString) + " AND createTime < ? and not ( type = 10000 and isSend != 2 ) " + " Order By createTime Desc Limit 11";
    paramString = this.goN.a(paramString, new String[] { String.valueOf(paramLong) }, 2);
    while (paramString.moveToNext())
    {
      au localau = new au();
      localau.b(paramString);
      localArrayList.add(localau);
    }
    paramString.close();
    GMTrace.o(13217896071168L, 98481);
    return localArrayList;
  }
  
  public final List<au> F(String paramString, long paramLong)
  {
    GMTrace.i(13218030288896L, 98482);
    ArrayList localArrayList = new ArrayList();
    paramString = "Select * From " + Ct(paramString) + " Where " + Ul(paramString) + " AND createTime > ? and not ( type = 10000 and isSend != 2 ) " + " Order By createTime Desc Limit 11" + ";";
    paramString = this.goN.a(paramString, new String[] { String.valueOf(paramLong) }, 2);
    while (paramString.moveToNext())
    {
      au localau = new au();
      localau.b(paramString);
      localArrayList.add(localau);
    }
    paramString.close();
    GMTrace.o(13218030288896L, 98482);
    return localArrayList;
  }
  
  public final boolean G(String paramString, long paramLong)
  {
    GMTrace.i(13218701377536L, 98487);
    if (D(paramString, paramLong).field_msgId > 0L)
    {
      GMTrace.o(13218701377536L, 98487);
      return true;
    }
    GMTrace.o(13218701377536L, 98487);
    return false;
  }
  
  public final long H(String paramString, long paramLong)
  {
    GMTrace.i(13221251514368L, 98506);
    paramString = "select createTime from " + Ct(paramString) + " where msgId = " + paramLong;
    paramLong = 0L;
    paramString = this.goN.a(paramString, null, 2);
    if (paramString.moveToFirst()) {
      paramLong = paramString.getLong(0);
    }
    paramString.close();
    GMTrace.o(13221251514368L, 98506);
    return paramLong;
  }
  
  public final int I(String paramString, long paramLong)
  {
    GMTrace.i(13222056820736L, 98512);
    au localau = B(paramString, paramLong);
    this.vBT.e((int)(bg.Pu() / 86400L), localau.field_msgSvrId, localau.field_createTime / 1000L);
    int i = this.goN.delete(Ct(paramString), "msgSvrId=?", new String[] { String.valueOf(paramLong) });
    if (i != 0)
    {
      doNotify();
      a(new c.c(paramString, "delete", 1));
    }
    for (;;)
    {
      GMTrace.o(13222056820736L, 98512);
      return i;
      d.oqe.a(111L, 246L, 1L, false);
    }
  }
  
  public final List<au> I(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(13220311990272L, 98499);
    ArrayList localArrayList = new ArrayList();
    paramString = "SELECT * FROM " + Ct(paramString) + " WHERE type = 49 ORDER BY createTime" + " DESC LIMIT " + paramInt1 + " , " + paramInt2;
    w.d("MicroMsg.MsgInfoStorage", "getAppMsgTypeList sql=%s", new Object[] { paramString });
    paramString = this.goN.a(paramString, null, 2);
    while (paramString.moveToNext())
    {
      au localau = new au();
      localau.b(paramString);
      if (localau.aCp()) {
        localArrayList.add(localau);
      }
    }
    paramString.close();
    GMTrace.o(13220311990272L, 98499);
    return localArrayList;
  }
  
  public final int J(String paramString, long paramLong)
  {
    GMTrace.i(13222325256192L, 98514);
    String str = Ul(paramString) + " and createTime <= " + paramLong;
    b(Ct(paramString), str, null);
    int i = this.goN.delete(Ct(paramString), str, null);
    if (i != 0)
    {
      SS("delete_talker " + paramString);
      paramString = new c.c(paramString, "delete", i);
      paramString.mVe = -1L;
      a(paramString);
    }
    GMTrace.o(13222325256192L, 98514);
    return i;
  }
  
  public final Cursor J(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(15229282942976L, 113467);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      GMTrace.o(15229282942976L, 113467);
      return null;
    }
    String str = Ct(paramString);
    paramString = "select * from ( select * from " + str + " where" + Ul(paramString) + " AND type IN (3,39,13,43,62,44,268435505)  order by " + "createTime DESC limit " + paramInt2 + " OFFSET " + paramInt1 + ") order by createTime ASC ";
    paramString = this.goN.a(paramString, null, 2);
    GMTrace.o(15229282942976L, 113467);
    return paramString;
  }
  
  public final void J(ArrayList<Long> paramArrayList)
  {
    GMTrace.i(13218567159808L, 98486);
    long l1 = this.goN.cE(-1L);
    try
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        long l2 = ((Long)paramArrayList.next()).longValue();
        au localau = cM(l2);
        localau.dM(localau.fwu | 0x20);
        w.d("MicroMsg.MsgInfoStorage", "msgId:%d, setOmitFailResend", new Object[] { Long.valueOf(l2) });
        a(l2, localau);
      }
    }
    finally
    {
      this.goN.aL(l1);
    }
    GMTrace.o(13218567159808L, 98486);
  }
  
  public final int K(String paramString, long paramLong)
  {
    int i = 0;
    GMTrace.i(13226351788032L, 98544);
    au localau = cM(paramLong);
    if (localau.field_msgId == 0L)
    {
      w.e("MicroMsg.MsgInfoStorage", "getCountEarlyThan fail, msg does not exist");
      GMTrace.o(13226351788032L, 98544);
      return 0;
    }
    String str = Ct(paramString);
    paramString = "SELECT COUNT(*) FROM " + str + " " + Uo(str) + " WHERE " + Ul(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND " + "createTime < " + localau.field_createTime;
    paramString = this.goN.a(paramString, null, 2);
    if (paramString.moveToFirst()) {
      i = paramString.getInt(0);
    }
    paramString.close();
    GMTrace.o(13226351788032L, 98544);
    return i;
  }
  
  public final String L(String paramString, long paramLong)
  {
    int i = 0;
    GMTrace.i(13226486005760L, 98545);
    Object localObject1 = cM(paramLong);
    if (((ce)localObject1).field_msgId == 0L)
    {
      w.e("MicroMsg.MsgInfoStorage", "getCountEarlyThan fail, msg does not exist");
      GMTrace.o(13226486005760L, 98545);
      return null;
    }
    Object localObject2 = Ct(paramString);
    paramString = "EXPLAIN QUERY PLAN SELECT COUNT(*) FROM " + (String)localObject2 + " " + Uo((String)localObject2) + " WHERE" + Ul(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND " + "createTime < " + ((ce)localObject1).field_createTime;
    localObject2 = this.goN.a(paramString, null, 0);
    paramString = "";
    localObject1 = paramString;
    if (((Cursor)localObject2).moveToFirst()) {
      for (;;)
      {
        localObject1 = paramString;
        if (i >= ((Cursor)localObject2).getColumnCount()) {
          break;
        }
        paramString = paramString + ((Cursor)localObject2).getString(i) + " ";
        i += 1;
      }
    }
    ((Cursor)localObject2).close();
    GMTrace.o(13226486005760L, 98545);
    return (String)localObject1;
  }
  
  public final au M(String paramString, long paramLong)
  {
    GMTrace.i(13227962400768L, 98556);
    if (bg.nm(paramString))
    {
      GMTrace.o(13227962400768L, 98556);
      return null;
    }
    Object localObject = "select * from message where" + Ul(paramString) + " and msgSeq > " + paramLong + " order by msgSeq ASC LIMIT 1 ";
    w.i("MicroMsg.MsgInfoStorage", "summerbadcr getNewerMsgByMsgSeq: " + (String)localObject);
    localObject = this.goN.a((String)localObject, null, 0);
    if (localObject == null)
    {
      w.e("MicroMsg.MsgInfoStorage", "summerbadcr getNewerMsgByMsgSeq failed " + paramString);
      GMTrace.o(13227962400768L, 98556);
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      paramString = new au();
      paramString.b((Cursor)localObject);
      GMTrace.o(13227962400768L, 98556);
      return paramString;
    }
    ((Cursor)localObject).close();
    GMTrace.o(13227962400768L, 98556);
    return null;
  }
  
  public final long N(String paramString, long paramLong)
  {
    GMTrace.i(13229304578048L, 98566);
    w.d("MicroMsg.MsgInfoStorage", "get up inc create time, talker %s, fromCreateTime %d, targetIncCount %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(18) });
    paramString = "SELECT createTime FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND createTime < " + paramLong + " ORDER BY createTime DESC  LIMIT 18";
    w.d("MicroMsg.MsgInfoStorage", "get up inc msg create time sql: %s", new Object[] { paramString });
    paramString = this.goN.a(paramString, null, 0);
    if (paramString == null)
    {
      w.w("MicroMsg.MsgInfoStorage", "get inc msg create time error, cursor is null");
      GMTrace.o(13229304578048L, 98566);
      return paramLong;
    }
    if (paramString.moveToLast())
    {
      paramLong = paramString.getLong(0);
      w.d("MicroMsg.MsgInfoStorage", "result msg create time %d", new Object[] { Long.valueOf(paramLong) });
      paramString.close();
      GMTrace.o(13229304578048L, 98566);
      return paramLong;
    }
    paramString.close();
    w.w("MicroMsg.MsgInfoStorage", "get result fail");
    GMTrace.o(13229304578048L, 98566);
    return paramLong;
  }
  
  public final int O(au paramau)
  {
    int i = 0;
    GMTrace.i(13220446208000L, 98500);
    if ((paramau == null) || (bg.nm(paramau.field_talker)))
    {
      GMTrace.o(13220446208000L, 98500);
      return 0;
    }
    paramau = "SELECT count(msgId) FROM " + Ct(paramau.field_talker) + " WHERE" + Ul(paramau.field_talker) + "AND isSend = 0" + " AND msgId >= " + paramau.field_msgId + " ORDER BY createTime DESC";
    paramau = this.goN.a(paramau, null, 2);
    if (paramau.moveToFirst()) {
      i = paramau.getInt(0);
    }
    paramau.close();
    GMTrace.o(13220446208000L, 98500);
    return i;
  }
  
  public final long O(String paramString, long paramLong)
  {
    GMTrace.i(13229573013504L, 98568);
    w.d("MicroMsg.MsgInfoStorage", "get down inc create time, talker %s, fromCreateTime %d, targetIncCount %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(18) });
    paramString = "SELECT createTime FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND createTime > " + paramLong + " ORDER BY createTime ASC  LIMIT 18";
    w.d("MicroMsg.MsgInfoStorage", "get down inc msg create time sql: %s", new Object[] { paramString });
    paramString = this.goN.a(paramString, null, 0);
    if (paramString == null)
    {
      w.w("MicroMsg.MsgInfoStorage", "get down inc msg create time error, cursor is null");
      GMTrace.o(13229573013504L, 98568);
      return paramLong;
    }
    if (paramString.moveToLast())
    {
      paramLong = paramString.getLong(0);
      w.d("MicroMsg.MsgInfoStorage", "result msg create time %d", new Object[] { Long.valueOf(paramLong) });
      paramString.close();
      GMTrace.o(13229573013504L, 98568);
      return paramLong;
    }
    paramString.close();
    w.w("MicroMsg.MsgInfoStorage", "get result fail");
    GMTrace.o(13229573013504L, 98568);
    return paramLong;
  }
  
  public final long P(au paramau)
  {
    GMTrace.i(13220848861184L, 98503);
    long l = c(paramau, false);
    GMTrace.o(13220848861184L, 98503);
    return l;
  }
  
  public final void Q(au paramau)
  {
    GMTrace.i(13222996344832L, 98519);
    if ((paramau == null) || (paramau.field_status == 4))
    {
      GMTrace.o(13222996344832L, 98519);
      return;
    }
    paramau.dB(4);
    String str = eT(paramau.field_msgId);
    if ((str != null) && (str.length() > 0)) {
      if (this.goN.update(str, paramau.qL(), "msgId=?", new String[] { paramau.field_msgId }) != 0)
      {
        doNotify();
        a(new c.c(paramau.field_talker, "update", paramau, -1));
      }
    }
    GMTrace.o(13222996344832L, 98519);
  }
  
  public final int R(au paramau)
  {
    int i = 0;
    GMTrace.i(13223398998016L, 98522);
    if (paramau != null)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("content", paramau.field_content);
      localContentValues.put("status", Integer.valueOf(paramau.field_status));
      int j = this.goN.update(eT(paramau.field_msgId), localContentValues, "msgId=?", new String[] { String.valueOf(paramau.field_msgId) });
      i = j;
      if (j != 0)
      {
        doNotify();
        a(new c.c(paramau.field_talker, "update", paramau));
        i = j;
      }
    }
    GMTrace.o(13223398998016L, 98522);
    return i;
  }
  
  public final Cursor a(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(13228499271680L, 98560);
    if (paramLong2 == 0L)
    {
      paramString = "SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND createTime > " + paramLong1 + " ORDER BY createTime ASC  LIMIT 50" + " OFFSET " + paramInt;
      w.d("MicroMsg.MsgInfoStorage", "get cursor: " + paramString);
      paramString = this.goN.a(paramString, null, 0);
      GMTrace.o(13228499271680L, 98560);
      return paramString;
    }
    long l;
    if (paramLong2 < paramLong1)
    {
      l = paramLong2;
      paramLong2 = paramLong1;
    }
    for (;;)
    {
      paramString = "SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND createTime > " + l + " AND createTime < " + paramLong2 + " ORDER BY createTime ASC  LIMIT 50" + " OFFSET " + paramInt;
      w.d("MicroMsg.MsgInfoStorage", "get cursor: " + paramString);
      paramString = this.goN.a(paramString, null, 0);
      GMTrace.o(13228499271680L, 98560);
      return paramString;
      l = paramLong1;
    }
  }
  
  public final Cursor a(String paramString, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    GMTrace.i(17856997621760L, 133045);
    long l;
    if (paramLong2 < paramLong1)
    {
      l = paramLong2;
      paramLong2 = paramLong1;
    }
    for (;;)
    {
      paramString = new StringBuilder("SELECT * FROM ").append(Ct(paramString)).append(" WHERE").append(Ul(paramString)).append("AND createTime >= ").append(l).append(" AND createTime <= ").append(paramLong2).append(" AND isSend=");
      if (paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        paramString = i + " LIMIT 1";
        w.d("MicroMsg.MsgInfoStorage", "get cursor: " + paramString);
        paramString = this.goN.a(paramString, null, 0);
        GMTrace.o(17856997621760L, 133045);
        return paramString;
      }
      l = paramLong1;
    }
  }
  
  public final void a(long paramLong, au paramau)
  {
    GMTrace.i(13222862127104L, 98518);
    if (paramau.bTA())
    {
      String str = Un(paramau.fwv);
      if (s.gi(str))
      {
        w.d("MicroMsg.MsgInfoStorage", "msgCluster = %s", new Object[] { str });
        paramau.db("notifymessage");
      }
    }
    ae(paramau);
    if (this.goN.update(eT(paramLong), paramau.qL(), "msgId=?", new String[] { String.valueOf(paramLong) }) != 0)
    {
      doNotify();
      a(new c.c(paramau.field_talker, "update", paramau));
      GMTrace.o(13222862127104L, 98518);
      return;
    }
    d.oqe.a(111L, 244L, 1L, false);
    GMTrace.o(13222862127104L, 98518);
  }
  
  public final void a(g paramg, String paramString)
  {
    GMTrace.i(13216017022976L, 98467);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    Cursor localCursor = paramg.a("PRAGMA table_info( " + paramString + " )", null, 2);
    int i5 = localCursor.getColumnIndex("name");
    while (localCursor.moveToNext()) {
      if (i5 >= 0)
      {
        String str = localCursor.getString(i5);
        if ("lvbuffer".equalsIgnoreCase(str)) {
          i = 1;
        } else if ("transContent".equalsIgnoreCase(str)) {
          j = 1;
        } else if ("transBrandWording".equalsIgnoreCase(str)) {
          k = 1;
        } else if ("talkerId".equalsIgnoreCase(str)) {
          m = 1;
        } else if ("bizClientMsgId".equalsIgnoreCase(str)) {
          n = 1;
        } else if ("bizChatId".equalsIgnoreCase(str)) {
          i1 = 1;
        } else if ("bizChatUserId".equalsIgnoreCase(str)) {
          i2 = 1;
        } else if ("msgSeq".equalsIgnoreCase(str)) {
          i3 = 1;
        } else if ("flag".equalsIgnoreCase(str)) {
          i4 = 1;
        }
      }
    }
    localCursor.close();
    long l = paramg.cE(Thread.currentThread().getId());
    if (i == 0) {
      paramg.eZ(paramString, "Alter table " + paramString + " add lvbuffer BLOB ");
    }
    if (j == 0) {
      paramg.eZ(paramString, "Alter table " + paramString + " add transContent TEXT ");
    }
    if (k == 0) {
      paramg.eZ(paramString, "Alter table " + paramString + " add transBrandWording TEXT ");
    }
    if (m == 0) {
      paramg.eZ(paramString, "Alter table " + paramString + " add talkerId INTEGER ");
    }
    if (n == 0) {
      paramg.eZ(paramString, "Alter table " + paramString + " add bizClientMsgId TEXT ");
    }
    if (i1 == 0) {
      paramg.eZ(paramString, "Alter table " + paramString + " add bizChatId INTEGER DEFAULT -1");
    }
    if (i2 == 0) {
      paramg.eZ(paramString, "Alter table " + paramString + " add bizChatUserId TEXT ");
    }
    if (i3 == 0) {
      paramg.eZ(paramString, "Alter table " + paramString + " add msgSeq INTEGER ");
    }
    if (i4 == 0) {
      paramg.eZ(paramString, "Alter table " + paramString + " add flag INT DEFAULT 0 ");
    }
    paramg.aL(l);
    GMTrace.o(13216017022976L, 98467);
  }
  
  public final void a(c.a parama)
  {
    GMTrace.i(13215345934336L, 98462);
    this.vBU.remove(parama);
    GMTrace.o(13215345934336L, 98462);
  }
  
  public final void a(c.a parama, Looper paramLooper)
  {
    GMTrace.i(13215211716608L, 98461);
    this.vBU.a(parama, paramLooper);
    GMTrace.o(13215211716608L, 98461);
  }
  
  public final void a(c.b paramb)
  {
    GMTrace.i(13216688111616L, 98472);
    this.vBM.add(paramb);
    b(paramb);
    GMTrace.o(13216688111616L, 98472);
  }
  
  public final void a(c.c paramc)
  {
    GMTrace.i(13215077498880L, 98460);
    if (this.vBU.bI(paramc)) {
      this.vBU.doNotify();
    }
    GMTrace.o(13215077498880L, 98460);
  }
  
  public final void a(e parame)
  {
    GMTrace.i(13214809063424L, 98458);
    if (!this.vBL.contains(parame)) {
      this.vBL.add(parame);
    }
    GMTrace.o(13214809063424L, 98458);
  }
  
  public final boolean a(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(13229438795776L, 98567);
    paramString1 = "UPDATE " + Uq(paramString1) + " SET transContent = '" + bg.nk(paramString2) + "', transBrandWording = '" + bg.nk(bg.nl(paramString3)) + "' WHERE msgId = " + paramLong;
    boolean bool = this.goN.eZ(null, paramString1);
    GMTrace.o(13229438795776L, 98567);
    return bool;
  }
  
  public final g aOi()
  {
    GMTrace.i(13214943281152L, 98459);
    g localg = this.goN;
    GMTrace.o(13214943281152L, 98459);
    return localg;
  }
  
  public final void aOj()
  {
    GMTrace.i(13216419676160L, 98470);
    h.xz();
    h.xy().xh().set(348167, Integer.valueOf(1));
    GMTrace.o(13216419676160L, 98470);
  }
  
  public final void aOk()
  {
    GMTrace.i(13216822329344L, 98473);
    int i = 0;
    while (i < this.vBM.size())
    {
      b((c.b)this.vBM.get(i));
      i += 1;
    }
    GMTrace.o(13216822329344L, 98473);
  }
  
  public final void aOl()
  {
    GMTrace.i(13217090764800L, 98475);
    if (!this.vBI)
    {
      GMTrace.o(13217090764800L, 98475);
      return;
    }
    Object localObject = "select count(*) from " + "message" + " where talkerId ISNULL ";
    localObject = this.goN.a((String)localObject, null, 2);
    if (localObject != null) {
      if (!((Cursor)localObject).moveToFirst()) {
        break label309;
      }
    }
    label309:
    for (int i = ((Cursor)localObject).getInt(0);; i = 0)
    {
      ((Cursor)localObject).close();
      if (i > 0)
      {
        w.i("MicroMsg.MsgInfoStorage", " msg table exists null talkerid ,start translate tableName %s ", new Object[] { "message" });
        long l = System.currentTimeMillis();
        localObject = "update " + "message" + " set talkerId=(select rowid from rcontact" + " where rcontact.username" + " = " + "message" + ".talker)";
        boolean bool = this.goN.eZ("message", (String)localObject);
        w.i("MicroMsg.MsgInfoStorage", "update result :%b last %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.currentTimeMillis() - l) });
        if ((bool) && (this.vBI))
        {
          this.goN.eZ("message", "DROP INDEX messageCreateTaklerTypeTimeIndex IF EXISTS");
          this.goN.eZ("message", "DROP INDEX messageTalkerStatusIndex IF EXISTS");
          this.goN.eZ("message", "DROP INDEX messageTalkerCreateTimeIsSendIndex IF EXISTS");
          this.goN.eZ("message", "DROP INDEX messageCreateTaklerTimeIndex IF EXISTS");
          this.goN.eZ("message", "DROP INDEX messageTalkerSvrIdIndex IF EXISTS");
          w.i("MicroMsg.MsgInfoStorage", "clear talker Name index");
        }
      }
      GMTrace.o(13217090764800L, 98475);
      return;
    }
  }
  
  public final ArrayList<au> aOm()
  {
    GMTrace.i(13218432942080L, 98485);
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.goN.a("message", null, "createTime>=? AND status=? AND isSend=?", new String[] { String.valueOf(System.currentTimeMillis() - 172800000L), "5", "1" }, null, null, "createTime ASC", 2);
    label152:
    while (localCursor.moveToNext())
    {
      au localau = new au();
      localau.b(localCursor);
      if (!localau.bTR()) {}
      for (int i = 1;; i = 0)
      {
        if (((i & 0x1) == 0) || (x.To(localau.field_talker)) || (x.Tq(localau.field_talker)) || (x.fw(localau.field_talker))) {
          break label152;
        }
        localArrayList.add(localau);
        break;
      }
    }
    localCursor.close();
    GMTrace.o(13218432942080L, 98485);
    return localArrayList;
  }
  
  public final List<au> aOn()
  {
    GMTrace.i(13220043554816L, 98497);
    ArrayList localArrayList = new ArrayList();
    boolean bool;
    Object localObject1;
    int i;
    if (this.vBM != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localObject1 = new ArrayList();
      i = 0;
    }
    Object localObject2;
    for (;;)
    {
      if (i >= this.vBM.size()) {
        break label210;
      }
      localObject2 = this.goN.a(((c.b)this.vBM.get(i)).name, null, "status=1 and isSend=1", null, null, null, "createTime DESC ", 2);
      for (;;)
      {
        if (!((Cursor)localObject2).moveToNext()) {
          break label196;
        }
        au localau = new au();
        localau.b((Cursor)localObject2);
        if ((localau.bTF()) || (localau.bTD()) || (localau.bTE()) || (localau.bTM()))
        {
          if (bc.Bg() - localau.field_createTime > 600000L)
          {
            ((List)localObject1).add(localau);
            continue;
            bool = false;
            break;
          }
          localArrayList.add(localau);
        }
      }
      label196:
      ((Cursor)localObject2).close();
      i += 1;
    }
    label210:
    if (((List)localObject1).size() > 0)
    {
      long l = this.goN.cE(-1L);
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (au)((Iterator)localObject1).next();
        w.i("MicroMsg.MsgInfoStorage", "Set msg timtout : id:%d time:%d talker:%s content:%s", new Object[] { Long.valueOf(((ce)localObject2).field_msgId), Long.valueOf(((ce)localObject2).field_createTime), ((ce)localObject2).field_talker, bg.SJ(((ce)localObject2).field_content) });
        ((au)localObject2).dB(5);
        a(((ce)localObject2).field_msgId, (au)localObject2);
      }
      this.goN.aL(l);
    }
    GMTrace.o(13220043554816L, 98497);
    return localArrayList;
  }
  
  public final Cursor aOo()
  {
    GMTrace.i(13224472739840L, 98530);
    Cursor localCursor = this.goN.query("message", new String[] { "talker", "count(*) as unReadCount" }, "isSend=? AND status!=?", new String[] { "0", "4" }, "talker", null, null);
    GMTrace.o(13224472739840L, 98530);
    return localCursor;
  }
  
  public final Cursor aOp()
  {
    GMTrace.i(13225143828480L, 98535);
    if (this.vBM.size() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      Cursor localCursor = this.goN.query(((c.b)this.vBM.get(0)).name, null, "msgId=?", new String[] { "-1" }, null, null, null);
      GMTrace.o(13225143828480L, 98535);
      return localCursor;
    }
  }
  
  public final String aOq()
  {
    GMTrace.i(15660390285312L, 116679);
    GMTrace.o(15660390285312L, 116679);
    return "type IN (3,39,13,43,62,44,268435505)";
  }
  
  public final String aOr()
  {
    GMTrace.i(15660524503040L, 116680);
    GMTrace.o(15660524503040L, 116680);
    return "type IN (3,39,13,43,62,44,49,268435505)";
  }
  
  /* Error */
  public final List<au> aOs()
  {
    // Byte code:
    //   0: ldc2_w 1753
    //   3: ldc_w 1755
    //   6: invokestatic 61	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 577	java/util/ArrayList
    //   12: dup
    //   13: invokespecial 578	java/util/ArrayList:<init>	()V
    //   16: astore_3
    //   17: aload_0
    //   18: getfield 168	com/tencent/mm/storage/av:goN	Lcom/tencent/mm/bu/g;
    //   21: ldc 73
    //   23: aconst_null
    //   24: ldc_w 1757
    //   27: iconst_1
    //   28: anewarray 63	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: invokestatic 562	java/lang/System:currentTimeMillis	()J
    //   36: ldc2_w 1245
    //   39: lsub
    //   40: invokestatic 793	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   43: aastore
    //   44: aconst_null
    //   45: aconst_null
    //   46: ldc_w 870
    //   49: iconst_2
    //   50: invokevirtual 796	com/tencent/mm/bu/g:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   53: astore_2
    //   54: aload_2
    //   55: astore_1
    //   56: aload_2
    //   57: invokeinterface 944 1 0
    //   62: ifeq +78 -> 140
    //   65: aload_2
    //   66: astore_1
    //   67: new 455	com/tencent/mm/storage/au
    //   70: dup
    //   71: invokespecial 789	com/tencent/mm/storage/au:<init>	()V
    //   74: astore 4
    //   76: aload_2
    //   77: astore_1
    //   78: aload 4
    //   80: aload_2
    //   81: invokevirtual 799	com/tencent/mm/storage/au:b	(Landroid/database/Cursor;)V
    //   84: aload_2
    //   85: astore_1
    //   86: aload_3
    //   87: aload 4
    //   89: invokevirtual 1247	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   92: pop
    //   93: goto -39 -> 54
    //   96: astore_3
    //   97: aload_2
    //   98: astore_1
    //   99: ldc -49
    //   101: aload_3
    //   102: ldc_w 1249
    //   105: iconst_1
    //   106: anewarray 211	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: aload_3
    //   112: invokevirtual 378	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   115: aastore
    //   116: invokestatic 1238	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: aload_2
    //   120: ifnull +9 -> 129
    //   123: aload_2
    //   124: invokeinterface 548 1 0
    //   129: ldc2_w 1753
    //   132: ldc_w 1755
    //   135: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   138: aconst_null
    //   139: areturn
    //   140: aload_2
    //   141: ifnull +9 -> 150
    //   144: aload_2
    //   145: invokeinterface 548 1 0
    //   150: ldc2_w 1753
    //   153: ldc_w 1755
    //   156: invokestatic 108	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   159: aload_3
    //   160: areturn
    //   161: astore_2
    //   162: aconst_null
    //   163: astore_1
    //   164: aload_1
    //   165: ifnull +9 -> 174
    //   168: aload_1
    //   169: invokeinterface 548 1 0
    //   174: aload_2
    //   175: athrow
    //   176: astore_2
    //   177: goto -13 -> 164
    //   180: astore_3
    //   181: aconst_null
    //   182: astore_2
    //   183: goto -86 -> 97
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	this	av
    //   55	114	1	localCursor1	Cursor
    //   53	92	2	localCursor2	Cursor
    //   161	14	2	localObject1	Object
    //   176	1	2	localObject2	Object
    //   182	1	2	localObject3	Object
    //   16	71	3	localArrayList	ArrayList
    //   96	64	3	localException1	Exception
    //   180	1	3	localException2	Exception
    //   74	14	4	localau	au
    // Exception table:
    //   from	to	target	type
    //   56	65	96	java/lang/Exception
    //   67	76	96	java/lang/Exception
    //   78	84	96	java/lang/Exception
    //   86	93	96	java/lang/Exception
    //   9	54	161	finally
    //   56	65	176	finally
    //   67	76	176	finally
    //   78	84	176	finally
    //   86	93	176	finally
    //   99	119	176	finally
    //   9	54	180	java/lang/Exception
  }
  
  public final void b(long paramLong, au paramau)
  {
    GMTrace.i(13223130562560L, 98520);
    if (bg.nl(paramau.field_talker).length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("no talker set when update by svrid", bool);
      if (paramau.bTA())
      {
        String str = Un(paramau.fwv);
        if (s.gi(str))
        {
          w.d("MicroMsg.MsgInfoStorage", "msgCluster = %s", new Object[] { str });
          paramau.db("notifymessage");
        }
      }
      ae(paramau);
      if (this.goN.update(Ct(paramau.field_talker), paramau.qL(), "msgSvrId=?", new String[] { String.valueOf(paramLong) }) == 0) {
        break;
      }
      doNotify();
      a(new c.c(paramau.field_talker, "update", paramau));
      GMTrace.o(13223130562560L, 98520);
      return;
    }
    d.oqe.a(111L, 243L, 1L, false);
    GMTrace.o(13223130562560L, 98520);
  }
  
  public final void b(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    GMTrace.i(13221654167552L, 98509);
    long l = bg.Pu();
    Object localObject = "SELECT msgSvrId,createTime FROM " + paramString1 + " WHERE createTime > " + (l - 172800L) * 1000L;
    paramString1 = (String)localObject;
    if (!bg.nm(paramString2)) {
      paramString1 = (String)localObject + " AND " + paramString2;
    }
    paramString2 = new ArrayList();
    localObject = new ArrayList();
    paramString1 = this.goN.a(paramString1, paramArrayOfString, 2);
    if (paramString1.moveToFirst())
    {
      do
      {
        int i = paramString1.getInt(0);
        l = paramString1.getLong(1) / 1000L;
        paramString2.add(Integer.valueOf(i));
        ((List)localObject).add(Long.valueOf(l));
      } while (paramString1.moveToNext());
      this.vBT.i(paramString2, (List)localObject);
    }
    paramString1.close();
    GMTrace.o(13221654167552L, 98509);
  }
  
  public final List<au> bj(String paramString, int paramInt)
  {
    GMTrace.i(13219506683904L, 98493);
    ArrayList localArrayList = new ArrayList();
    if (this.vBM != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = "SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND status = 3" + " AND type <> 10000" + " ORDER BY createTime DESC LIMIT " + paramInt;
      paramString = this.goN.a(paramString, null, 2);
      while (paramString.moveToNext())
      {
        au localau = new au();
        localau.b(paramString);
        localArrayList.add(localau);
      }
    }
    paramString.close();
    GMTrace.o(13219506683904L, 98493);
    return localArrayList;
  }
  
  public final List<au> bk(String paramString, int paramInt)
  {
    GMTrace.i(13220177772544L, 98498);
    ArrayList localArrayList = new ArrayList();
    if (this.vBM != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = "SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND isSend = 0" + " ORDER BY createTime DESC LIMIT " + paramInt;
      paramString = this.goN.a(paramString, null, 2);
      while (paramString.moveToNext())
      {
        au localau = new au();
        localau.b(paramString);
        if (localau.bTF()) {
          localArrayList.add(localau);
        }
      }
    }
    paramString.close();
    GMTrace.o(13220177772544L, 98498);
    return localArrayList;
  }
  
  public final Cursor bl(String paramString, int paramInt)
  {
    GMTrace.i(16692390395904L, 124368);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      GMTrace.o(16692390395904L, 124368);
      return null;
    }
    String str = Ct(paramString);
    paramString = "select * from " + str + " where" + Ul(paramString) + " AND type = 49  order by createTime" + " DESC limit " + paramInt + " OFFSET 0";
    paramString = this.goN.a(paramString, null, 2);
    GMTrace.o(16692390395904L, 124368);
    return paramString;
  }
  
  public final Cursor bm(String paramString, int paramInt)
  {
    GMTrace.i(17856729186304L, 133043);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      GMTrace.o(17856729186304L, 133043);
      return null;
    }
    Object localObject = Ct(paramString);
    paramString = new StringBuilder("select msgId,msgSvrId,createTime,content,isSend from ").append((String)localObject).append(" where").append(Ul(paramString)).append(" AND ");
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" (type = 49");
    ((StringBuilder)localObject).append(" or type = 553648177").append(") ");
    paramString = ((StringBuilder)localObject).toString() + "  order by createTime DESC limit 100" + " OFFSET " + paramInt;
    paramString = this.goN.a(paramString, null, 2);
    GMTrace.o(17856729186304L, 133043);
    return paramString;
  }
  
  public final int bn(String paramString, int paramInt)
  {
    GMTrace.i(13222459473920L, 98515);
    w.w("MicroMsg.MsgInfoStorage", "deleteByTalkerFrom :%s  :%d stack:%s", new Object[] { paramString, Integer.valueOf(paramInt), com.tencent.mm.sdk.platformtools.ah.bQl() });
    au localau = B(paramString, paramInt);
    Assert.assertTrue(paramString.equals(localau.field_talker));
    b(Ct(paramString), "createTime<=? AND" + Ul(paramString), new String[] { localau.field_createTime });
    paramInt = this.goN.delete(Ct(paramString), "createTime<=? AND" + Ul(paramString), new String[] { localau.field_createTime });
    if (paramInt != 0)
    {
      doNotify();
      a(new c.c(paramString, "delete", paramInt));
    }
    GMTrace.o(13222459473920L, 98515);
    return paramInt;
  }
  
  public final Cursor bo(String paramString, int paramInt)
  {
    GMTrace.i(13222727909376L, 98517);
    au localau = B(paramString, paramInt);
    Assert.assertTrue(paramString.equals(localau.field_talker));
    paramString = this.goN.query(Ct(paramString), null, "createTime<=? AND" + Ul(paramString), new String[] { localau.field_createTime }, null, null, null);
    GMTrace.o(13222727909376L, 98517);
    return paramString;
  }
  
  public final Cursor bp(String paramString, int paramInt)
  {
    GMTrace.i(13224338522112L, 98529);
    paramString = this.goN.query(Ct(paramString), null, "isSend=? AND" + Ul(paramString) + "AND status!=?  order by msgId" + " DESC limit " + paramInt, new String[] { "0", "4" }, null, null, null);
    GMTrace.o(13224338522112L, 98529);
    return paramString;
  }
  
  public final int bq(String paramString, int paramInt)
  {
    int i = 0;
    GMTrace.i(13225814917120L, 98540);
    paramString = "SELECT COUNT(*) FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND type = " + paramInt;
    paramString = this.goN.a(paramString, null, 2);
    paramInt = i;
    if (paramString.moveToFirst()) {
      paramInt = paramString.getInt(0);
    }
    paramString.close();
    GMTrace.o(13225814917120L, 98540);
    return paramInt;
  }
  
  public final Cursor br(String paramString, int paramInt)
  {
    GMTrace.i(13228901924864L, 98563);
    String str = " SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND isSend=1" + " ORDER BY createTime DESC LIMIT " + paramInt;
    w.d("MicroMsg.MsgInfoStorage", "[getInitCursorBySelf] getCursor talk:%s,limitCount:%d [%s]", new Object[] { paramString, Integer.valueOf(paramInt), str });
    paramString = this.goN.a(str, null, 0);
    GMTrace.o(13228901924864L, 98563);
    return paramString;
  }
  
  public final au[] bs(String paramString, int paramInt)
  {
    GMTrace.i(13229707231232L, 98569);
    if ((paramString == null) || (paramString.length() == 0) || (paramInt <= 0))
    {
      w.e("MicroMsg.MsgInfoStorage", "getLastMsgList, invalid argument, talker = " + paramString + ", limit = " + paramInt);
      GMTrace.o(13229707231232L, 98569);
      return null;
    }
    Object localObject = "select * from " + Ct(paramString) + " where" + Ul(paramString) + "order by createTime DESC limit " + paramInt;
    localObject = this.goN.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      ArrayList localArrayList = new ArrayList();
      do
      {
        au localau = new au();
        localau.b((Cursor)localObject);
        localArrayList.add(localau);
      } while (((Cursor)localObject).moveToNext());
      ((Cursor)localObject).close();
      w.d("MicroMsg.MsgInfoStorage", "getLastMsgList, talker = " + paramString + ", limit = " + paramInt + ", count = " + localArrayList.size());
      Collections.reverse(localArrayList);
      paramString = (au[])localArrayList.toArray(new au[localArrayList.size()]);
      GMTrace.o(13229707231232L, 98569);
      return paramString;
    }
    w.w("MicroMsg.MsgInfoStorage", "getLastMsgList, cursor is empty");
    ((Cursor)localObject).close();
    GMTrace.o(13229707231232L, 98569);
    return null;
  }
  
  public final int c(String paramString, long paramLong, int paramInt)
  {
    GMTrace.i(13218835595264L, 98488);
    String str = "SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND createTime < " + paramLong + " ORDER BY createTime ASC LIMIT -1 OFFSET " + paramInt;
    Cursor localCursor = this.goN.a(str, null, 0);
    paramInt = localCursor.getCount();
    localCursor.close();
    w.d("MicroMsg.MsgInfoStorage", "getPositionByCreateTime talk:" + paramString + " time:" + paramLong + " count " + paramInt + " [" + str + "]");
    GMTrace.o(13218835595264L, 98488);
    return paramInt;
  }
  
  public final long c(au paramau, boolean paramBoolean)
  {
    GMTrace.i(16003316580352L, 119234);
    if ((paramau == null) || (bg.nm(paramau.field_talker)))
    {
      d.oqe.a(111L, 250L, 1L, false);
      if (paramau == null) {}
      for (localObject1 = "-1";; localObject1 = paramau.field_talker)
      {
        w.e("MicroMsg.MsgInfoStorage", "Error insert message msg:%s talker:%s", new Object[] { paramau, localObject1 });
        GMTrace.o(16003316580352L, 119234);
        return -1L;
      }
    }
    w.d("MicroMsg.MsgInfoStorage", "insert lockForSync[%b], message seq[%d]", new Object[] { Boolean.valueOf(this.vBW), Long.valueOf(paramau.field_msgSeq) });
    Object localObject1 = null;
    Object localObject2 = bc.gT(paramau.fwv);
    if (localObject2 != null) {
      localObject1 = ((bc.b)localObject2).gnR;
    }
    if (s.gi((String)localObject1))
    {
      w.d("MicroMsg.MsgInfoStorage", "msgCluster = %s", new Object[] { localObject1 });
      if (paramau.field_type == 436207665)
      {
        w.w("MicroMsg.MsgInfoStorage", "protect:c2c msg should not here");
        GMTrace.o(16003316580352L, 119234);
        return -1L;
      }
      paramau.db("notifymessage");
    }
    localObject1 = Ur(paramau.field_talker);
    if (localObject1 == null)
    {
      d.oqe.a(111L, 249L, 1L, false);
      w.e("MicroMsg.MsgInfoStorage", "Error insert message getTableByTalker failed. talker:%s", new Object[] { paramau.field_talker });
      GMTrace.o(16003316580352L, 119234);
      return -1L;
    }
    ((c.b)localObject1).aOt();
    paramau.C(((c.b)localObject1).gGZ);
    Assert.assertTrue(String.format("check table name from id:%d table:%s getTableNameByLocalId:%s", new Object[] { Long.valueOf(paramau.field_msgId), localObject1, eT(paramau.field_msgId) }), ((c.b)localObject1).name.equals(eT(paramau.field_msgId)));
    if (paramau.field_msgSvrId != 0L)
    {
      paramau.fwz = 1;
      paramau.fso = true;
    }
    Iterator localIterator = this.vBL.iterator();
    while (localIterator.hasNext()) {
      if (!((e)localIterator.next()).a(paramau, (bc.b)localObject2))
      {
        w.e("MicroMsg.MsgInfoStorage", "Error dealMsgSource. talker:%s ,msgSouce:%s", new Object[] { paramau.field_talker, paramau.fwv });
        GMTrace.o(16003316580352L, 119234);
        return -1L;
      }
    }
    ae(paramau);
    if (((c.b)localObject1).name.equals("message"))
    {
      paramau.field_talkerId = ((int)Um(paramau.field_talker));
      paramau.fwf = true;
    }
    localObject2 = paramau.qL();
    long l = this.goN.a(((c.b)localObject1).name, "msgId", (ContentValues)localObject2, paramBoolean);
    w.i("MicroMsg.MsgInfoStorage", "insert:%d talker:%s id:%d type:%d status:%d svrid:%d msgseq:%d flag:%d create:%d issend:%d lockforsync[%s,%d]", new Object[] { Long.valueOf(l), paramau.field_talker, Long.valueOf(paramau.field_msgId), Integer.valueOf(paramau.field_type), Integer.valueOf(paramau.field_status), Long.valueOf(paramau.field_msgSvrId), Long.valueOf(paramau.field_msgSeq), Integer.valueOf(paramau.field_flag), Long.valueOf(paramau.field_createTime), Integer.valueOf(paramau.field_isSend), this.vBX, Long.valueOf(bg.aH(this.vBY)) });
    if (l == -1L)
    {
      d.oqe.a(111L, 248L, 1L, false);
      w.e("MicroMsg.MsgInfoStorage", "insert failed svrid:%d ret:%d", new Object[] { Long.valueOf(paramau.field_msgSvrId), Long.valueOf(l) });
      GMTrace.o(16003316580352L, 119234);
      return -1L;
    }
    if ((this.vBW) && (bg.aH(this.vBY) > 2000L) && (paramau.field_isSend == 1) && (paramau.field_status == 1))
    {
      w.w("MicroMsg.MsgInfoStorage", "insert this fucking tag[%s] lockForSync too long:%d force to release Now.", new Object[] { this.vBX, Long.valueOf(bg.aH(this.vBY)) });
      BX(this.vBX);
    }
    if (this.vBW)
    {
      localObject1 = null;
      if (e.vpm != null) {
        localObject1 = e.vpm.E(paramau);
      }
      if (!bg.nm((String)localObject1)) {
        break label989;
      }
    }
    label989:
    for (localObject2 = paramau.field_talker;; localObject2 = localObject1)
    {
      localObject1 = null;
      if (this.vBV.containsKey(localObject2)) {
        localObject1 = (c.c)this.vBV.get(localObject2);
      }
      if (localObject1 == null)
      {
        localObject1 = new c.c(paramau.field_talker, "insert", paramau);
        if (c.c.S(paramau)) {
          ((c.c)localObject1).mVb += 1;
        }
        ((c.c)localObject1).mVc += 1;
        this.vBV.put(localObject2, localObject1);
      }
      for (;;)
      {
        l = paramau.field_msgId;
        GMTrace.o(16003316580352L, 119234);
        return l;
        ((c.c)localObject1).mVa.add(paramau);
        break;
        localObject1 = new c.c(paramau.field_talker, "insert", paramau);
        if (c.c.S(paramau)) {
          ((c.c)localObject1).mVb = 1;
        }
        ((c.c)localObject1).mVc = 1;
        doNotify();
        a((c.c)localObject1);
      }
    }
  }
  
  public final List<au> c(String paramString, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(13221385732096L, 98507);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid, limit = 10");
      GMTrace.o(13221385732096L, 98507);
      return null;
    }
    paramLong = H(paramString, paramLong);
    if (paramLong == 0L)
    {
      w.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, msg is null");
      GMTrace.o(13221385732096L, 98507);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean) {}
    for (paramString = "select * from " + Ct(paramString) + " where" + Ul(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND " + "createTime > " + paramLong + "  order by createTime ASC limit 10";; paramString = "select * from " + Ct(paramString) + " where" + Ul(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND " + "createTime < " + paramLong + "  order by createTime DESC limit 10")
    {
      paramString = this.goN.a(paramString, null, 2);
      while (paramString.moveToNext())
      {
        au localau = new au();
        localau.b(paramString);
        localArrayList.add(localau);
      }
    }
    if (!paramBoolean) {
      Collections.reverse(localArrayList);
    }
    paramString.close();
    GMTrace.o(13221385732096L, 98507);
    return localArrayList;
  }
  
  public final au cM(long paramLong)
  {
    GMTrace.i(13217224982528L, 98476);
    au localau = new au();
    Cursor localCursor = this.goN.a(eT(paramLong), null, "msgId=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (localCursor.moveToFirst()) {
      localau.b(localCursor);
    }
    localCursor.close();
    GMTrace.o(13217224982528L, 98476);
    return localau;
  }
  
  public final int cN(long paramLong)
  {
    GMTrace.i(13220983078912L, 98504);
    au localau = cM(paramLong);
    Object localObject = localau.field_talker;
    this.vBT.e((int)(bg.Pu() / 86400L), localau.field_msgSvrId, localau.field_createTime / 1000L);
    int i = this.goN.delete(eT(paramLong), "msgId=?", new String[] { String.valueOf(paramLong) });
    if (i != 0)
    {
      SS("delete_id " + paramLong);
      localObject = new c.c((String)localObject, "delete", 1);
      ((c.c)localObject).mVe = paramLong;
      ((c.c)localObject).juT = localau.field_bizChatId;
      a((c.c)localObject);
    }
    for (;;)
    {
      GMTrace.o(13220983078912L, 98504);
      return i;
      d.oqe.a(111L, 245L, 1L, false);
    }
  }
  
  public final boolean cO(long paramLong)
  {
    GMTrace.i(13221788385280L, 98510);
    boolean bool = this.vBT.eR(paramLong);
    GMTrace.o(13221788385280L, 98510);
    return bool;
  }
  
  public final boolean cP(long paramLong)
  {
    GMTrace.i(13227291312128L, 98551);
    int i = 0;
    while (i < this.vBM.size())
    {
      if (((c.b)this.vBM.get(i)).cR(paramLong))
      {
        GMTrace.o(13227291312128L, 98551);
        return true;
      }
      i += 1;
    }
    GMTrace.o(13227291312128L, 98551);
    return false;
  }
  
  public final void cQ(long paramLong)
  {
    GMTrace.i(13229975666688L, 98571);
    this.vBT.a(0, paramLong, 0L, false);
    GMTrace.o(13229975666688L, 98571);
  }
  
  public final au cS(String paramString1, String paramString2)
  {
    GMTrace.i(13219238248448L, 98491);
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.MsgInfoStorage", "getLastMsg failed : talker:%s", new Object[] { paramString1 });
      GMTrace.o(13219238248448L, 98491);
      return null;
    }
    au localau = new au();
    paramString2 = "select * from " + Ct(paramString1) + " where" + Ul(paramString1) + paramString2 + " order by createTime DESC limit 1";
    paramString2 = this.goN.a(paramString2, null, 2);
    if (paramString2.moveToFirst()) {
      localau.b(paramString2);
    }
    paramString2.close();
    w.i("MicroMsg.MsgInfoStorage", "getLastMsg talker:%s msgid:%d", new Object[] { paramString1, Long.valueOf(localau.field_msgId) });
    GMTrace.o(13219238248448L, 98491);
    return localau;
  }
  
  public final Cursor cT(String paramString1, String paramString2)
  {
    GMTrace.i(13223801651200L, 98525);
    paramString1 = "SELECT * FROM " + Ct(paramString1) + " WHERE" + Ul(paramString1) + "AND content LIKE '%" + paramString2 + "%' AND type = 1";
    paramString1 = paramString1 + " ORDER BY createTime DESC";
    paramString1 = this.goN.a(paramString1, null, 0);
    GMTrace.o(13223801651200L, 98525);
    return paramString1;
  }
  
  public final int cU(String paramString1, String paramString2)
  {
    GMTrace.i(13229036142592L, 98564);
    String str = " SELECT COUNT(*) FROM " + Ct(paramString1) + " WHERE" + Ul(paramString1) + "AND content LIKE '" + paramString2 + "%' ";
    Cursor localCursor = this.goN.a(str, null, 2);
    for (;;)
    {
      try
      {
        if (!localCursor.moveToFirst()) {
          break label181;
        }
        i = localCursor.getInt(0);
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.MsgInfoStorage", localException, "", new Object[0]);
        localCursor.close();
        i = 0;
        continue;
      }
      finally
      {
        localCursor.close();
      }
      w.d("MicroMsg.MsgInfoStorage", "getMsgCountByMember getCursor talk:%s member:%s,count:%s,[%s]", new Object[] { paramString1, paramString2, Integer.valueOf(i), str });
      GMTrace.o(13229036142592L, 98564);
      return i;
      label181:
      int i = 0;
    }
  }
  
  public final LinkedList<au> cV(String paramString1, String paramString2)
  {
    GMTrace.i(13229841448960L, 98570);
    paramString1 = this.goN.a("message", null, "talker=? AND bizClientMsgId=?", new String[] { paramString1, paramString2 }, null, null, null, 2);
    if ((paramString1 == null) || (!paramString1.moveToFirst()))
    {
      w.e("MicroMsg.MsgInfoStorage", "getByBizClientMsgId fail");
      GMTrace.o(13229841448960L, 98570);
      return null;
    }
    paramString2 = new LinkedList();
    do
    {
      au localau = new au();
      localau.b(paramString1);
      paramString2.add(localau);
    } while (paramString1.moveToNext());
    paramString1.close();
    GMTrace.o(13229841448960L, 98570);
    return paramString2;
  }
  
  public final Cursor d(String paramString, long paramLong, int paramInt)
  {
    Object localObject = null;
    GMTrace.i(20381901520896L, 151857);
    try
    {
      paramString = "select * from " + paramString + " where " + "type IN (3,39,13,43,62,44,49,268435505,34)" + " AND msgId >= " + paramLong + "  order by msgId ASC  limit " + paramInt;
      paramString = this.goN.a(paramString, null, 0);
      GMTrace.o(20381901520896L, 151857);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString = (String)localObject;
      }
    }
  }
  
  public final Cursor f(String paramString, int paramInt, long paramLong)
  {
    GMTrace.i(13223667433472L, 98524);
    paramString = "SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + " AND createTime <= " + paramLong + " order by createTime ASC limit " + paramInt;
    paramString = this.goN.a(paramString, null, 0);
    GMTrace.o(13223667433472L, 98524);
    return paramString;
  }
  
  public final Cursor g(String paramString, int paramInt, long paramLong)
  {
    GMTrace.i(13224070086656L, 98527);
    StringBuilder localStringBuilder = new StringBuilder("SELECT * FROM ( SELECT * FROM ").append(Ct(paramString)).append(" WHERE").append(Ul(paramString));
    if (paramLong > 0L) {}
    for (String str = " AND createTime > " + paramLong;; str = "")
    {
      str = str + " ORDER BY createTime DESC LIMIT " + paramInt + ") ORDER BY createTime ASC";
      w.i("MicroMsg.MsgInfoStorage", "getInitCursor1 getCursor talk:%s limitCount:%d [%s]", new Object[] { paramString, Integer.valueOf(paramInt), str });
      paramString = this.goN.a(str, null, 0);
      GMTrace.o(13224070086656L, 98527);
      return paramString;
    }
  }
  
  public final Cursor h(String paramString, int paramInt, long paramLong)
  {
    GMTrace.i(20381498867712L, 151854);
    String str = "SELECT * FROM ( SELECT * FROM ( SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "ORDER BY createTime DESC LIMIT " + paramInt + ") ORDER BY createTime ASC ) WHERE createTime" + " <= " + paramLong;
    w.i("MicroMsg.MsgInfoStorage", "summerbadcr getInitCursor2 getCursor talk:%s limitCount:%d [%s]", new Object[] { paramString, Integer.valueOf(paramInt), str });
    paramString = this.goN.a(str, null, 0);
    GMTrace.o(20381498867712L, 151854);
    return paramString;
  }
  
  public final Cursor i(String paramString, long paramLong1, long paramLong2)
  {
    GMTrace.i(15229417160704L, 113468);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      GMTrace.o(15229417160704L, 113468);
      return null;
    }
    String str = Ct(paramString);
    paramString = "select * from " + str + " where" + Ul(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND " + "createTime >= " + paramLong1 + " AND createTime< " + paramLong2 + " order by createTime ASC";
    paramString = this.goN.a(paramString, null, 2);
    GMTrace.o(15229417160704L, 113468);
    return paramString;
  }
  
  public final int j(String paramString, long paramLong1, long paramLong2)
  {
    int i = 0;
    GMTrace.i(17856863404032L, 133044);
    paramString = "SELECT COUNT(*) FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND type = 50" + " AND createTime >= " + paramLong1 + " AND createTime <= " + paramLong2 + " LIMIT 1";
    paramString = this.goN.a(paramString, null, 2);
    if (paramString.moveToFirst()) {
      i = paramString.getInt(0);
    }
    paramString.close();
    GMTrace.o(17856863404032L, 133044);
    return i;
  }
  
  public final int k(String paramString, long paramLong1, long paramLong2)
  {
    GMTrace.i(13228230836224L, 98558);
    long l;
    if (paramLong2 < paramLong1)
    {
      l = paramLong2;
      paramLong2 = paramLong1;
    }
    for (;;)
    {
      w.d("MicroMsg.MsgInfoStorage", "talker %s, get count fromCreateTime %d, toCreateTime %d", new Object[] { paramString, Long.valueOf(l), Long.valueOf(paramLong2) });
      paramString = "SELECT COUNT(msgId) FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND createTime >= " + l + " AND createTime <= " + paramLong2;
      w.d("MicroMsg.MsgInfoStorage", "get count sql: " + paramString);
      paramString = this.goN.a(paramString, null, 2);
      if (paramString == null)
      {
        w.w("MicroMsg.MsgInfoStorage", "get count error, cursor is null");
        GMTrace.o(13228230836224L, 98558);
        return 0;
      }
      if (paramString.moveToFirst())
      {
        int i = paramString.getInt(0);
        w.d("MicroMsg.MsgInfoStorage", "result msg count %d", new Object[] { Integer.valueOf(i) });
        paramString.close();
        GMTrace.o(13228230836224L, 98558);
        return i;
      }
      paramString.close();
      GMTrace.o(13228230836224L, 98558);
      return 0;
      l = paramLong1;
    }
  }
  
  public final Cursor l(String paramString, long paramLong1, long paramLong2)
  {
    GMTrace.i(13228365053952L, 98559);
    long l;
    if (paramLong2 < paramLong1)
    {
      l = paramLong2;
      paramLong2 = paramLong1;
    }
    for (;;)
    {
      paramString = "SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND createTime >= " + l + " AND createTime <= " + paramLong2 + " ORDER BY createTime ASC ";
      w.d("MicroMsg.MsgInfoStorage", "get cursor: " + paramString);
      paramString = this.goN.a(paramString, null, 0);
      GMTrace.o(13228365053952L, 98559);
      return paramString;
      l = paramLong1;
    }
  }
  
  public final void lock()
  {
    GMTrace.i(13215480152064L, 98463);
    Assert.assertTrue("lock deprecated, use lockForSync instead.", false);
    GMTrace.o(13215480152064L, 98463);
  }
  
  public final int m(String paramString, long paramLong1, long paramLong2)
  {
    int i = 0;
    GMTrace.i(14895349235712L, 110979);
    long l;
    if (paramLong2 < paramLong1)
    {
      l = paramLong2;
      paramLong2 = paramLong1;
    }
    for (;;)
    {
      paramString = "SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND createTime > " + l + " AND createTime < " + paramLong2;
      paramString = this.goN.a(paramString, null, 2);
      if (paramString.moveToFirst()) {
        i = paramString.getInt(0);
      }
      paramString.close();
      GMTrace.o(14895349235712L, 110979);
      return i;
      l = paramLong1;
    }
  }
  
  public final Cursor n(String paramString, long paramLong1, long paramLong2)
  {
    GMTrace.i(13228633489408L, 98561);
    long l;
    if (paramLong2 < paramLong1)
    {
      l = paramLong2;
      paramLong2 = paramLong1;
    }
    for (;;)
    {
      paramString = "SELECT * FROM " + Ct(paramString) + " WHERE" + Ul(paramString) + "AND createTime >= " + l + " AND createTime <= " + paramLong2;
      w.d("MicroMsg.MsgInfoStorage", "get cursor: " + paramString);
      paramString = this.goN.a(paramString, null, 0);
      GMTrace.o(13228633489408L, 98561);
      return paramString;
      l = paramLong1;
    }
  }
  
  public final au qq(int paramInt)
  {
    GMTrace.i(13219640901632L, 98494);
    if (this.vBM == null)
    {
      w.e("MicroMsg.MsgInfoStorage", "getLastMsg failed lstTable is null");
      GMTrace.o(13219640901632L, 98494);
      return null;
    }
    au localau = new au();
    long l1 = 0L;
    int i = 0;
    while (i < this.vBM.size())
    {
      long l2 = l1;
      if ((((c.b)this.vBM.get(i)).mUW & paramInt) != 0)
      {
        Object localObject = "select * from " + ((c.b)this.vBM.get(i)).name + "  order by createTime DESC limit 1";
        localObject = this.goN.a((String)localObject, null, 2);
        l2 = l1;
        if (((Cursor)localObject).moveToFirst())
        {
          long l3 = ((Cursor)localObject).getLong(((Cursor)localObject).getColumnIndex("createTime"));
          l2 = l1;
          if (l1 < l3)
          {
            localau.b((Cursor)localObject);
            l2 = l3;
          }
        }
        ((Cursor)localObject).close();
      }
      i += 1;
      l1 = l2;
    }
    GMTrace.o(13219640901632L, 98494);
    return localau;
  }
  
  public final void unlock()
  {
    GMTrace.i(13215614369792L, 98464);
    Assert.assertTrue("unlock deprecated, use lockForSync instead.", false);
    GMTrace.o(13215614369792L, 98464);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */