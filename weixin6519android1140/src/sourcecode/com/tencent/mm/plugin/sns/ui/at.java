package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.h;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.model.g.a;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.protocal.c.tf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.e.d;
import com.tencent.mm.ui.widget.QFadeImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressLint({"UseSparseArrays"})
public final class at
  extends BaseAdapter
{
  private String country;
  boolean eHl;
  private Activity eNu;
  List<com.tencent.mm.plugin.sns.storage.m> ePZ;
  String kNA;
  private String mwK;
  Map<Integer, Integer> pNV;
  Map<Integer, Integer> pNW;
  int pNX;
  int pNY;
  String pWe;
  private ar pYO;
  private an qdV;
  Map<Integer, Integer> qdW;
  private f qdX;
  boolean qdY;
  au qdZ;
  private c qea;
  int qeb;
  int qec;
  private long qed;
  private long qee;
  int qef;
  protected View.OnClickListener qeg;
  private String userName;
  
  public at(Activity paramActivity, f paramf, String paramString, final c paramc)
  {
    GMTrace.i(8351429689344L, 62223);
    this.userName = "";
    this.ePZ = new ArrayList();
    this.pNV = new HashMap();
    this.pNW = new HashMap();
    this.qdW = new HashMap();
    this.pNX = 0;
    this.pNY = 0;
    this.eHl = false;
    this.pWe = "";
    this.qdY = false;
    this.kNA = "";
    this.pYO = null;
    this.mwK = "";
    this.qeb = Integer.MAX_VALUE;
    this.qec = 0;
    this.qed = 0L;
    this.qee = 0L;
    this.qef = 0;
    this.qeg = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8450616590336L, 62962);
        if ((paramAnonymousView.getTag() instanceof biz))
        {
          paramAnonymousView = (biz)paramAnonymousView.getTag();
          if (at.Ji(paramAnonymousView.mmR)) {
            break label124;
          }
          com.tencent.mm.plugin.report.service.g.ork.A(10090, "1,0");
          if ((!com.tencent.mm.p.a.aR(at.a(at.this))) && (!com.tencent.mm.p.a.aP(at.a(at.this))))
          {
            paramAnonymousView = ((com.tencent.mm.at.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.at.a.a.class)).a(ae.zo(), paramAnonymousView, 8);
            paramAnonymousView.uFG = at.b(at.this);
            com.tencent.mm.at.b.b(paramAnonymousView);
          }
        }
        for (;;)
        {
          at.this.notifyDataSetChanged();
          GMTrace.o(8450616590336L, 62962);
          return;
          label124:
          com.tencent.mm.plugin.report.service.g.ork.A(10231, "1");
          com.tencent.mm.at.b.JO();
        }
      }
    };
    this.userName = paramString;
    this.eNu = paramActivity;
    this.qdX = paramf;
    this.qea = paramc;
    this.pYO = ae.biR();
    paramf = com.tencent.mm.sdk.platformtools.v.d(this.eNu.getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0));
    w.d("MicroMsg.SnsphotoAdapter", "filterLan temp " + paramf);
    paramActivity = paramf;
    if (!paramf.equals("zh_CN"))
    {
      paramActivity = paramf;
      if (!paramf.equals("en"))
      {
        if (!paramf.equals("zh_TW")) {
          break label393;
        }
        paramActivity = paramf;
      }
    }
    this.mwK = paramActivity;
    this.country = com.tencent.mm.sdk.platformtools.v.d(this.eNu.getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0));
    com.tencent.mm.kernel.h.xz();
    paramActivity = (String)com.tencent.mm.kernel.h.xy().xh().get(2, null);
    if (this.userName.equals(paramActivity)) {
      this.eHl = true;
    }
    w.d("MicroMsg.SnsphotoAdapter", "SnsphotoAdapter : userName : " + this.userName + " country: " + this.country);
    if (this.eHl) {
      this.qdV = an.bTo();
    }
    for (;;)
    {
      this.qdZ = new au(new au.b()
      {
        public final void a(List<com.tencent.mm.plugin.sns.storage.m> paramAnonymousList, Map<Integer, Integer> paramAnonymousMap1, Map<Integer, Integer> paramAnonymousMap2, Map<Integer, Integer> paramAnonymousMap3, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(8713683337216L, 64922);
          w.d("MicroMsg.SnsphotoAdapter", "onFinishFixPos");
          at localat = at.this;
          w.d("MicroMsg.SnsphotoAdapter", "setSnsList the thread id is " + Thread.currentThread().getId());
          if ((paramAnonymousList == null) || (paramAnonymousList.size() <= 0))
          {
            GMTrace.o(8713683337216L, 64922);
            return;
          }
          w.d("MicroMsg.SnsphotoAdapter", "copy list info");
          int j = paramAnonymousList.size();
          localat.ePZ.clear();
          localat.pNV.clear();
          localat.pNW.clear();
          localat.qdW.clear();
          int i = 0;
          while (i < j)
          {
            com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.storage.m.x((com.tencent.mm.plugin.sns.storage.m)paramAnonymousList.get(i));
            localat.ePZ.add(localm);
            i += 1;
          }
          paramAnonymousList = paramAnonymousMap1.keySet().iterator();
          while (paramAnonymousList.hasNext())
          {
            i = ((Integer)paramAnonymousList.next()).intValue();
            j = ((Integer)paramAnonymousMap1.get(Integer.valueOf(i))).intValue();
            localat.pNV.put(Integer.valueOf(i), Integer.valueOf(j));
          }
          paramAnonymousList = paramAnonymousMap2.keySet().iterator();
          while (paramAnonymousList.hasNext())
          {
            i = ((Integer)paramAnonymousList.next()).intValue();
            j = ((Integer)paramAnonymousMap2.get(Integer.valueOf(i))).intValue();
            localat.pNW.put(Integer.valueOf(i), Integer.valueOf(j));
          }
          paramAnonymousList = paramAnonymousMap3.keySet().iterator();
          while (paramAnonymousList.hasNext())
          {
            i = ((Integer)paramAnonymousList.next()).intValue();
            j = ((Integer)paramAnonymousMap3.get(Integer.valueOf(i))).intValue();
            localat.qdW.put(Integer.valueOf(i), Integer.valueOf(j));
          }
          paramAnonymousMap1.clear();
          paramAnonymousMap2.clear();
          if (localat.eHl)
          {
            if (localat.ePZ.size() <= 1) {}
            for (i = Integer.MAX_VALUE;; i = ((com.tencent.mm.plugin.sns.storage.m)localat.ePZ.get(1)).field_head)
            {
              localat.qeb = 0;
              j = 0;
              while (j < localat.ePZ.size())
              {
                if ((!localat.eHl) || (j != 0))
                {
                  if (i != ((com.tencent.mm.plugin.sns.storage.m)localat.ePZ.get(j)).field_head) {
                    break;
                  }
                  localat.qeb = Math.max(localat.qeb, ((com.tencent.mm.plugin.sns.storage.m)localat.ePZ.get(j)).field_createTime);
                }
                j += 1;
              }
            }
          }
          if (localat.ePZ.isEmpty()) {}
          for (i = Integer.MAX_VALUE;; i = ((com.tencent.mm.plugin.sns.storage.m)localat.ePZ.get(0)).field_head) {
            break;
          }
          if ((localat.ePZ.isEmpty()) || ((localat.eHl) && (localat.ePZ.size() == 1))) {
            localat.qeb = Integer.MAX_VALUE;
          }
          if (localat.ePZ.isEmpty()) {}
          for (i = 0;; i = ((com.tencent.mm.plugin.sns.storage.m)localat.ePZ.get(localat.ePZ.size() - 1)).field_head)
          {
            localat.qec = Integer.MAX_VALUE;
            j = localat.ePZ.size() - 1;
            while ((j >= 0) && (i != 0) && (i == ((com.tencent.mm.plugin.sns.storage.m)localat.ePZ.get(j)).field_head))
            {
              localat.qec = Math.min(localat.qec, ((com.tencent.mm.plugin.sns.storage.m)localat.ePZ.get(j)).field_createTime);
              j -= 1;
            }
          }
          if (localat.ePZ.isEmpty()) {
            localat.qec = 0;
          }
          localat.pNY = paramAnonymousInt1;
          localat.pNX = paramAnonymousInt2;
          w.d("MicroMsg.SnsphotoAdapter", "reallyCount " + paramAnonymousInt1 + " icount " + paramAnonymousInt2 + " stTime " + localat.qeb + " edTIme " + localat.qec);
          localat.notifyDataSetChanged();
          GMTrace.o(8713683337216L, 64922);
        }
        
        public final void bpq()
        {
          GMTrace.i(8713817554944L, 64923);
          at.this.notifyDataSetChanged();
          GMTrace.o(8713817554944L, 64923);
        }
      }, paramString, this.eHl);
      ea(0L);
      id(false);
      GMTrace.o(8351429689344L, 62223);
      return;
      label393:
      if (paramf.equals("zh_HK"))
      {
        paramActivity = "zh_TW";
        break;
      }
      paramActivity = "en";
      break;
      com.tencent.mm.kernel.h.xz();
      paramActivity = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString);
      if ((paramActivity != null) && (com.tencent.mm.l.a.eE(paramActivity.field_type))) {
        this.qdV = an.bTn();
      } else {
        this.qdV = an.bTp();
      }
    }
  }
  
  protected static boolean Ji(String paramString)
  {
    GMTrace.i(8353442955264L, 62238);
    apv localapv = com.tencent.mm.at.b.JS();
    if ((localapv != null) && (com.tencent.mm.at.b.d(localapv)) && (paramString.equals(localapv.ucY)) && (com.tencent.mm.at.b.JQ()))
    {
      GMTrace.o(8353442955264L, 62238);
      return true;
    }
    GMTrace.o(8353442955264L, 62238);
    return false;
  }
  
  private void a(int paramInt1, QFadeImageView paramQFadeImageView, TextView paramTextView1, TextView paramTextView2, TextView paramTextView3, TextView paramTextView4, int paramInt2, d paramd, int paramInt3)
  {
    GMTrace.i(8352234995712L, 62229);
    com.tencent.mm.plugin.sns.storage.m localm = (com.tencent.mm.plugin.sns.storage.m)getItem(paramInt1);
    biz localbiz = localm.blD();
    bfh localbfh = ai.n(localm);
    int i = 0;
    paramInt1 = i;
    if (localbfh != null) {
      if (((localbfh.uEI & 0x2) != 2) || (localbfh.uRb == null))
      {
        paramInt1 = i;
        if ((localbfh.uEI & 0x4) == 4)
        {
          paramInt1 = i;
          if (localbfh.uDw == null) {}
        }
      }
      else
      {
        paramInt1 = 1;
      }
    }
    if ((this.eHl) && (localbfh != null) && (paramInt1 != 0) && (this.userName != null) && (this.userName.equals(localm.field_userName)))
    {
      paramTextView3.setBackgroundResource(i.e.oYi);
      paramTextView3.setVisibility(0);
    }
    Object localObject;
    if (paramInt2 == 1)
    {
      if (ai.F(localm.field_localPrivate, this.eHl))
      {
        paramTextView3.setVisibility(0);
        paramTextView3.setBackgroundResource(i.e.oYc);
        localObject = this.pYO.TE(localm.field_userName);
        if (localObject != null) {
          break label569;
        }
        localObject = "";
        if ((!((String)localObject).equals("")) && (!this.userName.equals(localm.field_userName)))
        {
          paramTextView1.setVisibility(0);
          paramTextView1.setText((CharSequence)localObject);
        }
      }
      label238:
      paramInt1 = localm.pMe;
      paramTextView1 = new at.f.a();
      paramTextView1.ppo = paramInt1;
      if (this.qdW.get(Integer.valueOf(paramInt3)) == null) {
        break label687;
      }
      paramTextView1.position = ((Integer)this.qdW.get(Integer.valueOf(paramInt3))).intValue();
      label298:
      paramQFadeImageView.setTag(paramTextView1);
      paramTextView1 = new an(this.qdV.tag);
      paramTextView1.time = localm.field_createTime;
      if (localbiz.uUc.ueV != 1) {
        break label695;
      }
      paramQFadeImageView.setVisibility(0);
      ae.bja().a(localbiz.uUc.ueW, paramQFadeImageView, this.eNu.hashCode(), g.a.prL, paramTextView1);
      label370:
      if ((localm.biM()) && (localm.bma()))
      {
        paramTextView3.setVisibility(0);
        paramTextView3.setBackgroundResource(i.e.oYb);
      }
      if (paramInt2 == 1)
      {
        if ((localbiz.uUc.ueW == null) || (localbiz.uUc.ueW.size() <= 1)) {
          break label818;
        }
        paramd.qeC.setVisibility(0);
        paramTextView2.setVisibility(0);
        paramInt1 = localbiz.uUc.ueW.size();
        paramTextView2.setText(this.eNu.getResources().getQuantityString(i.h.pgP, paramInt1, new Object[] { Integer.valueOf(paramInt1) }));
      }
    }
    for (;;)
    {
      paramQFadeImageView = localbiz.uTZ;
      if ((paramQFadeImageView != null) && (!paramQFadeImageView.equals("")))
      {
        paramd.qeC.setVisibility(0);
        paramd.pGE.setVisibility(0);
        paramd.pGE.setText(paramQFadeImageView);
        paramd.pGE.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.eNu, paramQFadeImageView, paramd.pGE.getTextSize()));
      }
      GMTrace.o(8352234995712L, 62229);
      return;
      label569:
      localObject = ((com.tencent.mm.l.a)localObject).vk();
      break;
      if (!ai.F(localm.field_localPrivate, this.eHl)) {
        break label238;
      }
      paramTextView3.setVisibility(0);
      paramTextView3.setBackgroundResource(i.e.oYc);
      localObject = this.pYO.TE(localm.field_userName);
      if (localObject == null) {}
      for (localObject = "";; localObject = ((com.tencent.mm.l.a)localObject).vk())
      {
        if ((localObject == null) || (((String)localObject).equals("")) || (this.userName.equals(localm.field_userName))) {
          break label685;
        }
        paramTextView1.setVisibility(0);
        paramTextView1.setText((CharSequence)localObject);
        break;
      }
      label685:
      break label238;
      label687:
      paramTextView1.position = 0;
      break label298;
      label695:
      if (localbiz.uUc.ueV == 2)
      {
        paramTextView4.setText(bg.aq(localbiz.uUc.lPj, ""));
        paramTextView4.setVisibility(0);
        break label370;
      }
      if (localbiz.uUc.ueV != 21) {
        break label370;
      }
      localm.blQ();
      boolean bool = true;
      if (this.eHl) {
        bool = true;
      }
      for (;;)
      {
        paramQFadeImageView.setVisibility(0);
        ae.bja().a(localbiz.uUc.ueW, paramQFadeImageView, this.eNu.hashCode(), g.a.prL, paramTextView1, bool);
        break;
        if (com.tencent.mm.plugin.sns.lucky.a.m.a(localm, localbfh)) {
          bool = false;
        }
      }
      label818:
      paramTextView2.setVisibility(8);
    }
  }
  
  private void a(TextView paramTextView1, TextView paramTextView2, long paramLong)
  {
    GMTrace.i(8351832342528L, 62226);
    Object localObject = this.eNu;
    if (!this.mwK.equals("en")) {}
    for (boolean bool = true;; bool = false)
    {
      localObject = (String)az.a((Context)localObject, 1000L * paramLong, bool);
      if (((String)localObject).indexOf(":") <= 0) {
        break;
      }
      localObject = ((String)localObject).split(":");
      if (localObject[1].length() < 2) {
        localObject[1] = ("0" + localObject[1]);
      }
      paramTextView1.setText(localObject[0]);
      paramTextView2.setText(localObject[1]);
      paramTextView2.setVisibility(0);
      paramTextView1.setVisibility(0);
      GMTrace.o(8351832342528L, 62226);
      return;
    }
    if (((String)localObject).indexOf("/") > 0)
    {
      localObject = ((String)localObject).split("/");
      if (localObject[1].length() < 2) {
        localObject[1] = ("0" + localObject[1]);
      }
      localObject[0] = az.s(this.eNu, localObject[0], this.mwK);
      paramTextView1.setText(localObject[0]);
      paramTextView2.setText(localObject[1]);
      paramTextView2.setVisibility(0);
      paramTextView1.setVisibility(0);
      GMTrace.o(8351832342528L, 62226);
      return;
    }
    paramTextView2.setVisibility(0);
    paramTextView2.setText((CharSequence)localObject);
    GMTrace.o(8351832342528L, 62226);
  }
  
  private void ea(long paramLong)
  {
    GMTrace.i(8352906084352L, 62234);
    Object localObject = i.du(ae.bjd().a(paramLong, ae.biT().Hy(this.userName), this.userName, this.eHl));
    if (this.pWe.equals("")) {}
    for (;;)
    {
      this.kNA = ((String)localObject);
      localObject = ae.bjh().Iw(this.userName).blP();
      if (((tf)localObject).ujh != 0L) {
        break;
      }
      GMTrace.o(8352906084352L, 62234);
      return;
      if (((String)localObject).compareTo(this.pWe) >= 0) {
        localObject = this.pWe;
      }
    }
    localObject = i.du(((tf)localObject).ujh);
    if (this.kNA.equals(""))
    {
      this.kNA = ((String)localObject);
      GMTrace.o(8352906084352L, 62234);
      return;
    }
    if (((String)localObject).compareTo(this.kNA) > 0) {}
    for (;;)
    {
      this.kNA = ((String)localObject);
      GMTrace.o(8352906084352L, 62234);
      return;
      localObject = this.kNA;
    }
  }
  
  private void id(boolean paramBoolean)
  {
    GMTrace.i(8352369213440L, 62230);
    w.d("MicroMsg.SnsphotoAdapter", "limitSeq " + this.kNA);
    if (this.qdZ != null) {
      this.qdZ.e(this.kNA, this.qdY, paramBoolean);
    }
    GMTrace.o(8352369213440L, 62230);
  }
  
  public final void bny()
  {
    GMTrace.i(8352637648896L, 62232);
    id(true);
    notifyDataSetChanged();
    GMTrace.o(8352637648896L, 62232);
  }
  
  public final void bpp()
  {
    GMTrace.i(8352771866624L, 62233);
    w.d("MicroMsg.SnsphotoAdapter", "i addSize ");
    if (this.ePZ.isEmpty()) {}
    for (long l = 0L;; l = ((com.tencent.mm.plugin.sns.storage.m)this.ePZ.get(this.ePZ.size() - 1)).field_snsId)
    {
      ea(l);
      GMTrace.o(8352771866624L, 62233);
      return;
    }
  }
  
  public final void dZ(long paramLong)
  {
    GMTrace.i(8351295471616L, 62222);
    if (0L != this.qed)
    {
      GMTrace.o(8351295471616L, 62222);
      return;
    }
    this.qed = paramLong;
    this.qee = 0L;
    GMTrace.o(8351295471616L, 62222);
  }
  
  public final ArrayList<com.tencent.mm.plugin.sns.g.b> df(int paramInt1, int paramInt2)
  {
    GMTrace.i(8353308737536L, 62237);
    ArrayList localArrayList = new ArrayList();
    this.qef = paramInt2;
    paramInt2 = 0;
    while (paramInt2 < this.ePZ.size())
    {
      com.tencent.mm.plugin.sns.storage.m localm = (com.tencent.mm.plugin.sns.storage.m)this.ePZ.get(paramInt2);
      int j = localm.pMe;
      if ((localm.blD() != null) && (localm.blD().uUc != null) && (localm.blD().uUc.ueW.size() != 0) && ((localm.blD().uUc.ueV == 1) || (localm.blD().uUc.ueV == 15)))
      {
        if (j == paramInt1) {
          this.qef = localArrayList.size();
        }
        Iterator localIterator = localm.blD().uUc.ueW.iterator();
        int i = 0;
        while (localIterator.hasNext())
        {
          anu localanu = (anu)localIterator.next();
          com.tencent.mm.plugin.sns.g.b localb = new com.tencent.mm.plugin.sns.g.b();
          localb.eUs = localanu;
          localb.pyW = u.X("sns_table_", j);
          localb.gGY = localm.field_createTime;
          localb.pyX = i;
          localArrayList.add(localb);
          i += 1;
        }
      }
      paramInt2 += 1;
    }
    GMTrace.o(8353308737536L, 62237);
    return localArrayList;
  }
  
  public final int getCount()
  {
    GMTrace.i(8351698124800L, 62225);
    int i = this.pNX;
    GMTrace.o(8351698124800L, 62225);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(8353040302080L, 62235);
    Object localObject = this.ePZ.get(paramInt);
    GMTrace.o(8353040302080L, 62235);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(8353174519808L, 62236);
    GMTrace.o(8353174519808L, 62236);
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(8351966560256L, 62227);
    if ((this.eHl) && (paramInt == 0))
    {
      w.d("MicroMsg.SnsphotoAdapter", "position isSelf " + paramInt + " - 0");
      GMTrace.o(8351966560256L, 62227);
      return 0;
    }
    if (this.pNV.get(Integer.valueOf(paramInt)) != null) {}
    for (int i = ((Integer)this.pNV.get(Integer.valueOf(paramInt))).intValue();; i = -1)
    {
      if (i == -1)
      {
        w.e("MicroMsg.SnsphotoAdapter", "unknow error " + i);
        GMTrace.o(8351966560256L, 62227);
        return 0;
      }
      com.tencent.mm.plugin.sns.storage.m localm = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
      if (localm.blD().uUc.ueV == 1)
      {
        w.d("MicroMsg.SnsphotoAdapter", "position " + paramInt + " - 0");
        GMTrace.o(8351966560256L, 62227);
        return 0;
      }
      if (localm.blD().uUc.ueV == 15)
      {
        w.d("MicroMsg.SnsphotoAdapter", "position " + paramInt + " - 2");
        GMTrace.o(8351966560256L, 62227);
        return 2;
      }
      if (localm.blD().uUc.ueV == 21)
      {
        GMTrace.o(8351966560256L, 62227);
        return 3;
      }
      GMTrace.o(8351966560256L, 62227);
      return 1;
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(8351563907072L, 62224);
    int i = getItemViewType(paramInt);
    w.i("MicroMsg.SnsphotoAdapter", "position " + i);
    Object localObject1;
    int j;
    if (i == 0)
    {
      if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof d)))
      {
        paramViewGroup = new d();
        paramView = com.tencent.mm.ui.v.fb(this.eNu).inflate(i.g.pga, null);
        paramViewGroup.qel = ((TextView)paramView.findViewById(i.f.pcP));
        paramViewGroup.qek = ((TextView)paramView.findViewById(i.f.pdm));
        paramViewGroup.qeu = ((MaskImageView)paramView.findViewById(i.f.paT));
        paramViewGroup.qev = ((QFadeImageView)paramView.findViewById(i.f.pel));
        paramViewGroup.qew = ((MaskImageView)paramView.findViewById(i.f.paU));
        paramViewGroup.qex = ((MaskImageView)paramView.findViewById(i.f.paV));
        paramViewGroup.pGE = ((TextView)paramView.findViewById(i.f.btg));
        paramViewGroup.qey = ((TextView)paramView.findViewById(i.f.peF));
        paramViewGroup.qez = ((TextView)paramView.findViewById(i.f.peG));
        paramViewGroup.qeA = ((TextView)paramView.findViewById(i.f.peH));
        paramViewGroup.qeB = ((TextView)paramView.findViewById(i.f.paX));
        paramViewGroup.qeC = paramView.findViewById(i.f.pau);
        paramViewGroup.qeo = ((TextView)paramView.findViewById(i.f.coT));
        paramViewGroup.qem = ((LinearLayout)paramView.findViewById(i.f.pbj));
        paramViewGroup.qen = ((ImageView)paramView.findViewById(i.f.pbr));
        paramViewGroup.pOm = ((LinearLayout)paramView.findViewById(i.f.pbl));
        paramViewGroup.pOn = paramView.findViewById(i.f.pbi);
        paramViewGroup.qev.setOnClickListener(this.qdX.pOd);
        paramViewGroup.qeu.setOnClickListener(this.qdX.pOd);
        paramViewGroup.qew.setOnClickListener(this.qdX.pOe);
        paramViewGroup.qex.setOnClickListener(this.qdX.pOf);
        paramViewGroup.qeD = ((TextView)paramView.findViewById(i.f.pez));
        paramViewGroup.qeE = ((TextView)paramView.findViewById(i.f.peA));
        paramViewGroup.qeF = ((TextView)paramView.findViewById(i.f.peB));
        paramViewGroup.qeG = ((TextView)paramView.findViewById(i.f.per));
        paramViewGroup.qeH = ((TextView)paramView.findViewById(i.f.pes));
        paramViewGroup.qeI = ((TextView)paramView.findViewById(i.f.pet));
        paramViewGroup.qeJ = ((MaskLinearLayout)paramView.findViewById(i.f.pdj));
        paramViewGroup.qeJ.b(paramViewGroup.qeu);
        paramViewGroup.qep = ((LinearLayout)paramView.findViewById(i.f.paG));
        paramViewGroup.qeq = ((TextView)paramView.findViewById(i.f.pdz));
        paramViewGroup.qeq.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8470883467264L, 63113);
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("enter_scene", e.d.vGI);
            d.b(at.a(at.this), "setting", ".ui.setting.SettingsPrivacyUI", paramAnonymousView);
            com.tencent.mm.plugin.report.service.g.ork.i(14098, new Object[] { Integer.valueOf(8) });
            GMTrace.o(8470883467264L, 63113);
          }
        });
        paramView.setTag(paramViewGroup);
      }
      for (;;)
      {
        ae.bja().cq(paramViewGroup.qeu);
        ae.bja().cq(paramViewGroup.qew);
        ae.bja().cq(paramViewGroup.qex);
        i = -1;
        if (this.pNV.get(Integer.valueOf(paramInt)) != null) {
          i = ((Integer)this.pNV.get(Integer.valueOf(paramInt))).intValue();
        }
        paramViewGroup.init();
        paramViewGroup.qeJ.eDU = false;
        paramViewGroup.qeJ.setBackgroundResource(0);
        paramViewGroup.qeJ.setDescendantFocusability(131072);
        paramViewGroup.qeJ.setClickable(false);
        paramViewGroup.qeu.eDU = true;
        paramViewGroup.qeu.setClickable(true);
        paramViewGroup.qeJ.setOnClickListener(null);
        if ((i < this.pNY) && (i != -1)) {
          break;
        }
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
        paramView.setVisibility(8);
        GMTrace.o(8351563907072L, 62224);
        return paramView;
        paramViewGroup = (d)paramView.getTag();
      }
      if (i - 1 < 0) {
        break label5862;
      }
      localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i - 1);
      j = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head;
      ai.F(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_localPrivate, this.eHl);
    }
    for (;;)
    {
      paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
      paramView.setVisibility(0);
      if (this.pNW.get(Integer.valueOf(paramInt)) != null) {}
      for (int k = ((Integer)this.pNW.get(Integer.valueOf(paramInt))).intValue();; k = 1)
      {
        localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
        Object localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD();
        long l;
        if (((this.eHl) && (paramInt == 0)) || (j == -1) || (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head != j))
        {
          l = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
          a(paramViewGroup.qek, paramViewGroup.qel, l);
          if (((biz)localObject2).uUa != null)
          {
            localObject2 = ((biz)localObject2).uUa.gCz;
            if ((localObject2 != null) && (!((String)localObject2).equals("")))
            {
              paramViewGroup.qeo.setText((CharSequence)localObject2);
              paramViewGroup.qeo.setVisibility(0);
            }
          }
          paramViewGroup.pOn.setVisibility(0);
        }
        if ((this.qee != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId == this.qee))
        {
          paramViewGroup.qep.setVisibility(0);
          paramViewGroup.qem.setVisibility(0);
          if ((!this.eHl) || (paramInt != 0)) {
            break label1218;
          }
          paramViewGroup.qev.setVisibility(0);
          paramViewGroup.qev.setContentDescription(this.eNu.getString(i.j.pkR));
          paramViewGroup.qeu.setVisibility(8);
          localObject2 = paramViewGroup.pGE;
          if (this.pNX != 1) {
            break label1211;
          }
        }
        label1211:
        for (localObject1 = this.eNu.getString(i.j.pli);; localObject1 = "")
        {
          ((TextView)localObject2).setText((CharSequence)localObject1);
          paramViewGroup.pGE.setVisibility(0);
          paramViewGroup.qeC.setVisibility(0);
          paramViewGroup.qeB.setVisibility(8);
          ae.bja().b(paramViewGroup.qev, i.c.gcl, i.e.oYv, this.eNu.hashCode());
          localObject1 = new at.f.a();
          ((at.f.a)localObject1).ppo = -1;
          ((at.f.a)localObject1).position = -1;
          paramViewGroup.qev.setTag(localObject1);
          GMTrace.o(8351563907072L, 62224);
          return paramView;
          if ((this.qee == 0L) && (this.qed != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId <= this.qed))
          {
            paramViewGroup.qep.setVisibility(0);
            this.qee = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId;
            break;
          }
          paramViewGroup.qep.setVisibility(8);
          break;
        }
        label1218:
        if (k > 0) {
          a(i, paramViewGroup.qeu, paramViewGroup.qey, paramViewGroup.qeB, paramViewGroup.qeD, paramViewGroup.qeG, 1, paramViewGroup, paramInt);
        }
        if (k >= 2) {
          a(i + 1, paramViewGroup.qew, paramViewGroup.qez, paramViewGroup.qeB, paramViewGroup.qeE, paramViewGroup.qeH, 2, paramViewGroup, paramInt);
        }
        if (k >= 3) {
          a(i + 2, paramViewGroup.qex, paramViewGroup.qeA, paramViewGroup.qeB, paramViewGroup.qeF, paramViewGroup.qeI, 3, paramViewGroup, paramInt);
        }
        if (k == 1)
        {
          localObject2 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
          if ((!bg.nm(((com.tencent.mm.plugin.sns.storage.m)localObject2).blD().uTZ)) && (((com.tencent.mm.plugin.sns.storage.m)localObject2).field_type == 1))
          {
            paramViewGroup.qeJ.setDescendantFocusability(393216);
            paramViewGroup.qeJ.setClickable(true);
            paramViewGroup.qeu.setClickable(false);
            paramViewGroup.qeu.eDU = false;
            paramViewGroup.qeJ.setOnClickListener(this.qdX.pOd);
            paramViewGroup.qeJ.eDU = true;
            i = ((com.tencent.mm.plugin.sns.storage.m)localObject1).pMe;
            localObject1 = new at.f.a();
            ((at.f.a)localObject1).ppo = i;
            if (this.qdW.get(Integer.valueOf(paramInt)) == null) {
              break label1510;
            }
          }
        }
        label1510:
        for (((at.f.a)localObject1).position = ((Integer)this.qdW.get(Integer.valueOf(paramInt))).intValue();; ((at.f.a)localObject1).position = 0)
        {
          paramViewGroup.qeJ.setTag(localObject1);
          paramView.setDrawingCacheEnabled(false);
          GMTrace.o(8351563907072L, 62224);
          return paramView;
        }
        if (i == 2) {
          if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof e)))
          {
            paramViewGroup = new e();
            paramView = com.tencent.mm.ui.v.fb(this.eNu).inflate(i.g.pgk, null);
            paramViewGroup.qel = ((TextView)paramView.findViewById(i.f.pcP));
            paramViewGroup.qek = ((TextView)paramView.findViewById(i.f.pdm));
            paramViewGroup.qeu = ((MaskImageView)paramView.findViewById(i.f.paT));
            paramViewGroup.qeo = ((TextView)paramView.findViewById(i.f.coT));
            paramViewGroup.qem = ((LinearLayout)paramView.findViewById(i.f.pbj));
            paramViewGroup.qen = ((ImageView)paramView.findViewById(i.f.pbr));
            paramViewGroup.pOm = ((LinearLayout)paramView.findViewById(i.f.pbl));
            paramViewGroup.pOn = paramView.findViewById(i.f.pbi);
            paramViewGroup.qeu.setOnClickListener(this.qdX.qeM);
            paramViewGroup.qeD = ((TextView)paramView.findViewById(i.f.pez));
            paramViewGroup.qeJ = ((MaskLinearLayout)paramView.findViewById(i.f.pdj));
            paramViewGroup.qeJ.b(paramViewGroup.qeu);
            paramViewGroup.pGE = ((TextView)paramView.findViewById(i.f.btg));
            paramViewGroup.qeC = paramView.findViewById(i.f.pau);
            paramViewGroup.qep = ((LinearLayout)paramView.findViewById(i.f.paG));
            paramViewGroup.qeq = ((TextView)paramView.findViewById(i.f.pdz));
            paramViewGroup.qeq.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(8751666954240L, 65205);
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("enter_scene", e.d.vGI);
                d.b(at.a(at.this), "setting", ".ui.setting.SettingsPrivacyUI", paramAnonymousView);
                com.tencent.mm.plugin.report.service.g.ork.i(14098, new Object[] { Integer.valueOf(8) });
                GMTrace.o(8751666954240L, 65205);
              }
            });
            paramView.setTag(paramViewGroup);
            ae.bja().cq(paramViewGroup.qeu);
            if (this.pNV.get(Integer.valueOf(paramInt)) == null) {
              break label5850;
            }
          }
        }
        label2645:
        label3762:
        label3769:
        label3976:
        label4326:
        label4679:
        label4735:
        label4990:
        label4998:
        label5011:
        label5163:
        label5314:
        label5326:
        label5383:
        label5399:
        label5585:
        label5610:
        label5689:
        label5772:
        label5785:
        label5797:
        label5810:
        label5823:
        label5832:
        label5838:
        label5850:
        for (i = ((Integer)this.pNV.get(Integer.valueOf(paramInt))).intValue();; i = -1)
        {
          paramViewGroup.init();
          paramViewGroup.qeJ.eDU = false;
          paramViewGroup.qeJ.setBackgroundResource(0);
          paramViewGroup.qeJ.setDescendantFocusability(131072);
          paramViewGroup.qeJ.setClickable(false);
          paramViewGroup.qeu.eDU = true;
          paramViewGroup.qeu.setClickable(true);
          paramViewGroup.qeJ.setOnClickListener(null);
          if ((i >= this.pNY) || (i == -1))
          {
            paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
            paramView.setVisibility(8);
            GMTrace.o(8351563907072L, 62224);
            return paramView;
            paramViewGroup = (e)paramView.getTag();
            break;
          }
          if (i - 1 >= 0)
          {
            localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i - 1);
            j = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head;
            ai.F(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_localPrivate, this.eHl);
          }
          for (;;)
          {
            paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            paramView.setVisibility(0);
            if (this.pNW.get(Integer.valueOf(paramInt)) != null) {
              ((Integer)this.pNW.get(Integer.valueOf(paramInt))).intValue();
            }
            localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
            localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD();
            Object localObject3;
            if (((this.eHl) && (paramInt == 0)) || (j == -1) || (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head != j))
            {
              l = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
              a(paramViewGroup.qek, paramViewGroup.qel, l);
              if (((biz)localObject2).uUa != null)
              {
                localObject3 = ((biz)localObject2).uUa.gCz;
                if ((localObject3 != null) && (!((String)localObject3).equals("")))
                {
                  paramViewGroup.qeo.setText((CharSequence)localObject3);
                  paramViewGroup.qeo.setVisibility(0);
                }
              }
              paramViewGroup.pOn.setVisibility(0);
            }
            if ((this.qee != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId == this.qee))
            {
              paramViewGroup.qep.setVisibility(0);
              paramViewGroup.qem.setVisibility(0);
              ai.n((com.tencent.mm.plugin.sns.storage.m)localObject1);
              localObject3 = new an(this.qdV.tag);
              ((an)localObject3).time = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
              paramViewGroup.qeu.setVisibility(0);
              ae.bja().a(((biz)localObject2).uUc.ueW, paramViewGroup.qeu, this.eNu.hashCode(), g.a.prL, (an)localObject3);
              if (ai.F(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_localPrivate, this.eHl))
              {
                paramViewGroup.qeD.setVisibility(0);
                paramViewGroup.qeD.setBackgroundResource(i.e.oYc);
                localObject2 = this.pYO.TE(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
                if (localObject2 != null) {
                  ((com.tencent.mm.l.a)localObject2).vk();
                }
              }
              localObject2 = ((com.tencent.mm.plugin.sns.storage.m)getItem(i)).blD().uTZ;
              if ((localObject2 != null) && (!((String)localObject2).equals("")))
              {
                paramViewGroup.qeC.setVisibility(0);
                paramViewGroup.pGE.setVisibility(0);
                paramViewGroup.pGE.setText((CharSequence)localObject2);
                paramViewGroup.pGE.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.eNu, (CharSequence)localObject2, paramViewGroup.pGE.getTextSize()));
              }
              paramViewGroup.qeJ.setDescendantFocusability(393216);
              paramViewGroup.qeJ.setClickable(true);
              paramViewGroup.qeu.setClickable(false);
              paramViewGroup.qeu.eDU = false;
              paramViewGroup.qeJ.setOnClickListener(this.qdX.qeM);
              paramViewGroup.qeJ.eDU = true;
              i = ((com.tencent.mm.plugin.sns.storage.m)localObject1).pMe;
              localObject1 = new at.f.a();
              ((at.f.a)localObject1).ppo = i;
              if (this.qdW.get(Integer.valueOf(paramInt)) == null) {
                break label2645;
              }
            }
            for (((at.f.a)localObject1).position = ((Integer)this.qdW.get(Integer.valueOf(paramInt))).intValue();; ((at.f.a)localObject1).position = 0)
            {
              paramViewGroup.qeJ.setTag(localObject1);
              paramView.setDrawingCacheEnabled(false);
              GMTrace.o(8351563907072L, 62224);
              return paramView;
              if ((this.qee == 0L) && (this.qed != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId <= this.qed))
              {
                paramViewGroup.qep.setVisibility(0);
                this.qee = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId;
                break;
              }
              paramViewGroup.qep.setVisibility(8);
              break;
            }
            if (i == 3)
            {
              if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof d)))
              {
                paramViewGroup = new d();
                paramView = com.tencent.mm.ui.v.fb(this.eNu).inflate(i.g.pga, null);
                paramViewGroup.qel = ((TextView)paramView.findViewById(i.f.pcP));
                paramViewGroup.qek = ((TextView)paramView.findViewById(i.f.pdm));
                paramViewGroup.qeu = ((MaskImageView)paramView.findViewById(i.f.paT));
                paramViewGroup.qev = ((QFadeImageView)paramView.findViewById(i.f.pel));
                paramViewGroup.qew = ((MaskImageView)paramView.findViewById(i.f.paU));
                paramViewGroup.qex = ((MaskImageView)paramView.findViewById(i.f.paV));
                paramViewGroup.pGE = ((TextView)paramView.findViewById(i.f.btg));
                paramViewGroup.qey = ((TextView)paramView.findViewById(i.f.peF));
                paramViewGroup.qez = ((TextView)paramView.findViewById(i.f.peG));
                paramViewGroup.qeA = ((TextView)paramView.findViewById(i.f.peH));
                paramViewGroup.qeB = ((TextView)paramView.findViewById(i.f.paX));
                paramViewGroup.qeC = paramView.findViewById(i.f.pau);
                paramViewGroup.qeo = ((TextView)paramView.findViewById(i.f.coT));
                paramViewGroup.qem = ((LinearLayout)paramView.findViewById(i.f.pbj));
                paramViewGroup.qen = ((ImageView)paramView.findViewById(i.f.pbr));
                paramViewGroup.pOm = ((LinearLayout)paramView.findViewById(i.f.pbl));
                paramViewGroup.pOn = paramView.findViewById(i.f.pbi);
                paramViewGroup.qev.setOnClickListener(this.qdX.qeL);
                paramViewGroup.qeu.setOnClickListener(this.qdX.qeL);
                paramViewGroup.qeD = ((TextView)paramView.findViewById(i.f.pez));
                paramViewGroup.qeE = ((TextView)paramView.findViewById(i.f.peA));
                paramViewGroup.qeF = ((TextView)paramView.findViewById(i.f.peB));
                paramViewGroup.qeG = ((TextView)paramView.findViewById(i.f.per));
                paramViewGroup.qeH = ((TextView)paramView.findViewById(i.f.pes));
                paramViewGroup.qeI = ((TextView)paramView.findViewById(i.f.pet));
                paramViewGroup.qeJ = ((MaskLinearLayout)paramView.findViewById(i.f.pdj));
                paramViewGroup.qeJ.b(paramViewGroup.qeu);
                paramViewGroup.qep = ((LinearLayout)paramView.findViewById(i.f.paG));
                paramViewGroup.qeq = ((TextView)paramView.findViewById(i.f.pdz));
                paramViewGroup.qeq.setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymousView)
                  {
                    GMTrace.i(8616241266688L, 64196);
                    paramAnonymousView = new Intent();
                    paramAnonymousView.putExtra("enter_scene", e.d.vGI);
                    d.b(at.a(at.this), "setting", ".ui.setting.SettingsPrivacyUI", paramAnonymousView);
                    com.tencent.mm.plugin.report.service.g.ork.i(14098, new Object[] { Integer.valueOf(8) });
                    GMTrace.o(8616241266688L, 64196);
                  }
                });
                paramView.setTag(paramViewGroup);
              }
              for (;;)
              {
                ae.bja().cq(paramViewGroup.qeu);
                ae.bja().cq(paramViewGroup.qew);
                ae.bja().cq(paramViewGroup.qex);
                i = -1;
                if (this.pNV.get(Integer.valueOf(paramInt)) != null) {
                  i = ((Integer)this.pNV.get(Integer.valueOf(paramInt))).intValue();
                }
                paramViewGroup.init();
                paramViewGroup.qeJ.eDU = false;
                paramViewGroup.qeJ.setBackgroundResource(0);
                paramViewGroup.qeJ.setDescendantFocusability(131072);
                paramViewGroup.qeJ.setClickable(false);
                paramViewGroup.qeu.eDU = true;
                paramViewGroup.qeu.setClickable(true);
                paramViewGroup.qeJ.setOnClickListener(null);
                if ((i < this.pNY) && (i != -1)) {
                  break;
                }
                paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
                paramView.setVisibility(8);
                GMTrace.o(8351563907072L, 62224);
                return paramView;
                paramViewGroup = (d)paramView.getTag();
              }
              if (i - 1 < 0) {
                break label5838;
              }
              localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i - 1);
              j = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head;
              ai.F(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_localPrivate, this.eHl);
            }
            for (;;)
            {
              paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
              paramView.setVisibility(0);
              localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
              localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD();
              if (((this.eHl) && (paramInt == 0)) || (j == -1) || (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head != j))
              {
                l = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
                a(paramViewGroup.qek, paramViewGroup.qel, l);
                if (((biz)localObject2).uUa != null)
                {
                  localObject2 = ((biz)localObject2).uUa.gCz;
                  if ((localObject2 != null) && (!((String)localObject2).equals("")))
                  {
                    paramViewGroup.qeo.setText((CharSequence)localObject2);
                    paramViewGroup.qeo.setVisibility(0);
                  }
                }
                paramViewGroup.pOn.setVisibility(0);
              }
              if ((this.qee != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId == this.qee))
              {
                paramViewGroup.qep.setVisibility(0);
                paramViewGroup.qem.setVisibility(0);
                if ((!this.eHl) || (paramInt != 0)) {
                  break label3769;
                }
                paramViewGroup.qev.setVisibility(0);
                paramViewGroup.qev.setContentDescription(this.eNu.getString(i.j.pkR));
                paramViewGroup.qeu.setVisibility(8);
                localObject2 = paramViewGroup.pGE;
                if (this.pNX != 1) {
                  break label3762;
                }
              }
              for (localObject1 = this.eNu.getString(i.j.pli);; localObject1 = "")
              {
                ((TextView)localObject2).setText((CharSequence)localObject1);
                paramViewGroup.pGE.setVisibility(0);
                paramViewGroup.qeC.setVisibility(0);
                paramViewGroup.qeB.setVisibility(8);
                ae.bja().b(paramViewGroup.qev, i.c.gcl, i.e.oYv, this.eNu.hashCode());
                localObject1 = new at.f.a();
                ((at.f.a)localObject1).ppo = -1;
                ((at.f.a)localObject1).position = -1;
                paramViewGroup.qev.setTag(localObject1);
                GMTrace.o(8351563907072L, 62224);
                return paramView;
                if ((this.qee == 0L) && (this.qed != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId <= this.qed))
                {
                  paramViewGroup.qep.setVisibility(0);
                  this.qee = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId;
                  break;
                }
                paramViewGroup.qep.setVisibility(8);
                break;
              }
              a(i, paramViewGroup.qeu, paramViewGroup.qey, paramViewGroup.qeB, paramViewGroup.qeD, paramViewGroup.qeG, 1, paramViewGroup, paramInt);
              localObject2 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
              if ((!bg.nm(((com.tencent.mm.plugin.sns.storage.m)localObject2).blD().uTZ)) && (((com.tencent.mm.plugin.sns.storage.m)localObject2).field_type == 1))
              {
                paramViewGroup.qeJ.setDescendantFocusability(393216);
                paramViewGroup.qeJ.setClickable(true);
                paramViewGroup.qeu.setClickable(false);
                paramViewGroup.qeu.eDU = false;
                paramViewGroup.qeJ.setOnClickListener(this.qdX.qeL);
                paramViewGroup.qeJ.eDU = true;
                i = ((com.tencent.mm.plugin.sns.storage.m)localObject1).pMe;
                localObject1 = new at.f.a();
                ((at.f.a)localObject1).ppo = i;
                if (this.qdW.get(Integer.valueOf(paramInt)) == null) {
                  break label3976;
                }
              }
              for (((at.f.a)localObject1).position = ((Integer)this.qdW.get(Integer.valueOf(paramInt))).intValue();; ((at.f.a)localObject1).position = 0)
              {
                paramViewGroup.qeJ.setTag(localObject1);
                paramView.setDrawingCacheEnabled(false);
                GMTrace.o(8351563907072L, 62224);
                return paramView;
              }
              if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof b)))
              {
                localObject2 = new b();
                paramView = com.tencent.mm.ui.v.fb(this.eNu).inflate(i.g.pfZ, null);
                ((b)localObject2).qej = paramView.findViewById(i.f.gdc);
                ((b)localObject2).qel = ((TextView)paramView.findViewById(i.f.pcP));
                ((b)localObject2).qek = ((TextView)paramView.findViewById(i.f.pdm));
                ((b)localObject2).qeo = ((TextView)paramView.findViewById(i.f.coT));
                ((b)localObject2).pOn = paramView.findViewById(i.f.pbi);
                ((b)localObject2).qeo = ((TextView)paramView.findViewById(i.f.coT));
                ((b)localObject2).qem = ((LinearLayout)paramView.findViewById(i.f.pbj));
                ((b)localObject2).qen = ((ImageView)paramView.findViewById(i.f.pbr));
                ((b)localObject2).pOm = ((LinearLayout)paramView.findViewById(i.f.pbl));
                ((b)localObject2).mrx = ((TextView)paramView.findViewById(i.f.bti));
                ((b)localObject2).qer = ((TagImageView)paramView.findViewById(i.f.paQ));
                ((b)localObject2).pOP = ((ImageView)paramView.findViewById(i.f.state));
                ((b)localObject2).hqi = ((TextView)paramView.findViewById(i.f.pep));
                ((b)localObject2).qes = ((TextView)paramView.findViewById(i.f.pbK));
                ((b)localObject2).qej.setOnClickListener(this.qdX.qeK);
                ((b)localObject2).qet = paramView.findViewById(i.f.pbt);
                ((b)localObject2).qep = ((LinearLayout)paramView.findViewById(i.f.paG));
                ((b)localObject2).qeq = ((TextView)paramView.findViewById(i.f.pdz));
                ((b)localObject2).qeq.setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymousView)
                  {
                    GMTrace.i(8566178054144L, 63823);
                    paramAnonymousView = new Intent();
                    paramAnonymousView.putExtra("enter_scene", e.d.vGI);
                    d.b(at.a(at.this), "setting", ".ui.setting.SettingsPrivacyUI", paramAnonymousView);
                    com.tencent.mm.plugin.report.service.g.ork.i(14098, new Object[] { Integer.valueOf(8) });
                    GMTrace.o(8566178054144L, 63823);
                  }
                });
                paramView.setTag(localObject2);
                i.b(((b)localObject2).qer, this.eNu);
                if (this.pNV.get(Integer.valueOf(paramInt)) == null) {
                  break label5832;
                }
              }
              for (i = ((Integer)this.pNV.get(Integer.valueOf(paramInt))).intValue();; i = -1)
              {
                ((b)localObject2).init();
                if ((i >= this.pNY) || (i == -1))
                {
                  paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
                  paramView.setVisibility(8);
                  GMTrace.o(8351563907072L, 62224);
                  return paramView;
                  localObject2 = (b)paramView.getTag();
                  break label4326;
                }
                paramView.setVisibility(0);
                if (i - 1 >= 0)
                {
                  paramViewGroup = (com.tencent.mm.plugin.sns.storage.m)getItem(i - 1);
                  j = paramViewGroup.field_head;
                  ai.F(paramViewGroup.field_localPrivate, this.eHl);
                }
                for (;;)
                {
                  paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                  paramView.setVisibility(0);
                  if (this.pNW.get(Integer.valueOf(paramInt)) != null) {
                    ((Integer)this.pNW.get(Integer.valueOf(paramInt))).intValue();
                  }
                  localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
                  localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD();
                  if (((this.eHl) && (paramInt == 0)) || (j == -1) || (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head != j))
                  {
                    l = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
                    a(((b)localObject2).qek, ((b)localObject2).qel, l);
                    if (((biz)localObject3).uUa != null)
                    {
                      paramViewGroup = ((biz)localObject3).uUa.gCz;
                      if ((paramViewGroup != null) && (!paramViewGroup.equals("")))
                      {
                        ((b)localObject2).qeo.setText(paramViewGroup);
                        ((b)localObject2).qeo.setVisibility(0);
                      }
                    }
                    ((b)localObject2).pOn.setVisibility(0);
                  }
                  if ((this.qee != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId == this.qee))
                  {
                    ((b)localObject2).qep.setVisibility(0);
                    paramViewGroup = new at.f.a();
                    paramViewGroup.ppo = ((com.tencent.mm.plugin.sns.storage.m)localObject1).pMe;
                    if (this.qdW.get(Integer.valueOf(paramInt)) == null) {
                      break label4990;
                    }
                    paramViewGroup.position = ((Integer)this.qdW.get(Integer.valueOf(paramInt))).intValue();
                    ((b)localObject2).qej.setTag(paramViewGroup);
                    if (bg.nm(((biz)localObject3).uTZ)) {
                      break label4998;
                    }
                    ((b)localObject2).mrx.setVisibility(0);
                    ((b)localObject2).mrx.setText(((biz)localObject3).uTZ);
                    ((b)localObject2).mrx.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.eNu, ((biz)localObject3).uTZ, ((b)localObject2).mrx.getTextSize()));
                  }
                  an localan;
                  for (;;)
                  {
                    ((b)localObject2).qem.setVisibility(0);
                    ((b)localObject2).mrx.setSingleLine(true);
                    ((b)localObject2).qet.setVisibility(0);
                    paramInt = ((biz)localObject3).uUc.ueV;
                    localan = new an(this.qdV.tag);
                    localan.time = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
                    if (paramInt != 2) {
                      break label5011;
                    }
                    ((b)localObject2).mrx.setVisibility(0);
                    ((b)localObject2).mrx.setSingleLine(false);
                    ((b)localObject2).mrx.setMaxLines(2);
                    ((b)localObject2).qet.setVisibility(8);
                    break;
                    if ((this.qee == 0L) && (this.qed != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId <= this.qed))
                    {
                      ((b)localObject2).qep.setVisibility(0);
                      this.qee = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId;
                      break label4679;
                    }
                    ((b)localObject2).qep.setVisibility(8);
                    break label4679;
                    paramViewGroup.position = 0;
                    break label4735;
                    ((b)localObject2).mrx.setVisibility(8);
                  }
                  anu localanu;
                  if (paramInt == 4)
                  {
                    if (!((biz)localObject3).uUc.ueW.isEmpty())
                    {
                      ((b)localObject2).qer.setVisibility(0);
                      ((b)localObject2).pOP.setVisibility(0);
                      ((b)localObject2).qet.setVisibility(0);
                      ((b)localObject2).hqi.setMaxLines(1);
                      ((b)localObject2).hqi.setTextColor(this.eNu.getResources().getColor(i.c.aPa));
                      localanu = (anu)((biz)localObject3).uUc.ueW.get(0);
                      ae.bja().a(localanu, ((b)localObject2).qer, i.i.cJd, this.eNu.hashCode(), g.a.prL, localan);
                      ((b)localObject2).pOP.setPressed(false);
                      if (Ji(((biz)localObject3).mmR))
                      {
                        ((b)localObject2).pOP.setImageResource(i.e.aYe);
                        ((b)localObject2).qer.setTag(localObject3);
                        ((b)localObject2).qer.setOnClickListener(this.qeg);
                        localanu.ppo = ((com.tencent.mm.plugin.sns.storage.m)localObject1).pMe;
                        ((b)localObject2).qet.setTag(localObject3);
                        localObject1 = localanu.lPj;
                        if (bg.nm((String)localObject1)) {
                          break label5314;
                        }
                        ((b)localObject2).qes.setVisibility(0);
                        ((b)localObject2).qes.setText((CharSequence)localObject1);
                      }
                      for (;;)
                      {
                        localObject1 = localanu.eBt;
                        if (bg.nm((String)localObject1)) {
                          break label5326;
                        }
                        ((b)localObject2).hqi.setVisibility(0);
                        ((b)localObject2).hqi.setTag(paramViewGroup);
                        ((b)localObject2).hqi.setOnTouchListener(new ab());
                        ((b)localObject2).hqi.setText((CharSequence)localObject1);
                        break;
                        ((b)localObject2).pOP.setImageResource(i.e.aYf);
                        break label5163;
                        ((b)localObject2).qes.setVisibility(4);
                      }
                      ((b)localObject2).hqi.setVisibility(8);
                      break;
                    }
                    ((b)localObject2).qet.setVisibility(8);
                    break;
                  }
                  ((b)localObject2).hqi.setTextColor(this.eNu.getResources().getColor(i.c.oXa));
                  if ((al.a.bjD() & 0x1) <= 0)
                  {
                    paramInt = 1;
                    if (paramInt == 0) {
                      break label5689;
                    }
                    paramViewGroup = av.Jp(((biz)localObject3).uUc.lPM);
                    localObject1 = ((biz)localObject3).uUc.eBt;
                    if ((localObject1 == null) || (((String)localObject1).length() <= 40)) {
                      break label5823;
                    }
                    localObject1 = ((String)localObject1).substring(0, 40) + "...";
                  }
                  for (;;)
                  {
                    if (((b)localObject2).qer != null) {
                      ((b)localObject2).qer.setOnClickListener(null);
                    }
                    ((b)localObject2).pOP.setVisibility(8);
                    if (!((biz)localObject3).uUc.ueW.isEmpty())
                    {
                      ((b)localObject2).qer.setVisibility(0);
                      localanu = (anu)((biz)localObject3).uUc.ueW.get(0);
                      if (((biz)localObject3).uUc.ueV == 5)
                      {
                        paramViewGroup = av.Jp(localanu.lPM);
                        localObject1 = localanu.eBt;
                        ((b)localObject2).pOP.setVisibility(0);
                        ae.bja().a(localanu, ((b)localObject2).qer, i.i.cJo, this.eNu.hashCode(), g.a.prL, localan);
                        if (bg.nm(paramViewGroup)) {
                          break label5772;
                        }
                        ((b)localObject2).qes.setVisibility(0);
                        ((b)localObject2).qes.setText(paramViewGroup);
                        if (bg.nm((String)localObject1)) {
                          break label5810;
                        }
                        if (((b)localObject2).qes.getVisibility() != 8) {
                          break label5785;
                        }
                        ((b)localObject2).hqi.setMaxLines(2);
                      }
                    }
                    for (;;)
                    {
                      ((b)localObject2).hqi.setVisibility(0);
                      if ((((biz)localObject3).giA & 0x1) <= 0) {
                        break label5797;
                      }
                      ((b)localObject2).hqi.setText(i.a((String)localObject1, this.eNu, ((b)localObject2).hqi));
                      break;
                      paramInt = 0;
                      break label5383;
                      paramViewGroup = "";
                      break label5399;
                      ae.bja().a(localanu, ((b)localObject2).qer, this.eNu.hashCode(), g.a.prL, localan);
                      break label5585;
                      if (((biz)localObject3).uUc.ueV != 26)
                      {
                        ((b)localObject2).qer.setVisibility(8);
                        break label5585;
                      }
                      ((b)localObject2).qer.setVisibility(0);
                      ((b)localObject2).qer.setImageResource(i.i.phj);
                      break label5585;
                      ((b)localObject2).qes.setVisibility(8);
                      break label5610;
                      ((b)localObject2).hqi.setMaxLines(1);
                    }
                    ((b)localObject2).hqi.setText((CharSequence)localObject1);
                    break;
                    ((b)localObject2).hqi.setVisibility(8);
                    break;
                  }
                  j = -1;
                }
              }
              j = -1;
            }
            j = -1;
          }
        }
      }
      label5862:
      j = -1;
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(8352100777984L, 62228);
    GMTrace.o(8352100777984L, 62228);
    return 4;
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(8352503431168L, 62231);
    super.notifyDataSetChanged();
    GMTrace.o(8352503431168L, 62231);
  }
  
  class a
  {
    LinearLayout pOm;
    View pOn;
    View qej;
    TextView qek;
    TextView qel;
    LinearLayout qem;
    ImageView qen;
    TextView qeo;
    LinearLayout qep;
    TextView qeq;
    
    a()
    {
      GMTrace.i(8583626358784L, 63953);
      GMTrace.o(8583626358784L, 63953);
    }
    
    public void init()
    {
      GMTrace.i(8583760576512L, 63954);
      this.qek.setVisibility(8);
      this.qel.setVisibility(8);
      this.qem.setVisibility(4);
      this.qen.setVisibility(4);
      this.pOn.setVisibility(8);
      this.qeo.setVisibility(8);
      this.qep.setVisibility(8);
      GMTrace.o(8583760576512L, 63954);
    }
  }
  
  final class b
    extends at.a
  {
    TextView hqi;
    TextView mrx;
    ImageView pOP;
    TagImageView qer;
    TextView qes;
    View qet;
    
    b()
    {
      super();
      GMTrace.i(8738782052352L, 65109);
      GMTrace.o(8738782052352L, 65109);
    }
    
    public final void init()
    {
      GMTrace.i(8738916270080L, 65110);
      super.init();
      this.mrx.setVisibility(8);
      this.qer.setVisibility(8);
      this.pOP.setVisibility(8);
      this.hqi.setVisibility(8);
      this.qes.setVisibility(8);
      GMTrace.o(8738916270080L, 65110);
    }
  }
  
  public static abstract interface c {}
  
  final class d
    extends at.a
  {
    TextView pGE;
    TextView qeA;
    TextView qeB;
    View qeC;
    TextView qeD;
    TextView qeE;
    TextView qeF;
    TextView qeG;
    TextView qeH;
    TextView qeI;
    MaskLinearLayout qeJ;
    MaskImageView qeu;
    QFadeImageView qev;
    QFadeImageView qew;
    QFadeImageView qex;
    TextView qey;
    TextView qez;
    
    d()
    {
      super();
      GMTrace.i(8385118339072L, 62474);
      GMTrace.o(8385118339072L, 62474);
    }
    
    public final void init()
    {
      GMTrace.i(8385252556800L, 62475);
      super.init();
      this.qeu.setVisibility(8);
      this.qew.setVisibility(8);
      this.qex.setVisibility(8);
      this.pGE.setVisibility(8);
      this.qey.setVisibility(8);
      this.qez.setVisibility(8);
      this.qeA.setVisibility(8);
      this.qeB.setVisibility(8);
      this.qeC.setVisibility(8);
      this.qev.setVisibility(8);
      this.qeD.setVisibility(8);
      this.qeE.setVisibility(8);
      this.qeF.setVisibility(8);
      this.qeG.setVisibility(8);
      this.qeH.setVisibility(8);
      this.qeI.setVisibility(8);
      if (com.tencent.mm.ui.ab.dZ(at.a(at.this)) > 1.0F) {
        this.pGE.setMaxLines(2);
      }
      GMTrace.o(8385252556800L, 62475);
    }
  }
  
  final class e
    extends at.a
  {
    TextView pGE;
    View qeC;
    TextView qeD;
    MaskLinearLayout qeJ;
    MaskImageView qeu;
    
    e()
    {
      super();
      GMTrace.i(8424846786560L, 62770);
      GMTrace.o(8424846786560L, 62770);
    }
    
    public final void init()
    {
      GMTrace.i(8424981004288L, 62771);
      super.init();
      this.qeu.setVisibility(8);
      this.pGE.setVisibility(8);
      this.qeD.setVisibility(8);
      this.qeC.setVisibility(8);
      if (com.tencent.mm.ui.ab.dZ(at.a(at.this)) > 1.0F) {
        this.pGE.setMaxLines(2);
      }
      GMTrace.o(8424981004288L, 62771);
    }
  }
  
  static abstract class f
  {
    View.OnClickListener pOd;
    View.OnClickListener pOe;
    View.OnClickListener pOf;
    View.OnClickListener qeK;
    View.OnClickListener qeL;
    View.OnClickListener qeM;
    public a qeN;
    
    public f()
    {
      GMTrace.i(8550743015424L, 63708);
      this.qeN = new a();
      this.pOd = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8600672010240L, 64080);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8600672010240L, 64080);
            return;
          }
          at.f.this.qeN = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qeN.ppo;
          int j = at.f.this.qeN.position;
          at.f.this.dg(i, j);
          GMTrace.o(8600672010240L, 64080);
        }
      };
      this.pOe = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8425517875200L, 62775);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8425517875200L, 62775);
            return;
          }
          at.f.this.qeN = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qeN.ppo;
          int j = at.f.this.qeN.position;
          at.f.this.dg(i, j + 1);
          GMTrace.o(8425517875200L, 62775);
        }
      };
      this.pOf = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8759854235648L, 65266);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8759854235648L, 65266);
            return;
          }
          at.f.this.qeN = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qeN.ppo;
          int j = at.f.this.qeN.position;
          at.f.this.dg(i, j + 2);
          GMTrace.o(8759854235648L, 65266);
        }
      };
      this.qeK = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8710462111744L, 64898);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8710462111744L, 64898);
            return;
          }
          w.d("MicroMsg.SnsphotoAdapter", "sign click");
          at.f.this.qeN = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qeN.ppo;
          int j = at.f.this.qeN.position;
          at.f.this.dh(i, j + 2);
          GMTrace.o(8710462111744L, 64898);
        }
      };
      this.qeL = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8502424633344L, 63348);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8502424633344L, 63348);
            return;
          }
          w.d("MicroMsg.SnsphotoAdapter", "sign click");
          at.f.this.qeN = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qeN.ppo;
          at.f.this.vu(i);
          GMTrace.o(8502424633344L, 63348);
        }
      };
      this.qeM = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8504572116992L, 63364);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8504572116992L, 63364);
            return;
          }
          w.d("MicroMsg.SnsphotoAdapter", "snssight click");
          at.f.this.qeN = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qeN.ppo;
          int j = at.f.this.qeN.position;
          at.f.this.dh(i, j + 2);
          GMTrace.o(8504572116992L, 63364);
        }
      };
      GMTrace.o(8550743015424L, 63708);
    }
    
    public abstract void dg(int paramInt1, int paramInt2);
    
    public abstract void dh(int paramInt1, int paramInt2);
    
    public abstract void vu(int paramInt);
    
    public static final class a
    {
      public int position;
      public int ppo;
      
      public a()
      {
        GMTrace.i(8701737959424L, 64833);
        GMTrace.o(8701737959424L, 64833);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */