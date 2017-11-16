package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.List;
import java.util.Map;

public class AppGrid
  extends GridView
{
  Context context;
  private SharedPreferences ghC;
  AdapterView.OnItemClickListener juU;
  AdapterView.OnItemLongClickListener lfy;
  b tyc;
  int tyd;
  int tye;
  int tyf;
  int tyg;
  int tyh;
  a tyi;
  
  public AppGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(991869009920L, 7390);
    this.tye = 0;
    this.tyf = 0;
    this.juU = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(994150711296L, 7407);
        AppGrid.c(AppGrid.this).a(AppGrid.c(AppGrid.this).zn(AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this) + paramAnonymousInt), AppGrid.d(AppGrid.this).vQ(paramAnonymousInt));
        GMTrace.o(994150711296L, 7407);
      }
    };
    this.lfy = new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(1015357112320L, 7565);
        paramAnonymousAdapterView = AppGrid.c(AppGrid.this);
        int i = AppGrid.c(AppGrid.this).zn(AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this) + paramAnonymousInt);
        AppGrid.d(AppGrid.this).vQ(paramAnonymousInt);
        paramAnonymousAdapterView.zo(i);
        GMTrace.o(1015357112320L, 7565);
        return true;
      }
    };
    this.context = paramContext;
    GMTrace.o(991869009920L, 7390);
  }
  
  public AppGrid(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(991734792192L, 7389);
    this.tye = 0;
    this.tyf = 0;
    this.juU = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(994150711296L, 7407);
        AppGrid.c(AppGrid.this).a(AppGrid.c(AppGrid.this).zn(AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this) + paramAnonymousInt), AppGrid.d(AppGrid.this).vQ(paramAnonymousInt));
        GMTrace.o(994150711296L, 7407);
      }
    };
    this.lfy = new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(1015357112320L, 7565);
        paramAnonymousAdapterView = AppGrid.c(AppGrid.this);
        int i = AppGrid.c(AppGrid.this).zn(AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this) + paramAnonymousInt);
        AppGrid.d(AppGrid.this).vQ(paramAnonymousInt);
        paramAnonymousAdapterView.zo(i);
        GMTrace.o(1015357112320L, 7565);
        return true;
      }
    };
    this.context = paramContext;
    GMTrace.o(991734792192L, 7389);
  }
  
  public int getCount()
  {
    GMTrace.i(992003227648L, 7391);
    int i = this.tyi.getCount();
    GMTrace.o(992003227648L, 7391);
    return i;
  }
  
  final class a
    extends BaseAdapter
  {
    List<f> tyk;
    private int tyl;
    private int tym;
    private Map<String, f> tyn;
    
    public a(List<f> paramList, Map<String, f> paramMap)
    {
      GMTrace.i(988647784448L, 7366);
      this.tyn = null;
      this.tyk = paramMap;
      Map localMap;
      this.tyn = localMap;
      this.tyl = BackwardSupportUtil.b.a(paramList, 56.0F);
      this.tym = BackwardSupportUtil.b.a(paramList, 53.3F);
      GMTrace.o(988647784448L, 7366);
    }
    
    private void a(a parama, String paramString)
    {
      GMTrace.i(989318873088L, 7371);
      if (this.tyn == null)
      {
        w.w("MicroMsg.AppGrid", "func[attachHarcodeServiceApp] harcodeServiceAppInfoMap null");
        GMTrace.o(989318873088L, 7371);
        return;
      }
      f localf = (f)this.tyn.get(paramString);
      if (localf == null)
      {
        w.w("MicroMsg.AppGrid", "func[attachHarcodeServiceApp] info null");
        GMTrace.o(989318873088L, 7371);
        return;
      }
      at.AR();
      if (c.isSDCardAvailable()) {
        if (!localf.bJt()) {
          break label595;
        }
      }
      label484:
      label595:
      for (paramString = g.b(localf.field_appId, 4, a.getDensity(AppGrid.h(AppGrid.this)));; paramString = null)
      {
        if (paramString != null) {
          parama.iCr.setBackgroundDrawable(new BitmapDrawable(paramString));
        }
        int i;
        for (;;)
        {
          parama.iCs.setText(g.a(AppGrid.h(AppGrid.this), localf, null));
          if ((localf.bJt()) && (localf.bJu()))
          {
            if (AppGrid.i(AppGrid.this) == null) {
              AppGrid.a(AppGrid.this, AppGrid.h(AppGrid.this).getSharedPreferences(ab.bPU(), 0));
            }
            if (AppGrid.i(AppGrid.this).getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + localf.field_appId, true)) {
              parama.tyo.setVisibility(0);
            }
          }
          if (!f.tnG.equals(localf.field_appId)) {
            break label484;
          }
          at.AR();
          i = ((Integer)c.xh().get(w.a.vut, Integer.valueOf(0))).intValue();
          if (i > 1) {
            break;
          }
          GMTrace.o(989318873088L, 7371);
          return;
          if (f.tnG.equals(localf.field_appId))
          {
            parama.iCr.setImageResource(R.g.aYO);
          }
          else if (f.tnI.equals(localf.field_appId))
          {
            parama.iCr.setImageResource(R.g.aYN);
          }
          else if (f.tnH.equals(localf.field_appId))
          {
            parama.iCr.setImageResource(R.g.aYM);
          }
          else if (f.tnJ.equals(localf.field_appId))
          {
            parama.iCr.setImageResource(R.k.cNT);
          }
          else
          {
            parama.iCr.setImageResource(R.g.aTL);
            continue;
            parama.iCr.setImageResource(R.g.bam);
          }
        }
        at.AR();
        if (!bg.g(((String)c.xh().get(w.a.vwk, "")).split(";")).contains(String.valueOf(i))) {
          parama.tyo.setVisibility(0);
        }
        GMTrace.o(989318873088L, 7371);
        return;
        if (f.tnI.equals(localf.field_appId))
        {
          at.AR();
          i = ((Integer)c.xh().get(w.a.vut, Integer.valueOf(0))).intValue();
          if (i <= 1)
          {
            GMTrace.o(989318873088L, 7371);
            return;
          }
          at.AR();
          if (!bg.g(((String)c.xh().get(w.a.vwl, "")).split(";")).contains(String.valueOf(i))) {
            parama.tyo.setVisibility(0);
          }
        }
        GMTrace.o(989318873088L, 7371);
        return;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(988782002176L, 7367);
      if (AppGrid.a(AppGrid.this) == AppGrid.e(AppGrid.this) - 1)
      {
        i = AppGrid.f(AppGrid.this);
        int j = AppGrid.a(AppGrid.this);
        int k = AppGrid.b(AppGrid.this);
        GMTrace.o(988782002176L, 7367);
        return i - j * k;
      }
      int i = AppGrid.b(AppGrid.this);
      GMTrace.o(988782002176L, 7367);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(989050437632L, 7369);
      GMTrace.o(989050437632L, 7369);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(989184655360L, 7370);
      View localView;
      if (paramView == null)
      {
        paramViewGroup = new a();
        localView = View.inflate(AppGrid.h(AppGrid.this), R.i.cpj, null);
        paramViewGroup.iCr = ((ImageView)localView.findViewById(R.h.beh));
        paramViewGroup.typ = localView.findViewById(R.h.bei);
        paramViewGroup.iCs = ((TextView)localView.findViewById(R.h.bej));
        paramViewGroup.tyo = ((TextView)localView.findViewById(R.h.bek));
        paramViewGroup.tyq = localView.findViewById(R.h.bel);
        localView.setTag(paramViewGroup);
        w.v("MicroMsg.AppGrid", "pos:" + paramInt + " page:" + AppGrid.a(AppGrid.this));
        paramViewGroup.iCs.setVisibility(0);
        paramViewGroup.tyq.setVisibility(8);
        paramViewGroup.tyo.setVisibility(8);
        paramViewGroup.typ.setVisibility(0);
        paramView = paramViewGroup.iCr.getLayoutParams();
        paramView.width = this.tyl;
        paramView.height = this.tyl;
        paramViewGroup.iCr.setLayoutParams(paramView);
        int i = AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this) + paramInt;
        int j = AppGrid.c(AppGrid.this).zn(i);
        if (i >= AppGrid.g(AppGrid.this)) {
          break label1361;
        }
        switch (j)
        {
        }
      }
      for (;;)
      {
        paramView = vQ(paramInt);
        if ((paramView != null) && (g.j(paramView))) {
          paramViewGroup.tyo.setVisibility(0);
        }
        GMTrace.o(989184655360L, 7370);
        return localView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
        break;
        paramViewGroup.iCr.setImageResource(R.k.cNW);
        paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cSQ));
        continue;
        paramViewGroup.iCr.setImageResource(R.k.cOf);
        paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cSZ));
        label1361:
        label1436:
        label1632:
        try
        {
          at.AR();
          if (((Boolean)c.xh().get(67, Boolean.valueOf(false))).booleanValue())
          {
            paramViewGroup.tyo.setVisibility(0);
            continue;
          }
          paramViewGroup.tyo.setVisibility(8);
        }
        catch (Exception paramView) {}
        paramViewGroup.iCr.setImageResource(R.k.cOd);
        paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.dCz));
        try
        {
          at.AR();
          if (((Boolean)c.xh().get(73, Boolean.valueOf(false))).booleanValue())
          {
            paramViewGroup.tyo.setVisibility(0);
            continue;
          }
          paramViewGroup.tyo.setVisibility(8);
        }
        catch (Exception paramView) {}
        if (r.hlf)
        {
          paramViewGroup.iCr.setImageResource(R.k.cOc);
          paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cSY));
        }
        else
        {
          paramViewGroup.iCr.setImageResource(R.k.cNU);
          paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cSS));
          continue;
          paramViewGroup.iCr.setImageResource(R.k.cOa);
          paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cSU));
          continue;
          paramViewGroup.iCr.setImageResource(R.k.cNY);
          paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cSR));
          try
          {
            at.AR();
            if (((Boolean)c.xh().get(290817, Boolean.valueOf(false))).booleanValue())
            {
              paramViewGroup.tyq.setVisibility(0);
              continue;
            }
            paramViewGroup.tyq.setVisibility(8);
          }
          catch (Exception paramView) {}
          paramViewGroup.iCr.setImageResource(R.k.cOb);
          paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cSX));
          try
          {
            at.AR();
            if (((Boolean)c.xh().get(327744, Boolean.valueOf(true))).booleanValue())
            {
              paramViewGroup.tyq.setVisibility(0);
              continue;
            }
            paramViewGroup.tyq.setVisibility(8);
          }
          catch (Exception paramView) {}
          paramViewGroup.iCr.setImageResource(R.k.cNX);
          paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cSN));
          continue;
          paramViewGroup.iCr.setImageResource(R.k.cJz);
          paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cTc));
          try
          {
            at.AR();
            if (((Boolean)c.xh().get(54, Boolean.valueOf(false))).booleanValue())
            {
              paramViewGroup.tyo.setVisibility(0);
              continue;
            }
            paramViewGroup.tyo.setVisibility(8);
          }
          catch (Exception paramView) {}
          paramViewGroup.iCr.setImageResource(R.k.cOe);
          paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cTd));
          try
          {
            at.AR();
            if (((Boolean)c.xh().get(62, Boolean.valueOf(false))).booleanValue())
            {
              paramViewGroup.tyo.setVisibility(0);
              continue;
            }
            paramViewGroup.tyo.setVisibility(8);
          }
          catch (Exception paramView) {}
          paramViewGroup.iCr.setImageResource(R.k.cJy);
          paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.dpj));
          try
          {
            at.AR();
            boolean bool1 = ((Boolean)c.xh().get(208899, Boolean.valueOf(false))).booleanValue();
            at.AR();
            boolean bool2 = ((Boolean)c.xh().get(208913, Boolean.valueOf(false))).booleanValue();
            if ((bool1) || (bool2))
            {
              paramViewGroup.tyo.setVisibility(0);
              if (bool2)
              {
                paramViewGroup.tyo.setText(R.l.cTi);
                continue;
              }
              paramViewGroup.tyo.setText(R.l.cTH);
              continue;
            }
            paramViewGroup.tyo.setVisibility(8);
          }
          catch (Exception paramView) {}
          a(paramViewGroup, f.tnG);
          continue;
          a(paramViewGroup, f.tnI);
          continue;
          paramViewGroup.iCr.setImageResource(R.k.cNZ);
          paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cTd));
          try
          {
            at.AR();
            if (((Boolean)c.xh().get(81, Boolean.valueOf(false))).booleanValue())
            {
              paramViewGroup.tyo.setVisibility(0);
              continue;
            }
            paramViewGroup.tyo.setVisibility(8);
          }
          catch (Exception paramView) {}
          paramViewGroup.iCr.setImageResource(R.k.cNV);
          paramViewGroup.iCs.setText(AppGrid.h(AppGrid.this).getString(R.l.cSP));
          try
          {
            paramViewGroup.tyq.setVisibility(8);
          }
          catch (Exception paramView) {}
          continue;
          a(paramViewGroup, f.tnJ);
          continue;
          paramView.width = this.tym;
          paramView.height = this.tym;
          paramViewGroup.iCr.setLayoutParams(paramView);
          f localf = vQ(paramInt);
          if (localf != null)
          {
            at.AR();
            if (c.isSDCardAvailable()) {
              if (localf.field_status == 5)
              {
                paramView = g.b(localf.field_appId, 3, a.getDensity(AppGrid.h(AppGrid.this)));
                if (paramView == null) {
                  break label1632;
                }
                paramViewGroup.iCr.setBackgroundDrawable(new BitmapDrawable(paramView));
              }
            }
            for (;;)
            {
              paramViewGroup.iCs.setText(g.a(AppGrid.h(AppGrid.this), localf, null));
              if (((!localf.bJt()) || (!localf.bJu())) && (!localf.bJv())) {
                break;
              }
              if (AppGrid.i(AppGrid.this) == null) {
                AppGrid.a(AppGrid.this, AppGrid.h(AppGrid.this).getSharedPreferences(ab.bPU(), 0));
              }
              if (!AppGrid.i(AppGrid.this).getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + localf.field_appId, true)) {
                break;
              }
              paramViewGroup.tyo.setVisibility(0);
              break;
              if (localf.bJt())
              {
                paramView = g.b(localf.field_appId, 4, a.getDensity(AppGrid.h(AppGrid.this)));
                break label1436;
              }
              paramView = g.b(localf.field_appId, 1, a.getDensity(AppGrid.h(AppGrid.this)));
              break label1436;
              if (f.tnG.equals(localf.field_appId))
              {
                paramViewGroup.iCr.setImageResource(R.g.aYO);
              }
              else if (f.tnI.equals(localf.field_appId))
              {
                paramViewGroup.iCr.setImageResource(R.g.aYN);
              }
              else if (f.tnH.equals(localf.field_appId))
              {
                paramViewGroup.iCr.setImageResource(R.g.aYM);
              }
              else if (f.tnJ.equals(localf.field_appId))
              {
                paramViewGroup.iCr.setImageResource(R.k.cNT);
              }
              else
              {
                paramViewGroup.iCr.setBackgroundResource(R.g.aTL);
                continue;
                paramViewGroup.iCr.setBackgroundResource(R.g.bam);
              }
            }
            continue;
            continue;
            continue;
            continue;
            continue;
            continue;
          }
        }
      }
    }
    
    public final f vQ(int paramInt)
    {
      GMTrace.i(988916219904L, 7368);
      if (((paramInt < AppGrid.g(AppGrid.this)) && (AppGrid.a(AppGrid.this) == 0)) || (AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this) + paramInt < AppGrid.g(AppGrid.this)) || (paramInt - AppGrid.g(AppGrid.this) + AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this) >= this.tyk.size()))
      {
        GMTrace.o(988916219904L, 7368);
        return null;
      }
      paramInt = paramInt - AppGrid.g(AppGrid.this) + AppGrid.a(AppGrid.this) * AppGrid.b(AppGrid.this);
      w.v("MicroMsg.AppGrid", "get item db pos: %d", new Object[] { Integer.valueOf(paramInt) });
      f localf = (f)this.tyk.get(paramInt);
      GMTrace.o(988916219904L, 7368);
      return localf;
    }
    
    final class a
    {
      ImageView iCr;
      TextView iCs;
      TextView tyo;
      View typ;
      View tyq;
      
      a()
      {
        GMTrace.i(1016565071872L, 7574);
        GMTrace.o(1016565071872L, 7574);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt, f paramf);
    
    public abstract int zn(int paramInt);
    
    public abstract void zo(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\chat\AppGrid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */