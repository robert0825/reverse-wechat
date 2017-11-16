package com.tencent.mm.plugin.clean.ui.newui;

import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.bj.d;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.c;
import com.tencent.mm.ui.widget.MMAutoAdjustTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class b
  extends BaseAdapter
  implements com.tencent.mm.ui.gridviewheaders.e
{
  private static int jTZ;
  ArrayList<com.tencent.mm.plugin.clean.c.a> iBZ;
  HashSet<Integer> iYP;
  private boolean jUa;
  GridHeadersGridView.c jUb;
  private ae jUc;
  AbsListView.OnScrollListener jUd;
  private CleanChattingDetailUI jVw;
  AdapterView.OnItemClickListener juU;
  
  static
  {
    GMTrace.i(20553700212736L, 153137);
    jTZ = 0;
    GMTrace.o(20553700212736L, 153137);
  }
  
  public b(CleanChattingDetailUI paramCleanChattingDetailUI, ArrayList<com.tencent.mm.plugin.clean.c.a> paramArrayList)
  {
    GMTrace.i(20551552729088L, 153121);
    this.jUb = new GridHeadersGridView.c()
    {
      public final void ci(View paramAnonymousView)
      {
        GMTrace.i(20551150075904L, 153118);
        paramAnonymousView = (b.a)paramAnonymousView.getTag();
        b.a(b.this, paramAnonymousView);
        b.this.notifyDataSetChanged();
        GMTrace.o(20551150075904L, 153118);
      }
    };
    this.juU = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20541352181760L, 153045);
        w.i("MicroMsg.CleanChattingDetailAdapter", "Click Item position=%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        paramAnonymousAdapterView = b.this.mm(paramAnonymousInt);
        paramAnonymousView = new Intent();
        switch (paramAnonymousAdapterView.type)
        {
        }
        for (;;)
        {
          GMTrace.o(20541352181760L, 153045);
          return;
          paramAnonymousView.setAction("android.intent.action.VIEW");
          paramAnonymousView.setDataAndType(Uri.fromFile(new File(paramAnonymousAdapterView.filePath)), "video/*");
          try
          {
            b.a(b.this).startActivity(Intent.createChooser(paramAnonymousView, b.a(b.this).getString(R.l.egG)));
            GMTrace.o(20541352181760L, 153045);
            return;
          }
          catch (Exception paramAnonymousAdapterView)
          {
            GMTrace.o(20541352181760L, 153045);
            return;
          }
          paramAnonymousView.putExtra("key_title", b.a(b.this).getString(R.l.dhX));
          paramAnonymousView.putExtra("show_menu", false);
          paramAnonymousView.putExtra("key_image_path", paramAnonymousAdapterView.filePath);
          d.a(b.a(b.this), ".ui.tools.ShowImageUI", paramAnonymousView);
          GMTrace.o(20541352181760L, 153045);
          return;
          paramAnonymousView.putExtra("app_msg_id", paramAnonymousAdapterView.eCL);
          d.a(b.a(b.this), ".ui.chatting.AppAttachDownloadUI", paramAnonymousView);
        }
      }
    };
    this.jUc = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(20543633883136L, 153062);
        if (!b.b(b.this)) {
          b.this.notifyDataSetChanged();
        }
        GMTrace.o(20543633883136L, 153062);
      }
    };
    this.jUd = new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(20548734156800L, 153100);
        GMTrace.o(20548734156800L, 153100);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(20548599939072L, 153099);
        com.tencent.mm.ao.n.Jd().bi(paramAnonymousInt);
        if (paramAnonymousInt != 2)
        {
          b.a(b.this, false);
          b.c(b.this).removeCallbacksAndMessages(null);
          b.c(b.this).sendEmptyMessageDelayed(0, 200L);
          GMTrace.o(20548599939072L, 153099);
          return;
        }
        b.a(b.this, true);
        GMTrace.o(20548599939072L, 153099);
      }
    };
    this.jVw = paramCleanChattingDetailUI;
    this.iBZ = paramArrayList;
    this.iYP = new HashSet();
    GMTrace.o(20551552729088L, 153121);
  }
  
  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20552358035456L, 153127);
    if (paramView == null)
    {
      w.v("MicroMsg.CleanChattingDetailAdapter", "convertView is null");
      paramView = this.jVw.getLayoutInflater().inflate(R.i.ctr, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.jUf = ((TextView)paramView.findViewById(R.h.bGb));
      paramViewGroup.jUg = ((TextView)paramView.findViewById(R.h.bFZ));
      paramViewGroup.jUh = ((CheckBox)paramView.findViewById(R.h.bFY));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      localObject = mm(paramInt);
      paramViewGroup.position = paramInt;
      paramViewGroup.jUf.setText(com.tencent.mm.pluginsdk.i.n.ac(this.jVw.getString(R.l.dxt), ((com.tencent.mm.plugin.clean.c.a)localObject).hct / 1000L));
      long l = ((com.tencent.mm.plugin.clean.c.a)localObject).anR();
      localObject = new HashSet();
      paramInt = 0;
      while (paramInt < this.iBZ.size())
      {
        if (((com.tencent.mm.plugin.clean.c.a)this.iBZ.get(paramInt)).anR() == l) {
          ((HashSet)localObject).add(Integer.valueOf(paramInt));
        }
        paramInt += 1;
      }
      w.v("MicroMsg.CleanChattingDetailAdapter", "convertView is not null");
      paramViewGroup = (a)paramView.getTag();
    }
    Object localObject = ((HashSet)localObject).iterator();
    paramInt = 1;
    if (((Iterator)localObject).hasNext())
    {
      int i = ((Integer)((Iterator)localObject).next()).intValue();
      if (this.iYP.contains(Integer.valueOf(i))) {
        break label304;
      }
      paramInt = 0;
    }
    label304:
    for (;;)
    {
      break;
      if (paramInt != 0) {
        paramViewGroup.jUh.setChecked(true);
      }
      for (;;)
      {
        GMTrace.o(20552358035456L, 153127);
        return paramView;
        paramViewGroup.jUh.setChecked(false);
      }
    }
  }
  
  public final void aom()
  {
    GMTrace.i(20552626470912L, 153129);
    this.iYP.clear();
    aon();
    GMTrace.o(20552626470912L, 153129);
  }
  
  final void aon()
  {
    GMTrace.i(20552492253184L, 153128);
    this.jVw.mk(this.iYP.size());
    Object localObject = this.jVw;
    int i;
    if (this.iYP.size() == this.iBZ.size())
    {
      i = 1;
      if (i == 0) {
        break label121;
      }
      ((CleanChattingDetailUI)localObject).iYX.setChecked(true);
    }
    long l;
    for (;;)
    {
      localObject = this.iYP.iterator();
      for (l = 0L; ((Iterator)localObject).hasNext(); l = ((com.tencent.mm.plugin.clean.c.a)this.iBZ.get(i)).size + l) {
        i = ((Integer)((Iterator)localObject).next()).intValue();
      }
      i = 0;
      break;
      label121:
      ((CleanChattingDetailUI)localObject).iYX.setChecked(false);
    }
    localObject = this.jVw;
    if (l > 0L)
    {
      ((CleanChattingDetailUI)localObject).jUp.setText(((CleanChattingDetailUI)localObject).getString(R.l.dmD, new Object[] { bg.aF(l) }));
      GMTrace.o(20552492253184L, 153128);
      return;
    }
    ((CleanChattingDetailUI)localObject).jUp.setText("");
    GMTrace.o(20552492253184L, 153128);
  }
  
  public final int getCount()
  {
    GMTrace.i(20551686946816L, 153122);
    int i = this.iBZ.size();
    GMTrace.o(20551686946816L, 153122);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(20551955382272L, 153124);
    long l = paramInt;
    GMTrace.o(20551955382272L, 153124);
    return l;
  }
  
  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20552089600000L, 153125);
    long l = System.currentTimeMillis();
    com.tencent.mm.plugin.clean.c.a locala;
    if (paramView == null)
    {
      paramView = this.jVw.getLayoutInflater().inflate(R.i.ctq, paramViewGroup, false);
      paramViewGroup = new b();
      paramViewGroup.jUi = ((MMImageView)paramView.findViewById(R.h.brT));
      paramViewGroup.hqJ = ((CheckBox)paramView.findViewById(R.h.cbs));
      paramViewGroup.jUk = paramView.findViewById(R.h.cbu);
      paramViewGroup.jUl = paramView.findViewById(R.h.cbS);
      paramViewGroup.jUj = ((ImageView)paramView.findViewById(R.h.bTm));
      paramViewGroup.jUm = ((TextView)paramView.findViewById(R.h.bPp));
      paramView.setTag(paramViewGroup);
      locala = mm(paramInt);
      paramViewGroup.jUi.setTag(locala.filePath);
      paramViewGroup.jUk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20544304971776L, 153067);
          b.a(b.this, paramInt);
          b.this.notifyDataSetChanged();
          GMTrace.o(20544304971776L, 153067);
        }
      });
      if (!this.iYP.contains(Integer.valueOf(paramInt))) {
        break label311;
      }
      paramViewGroup.hqJ.setChecked(true);
      paramViewGroup.jUl.setVisibility(0);
      label191:
      if (locala.type != 3) {
        break label331;
      }
      paramViewGroup.jUj.setVisibility(0);
    }
    for (;;)
    {
      if (locala.type != 4) {
        break label343;
      }
      paramViewGroup.jUi.setImageResource(q.Oo(com.tencent.mm.a.e.bb(locala.filePath)));
      paramViewGroup.jUm.setText(new File(locala.filePath).getName());
      paramViewGroup.jUm.setVisibility(0);
      w.d("MicroMsg.CleanChattingDetailAdapter", "getView time=%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(20552089600000L, 153125);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
      break;
      label311:
      paramViewGroup.hqJ.setChecked(false);
      paramViewGroup.jUl.setVisibility(8);
      break label191;
      label331:
      paramViewGroup.jUj.setVisibility(8);
    }
    label343:
    if (jTZ == 0) {
      jTZ = paramView.getMeasuredWidth();
    }
    Object localObject = new c.a();
    ((c.a)localObject).gKH = 1;
    ((c.a)localObject).gKD = false;
    ((c.a)localObject).gKJ = jTZ;
    ((c.a)localObject).gKI = jTZ;
    if (locala.type == 1)
    {
      ((c.a)localObject).gKE = locala.filePath;
      localObject = ((c.a)localObject).Jn();
      com.tencent.mm.ao.n.Jd().a(locala.filePath, paramViewGroup.jUi, (c)localObject);
    }
    for (;;)
    {
      paramViewGroup.jUm.setVisibility(8);
      break;
      ((c.a)localObject).gKE = locala.eIy;
      localObject = ((c.a)localObject).Jn();
      com.tencent.mm.ao.n.Jd().a(locala.eIy, paramViewGroup.jUi, (c)localObject);
    }
  }
  
  public final long mj(int paramInt)
  {
    GMTrace.i(20552223817728L, 153126);
    long l = ((com.tencent.mm.plugin.clean.c.a)this.iBZ.get(paramInt)).anR();
    GMTrace.o(20552223817728L, 153126);
    return l;
  }
  
  public final com.tencent.mm.plugin.clean.c.a mm(int paramInt)
  {
    GMTrace.i(20551821164544L, 153123);
    com.tencent.mm.plugin.clean.c.a locala = (com.tencent.mm.plugin.clean.c.a)this.iBZ.get(paramInt);
    GMTrace.o(20551821164544L, 153123);
    return locala;
  }
  
  final class a
  {
    TextView jUf;
    TextView jUg;
    CheckBox jUh;
    int position;
    
    a()
    {
      GMTrace.i(20537594085376L, 153017);
      GMTrace.o(20537594085376L, 153017);
    }
  }
  
  final class b
  {
    CheckBox hqJ;
    MMImageView jUi;
    ImageView jUj;
    View jUk;
    View jUl;
    TextView jUm;
    
    b()
    {
      GMTrace.i(20536386125824L, 153008);
      GMTrace.o(20536386125824L, 153008);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\newui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */