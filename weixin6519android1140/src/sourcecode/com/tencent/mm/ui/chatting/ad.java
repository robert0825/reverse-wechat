package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.af.a.e;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.mn.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.p.a;
import com.tencent.mm.ui.base.p.b;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.bizchat.BizChatSelectConversationUI;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ad
{
  public static a wuJ;
  public static com.tencent.mm.ui.base.r wuy;
  
  static
  {
    GMTrace.i(2186406789120L, 16290);
    wuy = null;
    GMTrace.o(2186406789120L, 16290);
  }
  
  public static void a(En_5b8fbb1e.a parama, da paramda, String paramString, long paramLong)
  {
    GMTrace.i(2185869918208L, 16286);
    ActionBarActivity localActionBarActivity = parama.vKB.vKW;
    if ((!com.tencent.mm.platformtools.t.nm(paramString)) && (paramString.length() > 0))
    {
      localActionBarActivity.getString(R.l.cUG);
      wuy = com.tencent.mm.ui.base.h.a(localActionBarActivity, localActionBarActivity.getString(R.l.dXE), false, null);
      da.wzX.c(new b(parama, localActionBarActivity, paramString, paramLong, wuJ));
    }
    if (paramda != null) {
      paramda.ccF();
    }
    GMTrace.o(2185869918208L, 16286);
  }
  
  public static void a(final En_5b8fbb1e.a parama, List<au> paramList, boolean paramBoolean, final da paramda, final com.tencent.mm.storage.x paramx)
  {
    GMTrace.i(2185333047296L, 16282);
    if (parama == null)
    {
      w.w("MicroMsg.ChattingEditModeSendToBrand", "do send to brand fail, fragment is null");
      GMTrace.o(2185333047296L, 16282);
      return;
    }
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.w("MicroMsg.ChattingEditModeSendToBrand", "do send to brand fail, select item empty");
      GMTrace.o(2185333047296L, 16282);
      return;
    }
    Object localObject = new a();
    wuJ = (a)localObject;
    ((a)localObject).wuG = new LinkedList(paramList);
    wuJ.wqK = paramBoolean;
    wuJ.eRB = paramx.field_username;
    wuJ.wuR = true;
    final ActionBarActivity localActionBarActivity = parama.vKB.vKW;
    if (localActionBarActivity == null)
    {
      GMTrace.o(2185333047296L, 16282);
      return;
    }
    l locall = new l(localActionBarActivity);
    locall.xhT = new p.a()
    {
      public final void a(ImageView paramAnonymousImageView, MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2408268693504L, 17943);
        a.b.b(paramAnonymousImageView, paramAnonymousMenuItem.getTitle(), false);
        GMTrace.o(2408268693504L, 17943);
      }
    };
    locall.xhU = new p.b()
    {
      public final void a(TextView paramAnonymousTextView, MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2245865242624L, 16733);
        if (paramAnonymousTextView != null)
        {
          at.AR();
          com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE(paramAnonymousMenuItem.getTitle());
          if ((localx == null) || ((int)localx.fTq <= 0))
          {
            paramAnonymousTextView.setText(paramAnonymousMenuItem.getTitle());
            GMTrace.o(2245865242624L, 16733);
            return;
          }
          paramAnonymousTextView.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this.val$context, localx.vj()));
        }
        GMTrace.o(2245865242624L, 16733);
      }
    };
    if (com.tencent.mm.pluginsdk.model.app.p.n(localActionBarActivity, "com.tencent.wework")) {}
    for (localObject = aa.ccc();; localObject = aa.ccb())
    {
      locall.qik = new p.c()
      {
        public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
        {
          GMTrace.i(2223585099776L, 16567);
          paramAnonymousn.Z(1193046, R.l.dIx, R.g.aVn);
          Iterator localIterator = this.wuK.iterator();
          while (localIterator.hasNext()) {
            paramAnonymousn.add((String)localIterator.next());
          }
          GMTrace.o(2223585099776L, 16567);
        }
      };
      locall.qil = new p.d()
      {
        public final void c(final MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(2384243720192L, 17764);
          if (paramAnonymousMenuItem.getItemId() == 1193046)
          {
            if (aa.cF(this.wuB))
            {
              com.tencent.mm.ui.base.h.a(localActionBarActivity, localActionBarActivity.getString(R.l.dlQ), "", localActionBarActivity.getString(R.l.cPO), new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(2530406825984L, 18853);
                  GMTrace.o(2530406825984L, 18853);
                }
              });
              GMTrace.o(2384243720192L, 17764);
              return;
            }
            if (aa.cG(this.wuB))
            {
              com.tencent.mm.ui.base.h.a(localActionBarActivity, localActionBarActivity.getString(R.l.dlR), "", localActionBarActivity.getString(R.l.cPO), new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(2137148882944L, 15923);
                  GMTrace.o(2137148882944L, 15923);
                }
              });
              GMTrace.o(2384243720192L, 17764);
              return;
            }
            if (aa.cE(this.wuB))
            {
              com.tencent.mm.ui.base.h.a(localActionBarActivity, localActionBarActivity.getString(R.l.dlS), "", new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(2380619841536L, 17737);
                  GMTrace.o(2380619841536L, 17737);
                }
              }, null);
              GMTrace.o(2384243720192L, 17764);
              return;
            }
            if ((ae.a(parama, this.wuB, paramx)) && (paramda != null)) {
              paramda.ccF();
            }
            GMTrace.o(2384243720192L, 17764);
            return;
          }
          if (aa.cF(this.wuB))
          {
            com.tencent.mm.ui.base.h.a(localActionBarActivity, localActionBarActivity.getString(R.l.dlQ), "", localActionBarActivity.getString(R.l.cPO), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(2516313964544L, 18748);
                GMTrace.o(2516313964544L, 18748);
              }
            });
            GMTrace.o(2384243720192L, 17764);
            return;
          }
          if (aa.cG(this.wuB))
          {
            com.tencent.mm.ui.base.h.a(localActionBarActivity, localActionBarActivity.getString(R.l.dlR), "", localActionBarActivity.getString(R.l.cPO), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(2526111858688L, 18821);
                GMTrace.o(2526111858688L, 18821);
              }
            });
            GMTrace.o(2384243720192L, 17764);
            return;
          }
          final Object localObject = this.wuB;
          label359:
          label361:
          Iterator localIterator;
          if (localObject == null)
          {
            w.w("MicroMsg.ChattingEditModeLogic", "check contain undownload image or video error, select item empty");
            break label422;
            break label422;
            break label422;
            paramAnonymousInt = 0;
            if ((paramAnonymousInt == 0) && (!aa.cE(this.wuB))) {
              break label668;
            }
            com.tencent.mm.ui.base.h.a(localActionBarActivity, localActionBarActivity.getString(R.l.dlS), "", new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(2143188680704L, 15968);
                GMTrace.o(2143188680704L, 15968);
              }
            }, null);
            GMTrace.o(2384243720192L, 17764);
          }
          else
          {
            localIterator = ((List)localObject).iterator();
          }
          label422:
          label668:
          label932:
          label933:
          for (;;)
          {
            if (!localIterator.hasNext()) {
              break label359;
            }
            au localau = (au)localIterator.next();
            if (localau.field_isSend == 1) {
              break label359;
            }
            if (localau.bTC())
            {
              localObject = null;
              if (localau.field_msgId > 0L) {
                localObject = com.tencent.mm.ao.n.IZ().aq(localau.field_msgId);
              }
              if (((localObject != null) && (((com.tencent.mm.ao.d)localObject).gGR > 0L)) || (localau.field_msgSvrId <= 0L)) {
                break label932;
              }
              localObject = com.tencent.mm.ao.n.IZ().ap(localau.field_msgSvrId);
            }
            for (;;)
            {
              if ((localObject == null) || ((((com.tencent.mm.ao.d)localObject).offset >= ((com.tencent.mm.ao.d)localObject).gsL) && (((com.tencent.mm.ao.d)localObject).gsL != 0))) {
                break label933;
              }
              paramAnonymousInt = 1;
              break label361;
              if (localau.bTG())
              {
                localObject = o.Nh().mh(localau.field_imgPath);
                if ((localObject == null) || (((com.tencent.mm.modelvideo.r)localObject).status == 199) || (((com.tencent.mm.modelvideo.r)localObject).status == 199)) {
                  break;
                }
                paramAnonymousInt = 1;
                break label361;
              }
              if (localau.bTH())
              {
                localObject = com.tencent.mm.modelvideo.t.mw(localau.field_imgPath);
                if ((localObject == null) || (((com.tencent.mm.modelvideo.r)localObject).status == 199) || (((com.tencent.mm.modelvideo.r)localObject).status == 199)) {
                  break;
                }
                paramAnonymousInt = 1;
                break label361;
              }
              if (!localau.bTJ()) {
                break;
              }
              if (!aa.ai(localau))
              {
                paramAnonymousInt = 1;
                break label361;
              }
              paramAnonymousInt = 0;
              break label361;
              localObject = (String)paramAnonymousMenuItem.getTitle();
              if (com.tencent.mm.af.f.iN((String)localObject))
              {
                if (this.wuB.size() <= 1)
                {
                  ad.wuJ.wuR = true;
                  ad.a((String)localObject, parama, this.wuB);
                  GMTrace.o(2384243720192L, 17764);
                  return;
                }
                new l(localActionBarActivity).b(paramAnonymousMenuItem.getActionView(), new View.OnCreateContextMenuListener()new p.d
                {
                  public final void onCreateContextMenu(ContextMenu paramAnonymous2ContextMenu, View paramAnonymous2View, ContextMenu.ContextMenuInfo paramAnonymous2ContextMenuInfo)
                  {
                    GMTrace.i(2149094260736L, 16012);
                    paramAnonymous2ContextMenu.add(0, 0, 0, R.l.dJu);
                    paramAnonymous2ContextMenu.add(0, 1, 1, R.l.dJv);
                    GMTrace.o(2149094260736L, 16012);
                  }
                }, new p.d()
                {
                  public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
                  {
                    GMTrace.i(2484370145280L, 18510);
                    if (paramAnonymous2MenuItem.getItemId() == 0) {}
                    for (ad.wuJ.wuR = true;; ad.wuJ.wuR = false)
                    {
                      ad.a(localObject, ad.4.this.wuL, ad.4.this.wuB);
                      GMTrace.o(2484370145280L, 18510);
                      return;
                    }
                  }
                });
                GMTrace.o(2384243720192L, 17764);
                return;
              }
              if (aa.cC(this.wuB))
              {
                localObject = localActionBarActivity.getString(R.l.dDj);
                com.tencent.mm.ui.base.h.a(localActionBarActivity, (String)localObject, "", new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(2497255047168L, 18606);
                    paramAnonymous2DialogInterface = ad.4.this.wuB;
                    if ((paramAnonymous2DialogInterface == null) || (paramAnonymous2DialogInterface.isEmpty())) {
                      w.w("MicroMsg.ChattingEditModeLogic", "check contain only invalid send to brand service error, select item empty");
                    }
                    label37:
                    for (paramAnonymous2Int = 1;; paramAnonymous2Int = 0)
                    {
                      if (paramAnonymous2Int == 0) {
                        break label190;
                      }
                      w.w("MicroMsg.ChattingEditModeSendToBrand", "only contain invalid msg, exit long click mode");
                      if (ad.4.this.wuN != null) {
                        ad.4.this.wuN.ccF();
                      }
                      GMTrace.o(2497255047168L, 18606);
                      return;
                      paramAnonymous2DialogInterface = paramAnonymous2DialogInterface.iterator();
                      if (!paramAnonymous2DialogInterface.hasNext()) {
                        break label37;
                      }
                      au localau = (au)paramAnonymous2DialogInterface.next();
                      if (aa.am(localau)) {
                        break label37;
                      }
                      if ((localau.bTu()) || (aa.ah(localau)) || (localau.bTD()) || (aa.aj(localau)) || (aa.ak(localau)) || (localau.field_type == -1879048186) || (aa.ar(localau)) || (aa.al(localau)) || (aa.aq(localau)) || (aa.au(localau))) {
                        break;
                      }
                    }
                    label190:
                    paramAnonymous2DialogInterface = ad.4.this.val$context;
                    ad.4.this.val$context.getString(R.l.cUG);
                    ad.wuy = com.tencent.mm.ui.base.h.a(paramAnonymous2DialogInterface, ad.4.this.val$context.getString(R.l.dXE), false, null);
                    da.wzX.c(new ad.b(ad.4.this.wuL, ad.4.this.val$context, paramAnonymousMenuItem.getTitle(), -1L, ad.wuJ));
                    if (ad.4.this.wuN != null) {
                      ad.4.this.wuN.ccF();
                    }
                    GMTrace.o(2497255047168L, 18606);
                  }
                }, null);
                GMTrace.o(2384243720192L, 17764);
                return;
              }
              localObject = localActionBarActivity;
              localActionBarActivity.getString(R.l.cUG);
              ad.wuy = com.tencent.mm.ui.base.h.a((Context)localObject, localActionBarActivity.getString(R.l.dXE), false, null);
              da.wzX.c(new ad.b(parama, localActionBarActivity, paramAnonymousMenuItem.getTitle(), -1L, ad.wuJ));
              if (paramda != null) {
                paramda.ccF();
              }
              GMTrace.o(2384243720192L, 17764);
              return;
            }
          }
        }
      };
      locall.bpI();
      GMTrace.o(2185333047296L, 16282);
      return;
    }
  }
  
  public static void a(String paramString, u paramu)
  {
    GMTrace.i(2185601482752L, 16284);
    Object localObject = com.tencent.mm.af.f.iK(paramString);
    if (localObject == null)
    {
      GMTrace.o(2185601482752L, 16284);
      return;
    }
    if (((com.tencent.mm.af.d)localObject).EH())
    {
      localObject = new Intent(paramu.vKB.vKW, BizChatSelectConversationUI.class);
      ((Intent)localObject).putExtra("enterprise_biz_name", paramString);
      ((Intent)localObject).putExtra("biz_chat_scene", 2);
      ((Intent)localObject).putExtra("enterprise_extra_params", wuJ.wuR);
      paramu.startActivityForResult((Intent)localObject, 225);
      GMTrace.o(2185601482752L, 16284);
      return;
    }
    if (((com.tencent.mm.af.d)localObject).EF())
    {
      localObject = new Intent();
      ((Intent)localObject).putExtra("enterprise_biz_name", paramString);
      ((Intent)localObject).putExtra("enterprise_scene", 1);
      com.tencent.mm.bj.d.a(paramu, "brandservice", ".ui.EnterpriseBizContactPlainListUI", (Intent)localObject, 225);
    }
    GMTrace.o(2185601482752L, 16284);
  }
  
  public static void a(String paramString, final u paramu, List<au> paramList)
  {
    GMTrace.i(2185467265024L, 16283);
    ActionBarActivity localActionBarActivity = paramu.vKB.vKW;
    if (localActionBarActivity == null)
    {
      GMTrace.o(2185467265024L, 16283);
      return;
    }
    Object localObject = com.tencent.mm.af.f.iK(paramString);
    if (localObject == null)
    {
      GMTrace.o(2185467265024L, 16283);
      return;
    }
    boolean bool1 = ((com.tencent.mm.af.d)localObject).EH();
    boolean bool2;
    int i;
    if (wuJ.wuR)
    {
      bool2 = aa.cC(paramList);
      if (bool1) {
        if ((paramList == null) || (paramList.isEmpty()))
        {
          w.w("MicroMsg.ChattingEditModeLogic", "check contain invalid send to bizchat msg error, selected item empty");
          i = 1;
          wuJ.wuG = new LinkedList(paramList);
          if ((!bool2) && (i == 0)) {
            break label283;
          }
          paramList = localActionBarActivity.getString(R.l.dqd);
        }
      }
    }
    for (;;)
    {
      if (paramList != null)
      {
        com.tencent.mm.ui.base.h.a(localActionBarActivity, paramList, "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2493228515328L, 18576);
            ad.a(this.vHp, paramu);
            GMTrace.o(2493228515328L, 18576);
          }
        }, null);
        GMTrace.o(2185467265024L, 16283);
        return;
        localObject = paramList.iterator();
        for (;;)
        {
          if (((Iterator)localObject).hasNext())
          {
            au localau = (au)((Iterator)localObject).next();
            if ((!localau.bTF()) && (!localau.bTu()) && (!localau.bTC()) && (!localau.bTE()) && (!aa.ap(localau)))
            {
              i = 1;
              break;
            }
          }
        }
        i = 0;
        break;
        if (!bool2) {
          break label283;
        }
        paramList = localActionBarActivity.getString(R.l.dqe);
        continue;
      }
      a(paramString, paramu);
      GMTrace.o(2185467265024L, 16283);
      return;
      label283:
      paramList = null;
    }
  }
  
  public static mn bn(Context paramContext, String paramString)
  {
    GMTrace.i(2185735700480L, 16285);
    mn localmn = new mn();
    localmn.eRu.type = 6;
    localmn.eRu.eRA = wuJ.wuG;
    localmn.eRu.toUser = paramString;
    localmn.eRu.eRB = wuJ.eRB;
    localmn.eRu.context = paramContext;
    com.tencent.mm.sdk.b.a.vgX.m(localmn);
    wuJ.eQY = localmn.eRv.eQY;
    wuJ.wuH = localmn.eRv.eRD;
    GMTrace.o(2185735700480L, 16285);
    return localmn;
  }
  
  private static final class a
  {
    cf eQY;
    String eRB;
    boolean wqK;
    List<au> wuG;
    com.tencent.mm.protocal.b.a.d wuH;
    boolean wuR;
    
    public a()
    {
      GMTrace.i(2305457913856L, 17177);
      GMTrace.o(2305457913856L, 17177);
    }
  }
  
  private static final class b
    implements ar.a
  {
    private Context context;
    private String gvB;
    private long juT;
    private boolean txk;
    private En_5b8fbb1e.a wuS;
    private ad.a wuT;
    
    public b(En_5b8fbb1e.a parama, Context paramContext, String paramString, long paramLong, ad.a parama1)
    {
      GMTrace.i(2221437616128L, 16551);
      this.wuS = parama;
      this.context = paramContext;
      this.gvB = paramString;
      this.juT = paramLong;
      this.wuT = parama1;
      this.txk = com.tencent.mm.af.f.dL(paramString);
      GMTrace.o(2221437616128L, 16551);
    }
    
    private void cce()
    {
      GMTrace.i(2221706051584L, 16553);
      Iterator localIterator = this.wuT.wuG.iterator();
      while (localIterator.hasNext())
      {
        au localau = (au)localIterator.next();
        Context localContext = this.context;
        boolean bool = this.wuT.wqK;
        String str = this.gvB;
        if (localau.bTF()) {
          aa.a(localContext, str, localau, bool);
        } else if (localau.bTC()) {
          aa.b(localContext, str, localau);
        } else if ((localau.bTG()) && (!this.txk)) {
          aa.c(localContext, str, localau);
        } else if (localau.bTE()) {
          aa.c(localContext, str, localau, bool);
        } else if (((localau.bTI()) || (localau.bTJ())) && (!this.txk))
        {
          if (!aa.ah(localau)) {
            aa.a(localContext, str, localau);
          }
        }
        else if ((localau.aCp()) && ((!this.txk) || (aa.ap(localau))) && (!aa.aq(localau)) && (localau.field_type != 318767153) && (!aa.au(localau)) && (!aa.aj(localau))) {
          aa.b(localContext, str, localau, bool);
        }
      }
      GMTrace.o(2221706051584L, 16553);
    }
    
    private void ccf()
    {
      GMTrace.i(2221840269312L, 16554);
      ad.bn(this.context, this.gvB);
      mn localmn = new mn();
      localmn.eRu.type = 5;
      localmn.eRu.eRA = this.wuT.wuG;
      localmn.eRu.toUser = this.gvB;
      localmn.eRu.eRB = this.wuT.eRB;
      localmn.eRu.context = this.context;
      localmn.eRu.eQY = this.wuT.eQY;
      localmn.eRu.eRD = this.wuT.wuH;
      com.tencent.mm.sdk.b.a.vgX.m(localmn);
      GMTrace.o(2221840269312L, 16554);
    }
    
    public final boolean Dj()
    {
      GMTrace.i(2221571833856L, 16552);
      if (this.txk)
      {
        com.tencent.mm.af.a.c localc = com.tencent.mm.af.x.FI().t(this.juT);
        synchronized (e.gyk)
        {
          String str = e.Br();
          e.d(localc);
          if (this.wuT.wuR)
          {
            cce();
            e.jk(str);
            GMTrace.o(2221571833856L, 16552);
            return true;
          }
          ccf();
        }
      }
      if (this.wuT.wuR) {
        cce();
      }
      for (;;)
      {
        GMTrace.o(2221571833856L, 16552);
        return true;
        ccf();
      }
    }
    
    public final boolean Dk()
    {
      GMTrace.i(2221974487040L, 16555);
      if (ad.wuy != null) {
        ad.wuy.dismiss();
      }
      com.tencent.mm.ui.snackbar.a.a(this.context, this.wuS.mView.findViewById(R.h.bNr), this.context.getString(R.l.dwg));
      GMTrace.o(2221974487040L, 16555);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */