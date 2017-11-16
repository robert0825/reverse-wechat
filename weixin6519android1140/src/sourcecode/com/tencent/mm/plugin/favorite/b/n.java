package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.tk;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class n
{
  public static void a(String paramString, tt paramtt)
  {
    GMTrace.i(16937606184960L, 126195);
    paramtt.ulB.clear();
    Object localObject1 = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      Object localObject2;
      try
      {
        paramString = ((DocumentBuilderFactory)localObject1).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes())));
        paramString.normalize();
        paramString = paramString.getDocumentElement().getElementsByTagName("datalist");
        if (paramString == null) {
          break label3525;
        }
        NodeList localNodeList = paramString.item(0).getChildNodes();
        if ((localNodeList == null) || (localNodeList.getLength() <= 0)) {
          break label3525;
        }
        int j = localNodeList.getLength();
        i = 0;
        if (i >= j) {
          break label3525;
        }
        localObject1 = localNodeList.item(i);
        paramString = bh.b((Node)localObject1);
        localObject1 = ((Element)localObject1).getElementsByTagName("recordxml");
        if ((localObject1 == null) || (((NodeList)localObject1).getLength() <= 0)) {
          break label3539;
        }
        localObject1 = bh.b(((NodeList)localObject1).item(0).getFirstChild());
        if (!paramString.trim().startsWith("<dataitem")) {
          break label3534;
        }
        paramString = bh.q(paramString, "dataitem");
        if (paramString == null) {
          break label3545;
        }
        th localth = new th();
        localth.zR(bg.getInt((String)paramString.get(".dataitem" + ".$datatype"), 0));
        localth.Qy((String)paramString.get(".dataitem" + ".$datasourceid"));
        localth.zS(bg.getInt((String)paramString.get(".dataitem" + ".$datastatus"), 0));
        localth.Qq((String)paramString.get(".dataitem" + ".datafmt"));
        localth.Qg((String)paramString.get(".dataitem" + ".datatitle"));
        localth.Qh((String)paramString.get(".dataitem" + ".datadesc"));
        localth.Qi((String)paramString.get(".dataitem" + ".cdn_thumburl"));
        localth.Qj((String)paramString.get(".dataitem" + ".cdn_thumbkey"));
        localth.zO(bg.getInt((String)paramString.get(".dataitem" + ".thumb_width"), 0));
        localth.zP(bg.getInt((String)paramString.get(".dataitem" + ".thumb_height"), 0));
        localth.Qk((String)paramString.get(".dataitem" + ".cdn_dataurl"));
        localth.Ql((String)paramString.get(".dataitem" + ".cdn_datakey"));
        localObject2 = (String)paramString.get(".dataitem" + ".duration");
        if ((localObject2 != null) && (((String)localObject2).length() > 0)) {
          localth.zQ(bg.getInt((String)localObject2, 0));
        }
        localth.Qn((String)paramString.get(".dataitem" + ".stream_dataurl"));
        localth.Qo((String)paramString.get(".dataitem" + ".stream_lowbandurl"));
        localth.Qm((String)paramString.get(".dataitem" + ".stream_weburl"));
        localth.QF((String)paramString.get(".dataitem" + ".canvasPageXml"));
        localth.Qr((String)paramString.get(".dataitem" + ".fullmd5"));
        localth.Qs((String)paramString.get(".dataitem" + ".head256md5"));
        localObject2 = (String)paramString.get(".dataitem" + ".fullsize");
        if (!bg.nm((String)localObject2)) {
          localth.ey(bg.getInt((String)localObject2, 0));
        }
        localth.Qp((String)paramString.get(".dataitem" + ".dataext"));
        localth.Qw((String)paramString.get(".dataitem" + ".thumbfullmd5"));
        localth.Qx((String)paramString.get(".dataitem" + ".thumbhead256md5"));
        localObject2 = (String)paramString.get(".dataitem" + ".thumbfullsize");
        if (!bg.nm((String)localObject2)) {
          localth.ez(bg.getInt((String)localObject2, 0));
        }
        localth.Qz((String)paramString.get(".dataitem" + ".stream_videoid"));
        localObject3 = (String)paramString.get(".dataitem" + ".$dataid");
        if (!bg.nm((String)localObject3))
        {
          localObject2 = localObject3;
          if (((String)localObject3).length() >= 32) {}
        }
        else
        {
          localObject2 = x.aX(localth.toString(), localth.aGU);
        }
        localth.Qt((String)localObject2);
        localth.QA((String)paramString.get(".dataitem" + ".datasrctitle"));
        localth.QB((String)paramString.get(".dataitem" + ".datasrcname"));
        localth.QC((String)paramString.get(".dataitem" + ".datasrctime"));
        localth.QE((String)paramString.get(".dataitem" + ".statextstr"));
        localth.QD((String)paramString.get(".dataitem" + ".$htmlid"));
        localth.zT(bg.getInt((String)paramString.get(".dataitem" + ".$dataillegaltype"), 0));
        if (localObject1 != null) {
          localth.QG((String)localObject1);
        }
        localObject1 = new tk();
        ((tk)localObject1).gkI = bg.aq((String)paramString.get(".dataitem" + ".streamvideo.streamvideourl"), "");
        ((tk)localObject1).ulk = bg.Sy((String)paramString.get(".dataitem" + ".streamvideo.streamvideototaltime"));
        ((tk)localObject1).gkK = bg.aq((String)paramString.get(".dataitem" + ".streamvideo.streamvideotitle"), "");
        ((tk)localObject1).gkL = bg.aq((String)paramString.get(".dataitem" + ".streamvideo.streamvideowording"), "");
        ((tk)localObject1).gkM = bg.aq((String)paramString.get(".dataitem" + ".streamvideo.streamvideoweburl"), "");
        ((tk)localObject1).gkO = bg.aq((String)paramString.get(".dataitem" + ".streamvideo.streamvideoaduxinfo"), "");
        ((tk)localObject1).gkP = bg.aq((String)paramString.get(".dataitem" + ".streamvideo.streamvideopublishid"), "");
        localth.a((tk)localObject1);
        localObject1 = new ti();
        localObject2 = ".dataitem" + ".dataitemsource";
        if (!paramString.containsKey(localObject2))
        {
          w.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
          localObject3 = ".dataitem" + ".locitem";
          if (!paramString.containsKey(localObject3))
          {
            w.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject3 });
            localObject2 = ".dataitem" + ".weburlitem";
            if (paramString.containsKey(localObject2)) {
              break label2878;
            }
            w.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
            localObject2 = ".dataitem" + ".productitem";
            if (paramString.containsKey(localObject2)) {
              break label3157;
            }
            w.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
            localObject2 = ".dataitem" + ".tvitem";
            if (paramString.containsKey(localObject2)) {
              break label3361;
            }
            w.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
            localth.a((ti)localObject1);
            paramtt.ulB.add(localth);
            break label3545;
          }
        }
        else
        {
          localObject3 = new tj();
          ((tj)localObject3).zU(bg.getInt((String)paramString.get((String)localObject2 + ".$sourcetype"), 0));
          ((tj)localObject3).QJ((String)paramString.get((String)localObject2 + ".$sourceid"));
          ((tj)localObject3).QH((String)paramString.get((String)localObject2 + ".fromusr"));
          ((tj)localObject3).QI((String)paramString.get((String)localObject2 + ".tousr"));
          ((tj)localObject3).QK((String)paramString.get((String)localObject2 + ".realchatname"));
          ((tj)localObject3).eB(bg.getLong((String)paramString.get((String)localObject2 + ".createtime"), 0L));
          ((tj)localObject3).QL((String)paramString.get((String)localObject2 + ".msgid"));
          ((tj)localObject3).eVH = ((String)paramString.get((String)localObject2 + ".eventid"));
          ((tj)localObject3).ule = true;
          ((tj)localObject3).QM((String)paramString.get((String)localObject2 + ".appid"));
          ((tj)localObject3).QN((String)paramString.get((String)localObject2 + ".link"));
          ((tj)localObject3).QO((String)paramString.get((String)localObject2 + ".brandid"));
          ((ti)localObject1).c((tj)localObject3);
          continue;
        }
        localObject2 = new to();
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.FavProtoItemParser", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
        GMTrace.o(16937606184960L, 126195);
        return;
      }
      if (!bg.nm((String)paramString.get((String)localObject3 + ".label"))) {
        ((to)localObject2).QP((String)paramString.get((String)localObject3 + ".label"));
      }
      if (!bg.nm((String)paramString.get((String)localObject3 + ".poiname"))) {
        ((to)localObject2).QQ((String)paramString.get((String)localObject3 + ".poiname"));
      }
      String str = (String)paramString.get((String)localObject3 + ".lng");
      if (!bg.nm(str)) {
        ((to)localObject2).p(bg.getDouble(str, 0.0D));
      }
      str = (String)paramString.get((String)localObject3 + ".lat");
      if (!bg.nm(str)) {
        ((to)localObject2).q(bg.getDouble(str, 0.0D));
      }
      Object localObject3 = (String)paramString.get((String)localObject3 + ".scale");
      if (!bg.nm((String)localObject3))
      {
        if (((String)localObject3).indexOf('.') == -1) {
          break label2863;
        }
        ((to)localObject2).zV(bg.getInt(((String)localObject3).substring(0, ((String)localObject3).indexOf('.')), -1));
      }
      for (;;)
      {
        ((ti)localObject1).a((to)localObject2);
        break;
        label2863:
        ((to)localObject2).zV(bg.getInt((String)localObject3, -1));
      }
      label2878:
      localObject3 = new uf();
      ((uf)localObject3).Rn((String)paramString.get((String)localObject2 + ".clean_url"));
      ((uf)localObject3).Rm((String)paramString.get((String)localObject2 + ".pagedesc"));
      ((uf)localObject3).Ro((String)paramString.get((String)localObject2 + ".pagethumb_url"));
      ((uf)localObject3).Rl((String)paramString.get((String)localObject2 + ".pagetitle"));
      ((uf)localObject3).Aa(bg.getInt((String)paramString.get((String)localObject2 + ".opencache"), 0));
      ((uf)localObject3).Ab(bg.getInt((String)paramString.get((String)localObject2 + ".contentattr"), 0));
      ((uf)localObject3).Rp((String)paramString.get((String)localObject2 + ".canvasPageXml"));
      ((ti)localObject1).a((uf)localObject3);
      continue;
      label3157:
      localObject3 = new ts();
      ((ts)localObject3).QR((String)paramString.get((String)localObject2 + ".producttitle"));
      ((ts)localObject3).QS((String)paramString.get((String)localObject2 + ".productdesc"));
      ((ts)localObject3).QT((String)paramString.get((String)localObject2 + ".productthumb_url"));
      ((ts)localObject3).QU((String)paramString.get((String)localObject2 + ".productinfo"));
      ((ts)localObject3).zW(bg.getInt((String)paramString.get((String)localObject2 + ".$type"), 0));
      ((ti)localObject1).a((ts)localObject3);
      continue;
      label3361:
      localObject3 = new tz();
      ((tz)localObject3).Rh((String)paramString.get((String)localObject2 + ".tvtitle"));
      ((tz)localObject3).Ri((String)paramString.get((String)localObject2 + ".tvdesc"));
      ((tz)localObject3).Rj((String)paramString.get((String)localObject2 + ".tvthumb_url"));
      ((tz)localObject3).Rk((String)paramString.get((String)localObject2 + ".tvinfo"));
      ((ti)localObject1).a((tz)localObject3);
      continue;
      label3525:
      GMTrace.o(16937606184960L, 126195);
      return;
      label3534:
      paramString = null;
      continue;
      label3539:
      localObject1 = null;
      continue;
      label3545:
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */