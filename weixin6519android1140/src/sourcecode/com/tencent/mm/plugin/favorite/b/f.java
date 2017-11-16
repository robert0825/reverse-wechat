package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.tk;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class f
{
  public static String aw(List<th> paramList)
  {
    GMTrace.i(6264746672128L, 46676);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.v("MicroMsg.FavDataItemParser", "klem toXml data list empty");
      GMTrace.o(6264746672128L, 46676);
      return "";
    }
    int j = paramList.size();
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("<datalist count='").append(j).append("'>");
    int i = 0;
    if (i < j)
    {
      Object localObject1 = (th)paramList.get(i);
      localStringBuffer.append("<dataitem ");
      if (((th)localObject1).ujH) {
        localStringBuffer.append("datatype='").append(((th)localObject1).aGU).append("'");
      }
      if (((th)localObject1).ukk) {
        localStringBuffer.append(" datastatus='").append(((th)localObject1).ukj).append("'");
      }
      if (((th)localObject1).ujQ) {
        localStringBuffer.append(" dataid='").append(((th)localObject1).lhq).append("'");
      }
      if (((th)localObject1).ukw) {
        localStringBuffer.append(" htmlid='").append(bg.Sw(((th)localObject1).ukv)).append("'");
      }
      if (((th)localObject1).ukC) {
        localStringBuffer.append(" dataillegaltype='").append(((th)localObject1).ukB).append("'");
      }
      if (((th)localObject1).ukc) {
        localStringBuffer.append(" datasourceid='").append(((th)localObject1).ukb).append("'");
      }
      localStringBuffer.append(">");
      if (((th)localObject1).ujJ) {
        localStringBuffer.append("<datafmt>").append(((th)localObject1).ujI).append("</datafmt>");
      }
      if (((th)localObject1).ujm) {
        localStringBuffer.append("<datatitle>").append(bg.Sw(((th)localObject1).title)).append("</datatitle>");
      }
      if (((th)localObject1).ujn) {
        localStringBuffer.append("<datadesc>").append(bg.Sw(((th)localObject1).desc)).append("</datadesc>");
      }
      if (((th)localObject1).ujo) {
        localStringBuffer.append("<cdn_thumburl>").append(bg.Sw(((th)localObject1).giD)).append("</cdn_thumburl>");
      }
      if (((th)localObject1).ujr) {
        localStringBuffer.append("<thumb_width>").append(((th)localObject1).giI).append("</thumb_width>");
      }
      if (((th)localObject1).ujs) {
        localStringBuffer.append("<thumb_height>").append(((th)localObject1).giH).append("</thumb_height>");
      }
      if (((th)localObject1).uju) {
        localStringBuffer.append("<cdn_dataurl>").append(bg.Sw(((th)localObject1).ujt)).append("</cdn_dataurl>");
      }
      if (((th)localObject1).ujq) {
        localStringBuffer.append("<cdn_thumbkey>").append(bg.Sw(((th)localObject1).ujp)).append("</cdn_thumbkey>");
      }
      if (((th)localObject1).ujw) {
        localStringBuffer.append("<cdn_datakey>").append(bg.Sw(((th)localObject1).ujv)).append("</cdn_datakey>");
      }
      if (((th)localObject1).ujy) {
        localStringBuffer.append("<cdn_encryver>").append(((th)localObject1).ujx).append("</cdn_encryver>");
      }
      if (((th)localObject1).ujz) {
        localStringBuffer.append("<duration>").append(((th)localObject1).duration).append("</duration>");
      }
      if (((th)localObject1).ujB) {
        localStringBuffer.append("<stream_weburl>").append(bg.Sw(((th)localObject1).ujA)).append("</stream_weburl>");
      }
      if (((th)localObject1).ujD) {
        localStringBuffer.append("<stream_dataurl>").append(bg.Sw(((th)localObject1).ujC)).append("</stream_dataurl>");
      }
      if (((th)localObject1).ujF) {
        localStringBuffer.append("<stream_lowbandurl>").append(bg.Sw(((th)localObject1).ujE)).append("</stream_lowbandurl>");
      }
      if (((th)localObject1).ujG) {
        localStringBuffer.append("<dataext>").append(bg.Sw(((th)localObject1).eDk)).append("</dataext>");
      }
      if (((th)localObject1).ujL) {
        localStringBuffer.append("<fullmd5>").append(((th)localObject1).ujK).append("</fullmd5>");
      }
      if (((th)localObject1).ujN) {
        localStringBuffer.append("<head256md5>").append(((th)localObject1).ujM).append("</head256md5>");
      }
      if (((th)localObject1).ujP) {
        localStringBuffer.append("<fullsize>").append(((th)localObject1).ujO).append("</fullsize>");
      }
      if (((th)localObject1).ujW) {
        localStringBuffer.append("<thumbfullmd5>").append(((th)localObject1).ujV).append("</thumbfullmd5>");
      }
      if (((th)localObject1).ujY) {
        localStringBuffer.append("<thumbhead256md5>").append(((th)localObject1).ujX).append("</thumbhead256md5>");
      }
      if (((th)localObject1).uka) {
        localStringBuffer.append("<thumbfullsize>").append(((th)localObject1).ujZ).append("</thumbfullsize>");
      }
      if (((th)localObject1).uke) {
        localStringBuffer.append("<stream_videoid>").append(bg.Sw(((th)localObject1).ukd)).append("</stream_videoid>");
      }
      if (((th)localObject1).ukm) {
        localStringBuffer.append("<datasrctitle>").append(bg.Sw(((th)localObject1).ukl)).append("</datasrctitle>");
      }
      if (((th)localObject1).ukq) {
        localStringBuffer.append("<datasrcname>").append(bg.Sw(((th)localObject1).ukp)).append("</datasrcname>");
      }
      if (((th)localObject1).uks) {
        localStringBuffer.append("<datasrctime>").append(bg.Sw(((th)localObject1).ukr)).append("</datasrctime>");
      }
      if ((((th)localObject1).uky) && ((((th)localObject1).ukn == null) || (((th)localObject1).ukn.ukJ == null) || (((th)localObject1).ukn.ukJ.aYq() == 0))) {
        localStringBuffer.append("<canvasPageXml>").append(bg.Sw(((th)localObject1).canvasPageXml)).append("</canvasPageXml>");
      }
      if (((th)localObject1).ukx) {
        localStringBuffer.append("<statextstr>").append(bg.Sw(((th)localObject1).eTv)).append("</statextstr>");
      }
      if (((th)localObject1).ukE) {
        localStringBuffer.append("<recordxml>").append(((th)localObject1).ukD).append("</recordxml>");
      }
      Object localObject2 = ((th)localObject1).ukt;
      if (localObject2 != null)
      {
        localStringBuffer.append("<streamvideo>");
        localStringBuffer.append("<streamvideourl>").append(bg.Sw(((tk)localObject2).gkI)).append("</streamvideourl>");
        localStringBuffer.append("<streamvideototaltime>").append(((tk)localObject2).ulk).append("</streamvideototaltime>");
        localStringBuffer.append("<streamvideotitle>").append(bg.Sw(((tk)localObject2).gkK)).append("</streamvideotitle>");
        localStringBuffer.append("<streamvideowording>").append(bg.Sw(((tk)localObject2).gkL)).append("</streamvideowording>");
        localStringBuffer.append("<streamvideoweburl>").append(bg.Sw(((tk)localObject2).gkM)).append("</streamvideoweburl>");
        localStringBuffer.append("<streamvideoaduxinfo>").append(bg.Sw(((tk)localObject2).gkO)).append("</streamvideoaduxinfo>");
        localStringBuffer.append("<streamvideopublishid>").append(bg.Sw(((tk)localObject2).gkP)).append("</streamvideopublishid>");
        localStringBuffer.append("</streamvideo>");
      }
      localObject2 = ((th)localObject1).ukn;
      if ((localObject2 == null) || (((ti)localObject2).ukF == null) || (((ti)localObject2).ukF.aYq() == 0))
      {
        w.v("MicroMsg.FavDataItemParser", "klem toXml, data source item empty");
        label1408:
        localObject2 = ((th)localObject1).ukn;
        if ((localObject2 != null) && (((ti)localObject2).ukH != null) && (((ti)localObject2).ukH.aYq() != 0)) {
          break label1925;
        }
        w.v("MicroMsg.FavDataItemParser", "klem toXml, loc item empty");
        label1447:
        localObject2 = ((th)localObject1).ukn;
        if ((localObject2 != null) && (((ti)localObject2).ukJ != null) && (((ti)localObject2).ukJ.aYq() != 0)) {
          break label2104;
        }
        w.v("MicroMsg.FavDataItemParser", "klem toXml, url item empty");
        label1486:
        localObject2 = ((th)localObject1).ukn;
        if ((localObject2 != null) && (((ti)localObject2).ukL != null) && (((ti)localObject2).ukL.aYq() != 0)) {
          break label2355;
        }
        w.v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
        label1525:
        localObject1 = ((th)localObject1).ukn;
        if ((localObject1 != null) && (((ti)localObject1).ukN != null) && (((ti)localObject1).ukN.aYq() != 0)) {
          break label2549;
        }
        w.v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
      }
      for (;;)
      {
        localStringBuffer.append("</dataitem>");
        i += 1;
        break;
        localObject2 = ((ti)localObject2).ukF;
        localStringBuffer.append("<dataitemsource");
        if (((tj)localObject2).ukW) {
          localStringBuffer.append(" sourcetype='").append(((tj)localObject2).eDi).append("'");
        }
        if (((tj)localObject2).ula) {
          localStringBuffer.append(" sourceid='").append(((tj)localObject2).ukZ).append("'");
        }
        localStringBuffer.append(">");
        if (((tj)localObject2).ukX) {
          localStringBuffer.append("<fromusr>").append(bg.Sw(((tj)localObject2).eMI)).append("</fromusr>");
        }
        if (((tj)localObject2).ukY) {
          localStringBuffer.append("<tousr>").append(bg.Sw(((tj)localObject2).toUser)).append("</tousr>");
        }
        if (((tj)localObject2).ulc) {
          localStringBuffer.append("<realchatname>").append(bg.Sw(((tj)localObject2).ulb)).append("</realchatname>");
        }
        if (((tj)localObject2).uld) {
          localStringBuffer.append("<msgid>").append(((tj)localObject2).eQB).append("</msgid>");
        }
        if (((tj)localObject2).ule) {
          localStringBuffer.append("<eventid>").append(((tj)localObject2).eVH).append("</eventid>");
        }
        if (((tj)localObject2).ulf) {
          localStringBuffer.append("<appid>").append(((tj)localObject2).appId).append("</appid>");
        }
        if (((tj)localObject2).ulg) {
          localStringBuffer.append("<link>").append(bg.Sw(((tj)localObject2).gVf)).append("</link>");
        }
        if (((tj)localObject2).ulj) {
          localStringBuffer.append("<brandid>").append(bg.Sw(((tj)localObject2).eAr)).append("</brandid>");
        }
        localStringBuffer.append("</dataitemsource>");
        break label1408;
        label1925:
        localObject2 = ((ti)localObject2).ukH;
        localStringBuffer.append("<locitem>");
        if (((to)localObject2).ulr) {
          localStringBuffer.append("<label>").append(bg.Sw(((to)localObject2).label)).append("</label>");
        }
        if (((to)localObject2).ulp) {
          localStringBuffer.append("<lat>").append(((to)localObject2).lat).append("</lat>");
        }
        if (((to)localObject2).ulo) {
          localStringBuffer.append("<lng>").append(((to)localObject2).lng).append("</lng>");
        }
        if (((to)localObject2).ulq) {
          localStringBuffer.append("<scale>").append(((to)localObject2).eMn).append("</scale>");
        }
        if (((to)localObject2).uls) {
          localStringBuffer.append("<poiname>").append(((to)localObject2).eQm).append("</poiname>");
        }
        localStringBuffer.append("</locitem>");
        break label1447;
        label2104:
        localObject2 = ((ti)localObject2).ukJ;
        localStringBuffer.append("<weburlitem>");
        if (((uf)localObject2).umg) {
          localStringBuffer.append("<clean_url>").append(bg.Sw(((uf)localObject2).umf)).append("</clean_url>");
        }
        if (((uf)localObject2).ujn) {
          localStringBuffer.append("<pagedesc>").append(bg.Sw(((uf)localObject2).desc)).append("</pagedesc>");
        }
        if (((uf)localObject2).ulw) {
          localStringBuffer.append("<pagethumb_url>").append(bg.Sw(((uf)localObject2).thumbUrl)).append("</pagethumb_url>");
        }
        if (((uf)localObject2).ujm) {
          localStringBuffer.append("<pagetitle>").append(bg.Sw(((uf)localObject2).title)).append("</pagetitle>");
        }
        if (((uf)localObject2).umi) {
          localStringBuffer.append("<opencache>").append(((uf)localObject2).umh).append("</opencache>");
        }
        if (((uf)localObject2).umj) {
          localStringBuffer.append("<contentattr>").append(((uf)localObject2).giA).append("</contentattr>");
        }
        if (((uf)localObject2).uky) {
          localStringBuffer.append("<canvasPageXml>").append(bg.Sw(((uf)localObject2).canvasPageXml)).append("</canvasPageXml>");
        }
        localStringBuffer.append("</weburlitem>");
        break label1486;
        label2355:
        localObject2 = ((ti)localObject2).ukL;
        localStringBuffer.append("<productitem");
        if (((ts)localObject2).uly) {
          localStringBuffer.append(" type='").append(((ts)localObject2).type).append("'");
        }
        localStringBuffer.append(">");
        if (((ts)localObject2).ujm) {
          localStringBuffer.append("<producttitle>").append(bg.Sw(((ts)localObject2).title)).append("</producttitle>");
        }
        if (((ts)localObject2).ujn) {
          localStringBuffer.append("<productdesc>").append(bg.Sw(((ts)localObject2).desc)).append("</productdesc>");
        }
        if (((ts)localObject2).ulw) {
          localStringBuffer.append("<productthumb_url>").append(bg.Sw(((ts)localObject2).thumbUrl)).append("</productthumb_url>");
        }
        if (((ts)localObject2).ulx) {
          localStringBuffer.append("<productinfo>").append(bg.Sw(((ts)localObject2).info)).append("</productinfo>");
        }
        localStringBuffer.append("</productitem>");
        break label1525;
        label2549:
        localObject1 = ((ti)localObject1).ukN;
        localStringBuffer.append("<tvitem>");
        if (((tz)localObject1).ujm) {
          localStringBuffer.append("<tvtitle>").append(bg.Sw(((tz)localObject1).title)).append("</tvtitle>");
        }
        if (((tz)localObject1).ujn) {
          localStringBuffer.append("<tvdesc>").append(bg.Sw(((tz)localObject1).desc)).append("</tvdesc>");
        }
        if (((tz)localObject1).ulw) {
          localStringBuffer.append("<tvthumb_url>").append(bg.Sw(((tz)localObject1).thumbUrl)).append("</tvthumb_url>");
        }
        if (((tz)localObject1).ulx) {
          localStringBuffer.append("<tvinfo>").append(bg.Sw(((tz)localObject1).info)).append("</tvinfo>");
        }
        localStringBuffer.append("</tvitem>");
      }
    }
    localStringBuffer.append("</datalist>");
    paramList = localStringBuffer.toString();
    GMTrace.o(6264746672128L, 46676);
    return paramList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */