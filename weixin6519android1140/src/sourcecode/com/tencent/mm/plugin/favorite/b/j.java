package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ba;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.tp;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class j
  extends ba
{
  protected static c.a fTp;
  private static a lbc;
  private static a lbd;
  
  static
  {
    GMTrace.i(6309441175552L, 47009);
    fTp = ba.qM();
    lbc = new a()
    {
      public final void xI(String paramAnonymousString)
      {
        GMTrace.i(6277497356288L, 46771);
        w.d("MicroMsg.FavItemInfo", paramAnonymousString);
        GMTrace.o(6277497356288L, 46771);
      }
    };
    lbd = new a()
    {
      public final void xI(String paramAnonymousString)
      {
        GMTrace.i(6266088849408L, 46686);
        w.e("MicroMsg.FavItemInfo", paramAnonymousString);
        GMTrace.o(6266088849408L, 46686);
      }
    };
    GMTrace.o(6309441175552L, 47009);
  }
  
  public j()
  {
    GMTrace.i(6306488385536L, 46987);
    this.field_flag = -1;
    this.field_fromUser = "";
    this.field_toUser = "";
    this.field_id = -1;
    this.field_realChatName = "";
    this.field_sourceType = -1;
    this.field_updateTime = -1L;
    this.field_type = -1;
    this.field_updateSeq = -1;
    this.field_xml = "";
    this.field_itemStatus = 0;
    axG();
    GMTrace.o(6306488385536L, 46987);
  }
  
  private static void a(String paramString, a parama, to paramto)
  {
    GMTrace.i(6308635869184L, 47003);
    if (paramto == null)
    {
      GMTrace.o(6308635869184L, 47003);
      return;
    }
    parama.xI(paramString + " ----loc item----");
    parama.xI(paramString + "  lng: " + paramto.lng);
    parama.xI(paramString + "  lat: " + paramto.lat);
    parama.xI(paramString + "  scale: " + paramto.eMn);
    parama.xI(paramString + "  label: " + paramto.label);
    parama.xI(paramString + "  poiname: " + paramto.eQm);
    GMTrace.o(6308635869184L, 47003);
  }
  
  private static void a(String paramString, a parama, tp paramtp)
  {
    GMTrace.i(20410355679232L, 152069);
    if (paramtp == null)
    {
      GMTrace.o(20410355679232L, 152069);
      return;
    }
    parama.xI(paramString + " ----noteInfoItem item----");
    parama.xI(paramString + "  author: " + paramtp.ult);
    parama.xI(paramString + "  editor: " + paramtp.ulu);
    GMTrace.o(20410355679232L, 152069);
  }
  
  private static void a(String paramString, a parama, ts paramts)
  {
    GMTrace.i(6308501651456L, 47002);
    if (paramts == null)
    {
      GMTrace.o(6308501651456L, 47002);
      return;
    }
    parama.xI(paramString + " ----product item----");
    parama.xI(paramString + "  title: " + paramts.title);
    parama.xI(paramString + "  desc: " + paramts.desc);
    parama.xI(paramString + "  thumbUrl: " + paramts.thumbUrl);
    parama.xI(paramString + "  type: " + paramts.type);
    GMTrace.o(6308501651456L, 47002);
  }
  
  private static void a(String paramString, a parama, tz paramtz)
  {
    GMTrace.i(6308367433728L, 47001);
    if (paramtz == null)
    {
      GMTrace.o(6308367433728L, 47001);
      return;
    }
    parama.xI(paramString + " ----tv item----");
    parama.xI(paramString + "  title: " + paramtz.title);
    parama.xI(paramString + "  desc: " + paramtz.desc);
    parama.xI(paramString + "  thumbUrl: " + paramtz.thumbUrl);
    GMTrace.o(6308367433728L, 47001);
  }
  
  private static void a(String paramString, a parama, uf paramuf)
  {
    GMTrace.i(6308770086912L, 47004);
    if (paramuf == null)
    {
      GMTrace.o(6308770086912L, 47004);
      return;
    }
    parama.xI(paramString + " ----url item----");
    parama.xI(paramString + "  title: " + paramuf.title);
    parama.xI(paramString + "  desc: " + paramuf.desc);
    parama.xI(paramString + "  cleanUrl: " + paramuf.umf);
    parama.xI(paramString + "  thumbUrl: " + paramuf.thumbUrl);
    parama.xI(paramString + "  opencache: " + paramuf.umh);
    GMTrace.o(6308770086912L, 47004);
  }
  
  private void axG()
  {
    GMTrace.i(6306622603264L, 46988);
    this.field_favProto = new tt();
    tw localtw = new tw();
    localtw.zZ(1);
    this.field_favProto.a(localtw);
    this.field_favProto.b(new uf());
    this.field_favProto.b(new to());
    this.field_favProto.b(new ts());
    this.field_favProto.b(new tz());
    this.field_favProto.zX(-1);
    this.field_tagProto = new ud();
    this.field_favProto.a(new tp());
    GMTrace.o(6306622603264L, 46988);
  }
  
  public static String b(j paramj)
  {
    GMTrace.i(6309038522368L, 47006);
    StringBuffer localStringBuffer1 = new StringBuffer();
    localStringBuffer1.append("<favitem");
    localStringBuffer1.append(" type='").append(paramj.field_type).append("'");
    localStringBuffer1.append(">");
    Object localObject2 = paramj.field_favProto;
    StringBuilder localStringBuilder = new StringBuilder();
    if (!bg.nm(((tt)localObject2).title)) {
      localStringBuilder.append("<title>").append(bg.Sw(((tt)localObject2).title)).append("</title>");
    }
    if (!bg.nm(((tt)localObject2).desc)) {
      localStringBuilder.append("<desc>").append(bg.Sw(((tt)localObject2).desc)).append("</desc>");
    }
    if (((tt)localObject2).tLY > 0L) {
      localStringBuilder.append("<edittime>").append(((tt)localObject2).tLY).append("</edittime>");
    }
    if (!bg.nm(((tt)localObject2).hLO))
    {
      localStringBuilder.append("<remark ");
      if (((tt)localObject2).ukQ > 0L) {
        localStringBuilder.append(" time ='").append(((tt)localObject2).ukQ).append("'");
      }
      localStringBuilder.append(">").append(bg.Sw(((tt)localObject2).hLO)).append("</remark>");
    }
    if (((tt)localObject2).ukT) {
      localStringBuilder.append("<ctrlflag>").append(((tt)localObject2).ukS).append("</ctrlflag>");
    }
    if (((tt)localObject2).ulD)
    {
      localStringBuilder.append("<version>").append(((tt)localObject2).version).append("</version>");
      localObject1 = ((tt)localObject2).ulz;
      if ((localObject1 != null) && (((tw)localObject1).aYq() != 0)) {
        break label604;
      }
      w.w("MicroMsg.FavSourceItemParser", "klem toXml, source item empty");
      localObject1 = "";
      label337:
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(f.aw(((tt)localObject2).ulB));
      localObject1 = paramj.field_favProto.ukH;
      if ((localObject1 != null) && (((to)localObject1).aYq() != 0)) {
        break label954;
      }
      w.d("MicroMsg.FavLocItemParser", "klem toXml, loc item empty");
      localObject1 = "";
      label387:
      localStringBuilder.append((String)localObject1);
      localObject1 = paramj.field_favProto.ukJ;
      if ((localObject1 != null) && (((uf)localObject1).aYq() != 0)) {
        break label1138;
      }
      w.d("MicroMsg.FavUrlItemParser", "klem toXml, url item empty");
      localObject1 = "";
      label424:
      localStringBuilder.append((String)localObject1);
      localObject1 = paramj.field_favProto.ukL;
      if ((localObject1 != null) && (((ts)localObject1).aYq() != 0)) {
        break label1389;
      }
      w.d("MicroMsg.FavProductItemParser", "klem toXml, product item empty");
      localObject1 = "";
      label461:
      localStringBuilder.append((String)localObject1);
      localObject1 = paramj.field_favProto.ukN;
      if ((localObject1 != null) && (((tz)localObject1).aYq() != 0)) {
        break label1591;
      }
      w.d("MicroMsg.FavTVItemParser", "klem toXml, product item empty");
      localObject1 = "";
      label498:
      localStringBuilder.append((String)localObject1);
      localObject1 = ((tt)localObject2).tLX;
      if ((localObject1 != null) && (((tp)localObject1).aYq() != 0)) {
        break label1755;
      }
      w.w("MicroMsg.FavNoteInfoItemParser", "klem toXml, source item empty");
    }
    for (Object localObject1 = "";; localObject1 = ((StringBuffer)localObject2).toString())
    {
      localStringBuilder.append((String)localObject1);
      localStringBuffer1.append(localStringBuilder.toString());
      localStringBuffer1.append(s.a(paramj.field_tagProto));
      localStringBuffer1.append("</favitem>");
      paramj = localStringBuffer1.toString();
      GMTrace.o(6309038522368L, 47006);
      return paramj;
      if (paramj.field_type != 18) {
        break;
      }
      localStringBuilder.append("<version>1</version>");
      break;
      label604:
      StringBuffer localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("<source");
      if (((tw)localObject1).ukW) {
        localStringBuffer2.append(" sourcetype='").append(((tw)localObject1).eDi).append("'");
      }
      if (((tw)localObject1).ulJ) {
        localStringBuffer2.append(" sourceid='").append(((tw)localObject1).ulI).append("'");
      }
      localStringBuffer2.append(">");
      if (((tw)localObject1).ukX) {
        localStringBuffer2.append("<fromusr>").append(bg.Sw(((tw)localObject1).eMI)).append("</fromusr>");
      }
      if (((tw)localObject1).ukY) {
        localStringBuffer2.append("<tousr>").append(bg.Sw(((tw)localObject1).toUser)).append("</tousr>");
      }
      if (((tw)localObject1).ulc) {
        localStringBuffer2.append("<realchatname>").append(bg.Sw(((tw)localObject1).ulb)).append("</realchatname>");
      }
      if (((tw)localObject1).uld) {
        localStringBuffer2.append("<msgid>").append(((tw)localObject1).eQB).append("</msgid>");
      }
      if (((tw)localObject1).ule) {
        localStringBuffer2.append("<eventid>").append(((tw)localObject1).eVH).append("</eventid>");
      }
      if (((tw)localObject1).ulf) {
        localStringBuffer2.append("<appid>").append(((tw)localObject1).appId).append("</appid>");
      }
      if (((tw)localObject1).ulg) {
        localStringBuffer2.append("<link>").append(bg.Sw(((tw)localObject1).gVf)).append("</link>");
      }
      if (((tw)localObject1).ulj) {
        localStringBuffer2.append("<brandid>").append(bg.Sw(((tw)localObject1).eAr)).append("</brandid>");
      }
      localStringBuffer2.append("</source>");
      localObject1 = localStringBuffer2.toString();
      break label337;
      label954:
      localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("<locitem>");
      if (((to)localObject1).ulr) {
        localStringBuffer2.append("<label>").append(bg.Sw(((to)localObject1).label)).append("</label>");
      }
      if (((to)localObject1).ulp) {
        localStringBuffer2.append("<lat>").append(((to)localObject1).lat).append("</lat>");
      }
      if (((to)localObject1).ulo) {
        localStringBuffer2.append("<lng>").append(((to)localObject1).lng).append("</lng>");
      }
      if (((to)localObject1).ulq) {
        localStringBuffer2.append("<scale>").append(((to)localObject1).eMn).append("</scale>");
      }
      if (((to)localObject1).uls) {
        localStringBuffer2.append("<poiname>").append(((to)localObject1).eQm).append("</poiname>");
      }
      localStringBuffer2.append("</locitem>");
      localObject1 = localStringBuffer2.toString();
      break label387;
      label1138:
      localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("<weburlitem>");
      if (((uf)localObject1).umg) {
        localStringBuffer2.append("<clean_url>").append(bg.Sw(((uf)localObject1).umf)).append("</clean_url>");
      }
      if (((uf)localObject1).ujn) {
        localStringBuffer2.append("<pagedesc>").append(bg.Sw(((uf)localObject1).desc)).append("</pagedesc>");
      }
      if (((uf)localObject1).ulw) {
        localStringBuffer2.append("<pagethumb_url>").append(bg.Sw(((uf)localObject1).thumbUrl)).append("</pagethumb_url>");
      }
      if (((uf)localObject1).ujm) {
        localStringBuffer2.append("<pagetitle>").append(bg.Sw(((uf)localObject1).title)).append("</pagetitle>");
      }
      if (((uf)localObject1).umi) {
        localStringBuffer2.append("<opencache>").append(((uf)localObject1).umh).append("</opencache>");
      }
      if (((uf)localObject1).umj) {
        localStringBuffer2.append("<contentattr>").append(((uf)localObject1).giA).append("</contentattr>");
      }
      if (((uf)localObject1).uky) {
        localStringBuffer2.append("<canvasPageXml>").append(((uf)localObject1).canvasPageXml).append("</canvasPageXml>");
      }
      localStringBuffer2.append("</weburlitem>");
      localObject1 = localStringBuffer2.toString();
      break label424;
      label1389:
      localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("<productitem");
      if (((ts)localObject1).uly) {
        localStringBuffer2.append(" type='").append(((ts)localObject1).type).append("'");
      }
      localStringBuffer2.append(">");
      if (((ts)localObject1).ujm) {
        localStringBuffer2.append("<producttitle>").append(bg.Sw(((ts)localObject1).title)).append("</producttitle>");
      }
      if (((ts)localObject1).ujn) {
        localStringBuffer2.append("<productdesc>").append(bg.Sw(((ts)localObject1).desc)).append("</productdesc>");
      }
      if (((ts)localObject1).ulw) {
        localStringBuffer2.append("<productthumb_url>").append(bg.Sw(((ts)localObject1).thumbUrl)).append("</productthumb_url>");
      }
      if (((ts)localObject1).ulx) {
        localStringBuffer2.append("<productinfo>").append(bg.Sw(((ts)localObject1).info)).append("</productinfo>");
      }
      localStringBuffer2.append("</productitem>");
      localObject1 = localStringBuffer2.toString();
      break label461;
      label1591:
      localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("<tvitem>");
      if (((tz)localObject1).ujm) {
        localStringBuffer2.append("<tvtitle>").append(bg.Sw(((tz)localObject1).title)).append("</tvtitle>");
      }
      if (((tz)localObject1).ujn) {
        localStringBuffer2.append("<tvdesc>").append(bg.Sw(((tz)localObject1).desc)).append("</tvdesc>");
      }
      if (((tz)localObject1).ulw) {
        localStringBuffer2.append("<tvthumb_url>").append(bg.Sw(((tz)localObject1).thumbUrl)).append("</tvthumb_url>");
      }
      if (((tz)localObject1).ulx) {
        localStringBuffer2.append("<tvinfo>").append(bg.Sw(((tz)localObject1).info)).append("</tvinfo>");
      }
      localStringBuffer2.append("</tvitem>");
      localObject1 = localStringBuffer2.toString();
      break label498;
      label1755:
      localObject2 = new StringBuffer();
      ((StringBuffer)localObject2).append("<noteinfo>");
      ((StringBuffer)localObject2).append("<noteauthor>").append(bg.Sw(((tp)localObject1).ult)).append("</noteauthor>");
      ((StringBuffer)localObject2).append("<noteeditor>").append(bg.Sw(((tp)localObject1).ulu)).append("</noteeditor>");
      ((StringBuffer)localObject2).append("</noteinfo>");
    }
  }
  
  public final boolean axH()
  {
    GMTrace.i(6306891038720L, 46990);
    if ((this.field_favProto.ukS & 0x1) != 0)
    {
      GMTrace.o(6306891038720L, 46990);
      return true;
    }
    GMTrace.o(6306891038720L, 46990);
    return false;
  }
  
  public final boolean axI()
  {
    GMTrace.i(6307025256448L, 46991);
    if ((this.field_favProto.ukS & 0x2) != 0)
    {
      GMTrace.o(6307025256448L, 46991);
      return true;
    }
    GMTrace.o(6307025256448L, 46991);
    return false;
  }
  
  public final boolean axJ()
  {
    GMTrace.i(6307159474176L, 46992);
    if ((this.field_itemStatus == 1) || (this.field_itemStatus == 4) || (this.field_itemStatus == 9) || (this.field_itemStatus == 12) || (this.field_itemStatus == 13) || (this.field_itemStatus == 15) || (this.field_itemStatus == 17))
    {
      GMTrace.o(6307159474176L, 46992);
      return true;
    }
    GMTrace.o(6307159474176L, 46992);
    return false;
  }
  
  public final boolean axK()
  {
    GMTrace.i(6307293691904L, 46993);
    if ((this.field_itemStatus == 3) || (this.field_itemStatus == 6) || (this.field_itemStatus == 11) || (this.field_itemStatus == 14) || (this.field_itemStatus == 16) || (this.field_itemStatus == 18))
    {
      GMTrace.o(6307293691904L, 46993);
      return true;
    }
    GMTrace.o(6307293691904L, 46993);
    return false;
  }
  
  public final boolean axL()
  {
    GMTrace.i(6307562127360L, 46995);
    if (this.field_itemStatus == 8)
    {
      GMTrace.o(6307562127360L, 46995);
      return true;
    }
    GMTrace.o(6307562127360L, 46995);
    return false;
  }
  
  public final boolean axM()
  {
    GMTrace.i(6307830562816L, 46997);
    if ((this.field_itemStatus == 15) || (this.field_itemStatus == 16))
    {
      GMTrace.o(6307830562816L, 46997);
      return true;
    }
    GMTrace.o(6307830562816L, 46997);
    return false;
  }
  
  public final boolean axN()
  {
    GMTrace.i(6307964780544L, 46998);
    if ((this.field_itemStatus == 12) || (this.field_itemStatus == 13) || (this.field_itemStatus == 14))
    {
      GMTrace.o(6307964780544L, 46998);
      return true;
    }
    GMTrace.o(6307964780544L, 46998);
    return false;
  }
  
  public final j axO()
  {
    GMTrace.i(6309172740096L, 47007);
    j localj = new j();
    localj.field_favProto = this.field_favProto;
    localj.field_sourceId = this.field_sourceId;
    localj.field_edittime = this.field_edittime;
    localj.field_ext = this.field_ext;
    localj.field_flag = this.field_flag;
    localj.field_fromUser = this.field_fromUser;
    localj.field_id = this.field_id;
    localj.field_itemStatus = this.field_itemStatus;
    localj.field_localId = this.field_localId;
    localj.field_localSeq = this.field_localSeq;
    localj.field_realChatName = this.field_realChatName;
    localj.field_tagProto = this.field_tagProto;
    localj.field_sourceCreateTime = this.field_sourceCreateTime;
    localj.field_updateSeq = this.field_updateSeq;
    localj.field_toUser = this.field_toUser;
    localj.field_updateTime = this.field_updateTime;
    localj.field_type = this.field_type;
    localj.field_xml = this.field_xml;
    localj.field_datatotalsize = this.field_datatotalsize;
    GMTrace.o(6309172740096L, 47007);
    return localj;
  }
  
  public final boolean isDone()
  {
    GMTrace.i(6307696345088L, 46996);
    if (this.field_itemStatus == 10)
    {
      GMTrace.o(6307696345088L, 46996);
      return true;
    }
    GMTrace.o(6307696345088L, 46996);
    return false;
  }
  
  public final boolean isDownloading()
  {
    GMTrace.i(6307427909632L, 46994);
    if (this.field_itemStatus == 7)
    {
      GMTrace.o(6307427909632L, 46994);
      return true;
    }
    GMTrace.o(6307427909632L, 46994);
    return false;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6306756820992L, 46989);
    c.a locala = fTp;
    GMTrace.o(6306756820992L, 46989);
    return locala;
  }
  
  public final j xF(String paramString)
  {
    GMTrace.i(6308098998272L, 46999);
    if ((paramString == null) || (paramString.equals("")))
    {
      w.e("MicroMsg.FavItemInfo", "klem, FavItemInfo xml null");
      GMTrace.o(6308098998272L, 46999);
      return this;
    }
    Map localMap = bh.q(paramString, "favitem");
    if (localMap == null)
    {
      w.e("MicroMsg.FavItemInfo", "klem, FavItemInfo maps null");
      GMTrace.o(6308098998272L, 46999);
      return this;
    }
    for (;;)
    {
      try
      {
        axG();
        tt localtt = this.field_favProto;
        localtt.QW((String)localMap.get(".favitem.title"));
        localtt.QX((String)localMap.get(".favitem.desc"));
        localtt.QV((String)localMap.get(".favitem.remark"));
        localtt.eC(bg.getLong((String)localMap.get(".favitem.remark.$time"), 0L));
        localObject = (String)localMap.get(".favitem.edittime");
        localtt.zY(bg.getInt((String)localMap.get(".favitem.version"), 0));
        localtt.eD(bg.getLong((String)localObject, 0L));
        localtt.zX(bg.getInt((String)localMap.get(".favitem.ctrlflag"), -1));
        localObject = localtt.ulz;
        ((tw)localObject).zZ(bg.getInt((String)localMap.get(".favitem.source" + ".$sourcetype"), 0));
        ((tw)localObject).Ra((String)localMap.get(".favitem.source" + ".$sourceid"));
        ((tw)localObject).QY((String)localMap.get(".favitem.source" + ".fromusr"));
        ((tw)localObject).QZ((String)localMap.get(".favitem.source" + ".tousr"));
        ((tw)localObject).Rb((String)localMap.get(".favitem.source" + ".realchatname"));
        ((tw)localObject).eE(bg.getLong((String)localMap.get(".favitem.source" + ".createtime"), 0L));
        ((tw)localObject).Rc((String)localMap.get(".favitem.source" + ".msgid"));
        ((tw)localObject).Rd((String)localMap.get(".favitem.source" + ".eventid"));
        ((tw)localObject).Re((String)localMap.get(".favitem.source" + ".appid"));
        ((tw)localObject).Rf((String)localMap.get(".favitem.source" + ".link"));
        ((tw)localObject).Rg((String)localMap.get(".favitem.source" + ".brandid"));
        n.a(paramString, localtt);
        paramString = localtt.ukH;
        if (!bg.nm((String)localMap.get(".favitem.locitem" + ".label"))) {
          paramString.QP((String)localMap.get(".favitem.locitem" + ".label"));
        }
        if (!bg.nm((String)localMap.get(".favitem.locitem" + ".poiname"))) {
          paramString.QQ((String)localMap.get(".favitem.locitem" + ".poiname"));
        }
        localObject = (String)localMap.get(".favitem.locitem" + ".lng");
        if (!bg.nm((String)localObject)) {
          paramString.p(bg.getDouble((String)localObject, 0.0D));
        }
        localObject = (String)localMap.get(".favitem.locitem" + ".lat");
        if (!bg.nm((String)localObject)) {
          paramString.q(bg.getDouble((String)localObject, 0.0D));
        }
        localObject = (String)localMap.get(".favitem.locitem" + ".scale");
        if (!bg.nm((String)localObject))
        {
          if (((String)localObject).indexOf('.') == -1) {
            continue;
          }
          paramString.zV(bg.getInt(((String)localObject).substring(0, ((String)localObject).indexOf('.')), -1));
        }
        paramString = localtt.ukJ;
        paramString.Rn((String)localMap.get(".favitem.weburlitem" + ".clean_url"));
        paramString.Rm((String)localMap.get(".favitem.weburlitem" + ".pagedesc"));
        paramString.Ro((String)localMap.get(".favitem.weburlitem" + ".pagethumb_url"));
        paramString.Rl((String)localMap.get(".favitem.weburlitem" + ".pagetitle"));
        paramString.Aa(bg.getInt((String)localMap.get(".favitem.weburlitem" + ".opencache"), 0));
        paramString.Ab(bg.getInt((String)localMap.get(".favitem.weburlitem" + ".contentattr"), 0));
        paramString.Rp((String)localMap.get(".favitem.weburlitem" + ".canvasPageXml"));
        paramString = localtt.ukL;
        paramString.QR((String)localMap.get(".favitem.productitem" + ".producttitle"));
        paramString.QS((String)localMap.get(".favitem.productitem" + ".productdesc"));
        paramString.QT((String)localMap.get(".favitem.productitem" + ".productthumb_url"));
        paramString.QU((String)localMap.get(".favitem.productitem" + ".productinfo"));
        paramString.zW(bg.getInt((String)localMap.get(".favitem.productitem" + ".$type"), 0));
        paramString = localtt.ukN;
        paramString.Rh((String)localMap.get(".favitem.tvitem" + ".tvtitle"));
        paramString.Ri((String)localMap.get(".favitem.tvitem" + ".tvdesc"));
        paramString.Rj((String)localMap.get(".favitem.tvitem" + ".tvthumb_url"));
        paramString.Rk((String)localMap.get(".favitem.tvitem" + ".tvinfo"));
        paramString = localtt.tLX;
        paramString.ult = ((String)localMap.get(".favitem.noteinfo" + ".noteauthor"));
        paramString.ulu = ((String)localMap.get(".favitem.noteinfo" + ".noteeditor"));
        if (this.field_favProto.ulz != null)
        {
          paramString = this.field_favProto.ulz;
          this.field_sourceId = paramString.ulI;
          this.field_sourceType = paramString.eDi;
          this.field_fromUser = paramString.eMI;
          this.field_toUser = paramString.toUser;
        }
        this.field_edittime = this.field_favProto.tLY;
        s.a(localMap, this.field_tagProto);
      }
      catch (Exception paramString)
      {
        Object localObject;
        w.printErrStackTrace("MicroMsg.FavItemInfo", paramString, "", new Object[0]);
        w.e("MicroMsg.FavItemInfo", "klem , FavItemInfo exception:+%s", new Object[] { paramString.toString() });
        continue;
      }
      GMTrace.o(6308098998272L, 46999);
      return this;
      paramString.zV(bg.getInt((String)localObject, -1));
    }
  }
  
  public final void xG(String paramString)
  {
    GMTrace.i(6308233216000L, 47000);
    a locala = lbc;
    locala.xI("----dump favitem from[" + paramString + "] beg----");
    locala.xI("type: " + this.field_type);
    locala.xI("favId: " + this.field_id);
    locala.xI("localId: " + this.field_localId);
    locala.xI("itemStatus: " + this.field_itemStatus);
    locala.xI("localSeq: " + this.field_localSeq);
    locala.xI("updateSeq: " + this.field_updateSeq);
    locala.xI("ctrlFlag: " + this.field_flag);
    locala.xI("sourceId: " + this.field_sourceId);
    locala.xI("sourceType: " + this.field_sourceType);
    locala.xI("sourceCreateTime: " + this.field_sourceCreateTime);
    locala.xI("updateTime: " + this.field_updateTime);
    locala.xI("editTime: " + this.field_edittime);
    locala.xI("fromuser: " + this.field_fromUser);
    locala.xI("toUser: " + this.field_toUser);
    locala.xI("realChatName: " + this.field_realChatName);
    if (this.field_favProto != null)
    {
      locala.xI("remarktime: " + this.field_favProto.ukQ);
      locala.xI("dataitemCount: " + this.field_favProto.ulB.size());
      if (this.field_favProto.ulz != null)
      {
        locala.xI(" ----source item----");
        paramString = this.field_favProto.ulz;
        locala.xI("  sourceType: " + paramString.eDi);
        locala.xI("  fromUser: " + paramString.eMI);
        locala.xI("  toUser: " + paramString.toUser);
        locala.xI("  sourceId: " + paramString.ulI);
        locala.xI("  realChatName: " + paramString.ulb);
        locala.xI("  createTime: " + paramString.hcs);
        locala.xI("  msgId: " + paramString.eQB);
        locala.xI("  eventId: " + paramString.eVH);
        locala.xI("  appId: " + paramString.appId);
        locala.xI("  link: " + paramString.gVf);
        locala.xI("  mediaId: " + paramString.ulh);
        locala.xI("  brandId: " + paramString.eAr);
      }
      paramString = this.field_favProto.ulB.iterator();
      int i = 0;
      while (paramString.hasNext())
      {
        th localth = (th)paramString.next();
        locala.xI(" ----data item " + i + "----");
        locala.xI("  dataId: " + localth.lhq);
        locala.xI("  dataType: " + localth.aGU);
        locala.xI("  dataSouceId: " + localth.ukb);
        locala.xI("  svrDataStatus: " + localth.ukj);
        locala.xI("  cdnThumbUrl: " + localth.giD);
        locala.xI("  cdnThumbKey: " + localth.ujp);
        locala.xI("  cdnDataUrl: " + localth.ujt);
        locala.xI("  cdnDataKey: " + localth.ujv);
        locala.xI("  cdnEncryVer: " + localth.ujx);
        locala.xI("  fullmd5: " + localth.ujK);
        locala.xI("  head256md5: " + localth.ujM);
        locala.xI("  fullsize: " + localth.ujO);
        locala.xI("  thumbMd5: " + localth.ujV);
        locala.xI("  thumbHead256md5: " + localth.ujX);
        locala.xI("  thumbfullsize: " + localth.ujZ);
        locala.xI("  duration: " + localth.duration);
        locala.xI("  datafmt: " + localth.ujI);
        locala.xI("  streamWebUrl: " + localth.ujA);
        locala.xI("  streamDataUrl: " + localth.ujC);
        locala.xI("  streamLowBandUrl: " + localth.ujE);
        locala.xI("  ext: " + localth.eDk);
        if (localth.ukn != null)
        {
          locala.xI("  remarktime: " + localth.ukn.ukQ);
          locala.xI("  ctrlflag: " + localth.ukn.ukS);
          locala.xI("  edittime: " + localth.ukn.tLY);
          if (localth.ukn.ukF != null)
          {
            locala.xI("   ----data source item----");
            tj localtj = localth.ukn.ukF;
            locala.xI("    sourceType: " + localtj.eDi);
            locala.xI("    fromUser: " + localtj.eMI);
            locala.xI("    toUser: " + localtj.toUser);
            locala.xI("    realChatName: " + localtj.ulb);
            locala.xI("    createTime: " + localtj.hcs);
            locala.xI("    msgId: " + localtj.eQB);
            locala.xI("    eventId: " + localtj.eVH);
            locala.xI("    appId: " + localtj.appId);
            locala.xI("    link: " + localtj.gVf);
            locala.xI("    mediaId: " + localtj.ulh);
            locala.xI("    brandId: " + localtj.eAr);
          }
          a("  ", locala, localth.ukn.ukH);
          a("  ", locala, localth.ukn.ukJ);
          a("  ", locala, localth.ukn.ukL);
          a("  ", locala, localth.ukn.ukN);
          a("  ", locala, localth.ukn.tLX);
        }
        i += 1;
      }
      a("", locala, this.field_favProto.ukH);
      a("", locala, this.field_favProto.ukJ);
      a("", locala, this.field_favProto.ukL);
      a("", locala, this.field_favProto.ukN);
      a("  ", locala, this.field_favProto.tLX);
    }
    locala.xI("----dump favitem end----");
    GMTrace.o(6308233216000L, 47000);
  }
  
  public final boolean xH(String paramString)
  {
    GMTrace.i(6308904304640L, 47005);
    if (bg.nm(paramString))
    {
      GMTrace.o(6308904304640L, 47005);
      return false;
    }
    Iterator localIterator = this.field_tagProto.ulP.iterator();
    while (localIterator.hasNext()) {
      if (paramString.equals((String)localIterator.next()))
      {
        GMTrace.o(6308904304640L, 47005);
        return false;
      }
    }
    this.field_tagProto.ulP.add(paramString);
    GMTrace.o(6308904304640L, 47005);
    return true;
  }
  
  private static abstract interface a
  {
    public abstract void xI(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */