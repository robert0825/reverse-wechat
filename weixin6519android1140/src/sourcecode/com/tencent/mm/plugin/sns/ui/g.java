package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.aw.n;
import com.tencent.mm.aw.t;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.do;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class g
  extends BaseAdapter
{
  private final Activity eNu;
  final List<anu> ePZ;
  private final com.tencent.mm.sdk.platformtools.ae handler;
  private String mwK;
  final Map<Integer, Integer> pNV;
  final Map<Integer, Integer> pNW;
  int pNX;
  int pNY;
  private final b pNZ;
  private final h pOa;
  final a pOb;
  
  public g(Activity paramActivity, String paramString, b paramb, a parama)
  {
    GMTrace.i(8314251378688L, 61946);
    this.ePZ = new ArrayList();
    this.pNV = new HashMap();
    this.pNW = new HashMap();
    this.pNX = 0;
    this.pNY = 0;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    this.mwK = "";
    this.eNu = paramActivity;
    this.mwK = paramString;
    this.pNZ = paramb;
    this.pOb = parama;
    this.pOa = new h(new h.a()
    {
      public final void a(List<anu> paramAnonymousList, Map<Integer, Integer> paramAnonymousMap1, Map<Integer, Integer> paramAnonymousMap2, int paramAnonymousInt1, int paramAnonymousInt2, do paramAnonymousdo)
      {
        GMTrace.i(8516383277056L, 63452);
        w.d("MicroMsg.ArtistAdapter", "onFinishFixPos");
        g localg = g.this;
        if ((paramAnonymousList == null) || (paramAnonymousList.size() <= 0))
        {
          GMTrace.o(8516383277056L, 63452);
          return;
        }
        try
        {
          paramAnonymousdo = (do)new do().aD(paramAnonymousdo.toByteArray());
          localg.pOb.a(paramAnonymousdo);
          w.d("MicroMsg.ArtistAdapter", "copy list info");
          j = paramAnonymousList.size();
          localg.ePZ.clear();
          localg.pNV.clear();
          localg.pNW.clear();
          i = 0;
          while (i < j)
          {
            paramAnonymousdo = (anu)paramAnonymousList.get(i);
            paramAnonymousdo = e.a(paramAnonymousdo.mmR, paramAnonymousdo.jib, paramAnonymousdo.lPM, paramAnonymousdo.uCO, paramAnonymousdo.uCN, paramAnonymousdo.uCP, paramAnonymousdo.lPj);
            localg.ePZ.add(paramAnonymousdo);
            i += 1;
          }
        }
        catch (Exception paramAnonymousdo)
        {
          int j;
          int i;
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.ArtistAdapter", paramAnonymousdo, "", new Object[0]);
          }
          paramAnonymousdo = paramAnonymousMap1.keySet().iterator();
          while (paramAnonymousdo.hasNext())
          {
            i = ((Integer)paramAnonymousdo.next()).intValue();
            j = ((Integer)paramAnonymousMap1.get(Integer.valueOf(i))).intValue();
            localg.pNV.put(Integer.valueOf(i), Integer.valueOf(j));
          }
          paramAnonymousdo = paramAnonymousMap2.keySet().iterator();
          while (paramAnonymousdo.hasNext())
          {
            i = ((Integer)paramAnonymousdo.next()).intValue();
            j = ((Integer)paramAnonymousMap2.get(Integer.valueOf(i))).intValue();
            localg.pNW.put(Integer.valueOf(i), Integer.valueOf(j));
          }
          paramAnonymousList.clear();
          paramAnonymousMap1.clear();
          paramAnonymousMap2.clear();
          localg.pNY = paramAnonymousInt1;
          localg.pNX = paramAnonymousInt2;
          w.d("MicroMsg.ArtistAdapter", "reallyCount " + paramAnonymousInt1 + " icount " + paramAnonymousInt2);
          localg.notifyDataSetChanged();
          GMTrace.o(8516383277056L, 63452);
        }
      }
      
      public final void bmD()
      {
        GMTrace.i(8516517494784L, 63453);
        g localg = g.this;
        if (localg.pOb != null) {
          localg.pOb.bmE();
        }
        GMTrace.o(8516517494784L, 63453);
      }
    });
    QF();
    GMTrace.o(8314251378688L, 61946);
  }
  
  private void a(int paramInt, ImageView paramImageView)
  {
    GMTrace.i(8315056685056L, 61952);
    anu localanu = (anu)getItem(paramInt);
    paramImageView.setVisibility(0);
    g.b.a locala = new g.b.a();
    locala.eUg = "";
    locala.position = paramInt;
    paramImageView.setTag(locala);
    com.tencent.mm.plugin.sns.model.ae.bja().b(localanu, paramImageView, this.eNu.hashCode(), an.vBh);
    GMTrace.o(8315056685056L, 61952);
  }
  
  public final void QF()
  {
    GMTrace.i(8314385596416L, 61947);
    if (this.pOa != null)
    {
      t.Kj();
      String str = n.Kf();
      w.d("MicroMsg.ArtistAdapter", "packgePath: " + str);
      this.pOa.dQ(this.mwK, str);
    }
    GMTrace.o(8314385596416L, 61947);
  }
  
  public final int getCount()
  {
    GMTrace.i(8314519814144L, 61948);
    int i = this.pNX;
    GMTrace.o(8314519814144L, 61948);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(8314654031872L, 61949);
    Object localObject = this.ePZ.get(paramInt);
    GMTrace.o(8314654031872L, 61949);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(8314788249600L, 61950);
    GMTrace.o(8314788249600L, 61950);
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(8314922467328L, 61951);
    if (paramView == null)
    {
      paramViewGroup = new c();
      paramView = View.inflate(this.eNu, i.g.pfv, null);
      paramViewGroup.ikm = ((TextView)paramView.findViewById(i.f.pec));
      paramViewGroup.pOi = ((TextView)paramView.findViewById(i.f.ped));
      paramViewGroup.pOj = ((ImageView)paramView.findViewById(i.f.paT));
      paramViewGroup.pOk = ((ImageView)paramView.findViewById(i.f.paU));
      paramViewGroup.pOl = ((ImageView)paramView.findViewById(i.f.paV));
      paramViewGroup.pOm = ((LinearLayout)paramView.findViewById(i.f.pbl));
      paramViewGroup.pOn = paramView.findViewById(i.f.pbi);
      paramViewGroup.pOj.setOnClickListener(this.pNZ.pOd);
      paramViewGroup.pOk.setOnClickListener(this.pNZ.pOe);
      paramViewGroup.pOl.setOnClickListener(this.pNZ.pOf);
      paramView.setTag(paramViewGroup);
      if (this.pNV.get(Integer.valueOf(paramInt)) == null) {
        break label632;
      }
    }
    label356:
    label576:
    label632:
    for (int i = ((Integer)this.pNV.get(Integer.valueOf(paramInt))).intValue();; i = -1)
    {
      paramViewGroup.pOj.setVisibility(8);
      paramViewGroup.pOk.setVisibility(8);
      paramViewGroup.pOl.setVisibility(8);
      paramViewGroup.pOn.setVisibility(8);
      if (paramViewGroup.pOc.mwK.equals("en"))
      {
        paramViewGroup.ikm.setVisibility(8);
        paramViewGroup.pOi.setVisibility(4);
      }
      for (;;)
      {
        if ((i < this.pNY) && (i != -1)) {
          break label356;
        }
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
        paramView.setVisibility(8);
        GMTrace.o(8314922467328L, 61951);
        return paramView;
        paramViewGroup = (c)paramView.getTag();
        break;
        paramViewGroup.ikm.setVisibility(4);
        paramViewGroup.pOi.setVisibility(8);
      }
      if (i - 1 >= 0) {}
      for (String str = ((anu)getItem(i - 1)).lPj;; str = "")
      {
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        paramView.setVisibility(0);
        if (this.pNW.get(Integer.valueOf(paramInt)) != null) {}
        for (paramInt = ((Integer)this.pNW.get(Integer.valueOf(paramInt))).intValue();; paramInt = 1)
        {
          anu localanu = (anu)getItem(i);
          if ((localanu.lPj.equals("")) || (!localanu.lPj.equals(str)))
          {
            if (!this.mwK.equals("en")) {
              break label576;
            }
            paramViewGroup.pOi.setVisibility(0);
            paramViewGroup.pOi.setText(localanu.lPj);
            paramViewGroup.pOn.setVisibility(0);
          }
          for (;;)
          {
            if (paramInt > 0) {
              a(i, paramViewGroup.pOj);
            }
            if (paramInt >= 2) {
              a(i + 1, paramViewGroup.pOk);
            }
            if (paramInt < 3) {
              break;
            }
            a(i + 2, paramViewGroup.pOl);
            break;
            paramViewGroup.ikm.setVisibility(0);
            paramViewGroup.ikm.setText(localanu.lPj);
            paramViewGroup.pOn.setVisibility(0);
          }
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(do paramdo);
    
    public abstract void bmE();
  }
  
  static abstract class b
  {
    View.OnClickListener pOd;
    View.OnClickListener pOe;
    View.OnClickListener pOf;
    public a pOg;
    
    public b()
    {
      GMTrace.i(8555977506816L, 63747);
      this.pOg = new a();
      this.pOd = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8366327857152L, 62334);
          g.b.this.pOg = ((g.b.a)paramAnonymousView.getTag());
          int i = g.b.this.pOg.position;
          g.b.this.vc(i);
          GMTrace.o(8366327857152L, 62334);
        }
      };
      this.pOe = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8389144870912L, 62504);
          g.b.this.pOg = ((g.b.a)paramAnonymousView.getTag());
          int i = g.b.this.pOg.position;
          g.b.this.vc(i);
          GMTrace.o(8389144870912L, 62504);
        }
      };
      this.pOf = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8657848762368L, 64506);
          g.b.this.pOg = ((g.b.a)paramAnonymousView.getTag());
          int i = g.b.this.pOg.position;
          g.b.this.vc(i);
          GMTrace.o(8657848762368L, 64506);
        }
      };
      GMTrace.o(8555977506816L, 63747);
    }
    
    public abstract void vc(int paramInt);
    
    public static final class a
    {
      public String eUg;
      public int position;
      
      public a()
      {
        GMTrace.i(8613422694400L, 64175);
        GMTrace.o(8613422694400L, 64175);
      }
    }
  }
  
  final class c
  {
    TextView ikm;
    TextView pOi;
    ImageView pOj;
    ImageView pOk;
    ImageView pOl;
    LinearLayout pOm;
    View pOn;
    
    c()
    {
      GMTrace.i(8469004419072L, 63099);
      GMTrace.o(8469004419072L, 63099);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */