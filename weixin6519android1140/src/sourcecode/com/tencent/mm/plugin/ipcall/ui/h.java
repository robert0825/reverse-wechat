package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.g.m;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class h
  extends o<com.tencent.mm.plugin.ipcall.a.g.c>
  implements d.a
{
  private static HashMap<String, com.tencent.mm.plugin.ipcall.a.g.c> mmO;
  private boolean jul;
  private d mnR;
  private HashMap<Long, com.tencent.mm.plugin.ipcall.a.g.c> mnS;
  private HashSet<String> mnT;
  private boolean mnU;
  private View.OnClickListener mrA;
  ArrayList<k> mrz;
  
  static
  {
    GMTrace.i(11629563478016L, 86647);
    mmO = null;
    GMTrace.o(11629563478016L, 86647);
  }
  
  public h(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(11627281776640L, 86630);
    this.mnS = new HashMap();
    this.mnT = new HashSet();
    this.mnU = false;
    this.jul = false;
    this.mrA = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11651306749952L, 86809);
        if ((paramAnonymousView.getTag() instanceof Integer))
        {
          int i = ((Integer)paramAnonymousView.getTag()).intValue();
          if (!com.tencent.mm.plugin.ipcall.b.c.cJ(h.a(h.this)))
          {
            GMTrace.o(11651306749952L, 86809);
            return;
          }
          k localk = h.this.pz(i);
          View localView = null;
          if (localk.field_addressId > 0L) {
            if (!h.b(h.this).containsKey(Long.valueOf(localk.field_addressId))) {
              break label292;
            }
          }
          label292:
          for (paramAnonymousView = (com.tencent.mm.plugin.ipcall.a.g.c)h.b(h.this).get(Long.valueOf(localk.field_addressId));; paramAnonymousView = i.aIu().cD(localk.field_addressId))
          {
            localView = paramAnonymousView;
            if (paramAnonymousView != null)
            {
              h.b(h.this).put(Long.valueOf(localk.field_addressId), paramAnonymousView);
              localView = paramAnonymousView;
            }
            if (localView == null) {
              break;
            }
            paramAnonymousView = new Intent(h.c(h.this), IPCallTalkUI.class);
            paramAnonymousView.putExtra("IPCallTalkUI_phoneNumber", localk.field_phonenumber);
            paramAnonymousView.putExtra("IPCallTalkUI_contactId", localView.field_contactId);
            paramAnonymousView.putExtra("IPCallTalkUI_nickname", localView.field_systemAddressBookUsername);
            paramAnonymousView.putExtra("IPCallTalkUI_toWechatUsername", localView.field_wechatUsername);
            paramAnonymousView.putExtra("IPCallTalkUI_dialScene", 3);
            g.ork.i(12059, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
            ((FragmentActivity)h.d(h.this)).startActivityForResult(paramAnonymousView, 1001);
            GMTrace.o(11651306749952L, 86809);
            return;
          }
          paramAnonymousView = new Intent(h.e(h.this), IPCallTalkUI.class);
          paramAnonymousView.putExtra("IPCallTalkUI_phoneNumber", localk.field_phonenumber);
          paramAnonymousView.putExtra("IPCallTalkUI_dialScene", 3);
          g.ork.i(12059, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
          ((FragmentActivity)h.f(h.this)).startActivityForResult(paramAnonymousView, 1001);
        }
        GMTrace.o(11651306749952L, 86809);
      }
    };
    lb(true);
    this.mnR = new d(paramContext);
    n.Dh().a(this);
    GMTrace.o(11627281776640L, 86630);
  }
  
  public final void QF()
  {
    GMTrace.i(15572880326656L, 116027);
    this.mrz = m.aIY();
    GMTrace.o(15572880326656L, 116027);
  }
  
  protected final void QG()
  {
    GMTrace.i(11627550212096L, 86632);
    this.mrz = m.aIY();
    GMTrace.o(11627550212096L, 86632);
  }
  
  public final int getCount()
  {
    GMTrace.i(11627684429824L, 86633);
    if (this.mrz == null) {
      this.mrz = m.aIY();
    }
    if (this.mrz != null)
    {
      int i = this.mrz.size();
      GMTrace.o(11627684429824L, 86633);
      return i;
    }
    GMTrace.o(11627684429824L, 86633);
    return 0;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(11628087083008L, 86636);
    paramInt = super.getItemViewType(paramInt);
    GMTrace.o(11628087083008L, 86636);
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11627952865280L, 86635);
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.context).inflate(R.i.cAo, paramViewGroup, false);
      paramView = new a();
      paramView.moh = localView.findViewById(R.h.bIK);
      paramView.moi = localView.findViewById(R.h.buE);
      paramView.hqg = ((ImageView)localView.findViewById(R.h.bfq));
      paramView.iBg = ((TextView)localView.findViewById(R.h.bQX));
      paramView.mnZ = ((TextView)localView.findViewById(R.h.bTd));
      paramView.moa = ((LinearLayout)localView.findViewById(R.h.bXi));
      paramView.mob = ((TextView)localView.findViewById(R.h.bXj));
      paramView.moc = ((TextView)localView.findViewById(R.h.bXk));
      paramView.mod = ((TextView)localView.findViewById(R.h.bdd));
      paramView.moe = ((TextView)localView.findViewById(R.h.bcX));
      paramView.mof = ((ImageView)localView.findViewById(R.h.bcY));
      paramView.mog = localView.findViewById(R.h.bIM);
      paramView.mog.setClickable(true);
      paramView.moj = ((ImageView)localView.findViewById(R.h.divider));
      localView.setTag(paramView);
    }
    a locala = (a)localView.getTag();
    locala.mog.setClickable(true);
    locala.mog.setTag(Integer.valueOf(paramInt));
    locala.moj.setVisibility(8);
    if (oR(paramInt))
    {
      locala.iBg.setVisibility(8);
      locala.mnZ.setVisibility(8);
      locala.moa.setVisibility(8);
      locala.hqg.setVisibility(8);
      locala.hqg.setTag(null);
      locala.moe.setVisibility(8);
      locala.mod.setVisibility(8);
      locala.mof.setVisibility(8);
      GMTrace.o(11627952865280L, 86635);
      return localView;
    }
    k localk = pz(paramInt);
    if (localk != null)
    {
      if (paramInt != 0) {
        break label826;
      }
      locala.moe.setVisibility(0);
      locala.mod.setVisibility(8);
      locala.moe.setText(this.context.getString(R.l.dEB));
      label433:
      locala.moj.setVisibility(0);
      locala.iBg.setVisibility(0);
      paramView = (FrameLayout.LayoutParams)locala.moh.getLayoutParams();
      paramView.height = ((int)locala.mnZ.getContext().getResources().getDimension(R.f.aQV));
      locala.moh.setLayoutParams(paramView);
      paramView = (RelativeLayout.LayoutParams)locala.hqg.getLayoutParams();
      paramView.height = ((int)locala.hqg.getContext().getResources().getDimension(R.f.aQU));
      paramView.width = ((int)locala.hqg.getContext().getResources().getDimension(R.f.aQU));
      locala.hqg.setLayoutParams(paramView);
      if (localk.field_addressId <= 0L) {
        break label864;
      }
      if (!this.mnS.containsKey(Long.valueOf(localk.field_addressId))) {
        break label849;
      }
      paramView = (com.tencent.mm.plugin.ipcall.a.g.c)this.mnS.get(Long.valueOf(localk.field_addressId));
      label606:
      paramViewGroup = paramView;
      if (paramView != null)
      {
        this.mnS.put(Long.valueOf(localk.field_addressId), paramView);
        locala.iBg.setText(paramView.field_systemAddressBookUsername);
        paramViewGroup = paramView;
      }
      label643:
      locala.mnZ.setVisibility(8);
      locala.moa.setVisibility(0);
      locala.moc.setText(com.tencent.mm.plugin.ipcall.b.c.cH(localk.field_calltime));
      if (localk.field_duration <= 0L) {
        break label885;
      }
      locala.mob.setText(com.tencent.mm.plugin.ipcall.b.c.cJ(localk.field_duration));
      label704:
      paramView = locala.hqg;
      if (paramView != null)
      {
        paramView.setVisibility(0);
        paramView.setTag(null);
        paramView.setImageResource(R.g.aXu);
        if (paramViewGroup != null)
        {
          if ((bg.nm(paramViewGroup.field_contactId)) || (bg.nm(paramViewGroup.field_wechatUsername))) {
            break label904;
          }
          this.mnR.a(paramViewGroup.field_contactId, paramViewGroup.field_wechatUsername, paramView);
        }
      }
    }
    for (;;)
    {
      if (!bg.nm(paramViewGroup.field_wechatUsername)) {
        this.mnT.add(paramViewGroup.field_wechatUsername);
      }
      locala.mog.setVisibility(0);
      locala.mof.setVisibility(0);
      locala.mog.setOnClickListener(this.mrA);
      break;
      label826:
      locala.moe.setVisibility(8);
      locala.mod.setVisibility(8);
      break label433;
      label849:
      paramView = i.aIu().cD(localk.field_addressId);
      break label606;
      label864:
      locala.iBg.setText(a.AP(localk.field_phonenumber));
      paramViewGroup = null;
      break label643;
      label885:
      locala.mob.setText(com.tencent.mm.plugin.ipcall.b.c.pE(localk.field_status));
      break label704;
      label904:
      if (!bg.nm(paramViewGroup.field_contactId)) {
        this.mnR.b(paramViewGroup.field_contactId, paramView);
      } else if (!bg.nm(paramViewGroup.field_wechatUsername)) {
        this.mnR.c(paramViewGroup.field_wechatUsername, paramView);
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(11628221300736L, 86637);
    int i = super.getViewTypeCount();
    GMTrace.o(11628221300736L, 86637);
    return i;
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(11628355518464L, 86638);
    if (this.mnT.contains(paramString)) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11653856886784L, 86828);
          h.this.notifyDataSetChanged();
          GMTrace.o(11653856886784L, 86828);
        }
      });
    }
    GMTrace.o(11628355518464L, 86638);
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(11628489736192L, 86639);
    this.mrz = m.aIY();
    this.mnS.clear();
    super.notifyDataSetChanged();
    GMTrace.o(11628489736192L, 86639);
  }
  
  public final k pz(int paramInt)
  {
    GMTrace.i(11627818647552L, 86634);
    k localk = (k)this.mrz.get(paramInt);
    GMTrace.o(11627818647552L, 86634);
    return localk;
  }
  
  private final class a
  {
    ImageView hqg;
    TextView iBg;
    TextView mnZ;
    LinearLayout moa;
    TextView mob;
    TextView moc;
    TextView mod;
    TextView moe;
    ImageView mof;
    View mog;
    View moh;
    View moi;
    ImageView moj;
    
    public a()
    {
      GMTrace.i(11653185798144L, 86823);
      GMTrace.o(11653185798144L, 86823);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */