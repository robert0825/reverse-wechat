package com.tencent.mm.plugin.card.model;

import android.app.Application;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.gw;
import com.tencent.mm.g.a.gw.a;
import com.tencent.mm.g.a.nq;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.i;
import com.tencent.mm.plugin.card.sharecard.a.c.a;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.jk;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class al
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private com.tencent.mm.sdk.b.c jAA;
  private com.tencent.mm.sdk.b.c jAB;
  private com.tencent.mm.plugin.card.ui.b jAC;
  private com.tencent.mm.sdk.b.c jAD;
  private com.tencent.mm.sdk.b.c jAE;
  private bt.a jAF;
  private bt.a jAG;
  private com.tencent.mm.plugin.card.a.b jAh;
  private c jAi;
  private ak jAj;
  private h jAk;
  private com.tencent.mm.plugin.card.a.m jAl;
  private com.tencent.mm.plugin.card.sharecard.a.a jAm;
  private com.tencent.mm.plugin.card.sharecard.model.k jAn;
  private com.tencent.mm.plugin.card.sharecard.model.o jAo;
  private com.tencent.mm.plugin.card.sharecard.a.c jAp;
  private com.tencent.mm.plugin.card.a.k jAq;
  private com.tencent.mm.plugin.card.a.e jAr;
  private com.tencent.mm.plugin.card.a.l jAs;
  private d jAt;
  private i jAu;
  private com.tencent.mm.plugin.card.a.c jAv;
  private com.tencent.mm.plugin.card.a.g jAw;
  private l jAx;
  private j jAy;
  private com.tencent.mm.sdk.b.c jAz;
  public ae mHandler;
  
  static
  {
    GMTrace.i(4921227214848L, 36666);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("USERCARDINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4911429320704L, 36593);
        String[] arrayOfString = c.fTX;
        GMTrace.o(4911429320704L, 36593);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("PENDINGCARDIDINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4918005989376L, 36642);
        String[] arrayOfString = ak.fTX;
        GMTrace.o(4918005989376L, 36642);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("CARDMSGINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4901899862016L, 36522);
        String[] arrayOfString = h.fTX;
        GMTrace.o(4901899862016L, 36522);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("SHARECARDINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4913174151168L, 36606);
        String[] arrayOfString = com.tencent.mm.plugin.card.sharecard.model.k.fTX;
        GMTrace.o(4913174151168L, 36606);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("SHARECARDSYNCITEMINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4907671224320L, 36565);
        String[] arrayOfString = com.tencent.mm.plugin.card.sharecard.model.o.fTX;
        GMTrace.o(4907671224320L, 36565);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("CARDQRCODECONFI_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(18907385561088L, 140871);
        String[] arrayOfString = j.fTX;
        GMTrace.o(18907385561088L, 140871);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("CARDQRCODEDATAINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(18907788214272L, 140874);
        String[] arrayOfString = l.fTX;
        GMTrace.o(18907788214272L, 140874);
        return arrayOfString;
      }
    });
    GMTrace.o(4921227214848L, 36666);
  }
  
  public al()
  {
    GMTrace.i(4918140207104L, 36643);
    this.jAq = null;
    this.jAr = null;
    this.jAs = null;
    this.jAt = null;
    this.jAu = null;
    this.mHandler = new ae(Looper.getMainLooper());
    this.jAz = new com.tencent.mm.plugin.card.a.n();
    this.jAA = new com.tencent.mm.plugin.card.a.o();
    this.jAB = new com.tencent.mm.plugin.card.a.a();
    this.jAC = new com.tencent.mm.plugin.card.ui.b();
    this.jAD = new com.tencent.mm.sdk.b.c() {};
    this.jAE = new com.tencent.mm.sdk.b.c() {};
    this.jAF = new bt.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(4915187417088L, 36621);
        final String str = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        if ((str == null) || (str.length() == 0))
        {
          w.e("MicroMsg.SubCoreCard.CardMsgListener", "onReceiveMsg, msgContent is null");
          GMTrace.o(4915187417088L, 36621);
          return;
        }
        al.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4893444145152L, 36459);
            com.tencent.mm.plugin.card.a.k localk = al.akr();
            Object localObject1 = str;
            String str1 = paramAnonymousa.gtM.tQd;
            w.i("MicroMsg.CardMsgManager", "card onReceiveMsg msgId is " + str1);
            if (!TextUtils.isEmpty((CharSequence)localObject1))
            {
              Object localObject2 = bh.q((String)localObject1, "sysmsg");
              if (localObject2 == null) {
                localObject1 = null;
              }
              for (;;)
              {
                if (localObject1 == null)
                {
                  w.e("MicroMsg.CardMsgManager", "card msg == null");
                  GMTrace.o(4893444145152L, 36459);
                  return;
                  localObject1 = new g();
                  Object localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.card_type");
                  label164:
                  label284:
                  label378:
                  label421:
                  String str2;
                  if ((!TextUtils.isEmpty((CharSequence)localObject3)) && (com.tencent.mm.plugin.card.b.l.uE((String)localObject3)))
                  {
                    ((g)localObject1).field_card_type = Integer.valueOf((String)localObject3).intValue();
                    ((g)localObject1).field_title = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.title"));
                    ((g)localObject1).field_description = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.description"));
                    ((g)localObject1).field_logo_url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.logo_url"));
                    ((g)localObject1).field_logo_color = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.logo_color"));
                    localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.time");
                    if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.uE((String)localObject3))) {
                      break label1181;
                    }
                    if (Long.valueOf((String)localObject3).longValue() < 2147483647L) {
                      break label1165;
                    }
                    ((g)localObject1).field_time = Integer.MAX_VALUE;
                    ((g)localObject1).field_card_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.card_id"));
                    ((g)localObject1).field_card_tp_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.card_tp_id"));
                    ((g)localObject1).field_msg_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_id"));
                    localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_type");
                    if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.uE((String)localObject3))) {
                      break label1197;
                    }
                    ((g)localObject1).field_msg_type = Integer.valueOf((String)localObject3).intValue();
                    localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.jump_type");
                    if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.uE((String)localObject3))) {
                      break label1206;
                    }
                    ((g)localObject1).field_jump_type = Integer.valueOf((String)localObject3).intValue();
                    ((g)localObject1).field_url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.url"));
                    str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.button.text");
                    if (!TextUtils.isEmpty(str2))
                    {
                      localObject3 = new jk();
                      ((jk)localObject3).text = str2;
                      ((jk)localObject3).url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.button.url"));
                      str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.button.action_type");
                      if ((TextUtils.isEmpty(str2)) || (!com.tencent.mm.plugin.card.b.l.uE(str2))) {
                        break label1215;
                      }
                      ((jk)localObject3).jzr = Integer.valueOf(str2).intValue();
                      label536:
                      ((g)localObject1).jzg = ((jk)localObject3);
                    }
                  }
                  try
                  {
                    ((g)localObject1).field_buttonData = ((g)localObject1).jzg.toByteArray();
                    str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.text");
                    if (!TextUtils.isEmpty(str2))
                    {
                      localObject3 = new jo();
                      ((jo)localObject3).text = str2;
                      ((jo)localObject3).url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.url"));
                      str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.type");
                      if ((TextUtils.isEmpty(str2)) || (!com.tencent.mm.plugin.card.b.l.uE(str2))) {
                        break label1265;
                      }
                      ((jo)localObject3).type = Integer.valueOf(str2).intValue();
                      str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.endtime");
                      if ((TextUtils.isEmpty(str2)) || (!com.tencent.mm.plugin.card.b.l.uE(str2))) {
                        break label1290;
                      }
                      if (Long.valueOf(str2).longValue() < 2147483647L) {
                        break label1274;
                      }
                      ((jo)localObject3).oNd = Integer.MAX_VALUE;
                      ((g)localObject1).jzh = ((jo)localObject3);
                    }
                  }
                  catch (Exception localException1)
                  {
                    try
                    {
                      for (;;)
                      {
                        ((g)localObject1).field_operData = ((g)localObject1).jzh.toByteArray();
                        localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.report_scene");
                        if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.uE((String)localObject3))) {
                          break label1347;
                        }
                        ((g)localObject1).field_report_scene = Integer.valueOf((String)localObject3).intValue();
                        ((g)localObject1).field_read_state = 1;
                        ((g)localObject1).field_accept_buttons = com.tencent.mm.plugin.card.a.k.g((Map)localObject2, ".sysmsg.carditemmsg");
                        ((g)localObject1).field_jump_buttons = com.tencent.mm.plugin.card.a.k.f((Map)localObject2, ".sysmsg.carditemmsg");
                        localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.get_layout_scene");
                        if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.uE((String)localObject3))) {
                          break label1356;
                        }
                        ((g)localObject1).jzk = Integer.valueOf((String)localObject3).intValue();
                        ((g)localObject1).field_consumed_box_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.consumed_box_id"));
                        ((g)localObject1).jza = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.reddot_wording"));
                        ((g)localObject1).jzb = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.reddot_buff"));
                        ((g)localObject1).jzc = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.reddot_icon_url"));
                        ((g)localObject1).jzd = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_tips.title"));
                        ((g)localObject1).jze = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_tips.icon_url"));
                        localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_scene");
                        if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.uE((String)localObject3))) {
                          break label1365;
                        }
                        ((g)localObject1).jzl = Integer.valueOf((String)localObject3).intValue();
                        w.i("MicroMsg.CardMsgManager", "msg_scene is " + (String)localObject3);
                        localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.need_check");
                        w.i("MicroMsg.CardMsgManager", "need_check:" + (String)localObject3);
                        if (TextUtils.isEmpty((CharSequence)localObject3)) {
                          break label1374;
                        }
                        ((g)localObject1).jzf = ((String)localObject3).equals("true");
                        str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.all_unavailable");
                        w.i("MicroMsg.CardMsgManager", "all_Unavailable:" + (String)localObject3);
                        if (TextUtils.isEmpty(str2)) {
                          break label1383;
                        }
                        ((g)localObject1).jzm = str2.equals("true");
                        ((g)localObject1).field_unavailable_qr_code_list = com.tencent.mm.plugin.card.a.k.h((Map)localObject2, ".sysmsg.carditemmsg");
                        break;
                        ((g)localObject1).field_card_type = 0;
                        break label164;
                        label1165:
                        ((g)localObject1).field_time = Integer.valueOf((String)localObject3).intValue();
                        break label284;
                        label1181:
                        ((g)localObject1).field_time = ((int)(System.currentTimeMillis() / 1000L));
                        break label284;
                        label1197:
                        ((g)localObject1).field_msg_type = 0;
                        break label378;
                        label1206:
                        ((g)localObject1).field_jump_type = 1;
                        break label421;
                        label1215:
                        ((jk)localObject3).jzr = 0;
                        break label536;
                        localException1 = localException1;
                        w.e("MicroMsg.CardMsgInfo", "setCardButton fail, ex = %s", new Object[] { localException1.getMessage() });
                        w.printErrStackTrace("MicroMsg.CardMsgInfo", localException1, "", new Object[0]);
                        continue;
                        label1265:
                        localException1.type = 0;
                        continue;
                        label1274:
                        localException1.oNd = Integer.valueOf(str2).intValue();
                      }
                      label1290:
                      localException1.oNd = ((int)(System.currentTimeMillis() / 1000L));
                    }
                    catch (Exception localException2)
                    {
                      for (;;)
                      {
                        w.e("MicroMsg.CardMsgInfo", "setOperationRegion fail, ex = %s", new Object[] { localException2.getMessage() });
                        w.printErrStackTrace("MicroMsg.CardMsgInfo", localException2, "", new Object[0]);
                        continue;
                        label1347:
                        ((g)localObject1).field_report_scene = 2;
                        continue;
                        label1356:
                        ((g)localObject1).jzk = 0;
                        continue;
                        label1365:
                        ((g)localObject1).jzl = 0;
                        continue;
                        label1374:
                        ((g)localObject1).jzf = false;
                        continue;
                        label1383:
                        ((g)localObject1).jzm = false;
                      }
                    }
                  }
                }
              }
              if (TextUtils.isEmpty(((g)localObject1).field_card_id)) {
                w.e("MicroMsg.CardMsgManager", "card id == null");
              }
              localObject2 = ((g)localObject1).field_msg_id;
              ((g)localObject1).field_msg_id = str1;
              if (TextUtils.isEmpty(((g)localObject1).field_msg_id)) {
                ((g)localObject1).field_msg_id = ((String)localObject2);
              }
              if (TextUtils.isEmpty(((g)localObject1).field_msg_id)) {
                ((g)localObject1).field_msg_id = System.currentTimeMillis();
              }
              w.i("MicroMsg.CardMsgManager", "msg.field_msg_id : " + ((g)localObject1).field_msg_id);
              w.i("MicroMsg.CardMsgManager", "msg for msg_type ==  " + ((g)localObject1).field_msg_type);
              if (((g)localObject1).jzk != 0)
              {
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vrg, Integer.valueOf(((g)localObject1).jzk));
              }
              w.i("MicroMsg.CardMsgManager", "reddot_buff is " + ((g)localObject1).jzb);
              if (TextUtils.isEmpty(((g)localObject1).jzb)) {
                break label1972;
              }
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vrc, ((g)localObject1).jzb);
              if ((((g)localObject1).field_msg_type & 0x1) != 0)
              {
                w.i("MicroMsg.CardMsgManager", "msg_tips_title is " + ((g)localObject1).jzd);
                w.i("MicroMsg.CardMsgManager", "msg_tips_icon_url is " + ((g)localObject1).jze);
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vre, ((g)localObject1).jzd);
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vrf, ((g)localObject1).jze);
              }
              boolean bool2 = com.tencent.mm.s.c.vK().aD(262152, 266256);
              boolean bool1 = bool2;
              if (!bool2)
              {
                bool1 = bool2;
                if ((((g)localObject1).field_msg_type & 0x40) != 0)
                {
                  com.tencent.mm.s.c.vK().k(262152, true);
                  bool1 = true;
                }
              }
              if (!bool1) {
                break label1983;
              }
              w.i("MicroMsg.CardMsgManager", "has card new msg, return");
              label1773:
              if ((((g)localObject1).field_msg_type & 0x1) != 0)
              {
                if (localk.tQ(((g)localObject1).field_msg_id)) {
                  break label2574;
                }
                localk.jxx.add(localObject1);
                com.tencent.mm.plugin.card.a.k.c((g)localObject1);
                if ((((g)localObject1).field_msg_type & 0x80) != 0) {
                  localk.jxy += 1;
                }
              }
            }
            for (;;)
            {
              at.AR();
              com.tencent.mm.y.c.xh().set(139268, Integer.valueOf(localk.jxy));
              localk.a((g)localObject1);
              if ((((g)localObject1).field_msg_type & 0x2) != 0)
              {
                al.akm();
                com.tencent.mm.plugin.card.a.b.lD(((g)localObject1).jzk);
              }
              if ((((g)localObject1).field_msg_type & 0x4) != 0) {
                localk.aic();
              }
              if ((((g)localObject1).field_msg_type & 0x8) != 0) {
                al.akt().m(((g)localObject1).field_card_id, ((g)localObject1).field_card_tp_id, ((g)localObject1).field_report_scene);
              }
              if ((((g)localObject1).field_msg_type & 0x400) != 0)
              {
                ((g)localObject1).akh();
                al.akD().b((g)localObject1);
              }
              com.tencent.mm.plugin.card.b.l.amU();
              GMTrace.o(4893444145152L, 36459);
              return;
              label1972:
              w.e("MicroMsg.CardMsgManager", "reddot_buff is empty");
              break;
              label1983:
              w.i("MicroMsg.CardMsgManager", "not has new!");
              int i = 0;
              label2024:
              int j;
              label2093:
              int k;
              if ((((g)localObject1).field_msg_type & 0x20) != 0)
              {
                com.tencent.mm.s.c.vK().l(262152, true);
                w.i("MicroMsg.CardMsgManager", "has reddot");
                i = 1;
                j = 0;
                if (TextUtils.isEmpty(((g)localObject1).jza)) {
                  break label2317;
                }
                w.i("MicroMsg.CardMsgManager", "reddot_wording is " + ((g)localObject1).jza);
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vra, ((g)localObject1).jza);
                com.tencent.mm.s.c.vK().a(w.a.vqU, true);
                j = 1;
                k = 0;
                w.i("MicroMsg.CardMsgManager", "reddot_icon_url is " + ((g)localObject1).jzc);
                if (TextUtils.isEmpty(((g)localObject1).jzc)) {
                  break label2328;
                }
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vrd, ((g)localObject1).jzc);
                com.tencent.mm.s.c.vK().a(w.a.vqV, true);
                k = 1;
                label2162:
                if ((i == 0) || (j == 0) || (k == 0))
                {
                  if ((i == 0) || (j == 0) || (k != 0)) {
                    break label2339;
                  }
                  com.tencent.mm.s.c.vK().a(w.a.vqV, false);
                  at.AR();
                  com.tencent.mm.y.c.xh().a(w.a.vrd, "");
                }
              }
              for (;;)
              {
                if ((i == 0) && (j == 0) && (k == 0)) {
                  break label2572;
                }
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vrr, ((g)localObject1).field_card_id);
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vrs, Boolean.valueOf(((g)localObject1).jzf));
                w.i("MicroMsg.CardMsgManager", "card_id:" + ((g)localObject1).field_card_id + "  need_check:" + ((g)localObject1).jzf);
                break;
                w.e("MicroMsg.CardMsgManager", "not has reddot!");
                break label2024;
                label2317:
                w.e("MicroMsg.CardMsgManager", "reddot_wording is empty!");
                break label2093;
                label2328:
                w.e("MicroMsg.CardMsgManager", "reddot_icon_url is empty");
                break label2162;
                label2339:
                if ((i != 0) && (j == 0) && (k != 0))
                {
                  com.tencent.mm.s.c.vK().a(w.a.vqU, false);
                  at.AR();
                  com.tencent.mm.y.c.xh().a(w.a.vra, "");
                }
                else if ((i == 0) && (j != 0) && (k != 0))
                {
                  com.tencent.mm.s.c.vK().l(262152, false);
                }
                else if ((i != 0) && (j == 0) && (k == 0))
                {
                  com.tencent.mm.s.c.vK().a(w.a.vqV, false);
                  at.AR();
                  com.tencent.mm.y.c.xh().a(w.a.vrd, "");
                  com.tencent.mm.s.c.vK().a(w.a.vqU, false);
                  at.AR();
                  com.tencent.mm.y.c.xh().a(w.a.vra, "");
                }
                else if ((i == 0) && (j != 0) && (k == 0))
                {
                  com.tencent.mm.s.c.vK().a(w.a.vqV, false);
                  at.AR();
                  com.tencent.mm.y.c.xh().a(w.a.vrd, "");
                  com.tencent.mm.s.c.vK().l(262152, false);
                }
                else if ((i == 0) && (j == 0) && (k != 0))
                {
                  com.tencent.mm.s.c.vK().a(w.a.vqU, false);
                  at.AR();
                  com.tencent.mm.y.c.xh().a(w.a.vra, "");
                  com.tencent.mm.s.c.vK().l(262152, false);
                }
              }
              label2572:
              break label1773;
              label2574:
              w.e("MicroMsg.CardMsgManager", "msg for id " + ((g)localObject1).field_msg_id + " is exist!!");
              localk.tR(((g)localObject1).field_msg_id);
              localk.jxx.add(localObject1);
              com.tencent.mm.plugin.card.a.k.c((g)localObject1);
            }
          }
        });
        GMTrace.o(4915187417088L, 36621);
      }
    };
    this.jAG = new bt.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(4893712580608L, 36461);
        final String str = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        if ((str == null) || (str.length() == 0))
        {
          w.e("MicroMsg.SubCoreCard.notifyShareCardListener", "onReceiveMsg, msgContent is null");
          GMTrace.o(4893712580608L, 36461);
          return;
        }
        al.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4905121087488L, 36546);
            Object localObject1 = al.akx();
            Object localObject2 = str;
            String str = paramAnonymousa.gtM.tQd;
            w.i("MicroMsg.ShareCardMsgMgr", "sharecard onReceiveMsg msgId is " + str);
            if (!TextUtils.isEmpty((CharSequence)localObject2))
            {
              localObject2 = bh.q((String)localObject2, "sysmsg");
              if (localObject2 == null)
              {
                localObject1 = null;
                if (localObject1 == null)
                {
                  w.e("MicroMsg.ShareCardMsgMgr", "card msg == null");
                  GMTrace.o(4905121087488L, 36546);
                }
              }
              else
              {
                localObject1 = new c.a((com.tencent.mm.plugin.card.sharecard.a.c)localObject1);
                str = (String)((Map)localObject2).get(".sysmsg.notifysharecard.state_flag");
                if ((!TextUtils.isEmpty(str)) && (com.tencent.mm.plugin.card.b.l.uE(str))) {}
                for (((c.a)localObject1).jAW = Integer.valueOf(str).intValue();; ((c.a)localObject1).jAW = 0)
                {
                  ((c.a)localObject1).username = ((String)((Map)localObject2).get(".sysmsg.notifysharecard.username"));
                  ((c.a)localObject1).eTJ = ((String)((Map)localObject2).get(".sysmsg.notifysharecard.card_id"));
                  break;
                }
              }
              if (TextUtils.isEmpty(((c.a)localObject1).eTJ)) {
                w.e("MicroMsg.ShareCardMsgMgr", "card id == null");
              }
              w.i("MicroMsg.ShareCardMsgMgr", "sharecard doSyncNetScene card id is " + ((c.a)localObject1).eTJ);
              al.aku().akE();
              com.tencent.mm.plugin.card.b.l.amW();
            }
            GMTrace.o(4905121087488L, 36546);
          }
        });
        GMTrace.o(4893712580608L, 36461);
      }
    };
    File localFile = new File(m.jzw);
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    localFile = new File(m.jzx);
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    GMTrace.o(4918140207104L, 36643);
  }
  
  public static com.tencent.mm.plugin.card.a.c akA()
  {
    GMTrace.i(4920958779392L, 36664);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAv == null) {
      akl().jAv = new com.tencent.mm.plugin.card.a.c();
    }
    com.tencent.mm.plugin.card.a.c localc = akl().jAv;
    GMTrace.o(4920958779392L, 36664);
    return localc;
  }
  
  public static l akB()
  {
    GMTrace.i(18910472568832L, 140894);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAx == null)
    {
      localObject = akl();
      at.AR();
      ((al)localObject).jAx = new l(com.tencent.mm.y.c.yH());
    }
    Object localObject = akl().jAx;
    GMTrace.o(18910472568832L, 140894);
    return (l)localObject;
  }
  
  public static j akC()
  {
    GMTrace.i(18910606786560L, 140895);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAy == null)
    {
      localObject = akl();
      at.AR();
      ((al)localObject).jAy = new j(com.tencent.mm.y.c.yH());
    }
    Object localObject = akl().jAy;
    GMTrace.o(18910606786560L, 140895);
    return (j)localObject;
  }
  
  public static com.tencent.mm.plugin.card.a.g akD()
  {
    GMTrace.i(18910741004288L, 140896);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAw == null) {
      akl().jAw = new com.tencent.mm.plugin.card.a.g();
    }
    com.tencent.mm.plugin.card.a.g localg = akl().jAw;
    GMTrace.o(18910741004288L, 140896);
    return localg;
  }
  
  private static al akl()
  {
    GMTrace.i(4918274424832L, 36644);
    al localal2 = (al)at.AK().gZ("plugin.card");
    al localal1 = localal2;
    if (localal2 == null)
    {
      localal1 = new al();
      at.AK().a("plugin.card", localal1);
    }
    GMTrace.o(4918274424832L, 36644);
    return localal1;
  }
  
  public static com.tencent.mm.plugin.card.a.b akm()
  {
    GMTrace.i(4919079731200L, 36650);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAh == null) {
      akl().jAh = new com.tencent.mm.plugin.card.a.b();
    }
    com.tencent.mm.plugin.card.a.b localb = akl().jAh;
    GMTrace.o(4919079731200L, 36650);
    return localb;
  }
  
  public static c akn()
  {
    GMTrace.i(4919213948928L, 36651);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAi == null)
    {
      localObject = akl();
      at.AR();
      ((al)localObject).jAi = new c(com.tencent.mm.y.c.yH());
    }
    Object localObject = akl().jAi;
    GMTrace.o(4919213948928L, 36651);
    return (c)localObject;
  }
  
  public static ak ako()
  {
    GMTrace.i(4919348166656L, 36652);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAj == null)
    {
      localObject = akl();
      at.AR();
      ((al)localObject).jAj = new ak(com.tencent.mm.y.c.yH());
    }
    Object localObject = akl().jAj;
    GMTrace.o(4919348166656L, 36652);
    return (ak)localObject;
  }
  
  public static h akp()
  {
    GMTrace.i(4919482384384L, 36653);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAk == null)
    {
      localObject = akl();
      at.AR();
      ((al)localObject).jAk = new h(com.tencent.mm.y.c.yH());
    }
    Object localObject = akl().jAk;
    GMTrace.o(4919482384384L, 36653);
    return (h)localObject;
  }
  
  public static com.tencent.mm.plugin.card.a.m akq()
  {
    GMTrace.i(4919616602112L, 36654);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAl == null) {
      akl().jAl = new com.tencent.mm.plugin.card.a.m();
    }
    com.tencent.mm.plugin.card.a.m localm = akl().jAl;
    GMTrace.o(4919616602112L, 36654);
    return localm;
  }
  
  public static com.tencent.mm.plugin.card.a.k akr()
  {
    GMTrace.i(4919750819840L, 36655);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAq == null) {
      akl().jAq = new com.tencent.mm.plugin.card.a.k();
    }
    com.tencent.mm.plugin.card.a.k localk = akl().jAq;
    GMTrace.o(4919750819840L, 36655);
    return localk;
  }
  
  public static com.tencent.mm.plugin.card.a.e aks()
  {
    GMTrace.i(4919885037568L, 36656);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAr == null) {
      akl().jAr = new com.tencent.mm.plugin.card.a.e();
    }
    com.tencent.mm.plugin.card.a.e locale = akl().jAr;
    GMTrace.o(4919885037568L, 36656);
    return locale;
  }
  
  public static com.tencent.mm.plugin.card.a.l akt()
  {
    GMTrace.i(4920019255296L, 36657);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAs == null) {
      akl().jAs = new com.tencent.mm.plugin.card.a.l();
    }
    com.tencent.mm.plugin.card.a.l locall = akl().jAs;
    GMTrace.o(4920019255296L, 36657);
    return locall;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.a.a aku()
  {
    GMTrace.i(4920153473024L, 36658);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAm == null) {
      akl().jAm = new com.tencent.mm.plugin.card.sharecard.a.a();
    }
    com.tencent.mm.plugin.card.sharecard.a.a locala = akl().jAm;
    GMTrace.o(4920153473024L, 36658);
    return locala;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.model.k akv()
  {
    GMTrace.i(4920287690752L, 36659);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAn == null)
    {
      localObject = akl();
      at.AR();
      ((al)localObject).jAn = new com.tencent.mm.plugin.card.sharecard.model.k(com.tencent.mm.y.c.yH());
    }
    Object localObject = akl().jAn;
    GMTrace.o(4920287690752L, 36659);
    return (com.tencent.mm.plugin.card.sharecard.model.k)localObject;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.model.o akw()
  {
    GMTrace.i(4920421908480L, 36660);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAo == null)
    {
      localObject = akl();
      at.AR();
      ((al)localObject).jAo = new com.tencent.mm.plugin.card.sharecard.model.o(com.tencent.mm.y.c.yH());
    }
    Object localObject = akl().jAo;
    GMTrace.o(4920421908480L, 36660);
    return (com.tencent.mm.plugin.card.sharecard.model.o)localObject;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.a.c akx()
  {
    GMTrace.i(4920556126208L, 36661);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAp == null) {
      akl().jAp = new com.tencent.mm.plugin.card.sharecard.a.c();
    }
    com.tencent.mm.plugin.card.sharecard.a.c localc = akl().jAp;
    GMTrace.o(4920556126208L, 36661);
    return localc;
  }
  
  public static d aky()
  {
    GMTrace.i(4920690343936L, 36662);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAt == null) {
      akl().jAt = new d();
    }
    d locald = akl().jAt;
    GMTrace.o(4920690343936L, 36662);
    return locald;
  }
  
  public static i akz()
  {
    GMTrace.i(4920824561664L, 36663);
    com.tencent.mm.kernel.h.xw().wG();
    if (akl().jAu == null) {
      akl().jAu = new i();
    }
    i locali = akl().jAu;
    GMTrace.o(4920824561664L, 36663);
    return locali;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(4918677078016L, 36647);
    w.i("MicroMsg.SubCoreCard", "onAccountPostReset, updated = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.sdk.b.a.vgX.b(this.jAD);
    com.tencent.mm.sdk.b.a.vgX.b(this.jAE);
    com.tencent.mm.sdk.b.a.vgX.b(this.jAz);
    com.tencent.mm.sdk.b.a.vgX.b(this.jAA);
    com.tencent.mm.sdk.b.a.vgX.b(this.jAB);
    at.getSysCmdMsgExtension().a("carditemmsg", this.jAF, true);
    at.getSysCmdMsgExtension().a("notifysharecard", this.jAG, true);
    this.jAq = null;
    if (this.jAr != null)
    {
      this.jAr.jxc.clear();
      this.jAr = null;
    }
    if (this.jAl != null) {
      ??? = this.jAl;
    }
    synchronized (((com.tencent.mm.plugin.card.a.m)???).jxz)
    {
      ((com.tencent.mm.plugin.card.a.m)???).jxz.clear();
      synchronized (((com.tencent.mm.plugin.card.a.m)???).jxA)
      {
        ((com.tencent.mm.plugin.card.a.m)???).jxA.clear();
        at.wS().b(563, (com.tencent.mm.ad.e)???);
        ??? = com.tencent.mm.modelgeo.c.Ir();
        if (??? != null) {
          ((com.tencent.mm.modelgeo.a)???).c((a.a)???);
        }
        if (((com.tencent.mm.plugin.card.a.m)???).jxC != null) {
          at.wS().c(((com.tencent.mm.plugin.card.a.m)???).jxC);
        }
        this.jAl = null;
        if (this.jAh != null)
        {
          this.jAh.detach();
          this.jAh = null;
        }
        if (this.jAm != null) {
          ??? = this.jAm;
        }
      }
    }
    synchronized (((com.tencent.mm.plugin.card.sharecard.a.a)???).gCf)
    {
      ((com.tencent.mm.plugin.card.sharecard.a.a)???).jwH.clear();
      ((com.tencent.mm.plugin.card.sharecard.a.a)???).jwI.clear();
      if (((com.tencent.mm.plugin.card.sharecard.a.a)???).jAM != null) {
        at.wS().c(((com.tencent.mm.plugin.card.sharecard.a.a)???).jAM);
      }
      at.wS().b(903, (com.tencent.mm.ad.e)???);
      this.jAm = null;
      if (this.jAt != null)
      {
        this.jAt.release();
        ??? = this.jAt;
        ((d)???).jwK.clear();
        ((d)???).jwW.clear();
        ((d)???).jwX.clear();
        ((d)???).jwY.clear();
        ((d)???).jxa = false;
        this.jAt = null;
      }
      if (this.jAu == null) {
        break label510;
      }
      ??? = this.jAu;
      at.wS().b(907, (com.tencent.mm.ad.e)???);
      ??? = ((i)???).jxl.iterator();
      while (((Iterator)???).hasNext())
      {
        String str = (String)((Iterator)???).next();
        Runnable localRunnable = (Runnable)((i)???).jxn.get(str);
        ((i)???).jxn.remove(str);
        ((i)???).jxm.removeCallbacks(localRunnable);
        continue;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
    }
    ((i)localObject3).jxk.clear();
    ((i)localObject3).jxl.clear();
    ((i)localObject3).jxn.clear();
    this.jAu = null;
    label510:
    if (this.jAv != null)
    {
      this.jAv.release();
      this.jAv = null;
    }
    if (this.jAw != null)
    {
      this.jAw.release();
      this.jAw = null;
    }
    this.jAs = null;
    com.tencent.mm.pluginsdk.p.a.tlZ = new com.tencent.mm.plugin.card.a.j();
    com.tencent.mm.plugin.card.ui.b localb = this.jAC;
    com.tencent.mm.plugin.card.ui.b.aaA().registerActivityLifecycleCallbacks(localb);
    GMTrace.o(4918677078016L, 36647);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(4918811295744L, 36648);
    GMTrace.o(4918811295744L, 36648);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(4918542860288L, 36646);
    GMTrace.o(4918542860288L, 36646);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(4918945513472L, 36649);
    if (akl().jAh != null) {
      akl().jAh.detach();
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.jAD);
    com.tencent.mm.sdk.b.a.vgX.c(this.jAE);
    com.tencent.mm.sdk.b.a.vgX.c(this.jAz);
    com.tencent.mm.sdk.b.a.vgX.c(this.jAA);
    com.tencent.mm.sdk.b.a.vgX.c(this.jAB);
    at.getSysCmdMsgExtension().b("carditemmsg", this.jAF, true);
    at.getSysCmdMsgExtension().b("notifysharecard", this.jAG, true);
    com.tencent.mm.pluginsdk.p.a.tlZ = null;
    com.tencent.mm.plugin.card.ui.b localb = this.jAC;
    com.tencent.mm.plugin.card.ui.b.aaA().unregisterActivityLifecycleCallbacks(localb);
    GMTrace.o(4918945513472L, 36649);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(4918408642560L, 36645);
    HashMap localHashMap = fIv;
    GMTrace.o(4918408642560L, 36645);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */