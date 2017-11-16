package com.tencent.mm.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.my;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.k.e;
import com.tencent.mm.plugin.report.service.f;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.VoipAddressUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bk;

public final class aa
  extends com.tencent.mm.ui.tools.q
{
  private static final int[] vNW;
  public LayoutInflater CJ;
  public Context mContext;
  public SparseArray<c> vNS;
  private a vNU;
  z vNV;
  
  static
  {
    GMTrace.i(1702954532864L, 12688);
    vNW = new int[] { 2, 1, 4, 10, 3, Integer.MAX_VALUE };
    GMTrace.o(1702954532864L, 12688);
  }
  
  public aa(ActionBarActivity paramActionBarActivity)
  {
    super(paramActionBarActivity);
    GMTrace.i(1701880791040L, 12680);
    this.vNV = null;
    this.mContext = paramActionBarActivity;
    this.CJ = LayoutInflater.from(paramActionBarActivity);
    mE(false);
    this.vNV = z.bYh();
    GMTrace.o(1701880791040L, 12680);
  }
  
  public static d Bo(int paramInt)
  {
    GMTrace.i(1702283444224L, 12683);
    Object localObject = ab.getContext();
    switch (paramInt)
    {
    default: 
      localObject = null;
    }
    for (;;)
    {
      GMTrace.o(1702283444224L, 12683);
      return (d)localObject;
      if (HomeUI.vIr.booleanValue())
      {
        localObject = new d(1, ((Context)localObject).getString(R.l.dIv), "", R.k.cNw, R.e.aPp);
      }
      else
      {
        localObject = new d(1, ((Context)localObject).getString(R.l.dIv), "", R.k.cNx, 0);
        continue;
        if (HomeUI.vIs.booleanValue())
        {
          localObject = new d(2, ((Context)localObject).getString(R.l.dIy), "", R.k.cNF, R.e.aPp);
        }
        else
        {
          localObject = new d(2, ((Context)localObject).getString(R.l.dIy), "", R.k.cNG, 0);
          continue;
          localObject = new d(3, ((Context)localObject).getString(R.l.dIz), "", R.k.cKW, 0);
          continue;
          if (1 == bg.getInt(com.tencent.mm.k.g.ut().getValue("VOIPCallType"), 0))
          {
            localObject = new d(4, ((Context)localObject).getString(R.l.dIA), "", R.k.cNQ, 0);
          }
          else
          {
            localObject = new d(4, ((Context)localObject).getString(R.l.dIw), "", R.k.cNy, 0);
            continue;
            localObject = new d(5, ((Context)localObject).getString(R.l.dZw), "", R.k.cNL, 0);
            continue;
            localObject = new d(6, ((Context)localObject).getString(R.l.dZl), "", R.k.cNC, 0);
            continue;
            localObject = new d(7, ((Context)localObject).getString(R.l.dZm), "", R.k.cNA, 0);
            continue;
            localObject = new d(8, ((Context)localObject).getString(R.l.dou), "", R.k.cNB, 0);
            continue;
            localObject = new d(9, ((Context)localObject).getString(R.l.dZy), "", R.k.cNJ, 0);
            continue;
            localObject = new d(10, ((Context)localObject).getString(R.l.dvy), "", R.k.cNM, 0);
            continue;
            localObject = new d(11, ((Context)localObject).getString(R.l.edj), "", R.k.cNI, 0);
            continue;
            localObject = new d(12, ((Context)localObject).getString(R.l.dAB), "", R.k.cNE, 0);
            continue;
            localObject = new d(13, ((Context)localObject).getString(R.l.ece), "", R.k.cNP, 0);
            continue;
            localObject = new d(14, ((Context)localObject).getString(R.l.dKU), "", R.k.cNK, 0);
            continue;
            localObject = new d(15, ((Context)localObject).getString(R.l.dba), "", R.k.cNz, 0);
            continue;
            localObject = new d(16, ((Context)localObject).getString(R.l.dYq), "", R.k.cNR, 0);
            continue;
            localObject = new d(17, ((Context)localObject).getString(R.l.dIn), "", R.k.cNH, 0);
            continue;
            localObject = new d(18, ((Context)localObject).getString(R.l.dvz), "", R.k.cNN, 0);
            continue;
            localObject = new d(19, ((Context)localObject).getString(R.l.dvA), "", R.k.cIJ, 0);
            continue;
            at.AR();
            if (((Integer)com.tencent.mm.y.c.xh().get(w.a.vut, Integer.valueOf(0))).intValue() > 1) {
              break;
            }
            localObject = new d(20, ((Context)localObject).getString(R.l.cRn), "", R.k.cOw, 0);
            continue;
            localObject = new d(Integer.MAX_VALUE, ((Context)localObject).getString(R.l.dYS), "", R.k.cND, 0);
            continue;
            localObject = new d(2147483645, ((Context)localObject).getString(R.l.dYJ), "", R.k.cND, 0);
            continue;
            at.AR();
            if (((Integer)com.tencent.mm.y.c.xh().get(w.a.vut, Integer.valueOf(0))).intValue() != 8) {
              break;
            }
            localObject = new d(22, ((Context)localObject).getString(R.l.dOv), "", R.k.cNv, 0);
            continue;
            localObject = new d(2147483646, "TIT", "", R.k.cNA, 0);
          }
        }
      }
    }
  }
  
  protected final BaseAdapter aiO()
  {
    GMTrace.i(1702417661952L, 12684);
    if (this.vNU == null) {
      this.vNU = new a((byte)0);
    }
    a locala = this.vNU;
    GMTrace.o(1702417661952L, 12684);
    return locala;
  }
  
  public final boolean dK()
  {
    int j = 0;
    GMTrace.i(1702015008768L, 12681);
    this.vNV.lo(false);
    if (this.vNV.vNS.size() != 0) {
      this.vNS = this.vNV.vNS;
    }
    try
    {
      at.AR();
      if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsA, Boolean.valueOf(false))).booleanValue())
      {
        int i = j;
        while (i < this.vNS.size())
        {
          j = ((c)this.vNS.get(i)).vOb.vOe;
          if (j != 2147483646)
          {
            i += 1;
            continue;
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PlusSubMenuHelper", "dyna plus config is null, we use default one");
            if (this.vNS != null) {
              this.vNS.clear();
            }
            for (;;)
            {
              i = 0;
              while (i < vNW.length)
              {
                c localc = new c(Bo(vNW[i]));
                this.vNS.put(i, localc);
                i += 1;
              }
              this.vNS = new SparseArray();
            }
          }
        }
        if (i == this.vNS.size()) {
          this.vNS.put(this.vNS.size(), new c(Bo(2147483646)));
        }
      }
    }
    catch (Exception localException)
    {
      boolean bool;
      for (;;) {}
    }
    if (this.vNU != null) {
      this.vNU.notifyDataSetChanged();
    }
    bool = super.dK();
    GMTrace.o(1702015008768L, 12681);
    return bool;
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, final View paramView, int paramInt, long paramLong)
  {
    int i = 1;
    boolean bool2 = false;
    GMTrace.i(1702149226496L, 12682);
    if ((this.mContext instanceof ActionBarActivity)) {
      ((ActionBarActivity)this.mContext).aQ();
    }
    int j = ((c)this.vNS.get(paramInt)).vOb.vOe;
    com.tencent.mm.plugin.report.service.g.ork.i(11104, new Object[] { Integer.valueOf(j) });
    switch (j)
    {
    default: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      for (;;)
      {
        this.vNV.Bn(j);
        dismiss();
        GMTrace.o(1702149226496L, 12682);
        return;
        new Intent().putExtra("invite_friend_scene", 2);
        com.tencent.mm.bj.d.b(this.mContext, "subapp", ".ui.pluginapp.AddMoreFriendsUI", new Intent());
        continue;
        paramAdapterView = new Intent(this.mContext, SelectContactUI.class);
        paramAdapterView.putExtra("titile", this.mContext.getString(R.l.cRo));
        paramAdapterView.putExtra("list_type", 0);
        paramAdapterView.putExtra("list_attr", com.tencent.mm.ui.contact.s.q(new int[] { com.tencent.mm.ui.contact.s.wTl, 256, 512 }));
        paramAdapterView.putExtra("scene", 7);
        this.mContext.startActivity(paramAdapterView);
        continue;
        paramAdapterView = new Intent();
        paramAdapterView.setClassName(this.mContext, "com.tencent.mm.ui.tools.ShareImageRedirectUI");
        this.mContext.startActivity(paramAdapterView);
        continue;
        paramAdapterView = new rb();
        paramAdapterView.eVS.eVU = true;
        com.tencent.mm.sdk.b.a.vgX.m(paramAdapterView);
        paramAdapterView = paramAdapterView.eVT.eVW;
        if (!bg.nm(paramAdapterView))
        {
          com.tencent.mm.sdk.platformtools.w.v("MicroMsg.PlusSubMenuHelper", "Talkroom is on: " + paramAdapterView);
          h.a(this.mContext, this.mContext.getString(R.l.edN), "", this.mContext.getString(R.l.cTM), this.mContext.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(3093852848128L, 23051);
              rb localrb = new rb();
              localrb.eVS.eVV = true;
              com.tencent.mm.sdk.b.a.vgX.m(localrb);
              VoipAddressUI.fx(aa.this.mContext);
              paramAnonymousDialogInterface.dismiss();
              GMTrace.o(3093852848128L, 23051);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(1682687655936L, 12537);
              paramAnonymousDialogInterface.dismiss();
              GMTrace.o(1682687655936L, 12537);
            }
          });
        }
        else
        {
          VoipAddressUI.fx(this.mContext);
          continue;
          at.AR();
          if (!com.tencent.mm.y.c.isSDCardAvailable())
          {
            u.fo(this.mContext);
          }
          else
          {
            at.AR();
            paramAdapterView = (String)com.tencent.mm.y.c.xh().get(2, null);
            paramView = new Intent();
            paramView.putExtra("sns_userName", paramAdapterView);
            paramView.setFlags(536870912);
            paramView.addFlags(67108864);
            at.AR();
            paramInt = bg.a((Integer)com.tencent.mm.y.c.xh().get(68389, null), 0);
            at.AR();
            com.tencent.mm.y.c.xh().set(68389, Integer.valueOf(paramInt + 1));
            com.tencent.mm.bj.d.b(this.mContext, "sns", ".ui.SnsUserUI", paramView);
            continue;
            com.tencent.mm.bj.d.x(this.mContext, "favorite", ".ui.FavoriteIndexUI");
            continue;
            com.tencent.mm.bj.d.b(this.mContext, "mall", ".ui.MallIndexUI", new Intent());
            continue;
            paramAdapterView = new Intent();
            paramAdapterView.putExtra("preceding_scence", 2);
            com.tencent.mm.bj.d.b(this.mContext, "emoji", ".ui.v2.EmojiStoreV2UI", paramAdapterView);
            continue;
            com.tencent.mm.bj.d.b(this.mContext, "setting", ".ui.setting.SelfQRCodeUI", new Intent());
            continue;
            com.tencent.mm.plugin.report.service.g.ork.i(11265, new Object[] { Integer.valueOf(3) });
            if ((!com.tencent.mm.p.a.aQ(this.mContext)) && (!com.tencent.mm.p.a.aP(this.mContext)))
            {
              com.tencent.mm.bj.d.x(this.mContext, "scanner", ".ui.BaseScanUI");
              continue;
              at.AR();
              if (com.tencent.mm.y.c.isSDCardAvailable()) {
                break;
              }
              u.fo(this.mContext);
            }
          }
        }
      }
      f.tp(10);
      at.AR();
      paramAdapterView = (String)com.tencent.mm.y.c.xh().get(68377, null);
      at.AR();
      com.tencent.mm.y.c.xh().set(68377, "");
      paramView = new Intent();
      paramView.putExtra("sns_timeline_NeedFirstLoadint", true);
      if (bg.nm(paramAdapterView)) {
        break;
      }
    }
    for (boolean bool1 = false;; bool1 = true)
    {
      if (n.poQ != null) {
        if (n.poQ.ME() > 0) {
          bool1 = bool2;
        }
      }
      for (;;)
      {
        paramView.putExtra("sns_resume_state", bool1);
        com.tencent.mm.bj.d.b(this.mContext, "sns", ".ui.En_424b8e16", paramView);
        break;
        continue;
        at.AR();
        if (!com.tencent.mm.y.c.isSDCardAvailable())
        {
          u.fo(this.mContext);
          break;
        }
        com.tencent.mm.bj.d.x(this.mContext, "game", ".ui.GameCenterUI");
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1602962325504L, 11943);
            Intent localIntent = new Intent();
            localIntent.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
            localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
            aa.this.mContext.sendBroadcast(localIntent);
            GMTrace.o(1602962325504L, 11943);
          }
        }, 100L);
        break;
        com.tencent.mm.sdk.b.a.vgX.m(new my());
        com.tencent.mm.bj.d.x(this.mContext, "shake", ".ui.ShakeReportUI");
        break;
        at.AR();
        if (!bg.b((Boolean)com.tencent.mm.y.c.xh().get(4103, null)))
        {
          com.tencent.mm.bj.d.x(this.mContext, "nearby", ".ui.NearbyFriendsIntroUI");
          break;
        }
        paramAdapterView = bk.BF();
        if (paramAdapterView == null)
        {
          com.tencent.mm.bj.d.x(this.mContext, "nearby", ".ui.NearbyPersonalInfoUI");
          break;
        }
        paramView = bg.nl(paramAdapterView.getProvince());
        paramInt = bg.a(Integer.valueOf(paramAdapterView.fja), 0);
        if ((bg.nm(paramView)) || (paramInt == 0))
        {
          com.tencent.mm.bj.d.x(this.mContext, "nearby", ".ui.NearbyPersonalInfoUI");
          break;
        }
        at.AR();
        paramAdapterView = (Boolean)com.tencent.mm.y.c.xh().get(4104, null);
        if ((paramAdapterView == null) || (!paramAdapterView.booleanValue()))
        {
          paramAdapterView = LauncherUI.bXe();
          if (paramAdapterView != null) {
            paramAdapterView.vJi.vIy.Vi("tab_find_friend");
          }
          com.tencent.mm.bh.a.dA(this.mContext);
          break;
        }
        paramAdapterView = View.inflate(this.mContext, R.i.cAI, null);
        paramView = (CheckBox)paramAdapterView.findViewById(R.h.bJR);
        paramView.setChecked(false);
        h.a(this.mContext, this.mContext.getString(R.l.cUG), paramAdapterView, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2103997104128L, 15676);
            if (paramView != null)
            {
              at.AR();
              paramAnonymousDialogInterface = com.tencent.mm.y.c.xh();
              if (paramView.isChecked()) {
                break label87;
              }
            }
            label87:
            for (boolean bool = true;; bool = false)
            {
              paramAnonymousDialogInterface.set(4104, Boolean.valueOf(bool));
              paramAnonymousDialogInterface = LauncherUI.bXe();
              if (paramAnonymousDialogInterface != null) {
                paramAnonymousDialogInterface.vJi.vIy.Vi("tab_find_friend");
              }
              com.tencent.mm.bh.a.dA(aa.this.mContext);
              GMTrace.o(2103997104128L, 15676);
              return;
            }
          }
        }, null);
        break;
        paramAdapterView = bk.BE();
        if ((bg.a(Integer.valueOf(paramAdapterView.fja), 0) <= 0) || (bg.nm(paramAdapterView.getProvince())))
        {
          com.tencent.mm.bj.d.x(this.mContext, "bottle", ".ui.BottleWizardStep1");
          break;
        }
        com.tencent.mm.bj.d.x(this.mContext, "bottle", ".ui.BottleBeachUI");
        break;
        at.AR();
        if (com.tencent.mm.y.c.yF())
        {
          com.tencent.mm.bj.d.x(this.mContext, "webwx", ".ui.WebWXLogoutUI");
          break;
        }
        com.tencent.mm.bj.d.x(this.mContext, "webwx", ".ui.WebWeiXinIntroductionUI");
        break;
        if ((com.tencent.mm.y.q.zP() & 0x10000) == 0) {}
        for (paramInt = i;; paramInt = 0)
        {
          if (paramInt == 0) {
            break label1471;
          }
          com.tencent.mm.bj.d.x(this.mContext, "masssend", ".ui.MassSendHistoryUI");
          break;
        }
        label1471:
        com.tencent.mm.bj.d.b(this.mContext, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", "masssendapp"));
        break;
        com.tencent.mm.bj.d.x(this.mContext, "radar", ".ui.RadarSearchUI");
        break;
        com.tencent.mm.bj.d.x(this.mContext, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
        break;
        com.tencent.mm.plugin.report.service.g.ork.A(10919, "1-6");
        com.tencent.mm.pluginsdk.d.dF(this.mContext);
        break;
        paramAdapterView = new Intent();
        at.AR();
        paramView = (String)com.tencent.mm.y.c.xh().get(w.a.vxQ, "");
        if (!bg.nm(paramView))
        {
          paramAdapterView.putExtra("rawUrl", paramView);
          paramAdapterView.putExtra("showShare", true);
          paramAdapterView.putExtra("show_bottom", false);
          com.tencent.mm.bj.d.b(this.mContext, "webview", ".ui.tools.WebViewUI", paramAdapterView);
          break;
        }
        com.tencent.mm.pluginsdk.d.dF(this.mContext);
        break;
        paramAdapterView = this.mContext;
        paramView = new Intent();
        paramView.putExtra("key_from_scene", 2);
        com.tencent.mm.bj.d.b(paramAdapterView, "offline", ".ui.WalletOfflineEntranceUI", paramView);
        if (!com.tencent.mm.s.c.vK().aE(262159, 266248)) {
          break;
        }
        com.tencent.mm.s.c.vK().aF(262159, 266248);
        com.tencent.mm.plugin.report.service.g.ork.i(14396, new Object[] { Integer.valueOf(2) });
        break;
        com.tencent.mm.pluginsdk.wallet.g.R(this.mContext, 1);
        break;
        paramAdapterView = new Intent();
        paramAdapterView.putExtra("key_from_scene", 2);
        com.tencent.mm.bj.d.b(this.mContext, "offline", ".ui.WalletOfflineEntranceUI", paramAdapterView);
        break;
      }
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(2065610833920L, 15390);
      GMTrace.o(2065610833920L, 15390);
    }
    
    public final int getCount()
    {
      GMTrace.i(2065745051648L, 15391);
      int i = aa.this.vNS.size();
      GMTrace.o(2065745051648L, 15391);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(2065879269376L, 15392);
      GMTrace.o(2065879269376L, 15392);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(2066013487104L, 15393);
      GMTrace.o(2066013487104L, 15393);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(2066147704832L, 15394);
      paramView = (aa.c)aa.this.vNS.get(paramInt);
      paramViewGroup = aa.this.CJ.inflate(R.i.cCn, paramViewGroup, false);
      Object localObject = (TextView)paramViewGroup.findViewById(R.h.title);
      if (!bg.nm(paramView.vOb.vOc)) {
        ((TextView)localObject).setText(paramView.vOb.vOc);
      }
      if (paramView.vOb.textColor > 0) {
        ((TextView)localObject).setTextColor(com.tencent.mm.br.a.c(ab.getContext(), paramView.vOb.textColor));
      }
      localObject = (ImageView)paramViewGroup.findViewById(R.h.icon);
      TextView localTextView;
      View localView;
      if (paramView.vOb.icon > 0)
      {
        ((ImageView)localObject).setVisibility(0);
        ((ImageView)localObject).setImageResource(((aa.c)aa.this.vNS.get(paramInt)).vOb.icon);
        if (!bg.nm(paramView.vOb.vOd)) {
          ((ImageView)localObject).setContentDescription(paramView.vOb.vOd);
        }
        localObject = paramViewGroup.findViewById(R.h.bQN);
        localTextView = (TextView)paramViewGroup.findViewById(R.h.cjl);
        localTextView.setBackgroundResource(com.tencent.mm.ui.tools.s.fH(aa.this.mContext));
        localView = paramViewGroup.findViewById(R.h.bQa);
        if (!paramView.vNZ) {
          break label279;
        }
        ((View)localObject).setVisibility(0);
        label241:
        if (paramInt != getCount() - 1) {
          break label377;
        }
        paramViewGroup.setBackgroundResource(R.g.baI);
      }
      for (;;)
      {
        GMTrace.o(2066147704832L, 15394);
        return paramViewGroup;
        ((ImageView)localObject).setVisibility(8);
        break;
        label279:
        if (paramView.eAs > 0)
        {
          localTextView.setVisibility(0);
          if (paramView.eAs > 99)
          {
            localTextView.setText(R.l.efe);
            break label241;
          }
          localTextView.setText(paramView.eAs);
          break label241;
        }
        if (paramView.vOa)
        {
          localView.setVisibility(0);
          break label241;
        }
        ((View)localObject).setVisibility(8);
        localTextView.setVisibility(8);
        localView.setVisibility(8);
        break label241;
        label377:
        paramViewGroup.setBackgroundResource(R.g.baH);
      }
    }
  }
  
  public static final class b
  {
    int gVC;
    int id;
    int order;
    int vNY;
    
    public b(int paramInt1, int paramInt2, int paramInt3)
    {
      this(paramInt1, paramInt2, paramInt3, 0);
      GMTrace.i(2077421993984L, 15478);
      GMTrace.o(2077421993984L, 15478);
    }
    
    public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(2077556211712L, 15479);
      this.id = paramInt1;
      this.vNY = paramInt2;
      this.gVC = paramInt3;
      this.order = paramInt4;
      GMTrace.o(2077556211712L, 15479);
    }
  }
  
  public static final class c
  {
    int eAs;
    boolean vNZ;
    boolean vOa;
    aa.d vOb;
    
    public c(aa.d paramd)
    {
      GMTrace.i(2876017475584L, 21428);
      this.vNZ = false;
      this.vOa = false;
      this.eAs = 0;
      this.vOb = paramd;
      GMTrace.o(2876017475584L, 21428);
    }
  }
  
  public static final class d
  {
    int icon;
    int textColor;
    String vOc;
    String vOd;
    int vOe;
    
    public d(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
    {
      GMTrace.i(2537654583296L, 18907);
      this.vOc = paramString1;
      this.vOd = paramString2;
      this.icon = paramInt2;
      this.vOe = paramInt1;
      this.textColor = paramInt3;
      GMTrace.o(2537654583296L, 18907);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */