package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.u;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SnsTagUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  public static int[] qbM;
  public static int[] qgp;
  private int linkColor;
  private ListView mqO;
  private a qgm;
  private HashMap<Long, String> qgn;
  private View[] qgo;
  private int qgq;
  private View.OnClickListener qgr;
  
  static
  {
    GMTrace.i(8314117160960L, 61945);
    qbM = new int[] { i.j.pkL, i.j.pkN };
    qgp = new int[] { i.j.pkF, i.j.pkO };
    GMTrace.o(8314117160960L, 61945);
  }
  
  public SnsTagUI()
  {
    GMTrace.i(8311701241856L, 61927);
    this.qgn = new HashMap();
    this.qgo = new View[2];
    this.qgq = 0;
    this.qgr = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8564433223680L, 63810);
        if ((paramAnonymousView.getTag() instanceof Integer)) {
          SnsTagUI.a(SnsTagUI.this, ((Integer)paramAnonymousView.getTag()).intValue());
        }
        GMTrace.o(8564433223680L, 63810);
      }
    };
    GMTrace.o(8311701241856L, 61927);
  }
  
  private void bpw()
  {
    int i = 0;
    GMTrace.i(8312640765952L, 61934);
    this.qgq = 0;
    switch (this.qgq)
    {
    }
    for (;;)
    {
      GMTrace.o(8312640765952L, 61934);
      return;
      vx(this.qgq);
      GMTrace.o(8312640765952L, 61934);
      return;
      Object localObject2 = getIntent().getStringExtra("Ktag_id_list");
      Object localObject1 = getIntent().getStringExtra("Ktag_name_list");
      localObject2 = ((String)localObject2).split(",");
      localObject1 = ((String)localObject1).split(",");
      int j = Math.min(localObject2.length, localObject1.length);
      while (i < j)
      {
        this.qgn.put(Long.valueOf(bg.getLong(localObject2[i], 0L)), localObject1[i]);
        i += 1;
      }
    }
  }
  
  private void bpx()
  {
    GMTrace.i(8312909201408L, 61936);
    this.qgq = 2;
    int i = 0;
    while (i < 2)
    {
      ((ImageView)this.qgo[i].findViewById(i.f.pdW)).setImageResource(i.i.cLu);
      i += 1;
    }
    GMTrace.o(8312909201408L, 61936);
  }
  
  private void vx(int paramInt)
  {
    GMTrace.i(8312774983680L, 61935);
    if ((paramInt >= 0) && (paramInt < 2))
    {
      bpx();
      this.qgq = paramInt;
      ((ImageView)this.qgo[paramInt].findViewById(i.f.pdW)).setImageResource(i.i.cLt);
      this.qgn.clear();
      if (this.qgm != null) {
        this.qgm.notifyDataSetChanged();
      }
    }
    GMTrace.o(8312774983680L, 61935);
  }
  
  protected final void MP()
  {
    GMTrace.i(8312506548224L, 61933);
    this.linkColor = getResources().getColor(i.c.aPa);
    boolean bool = getIntent().getBooleanExtra("Ktag_rangeFilterprivate", false);
    this.mqO = ((ListView)findViewById(i.f.pdX));
    int i = 0;
    while (i < 2)
    {
      this.qgo[i] = new View(this);
      this.qgo[i] = View.inflate(this, i.g.pgq, null);
      ((TextView)this.qgo[i].findViewById(i.f.pdY)).setText(qbM[i]);
      this.qgo[i].findViewById(i.f.pdV).setVisibility(0);
      ((TextView)this.qgo[i].findViewById(i.f.pdV)).setText(qgp[i]);
      ((TextView)this.qgo[i].findViewById(i.f.pdV)).setVisibility(8);
      this.qgo[i].setTag(Integer.valueOf(i));
      this.qgo[i].setOnClickListener(this.qgr);
      if (i != 0) {
        this.qgo[1].findViewById(i.f.pej).setVisibility(8);
      }
      if ((bool) && (i == 1))
      {
        localObject = new AbsListView.LayoutParams(-1, 1);
        this.qgo[1].setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.qgo[1].setVisibility(8);
      }
      if (i == 1)
      {
        localObject = this.qgo[1].findViewById(i.f.bIE);
        int[] arrayOfInt = new int[4];
        arrayOfInt[0] = ((View)localObject).getPaddingLeft();
        arrayOfInt[1] = ((View)localObject).getPaddingTop();
        arrayOfInt[2] = ((View)localObject).getPaddingRight();
        arrayOfInt[3] = ((View)localObject).getPaddingBottom();
        ((View)localObject).setBackgroundResource(i.e.aXD);
        ((View)localObject).setPadding(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
      }
      this.mqO.addHeaderView(this.qgo[i]);
      i += 1;
    }
    Object localObject = View.inflate(this, i.g.pgp, null);
    this.mqO.addFooterView((View)localObject, null, false);
    this.qgm = new a(this, new s());
    this.mqO.setAdapter(this.qgm);
    bpw();
    ((View)localObject).findViewById(i.f.paz).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8356127309824L, 62258);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("k_sns_tag_id", 4L);
        paramAnonymousView.setClass(SnsTagUI.this, SnsBlackDetailUI.class);
        SnsTagUI.this.startActivity(paramAnonymousView);
        GMTrace.o(8356127309824L, 62258);
      }
    });
    ((View)localObject).findViewById(i.f.paA).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8685631832064L, 64713);
        SnsTagUI.a(SnsTagUI.this, SnsTagPartlyUI.class);
        GMTrace.o(8685631832064L, 64713);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8628320862208L, 64286);
        SnsTagUI.this.bpv();
        GMTrace.o(8628320862208L, 64286);
        return true;
      }
    });
    GMTrace.o(8312506548224L, 61933);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8313311854592L, 61939);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      this.qgm.a("", null);
    }
    GMTrace.o(8313311854592L, 61939);
  }
  
  public final void bpv()
  {
    GMTrace.i(8312372330496L, 61932);
    String str = "";
    Object localObject1 = "";
    Object localObject3;
    if ((this.qgq >= 0) && (this.qgq < 2))
    {
      localObject2 = getString(qbM[this.qgq]);
      localObject3 = localObject1;
    }
    Iterator localIterator;
    int i;
    do
    {
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("Ktag_name_list", (String)localObject2);
      ((Intent)localObject1).putExtra("Ktag_id_list", (String)localObject3);
      ((Intent)localObject1).putExtra("Ktag_range_index", this.qgq);
      setResult(-1, (Intent)localObject1);
      finish();
      GMTrace.o(8312372330496L, 61932);
      return;
      localObject2 = new ArrayList(this.qgn.keySet()).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        long l = ((Long)((Iterator)localObject2).next()).longValue();
        localObject3 = ae.bjj().dW(l);
        if (((s)localObject3).field_tagId == 0L) {
          this.qgn.remove(Long.valueOf(l));
        } else {
          this.qgn.put(Long.valueOf(l), bg.aq(((s)localObject3).field_tagName, ""));
        }
      }
      localIterator = this.qgn.keySet().iterator();
      i = 1;
      localObject3 = localObject1;
      localObject2 = str;
    } while (!localIterator.hasNext());
    Object localObject2 = (Long)localIterator.next();
    if (i == 0)
    {
      str = str + ",";
      localObject1 = (String)localObject1 + ",";
    }
    for (;;)
    {
      str = str + (String)this.qgn.get(localObject2);
      localObject1 = (String)localObject1 + localObject2;
      i = 0;
      break;
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8311835459584L, 61928);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      bpv();
      GMTrace.o(8311835459584L, 61928);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8311835459584L, 61928);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8313043419136L, 61937);
    int i = i.g.pgo;
    GMTrace.o(8313043419136L, 61937);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8313177636864L, 61938);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      GMTrace.o(8313177636864L, 61938);
      return;
    }
    GMTrace.o(8313177636864L, 61938);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8311969677312L, 61929);
    super.onCreate(paramBundle);
    oM(i.j.pkQ);
    MP();
    h.xz();
    h.xx().fYr.a(292, this);
    h.xz();
    h.xx().fYr.a(new u(1), 0);
    GMTrace.o(8311969677312L, 61929);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8312103895040L, 61930);
    h.xz();
    h.xx().fYr.b(292, this);
    this.qgm.aJe();
    super.onDestroy();
    GMTrace.o(8312103895040L, 61930);
  }
  
  public void onResume()
  {
    GMTrace.i(8312238112768L, 61931);
    super.onResume();
    if (this.qgm != null) {
      this.qgm.a("", null);
    }
    GMTrace.o(8312238112768L, 61931);
  }
  
  final class a
    extends o<s>
  {
    View.OnClickListener lXS;
    
    public a(Context paramContext, s params)
    {
      super(params);
      GMTrace.i(8572352069632L, 63869);
      this.lXS = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8664022777856L, 64552);
          if ((paramAnonymousView.getTag() instanceof SnsTagUI.a.a))
          {
            SnsTagUI.a(SnsTagUI.this);
            paramAnonymousView = (SnsTagUI.a.a)paramAnonymousView.getTag();
            if (SnsTagUI.b(SnsTagUI.this).containsKey(Long.valueOf(paramAnonymousView.psT))) {
              break label106;
            }
            SnsTagUI.b(SnsTagUI.this).put(Long.valueOf(paramAnonymousView.psT), paramAnonymousView.qgu);
          }
          for (;;)
          {
            SnsTagUI.c(SnsTagUI.this).notifyDataSetChanged();
            GMTrace.o(8664022777856L, 64552);
            return;
            label106:
            SnsTagUI.b(SnsTagUI.this).remove(Long.valueOf(paramAnonymousView.psT));
            if (SnsTagUI.b(SnsTagUI.this).isEmpty()) {
              SnsTagUI.a(SnsTagUI.this, 0);
            }
          }
        }
      };
      GMTrace.o(8572352069632L, 63869);
    }
    
    public final void QF()
    {
      GMTrace.i(8572620505088L, 63871);
      t localt = ae.bjj();
      String str = t.bmz() + " where tagId > 5";
      super.setCursor(localt.fTZ.rawQuery(str, null));
      notifyDataSetChanged();
      GMTrace.o(8572620505088L, 63871);
    }
    
    protected final void QG()
    {
      GMTrace.i(8572486287360L, 63870);
      aJe();
      QF();
      GMTrace.o(8572486287360L, 63870);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8572754722816L, 63872);
      s locals = (s)super.getItem(paramInt);
      View localView;
      if ((paramView == null) || (!(paramView.getTag() instanceof a)))
      {
        localView = View.inflate(this.context, i.g.pgq, null);
        paramView = new a();
        paramView.mRX = ((ImageView)localView.findViewById(i.f.pdW));
        paramView.qgj = ((TextView)localView.findViewById(i.f.pdY));
        paramView.qgk = ((TextView)localView.findViewById(i.f.pdU));
        paramView.qgw = localView.findViewById(i.f.pej);
        paramView.qgv = ((TextView)paramView.qgw.findViewById(16908310));
        paramView.qgx = localView.findViewById(i.f.bIE);
        localView.setTag(paramView);
        localView.setOnClickListener(this.lXS);
        paramViewGroup = paramView;
        paramViewGroup.position = paramInt;
        paramViewGroup.psT = locals.field_tagId;
        paramViewGroup.qgu = locals.field_tagName;
        if (!SnsTagUI.b(SnsTagUI.this).containsKey(Long.valueOf(locals.field_tagId))) {
          break label300;
        }
        paramViewGroup.mRX.setImageResource(i.i.cLt);
      }
      for (;;)
      {
        paramViewGroup.qgj.setText(locals.field_tagName);
        paramViewGroup.qgk.setText("  (" + locals.field_count + ")");
        paramViewGroup.qgk.setVisibility(0);
        GMTrace.o(8572754722816L, 63872);
        return localView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
        break;
        label300:
        paramViewGroup.mRX.setImageResource(i.i.cLu);
      }
    }
    
    final class a
    {
      ImageView mRX;
      int position;
      long psT;
      TextView qgj;
      TextView qgk;
      String qgu;
      TextView qgv;
      View qgw;
      View qgx;
      
      a()
      {
        GMTrace.i(8429007536128L, 62801);
        GMTrace.o(8429007536128L, 62801);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsTagUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */