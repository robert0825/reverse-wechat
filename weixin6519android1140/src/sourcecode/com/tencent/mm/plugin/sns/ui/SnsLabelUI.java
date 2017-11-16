package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.u;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.AnimatedExpandableListView;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SnsLabelUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  public static int[] qbM;
  private AnimatedExpandableListView qbL;
  private ArrayList<String> qbN;
  private String qbO;
  private String qbP;
  aq qbQ;
  private int qbR;
  private boolean qbS;
  private boolean qbT;
  private boolean qbU;
  private boolean qbV;
  private int qbW;
  private r qbX;
  private String qbY;
  private int qbZ;
  private ArrayList<String> qca;
  private ArrayList<String> qcb;
  private ArrayList<Long> qcc;
  private ArrayList<String[]> qcd;
  
  static
  {
    GMTrace.i(8489673949184L, 63253);
    qbM = new int[] { i.j.pjN, i.j.pjL, i.j.pjH, i.j.pjA };
    GMTrace.o(8489673949184L, 63253);
  }
  
  public SnsLabelUI()
  {
    GMTrace.i(8484976328704L, 63218);
    this.qbR = 0;
    this.qbT = false;
    this.qbU = false;
    this.qbV = false;
    GMTrace.o(8484976328704L, 63218);
  }
  
  private void bG(List<String[]> paramList)
  {
    GMTrace.i(8486855376896L, 63232);
    if ((this.qcb == null) || (this.qcb.size() == 0))
    {
      GMTrace.o(8486855376896L, 63232);
      return;
    }
    Iterator localIterator = this.qcb.iterator();
    paramList = paramList.iterator();
    ArrayList localArrayList1 = new ArrayList(this.qcb.size());
    ArrayList localArrayList2 = new ArrayList(this.qcb.size());
    while (localIterator.hasNext())
    {
      localArrayList1.add(a.aJP().AV((String)localIterator.next()));
      localArrayList2.add(bg.c(Arrays.asList((Object[])paramList.next()), ","));
      this.qbU = true;
    }
    a.aJP().h(localArrayList1, localArrayList2);
    GMTrace.o(8486855376896L, 63232);
  }
  
  private void bpf()
  {
    GMTrace.i(8485915852800L, 63225);
    Intent localIntent = new Intent();
    localIntent.putExtra("Ktag_range_index", this.qbR);
    if ((this.qbR == 2) || (this.qbR == 3))
    {
      localIntent.putExtra("Klabel_name_list", this.qbO);
      localIntent.putExtra("Kother_user_name_list", this.qbP);
    }
    setResult(-1, localIntent);
    finish();
    GMTrace.o(8485915852800L, 63225);
  }
  
  private static int bph()
  {
    GMTrace.i(8486586941440L, 63230);
    com.tencent.mm.kernel.h.xz();
    int i = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(335874, Integer.valueOf(0))).intValue();
    GMTrace.o(8486586941440L, 63230);
    return i;
  }
  
  private void bpi()
  {
    GMTrace.i(8486721159168L, 63231);
    g.ork.i(11455, new Object[] { "", "", Integer.valueOf(this.qbZ), Integer.valueOf(0) });
    com.tencent.mm.kernel.h.xz();
    int i = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(335874, Integer.valueOf(0))).intValue();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().set(335874, Integer.valueOf(i + 1));
    this.qcb = null;
    this.qbV = false;
    this.qbU = false;
    if ((this.qbX != null) && (this.qbX.isShowing())) {
      this.qbX.dismiss();
    }
    if (this.qbT)
    {
      this.qbT = false;
      GMTrace.o(8486721159168L, 63231);
      return;
    }
    i = i.j.pjQ;
    if (bph() > 1) {
      i = i.j.pjP;
    }
    com.tencent.mm.ui.base.h.a(this, i, i.j.cTM, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(8634360659968L, 64331);
        GMTrace.o(8634360659968L, 64331);
      }
    });
    GMTrace.o(8486721159168L, 63231);
  }
  
  private void goBack()
  {
    GMTrace.i(8485781635072L, 63224);
    int j = 0;
    int k = this.qbQ.qck;
    int i;
    if (this.qbQ.qck != this.qbR) {
      if (((k == 2) && ((this.qbQ.qcm.size() != 0) || (this.qbQ.qco.size() != 0))) || ((k == 3) && ((this.qbQ.qcn.size() != 0) || (this.qbQ.qcp.size() != 0)))) {
        i = 1;
      }
    }
    while (i != 0)
    {
      com.tencent.mm.ui.base.h.a(this, true, getString(i.j.pjG), "", getString(i.j.pjF), getString(i.j.pjE), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8513564704768L, 63431);
          SnsLabelUI.l(SnsLabelUI.this);
          GMTrace.o(8513564704768L, 63431);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8643755900928L, 64401);
          SnsLabelUI.m(SnsLabelUI.this);
          GMTrace.o(8643755900928L, 64401);
        }
      });
      GMTrace.o(8485781635072L, 63224);
      return;
      if (k != 1)
      {
        i = j;
        if (k != 0) {}
      }
      else
      {
        i = 1;
        continue;
        if ((k != 2) || (this.qbQ.qcm.size() == 0) || ((bg.c(this.qbQ.qcm, ",").equals(this.qbO)) && (bg.c(this.qbQ.qco, ",").equals(this.qbP))))
        {
          i = j;
          if (k != 3) {
            continue;
          }
          i = j;
          if (this.qbQ.qcn.size() == 0) {
            continue;
          }
          if (bg.c(this.qbQ.qcn, ",").equals(this.qbO))
          {
            i = j;
            if (bg.c(this.qbQ.qcp, ",").equals(this.qbP)) {
              continue;
            }
          }
        }
        i = 1;
      }
    }
    bpf();
    GMTrace.o(8485781635072L, 63224);
  }
  
  protected final void MP()
  {
    GMTrace.i(8485513199616L, 63222);
    boolean bool = getIntent().getBooleanExtra("Ktag_rangeFilterprivate", false);
    this.qbL = ((AnimatedExpandableListView)findViewById(i.f.pdb));
    this.qbN = ((ArrayList)a.aJP().aJK());
    this.qbQ.qcl = bool;
    this.qbQ.S(this.qbN);
    AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, -2);
    localLayoutParams.height = getResources().getDimensionPixelSize(i.d.aQr);
    View localView = new View(this);
    localView.setLayoutParams(localLayoutParams);
    this.qbL.addHeaderView(localView);
    this.qbL.setAdapter(this.qbQ);
    if (this.qbQ.qck == 2) {
      this.qbL.expandGroup(2);
    }
    for (;;)
    {
      this.qbL.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener()
      {
        public final boolean onGroupClick(ExpandableListView paramAnonymousExpandableListView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(8442160873472L, 62899);
          int i = SnsLabelUI.a(SnsLabelUI.this).qck;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[previousGroup: %d    onGroupClick:%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousInt) });
          if (paramAnonymousInt > 1)
          {
            if ((SnsLabelUI.b(SnsLabelUI.this) != null) && (SnsLabelUI.b(SnsLabelUI.this).size() != 0) && (SnsLabelUI.bpj() == 0))
            {
              SnsLabelUI.a(SnsLabelUI.this, paramAnonymousInt);
              SnsLabelUI.c(SnsLabelUI.this);
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[previousGroup: need transform]");
              GMTrace.o(8442160873472L, 62899);
              return true;
            }
            if (SnsLabelUI.d(SnsLabelUI.this))
            {
              SnsLabelUI.e(SnsLabelUI.this);
              SnsLabelUI.a(SnsLabelUI.this, paramAnonymousInt);
              SnsLabelUI.a(SnsLabelUI.this, com.tencent.mm.ui.base.h.a(SnsLabelUI.this, SnsLabelUI.this.getString(i.j.pjJ), false, null));
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[previousGroup: isGettingTagInfo]");
              GMTrace.o(8442160873472L, 62899);
              return true;
            }
            if ((SnsLabelUI.a(SnsLabelUI.this).qcj == null) || (SnsLabelUI.a(SnsLabelUI.this).qcj.size() == 0))
            {
              SnsLabelUI.a(SnsLabelUI.this, paramAnonymousInt);
              SnsLabelUI.f(SnsLabelUI.this);
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[previousGroup: gotoSelectContact]");
              GMTrace.o(8442160873472L, 62899);
              return true;
            }
            if (i == paramAnonymousInt)
            {
              if (SnsLabelUI.g(SnsLabelUI.this).isGroupExpanded(paramAnonymousInt)) {
                SnsLabelUI.g(SnsLabelUI.this).BA(paramAnonymousInt);
              }
              for (;;)
              {
                SnsLabelUI.a(SnsLabelUI.this).qck = paramAnonymousInt;
                GMTrace.o(8442160873472L, 62899);
                return true;
                SnsLabelUI.g(SnsLabelUI.this).Bz(paramAnonymousInt);
              }
            }
            if (i == 2)
            {
              SnsLabelUI.g(SnsLabelUI.this).collapseGroup(2);
              SnsLabelUI.a(SnsLabelUI.this).qcm.clear();
              SnsLabelUI.a(SnsLabelUI.this).qco.clear();
            }
            for (;;)
            {
              SnsLabelUI.g(SnsLabelUI.this).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(8328075804672L, 62049);
                  SnsLabelUI.g(SnsLabelUI.this).Bz(paramAnonymousInt);
                  GMTrace.o(8328075804672L, 62049);
                }
              });
              break;
              if (i == 3)
              {
                SnsLabelUI.g(SnsLabelUI.this).collapseGroup(3);
                SnsLabelUI.a(SnsLabelUI.this).qcn.clear();
                SnsLabelUI.a(SnsLabelUI.this).qcp.clear();
              }
            }
          }
          if (i > 1) {
            SnsLabelUI.g(SnsLabelUI.this).BA(i);
          }
          SnsLabelUI.a(SnsLabelUI.this).qck = paramAnonymousInt;
          GMTrace.o(8442160873472L, 62899);
          return false;
        }
      });
      this.qbL.setOnChildClickListener(new ExpandableListView.OnChildClickListener()
      {
        public final boolean onChildClick(ExpandableListView paramAnonymousExpandableListView, View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong)
        {
          GMTrace.i(8767370428416L, 65322);
          if (paramAnonymousInt2 == SnsLabelUI.a(SnsLabelUI.this).getChildrenCount(paramAnonymousInt1) - 1)
          {
            SnsLabelUI.a(SnsLabelUI.this, paramAnonymousInt1);
            SnsLabelUI.f(SnsLabelUI.this);
          }
          for (;;)
          {
            GMTrace.o(8767370428416L, 65322);
            return false;
            paramAnonymousExpandableListView = (String)SnsLabelUI.a(SnsLabelUI.this).getChild(paramAnonymousInt1, paramAnonymousInt2);
            SnsLabelUI.a(SnsLabelUI.this);
            aq.Je(paramAnonymousExpandableListView);
            if (paramAnonymousInt1 == 2) {
              SnsLabelUI.a(SnsLabelUI.this, 1, SnsLabelUI.a(SnsLabelUI.this).qcm, paramAnonymousExpandableListView, paramAnonymousView);
            } else if (paramAnonymousInt1 == 3) {
              SnsLabelUI.a(SnsLabelUI.this, 2, SnsLabelUI.a(SnsLabelUI.this).qcn, paramAnonymousExpandableListView, paramAnonymousView);
            }
          }
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8493163610112L, 63279);
          SnsLabelUI.h(SnsLabelUI.this);
          GMTrace.o(8493163610112L, 63279);
          return true;
        }
      });
      a(0, getString(i.j.pjC), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8726299803648L, 65016);
          paramAnonymousMenuItem = SnsLabelUI.this;
          String str1 = bg.c(paramAnonymousMenuItem.qbQ.qcm, ",");
          String str2 = bg.c(paramAnonymousMenuItem.qbQ.qco, ",");
          String str3 = bg.c(paramAnonymousMenuItem.qbQ.qcn, ",");
          String str4 = bg.c(paramAnonymousMenuItem.qbQ.qcp, ",");
          if (((paramAnonymousMenuItem.qbQ.qck == 2) && (paramAnonymousMenuItem.qbQ.qcm.size() == 0) && (paramAnonymousMenuItem.qbQ.qco.size() == 0)) || ((paramAnonymousMenuItem.qbQ.qck == 3) && (paramAnonymousMenuItem.qbQ.qcn.size() == 0) && (paramAnonymousMenuItem.qbQ.qcp.size() == 0))) {
            com.tencent.mm.ui.base.h.a(paramAnonymousMenuItem, paramAnonymousMenuItem.getString(i.j.pjK), "", paramAnonymousMenuItem.getString(i.j.pjR), null);
          }
          for (;;)
          {
            GMTrace.o(8726299803648L, 65016);
            return true;
            if (((paramAnonymousMenuItem.qbQ.qck == 2) && (bg.nm(str1)) && (bg.nm(str2))) || ((paramAnonymousMenuItem.qbQ.qck == 3) && (bg.nm(str3)) && (bg.nm(str4)))) {
              com.tencent.mm.ui.base.h.a(paramAnonymousMenuItem, paramAnonymousMenuItem.getString(i.j.pjK), "", paramAnonymousMenuItem.getString(i.j.pjR), null);
            } else {
              paramAnonymousMenuItem.bpg();
            }
          }
        }
      }, p.b.vLG);
      GMTrace.o(8485513199616L, 63222);
      return;
      if (this.qbQ.qck == 3) {
        this.qbL.expandGroup(3);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8486452723712L, 63229);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!this.qbU)
    {
      GMTrace.o(8486452723712L, 63229);
      return;
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(8486452723712L, 63229);
      return;
      Object localObject;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        localObject = ae.bjj().getCursor();
        this.qbZ = ((Cursor)localObject).getCount();
        if (this.qbZ > 0)
        {
          ((Cursor)localObject).moveToFirst();
          s locals = new s();
          paramInt1 = ((Cursor)localObject).getCount();
          this.qcb = new ArrayList(paramInt1);
          this.qca = new ArrayList(paramInt1);
          this.qcd = new ArrayList(paramInt1);
          this.qcc = new ArrayList(paramInt1);
          if (!((Cursor)localObject).isAfterLast())
          {
            locals.b((Cursor)localObject);
            if ((locals.field_memberList != null) && (locals.field_memberList.length() != 0))
            {
              this.qcd.add(locals.field_memberList.split(","));
              paramk = locals.field_tagName;
              ArrayList localArrayList = this.qcb;
              paramString = a.aJP().aJM();
              if (paramString == null)
              {
                paramString = paramk;
                label304:
                localArrayList.add(paramString);
                this.qca.add(paramk);
                this.qcc.add(Long.valueOf(locals.field_tagId));
              }
            }
            for (;;)
            {
              ((Cursor)localObject).moveToNext();
              break;
              if (!paramString.contains(paramk))
              {
                paramString = paramk;
                break label304;
              }
              paramString = String.format(getString(i.j.pjD), new Object[] { paramk });
              break label304;
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SnsLabelUI", "dz:snstaginfo memberlist is null.");
            }
          }
          ((Cursor)localObject).close();
          if (this.qca.size() != 0) {
            break label519;
          }
          paramInt1 = 0;
          if (paramInt1 != 0) {}
        }
        else if (this.qbV)
        {
          this.qbQ.qck = this.qbW;
          this.qbL.Bz(this.qbW);
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().set(335873, Boolean.valueOf(false));
        }
        ((Cursor)localObject).close();
        if (this.qbT)
        {
          this.qbU = true;
          a.aJP().aM(this.qcb);
        }
      }
      for (;;)
      {
        this.qbV = false;
        GMTrace.o(8486452723712L, 63229);
        return;
        label519:
        paramInt1 = 1;
        break;
        this.qbU = false;
        continue;
        bpi();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz: error at get sns tag list!");
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        bG(this.qcd);
        GMTrace.o(8486452723712L, 63229);
        return;
      }
      bpi();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz: error at add contact label!");
      GMTrace.o(8486452723712L, 63229);
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.qca.iterator();
        paramk = this.qcc.iterator();
        while (paramString.hasNext())
        {
          long l = ((Long)paramk.next()).longValue();
          localObject = (String)paramString.next();
          if (l != 0L)
          {
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.plugin.sns.model.w(l, (String)localObject), 0);
          }
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().set(335874, Integer.valueOf(0));
        this.qbN = ((ArrayList)a.aJP().aJK());
        g.ork.i(11455, new Object[] { "", "", Integer.valueOf(this.qbZ), Integer.valueOf(this.qcb.size()) });
        this.qbL.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8324317708288L, 62021);
            SnsLabelUI.a(SnsLabelUI.this).qck = SnsLabelUI.k(SnsLabelUI.this);
            if (SnsLabelUI.j(SnsLabelUI.this) == null) {
              SnsLabelUI.a(SnsLabelUI.this, SnsLabelUI.b(SnsLabelUI.this));
            }
            while (SnsLabelUI.b(SnsLabelUI.this) != null)
            {
              localObject = SnsLabelUI.b(SnsLabelUI.this).iterator();
              while (((Iterator)localObject).hasNext())
              {
                SnsLabelUI.a(SnsLabelUI.this);
                aq.Je((String)((Iterator)localObject).next());
              }
              SnsLabelUI.j(SnsLabelUI.this).addAll(SnsLabelUI.b(SnsLabelUI.this));
            }
            Object localObject = new HashSet(SnsLabelUI.j(SnsLabelUI.this));
            SnsLabelUI.j(SnsLabelUI.this).clear();
            SnsLabelUI.j(SnsLabelUI.this).addAll((Collection)localObject);
            SnsLabelUI.a(SnsLabelUI.this).S(SnsLabelUI.j(SnsLabelUI.this));
            SnsLabelUI.a(SnsLabelUI.this).notifyDataSetChanged();
            SnsLabelUI.g(SnsLabelUI.this).Bz(SnsLabelUI.a(SnsLabelUI.this).qck);
            if (SnsLabelUI.b(SnsLabelUI.this) != null) {
              SnsLabelUI.b(SnsLabelUI.this).clear();
            }
            SnsLabelUI.n(SnsLabelUI.this);
            ((HashSet)localObject).clear();
            if ((SnsLabelUI.o(SnsLabelUI.this) != null) && (SnsLabelUI.o(SnsLabelUI.this).isShowing())) {
              SnsLabelUI.o(SnsLabelUI.this).dismiss();
            }
            GMTrace.o(8324317708288L, 62021);
          }
        }, 600L);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().set(335873, Boolean.valueOf(false));
        GMTrace.o(8486452723712L, 63229);
        return;
      }
      bpi();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz: error at modify label list!");
      GMTrace.o(8486452723712L, 63229);
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz: error at delete tag list!");
      }
    }
  }
  
  final void bpg()
  {
    GMTrace.i(8486050070528L, 63226);
    Intent localIntent = new Intent();
    if (this.qbQ.qck == 2)
    {
      this.qbO = bg.c(this.qbQ.qcm, ",");
      this.qbP = bg.c(this.qbQ.qco, ",");
      localIntent.putExtra("Klabel_name_list", this.qbO);
      localIntent.putExtra("Kother_user_name_list", this.qbP);
    }
    for (;;)
    {
      localIntent.putExtra("Ktag_range_index", this.qbQ.qck);
      setResult(-1, localIntent);
      finish();
      GMTrace.o(8486050070528L, 63226);
      return;
      if (this.qbQ.qck == 3)
      {
        this.qbO = bg.c(this.qbQ.qcn, ",");
        this.qbP = bg.c(this.qbQ.qcp, ",");
        localIntent.putExtra("Klabel_name_list", this.qbO);
        localIntent.putExtra("Kother_user_name_list", this.qbP);
      }
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8485244764160L, 63220);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      goBack();
      GMTrace.o(8485244764160L, 63220);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8485244764160L, 63220);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8485110546432L, 63219);
    int i = i.g.pfM;
    GMTrace.o(8485110546432L, 63219);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8485647417344L, 63223);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    final Object localObject;
    if ((paramInt2 == -1) && (paramInt1 == 4003))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "the Activity completed");
      localObject = paramIntent.getStringExtra("Select_Contacts_To_Create_New_Label");
      if (!bg.nm((String)localObject))
      {
        paramIntent = new Intent();
        paramIntent.putExtra("Select_Contact", (String)localObject);
        d.b(this.vKB.vKW, "label", ".ui.ContactLabelEditUI", paramIntent, 4002);
        GMTrace.o(8485647417344L, 63223);
        return;
      }
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      this.qbP = new String(paramIntent);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", new Object[] { paramIntent });
      if (this.qbW == 2)
      {
        this.qbQ.qco.clear();
        if (!bg.nm(paramIntent))
        {
          paramIntent = bg.g(paramIntent.split(","));
          this.qbQ.qco.addAll(paramIntent);
          this.qbQ.qck = this.qbW;
        }
      }
      for (;;)
      {
        this.qbQ.notifyDataSetChanged();
        this.qbL.expandGroup(this.qbW);
        GMTrace.o(8485647417344L, 63223);
        return;
        if (this.qbW == 3)
        {
          this.qbQ.qcp.clear();
          if (!bg.nm(paramIntent))
          {
            paramIntent = bg.g(paramIntent.split(","));
            this.qbQ.qcp.addAll(paramIntent);
            this.qbQ.qck = this.qbW;
          }
        }
      }
    }
    if ((paramInt2 == -1) && (paramInt1 == 4001))
    {
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", new Object[] { paramIntent });
      if (!bg.nm(paramIntent))
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("Select_Contact", paramIntent);
        d.b(this, "label", ".ui.ContactLabelEditUI", (Intent)localObject, 4002);
      }
      GMTrace.o(8485647417344L, 63223);
      return;
    }
    if ((paramInt2 == 0) && (paramInt1 == 4002) && (paramIntent != null))
    {
      localObject = paramIntent.getStringExtra("k_sns_label_add_label");
      this.qbY = paramIntent.getStringExtra("k_sns_label_add_label");
      this.qbL.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8495579529216L, 63297);
          SnsLabelUI.a(SnsLabelUI.this, (ArrayList)a.aJP().aJK());
          if (SnsLabelUI.j(SnsLabelUI.this) == null) {
            SnsLabelUI.a(SnsLabelUI.this, new ArrayList());
          }
          if (!bg.nm(localObject)) {
            if (!SnsLabelUI.j(SnsLabelUI.this).contains(localObject)) {
              SnsLabelUI.j(SnsLabelUI.this).add(localObject);
            }
          }
          for (int i = SnsLabelUI.j(SnsLabelUI.this).indexOf(localObject);; i = -1)
          {
            SnsLabelUI.a(SnsLabelUI.this).S(SnsLabelUI.j(SnsLabelUI.this));
            SnsLabelUI.a(SnsLabelUI.this).qck = SnsLabelUI.k(SnsLabelUI.this);
            if ((!bg.nm(localObject)) && (i != -1))
            {
              if (SnsLabelUI.k(SnsLabelUI.this) != 2) {
                break label237;
              }
              SnsLabelUI.a(SnsLabelUI.this).qcm.add(localObject);
              SnsLabelUI.a(SnsLabelUI.this).qco.clear();
            }
            for (;;)
            {
              SnsLabelUI.a(SnsLabelUI.this).notifyDataSetChanged();
              SnsLabelUI.g(SnsLabelUI.this).expandGroup(SnsLabelUI.k(SnsLabelUI.this));
              GMTrace.o(8495579529216L, 63297);
              return;
              label237:
              if (SnsLabelUI.k(SnsLabelUI.this) == 3)
              {
                SnsLabelUI.a(SnsLabelUI.this).qcn.add(localObject);
                SnsLabelUI.a(SnsLabelUI.this).qcp.clear();
              }
            }
          }
        }
      }, 300L);
    }
    GMTrace.o(8485647417344L, 63223);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8485378981888L, 63221);
    super.onCreate(paramBundle);
    oM(i.j.pkQ);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(292, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(635, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(638, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(290, this);
    this.qbQ = new aq(this);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      this.qbR = 0;
      this.qbQ.style = 0;
      this.qbO = null;
      this.qbP = null;
      this.qbQ.qck = this.qbR;
      if (this.qbQ.style == 1) {
        findViewById(i.f.pdc).setBackgroundResource(i.c.black);
      }
      if (this.qbR != 2) {
        break label411;
      }
      if (!TextUtils.isEmpty(this.qbO)) {
        this.qbQ.qcm = ((ArrayList)bg.g(this.qbO.split(",")));
      }
      if (!TextUtils.isEmpty(this.qbP)) {
        this.qbQ.qco = ((ArrayList)bg.g(this.qbP.split(",")));
      }
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xz();
      this.qbS = ((Boolean)com.tencent.mm.kernel.h.xy().xh().get(335873, Boolean.valueOf(true))).booleanValue();
      if (this.qbS)
      {
        this.qbU = true;
        this.qbV = true;
        if (bph() > 0) {
          this.qbT = true;
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new u(1), 0);
      }
      MP();
      GMTrace.o(8485378981888L, 63221);
      return;
      this.qbR = paramBundle.getIntExtra("KLabel_range_index", 0);
      this.qbQ.style = paramBundle.getIntExtra("k_sns_label_ui_style", 0);
      this.qbO = paramBundle.getStringExtra("Klabel_name_list");
      this.qbP = paramBundle.getStringExtra("Kother_user_name_list");
      if (TextUtils.isEmpty(paramBundle.getStringExtra("k_sns_label_ui_title"))) {
        break;
      }
      sq(paramBundle.getStringExtra("k_sns_label_ui_title"));
      break;
      label411:
      if (this.qbR == 3)
      {
        if (!TextUtils.isEmpty(this.qbO)) {
          this.qbQ.qcn = ((ArrayList)bg.g(this.qbO.split(",")));
        }
        if (!TextUtils.isEmpty(this.qbP)) {
          this.qbQ.qcp = ((ArrayList)bg.g(this.qbP.split(",")));
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8486184288256L, 63227);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(292, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(635, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(638, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(290, this);
    super.onDestroy();
    GMTrace.o(8486184288256L, 63227);
  }
  
  public void onResume()
  {
    GMTrace.i(8486318505984L, 63228);
    if ((this.qbQ != null) && (this.qbY == null))
    {
      this.qbN = ((ArrayList)a.aJP().aJK());
      this.qbQ.S(this.qbN);
      if (((this.qbN == null) || (this.qbN.size() == 0)) && ((this.qbP == null) || (this.qbP.length() == 0)) && (this.qbQ.qck != 0) && (this.qbQ.qck != 1)) {
        this.qbQ.qck = 0;
      }
      this.qbQ.notifyDataSetChanged();
    }
    this.qbY = null;
    super.onResume();
    GMTrace.o(8486318505984L, 63228);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsLabelUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */