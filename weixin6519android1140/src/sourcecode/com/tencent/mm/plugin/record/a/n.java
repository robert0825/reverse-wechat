package com.tencent.mm.plugin.record.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.a.e;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.s;
import java.util.List;

public final class n
{
  public static String aw(List<th> paramList)
  {
    GMTrace.i(7512703107072L, 55974);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.w("MicroMsg.RecordMsgParser", "klem toXml data list empty");
      GMTrace.o(7512703107072L, 55974);
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
        localStringBuffer.append(" htmlid='").append(((th)localObject1).ukv).append("'");
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
        localStringBuffer.append("<cdnthumburl>").append(bg.Sw(((th)localObject1).giD)).append("</cdnthumburl>");
      }
      if (((th)localObject1).ujr) {
        localStringBuffer.append("<thumbwidth>").append(((th)localObject1).giI).append("</thumbwidth>");
      }
      if (((th)localObject1).ujs) {
        localStringBuffer.append("<thumbheight>").append(((th)localObject1).giH).append("</thumbheight>");
      }
      if (((th)localObject1).uju) {
        localStringBuffer.append("<cdndataurl>").append(bg.Sw(((th)localObject1).ujt)).append("</cdndataurl>");
      }
      if (((th)localObject1).ujq) {
        localStringBuffer.append("<cdnthumbkey>").append(bg.Sw(((th)localObject1).ujp)).append("</cdnthumbkey>");
      }
      if (((th)localObject1).ujw) {
        localStringBuffer.append("<cdndatakey>").append(bg.Sw(((th)localObject1).ujv)).append("</cdndatakey>");
      }
      if (((th)localObject1).ujy) {
        localStringBuffer.append("<cdnencryver>").append(((th)localObject1).ujx).append("</cdnencryver>");
      }
      if (((th)localObject1).ujz) {
        localStringBuffer.append("<duration>").append(((th)localObject1).duration).append("</duration>");
      }
      if (((th)localObject1).ujB) {
        localStringBuffer.append("<streamweburl>").append(bg.Sw(((th)localObject1).ujA)).append("</streamweburl>");
      }
      if (((th)localObject1).ujD) {
        localStringBuffer.append("<streamdataurl>").append(bg.Sw(((th)localObject1).ujC)).append("</streamdataurl>");
      }
      if (((th)localObject1).ujF) {
        localStringBuffer.append("<streamlowbandurl>").append(bg.Sw(((th)localObject1).ujE)).append("</streamlowbandurl>");
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
        localStringBuffer.append("<datasize>").append(((th)localObject1).ujO).append("</datasize>");
      }
      if (((th)localObject1).ujW) {
        localStringBuffer.append("<thumbfullmd5>").append(((th)localObject1).ujV).append("</thumbfullmd5>");
      }
      if (((th)localObject1).ujY) {
        localStringBuffer.append("<thumbhead256md5>").append(((th)localObject1).ujX).append("</thumbhead256md5>");
      }
      if (((th)localObject1).uka) {
        localStringBuffer.append("<thumbsize>").append(((th)localObject1).ujZ).append("</thumbsize>");
      }
      if (((th)localObject1).uke) {
        localStringBuffer.append("<streamvideoid>").append(bg.Sw(((th)localObject1).ukd)).append("</streamvideoid>");
      }
      if (((th)localObject1).ukm) {
        localStringBuffer.append("<sourcetitle>").append(bg.Sw(((th)localObject1).ukl)).append("</sourcetitle>");
      }
      if (((th)localObject1).ukq) {
        localStringBuffer.append("<sourcename>").append(bg.Sw(((th)localObject1).ukp)).append("</sourcename>");
      }
      if (((th)localObject1).uks) {
        localStringBuffer.append("<sourcetime>").append(bg.Sw(((th)localObject1).ukr)).append("</sourcetime>");
      }
      if (((th)localObject1).ukx) {
        localStringBuffer.append("<statextstr>").append(bg.Sw(((th)localObject1).eTv)).append("</statextstr>");
      }
      if (((th)localObject1).ukE) {
        localStringBuffer.append("<recordxml>").append(((th)localObject1).ukD).append("</recordxml>");
      }
      Object localObject2 = ((th)localObject1).ukn;
      if ((localObject2 == null) || (((ti)localObject2).ukF == null) || (((ti)localObject2).ukF.aYq() == 0))
      {
        w.w("MicroMsg.RecordMsgParser", "klem toXml, data source item empty");
        label1139:
        localObject2 = ((th)localObject1).ukn;
        if ((localObject2 != null) && (((ti)localObject2).ukH != null) && (((ti)localObject2).ukH.aYq() != 0)) {
          break label1595;
        }
        w.w("MicroMsg.RecordMsgParser", "klem toXml, loc item empty");
        label1178:
        localObject2 = ((th)localObject1).ukn;
        if ((localObject2 != null) && (((ti)localObject2).ukJ != null) && (((ti)localObject2).ukJ.aYq() != 0)) {
          break label1774;
        }
        w.w("MicroMsg.RecordMsgParser", "klem toXml, url item empty");
        label1217:
        localObject2 = ((th)localObject1).ukn;
        if ((localObject2 != null) && (((ti)localObject2).ukL != null) && (((ti)localObject2).ukL.aYq() != 0)) {
          break label1992;
        }
        w.w("MicroMsg.RecordMsgParser", "klem toXml, product item empty");
        label1256:
        localObject1 = ((th)localObject1).ukn;
        if ((localObject1 != null) && (((ti)localObject1).ukN != null) && (((ti)localObject1).ukN.aYq() != 0)) {
          break label2186;
        }
        w.w("MicroMsg.RecordMsgParser", "klem toXml, product item empty");
      }
      for (;;)
      {
        localStringBuffer.append("</dataitem>");
        i += 1;
        break;
        localObject2 = ((ti)localObject2).ukF;
        if (((tj)localObject2).ulf) {
          localStringBuffer.append("<appid>").append(((tj)localObject2).appId).append("</appid>");
        }
        if (((tj)localObject2).ulg) {
          localStringBuffer.append("<link>").append(bg.Sw(((tj)localObject2).gVf)).append("</link>");
        }
        if (((tj)localObject2).ulj) {
          localStringBuffer.append("<brandid>").append(bg.Sw(((tj)localObject2).eAr)).append("</brandid>");
        }
        if ((((tj)localObject2).ukX) && (((tj)localObject2).ulc))
        {
          if (((tj)localObject2).eMI.equals(((tj)localObject2).ulb))
          {
            localStringBuffer.append("<dataitemsource><fromusr>").append(bg.Sw(((tj)localObject2).eMI)).append("</fromusr></dataitemsource>");
            break label1139;
          }
          if ((!s.eb(((tj)localObject2).eMI)) && (!e.je(((tj)localObject2).ulb))) {
            break label1139;
          }
          localStringBuffer.append("<dataitemsource><realchatname>").append(bg.Sw(((tj)localObject2).ulb)).append("</realchatname></dataitemsource>");
          break label1139;
        }
        if (((tj)localObject2).ukX)
        {
          localStringBuffer.append("<dataitemsource><fromusr>").append(bg.Sw(((tj)localObject2).eMI)).append("</fromusr></dataitemsource>");
          break label1139;
        }
        if (!((tj)localObject2).ulc) {
          break label1139;
        }
        localStringBuffer.append("<dataitemsource><realchatname>").append(bg.Sw(((tj)localObject2).ulb)).append("</realchatname></dataitemsource>");
        break label1139;
        label1595:
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
        break label1178;
        label1774:
        localObject2 = ((ti)localObject2).ukJ;
        localStringBuffer.append("<weburlitem>");
        if (((uf)localObject2).umg) {
          localStringBuffer.append("<link>").append(bg.Sw(((uf)localObject2).umf)).append("</link>");
        }
        if (((uf)localObject2).ujn) {
          localStringBuffer.append("<desc>").append(bg.Sw(((uf)localObject2).desc)).append("</desc>");
        }
        if (((uf)localObject2).ulw) {
          localStringBuffer.append("<thumburl>").append(bg.Sw(((uf)localObject2).thumbUrl)).append("</thumburl>");
        }
        if (((uf)localObject2).ujm) {
          localStringBuffer.append("<title>").append(bg.Sw(((uf)localObject2).title)).append("</title>");
        }
        if (((uf)localObject2).umi) {
          localStringBuffer.append("<opencache>").append(((uf)localObject2).umh).append("</opencache>");
        }
        if (((uf)localObject2).umj) {
          localStringBuffer.append("<contentattr>").append(((uf)localObject2).giA).append("</contentattr>");
        }
        localStringBuffer.append("</weburlitem>");
        break label1217;
        label1992:
        localObject2 = ((ti)localObject2).ukL;
        localStringBuffer.append("<productitem");
        if (((ts)localObject2).uly) {
          localStringBuffer.append(" type='").append(((ts)localObject2).type).append("'");
        }
        localStringBuffer.append(">");
        if (((ts)localObject2).ujm) {
          localStringBuffer.append("<title>").append(bg.Sw(((ts)localObject2).title)).append("</title>");
        }
        if (((ts)localObject2).ujn) {
          localStringBuffer.append("<desc>").append(bg.Sw(((ts)localObject2).desc)).append("</desc>");
        }
        if (((ts)localObject2).ulw) {
          localStringBuffer.append("<thumburl>").append(bg.Sw(((ts)localObject2).thumbUrl)).append("</thumburl>");
        }
        if (((ts)localObject2).ulx) {
          localStringBuffer.append("<productinfo>").append(bg.Sw(((ts)localObject2).info)).append("</productinfo>");
        }
        localStringBuffer.append("</productitem>");
        break label1256;
        label2186:
        localObject1 = ((ti)localObject1).ukN;
        localStringBuffer.append("<tvitem>");
        if (((tz)localObject1).ujm) {
          localStringBuffer.append("<title>").append(bg.Sw(((tz)localObject1).title)).append("</title>");
        }
        if (((tz)localObject1).ujn) {
          localStringBuffer.append("<desc>").append(bg.Sw(((tz)localObject1).desc)).append("</desc>");
        }
        if (((tz)localObject1).ulw) {
          localStringBuffer.append("<thumburl>").append(bg.Sw(((tz)localObject1).thumbUrl)).append("</thumburl>");
        }
        if (((tz)localObject1).ulx) {
          localStringBuffer.append("<tvinfo>").append(bg.Sw(((tz)localObject1).info)).append("</tvinfo>");
        }
        localStringBuffer.append("</tvitem>");
      }
    }
    localStringBuffer.append("</datalist>");
    paramList = localStringBuffer.toString();
    GMTrace.o(7512703107072L, 55974);
    return paramList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\record\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */