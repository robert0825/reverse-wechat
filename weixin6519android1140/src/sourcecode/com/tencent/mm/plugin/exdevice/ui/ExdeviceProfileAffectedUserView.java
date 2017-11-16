package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.exdevice.model.f.1;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMHorList;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.q;
import java.util.ArrayList;

public class ExdeviceProfileAffectedUserView
  extends LinearLayout
{
  String iAx;
  private TextView kIg;
  private MMHorList kIh;
  private a kIi;
  private ArrayList<String> kIj;
  
  public ExdeviceProfileAffectedUserView(final Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11039944998912L, 82254);
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(R.i.cvP, this, true);
    this.kIg = ((TextView)paramAttributeSet.findViewById(R.h.bUi));
    this.kIh = ((MMHorList)paramAttributeSet.findViewById(R.h.bUh));
    this.kIh.wdh = true;
    int i = a.fromDPToPix(paramContext, 44);
    this.kIh.wdi = true;
    this.kIh.wdj = i;
    this.kIh.wdh = true;
    this.kIi = new a((byte)0);
    this.kIh.setAdapter(this.kIi);
    this.kIh.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(11077928615936L, 82537);
        paramAnonymousAdapterView = (String)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt);
        w.d("MicroMsg.ExdeviceProfileAffectedUserView", "onItemClick, username : %s", new Object[] { paramAnonymousAdapterView });
        if (bg.nm(paramAnonymousAdapterView))
        {
          w.w("MicroMsg.ExdeviceProfileAffectedUserView", "username is null.");
          GMTrace.o(11077928615936L, 82537);
          return;
        }
        paramAnonymousView = new Intent(paramContext, ExdeviceProfileUI.class);
        paramAnonymousView.putExtra("username", paramAnonymousAdapterView);
        paramContext.startActivity(paramAnonymousView);
        GMTrace.o(11077928615936L, 82537);
      }
    });
    this.kIg.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10997129543680L, 81935);
        paramAnonymousView = q.zE();
        if ((paramAnonymousView != null) && (paramAnonymousView.equals(ExdeviceProfileAffectedUserView.a(ExdeviceProfileAffectedUserView.this))))
        {
          paramAnonymousView = ExdeviceProfileAffectedUserView.b(ExdeviceProfileAffectedUserView.this);
          if (ExdeviceProfileAffectedUserView.b(ExdeviceProfileAffectedUserView.this).getVisibility() != 0) {
            break label68;
          }
        }
        label68:
        for (int i = 8;; i = 0)
        {
          paramAnonymousView.setVisibility(i);
          GMTrace.o(10997129543680L, 81935);
          return;
        }
      }
    });
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10998740156416L, 81947);
        ExdeviceProfileAffectedUserView.c(ExdeviceProfileAffectedUserView.this).performClick();
        GMTrace.o(10998740156416L, 81947);
      }
    });
    setVisibility(8);
    GMTrace.o(11039944998912L, 82254);
  }
  
  public final void y(ArrayList<String> paramArrayList)
  {
    GMTrace.i(11040079216640L, 82255);
    this.kIj = paramArrayList;
    if ((this.kIj == null) || (this.kIj.size() == 0))
    {
      this.kIg.setText("");
      setVisibility(8);
      GMTrace.o(11040079216640L, 82255);
      return;
    }
    setVisibility(0);
    this.kIg.setText(getResources().getString(R.l.drG, new Object[] { Integer.valueOf(this.kIj.size()) }));
    this.kIi.notifyDataSetChanged();
    GMTrace.o(11040079216640L, 82255);
  }
  
  private final class a
    extends BaseAdapter
  {
    private Runnable kIl;
    
    private a()
    {
      GMTrace.i(11075781132288L, 82521);
      this.kIl = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11082894671872L, 82574);
          ExdeviceProfileAffectedUserView.a.this.notifyDataSetChanged();
          GMTrace.o(11082894671872L, 82574);
        }
      };
      GMTrace.o(11075781132288L, 82521);
    }
    
    private String iH(int paramInt)
    {
      GMTrace.i(11076049567744L, 82523);
      String str = (String)ExdeviceProfileAffectedUserView.d(ExdeviceProfileAffectedUserView.this).get(paramInt);
      GMTrace.o(11076049567744L, 82523);
      return str;
    }
    
    public final int getCount()
    {
      GMTrace.i(11075915350016L, 82522);
      if (ExdeviceProfileAffectedUserView.d(ExdeviceProfileAffectedUserView.this) == null)
      {
        GMTrace.o(11075915350016L, 82522);
        return 0;
      }
      int i = ExdeviceProfileAffectedUserView.d(ExdeviceProfileAffectedUserView.this).size();
      GMTrace.o(11075915350016L, 82522);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11076183785472L, 82524);
      long l = paramInt;
      GMTrace.o(11076183785472L, 82524);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11076318003200L, 82525);
      String str = iH(paramInt);
      if (paramView == null)
      {
        paramView = LayoutInflater.from(ExdeviceProfileAffectedUserView.this.getContext()).inflate(R.i.cvU, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.gDc = ((ImageView)paramView.findViewById(R.h.bfk));
        paramView.setTag(paramViewGroup);
      }
      for (;;)
      {
        Runnable localRunnable = this.kIl;
        Object localObject = n.Di();
        if (localObject != null)
        {
          localObject = ((i)localObject).ig(str);
          if ((localObject == null) || (bg.nm(((h)localObject).Dp())))
          {
            long l = bg.Pv();
            ak.a.gmX.a(str, "", new f.1(l, localRunnable));
          }
        }
        a.b.o(paramViewGroup.gDc, str);
        GMTrace.o(11076318003200L, 82525);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
    }
    
    final class a
    {
      ImageView gDc;
      
      a()
      {
        GMTrace.i(11099537670144L, 82698);
        GMTrace.o(11099537670144L, 82698);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceProfileAffectedUserView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */