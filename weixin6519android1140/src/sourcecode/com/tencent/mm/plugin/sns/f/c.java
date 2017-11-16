package com.tencent.mm.plugin.sns.f;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.kj;
import com.tencent.mm.g.a.kk;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.q;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.plugin.sns.ui.ab;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.pluginsdk.ui.d.m.a;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfp;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.u;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
  implements com.tencent.mm.ad.e, com.tencent.mm.plugin.sns.model.e
{
  public static final Pattern pyp;
  public static final Pattern pyq;
  private com.tencent.mm.plugin.sns.g.c psG;
  public final int pxD;
  public final int pyh;
  private List<d> pyi;
  public ListView pyj;
  public av pyk;
  public Map<Long, Integer> pyl;
  public HashSet<Long> pym;
  public HashSet<Long> pyn;
  private HashMap<Long, a> pyo;
  private m.a pyr;
  
  static
  {
    GMTrace.i(8776631451648L, 65391);
    pyp = Pattern.compile("\\{richtext:([\\s\\S]*?)\\}");
    pyq = Pattern.compile("\\{sex:([\\s\\S]*?):([\\s\\S]*?):([\\s\\S]*?)\\}");
    GMTrace.o(8776631451648L, 65391);
  }
  
  public c()
  {
    GMTrace.i(8774081314816L, 65372);
    this.pxD = 14;
    this.pyh = 500;
    this.pyl = new HashMap();
    this.pym = new HashSet();
    this.pyn = new HashSet();
    this.pyo = new HashMap();
    this.pyr = new m.a()
    {
      public final void bq(Object paramAnonymousObject)
      {
        GMTrace.i(8773947097088L, 65371);
        GMTrace.o(8773947097088L, 65371);
      }
    };
    GMTrace.o(8774081314816L, 65372);
  }
  
  private SpannableString a(final Context paramContext, TextView paramTextView, String paramString, final bfh parambfh, final a.c paramc, final d.a parama, final d.b paramb, final d paramd)
  {
    GMTrace.i(8775826145280L, 65385);
    Object localObject = pyp.matcher(paramString);
    if ((((Matcher)localObject).find()) && (((Matcher)localObject).groupCount() == 1))
    {
      String str = ((Matcher)localObject).group();
      localObject = ((Matcher)localObject).group(1);
      int i = paramString.indexOf(str);
      paramString = paramString.replace(str, (CharSequence)localObject);
      paramTextView.setOnClickListener(null);
      paramTextView.setClickable(true);
      paramString = new SpannableString(paramString);
      paramTextView.setOnTouchListener(new ab());
      paramString.setSpan(new com.tencent.mm.pluginsdk.ui.d.m(parambfh.tRz, new m.a()
      {
        public final void bq(Object paramAnonymousObject)
        {
          GMTrace.i(8773544443904L, 65368);
          c.this.a(paramContext, parambfh, parama, paramb, paramc, paramd);
          GMTrace.o(8773544443904L, 65368);
        }
      }), i, ((String)localObject).length() + i, 33);
      GMTrace.o(8775826145280L, 65385);
      return paramString;
    }
    paramContext = com.tencent.mm.pluginsdk.ui.d.h.a(paramContext, paramString);
    GMTrace.o(8775826145280L, 65385);
    return paramContext;
  }
  
  private static String a(String paramString, bfh parambfh)
  {
    GMTrace.i(8775691927552L, 65384);
    Object localObject = paramString;
    try
    {
      if (bg.nm(paramString))
      {
        GMTrace.o(8775691927552L, 65384);
        return "";
      }
      localObject = paramString;
      parambfh = parambfh.tRz;
      localObject = paramString;
      com.tencent.mm.kernel.h.xz();
      localObject = paramString;
      x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(parambfh);
      parambfh = paramString;
      localObject = paramString;
      if (paramString.contains("{username}"))
      {
        localObject = paramString;
        parambfh = paramString.replace("{username}", localx.vk());
      }
      localObject = parambfh;
      int i = localx.fja;
      if (i == 1)
      {
        i = 0;
        paramString = parambfh;
      }
      w.printErrStackTrace("MicroMsg.SnSABTestMgr", parambfh, "settext error ", new Object[0]);
    }
    catch (Exception paramString)
    {
      try
      {
        parambfh = pyq.matcher(paramString);
        if ((parambfh.find()) && (parambfh.groupCount() == 3))
        {
          localObject = parambfh.group();
          if (i == 0) {
            parambfh = parambfh.group(1);
          }
          for (;;)
          {
            parambfh = paramString.replace((CharSequence)localObject, parambfh);
            paramString = parambfh;
            break;
            localObject = parambfh;
            i = localx.fja;
            if (i == 2)
            {
              i = 1;
              paramString = parambfh;
              break;
            }
            i = 2;
            paramString = parambfh;
            break;
            if (i == 1) {
              parambfh = parambfh.group(2);
            } else {
              parambfh = parambfh.group(3);
            }
          }
        }
        GMTrace.o(8775691927552L, 65384);
        return paramString;
      }
      catch (Exception parambfh)
      {
        for (;;) {}
      }
      paramString = paramString;
      parambfh = paramString;
      paramString = (String)localObject;
    }
    GMTrace.o(8775691927552L, 65384);
    return paramString;
  }
  
  private static void a(a parama)
  {
    GMTrace.i(8776228798464L, 65388);
    Object localObject = parama.pyB;
    if (localObject == null)
    {
      GMTrace.o(8776228798464L, 65388);
      return;
    }
    String str2 = ((d)localObject).pyg;
    String str3 = ((d)localObject).pyf;
    String str4 = parama.pyG;
    parama.o(parama.pyC, parama.pyD, 0, 0);
    String str1 = parama.pyF;
    localObject = str1;
    if (bg.nm(str1)) {
      localObject = parama.pyC + ":" + parama.pyD + ":0:0";
    }
    long l1 = parama.mStartTime / 1000L;
    if (parama.mEndTime == -1L) {
      parama.mEndTime = System.currentTimeMillis();
    }
    long l2 = parama.mEndTime / 1000L;
    if (parama != null)
    {
      w.i("MicroMsg.SnSABTestMgr", "report layerId: " + str2 + " expid " + str3 + " acton " + (String)localObject + " starttime " + l1 + " timelineId: " + str4);
      g.ork.i(11917, new Object[] { str2, str3, "", "", Integer.valueOf(1), str4, localObject, Long.valueOf(l1), Long.valueOf(l2) });
    }
    GMTrace.o(8776228798464L, 65388);
  }
  
  private void a(a.c paramc)
  {
    GMTrace.i(15698910773248L, 116966);
    if (paramc == null)
    {
      GMTrace.o(15698910773248L, 116966);
      return;
    }
    Context localContext = paramc.lFh.getContext();
    if (localContext == null)
    {
      GMTrace.o(15698910773248L, 116966);
      return;
    }
    if (paramc.lFh.getBackground() == null)
    {
      paramc.lFh.setBackgroundResource(i.e.aVO);
      paramc.lFh.setPadding(com.tencent.mm.br.a.fromDPToPix(localContext, 12), com.tencent.mm.br.a.fromDPToPix(localContext, 12), com.tencent.mm.br.a.fromDPToPix(localContext, 12), com.tencent.mm.br.a.fromDPToPix(localContext, 8));
    }
    int i = paramc.position;
    if (this.pyk != null)
    {
      paramc = (WeakReference)this.pyk.qgC.get(Integer.valueOf(i - 1));
      if ((paramc == null) || (paramc.get() == null))
      {
        GMTrace.o(15698910773248L, 116966);
        return;
      }
      ((View)paramc.get()).setBackgroundResource(i.e.aVO);
      ((View)paramc.get()).setPadding(com.tencent.mm.br.a.fromDPToPix(localContext, 12), com.tencent.mm.br.a.fromDPToPix(localContext, 12), com.tencent.mm.br.a.fromDPToPix(localContext, 12), com.tencent.mm.br.a.fromDPToPix(localContext, 8));
    }
    GMTrace.o(15698910773248L, 116966);
  }
  
  private boolean a(final Context paramContext, bfh parambfh, final a.c paramc, final d.b paramb, final d paramd)
  {
    GMTrace.i(15698776555520L, 116965);
    paramc.lFh.setBackgroundDrawable(null);
    int i = paramc.position;
    Object localObject1;
    if (this.pyk != null)
    {
      localObject1 = (WeakReference)this.pyk.qgC.get(Integer.valueOf(i - 1));
      if ((localObject1 != null) && (((WeakReference)localObject1).get() != null)) {
        break label263;
      }
    }
    final Object localObject2;
    for (;;)
    {
      if (!paramc.qlM)
      {
        paramc.qlN = paramc.qlL.inflate();
        paramc.qlM = true;
        paramc.qlO = ((LinearLayout)paramc.qlN.findViewById(i.f.pbY));
      }
      paramc.qlN.setVisibility(0);
      paramc.qlZ.setVisibility(8);
      paramc.hqG.setVisibility(8);
      localObject1 = paramb.hRP;
      if (((List)localObject1).size() == paramc.qlO.getChildCount()) {
        break;
      }
      paramc.qlO.removeAllViews();
      int j = com.tencent.mm.br.a.fromDPToPix(paramContext, 10);
      i = 0;
      while (i < ((List)localObject1).size())
      {
        localObject2 = new TextView(paramContext);
        ((TextView)localObject2).setBackgroundResource(i.e.oXw);
        ((TextView)localObject2).setPadding(j, j, j, j);
        ((TextView)localObject2).setTextSize(1, 14.0F * com.tencent.mm.br.a.dZ(paramContext));
        ((TextView)localObject2).setTextColor(paramContext.getResources().getColor(i.c.black));
        paramc.qlO.addView((View)localObject2);
        i += 1;
      }
      label263:
      ((View)((WeakReference)localObject1).get()).setBackgroundDrawable(null);
    }
    i = 0;
    while (i < ((List)localObject1).size())
    {
      localObject2 = (d.a)((List)localObject1).get(i);
      TextView localTextView = (TextView)paramc.qlO.getChildAt(i);
      localTextView.setText(((d.a)localObject2).pyJ);
      localTextView.setTag(parambfh);
      String str = a(f.a((d.a)localObject2), parambfh);
      localTextView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8771665395712L, 65354);
          c.this.a(paramContext, paramAnonymousView, localObject2, paramb, paramc, paramd);
          GMTrace.o(8771665395712L, 65354);
        }
      });
      localTextView.setText(a(paramContext, localTextView, str, parambfh, paramc, (d.a)localObject2, paramb, paramd), TextView.BufferType.SPANNABLE);
      if (((d.a)localObject2).actionType != 5)
      {
        localTextView.setCompoundDrawablePadding(com.tencent.mm.br.a.fromDPToPix(paramContext, 5));
        localTextView.setCompoundDrawablesWithIntrinsicBounds(paramContext.getResources().getDrawable(i.i.pgS), null, null, null);
      }
      i += 1;
    }
    GMTrace.o(15698776555520L, 116965);
    return true;
  }
  
  private static void b(a.c paramc)
  {
    GMTrace.i(8775557709824L, 65383);
    if (paramc == null)
    {
      GMTrace.o(8775557709824L, 65383);
      return;
    }
    if (paramc.qlG != null) {
      paramc.qlG.setVisibility(8);
    }
    if (paramc.qlI != null) {
      paramc.qlI.setVisibility(8);
    }
    if (paramc.qlL != null) {
      paramc.qlL.setVisibility(8);
    }
    if (paramc.qlN != null) {
      paramc.qlN.setVisibility(8);
    }
    if (paramc.qlZ.getVisibility() == 8) {
      paramc.qlZ.setVisibility(0);
    }
    if (paramc.hqG.getVisibility() == 8) {
      paramc.hqG.setVisibility(0);
    }
    if (paramc.lFh.getVisibility() == 8) {
      paramc.lFh.setVisibility(0);
    }
    GMTrace.o(8775557709824L, 65383);
  }
  
  private boolean b(final Context paramContext, final bfh parambfh, final a.c paramc, final d.b paramb, final d paramd)
  {
    GMTrace.i(8775155056640L, 65380);
    if (paramb.hRP.size() == 2)
    {
      final d.a locala1 = (d.a)paramb.hRP.get(0);
      final d.a locala2 = (d.a)paramb.hRP.get(1);
      String str1 = a(f.a(locala1), parambfh);
      String str2 = a(f.a(locala2), parambfh);
      com.tencent.mm.ui.base.h.a(paramContext, a(paramb.title, parambfh), paramContext.getString(i.j.cUG), str1, str2, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8770457436160L, 65345);
          w.i("MicroMsg.SnSABTestMgr", "onClick alert1");
          c.this.a(paramContext, parambfh, locala1, paramb, paramc, paramd);
          GMTrace.o(8770457436160L, 65345);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8772470702080L, 65360);
          w.i("MicroMsg.SnSABTestMgr", "onClick alert2");
          c.this.a(paramContext, parambfh, locala2, paramb, paramc, paramd);
          GMTrace.o(8772470702080L, 65360);
        }
      });
      GMTrace.o(8775155056640L, 65380);
      return true;
    }
    GMTrace.o(8775155056640L, 65380);
    return false;
  }
  
  public static void c(View paramView, a.c paramc)
  {
    GMTrace.i(8774752403456L, 65377);
    paramc.qlH = false;
    paramc.qlG = ((ViewStub)paramView.findViewById(i.f.pdL));
    paramc.qlG.setVisibility(8);
    paramc.qlL = ((ViewStub)paramView.findViewById(i.f.pda));
    paramc.qlL.setVisibility(8);
    GMTrace.o(8774752403456L, 65377);
  }
  
  private void dL(long paramLong)
  {
    GMTrace.i(8774483968000L, 65375);
    if (this.psG == null) {
      this.psG = new com.tencent.mm.plugin.sns.g.c();
    }
    if (this.psG.pyY.size() > 500) {
      this.psG.pyY.remove(0);
    }
    this.psG.pyY.add(Long.valueOf(paramLong));
    GMTrace.o(8774483968000L, 65375);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8774215532544L, 65373);
    w.i("MicroMsg.SnSABTestMgr", "onSceneend " + paramInt1 + " errCode " + paramInt2);
    paramString = new kj();
    com.tencent.mm.sdk.b.a.vgX.m(paramString);
    GMTrace.o(8774215532544L, 65373);
  }
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, biz parambiz, boolean paramBoolean)
  {
    GMTrace.i(8776094580736L, 65387);
    if (this.pyo.containsKey(Long.valueOf(paramLong)))
    {
      paramString1 = (a)this.pyo.get(Long.valueOf(paramLong));
      if (paramString1.mEndTime == -1L) {
        paramString1.mEndTime = System.currentTimeMillis();
      }
      paramString1.o(paramString1.pyC, paramString1.pyD, 0, 0);
    }
    GMTrace.o(8776094580736L, 65387);
  }
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, biz parambiz, boolean paramBoolean, bf parambf)
  {
    GMTrace.i(8775960363008L, 65386);
    GMTrace.o(8775960363008L, 65386);
  }
  
  public final void a(Context paramContext, View paramView, d.a parama, d.b paramb, a.c paramc, d paramd)
  {
    GMTrace.i(16046668906496L, 119557);
    w.i("MicroMsg.SnSABTestMgr", "processButtonClick");
    if (!(paramView.getTag() instanceof bfh))
    {
      GMTrace.o(16046668906496L, 119557);
      return;
    }
    a(paramContext, (bfh)paramView.getTag(), parama, paramb, paramc, paramd);
    GMTrace.o(16046668906496L, 119557);
  }
  
  public final void a(Context paramContext, bfh parambfh, d.a parama, d.b paramb, a.c paramc, d paramd)
  {
    GMTrace.i(8775423492096L, 65382);
    w.i("MicroMsg.SnSABTestMgr", "processButtonClick snsobj " + parambfh.tRz + " " + parambfh.tXT);
    int i = parama.pyL - 1;
    a locala = (a)this.pyo.get(Long.valueOf(parambfh.tXT));
    if (locala != null)
    {
      locala.o(paramb.showType, paramb.hRP.size(), parama.index, parama.actionType);
      locala.pyC = -1;
      locala.pyD = -1;
    }
    if (parama.actionType == 3)
    {
      this.pym.add(Long.valueOf(parambfh.tXT));
      this.pyl.put(Long.valueOf(parambfh.tXT), Integer.valueOf(i));
    }
    for (;;)
    {
      if ((i == 4) || (i == 1)) {
        a(paramContext, parambfh, paramc);
      }
      GMTrace.o(8775423492096L, 65382);
      return;
      if (parama.actionType == 1)
      {
        this.pyl.put(Long.valueOf(parambfh.tXT), Integer.valueOf(i));
        dL(parambfh.tXT);
        b(paramc);
      }
      else
      {
        if (parama.actionType == 5)
        {
          if (this.pym.contains(Long.valueOf(parambfh.tXT)))
          {
            this.pym.remove(Long.valueOf(parambfh.tXT));
            dL(parambfh.tXT);
            b(paramc);
            if (this.pyo.containsKey(Long.valueOf(parambfh.tXT))) {
              a((a)this.pyo.remove(Long.valueOf(parambfh.tXT)));
            }
          }
          this.pyl.put(Long.valueOf(parambfh.tXT), Integer.valueOf(-1));
          a(paramc);
          GMTrace.o(8775423492096L, 65382);
          return;
        }
        if (parama.actionType == 7)
        {
          if (i < paramd.pyI.size())
          {
            parama = (d.b)paramd.pyI.get(i);
            if (parama.showType == 2)
            {
              b(paramContext, parambfh, paramc, parama, paramd);
              GMTrace.o(8775423492096L, 65382);
              return;
            }
            if (parama.showType == 5)
            {
              u.makeText(paramContext, bg.aq(parama.title, ""), 0).show();
              dL(parambfh.tXT);
              b(paramc);
              GMTrace.o(8775423492096L, 65382);
            }
          }
        }
        else
        {
          if (parama.actionType == 6)
          {
            u.makeText(paramContext, bg.aq(paramContext.getString(i.j.pim), ""), 0).show();
            this.pyn.add(Long.valueOf(parambfh.tXT));
            b(paramc);
            paramContext = new kk();
            com.tencent.mm.sdk.b.a.vgX.m(paramContext);
            a(paramc);
            GMTrace.o(8775423492096L, 65382);
            return;
          }
          if (parama.actionType == 2)
          {
            parama = parama.jumpUrl;
            w.i("MicroMsg.SnSABTestMgr", "jump url " + parama);
            paramb = new Intent();
            paramb.putExtra("rawUrl", parama);
            paramb.putExtra("useJs", true);
            com.tencent.mm.plugin.sns.c.a.hnH.j(paramb, paramContext);
            dL(parambfh.tXT);
            b(paramc);
            a(paramc);
            GMTrace.o(8775423492096L, 65382);
            return;
          }
          if (parama.actionType == 8)
          {
            GMTrace.o(8775423492096L, 65382);
            return;
          }
          if (parama.actionType == 4)
          {
            parama = parambfh.tRz;
            paramb = new LinkedList();
            paramb.add(parama);
            parama = new com.tencent.mm.plugin.sns.model.v(1, 5L, "", paramb.size(), paramb, 0);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(parama, 0);
          }
        }
      }
    }
  }
  
  public final void a(final Context paramContext, bfh parambfh, final a.c paramc)
  {
    GMTrace.i(8774886621184L, 65378);
    if (!com.tencent.mm.sdk.platformtools.v.bPH())
    {
      b(paramc);
      GMTrace.o(8774886621184L, 65378);
      return;
    }
    if ((this.pyi == null) || (this.pyi.size() == 0))
    {
      b(paramc);
      GMTrace.o(8774886621184L, 65378);
      return;
    }
    if (this.pyn.contains(Long.valueOf(parambfh.tXT)))
    {
      b(paramc);
      paramc.qlZ.setVisibility(8);
      paramc.hqG.setVisibility(8);
      paramc.lFh.setVisibility(8);
      GMTrace.o(8774886621184L, 65378);
      return;
    }
    if ((parambfh.tRz == null) || (parambfh.tRz.equals(ae.biJ())))
    {
      b(paramc);
      GMTrace.o(8774886621184L, 65378);
      return;
    }
    if ((this.psG != null) && (this.psG.pyY.contains(Long.valueOf(parambfh.tXT))))
    {
      b(paramc);
      GMTrace.o(8774886621184L, 65378);
      return;
    }
    if (parambfh != null) {}
    for (;;)
    {
      try
      {
        arrayOfByte = com.tencent.mm.platformtools.n.a(parambfh.uRd);
        boolean bool = bg.bq(arrayOfByte);
        if (!bool) {
          continue;
        }
        i = 0;
      }
      catch (Exception localException)
      {
        byte[] arrayOfByte;
        int k;
        i = 0;
        continue;
        final d.b localb = null;
        Object localObject2 = this.pyi.iterator();
        final Object localObject1 = localb;
        if (!((Iterator)localObject2).hasNext()) {
          continue;
        }
        localObject1 = (d)((Iterator)localObject2).next();
        if (localObject1 != null) {
          continue;
        }
        b(paramc);
        GMTrace.o(8774886621184L, 65378);
        return;
        if (((d)localObject1).pyH != i) {
          continue;
        }
        if (localObject1 != null) {
          continue;
        }
        b(paramc);
        GMTrace.o(8774886621184L, 65378);
        return;
        if (j < ((d)localObject1).pyI.size()) {
          continue;
        }
        b(paramc);
        GMTrace.o(8774886621184L, 65378);
        return;
        localb = (d.b)((d)localObject1).pyI.get(j);
        int j = localb.showType;
        b(paramc);
        if (i <= 0) {
          continue;
        }
        if (this.pyo.containsKey(Long.valueOf(parambfh.tXT))) {
          continue;
        }
        localObject2 = new a(System.currentTimeMillis(), parambfh.tXT, i.dt(parambfh.tXT), (d)localObject1);
        ((a)localObject2).cX(j, localb.hRP.size());
        this.pyo.put(Long.valueOf(parambfh.tXT), localObject2);
        if (j != 1) {
          continue;
        }
        localObject2 = localb.title;
        if (paramc.qlH) {
          continue;
        }
        paramc.qlI = paramc.qlG.inflate();
        paramc.qlH = true;
        paramc.qlK = ((TextView)paramc.qlI.findViewById(i.f.pbz));
        paramc.qlJ = ((LinearLayout)paramc.qlI.findViewById(i.f.oYF));
        paramc.qlI.setVisibility(0);
        paramc.qlK.setText((CharSequence)localObject2);
        localObject2 = localb.hRP;
        if (((List)localObject2).size() == paramc.qlJ.getChildCount()) {
          continue;
        }
        paramc.qlJ.removeAllViews();
        i = 0;
        if (i >= ((List)localObject2).size()) {
          continue;
        }
        final d.a locala = (d.a)((List)localObject2).get(i);
        TextView localTextView = new TextView(paramc.qlJ.getContext());
        localTextView.setText(locala.pyJ);
        localTextView.setPadding(0, 0, com.tencent.mm.br.a.fromDPToPix(paramContext, 10), 0);
        localTextView.setVisibility(0);
        localTextView.setTextSize(1, 14.0F * com.tencent.mm.br.a.dZ(paramContext));
        localTextView.setTextColor(paramContext.getResources().getColor(i.c.aPa));
        paramc.qlJ.addView(localTextView);
        i += 1;
        continue;
        ((a)this.pyo.get(Long.valueOf(parambfh.tXT))).cX(j, localb.hRP.size());
        continue;
        i = 0;
        if (i >= ((List)localObject2).size()) {
          continue;
        }
        locala = (d.a)((List)localObject2).get(i);
        localTextView = (TextView)paramc.qlJ.getChildAt(i);
        localTextView.setText(a(paramContext, localTextView, a(f.a(locala), parambfh), parambfh, paramc, locala, localb, (d)localObject1));
        localTextView.setTag(parambfh);
        localTextView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8777034104832L, 65394);
            c.this.a(paramContext, paramAnonymousView, locala, localb, paramc, localObject1);
            GMTrace.o(8777034104832L, 65394);
          }
        });
        i += 1;
        continue;
        GMTrace.o(8774886621184L, 65378);
        return;
        if (j != 4) {
          continue;
        }
        a(paramContext, parambfh, paramc, localb, (d)localObject1);
        GMTrace.o(8774886621184L, 65378);
        return;
        if (j != 2) {
          continue;
        }
        if (!b(paramContext, parambfh, paramc, localb, (d)localObject1)) {
          continue;
        }
        GMTrace.o(8774886621184L, 65378);
        return;
        GMTrace.o(8774886621184L, 65378);
        return;
        b(paramc);
        GMTrace.o(8774886621184L, 65378);
        return;
      }
      j = 0;
      if (this.pyl.containsKey(Long.valueOf(parambfh.tXT)))
      {
        k = ((Integer)this.pyl.get(Long.valueOf(parambfh.tXT))).intValue();
        j = k;
        if (k == -1)
        {
          b(paramc);
          GMTrace.o(8774886621184L, 65378);
          return;
          i = ((bfp)new bfp().aD(arrayOfByte)).uRo;
          continue;
        }
      }
      int i = 0;
    }
  }
  
  public final void clean()
  {
    GMTrace.i(8774618185728L, 65376);
    this.pyj = null;
    this.pyk = null;
    Object localObject2;
    if (this.pym != null)
    {
      localObject1 = this.pym.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Long)((Iterator)localObject1).next();
        q localq = new q(((Long)localObject2).longValue(), 0, 0, null);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(localq, 0);
        w.i("MicroMsg.SnSABTestMgr", "report id " + localObject2);
      }
    }
    if (this.pyo != null)
    {
      localObject1 = this.pyo.values().iterator();
      while (((Iterator)localObject1).hasNext()) {
        a((a)((Iterator)localObject1).next());
      }
      this.pyo.clear();
    }
    if ((this.pyi.size() == 0) || (this.psG == null))
    {
      GMTrace.o(8774618185728L, 65376);
      return;
    }
    long l = System.currentTimeMillis();
    Object localObject1 = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject1 = com.tencent.mm.kernel.h.xy().cachePath + "ws_1100004";
    w.i("MicroMsg.SnSABTestMgr", "listToFile to list  " + (String)localObject1);
    try
    {
      localObject2 = this.psG.toByteArray();
      com.tencent.mm.a.e.b((String)localObject1, (byte[])localObject2, localObject2.length);
      w.i("MicroMsg.SnSABTestMgr", "listTofile " + (System.currentTimeMillis() - l) + " igNoreAbTestId " + this.psG.pyY.size());
      GMTrace.o(8774618185728L, 65376);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.SnSABTestMgr", localException, "listToFile failed: " + (String)localObject1, new Object[0]);
      GMTrace.o(8774618185728L, 65376);
    }
  }
  
  public final void init()
  {
    GMTrace.i(8774349750272L, 65374);
    Object localObject1 = new ArrayList();
    Object localObject2 = com.tencent.mm.y.c.c.Ct().Tf("10001").values().iterator();
    label257:
    while (((Iterator)localObject2).hasNext())
    {
      com.tencent.mm.storage.c localc = (com.tencent.mm.storage.c)((Iterator)localObject2).next();
      d locald = new d();
      if (localc == null)
      {
        w.i("MicroMsg.SnsABTestStrategy", "abtest is null");
      }
      else if (!localc.isValid())
      {
        w.i("MicroMsg.SnsABTestStrategy", "abtest is invalid");
      }
      else
      {
        Map localMap = localc.bSg();
        if (localMap != null)
        {
          w.i("MicroMsg.SnsABTestStrategy", "snsabtest feed " + localc.field_expId + " " + localc.field_layerId + " " + localc.field_startTime + " " + localc.field_endTime);
          locald.e(localc.field_layerId, localc.field_expId, localMap);
          if ((locald.eEu) && (locald.pyI != null) && (locald.pyI.size() > 0)) {}
          for (int i = 1;; i = 0)
          {
            if (i == 0) {
              break label257;
            }
            ((List)localObject1).add(locald);
            break;
          }
        }
      }
    }
    this.pyi = ((List)localObject1);
    this.pyl.clear();
    this.pym.clear();
    this.pyo.clear();
    this.psG = null;
    if ((this.pyi == null) || (this.pyi.size() == 0))
    {
      GMTrace.o(8774349750272L, 65374);
      return;
    }
    long l = System.currentTimeMillis();
    localObject1 = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject1 = com.tencent.mm.kernel.h.xy().cachePath + "ws_1100004";
    w.i("MicroMsg.SnSABTestMgr", "filepath to list  " + (String)localObject1);
    localObject2 = FileOp.c((String)localObject1, 0, -1);
    if (localObject2 != null)
    {
      try
      {
        this.psG = ((com.tencent.mm.plugin.sns.g.c)new com.tencent.mm.plugin.sns.g.c().aD((byte[])localObject2));
        w.i("MicroMsg.SnSABTestMgr", "fileToList " + (System.currentTimeMillis() - l));
        if (this.psG == null)
        {
          w.i("MicroMsg.SnSABTestMgr", "igNoreAbTestId parser error");
          GMTrace.o(8774349750272L, 65374);
          return;
        }
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.SnSABTestMgr", localIOException, "", new Object[0]);
        FileOp.deleteFile((String)localObject1);
        GMTrace.o(8774349750272L, 65374);
        return;
      }
      w.i("MicroMsg.SnSABTestMgr", "igNoreAbTestId size " + this.psG.pyY.size());
    }
    GMTrace.o(8774349750272L, 65374);
  }
  
  static final class a
  {
    long mEndTime;
    long mStartTime;
    long pst;
    d pyB;
    int pyC;
    int pyD;
    String pyE;
    String pyF;
    String pyG;
    
    public a(long paramLong1, long paramLong2, String paramString, d paramd)
    {
      GMTrace.i(8772873355264L, 65363);
      this.mStartTime = -1L;
      this.mEndTime = -1L;
      this.pyC = 0;
      this.pyD = 0;
      this.pyE = "";
      this.pyF = "";
      this.pyB = paramd;
      this.mStartTime = paramLong1;
      this.pst = paramLong2;
      this.pyG = paramString;
      GMTrace.o(8772873355264L, 65363);
    }
    
    public final void cX(int paramInt1, int paramInt2)
    {
      GMTrace.i(8773007572992L, 65364);
      this.pyC = paramInt1;
      this.pyD = paramInt2;
      GMTrace.o(8773007572992L, 65364);
    }
    
    public final void o(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(8773141790720L, 65365);
      if ((paramInt1 == -1) || (paramInt2 == -1))
      {
        GMTrace.o(8773141790720L, 65365);
        return;
      }
      String str1 = paramInt1 + ":" + paramInt2 + ":" + paramInt3 + ":" + paramInt4;
      String str2 = paramInt1 + ":" + paramInt2;
      if ((str1.equals(this.pyE)) || ((this.pyE.startsWith(str2)) && (paramInt3 == 0) && (paramInt4 == 0)))
      {
        GMTrace.o(8773141790720L, 65365);
        return;
      }
      this.pyE = str1;
      str1 = paramInt1 + ":" + paramInt2 + ":" + paramInt3 + ":" + paramInt4;
      if (!bg.nm(this.pyF)) {
        this.pyF += "|";
      }
      this.pyF += str1;
      GMTrace.o(8773141790720L, 65365);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\f\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */