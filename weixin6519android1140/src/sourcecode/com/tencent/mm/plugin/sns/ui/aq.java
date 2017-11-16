package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.AnimatedExpandableListView.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aq
  extends AnimatedExpandableListView.a
{
  public static int[] qbM;
  public static int[] qci;
  private LayoutInflater CJ;
  private Context mContext;
  ArrayList<String> qcj;
  public int qck;
  public boolean qcl;
  public ArrayList<String> qcm;
  public ArrayList<String> qcn;
  public ArrayList<String> qco;
  public ArrayList<String> qcp;
  public int style;
  
  static
  {
    GMTrace.i(8596242825216L, 64047);
    qbM = new int[] { i.j.pjN, i.j.pjL, i.j.pjH, i.j.pjA };
    qci = new int[] { i.j.pjO, i.j.pjM, i.j.pjI, i.j.pjB };
    GMTrace.o(8596242825216L, 64047);
  }
  
  public aq(Context paramContext)
  {
    GMTrace.i(8593826906112L, 64029);
    this.qck = 0;
    this.qcl = false;
    this.qcm = new ArrayList();
    this.qcn = new ArrayList();
    this.qco = new ArrayList();
    this.qcp = new ArrayList();
    this.mContext = paramContext;
    this.CJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    GMTrace.o(8593826906112L, 64029);
  }
  
  public static void Je(String paramString)
  {
    GMTrace.i(8594497994752L, 64034);
    w.d("MicroMsg.Sns.AnimatedExpandableListAdapter", "recordTopFive : %s", new Object[] { paramString });
    if (bpk() != null)
    {
      ArrayList localArrayList = new ArrayList(bpk());
      if (!i(localArrayList, paramString))
      {
        if (localArrayList.size() == 5) {
          localArrayList.remove(4);
        }
        localArrayList.add(0, paramString);
        paramString = bg.c(localArrayList, ",");
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().set(335875, paramString);
      }
      GMTrace.o(8594497994752L, 64034);
      return;
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().set(335875, paramString);
    GMTrace.o(8594497994752L, 64034);
  }
  
  private CharSequence Jf(String paramString)
  {
    GMTrace.i(8594632212480L, 64035);
    paramString = com.tencent.mm.plugin.label.a.a.aJP().AV(paramString);
    Object localObject = com.tencent.mm.plugin.label.a.a.aJP().AY(paramString);
    if ((localObject == null) || (((List)localObject).size() == 0))
    {
      GMTrace.o(8594632212480L, 64035);
      return "";
    }
    paramString = new ArrayList(((List)localObject).size());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramString.add(((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fs((String)((Iterator)localObject).next()));
    }
    paramString = bg.c(paramString, ",");
    paramString = com.tencent.mm.pluginsdk.ui.d.h.a(this.mContext, paramString);
    GMTrace.o(8594632212480L, 64035);
    return paramString;
  }
  
  private static List<String> ah(List<String> paramList)
  {
    GMTrace.i(8595840172032L, 64044);
    LinkedList localLinkedList = new LinkedList();
    com.tencent.mm.kernel.h.xz();
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      GMTrace.o(8595840172032L, 64044);
      return localLinkedList;
    }
    if (paramList == null)
    {
      GMTrace.o(8595840172032L, 64044);
      return localLinkedList;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      com.tencent.mm.kernel.h.xz();
      x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(str);
      paramList = str;
      if (localx != null)
      {
        paramList = str;
        if ((int)localx.fTq != 0) {
          paramList = localx.vk();
        }
      }
      localLinkedList.add(paramList);
    }
    GMTrace.o(8595840172032L, 64044);
    return localLinkedList;
  }
  
  private boolean au(int paramInt, String paramString)
  {
    GMTrace.i(8594900647936L, 64037);
    if (paramInt == 1)
    {
      bool = i(this.qcm, paramString);
      GMTrace.o(8594900647936L, 64037);
      return bool;
    }
    boolean bool = i(this.qcn, paramString);
    GMTrace.o(8594900647936L, 64037);
    return bool;
  }
  
  private static List<String> bpk()
  {
    GMTrace.i(8594363777024L, 64033);
    com.tencent.mm.kernel.h.xz();
    Object localObject = (String)com.tencent.mm.kernel.h.xy().xh().get(335875, null);
    w.d("MicroMsg.Sns.AnimatedExpandableListAdapter", "dz:getTopFive : %s", new Object[] { localObject });
    if (bg.nm((String)localObject))
    {
      GMTrace.o(8594363777024L, 64033);
      return null;
    }
    localObject = bg.g(((String)localObject).split(","));
    GMTrace.o(8594363777024L, 64033);
    return (List<String>)localObject;
  }
  
  private static boolean i(List<String> paramList, String paramString)
  {
    GMTrace.i(8594766430208L, 64036);
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (((String)paramList.next()).equals(paramString))
      {
        GMTrace.o(8594766430208L, 64036);
        return true;
      }
    }
    GMTrace.o(8594766430208L, 64036);
    return false;
  }
  
  public final void S(ArrayList<String> paramArrayList)
  {
    GMTrace.i(8594229559296L, 64032);
    Object localObject2 = bpk();
    Object localObject1 = new ArrayList();
    if ((localObject2 != null) && (paramArrayList != null))
    {
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        if (i(paramArrayList, str))
        {
          paramArrayList.remove(str);
          ((ArrayList)localObject1).add(str);
        }
      }
      paramArrayList.addAll(0, (Collection)localObject1);
      localObject1 = bg.c((List)localObject1, ",");
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().set(335875, localObject1);
    }
    this.qcj = paramArrayList;
    GMTrace.o(8594229559296L, 64032);
  }
  
  public final View a(int paramInt1, int paramInt2, View paramView)
  {
    GMTrace.i(8595974389760L, 64045);
    a locala;
    label124:
    String str;
    if (paramView == null) {
      if (this.style == 1)
      {
        paramView = this.CJ.inflate(i.g.pfO, null);
        locala = new a();
        locala.titleView = ((TextView)paramView.findViewById(i.f.pdh));
        locala.mDJ = ((TextView)paramView.findViewById(i.f.pdg));
        locala.qcq = ((TextView)paramView.findViewById(i.f.pdf));
        locala.qcr = ((TextView)paramView.findViewById(i.f.pde));
        locala.mRV = ((ImageView)paramView.findViewById(i.f.pdd));
        paramView.setTag(locala);
        if (paramInt2 != this.qcj.size()) {
          break label440;
        }
        locala.titleView.setVisibility(8);
        locala.mDJ.setVisibility(8);
        locala.mRV.setVisibility(8);
        locala.qcq.setVisibility(0);
        locala.qcr.setVisibility(0);
        if (paramInt1 != 3) {
          break label329;
        }
        if (this.qcp.size() <= 0) {
          break label306;
        }
        str = bg.c(ah(this.qcp), ",");
        locala.qcr.setText("√" + str);
        locala.qcr.setVisibility(0);
        locala.qcr.setTextColor(this.mContext.getResources().getColor(i.c.oXh));
      }
    }
    for (;;)
    {
      GMTrace.o(8595974389760L, 64045);
      return paramView;
      paramView = this.CJ.inflate(i.g.pfN, null);
      break;
      locala = (a)paramView.getTag();
      break label124;
      label306:
      locala.qcr.setText("");
      locala.qcr.setVisibility(8);
      continue;
      label329:
      if (paramInt1 == 2) {
        if (this.qco.size() > 0)
        {
          str = bg.c(ah(this.qco), ",");
          locala.qcr.setText("√" + str);
          locala.qcr.setVisibility(0);
          locala.qcr.setTextColor(this.mContext.getResources().getColor(i.c.oXg));
        }
        else
        {
          locala.qcr.setText("");
          locala.qcr.setVisibility(8);
          continue;
          label440:
          locala.titleView.setVisibility(0);
          locala.mDJ.setVisibility(0);
          locala.mRV.setVisibility(0);
          locala.qcq.setVisibility(8);
          locala.qcr.setVisibility(8);
          str = (String)this.qcj.get(paramInt2);
          locala.titleView.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this.mContext, str));
          locala.mDJ.setText(Jf(str));
          locala.mRV.setVisibility(0);
          if (this.style == 1)
          {
            if (paramInt1 == 2)
            {
              if (au(1, str)) {
                locala.mRV.setImageResource(i.i.cON);
              } else {
                locala.mRV.setImageResource(i.i.cOO);
              }
            }
            else if (paramInt1 == 3)
            {
              if (this.qck != paramInt1) {
                locala.mRV.setImageResource(i.i.pht);
              }
              for (;;)
              {
                if (!au(2, str)) {
                  break label653;
                }
                locala.mRV.setImageResource(i.i.phs);
                break;
                locala.mRV.setImageResource(i.i.phs);
              }
              label653:
              locala.mRV.setImageResource(i.i.pht);
            }
          }
          else if (paramInt1 == 2)
          {
            if (au(1, str)) {
              locala.mRV.setImageResource(i.i.cLt);
            } else {
              locala.mRV.setImageResource(i.i.cLu);
            }
          }
          else if (paramInt1 == 3) {
            if (au(2, str)) {
              locala.mRV.setImageResource(i.i.pgY);
            } else {
              locala.mRV.setImageResource(i.i.cLu);
            }
          }
        }
      }
    }
  }
  
  public final Object getChild(int paramInt1, int paramInt2)
  {
    GMTrace.i(8593961123840L, 64030);
    Object localObject = this.qcj.get(paramInt2);
    GMTrace.o(8593961123840L, 64030);
    return localObject;
  }
  
  public final long getChildId(int paramInt1, int paramInt2)
  {
    GMTrace.i(8594095341568L, 64031);
    GMTrace.o(8594095341568L, 64031);
    return 0L;
  }
  
  public final Object getGroup(int paramInt)
  {
    GMTrace.i(8595034865664L, 64038);
    GMTrace.o(8595034865664L, 64038);
    return null;
  }
  
  public final int getGroupCount()
  {
    GMTrace.i(8595169083392L, 64039);
    GMTrace.o(8595169083392L, 64039);
    return 4;
  }
  
  public final long getGroupId(int paramInt)
  {
    GMTrace.i(8595303301120L, 64040);
    GMTrace.o(8595303301120L, 64040);
    return 0L;
  }
  
  public final View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(8595437518848L, 64041);
    if ((paramView == null) || (!(paramView.getTag() instanceof a))) {
      if (this.style == 1)
      {
        paramView = this.CJ.inflate(i.g.pfQ, null);
        paramViewGroup = new a();
        paramViewGroup.titleView = ((TextView)paramView.findViewById(i.f.pdh));
        paramViewGroup.mRV = ((ImageView)paramView.findViewById(i.f.pdd));
        paramViewGroup.mDJ = ((TextView)paramView.findViewById(i.f.pdg));
        paramView.setTag(paramViewGroup);
        label104:
        paramViewGroup.titleView.setText(qbM[paramInt]);
        paramViewGroup.mDJ.setText(qci[paramInt]);
        switch (paramInt)
        {
        }
      }
    }
    for (;;)
    {
      if ((!this.qcl) || (paramInt != 1)) {
        break label452;
      }
      paramView = new View(this.mContext);
      paramView.setVisibility(8);
      GMTrace.o(8595437518848L, 64041);
      return paramView;
      paramView = this.CJ.inflate(i.g.pfP, null);
      break;
      paramViewGroup = (a)paramView.getTag();
      break label104;
      if (this.qck != paramInt)
      {
        paramViewGroup.mRV.setImageResource(i.i.cOu);
      }
      else
      {
        paramViewGroup.mRV.setImageResource(i.i.cOv);
        paramViewGroup.mRV.setContentDescription(this.mContext.getString(i.j.pif));
        continue;
        if (this.qck != paramInt)
        {
          paramViewGroup.mRV.setImageResource(i.i.cOu);
        }
        else
        {
          paramViewGroup.mRV.setImageResource(i.i.cOv);
          paramViewGroup.mRV.setContentDescription(this.mContext.getString(i.j.pif));
          continue;
          if (this.style == 1)
          {
            if (this.qck != paramInt)
            {
              paramViewGroup.mRV.setImageResource(i.i.cOu);
            }
            else
            {
              paramViewGroup.mRV.setImageResource(i.i.phl);
              paramViewGroup.mRV.setContentDescription(this.mContext.getString(i.j.pif));
            }
          }
          else if (this.qck != paramInt)
          {
            paramViewGroup.mRV.setImageResource(i.i.cOu);
          }
          else
          {
            paramViewGroup.mRV.setImageResource(i.i.phk);
            paramViewGroup.mRV.setContentDescription(this.mContext.getString(i.j.pif));
          }
        }
      }
    }
    label452:
    GMTrace.o(8595437518848L, 64041);
    return paramView;
  }
  
  public final boolean hasStableIds()
  {
    GMTrace.i(8595571736576L, 64042);
    GMTrace.o(8595571736576L, 64042);
    return false;
  }
  
  public final boolean isChildSelectable(int paramInt1, int paramInt2)
  {
    GMTrace.i(8595705954304L, 64043);
    GMTrace.o(8595705954304L, 64043);
    return true;
  }
  
  public final int vt(int paramInt)
  {
    GMTrace.i(8596108607488L, 64046);
    if ((paramInt > 1) && (this.qcj != null))
    {
      paramInt = this.qcj.size();
      GMTrace.o(8596108607488L, 64046);
      return paramInt + 1;
    }
    GMTrace.o(8596108607488L, 64046);
    return 0;
  }
  
  private final class a
  {
    TextView mDJ;
    ImageView mRV;
    TextView qcq;
    TextView qcr;
    TextView titleView;
    
    public a()
    {
      GMTrace.i(8365119897600L, 62325);
      GMTrace.o(8365119897600L, 62325);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */