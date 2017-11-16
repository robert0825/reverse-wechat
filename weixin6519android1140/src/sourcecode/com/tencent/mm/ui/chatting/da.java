package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.c.a;
import com.tencent.mm.ao.d;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelstat.b;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.ue;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.chatting.b.m;
import com.tencent.mm.ui.snackbar.b.c;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import com.tencent.mm.y.u.b;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.WWAPIFactory;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class da
  implements dx
{
  public static ar wzX;
  public x eMY;
  public com.tencent.mm.ui.tools.l ihF;
  public com.tencent.mm.ui.tools.p jQL;
  Animation oTW;
  private ChatFooterCustom wAa;
  public boolean wAb;
  public boolean wqK;
  public En_5b8fbb1e.a wuU;
  public cv wuV;
  private ChatFooter wuW;
  boolean wuY;
  public ChattingFooterMoreBtnBar wzY;
  public dc wzZ;
  public boolean wzt;
  
  static
  {
    GMTrace.i(2230295986176L, 16617);
    wzX = new ar(5, "MicroMsg.ChattingMoreBtnBarHelper");
    GMTrace.o(2230295986176L, 16617);
  }
  
  public da(En_5b8fbb1e.a parama, ChattingFooterMoreBtnBar paramChattingFooterMoreBtnBar, cv paramcv, ChatFooter paramChatFooter, ChatFooterCustom paramChatFooterCustom, x paramx, boolean paramBoolean)
  {
    GMTrace.i(2227611631616L, 16597);
    this.wzt = false;
    this.wuY = false;
    this.wAb = true;
    this.wuU = parama;
    this.wzY = paramChattingFooterMoreBtnBar;
    this.wuW = paramChatFooter;
    this.wAa = paramChatFooterCustom;
    this.wuV = paramcv;
    b(paramx, paramBoolean);
    this.oTW = AnimationUtils.loadAnimation(parama.vKB.vKW, R.a.aLG);
    if (this.wuY) {
      w.w("MicroMsg.ChattingMoreBtnBarHelper", "is in show search chat result");
    }
    for (;;)
    {
      this.wzY.c(3, new View.OnClickListener()
      {
        public final void onClick(final View paramAnonymousView)
        {
          GMTrace.i(2505979199488L, 18671);
          if (da.this.wuV.wzw.size() == 0)
          {
            w.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            GMTrace.o(2505979199488L, 18671);
            return;
          }
          paramAnonymousView = da.this.wuU.vKB.vKW;
          com.tencent.mm.ui.base.h.a(paramAnonymousView, paramAnonymousView.getString(R.l.din), "", paramAnonymousView.getString(R.l.dmE), paramAnonymousView.getString(R.l.cSk), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(2513763827712L, 18729);
              w.i("MicroMsg.ChattingMoreBtnBarHelper", "delete message");
              z.a(paramAnonymousView, da.this.wuV.wzw, da.this);
              da.this.ccF();
              GMTrace.o(2513763827712L, 18729);
            }
          }, null, R.e.aMJ);
          GMTrace.o(2505979199488L, 18671);
        }
      });
      this.wzY.c(2, new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2212847681536L, 16487);
          if (da.this.wuV.wzw.size() == 0)
          {
            w.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            GMTrace.o(2212847681536L, 16487);
            return;
          }
          ad.a(da.this.wuU, da.this.ccE(), da.this.wqK, da.this, da.this.eMY);
          GMTrace.o(2212847681536L, 16487);
        }
      });
      this.wzY.c(1, new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2484772798464L, 18513);
          if (da.this.wuV.wzw.size() == 0)
          {
            w.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            GMTrace.o(2484772798464L, 18513);
            return;
          }
          paramAnonymousView = da.this.ccE();
          if (aa.cF(paramAnonymousView))
          {
            com.tencent.mm.ui.base.h.a(da.this.wuU.vKB.vKW, da.this.wuU.vKB.vKW.getString(R.l.dlQ), "", da.this.wuU.vKB.vKW.getString(R.l.cPO), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(2185198829568L, 16281);
                GMTrace.o(2185198829568L, 16281);
              }
            });
            GMTrace.o(2484772798464L, 18513);
            return;
          }
          if (aa.cG(paramAnonymousView))
          {
            com.tencent.mm.ui.base.h.a(da.this.wuU.vKB.vKW, da.this.wuU.vKB.vKW.getString(R.l.dlR), "", da.this.wuU.vKB.vKW.getString(R.l.cPO), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(2142383374336L, 15962);
                GMTrace.o(2142383374336L, 15962);
              }
            });
            GMTrace.o(2484772798464L, 18513);
            return;
          }
          if (aa.cE(paramAnonymousView))
          {
            com.tencent.mm.ui.base.h.a(da.this.wuU.vKB.vKW, da.this.wuU.vKB.vKW.getString(R.l.dlS), "", new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(2201304956928L, 16401);
                GMTrace.o(2201304956928L, 16401);
              }
            }, null);
            GMTrace.o(2484772798464L, 18513);
            return;
          }
          if (ae.a(da.this.wuU, paramAnonymousView, da.this.eMY)) {
            da.this.ccF();
          }
          GMTrace.o(2484772798464L, 18513);
        }
      });
      this.wzY.c(0, new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2115674046464L, 15763);
          if (da.this.wuV.wzw.size() == 0)
          {
            w.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            GMTrace.o(2115674046464L, 15763);
            return;
          }
          if (((s.fD(da.this.eMY.field_username)) && (!com.tencent.mm.af.f.dL(da.this.eMY.field_username))) || (s.gn(da.this.eMY.field_username)))
          {
            da.this.wAb = true;
            ab.a(da.this.wuU.vKB.vKW, da.this.ccE(), da.this.wqK, da.this.eMY.field_username, da.this);
            GMTrace.o(2115674046464L, 15763);
            return;
          }
          da.this.ihF.b(paramAnonymousView, new View.OnCreateContextMenuListener()new p.d
          {
            public final void onCreateContextMenu(ContextMenu paramAnonymous2ContextMenu, View paramAnonymous2View, ContextMenu.ContextMenuInfo paramAnonymous2ContextMenuInfo)
            {
              GMTrace.i(2529869955072L, 18849);
              paramAnonymous2ContextMenu.add(0, 0, 0, R.l.dJu);
              paramAnonymous2ContextMenu.add(0, 1, 1, R.l.dJv);
              if (WWAPIFactory.in(da.this.wuU.vKB.vKW).crN()) {
                paramAnonymous2ContextMenu.add(0, 2, 2, da.this.wuU.vKB.vKW.getString(R.l.dJw, new Object[] { WWAPIFactory.in(da.this.wuU.vKB.vKW).crO() }));
              }
              GMTrace.o(2529869955072L, 18849);
            }
          }, new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(2511079473152L, 18709);
              Object localObject;
              if (paramAnonymous2MenuItem.getItemId() == 0)
              {
                da.this.wAb = true;
                paramAnonymous2MenuItem = da.this;
                localObject = paramAnonymous2MenuItem.ccE();
                new com.tencent.mm.sdk.platformtools.ae().post(new da.8(paramAnonymous2MenuItem, (List)localObject));
              }
              for (;;)
              {
                ab.a(da.this.wuU.vKB.vKW, da.this.ccE(), da.this.wqK, da.this.eMY.field_username, da.this);
                GMTrace.o(2511079473152L, 18709);
                return;
                if (2 == paramAnonymous2MenuItem.getItemId())
                {
                  paramAnonymous2MenuItem = da.this.wuU.vKB.vKW;
                  localObject = da.this.eMY;
                  List localList = da.this.ccE();
                  boolean bool = da.this.wqK;
                  if (localList.size() != 0)
                  {
                    if (!aa.cE(localList)) {
                      break label262;
                    }
                    w.w("MicroMsg.SendToWeWorkHelper", "isContainUndownloadFile");
                    com.tencent.mm.ui.base.h.a(paramAnonymous2MenuItem, paramAnonymous2MenuItem.getString(R.l.dlT), "", new eg.1(), null);
                  }
                  for (;;)
                  {
                    da.this.ccF();
                    GMTrace.o(2511079473152L, 18709);
                    return;
                    label262:
                    if (!aa.a(localList, null))
                    {
                      w.w("MicroMsg.SendToWeWorkHelper", "handleInvalidSendToFriendMsg");
                      com.tencent.mm.ui.base.h.a(paramAnonymous2MenuItem, paramAnonymous2MenuItem.getString(R.l.dDk), "", paramAnonymous2MenuItem.getString(R.l.dSi), paramAnonymous2MenuItem.getString(R.l.cSk), new eg.2(paramAnonymous2MenuItem, (x)localObject, localList, bool), null);
                    }
                    else
                    {
                      eg.a(paramAnonymous2MenuItem, (x)localObject, localList, bool);
                    }
                  }
                }
                da.this.wAb = false;
              }
            }
          });
          GMTrace.o(2115674046464L, 15763);
        }
      });
      this.wzY.c(4, new View.OnClickListener()
      {
        public static void cH(List<au> paramAnonymousList)
        {
          GMTrace.i(2492423208960L, 18570);
          paramAnonymousList = paramAnonymousList.iterator();
          while (paramAnonymousList.hasNext())
          {
            au localau = (au)paramAnonymousList.next();
            a.a(a.c.wqy, a.d.wqD, localau, 0);
          }
          GMTrace.o(2492423208960L, 18570);
        }
        
        public final void b(cf paramAnonymouscf)
        {
          GMTrace.i(2492154773504L, 18568);
          paramAnonymouscf.eDv.nK = da.this.wuU;
          paramAnonymouscf.eDv.eDC = 41;
          paramAnonymouscf.eDv.eDE = new b.c()
          {
            public final void aDT()
            {
              GMTrace.i(2288143826944L, 17048);
              da.this.wuU.cdy();
              GMTrace.o(2288143826944L, 17048);
            }
            
            public final void onHide()
            {
              GMTrace.i(2288009609216L, 17047);
              da.this.ccF();
              GMTrace.o(2288009609216L, 17047);
            }
            
            public final void onShow()
            {
              GMTrace.i(2287875391488L, 17046);
              da.this.ccF();
              da.this.wzY.setVisibility(4);
              GMTrace.o(2287875391488L, 17046);
            }
          };
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymouscf);
          int i;
          Object localObject1;
          long l;
          label90:
          Object localObject2;
          if (paramAnonymouscf.eDw.ret == 0)
          {
            i = 1;
            localObject1 = da.this.ccE();
            l = bg.Pu();
            Iterator localIterator = ((List)localObject1).iterator();
            while (localIterator.hasNext())
            {
              localObject1 = (au)localIterator.next();
              if (((au)localObject1).aCp())
              {
                localObject2 = f.a.eS(bg.Sx(((ce)localObject1).field_content));
                if ((localObject2 != null) && (((f.a)localObject2).type == 5) && (!bg.nm(((f.a)localObject2).url))) {
                  if (!((au)localObject1).bTs()) {
                    break label658;
                  }
                }
              }
            }
          }
          label658:
          for (int j = 1;; j = 2)
          {
            w.d("MicroMsg.ChattingMoreBtnBarHelper", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), ((f.a)localObject2).url, Long.valueOf(l), Integer.valueOf(j), Integer.valueOf(2), Integer.valueOf(1) });
            localObject1 = "";
            try
            {
              localObject2 = URLEncoder.encode(((f.a)localObject2).url, "UTF-8");
              localObject1 = localObject2;
            }
            catch (UnsupportedEncodingException localUnsupportedEncodingException)
            {
              for (;;)
              {
                w.printErrStackTrace("MicroMsg.ChattingMoreBtnBarHelper", localUnsupportedEncodingException, "", new Object[0]);
              }
            }
            com.tencent.mm.plugin.report.service.g.ork.i(13378, new Object[] { localObject1, Long.valueOf(l), Integer.valueOf(j), Integer.valueOf(2), Integer.valueOf(i) });
            break label90;
            i = 2;
            break;
            if (paramAnonymouscf.eDw.ret == 0)
            {
              if (14 != paramAnonymouscf.eDv.type)
              {
                w.d("MicroMsg.ChattingMoreBtnBarHelper", "not record type, do not report");
                GMTrace.o(2492154773504L, 18568);
                return;
              }
              if (paramAnonymouscf.eDv.eDy == null)
              {
                w.e("MicroMsg.ChattingMoreBtnBarHelper", "want to report record fav, but type count is null");
                GMTrace.o(2492154773504L, 18568);
                return;
              }
              com.tencent.mm.plugin.report.service.g.ork.i(11142, new Object[] { Integer.valueOf(paramAnonymouscf.eDv.eDy.ulQ), Integer.valueOf(paramAnonymouscf.eDv.eDy.ulR), Integer.valueOf(paramAnonymouscf.eDv.eDy.ulS), Integer.valueOf(paramAnonymouscf.eDv.eDy.ulT), Integer.valueOf(paramAnonymouscf.eDv.eDy.ulU), Integer.valueOf(paramAnonymouscf.eDv.eDy.ulV), Integer.valueOf(paramAnonymouscf.eDv.eDy.ulW), Integer.valueOf(paramAnonymouscf.eDv.eDy.ulX), Integer.valueOf(paramAnonymouscf.eDv.eDy.ulY), Integer.valueOf(paramAnonymouscf.eDv.eDy.ulZ), Integer.valueOf(paramAnonymouscf.eDv.eDy.uma), Integer.valueOf(paramAnonymouscf.eDv.eDy.umb), Integer.valueOf(paramAnonymouscf.eDv.eDy.umc), Integer.valueOf(paramAnonymouscf.eDv.eDy.umd), Integer.valueOf(paramAnonymouscf.eDv.eDy.ume) });
            }
            GMTrace.o(2492154773504L, 18568);
            return;
          }
        }
        
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2492288991232L, 18569);
          final List localList = da.this.ccE();
          if (aa.cF(localList))
          {
            com.tencent.mm.ui.base.h.a(da.this.wuU.vKB.vKW, da.this.wuU.vKB.vKW.getString(R.l.dtI), "", da.this.wuU.vKB.vKW.getString(R.l.cPO), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(2136612012032L, 15919);
                GMTrace.o(2136612012032L, 15919);
              }
            });
            GMTrace.o(2492288991232L, 18569);
            return;
          }
          final cf localcf = new cf();
          w.d("MicroMsg.ChattingMoreBtnBarHelper", "want fav msgs from %s", new Object[] { da.this.eMY.field_username });
          Object localObject1;
          Object localObject2;
          if (localList.size() == 1)
          {
            paramAnonymousView = (au)localList.get(0);
            if ((paramAnonymousView != null) && ((paramAnonymousView.aCp()) || (paramAnonymousView.bTs()) || (paramAnonymousView.bTt())))
            {
              localObject1 = com.tencent.mm.y.u.gy(paramAnonymousView.field_msgSvrId);
              localObject2 = com.tencent.mm.y.u.Av().p((String)localObject1, true);
              ((u.b)localObject2).o("prePublishId", "msg_" + paramAnonymousView.field_msgSvrId);
              ((u.b)localObject2).o("preUsername", ah.a(paramAnonymousView, da.this.wqK, da.this.wuU.txk));
              ((u.b)localObject2).o("preChatName", da.this.eMY.field_username);
              ((u.b)localObject2).o("preMsgIndex", Integer.valueOf(0));
              ((u.b)localObject2).o("sendAppMsgScene", Integer.valueOf(1));
              ((i)com.tencent.mm.kernel.h.h(i.class)).a("adExtStr", (u.b)localObject2, paramAnonymousView);
              localcf.eDv.eDA = ((String)localObject1);
            }
          }
          if (com.tencent.mm.pluginsdk.model.g.a(da.this.wuU.vKB.vKW, localcf, da.this.eMY.field_username, localList, false, true))
          {
            paramAnonymousView = localList.iterator();
            while (paramAnonymousView.hasNext())
            {
              localObject1 = (au)paramAnonymousView.next();
              if (((au)localObject1).aCp()) {
                b.gWv.c((au)localObject1, com.tencent.mm.x.g.g((au)localObject1));
              } else {
                b.gWv.t((au)localObject1);
              }
            }
            b(localcf);
            cH(da.this.ccE());
            GMTrace.o(2492288991232L, 18569);
            return;
          }
          if (da.this.ccE().size() > 1)
          {
            localObject2 = da.this.wuU.vKB.vKW;
            if (localcf.eDv.eDB >= 0)
            {
              paramAnonymousView = da.this.wuU.vKB.vKW.getString(R.l.dtH);
              if (localcf.eDv.eDB < 0) {
                break label627;
              }
            }
            label627:
            for (localObject1 = da.this.wuU.vKB.vKW.getString(R.l.diu);; localObject1 = da.this.wuU.vKB.vKW.getString(R.l.dNH))
            {
              com.tencent.mm.ui.base.h.a((Context)localObject2, paramAnonymousView, "", (String)localObject1, da.this.wuU.vKB.vKW.getString(R.l.dis), new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(2521414238208L, 18786);
                  paramAnonymous2DialogInterface = localList.iterator();
                  while (paramAnonymous2DialogInterface.hasNext())
                  {
                    au localau = (au)paramAnonymous2DialogInterface.next();
                    if ((!localau.bTJ()) && (!localau.bTI()))
                    {
                      if ((localcf.eDv.type == 14) && (localcf.eDv.eDx.ulB.size() == 0))
                      {
                        da.this.ccF();
                        GMTrace.o(2521414238208L, 18786);
                        return;
                      }
                      da.6.this.b(localcf);
                      da.6.cH(da.this.ccE());
                      GMTrace.o(2521414238208L, 18786);
                      return;
                    }
                  }
                  GMTrace.o(2521414238208L, 18786);
                }
              }, null);
              GMTrace.o(2492288991232L, 18569);
              return;
              paramAnonymousView = da.this.wuU.vKB.vKW.getString(R.l.dtG);
              break;
            }
          }
          com.tencent.mm.ui.base.h.h(da.this.wuU.vKB.vKW, localcf.eDv.eDB, 0);
          GMTrace.o(2492288991232L, 18569);
        }
      });
      this.wuV.wzG = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2280493416448L, 16991);
          if (da.this.wuV.eX(((Long)paramAnonymousView.getTag()).longValue()))
          {
            int i = da.this.wuV.wzw.size();
            da.this.wuU.wCy.ceE();
            da.this.jQL.cit();
            da.this.wzY.setVisibility(0);
            da.this.wzY.CI(i);
          }
          GMTrace.o(2280493416448L, 16991);
        }
      };
      this.ihF = new com.tencent.mm.ui.tools.l(this.wuU.vKB.vKW);
      GMTrace.o(2227611631616L, 16597);
      return;
      this.jQL = new com.tencent.mm.ui.tools.p(true, true);
      this.jQL.xiS = new p.b()
      {
        public final void QA()
        {
          GMTrace.i(2166542565376L, 16142);
          GMTrace.o(2166542565376L, 16142);
        }
        
        public final void QB()
        {
          GMTrace.i(16785269063680L, 125060);
          GMTrace.o(16785269063680L, 125060);
        }
        
        public final void Qy()
        {
          GMTrace.i(2166139912192L, 16139);
          w.v("MicroMsg.ChattingMoreBtnBarHelper", "onQuitSearch");
          if (da.this.wuV.wzt)
          {
            da.this.wuU.wCy.ceE();
            da.this.wzY.setVisibility(0);
            da.this.wzY.CI(da.this.wuV.wzw.size());
          }
          GMTrace.o(2166139912192L, 16139);
        }
        
        public final void Qz()
        {
          GMTrace.i(2166274129920L, 16140);
          w.v("MicroMsg.ChattingMoreBtnBarHelper", "onEnterSearch");
          com.tencent.mm.plugin.report.service.g.ork.a(219L, 21L, 1L, true);
          if (da.this.wuV.wzt)
          {
            da.this.wuU.wCy.ceD();
            da.this.wzY.setVisibility(8);
          }
          GMTrace.o(2166274129920L, 16140);
        }
        
        public final boolean nC(String paramAnonymousString)
        {
          GMTrace.i(2166408347648L, 16141);
          GMTrace.o(2166408347648L, 16141);
          return false;
        }
        
        public final void nD(String paramAnonymousString)
        {
          GMTrace.i(2166005694464L, 16138);
          w.v("MicroMsg.ChattingMoreBtnBarHelper", "on edit change");
          if (bg.nm(paramAnonymousString))
          {
            if (da.this.wuU.wCy.wIT)
            {
              if (da.this.wzZ != null) {
                da.this.wzZ.Au("");
              }
              da.this.wuU.wCy.CX(-1);
              GMTrace.o(2166005694464L, 16138);
              return;
            }
            if (da.this.wzt)
            {
              da.this.wuU.wCy.ceE();
              da.this.wzY.setVisibility(0);
              da.this.wzY.CI(da.this.wuV.wzw.size());
              GMTrace.o(2166005694464L, 16138);
              return;
            }
            da.this.wuU.wCy.ceE();
            da.this.wzY.setVisibility(8);
            GMTrace.o(2166005694464L, 16138);
            return;
          }
          w.v("MicroMsg.ChattingMoreBtnBarHelper", "enter search mode");
          da.this.wzY.setVisibility(8);
          da.this.wuU.wCy.ceD();
          if (da.this.wzZ != null) {
            da.this.wzZ.Au(paramAnonymousString);
          }
          GMTrace.o(2166005694464L, 16138);
        }
      };
    }
  }
  
  public final void a(dx.a parama)
  {
    GMTrace.i(14950646939648L, 111391);
    GMTrace.o(14950646939648L, 111391);
  }
  
  public final void b(x paramx, boolean paramBoolean)
  {
    GMTrace.i(2227745849344L, 16598);
    this.eMY = paramx;
    this.wqK = paramBoolean;
    GMTrace.o(2227745849344L, 16598);
  }
  
  public final void b(dx.a parama)
  {
    GMTrace.i(14950915375104L, 111393);
    ccF();
    GMTrace.o(14950915375104L, 111393);
  }
  
  public final List<au> ccE()
  {
    GMTrace.i(2227880067072L, 16599);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.wuV.wzw.iterator();
    while (localIterator.hasNext())
    {
      long l = ((Long)localIterator.next()).longValue();
      w.v("MicroMsg.ChattingMoreBtnBarHelper", "select msg id %d", new Object[] { Long.valueOf(l) });
      at.AR();
      localLinkedList.add(com.tencent.mm.y.c.yM().cM(l));
    }
    Collections.sort(localLinkedList, new Comparator() {});
    GMTrace.o(2227880067072L, 16599);
    return localLinkedList;
  }
  
  public final void ccF()
  {
    GMTrace.i(2228014284800L, 16600);
    this.wuU.a(false, this.jQL);
    this.wzY.setVisibility(8);
    this.wuV.ayJ();
    this.wuU.wCy.ceE();
    this.wzt = false;
    this.wuU.cdO();
    this.wuU.ceo();
    this.wuU.cdN();
    this.wuU.avJ();
    ab.ccd();
    GMTrace.o(2228014284800L, 16600);
  }
  
  public final void ccG()
  {
    GMTrace.i(2228148502528L, 16601);
    if (this.jQL != null) {
      this.jQL.cit();
    }
    GMTrace.o(2228148502528L, 16601);
  }
  
  public final void ccH()
  {
    GMTrace.i(14950781157376L, 111392);
    ccF();
    GMTrace.o(14950781157376L, 111392);
  }
  
  public final boolean ccI()
  {
    GMTrace.i(2228551155712L, 16604);
    boolean bool = this.wAb;
    GMTrace.o(2228551155712L, 16604);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */